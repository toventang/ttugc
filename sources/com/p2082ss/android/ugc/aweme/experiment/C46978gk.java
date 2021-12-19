package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.gk */
public final class C46978gk {

    /* renamed from: a */
    public static final int f109473a = 30;

    /* renamed from: b */
    public static final C46978gk f109474b = new C46978gk();

    private C46978gk() {
    }

    /* renamed from: a */
    public static int m90258a() {
        try {
            return SettingsManager.m29616a().mo25394a("period_social_recommend_flow", 30);
        } catch (Throwable unused) {
            return f109473a;
        }
    }

    static {
        Covode.recordClassIndex(55579);
    }
}
