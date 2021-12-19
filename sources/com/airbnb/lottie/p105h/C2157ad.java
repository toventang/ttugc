package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2048a;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p101b.C2081p;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.p1555c.HandlerC21534a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.ad */
public final class C2157ad {
    static {
        Covode.recordClassIndex(2352);
    }

    /* renamed from: a */
    static C2081p m6708a(JsonReader jsonReader, C2044e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        C2049b bVar = null;
        C2048a aVar = null;
        C2051d dVar = null;
        C2049b bVar2 = null;
        C2081p.EnumC2083a aVar2 = null;
        C2081p.EnumC2084b bVar3 = null;
        float f = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        aVar = C2162d.m6720d(jsonReader, eVar);
                        continue;
                    }
                    break;
                case HandlerC21534a.f51116a:
                    if (nextName.equals("d")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            String str2 = null;
                            C2049b bVar4 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.hashCode();
                                if (nextName2.equals("n")) {
                                    str2 = jsonReader.nextString();
                                } else if (!nextName2.equals("v")) {
                                    jsonReader.skipValue();
                                } else {
                                    bVar4 = C2162d.m6713a(jsonReader, eVar, true);
                                }
                            }
                            jsonReader.endObject();
                            str2.hashCode();
                            switch (str2.hashCode()) {
                                case HandlerC21534a.f51116a:
                                    if (!str2.equals("d")) {
                                        break;
                                    }
                                    arrayList.add(bVar4);
                                    break;
                                case 103:
                                    if (!str2.equals("g")) {
                                        break;
                                    }
                                    arrayList.add(bVar4);
                                    break;
                                case 111:
                                    if (str2.equals("o")) {
                                        bVar = bVar4;
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                        jsonReader.endArray();
                        if (arrayList.size() == 1) {
                            arrayList.add(arrayList.get(0));
                        } else {
                            continue;
                        }
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        dVar = C2162d.m6715a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        bVar2 = C2162d.m6713a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        aVar2 = C2081p.EnumC2083a.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        bVar3 = C2081p.EnumC2084b.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        f = (float) jsonReader.nextDouble();
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
        return new C2081p(str, bVar, arrayList, aVar, dVar, bVar2, aVar2, bVar3, f);
    }
}
