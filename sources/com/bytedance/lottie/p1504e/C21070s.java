package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1500a.C20984h;
import com.bytedance.lottie.p1499c.p1501b.C20998g;

/* renamed from: com.bytedance.lottie.e.s */
final class C21070s {
    static {
        Covode.recordClassIndex(24686);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static C20998g m39671a(JsonReader jsonReader, C21088g gVar) {
        jsonReader.beginObject();
        C20998g.EnumC20999a aVar = null;
        C20984h hVar = null;
        C20980d dVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        dVar = C21054d.m39635a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        hVar = C21054d.m39639c(jsonReader, gVar);
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
                                    aVar = C20998g.EnumC20999a.MaskModeAdd;
                                    break;
                                }
                                aVar = C20998g.EnumC20999a.MaskModeAdd;
                                continue;
                            case 105:
                                if (nextString.equals("i")) {
                                    gVar.mo34562a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    aVar = C20998g.EnumC20999a.MaskModeIntersect;
                                    break;
                                }
                                aVar = C20998g.EnumC20999a.MaskModeAdd;
                                continue;
                            case 115:
                                if (nextString.equals("s")) {
                                    aVar = C20998g.EnumC20999a.MaskModeSubtract;
                                    break;
                                }
                                aVar = C20998g.EnumC20999a.MaskModeAdd;
                                continue;
                            default:
                                aVar = C20998g.EnumC20999a.MaskModeAdd;
                                continue;
                        }
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new C20998g(aVar, hVar, dVar);
    }
}
