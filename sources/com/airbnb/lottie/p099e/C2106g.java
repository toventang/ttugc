package com.airbnb.lottie.p099e;

import androidx.p025c.C0490e;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.g */
public final class C2106g {

    /* renamed from: a */
    public static final C2106g f6360a = new C2106g();

    /* renamed from: b */
    public final C0490e<String, C2044e> f6361b;

    static {
        Covode.recordClassIndex(2301);
    }

    C2106g() {
        if (!C2144d.C2145a.f6479a) {
            this.f6361b = new C0490e<>(10485760);
        } else if (C2144d.C2145a.f6484f) {
            this.f6361b = new C0490e<>(8);
        } else {
            this.f6361b = new C0490e<>(20);
        }
    }

    /* renamed from: a */
    public final C2044e mo5983a(String str) {
        if (str == null) {
            return null;
        }
        return this.f6361b.mo2091a(str);
    }

    /* renamed from: a */
    public final void mo5984a(String str, C2044e eVar) {
        if (str != null) {
            this.f6361b.mo2092a(str, eVar);
        }
    }
}
