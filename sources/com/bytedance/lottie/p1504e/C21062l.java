package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20979c;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1500a.C20982f;
import com.bytedance.lottie.p1499c.p1501b.C20996e;
import com.bytedance.lottie.p1499c.p1501b.C21010p;
import com.bytedance.lottie.p1499c.p1501b.EnumC20997f;
import com.bytedance.nita.p1555c.HandlerC21534a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.l */
public final class C21062l {
    static {
        Covode.recordClassIndex(24678);
    }

    /* renamed from: a */
    static C20996e m39649a(JsonReader jsonReader, C21088g gVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        EnumC20997f fVar = null;
        C20979c cVar = null;
        C20980d dVar = null;
        C20982f fVar2 = null;
        C20982f fVar3 = null;
        C20978b bVar = null;
        C21010p.EnumC21012a aVar = null;
        C21010p.EnumC21013b bVar2 = null;
        float f = 0.0f;
        C20978b bVar3 = null;
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
                            if (str2.equals("o")) {
                                bVar3 = bVar4;
                            } else if (str2.equals("d") || str2.equals("g")) {
                                gVar.f49983o = true;
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
                        fVar3 = C21054d.m39638b(jsonReader, gVar);
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
                                cVar = C21054d.m39634a(jsonReader, gVar, i);
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
                        dVar = C21054d.m39635a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar2 = C21054d.m39638b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        if (jsonReader.nextInt() == 1) {
                            fVar = EnumC20997f.Linear;
                            continue;
                        } else {
                            fVar = EnumC20997f.Radial;
                        }
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        bVar = C21054d.m39633a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        aVar = C21010p.EnumC21012a.values()[jsonReader.nextInt() - 1];
                        continue;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        bVar2 = C21010p.EnumC21013b.values()[jsonReader.nextInt() - 1];
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
        return new C20996e(str, fVar, cVar, dVar, fVar2, fVar3, bVar, aVar, bVar2, f, arrayList, bVar3);
    }
}
