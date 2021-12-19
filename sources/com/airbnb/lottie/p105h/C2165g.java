package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p101b.AbstractC2064b;
import com.airbnb.lottie.p099e.p101b.C2079n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.g */
public final class C2165g {
    static {
        Covode.recordClassIndex(2360);
    }

    /* renamed from: a */
    static AbstractC2064b m6723a(JsonReader jsonReader, C2044e eVar) {
        jsonReader.beginObject();
        int i = 2;
        while (true) {
            AbstractC2064b bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            String str = null;
            bVar = null;
            bVar = null;
            bVar = null;
            bVar = null;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("d")) {
                i = jsonReader.nextInt();
            } else if (!nextName.equals("ty")) {
                jsonReader.skipValue();
            } else {
                String nextString = jsonReader.nextString();
                if (nextString != null) {
                    nextString.hashCode();
                    switch (nextString.hashCode()) {
                        case 3239:
                            if (nextString.equals("el")) {
                                bVar = C2163e.m6721a(jsonReader, eVar, i);
                                break;
                            }
                            break;
                        case 3270:
                            if (nextString.equals("fl")) {
                                bVar = C2155ab.m6706a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3295:
                            if (nextString.equals("gf")) {
                                bVar = C2169k.m6728a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3307:
                            if (nextString.equals("gr")) {
                                ArrayList arrayList = new ArrayList();
                                while (jsonReader.hasNext()) {
                                    String nextName2 = jsonReader.nextName();
                                    nextName2.hashCode();
                                    if (nextName2.equals("it")) {
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            AbstractC2064b a = m6723a(jsonReader, eVar);
                                            if (a != null) {
                                                arrayList.add(a);
                                            }
                                        }
                                        jsonReader.endArray();
                                    } else if (!nextName2.equals("nm")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str = jsonReader.nextString();
                                    }
                                }
                                bVar = new C2079n(str, arrayList);
                                break;
                            }
                            break;
                        case 3308:
                            if (nextString.equals("gs")) {
                                bVar = C2170l.m6729a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3488:
                            if (nextString.equals("mm")) {
                                bVar = C2179t.m6752a(jsonReader);
                                eVar.mo5943a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                                break;
                            }
                            break;
                        case 3633:
                            if (nextString.equals("rc")) {
                                bVar = C2183x.m6756a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3646:
                            if (nextString.equals("rp")) {
                                bVar = C2184y.m6757a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3669:
                            if (nextString.equals("sh")) {
                                bVar = C2156ac.m6707a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3679:
                            if (nextString.equals("sr")) {
                                bVar = C2182w.m6755a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3681:
                            if (nextString.equals("st")) {
                                bVar = C2157ad.m6708a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3705:
                            if (nextString.equals("tm")) {
                                bVar = C2158ae.m6709a(jsonReader, eVar);
                                break;
                            }
                            break;
                        case 3710:
                            if (nextString.equals("tr")) {
                                bVar = C2161c.m6712a(jsonReader, eVar);
                                break;
                            }
                            break;
                    }
                    while (jsonReader.hasNext()) {
                        jsonReader.skipValue();
                    }
                    jsonReader.endObject();
                    return bVar;
                }
            }
        }
        return null;
    }
}
