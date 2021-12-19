package com.bytedance.lottie.p1504e;

import android.graphics.Path;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20979c;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1500a.C20982f;
import com.bytedance.lottie.p1499c.p1501b.C20995d;
import com.bytedance.lottie.p1499c.p1501b.EnumC20997f;

/* renamed from: com.bytedance.lottie.e.k */
final class C21061k {
    static {
        Covode.recordClassIndex(24677);
    }

    /* renamed from: a */
    static C20995d m39648a(JsonReader jsonReader, C21088g gVar) {
        EnumC20997f fVar = EnumC20997f.Linear;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        C20979c cVar = null;
        C20980d dVar = null;
        C20982f fVar2 = null;
        C20982f fVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        fVar3 = C21054d.m39638b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("k")) {
                                cVar = C21054d.m39634a(jsonReader, gVar, i);
                            } else if (!nextName2.equals("p")) {
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
                case 114:
                    if (nextName.equals("r")) {
                        if (jsonReader.nextInt() == 1) {
                            fillType = Path.FillType.WINDING;
                            continue;
                        } else {
                            fillType = Path.FillType.EVEN_ODD;
                        }
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
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C20995d(str, fVar, fillType, cVar, dVar, fVar2, fVar3);
    }
}
