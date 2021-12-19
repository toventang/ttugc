package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.property.bs */
public final class C65379bs {

    /* renamed from: a */
    public static final C65379bs f147517a = new C65379bs();

    private C65379bs() {
    }

    static {
        Covode.recordClassIndex(76866);
    }

    /* renamed from: a */
    public static final boolean m117075a() {
        if (m117076b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m117076b() {
        return SettingsManager.m29616a().mo25394a("use_hardcode", 0);
    }
}
