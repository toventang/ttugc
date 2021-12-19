package com.p2082ss.android.ugc.aweme.compliance.protection.timelock;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.C34710c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.TimeUnlockActivity;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40135p;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.a */
public final class C40106a {

    /* renamed from: a */
    public static String f94179a;

    static {
        Covode.recordClassIndex(47887);
    }

    /* renamed from: a */
    public static C34708a<Boolean> m81124a() {
        return C34710c.m70888a().mo61388b(TimeUnlockActivity.f94182b);
    }

    /* renamed from: c */
    private static C34708a<Boolean> m81131c() {
        return C34710c.m70888a().mo61386a(TimeUnlockActivity.f94182b);
    }

    /* renamed from: b */
    private static void m81129b() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        for (Activity activity : activityStack) {
            if (activity instanceof TimeUnlockActivity) {
                activity.finish();
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m81126a(ActivityC0945e eVar) {
        int e = eVar.getSupportFragmentManager().mo3564e();
        for (int i = 0; i < e; i++) {
            eVar.getSupportFragmentManager().mo3562c();
        }
    }

    /* renamed from: a */
    private static void m81125a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public static void m81130b(ActivityC0945e eVar, int i) {
        m81126a(eVar);
        ((AbstractActivityC40107a) eVar).mo69256a(C40135p.m81184a(i));
    }

    /* renamed from: a */
    public static void m81127a(ActivityC0945e eVar, int i) {
        m81126a(eVar);
        ((AbstractActivityC40107a) eVar).mo69256a(C40135p.m81187c(i));
    }

    /* renamed from: a */
    public static boolean m81128a(AbstractC34709b<Boolean> bVar, String str) {
        Activity topActivity = ActivityStack.getTopActivity();
        if ((topActivity instanceof ActivityC0945e) && !(topActivity instanceof TimeUnlockActivity)) {
            m81129b();
            if (topActivity != null && (topActivity instanceof ActivityC17312a) && !(topActivity instanceof CrossPlatformActivity)) {
                Intent intent = new Intent(topActivity, TimeUnlockActivity.class);
                if (bVar != null) {
                    m81131c().mo61383a((ActivityC0580d) topActivity, bVar);
                    intent.putExtra("from", str);
                } else {
                    C39162r.m79460a("time_lock_block_show", new C33744d().mo59983a("enter_from", "time_lock_block").f79943a);
                }
                m81125a(topActivity, intent);
                return true;
            }
        }
        return false;
    }
}
