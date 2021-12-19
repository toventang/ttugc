package com.airbnb.lottie.p105h;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2057j;
import com.airbnb.lottie.p099e.p100a.C2058k;
import com.airbnb.lottie.p099e.p100a.C2059l;
import com.airbnb.lottie.p099e.p101b.AbstractC2064b;
import com.airbnb.lottie.p099e.p102c.C2094d;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.h.q */
public final class C2176q {

    /* renamed from: a */
    private static int f6527a;

    static {
        Covode.recordClassIndex(2371);
    }

    /* renamed from: a */
    public static C2094d m6746a(C2044e eVar) {
        Rect rect = eVar.f6144h;
        return new C2094d(Collections.emptyList(), eVar, "__container", -1, C2094d.EnumC2095a.PreComp, -1, null, Collections.emptyList(), new C2059l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), C2094d.EnumC2096b.None, null);
    }

    /* renamed from: a */
    public static C2094d m6745a(JsonReader jsonReader, C2044e eVar) {
        C2094d.EnumC2096b bVar = C2094d.EnumC2096b.None;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        C2094d.EnumC2095a aVar = null;
        Float valueOf2 = Float.valueOf(0.0f);
        C2059l lVar = null;
        C2057j jVar = null;
        C2058k kVar = null;
        C2049b bVar2 = null;
        long j = 0;
        long j2 = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        j2 = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            AbstractC2064b a = C2165g.m6723a(jsonReader, eVar);
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
                        i5 = (int) (((float) jsonReader.nextInt()) * C2194g.m6792a());
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
                                    kVar = C2160b.m6711a(jsonReader, eVar);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                            } else if (!nextName2.equals("d")) {
                                jsonReader.skipValue();
                            } else {
                                jVar = new C2057j(C2162d.m6717a(jsonReader, eVar, C2166h.f6520a));
                            }
                        }
                        jsonReader.endObject();
                        continue;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        i4 = (int) (((float) jsonReader.nextInt()) * C2194g.m6792a());
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
                        eVar.mo5943a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
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
                        lVar = C2161c.m6712a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str2 = jsonReader.nextString();
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
                        i2 = (int) (((float) jsonReader.nextInt()) * C2194g.m6792a());
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
                        i = (int) (((float) jsonReader.nextInt()) * C2194g.m6792a());
                        continue;
                    }
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        bVar2 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3712:
                    if (nextName.equals("tt")) {
                        bVar = C2094d.EnumC2096b.values()[jsonReader.nextInt()];
                        continue;
                    }
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        int nextInt = jsonReader.nextInt();
                        if (nextInt < C2094d.EnumC2095a.Unknown.ordinal()) {
                            aVar = C2094d.EnumC2095a.values()[nextInt];
                            continue;
                        } else {
                            aVar = C2094d.EnumC2095a.Unknown;
                        }
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        j = (long) jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList = arrayList;
                            arrayList.add(C2178s.m6751a(jsonReader, eVar));
                        }
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
            arrayList4.add(new C2202a(eVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        }
        if (f6 <= 0.0f) {
            f6 = eVar.f6146j;
        }
        arrayList4.add(new C2202a(eVar, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList4.add(new C2202a(eVar, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str2 == null) {
            StringBuilder sb = new StringBuilder("layer_");
            int i6 = f6527a;
            f6527a = i6 + 1;
            str2 = sb.append(i6).append("_").append(str).toString();
        } else if (str2.endsWith(".ai") || "ai".equals(str3)) {
            eVar.mo5943a("Convert your Illustrator layers to shape layers.");
        }
        return new C2094d(arrayList2, eVar, str2, j, aVar, j2, str, arrayList, lVar, i, i2, i3, f3, f4, i4, i5, jVar, kVar, arrayList4, bVar, bVar2);
    }
}
