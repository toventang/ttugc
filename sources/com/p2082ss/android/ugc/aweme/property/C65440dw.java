package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.property.dw */
public final class C65440dw {

    /* renamed from: a */
    public static final C65440dw f147604a = new C65440dw();

    private C65440dw() {
    }

    static {
        Covode.recordClassIndex(76927);
    }

    /* renamed from: a */
    public static final boolean m117158a() {
        if (m117159b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m117159b() {
        return SettingsManager.m29616a().mo25394a("use_synthetic_hardcode", 0);
    }
}
