package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.property.dq */
public final class C65434dq {

    /* renamed from: a */
    public static final C65433dp f147597a = null;

    /* renamed from: b */
    public static final C65434dq f147598b = new C65434dq();

    private C65434dq() {
    }

    static {
        Covode.recordClassIndex(76921);
    }

    /* renamed from: a */
    public static C65433dp m117151a() {
        if (!C65358ba.m117055a()) {
            return null;
        }
        return (C65433dp) C16048b.m29633a().mo25416a(true, "smart_compile_model_v2", C65433dp.class, f147597a);
    }

    /* renamed from: b */
    public static boolean m117152b() {
        C65433dp a = m117151a();
        if (a == null || a.packageUrl.length() <= 0 || !(!a.f147596a.isEmpty())) {
            return false;
        }
        return true;
    }
}
