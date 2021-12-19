package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1495a.p1497b.C20962h;
import com.bytedance.lottie.p1499c.p1500a.AbstractC20989m;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20981e;
import com.bytedance.lottie.p1499c.p1500a.C20985i;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.ArrayList;

/* renamed from: com.bytedance.lottie.e.a */
public final class C21045a {
    static {
        Covode.recordClassIndex(24661);
    }

    /* renamed from: a */
    public static C20981e m39623a(JsonReader jsonReader, C21088g gVar) {
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
                arrayList.add(new C20962h(gVar, C21066o.m39659a(jsonReader, gVar, C21087h.m39715a(), C21072u.f49945a, z)));
            }
            jsonReader.endArray();
            C21067p.m39664a(arrayList);
        } else {
            arrayList.add(new C21089a(C21064n.m39654b(jsonReader, C21087h.m39715a())));
        }
        return new C20981e(arrayList);
    }

    /* renamed from: b */
    static AbstractC20989m<PointF, PointF> m39624b(JsonReader jsonReader, C21088g gVar) {
        jsonReader.beginObject();
        C20981e eVar = null;
        C20978b bVar = null;
        C20978b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 107:
                    if (nextName.equals("k")) {
                        eVar = m39623a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 120:
                    if (nextName.equals("x")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar = C21054d.m39633a(jsonReader, gVar, true);
                            continue;
                        }
                        z = true;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals("y")) {
                        if (jsonReader.peek() != JsonToken.STRING) {
                            bVar2 = C21054d.m39633a(jsonReader, gVar, true);
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
            gVar.mo34562a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C20985i(bVar, bVar2);
    }
}
