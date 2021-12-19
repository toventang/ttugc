package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.p1501b.C21000h;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lottie.e.t */
public final class C21071t {
    static {
        Covode.recordClassIndex(24687);
    }

    /* renamed from: a */
    static C21000h m39672a(JsonReader jsonReader) {
        String str = null;
        C21000h.EnumC21001a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("mm")) {
                aVar = C21000h.EnumC21001a.forId(jsonReader.nextInt());
            } else if (!nextName.equals("nm")) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        return new C21000h(str, aVar);
    }
}
