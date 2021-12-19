package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21092d;

/* renamed from: com.bytedance.lottie.e.z */
public final class C21077z implements AbstractC21051af<C21092d> {

    /* renamed from: a */
    public static final C21077z f49947a = new C21077z();

    private C21077z() {
    }

    static {
        Covode.recordClassIndex(24693);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.p1504e.AbstractC21051af
    /* renamed from: a */
    public final /* synthetic */ C21092d mo34520a(JsonReader jsonReader, float f) {
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
        return new C21092d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
