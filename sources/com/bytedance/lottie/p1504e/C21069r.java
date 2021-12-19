package com.bytedance.lottie.p1504e;

import android.util.JsonReader;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21044e;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21118j;
import com.bytedance.lottie.p1499c.C21016c;
import com.bytedance.lottie.p1499c.C21032d;
import com.bytedance.lottie.p1499c.p1502c.C21023d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lottie.e.r */
public final class C21069r {
    static {
        Covode.recordClassIndex(24685);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m39670a(JsonReader jsonReader, Map<String, C21016c> map) {
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
                    C21016c cVar = new C21016c(str, str2, str3, f);
                    map.put(cVar.f49825b, cVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m39667a(JsonReader jsonReader, C21088g gVar, C0498h<C21032d> hVar) {
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
                                        arrayList.add(C21057g.m39643a(jsonReader, gVar));
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
            C21032d dVar = new C21032d(arrayList, c, d2, d, str, str2);
            hVar.mo2186b(dVar.hashCode(), dVar);
        }
        jsonReader.endArray();
    }

    /* renamed from: a */
    public static void m39668a(JsonReader jsonReader, C21088g gVar, List<C21023d> list, C0489d<C21023d> dVar) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            C21023d a = C21068q.m39665a(jsonReader, gVar);
            if (a.f49867e == C21023d.EnumC21024a.Image) {
                i++;
            }
            list.add(a);
            dVar.mo2083b(a.f49866d, a);
            if (i > 4) {
                C21044e.m39620a("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static void m39669a(JsonReader jsonReader, C21088g gVar, Map<String, List<C21023d>> map, Map<String, C21118j> map2) {
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
                                C21023d a = C21068q.m39665a(jsonReader, gVar);
                                dVar.mo2083b(a.f49866d, a);
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
                C21118j jVar = new C21118j(i, i2, str, str2, str3, z);
                map2.put(jVar.f50071c, jVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }
}
