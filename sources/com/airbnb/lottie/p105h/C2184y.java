package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2059l;
import com.airbnb.lottie.p099e.p101b.C2076k;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.y */
public final class C2184y {
    static {
        Covode.recordClassIndex(2379);
    }

    /* renamed from: a */
    static C2076k m6757a(JsonReader jsonReader, C2044e eVar) {
        String str = null;
        C2049b bVar = null;
        C2049b bVar2 = null;
        C2059l lVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        bVar = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar2 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        lVar = C2161c.m6712a(jsonReader, eVar);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C2076k(str, bVar, bVar2, lVar);
    }
}
