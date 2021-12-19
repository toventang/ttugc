package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.p */
public final class C21067p {
    static {
        Covode.recordClassIndex(24683);
    }

    /* renamed from: a */
    public static void m39664a(List<? extends C21089a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            i2++;
            ((C21089a) list.get(i2)).f49992g = Float.valueOf(((C21089a) list.get(i2)).f49991f);
        }
        C21089a aVar = (C21089a) list.get(i);
        if (aVar.f49988c == null) {
            list.remove(aVar);
        }
    }

    /* renamed from: a */
    static <T> List<C21089a<T>> m39663a(JsonReader jsonReader, C21088g gVar, float f, AbstractC21051af<T> afVar) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            gVar.mo34562a("Lottie doesn't support expressions.");
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
                    arrayList.add(C21066o.m39659a(jsonReader, gVar, f, afVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C21066o.m39659a(jsonReader, gVar, f, afVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C21066o.m39659a(jsonReader, gVar, f, afVar, false));
            }
        }
        jsonReader.endObject();
        m39664a(arrayList);
        return arrayList;
    }
}
