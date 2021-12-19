package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2055h;
import com.airbnb.lottie.p099e.p101b.C2080o;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.ac */
public final class C2156ac {
    static {
        Covode.recordClassIndex(2351);
    }

    /* renamed from: a */
    static C2080o m6707a(JsonReader jsonReader, C2044e eVar) {
        String str = null;
        C2055h hVar = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 3432:
                    if (nextName.equals("ks")) {
                        hVar = C2162d.m6719c(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        i = jsonReader.nextInt();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C2080o(str, i, hVar);
    }
}
