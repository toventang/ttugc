package com.p2082ss.android.ugc.trill.p4378g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.abtest.C85071b;

/* renamed from: com.ss.android.ugc.trill.g.a */
public final class C85088a extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(99111);
    }

    /* renamed from: a */
    private static String m146302a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(m146302a(intent, "reason"))) {
            C85071b.m146270a().mo130012a("attract_user_without_login_home");
        }
    }
}
