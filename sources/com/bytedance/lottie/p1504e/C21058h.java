package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.C20991b;

/* renamed from: com.bytedance.lottie.e.h */
public final class C21058h implements AbstractC21051af<C20991b> {

    /* renamed from: a */
    public static final C21058h f49938a = new C21058h();

    private C21058h() {
    }

    static {
        Covode.recordClassIndex(24674);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.p1504e.AbstractC21051af
    /* renamed from: a */
    public final /* synthetic */ C20991b mo34520a(JsonReader jsonReader, float f) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
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
                        i3 = C21064n.m39651a(jsonReader);
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
                        i4 = C21064n.m39651a(jsonReader);
                        continue;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        d4 = jsonReader.nextDouble();
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
        return new C20991b(str, str2, d, i, i2, d2, d3, i3, i4, d4, z);
    }
}
