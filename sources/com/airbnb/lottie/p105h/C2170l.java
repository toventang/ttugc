package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2050c;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p100a.C2053f;
import com.airbnb.lottie.p099e.p101b.C2067e;
import com.airbnb.lottie.p099e.p101b.C2081p;
import com.airbnb.lottie.p099e.p101b.EnumC2068f;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.p1555c.HandlerC21534a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.l */
public final class C2170l {
    static {
        Covode.recordClassIndex(2365);
    }

    /* renamed from: a */
    static C2067e m6729a(JsonReader jsonReader, C2044e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        EnumC2068f fVar = null;
        C2050c cVar = null;
        C2051d dVar = null;
        C2053f fVar2 = null;
        C2053f fVar3 = null;
        C2049b bVar = null;
        C2081p.EnumC2083a aVar = null;
        C2081p.EnumC2084b bVar2 = null;
        float f = 0.0f;
        C2049b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
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
                            if (str2.equals("o")) {
                                bVar3 = bVar4;
                            } else if (str2.equals("d") || str2.equals("g")) {
                                arrayList.add(bVar4);
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
                case 101:
                    if (nextName.equals("e")) {
                        fVar3 = C2162d.m6718b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        jsonReader.beginObject();
                        int i = -1;
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("k")) {
                                cVar = C2162d.m6714a(jsonReader, eVar, i);
                            } else if (!nextName3.equals("p")) {
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
                case 119:
                    if (nextName.equals("w")) {
                        bVar = C2162d.m6713a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        aVar = C2081p.EnumC2083a.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        bVar2 = C2081p.EnumC2084b.values()[jsonReader.nextInt() - 1];
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
        return new C2067e(str, fVar, cVar, dVar, fVar2, fVar3, bVar, aVar, bVar2, f, arrayList, bVar3);
    }
}
