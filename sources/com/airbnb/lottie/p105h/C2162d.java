package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2048a;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2050c;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p100a.C2053f;
import com.airbnb.lottie.p099e.p100a.C2055h;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.h.d */
public final class C2162d {
    static {
        Covode.recordClassIndex(2357);
    }

    /* renamed from: b */
    static C2053f m6718b(JsonReader jsonReader, C2044e eVar) {
        return new C2053f(m6716a(jsonReader, C2194g.m6792a(), eVar, C2181v.f6529a));
    }

    /* renamed from: c */
    static C2055h m6719c(JsonReader jsonReader, C2044e eVar) {
        return new C2055h(m6716a(jsonReader, C2194g.m6792a(), eVar, C2154aa.f6518a));
    }

    /* renamed from: d */
    static C2048a m6720d(JsonReader jsonReader, C2044e eVar) {
        return new C2048a(m6717a(jsonReader, eVar, C2164f.f6519a));
    }

    /* renamed from: a */
    static C2051d m6715a(JsonReader jsonReader, C2044e eVar) {
        return new C2051d(m6717a(jsonReader, eVar, C2171m.f6523a));
    }

    /* renamed from: a */
    static C2050c m6714a(JsonReader jsonReader, C2044e eVar, int i) {
        return new C2050c(m6717a(jsonReader, eVar, new C2168j(i)));
    }

    /* renamed from: a */
    public static C2049b m6713a(JsonReader jsonReader, C2044e eVar, boolean z) {
        float f;
        if (z) {
            f = C2194g.m6792a();
        } else {
            f = 1.0f;
        }
        return new C2049b(m6716a(jsonReader, f, eVar, C2167i.f6521a));
    }

    /* renamed from: a */
    static <T> List<C2202a<T>> m6717a(JsonReader jsonReader, C2044e eVar, AbstractC2159af<T> afVar) {
        return C2175p.m6743a(jsonReader, eVar, 1.0f, afVar);
    }

    /* renamed from: a */
    private static <T> List<C2202a<T>> m6716a(JsonReader jsonReader, float f, C2044e eVar, AbstractC2159af<T> afVar) {
        return C2175p.m6743a(jsonReader, eVar, f, afVar);
    }
}
