package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.ae */
public final class C2158ae {
    static {
        Covode.recordClassIndex(2353);
    }

    /* renamed from: a */
    static C2085q m6709a(JsonReader jsonReader, C2044e eVar) {
        String str = null;
        C2085q.EnumC2086a aVar = null;
        C2049b bVar = null;
        C2049b bVar2 = null;
        C2049b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        bVar2 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        aVar = C2085q.EnumC2086a.forId(jsonReader.nextInt());
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar3 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        bVar = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C2085q(str, aVar, bVar, bVar2, bVar3);
    }
}
