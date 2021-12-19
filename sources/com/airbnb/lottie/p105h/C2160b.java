package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2048a;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2058k;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.h.b */
public final class C2160b {
    static {
        Covode.recordClassIndex(2355);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C2058k m6711a(JsonReader jsonReader, C2044e eVar) {
        jsonReader.beginObject();
        C2058k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                C2048a aVar = null;
                C2048a aVar2 = null;
                C2049b bVar = null;
                C2049b bVar2 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    switch (nextName2.hashCode()) {
                        case 116:
                            if (nextName2.equals("t")) {
                                bVar2 = C2162d.m6713a(jsonReader, eVar, true);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3261:
                            if (nextName2.equals("fc")) {
                                aVar = C2162d.m6720d(jsonReader, eVar);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3664:
                            if (nextName2.equals("sc")) {
                                aVar2 = C2162d.m6720d(jsonReader, eVar);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3684:
                            if (nextName2.equals("sw")) {
                                bVar = C2162d.m6713a(jsonReader, eVar, true);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                kVar = new C2058k(aVar, aVar2, bVar, bVar2);
            }
        }
        jsonReader.endObject();
        if (kVar == null) {
            return new C2058k(null, null, null, null);
        }
        return kVar;
    }
}
