package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import com.airbnb.lottie.p099e.C2062b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.h.h */
public final class C2166h implements AbstractC2159af<C2062b> {

    /* renamed from: a */
    public static final C2166h f6520a = new C2166h();

    private C2166h() {
    }

    static {
        Covode.recordClassIndex(2361);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ C2062b mo6078a(JsonReader jsonReader, float f) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 102:
                    if (nextName.equals("f")) {
                        str2 = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 106:
                    if (nextName.equals("j")) {
                        i = jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        d = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        str = jsonReader.nextString();
                        continue;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        i3 = C2172n.m6731a(jsonReader);
                        continue;
                    }
                    break;
                case 3452:
                    if (nextName.equals("lh")) {
                        d2 = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3463:
                    if (nextName.equals("ls")) {
                        d3 = jsonReader.nextDouble();
                        continue;
                    }
                    break;
                case 3543:
                    if (nextName.equals("of")) {
                        z = jsonReader.nextBoolean();
                        continue;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        i4 = C2172n.m6731a(jsonReader);
                        continue;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        i5 = jsonReader.nextInt();
                        continue;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        i2 = jsonReader.nextInt();
                        continue;
                    }
                    break;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return new C2062b(str, str2, d, i, i2, d2, d3, i3, i4, i5, z);
    }
}
