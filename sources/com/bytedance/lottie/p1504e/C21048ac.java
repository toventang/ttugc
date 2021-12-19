package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20984h;
import com.bytedance.lottie.p1499c.p1501b.C21009o;

/* renamed from: com.bytedance.lottie.e.ac */
final class C21048ac {
    static {
        Covode.recordClassIndex(24664);
    }

    /* renamed from: a */
    static C21009o m39627a(JsonReader jsonReader, C21088g gVar) {
        String str = null;
        C20984h hVar = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 3432:
                    if (nextName.equals("ks")) {
                        hVar = C21054d.m39639c(jsonReader, gVar);
                        continue;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        i = jsonReader.nextInt();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        return new C21009o(str, i, hVar);
    }
}
