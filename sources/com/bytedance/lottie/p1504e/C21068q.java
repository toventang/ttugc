package com.bytedance.lottie.p1504e;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20986j;
import com.bytedance.lottie.p1499c.p1500a.C20987k;
import com.bytedance.lottie.p1499c.p1500a.C20988l;
import com.bytedance.lottie.p1499c.p1501b.AbstractC20993b;
import com.bytedance.lottie.p1499c.p1502c.C21023d;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.bytedance.lottie.e.q */
public final class C21068q {
    static {
        Covode.recordClassIndex(24684);
    }

    /* renamed from: a */
    public static C21023d m39666a(C21088g gVar) {
        Rect rect = gVar.f49976h;
        return new C21023d(Collections.emptyList(), gVar, "__container", -1, C21023d.EnumC21024a.PreComp, -1, null, Collections.emptyList(), new C20988l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), C21023d.EnumC21025b.None, null);
    }

    /* renamed from: a */
    public static C21023d m39665a(JsonReader jsonReader, C21088g gVar) {
        C21023d.EnumC21025b bVar = C21023d.EnumC21025b.None;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        C21023d.EnumC21024a aVar = null;
        Float valueOf2 = Float.valueOf(0.0f);
        String str = "UNSET";
        String str2 = null;
        C20988l lVar = null;
        C20986j jVar = null;
        C20987k kVar = null;
        C20978b bVar2 = null;
        long j = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        long j2 = 0;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        j = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            AbstractC20993b a = C21057g.m39643a(jsonReader, gVar);
                            if (a != null) {
                                arrayList2.add(a);
                            }
                        }
                        jsonReader.endArray();
                        continue;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        i5 = (int) (((float) jsonReader.nextInt()) * C21087h.m39715a());
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("a")) {
                                jsonReader.beginArray();
                                if (jsonReader.hasNext()) {
                                    kVar = C21052b.m39631a(jsonReader, gVar);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                            } else if (!nextName2.equals("d")) {
                                jsonReader.skipValue();
                            } else {
                                jVar = new C20986j(C21054d.m39637a(jsonReader, gVar, C21058h.f49938a));
                            }
                        }
                        jsonReader.endObject();
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        i4 = (int) (((float) jsonReader.nextInt()) * C21087h.m39715a());
                        continue;
                    }
                    break;
                case 3177:
                    if (nextName.equals("cl")) {
                        str3 = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        jsonReader.beginArray();
                        ArrayList arrayList3 = new ArrayList();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName3 = jsonReader.nextName();
                                nextName3.hashCode();
                                if (!nextName3.equals("nm")) {
                                    jsonReader.skipValue();
                                } else {
                                    arrayList3.add(jsonReader.nextString());
                                }
                            }
                            jsonReader.endObject();
                        }
                        jsonReader.endArray();
                        gVar.mo34562a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                        continue;
                    }
                    break;
                case 3367:
                    if (nextName.equals("ip")) {
                        f = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        lVar = C21053c.m39632a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3553:
                    if (nextName.equals("op")) {
                        f2 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        i3 = Color.parseColor(jsonReader.nextString());
                        continue;
                    }
                    break;
                case 3669:
                    if (nextName.equals("sh")) {
                        i2 = (int) (((float) jsonReader.nextInt()) * C21087h.m39715a());
                        continue;
                    }
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        f3 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        f4 = (float) jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        i = (int) (((float) jsonReader.nextInt()) * C21087h.m39715a());
                        continue;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        bVar2 = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        bVar = C21023d.EnumC21025b.values()[jsonReader.nextInt()];
                        gVar.mo34561a(1);
                        continue;
                    }
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt < C21023d.EnumC21024a.Unknown.ordinal()) {
                            aVar = C21023d.EnumC21024a.values()[nextInt];
                            continue;
                        } else {
                            aVar = C21023d.EnumC21024a.Unknown;
                        }
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        j2 = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        str2 = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList = arrayList;
                            arrayList.add(C21070s.m39671a(jsonReader, gVar));
                        }
                        gVar.mo34561a(arrayList.size());
                        jsonReader.endArray();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList4 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList4.add(new C21089a(gVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        }
        if (f6 <= 0.0f) {
            f6 = gVar.f49978j;
        }
        arrayList4.add(new C21089a(gVar, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList4.add(new C21089a(gVar, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str3)) {
            gVar.mo34562a("Convert your Illustrator layers to shape layers.");
        }
        return new C21023d(arrayList2, gVar, str, j2, aVar, j, str2, arrayList, lVar, i, i2, i3, f3, f4, i4, i5, jVar, kVar, arrayList4, bVar, bVar2);
    }
}
