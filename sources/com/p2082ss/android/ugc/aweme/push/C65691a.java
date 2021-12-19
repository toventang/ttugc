package com.p2082ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: com.ss.android.ugc.aweme.push.a */
public final class C65691a {
    static {
        Covode.recordClassIndex(77184);
    }

    /* renamed from: b */
    private static boolean m117585b(Activity activity) {
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack.length != 1 || !activityStack[0].equals(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m117584a(Activity activity) {
        Intent intent;
        String concat;
        if (activity != null && (intent = activity.getIntent()) != null) {
            String a = m117583a(intent, "backurl");
            if (intent.getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY") == null) {
                if (!TextUtils.isEmpty(a) && !TextUtils.equals("__BACKURL__", a) && !a.startsWith("http")) {
                    try {
                        Uri parse = Uri.parse(a);
                        Intent intent2 = new Intent();
                        intent2.setData(parse);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.addCategory("android.intent.category.BROWSABLE");
                        intent2.setComponent(null);
                        intent2.setSelector(null);
                        activity.startActivityIfNeeded(intent2, -1);
                        activity.moveTaskToBack(true);
                        return;
                    } catch (Exception unused) {
                    }
                }
                String a2 = m117583a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                int intExtra = intent.getIntExtra("extra_story_is_friend", -1);
                boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
                if (!intent.getBooleanExtra("is_have_intents", false)) {
                    if ((!AwemeApplicationServiceImpl.m68723c().mo59703b() || booleanExtra) && m117585b(activity)) {
                        if (TextUtils.isEmpty(a2)) {
                            concat = "aweme://main";
                        } else {
                            concat = "aweme://main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=".concat(String.valueOf(a2));
                        }
                        if (intExtra != -1) {
                            C36125t.m73591a().f85349c.mo63245b("extra_story_is_friend");
                            concat = concat + "&extra_story_is_friend=" + intExtra;
                        }
                        C36125t.m73596a(C36125t.m73591a(), null, concat);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m117583a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
