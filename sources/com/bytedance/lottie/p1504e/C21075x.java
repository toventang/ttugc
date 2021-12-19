package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.AbstractC20989m;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20982f;
import com.bytedance.lottie.p1499c.p1501b.C21004j;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.x */
public final class C21075x {
    static {
        Covode.recordClassIndex(24691);
    }

    /* renamed from: a */
    static C21004j m39676a(JsonReader jsonReader, C21088g gVar) {
        String str = null;
        AbstractC20989m<PointF, PointF> mVar = null;
        C20982f fVar = null;
        C20978b bVar = null;
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
                        bVar = C21054d.m39633a(jsonReader, gVar, true);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar = C21054d.m39638b(jsonReader, gVar);
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
        return new C21004j(str, mVar, fVar, bVar);
    }
}
