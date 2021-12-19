package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20977a;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20987k;

/* renamed from: com.bytedance.lottie.e.b */
public final class C21052b {
    static {
        Covode.recordClassIndex(24668);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C20987k m39631a(JsonReader jsonReader, C21088g gVar) {
        jsonReader.beginObject();
        C20987k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                C20977a aVar = null;
                C20977a aVar2 = null;
                C20978b bVar = null;
                C20978b bVar2 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    switch (nextName2.hashCode()) {
                        case 116:
                            if (nextName2.equals("t")) {
                                bVar2 = C21054d.m39633a(jsonReader, gVar, true);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3261:
                            if (nextName2.equals("fc")) {
                                aVar = C21054d.m39640d(jsonReader, gVar);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3664:
                            if (nextName2.equals("sc")) {
                                aVar2 = C21054d.m39640d(jsonReader, gVar);
                                break;
                            }
                            jsonReader.skipValue();
                            break;
                        case 3684:
                            if (nextName2.equals("sw")) {
                                bVar = C21054d.m39633a(jsonReader, gVar, true);
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
                kVar = new C20987k(aVar, aVar2, bVar, bVar2);
            }
        }
        jsonReader.endObject();
        if (kVar == null) {
            return new C20987k(null, null, null, null);
        }
        return kVar;
    }
}
