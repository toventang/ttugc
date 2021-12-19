package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.h.v */
public final class C2181v implements AbstractC2159af<PointF> {

    /* renamed from: a */
    public static final C2181v f6529a = new C2181v();

    private C2181v() {
    }

    static {
        Covode.recordClassIndex(2376);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ PointF mo6078a(JsonReader jsonReader, float f) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C2172n.m6734b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C2172n.m6734b(jsonReader, f);
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
