package com.p2082ss.android.ugc.aweme.sertting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.sertting.b */
public final class C67841b {

    /* renamed from: a */
    public static C67840a[] f152039a;

    /* renamed from: b */
    public static final C67841b f152040b = new C67841b();

    private C67841b() {
    }

    static {
        Covode.recordClassIndex(79506);
    }

    /* renamed from: a */
    public static final C67840a[] m120036a() {
        try {
            C67840a[] aVarArr = (C67840a[]) SettingsManager.m29616a().mo25397a("linker_platform_config", C67840a[].class, f152039a);
            if (aVarArr == null) {
                return f152039a;
            }
            return aVarArr;
        } catch (Throwable unused) {
            return f152039a;
        }
    }
}
