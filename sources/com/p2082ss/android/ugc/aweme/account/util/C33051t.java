package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.account.util.t */
public final class C33051t {

    /* renamed from: a */
    public static final C33051t f78606a = new C33051t();

    private C33051t() {
    }

    static {
        Covode.recordClassIndex(39858);
    }

    /* renamed from: a */
    public static C33050s m67698a() {
        try {
            C33050s sVar = (C33050s) SettingsManager.m29616a().mo25396a("user_login_window", C33050s.class);
            if (sVar == null) {
                return new C33050s();
            }
            return sVar;
        } catch (Throwable unused) {
            return new C33050s();
        }
    }
}
