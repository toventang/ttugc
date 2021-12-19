package com.airbnb.lottie;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.JsonReader;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import com.airbnb.lottie.p099e.C2103d;
import com.airbnb.lottie.p099e.C2106g;
import com.airbnb.lottie.p099e.p102c.C2094d;
import com.airbnb.lottie.p103f.C2120c;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p105h.C2177r;
import com.airbnb.lottie.p106i.C2194g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.f */
public final class C2108f {

    /* renamed from: a */
    public static final Map<String, C2208m<C2044e>> f6364a = new ConcurrentHashMap();

    /* renamed from: b */
    private static boolean f6365b = false;

    /* renamed from: c */
    private static ComponentCallbacks2 f6366c = new ComponentCallbacks2() {
        /* class com.airbnb.lottie.C2108f.ComponentCallbacks2C21091 */

        static {
            Covode.recordClassIndex(2304);
        }

        public final void onConfigurationChanged(Configuration configuration) {
        }

        public final void onLowMemory() {
            C2108f.m6596a();
        }

        public final void onTrimMemory(int i) {
            if (i == 5 || i == 10 || i == 40) {
                C2108f.m6596a();
            }
        }
    };

    /* renamed from: a */
    public static void m6596a() {
        if (C2144d.C2145a.f6479a) {
            f6364a.clear();
            C2106g.f6360a.f6361b.mo2093a();
        }
    }

    /* renamed from: a */
    public static void m6597a(Context context) {
        if (!f6365b) {
            f6365b = true;
            if (C2144d.C2145a.f6487i && context != null) {
                m6598b(context).registerComponentCallbacks(f6366c);
            }
        }
    }

    static {
        Covode.recordClassIndex(2303);
    }

    /* renamed from: b */
    public static Context m6598b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    static String m6595a(int i) {
        return "rawRes_".concat(String.valueOf(i));
    }

    /* renamed from: a */
    public static C2208m<C2044e> m6591a(Context context, String str) {
        return C2120c.m6608a(context, str);
    }

    /* renamed from: a */
    public static C2207l<C2044e> m6590a(ZipInputStream zipInputStream, String str) {
        try {
            return m6601b(zipInputStream, str);
        } finally {
            C2194g.m6798a(zipInputStream);
        }
    }

    /* renamed from: a */
    private static C2152h m6587a(C2044e eVar, String str) {
        for (C2152h hVar : eVar.f6139c.values()) {
            if (hVar.f6512d.equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2207l<C2044e> m6588a(Context context, int i) {
        MethodCollector.m26663i(14125);
        try {
            C2207l<C2044e> a = m6589a(context.getResources().openRawResource(i), m6595a(i), true);
            MethodCollector.m26664o(14125);
            return a;
        } catch (Resources.NotFoundException e) {
            C2207l<C2044e> lVar = new C2207l<>(e);
            MethodCollector.m26664o(14125);
            return lVar;
        }
    }

    /* renamed from: b */
    public static C2207l<C2044e> m6599b(Context context, String str) {
        MethodCollector.m26663i(14102);
        try {
            String concat = "asset_".concat(String.valueOf(str));
            if (str.endsWith(".zip")) {
                C2207l<C2044e> a = m6590a(new ZipInputStream(context.getAssets().open(str)), concat);
                MethodCollector.m26664o(14102);
                return a;
            }
            C2207l<C2044e> a2 = m6589a(context.getAssets().open(str), concat, true);
            MethodCollector.m26664o(14102);
            return a2;
        } catch (IOException e) {
            C2207l<C2044e> lVar = new C2207l<>(e);
            MethodCollector.m26664o(14102);
            return lVar;
        }
    }

    /* renamed from: a */
    public static C2208m<C2044e> m6592a(final JsonReader jsonReader, final String str) {
        return m6594a(str, new Callable<C2207l<C2044e>>() {
            /* class com.airbnb.lottie.C2108f.CallableC21168 */

            static {
                Covode.recordClassIndex(2311);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C2207l<C2044e> call() {
                return C2108f.m6600b(jsonReader, str);
            }
        });
    }

    /* renamed from: a */
    public static C2208m<C2044e> m6593a(final InputStream inputStream, final String str) {
        return m6594a(str, new Callable<C2207l<C2044e>>() {
            /* class com.airbnb.lottie.C2108f.CallableC21146 */

            static {
                Covode.recordClassIndex(2309);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C2207l<C2044e> call() {
                return C2108f.m6589a(inputStream, str, true);
            }
        });
    }

    /* renamed from: b */
    public static C2207l<C2044e> m6600b(JsonReader jsonReader, String str) {
        try {
            float a = C2194g.m6792a();
            C0489d<C2094d> dVar = new C0489d<>();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            C0498h<C2103d> hVar = new C0498h<>();
            C2044e eVar = new C2044e();
            jsonReader.beginObject();
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1408207997:
                        if (nextName.equals("assets")) {
                            C2177r.m6749a(jsonReader, eVar, hashMap, hashMap2);
                            continue;
                        }
                        break;
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            C2177r.m6748a(jsonReader, eVar, arrayList, dVar);
                            continue;
                        }
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            i2 = jsonReader.nextInt();
                            continue;
                        }
                        break;
                    case 118:
                        if (nextName.equals("v")) {
                            String[] split = jsonReader.nextString().split("\\.");
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int parseInt3 = Integer.parseInt(split[2]);
                            if (parseInt >= 4) {
                                if (parseInt > 4) {
                                    continue;
                                } else if (parseInt2 >= 4) {
                                    if (parseInt2 <= 4) {
                                        if (parseInt3 >= 0) {
                                        }
                                    }
                                }
                            }
                            eVar.mo5943a("Lottie only supports bodymovin >= 4.4.0");
                        }
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            i = jsonReader.nextInt();
                            continue;
                        }
                        break;
                    case 3276:
                        if (nextName.equals("fr")) {
                            f3 = (float) jsonReader.nextDouble();
                            continue;
                        }
                        break;
                    case 3367:
                        if (nextName.equals("ip")) {
                            f = (float) jsonReader.nextDouble();
                            continue;
                        }
                        break;
                    case 3553:
                        if (nextName.equals("op")) {
                            f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                            continue;
                        }
                        break;
                    case 94623709:
                        if (nextName.equals("chars")) {
                            C2177r.m6747a(jsonReader, eVar, hVar);
                            continue;
                        }
                        break;
                    case 97615364:
                        if (nextName.equals("fonts")) {
                            C2177r.m6750a(jsonReader, hashMap3);
                            continue;
                        }
                        break;
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            eVar.f6144h = new Rect(0, 0, (int) (((float) i) * a), (int) (((float) i2) * a));
            eVar.f6145i = f;
            eVar.f6146j = f2;
            eVar.f6147k = f3;
            eVar.f6143g = arrayList;
            eVar.f6142f = dVar;
            eVar.f6138b = hashMap;
            eVar.f6139c = hashMap2;
            eVar.f6141e = hVar;
            eVar.f6140d = hashMap3;
            C2106g.f6360a.mo5984a(str, eVar);
            return new C2207l<>(eVar);
        } catch (Exception e) {
            return new C2207l<>(e);
        }
    }

    /* renamed from: a */
    static C2208m<C2044e> m6594a(final String str, Callable<C2207l<C2044e>> callable) {
        if (str != null) {
            final C2044e a = C2106g.f6360a.mo5983a(str);
            if (a != null) {
                return new C2208m<>(new Callable<C2207l<C2044e>>() {
                    /* class com.airbnb.lottie.C2108f.CallableC21179 */

                    static {
                        Covode.recordClassIndex(2312);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ C2207l<C2044e> call() {
                        return new C2207l(a);
                    }
                });
            }
            if (str != null) {
                Map<String, C2208m<C2044e>> map = f6364a;
                if (map.containsKey(str)) {
                    return map.get(str);
                }
            }
        }
        C2208m<C2044e> mVar = new C2208m<>(callable);
        if (str != null) {
            mVar.mo6130a((AbstractC2186i<C2044e>) new AbstractC2186i<C2044e>() {
                /* class com.airbnb.lottie.C2108f.C21102 */

                static {
                    Covode.recordClassIndex(2305);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.airbnb.lottie.AbstractC2186i
                /* renamed from: a */
                public final /* synthetic */ void mo5889a(C2044e eVar) {
                    C2108f.f6364a.remove(str);
                }
            });
            mVar.mo6136c(new AbstractC2186i<Throwable>() {
                /* class com.airbnb.lottie.C2108f.C21113 */

                static {
                    Covode.recordClassIndex(2306);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.airbnb.lottie.AbstractC2186i
                /* renamed from: a */
                public final /* synthetic */ void mo5889a(Throwable th) {
                    C2108f.f6364a.remove(str);
                }
            });
            f6364a.put(str, mVar);
        }
        return mVar;
    }

    /* renamed from: b */
    private static C2207l<C2044e> m6601b(ZipInputStream zipInputStream, String str) {
        MethodCollector.m26663i(14128);
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            V v = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        v = m6589a(zipInputStream, str, false).f6621a;
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (v == null) {
                C2207l<C2044e> lVar = new C2207l<>(new IllegalArgumentException("Unable to parse composition"));
                MethodCollector.m26664o(14128);
                return lVar;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C2152h a = m6587a((C2044e) v, (String) entry.getKey());
                if (a != null) {
                    if (C2144d.C2145a.f6479a) {
                        a.f6515g = C2194g.m6794a((Bitmap) entry.getValue(), a.f6509a, a.f6510b, a);
                    } else {
                        a.f6515g = (Bitmap) entry.getValue();
                    }
                }
            }
            for (Map.Entry<String, C2152h> entry2 : v.f6139c.entrySet()) {
                if (entry2.getValue().f6515g == null) {
                    C2207l<C2044e> lVar2 = new C2207l<>(new IllegalStateException("There is no image for " + entry2.getValue().f6512d));
                    MethodCollector.m26664o(14128);
                    return lVar2;
                }
            }
            C2106g.f6360a.mo5984a(str, v);
            C2207l<C2044e> lVar3 = new C2207l<>((C2044e) v);
            MethodCollector.m26664o(14128);
            return lVar3;
        } catch (IOException e) {
            C2207l<C2044e> lVar4 = new C2207l<>(e);
            MethodCollector.m26664o(14128);
            return lVar4;
        }
    }

    /* renamed from: a */
    public static C2207l<C2044e> m6589a(InputStream inputStream, String str, boolean z) {
        try {
            return m6600b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C2194g.m6798a(inputStream);
            }
        }
    }
}
