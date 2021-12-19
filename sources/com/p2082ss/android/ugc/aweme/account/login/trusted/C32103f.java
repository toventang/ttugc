package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.f */
public final class C32103f {

    /* renamed from: a */
    public static final C32102e f76598a = new C32102e();

    /* renamed from: b */
    public static final C32103f f76599b = new C32103f();

    private C32103f() {
    }

    static {
        Covode.recordClassIndex(38862);
    }

    /* renamed from: a */
    public static C32102e m66486a() {
        try {
            C32102e eVar = (C32102e) SettingsManager.m29616a().mo25396a("save_info_dialog_interval", C32102e.class);
            if (eVar == null) {
                return new C32102e();
            }
            return eVar;
        } catch (Throwable unused) {
            return new C32102e();
        }
    }
}
