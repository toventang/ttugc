package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.h.m */
public final class C2171m implements AbstractC2159af<Integer> {

    /* renamed from: a */
    public static final C2171m f6523a = new C2171m();

    private C2171m() {
    }

    static {
        Covode.recordClassIndex(2366);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ Integer mo6078a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(C2172n.m6733b(jsonReader) * f));
    }
}
