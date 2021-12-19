package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p093a.p095b.C2024h;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.p */
public final class C2175p {
    static {
        Covode.recordClassIndex(2370);
    }

    /* renamed from: a */
    public static <T> void m6744a(List<? extends C2202a<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            if (C2144d.C2145a.f6489k) {
                C2202a aVar = (C2202a) list.get(i2);
                C2202a aVar2 = (C2202a) list.get(i2 + 1);
                aVar.f6570f = Float.valueOf(aVar2.f6569e);
                if (aVar.f6567c == null && aVar2.f6566b != null) {
                    aVar.f6567c = aVar2.f6566b;
                    if (aVar instanceof C2024h) {
                        ((C2024h) aVar).mo5926a();
                    }
                }
            } else {
                ((C2202a) list.get(i2)).f6570f = Float.valueOf(((C2202a) list.get(i2 + 1)).f6569e);
            }
            i2++;
        }
        C2202a aVar3 = (C2202a) list.get(i);
        if (C2144d.C2145a.f6489k) {
            if ((aVar3.f6566b == null || aVar3.f6567c == null) && list.size() > 1) {
                list.remove(aVar3);
            }
        } else if (aVar3.f6566b == null) {
            list.remove(aVar3);
        }
    }

    /* renamed from: a */
    static <T> List<C2202a<T>> m6743a(JsonReader jsonReader, C2044e eVar, float f, AbstractC2159af<T> afVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            eVar.mo5943a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C2174o.m6739a(jsonReader, eVar, f, afVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C2174o.m6739a(jsonReader, eVar, f, afVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C2174o.m6739a(jsonReader, eVar, f, afVar, false));
            }
        }
        jsonReader.endObject();
        m6744a(arrayList);
        return arrayList;
    }
}
