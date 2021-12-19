package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20988l;
import com.bytedance.lottie.p1499c.p1501b.C21005k;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.y */
public final class C21076y {
    static {
        Covode.recordClassIndex(24692);
    }

    /* renamed from: a */
    static C21005k m39677a(JsonReader jsonReader, C21088g gVar) {
        String str = null;
        C20978b bVar = null;
        C20978b bVar2 = null;
        C20988l lVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        bVar = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar2 = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        lVar = C21053c.m39632a(jsonReader, gVar);
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C21005k(str, bVar, bVar2, lVar);
    }
}
