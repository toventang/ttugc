package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lottie.e.v */
public final class C21073v implements AbstractC21051af<PointF> {

    /* renamed from: a */
    public static final C21073v f49946a = new C21073v();

    private C21073v() {
    }

    static {
        Covode.recordClassIndex(24689);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.p1504e.AbstractC21051af
    /* renamed from: a */
    public final /* synthetic */ PointF mo34520a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C21064n.m39654b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C21064n.m39654b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
