package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.api.g */
public final class C33538g {

    /* renamed from: a */
    public static final C33538g f79653a = new C33538g();

    private C33538g() {
    }

    static {
        Covode.recordClassIndex(40408);
    }

    /* renamed from: a */
    public static final int m68711a() {
        try {
            return SettingsManager.m29616a().mo25394a("flow_info_interval_seconds", 3600);
        } catch (Throwable unused) {
            return 3600;
        }
    }
}
