package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p100a.C2055h;
import com.airbnb.lottie.p099e.p101b.C2069g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.s */
public final class C2178s {
    static {
        Covode.recordClassIndex(2373);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static C2069g m6751a(JsonReader jsonReader, C2044e eVar) {
        jsonReader.beginObject();
        C2069g.EnumC2070a aVar = null;
        C2055h hVar = null;
        C2051d dVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        dVar = C2162d.m6715a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        hVar = C2162d.m6719c(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        String nextString = jsonReader.nextString();
                        nextString.hashCode();
                        switch (nextString.hashCode()) {
                            case 97:
                                if (nextString.equals("a")) {
                                    aVar = C2069g.EnumC2070a.MaskModeAdd;
                                    break;
                                }
                                aVar = C2069g.EnumC2070a.MaskModeAdd;
                                continue;
                            case 105:
                                if (nextString.equals("i")) {
                                    eVar.mo5943a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    aVar = C2069g.EnumC2070a.MaskModeIntersect;
                                    break;
                                }
                                aVar = C2069g.EnumC2070a.MaskModeAdd;
                                continue;
                            case 115:
                                if (nextString.equals("s")) {
                                    aVar = C2069g.EnumC2070a.MaskModeSubtract;
                                    break;
                                }
                                aVar = C2069g.EnumC2070a.MaskModeAdd;
                                continue;
                            default:
                                aVar = C2069g.EnumC2070a.MaskModeAdd;
                                continue;
                        }
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new C2069g(aVar, hVar, dVar);
    }
}
