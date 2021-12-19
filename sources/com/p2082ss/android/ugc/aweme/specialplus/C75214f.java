package com.p2082ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.specialplus.f */
public final class C75214f {

    /* renamed from: a */
    public static final C75214f f169128a = new C75214f();

    private C75214f() {
    }

    static {
        Covode.recordClassIndex(88097);
    }

    /* renamed from: a */
    public static final SpecialPlusConfig m131960a() {
        try {
            return (SpecialPlusConfig) SettingsManager.m29616a().mo25396a("special_plus_conf", SpecialPlusConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
