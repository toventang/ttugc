package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.f */
public final class C43323f {

    /* renamed from: a */
    public static final int f101106a = 3;

    /* renamed from: b */
    public static final int f101107b = 2;

    /* renamed from: c */
    public static final int f101108c = 1;

    /* renamed from: d */
    public static final int f101109d = -1;

    /* renamed from: e */
    public static final C43323f f101110e = new C43323f();

    private C43323f() {
    }

    static {
        Covode.recordClassIndex(51537);
    }

    /* renamed from: a */
    public static int m86441a() {
        int a = C16048b.m29633a().mo25412a(true, "ecom_combine_payment_config", -1);
        if (f101109d != a) {
            return a;
        }
        if (C89361p.m154872a("ID", C58071d.m104907a(), true)) {
            return f101107b;
        }
        if (C89361p.m154872a("GB", C58071d.m104907a(), true)) {
            return f101106a;
        }
        return f101107b;
    }
}
