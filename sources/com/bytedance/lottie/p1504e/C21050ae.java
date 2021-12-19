package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1501b.C21014q;

/* renamed from: com.bytedance.lottie.e.ae */
final class C21050ae {
    static {
        Covode.recordClassIndex(24666);
    }

    /* renamed from: a */
    static C21014q m39629a(JsonReader jsonReader, C21088g gVar) {
        String str = null;
        C21014q.EnumC21015a aVar = null;
        C20978b bVar = null;
        C20978b bVar2 = null;
        C20978b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        bVar2 = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        aVar = C21014q.EnumC21015a.forId(jsonReader.nextInt());
                        continue;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        bVar3 = C21054d.m39633a(jsonReader, gVar, false);
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        bVar = C21054d.m39633a(jsonReader, gVar, false);
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
        return new C21014q(str, aVar, bVar, bVar2, bVar3);
    }
}
