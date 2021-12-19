package com.airbnb.lottie.p104g;

import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2122g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.g.b */
public final class C2142b {

    /* renamed from: a */
    public static C2139a f6468a;

    /* renamed from: b */
    public static long f6469b;

    /* renamed from: c */
    public static boolean f6470c;

    static {
        Covode.recordClassIndex(2337);
    }

    /* renamed from: b */
    public static void m6676b(C2122g gVar) {
        if (f6470c) {
            if (gVar == null) {
                C2139a aVar = f6468a;
                if (aVar != null) {
                    aVar.mo6057a(f6469b);
                }
            } else if (gVar.f6410o != null) {
                gVar.f6410o.mo6057a(f6469b);
            }
        }
    }

    /* renamed from: a */
    public static void m6674a(C2122g gVar) {
        if (f6470c) {
            if (gVar != null) {
                if (gVar.f6410o == null) {
                    gVar.f6410o = new C2139a();
                }
            } else if (f6468a == null) {
                C2139a aVar = new C2139a();
                f6468a = aVar;
                aVar.f6452a = true;
            }
        }
    }

    /* renamed from: c */
    public static void m6677c(C2122g gVar) {
        float f;
        if (f6470c) {
            float f2 = 0.0f;
            if (gVar.f6410o != null) {
                C2044e eVar = gVar.f6396a;
                if (eVar != null) {
                    f = eVar.f6147k;
                } else {
                    f = 0.0f;
                }
                gVar.f6410o.mo6060b();
                gVar.f6410o.f6453b = f;
            }
            if (f6468a != null) {
                C2044e eVar2 = gVar.f6396a;
                if (eVar2 != null) {
                    f2 = eVar2.f6147k;
                }
                C2139a aVar = f6468a;
                aVar.f6453b = Math.max(aVar.f6453b, f2);
                f6468a.mo6060b();
            }
        }
    }

    /* renamed from: a */
    public static void m6675a(C2122g gVar, boolean z) {
        if (f6470c) {
            if (!(gVar == null || gVar.f6410o == null)) {
                gVar.f6410o.mo6059a(z);
            }
            C2139a aVar = f6468a;
            if (aVar != null) {
                aVar.mo6059a(z);
            }
        }
    }
}
