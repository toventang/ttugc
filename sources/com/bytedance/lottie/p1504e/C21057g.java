package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1501b.AbstractC20993b;
import com.bytedance.lottie.p1499c.p1501b.C21008n;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.g */
public final class C21057g {
    static {
        Covode.recordClassIndex(24673);
    }

    /* renamed from: a */
    static AbstractC20993b m39643a(JsonReader jsonReader, C21088g gVar) {
        jsonReader.beginObject();
        int i = 2;
        while (true) {
            AbstractC20993b bVar = null;
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
                                bVar = C21055e.m39641a(jsonReader, gVar, i);
                                break;
                            }
                            break;
                        case 3270:
                            if (nextString.equals("fl")) {
                                bVar = C21047ab.m39626a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3295:
                            if (nextString.equals("gf")) {
                                bVar = C21061k.m39648a(jsonReader, gVar);
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
                                            AbstractC20993b a = m39643a(jsonReader, gVar);
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
                                bVar = new C21008n(str, arrayList);
                                break;
                            }
                            break;
                        case 3308:
                            if (nextString.equals("gs")) {
                                bVar = C21062l.m39649a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3488:
                            if (nextString.equals("mm")) {
                                bVar = C21071t.m39672a(jsonReader);
                                gVar.mo34562a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                                break;
                            }
                            break;
                        case 3633:
                            if (nextString.equals("rc")) {
                                bVar = C21075x.m39676a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3646:
                            if (nextString.equals("rp")) {
                                bVar = C21076y.m39677a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3669:
                            if (nextString.equals("sh")) {
                                bVar = C21048ac.m39627a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3679:
                            if (nextString.equals("sr")) {
                                bVar = C21074w.m39675a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3681:
                            if (nextString.equals("st")) {
                                bVar = C21049ad.m39628a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3705:
                            if (nextString.equals("tm")) {
                                bVar = C21050ae.m39629a(jsonReader, gVar);
                                break;
                            }
                            break;
                        case 3710:
                            if (nextString.equals("tr")) {
                                bVar = C21053c.m39632a(jsonReader, gVar);
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
