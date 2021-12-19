package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p093a.p095b.C2024h;
import com.airbnb.lottie.p099e.p100a.AbstractC2060m;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2052e;
import com.airbnb.lottie.p099e.p100a.C2056i;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.h.a */
public final class C2153a {
    static {
        Covode.recordClassIndex(2348);
    }

    /* renamed from: a */
    public static C2052e m6703a(JsonReader jsonReader, C2044e eVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C2024h(eVar, C2174o.m6739a(jsonReader, eVar, C2194g.m6792a(), C2180u.f6528a, z)));
            }
            jsonReader.endArray();
            C2175p.m6744a(arrayList);
        } else {
            arrayList.add(new C2202a(C2172n.m6734b(jsonReader, C2194g.m6792a())));
        }
        return new C2052e(arrayList);
    }

    /* renamed from: b */
    static AbstractC2060m<PointF, PointF> m6704b(JsonReader jsonReader, C2044e eVar) {
        jsonReader.beginObject();
        C2052e eVar2 = null;
        C2049b bVar = null;
        C2049b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 107:
                    if (nextName.equals("k")) {
                        eVar2 = m6703a(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 120:
                    if (nextName.equals("x")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar = C2162d.m6713a(jsonReader, eVar, true);
                            continue;
                        }
                        z = true;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals("y")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar2 = C2162d.m6713a(jsonReader, eVar, true);
                            continue;
                        }
                        z = true;
                        break;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            eVar.mo5943a("Lottie doesn't support expressions.");
        }
        if (eVar2 != null) {
            return eVar2;
        }
        return new C2056i(bVar, bVar2);
    }
}
