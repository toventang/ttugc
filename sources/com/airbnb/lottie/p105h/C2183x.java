package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.AbstractC2060m;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2053f;
import com.airbnb.lottie.p099e.p101b.C2075j;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.x */
public final class C2183x {
    static {
        Covode.recordClassIndex(2378);
    }

    /* renamed from: a */
    static C2075j m6756a(JsonReader jsonReader, C2044e eVar) {
        String str = null;
        AbstractC2060m<PointF, PointF> mVar = null;
        C2053f fVar = null;
        C2049b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        mVar = C2153a.m6704b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        bVar = C2162d.m6713a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar = C2162d.m6718b(jsonReader, eVar);
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
        return new C2075j(str, mVar, fVar, bVar);
    }
}
