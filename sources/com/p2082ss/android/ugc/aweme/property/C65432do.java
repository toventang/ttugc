package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.property.do */
public final class C65432do {

    /* renamed from: a */
    public static final SmartCompileModelV1 f147594a = null;

    /* renamed from: b */
    public static final C65432do f147595b = new C65432do();

    private C65432do() {
    }

    static {
        Covode.recordClassIndex(76919);
    }

    /* renamed from: a */
    public static SmartCompileModelV1 m117150a() {
        if (!C65358ba.m117055a()) {
            return null;
        }
        return (SmartCompileModelV1) SettingsManager.m29616a().mo25397a("smart_compile_model", SmartCompileModelV1.class, f147594a);
    }
}
