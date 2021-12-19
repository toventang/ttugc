package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.AbstractC20989m;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1501b.C21002i;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.w */
public final class C21074w {
    static {
        Covode.recordClassIndex(24690);
    }

    /* renamed from: a */
    static C21002i m39675a(JsonReader jsonReader, C21088g gVar) {
        String str = null;
        C21002i.EnumC21003a aVar = null;
        C20978b bVar = null;
        AbstractC20989m<PointF, PointF> mVar = null;
        C20978b bVar2 = null;
        C20978b bVar3 = null;
        C20978b bVar4 = null;
        C20978b bVar5 = null;
        C20978b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        mVar = C21045a.m39624b(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        bVar2 = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        bVar3 = C21054d.m39633a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        bVar5 = C21054d.m39633a(jsonReader, gVar, false);
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
                        bVar4 = C21054d.m39633a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        bVar6 = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        bVar = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        aVar = C21002i.EnumC21003a.forValue(jsonReader.nextInt());
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C21002i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }
}
