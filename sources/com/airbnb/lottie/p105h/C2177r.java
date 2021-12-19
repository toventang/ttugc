package com.airbnb.lottie.p105h;

import android.util.JsonReader;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import com.airbnb.lottie.C2041d;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2152h;
import com.airbnb.lottie.p099e.C2087c;
import com.airbnb.lottie.p099e.C2103d;
import com.airbnb.lottie.p099e.p102c.C2094d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.h.r */
public final class C2177r {
    static {
        Covode.recordClassIndex(2372);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m6750a(JsonReader jsonReader, Map<String, C2087c> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    float f = 0.0f;
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        switch (nextName2.hashCode()) {
                            case -1866931350:
                                if (nextName2.equals("fFamily")) {
                                    str = jsonReader.nextString();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            case -1408684838:
                                if (nextName2.equals("ascent")) {
                                    f = (float) jsonReader.nextDouble();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            case -1294566165:
                                if (nextName2.equals("fStyle")) {
                                    str3 = jsonReader.nextString();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            case 96619537:
                                if (nextName2.equals("fName")) {
                                    str2 = jsonReader.nextString();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    C2087c cVar = new C2087c(str, str2, str3, f);
                    map.put(cVar.f6268b, cVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m6747a(JsonReader jsonReader, C2044e eVar, C0498h<C2103d> hVar) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            double d = 0.0d;
            double d2 = 0.0d;
            char c = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName.hashCode()) {
                    case -1866931350:
                        if (nextName.equals("fFamily")) {
                            str2 = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            d = jsonReader.nextDouble();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3173:
                        if (nextName.equals("ch")) {
                            c = jsonReader.nextString().charAt(0);
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3076010:
                        if (nextName.equals("data")) {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                if ("shapes".equals(jsonReader.nextName())) {
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(C2165g.m6723a(jsonReader, eVar));
                                    }
                                    jsonReader.endArray();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3530753:
                        if (nextName.equals("size")) {
                            d2 = jsonReader.nextDouble();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 109780401:
                        if (nextName.equals("style")) {
                            str = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            C2103d dVar = new C2103d(arrayList, c, d2, d, str, str2);
            hVar.mo2186b(dVar.hashCode(), dVar);
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    public static void m6748a(JsonReader jsonReader, C2044e eVar, List<C2094d> list, C0489d<C2094d> dVar) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            C2094d a = C2176q.m6745a(jsonReader, eVar);
            if (a.f6311e == C2094d.EnumC2095a.Image) {
                i++;
            }
            list.add(a);
            dVar.mo2083b(a.f6310d, a);
            if (i > 4) {
                C2041d.m6461a("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m6749a(JsonReader jsonReader, C2044e eVar, Map<String, List<C2094d>> map, Map<String, C2152h> map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C0489d dVar = new C0489d();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            boolean z = true;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName.hashCode()) {
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                C2094d a = C2176q.m6745a(jsonReader, eVar);
                                dVar.mo2083b(a.f6310d, a);
                                arrayList.add(a);
                            }
                            jsonReader.endArray();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            i2 = jsonReader.nextInt();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 112:
                        if (nextName.equals("p")) {
                            str2 = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 117:
                        if (nextName.equals("u")) {
                            str3 = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            i = jsonReader.nextInt();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            str = jsonReader.nextString();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    case 92909918:
                        if (nextName.equals("alpha")) {
                            z = jsonReader.nextBoolean();
                            break;
                        }
                        jsonReader.skipValue();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                C2152h hVar = new C2152h(i, i2, str, str2, str3, z);
                map2.put(hVar.f6511c, hVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }
}
