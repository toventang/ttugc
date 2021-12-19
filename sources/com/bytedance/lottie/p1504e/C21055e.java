package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.AbstractC20989m;
import com.bytedance.lottie.p1499c.p1500a.C20982f;
import com.bytedance.lottie.p1499c.p1501b.C20992a;
import com.bytedance.nita.p1555c.HandlerC21534a;

/* renamed from: com.bytedance.lottie.e.e */
final class C21055e {
    static {
        Covode.recordClassIndex(24671);
    }

    /* renamed from: a */
    static C20992a m39641a(JsonReader jsonReader, C21088g gVar, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        AbstractC20989m<PointF, PointF> mVar = null;
        C20982f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case HandlerC21534a.f51116a:
                    if (nextName.equals("d")) {
                        if (jsonReader.nextInt() == 3) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                        }
                    }
                    break;
                case 112:
                    if (nextName.equals("p")) {
                        mVar = C21045a.m39624b(jsonReader, gVar);
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
        return new C20992a(str, mVar, fVar, z);
    }
}
