package com.bytedance.lottie.p1504e;

import android.graphics.Path;
import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20977a;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1501b.C21007m;

/* renamed from: com.bytedance.lottie.e.ab */
final class C21047ab {
    static {
        Covode.recordClassIndex(24663);
    }

    /* renamed from: a */
    static C21007m m39626a(JsonReader jsonReader, C21088g gVar) {
        Path.FillType fillType;
        String str = null;
        C20977a aVar = null;
        C20980d dVar = null;
        int i = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case -396065730:
                    if (nextName.equals("fillEnabled")) {
                        z = jsonReader.nextBoolean();
                        continue;
                    }
                    break;
                case 99:
                    if (nextName.equals("c")) {
                        aVar = C21054d.m39640d(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        dVar = C21054d.m39635a(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        i = jsonReader.nextInt();
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
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C21007m(str, z, fillType, aVar, dVar);
    }
}
