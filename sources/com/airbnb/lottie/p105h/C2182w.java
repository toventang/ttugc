package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.AbstractC2060m;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p101b.C2073i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.w */
public final class C2182w {
    static {
        Covode.recordClassIndex(2377);
    }

    /* renamed from: a */
    static C2073i m6755a(JsonReader jsonReader, C2044e eVar) {
        String str = null;
        C2073i.EnumC2074a aVar = null;
        C2049b bVar = null;
        AbstractC2060m<PointF, PointF> mVar = null;
        C2049b bVar2 = null;
        C2049b bVar3 = null;
        C2049b bVar4 = null;
        C2049b bVar5 = null;
        C2049b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        mVar = C2153a.m6704b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        bVar2 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        bVar3 = C2162d.m6713a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        bVar5 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        bVar4 = C2162d.m6713a(jsonReader, eVar, true);
                        continue;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        bVar6 = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        bVar = C2162d.m6713a(jsonReader, eVar, false);
                        continue;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        aVar = C2073i.EnumC2074a.forValue(jsonReader.nextInt());
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C2073i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }
}
