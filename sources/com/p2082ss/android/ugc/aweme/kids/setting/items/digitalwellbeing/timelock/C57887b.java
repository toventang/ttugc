package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57806a;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57807b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.TimeUnlockActivity;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.b */
public final class C57887b {
    static {
        Covode.recordClassIndex(67902);
    }

    /* renamed from: a */
    public static C57806a<Boolean> m104654a() {
        return C57807b.m104534a().mo95144b(TimeUnlockActivity.f131964b);
    }

    /* renamed from: c */
    private static C57806a<Boolean> m104659c() {
        return C57807b.m104534a().mo95142a(TimeUnlockActivity.f131964b);
    }

    /* renamed from: b */
    private static void m104658b() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        for (Activity activity : activityStack) {
            if (activity instanceof TimeUnlockActivity) {
                activity.finish();
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m104656a(ActivityC0945e eVar) {
        int e = eVar.getSupportFragmentManager().mo3564e();
        for (int i = 0; i < e; i++) {
            eVar.getSupportFragmentManager().mo3562c();
        }
    }

    /* renamed from: a */
    private static void m104655a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static boolean m104657a(AbstractC34709b<Boolean> bVar, String str) {
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof ActivityC0945e) && !(topActivity instanceof TimeUnlockActivity)) {
            m104658b();
            if (!"com.ss.android.ugc.aweme.bullet.BulletContainerActivity".equals(topActivity.getClass().getCanonicalName()) && !"com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity".equals(topActivity.getClass().getCanonicalName())) {
                Intent intent = new Intent(topActivity, TimeUnlockActivity.class);
                if (bVar != null) {
                    m104659c().mo95140a((ActivityC0580d) topActivity, bVar);
                    intent.putExtra("from", str);
                }
                m104655a(topActivity, intent);
                return true;
            }
        }
        return false;
    }
}
