package com.p2082ss.android.ugc.aweme.common.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.common.widget.x */
public final class C39218x {

    /* renamed from: a */
    public static final C39218x f92637a = new C39218x();

    private C39218x() {
    }

    static {
        Covode.recordClassIndex(46851);
    }

    /* renamed from: a */
    public static final boolean m79568a() {
        if (m79569b() > 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static double m79569b() {
        return SettingsManager.m29616a().mo25392a("recommend_fix_splash_bug", 1.5d);
    }
}
