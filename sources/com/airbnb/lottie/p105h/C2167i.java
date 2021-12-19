package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.h.i */
public final class C2167i implements AbstractC2159af<Float> {

    /* renamed from: a */
    public static final C2167i f6521a = new C2167i();

    private C2167i() {
    }

    static {
        Covode.recordClassIndex(2362);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ Float mo6078a(JsonReader jsonReader, float f) {
        return Float.valueOf(C2172n.m6733b(jsonReader) * f);
    }
}
