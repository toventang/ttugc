package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p107j.C2205d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.h.z */
public final class C2185z implements AbstractC2159af<C2205d> {

    /* renamed from: a */
    public static final C2185z f6530a = new C2185z();

    private C2185z() {
    }

    static {
        Covode.recordClassIndex(2380);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ C2205d mo6078a(JsonReader jsonReader, float f) {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
            jsonReader.beginArray();
        } else {
            z = false;
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C2205d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
