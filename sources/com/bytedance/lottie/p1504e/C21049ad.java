package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20977a;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1501b.C21010p;
import com.bytedance.nita.p1555c.HandlerC21534a;
import java.util.ArrayList;

/* renamed from: com.bytedance.lottie.e.ad */
final class C21049ad {
    static {
        Covode.recordClassIndex(24665);
    }

    /* renamed from: a */
    static C21010p m39628a(JsonReader jsonReader, C21088g gVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        C20978b bVar = null;
        C20977a aVar = null;
        C20980d dVar = null;
        C20978b bVar2 = null;
        C21010p.EnumC21012a aVar2 = null;
        C21010p.EnumC21013b bVar3 = null;
        float f = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        aVar = C21054d.m39640d(jsonReader, gVar);
                        continue;
                    }
                    break;
                case HandlerC21534a.f51116a:
                    if (nextName.equals("d")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            String str2 = null;
                            C20978b bVar4 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.hashCode();
                                if (nextName2.equals("n")) {
                                    str2 = jsonReader.nextString();
                                } else if (!nextName2.equals("v")) {
                                    jsonReader.skipValue();
                                } else {
                                    bVar4 = C21054d.m39633a(jsonReader, gVar, true);
                                }
                            }
                            jsonReader.endObject();
                            str2.hashCode();
                            switch (str2.hashCode()) {
                                case HandlerC21534a.f51116a:
                                    if (!str2.equals("d")) {
                                        break;
                                    }
                                    gVar.f49983o = true;
                                    arrayList.add(bVar4);
                                    break;
                                case 103:
                                    if (!str2.equals("g")) {
                                        break;
                                    }
                                    gVar.f49983o = true;
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
                        dVar = C21054d.m39635a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        bVar2 = C21054d.m39633a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        aVar2 = C21010p.EnumC21012a.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        bVar3 = C21010p.EnumC21013b.values()[jsonReader.nextInt() - 1];
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
        return new C21010p(str, bVar, arrayList, aVar, dVar, bVar2, aVar2, bVar3, f);
    }
}
