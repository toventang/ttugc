package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p099e.p100a.AbstractC2060m;
import com.airbnb.lottie.p099e.p100a.C2053f;
import com.airbnb.lottie.p099e.p101b.C2063a;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.p1555c.HandlerC21534a;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.h.e */
public final class C2163e {
    static {
        Covode.recordClassIndex(2358);
    }

    /* renamed from: a */
    static C2063a m6721a(JsonReader jsonReader, C2044e eVar, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        AbstractC2060m<PointF, PointF> mVar = null;
        C2053f fVar = null;
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
                        mVar = C2153a.m6704b(jsonReader, eVar);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        fVar = C2162d.m6718b(jsonReader, eVar);
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
        return new C2063a(str, mVar, fVar, z);
    }
}
