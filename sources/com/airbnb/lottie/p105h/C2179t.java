package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.p099e.p101b.C2071h;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.t */
public final class C2179t {
    static {
        Covode.recordClassIndex(2374);
    }

    /* renamed from: a */
    static C2071h m6752a(JsonReader jsonReader) {
        String str = null;
        C2071h.EnumC2072a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("mm")) {
                aVar = C2071h.EnumC2072a.forId(jsonReader.nextInt());
            } else if (!nextName.equals("nm")) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        return new C2071h(str, aVar);
    }
}
