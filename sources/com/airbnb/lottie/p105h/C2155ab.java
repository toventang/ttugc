package com.airbnb.lottie.p105h;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2048a;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p101b.C2078m;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.ab */
public final class C2155ab {
    static {
        Covode.recordClassIndex(2350);
    }

    /* renamed from: a */
    static C2078m m6706a(JsonReader jsonReader, C2044e eVar) {
        Path.FillType fillType;
        String str = null;
        C2048a aVar = null;
        C2051d dVar = null;
        int i = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -396065730:
                    if (nextName.equals("fillEnabled")) {
                        z = jsonReader.nextBoolean();
                        continue;
                    }
                    break;
                case 99:
                    if (nextName.equals("c")) {
                        aVar = C2162d.m6720d(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        dVar = C2162d.m6715a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        i = jsonReader.nextInt();
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
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C2078m(str, z, fillType, aVar, dVar);
    }
}
