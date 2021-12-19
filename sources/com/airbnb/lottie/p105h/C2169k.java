package com.airbnb.lottie.p105h;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2050c;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p100a.C2053f;
import com.airbnb.lottie.p099e.p101b.C2066d;
import com.airbnb.lottie.p099e.p101b.EnumC2068f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.k */
public final class C2169k {
    static {
        Covode.recordClassIndex(2364);
    }

    /* renamed from: a */
    static C2066d m6728a(JsonReader jsonReader, C2044e eVar) {
        String str = null;
        EnumC2068f fVar = null;
        Path.FillType fillType = null;
        C2050c cVar = null;
        C2051d dVar = null;
        C2053f fVar2 = null;
        C2053f fVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        fVar3 = C2162d.m6718b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("k")) {
                                cVar = C2162d.m6714a(jsonReader, eVar, i);
                            } else if (!nextName2.equals("p")) {
                                jsonReader.skipValue();
                            } else {
                                i = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endObject();
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
                        if (jsonReader.nextInt() == 1) {
                            fillType = Path.FillType.WINDING;
                            continue;
                        } else {
                            fillType = Path.FillType.EVEN_ODD;
                        }
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar2 = C2162d.m6718b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        if (jsonReader.nextInt() == 1) {
                            fVar = EnumC2068f.Linear;
                            continue;
                        } else {
                            fVar = EnumC2068f.Radial;
                        }
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
        return new C2066d(str, fVar, fillType, cVar, dVar, fVar2, fVar3);
    }
}
