package com.bytedance.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.JsonReader;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.p1499c.C21032d;
import com.bytedance.lottie.p1499c.C21035g;
import com.bytedance.lottie.p1499c.p1502c.C21023d;
import com.bytedance.lottie.p1504e.C21069r;
import com.bytedance.lottie.p1505f.C21087h;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.bytedance.lottie.h */
public final class C21094h {

    /* renamed from: a */
    public static final Map<String, C21123o<C21088g>> f50009a = new HashMap();

    /* renamed from: a */
    static String m39741a(int i) {
        return "rawRes_".concat(String.valueOf(i));
    }

    /* renamed from: a */
    private static boolean m39745a(C21088g gVar) {
        if (gVar == null) {
            return false;
        }
        for (Map.Entry<String, C21118j> entry : gVar.f49971c.entrySet()) {
            if (entry.getValue().f50075g == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static void m39743a(final C21088g gVar, AbstractC21037d dVar, final AbstractC20932a aVar) {
        if (gVar.f49971c == null || gVar.f49971c.size() == 0) {
            gVar.f49980l = true;
            aVar.mo30313a(gVar);
        } else if (gVar.f49971c != null) {
            final AtomicInteger atomicInteger = new AtomicInteger(gVar.f49971c.size());
            for (Map.Entry<String, C21118j> entry : gVar.f49971c.entrySet()) {
                if (dVar != null) {
                    final C21118j value = entry.getValue();
                    if ("%s".equals(value.f50072d)) {
                        gVar.f49981m = true;
                        if (atomicInteger.decrementAndGet() == 0) {
                            gVar.f49980l = true;
                            aVar.mo30313a(gVar);
                        }
                    } else {
                        dVar.mo30271a(value, new AbstractC21078f<Bitmap>() {
                            /* class com.bytedance.lottie.C21094h.C211004 */

                            static {
                                Covode.recordClassIndex(24716);
                            }

                            @Override // com.bytedance.lottie.AbstractC21078f
                            /* renamed from: a */
                            public final void mo30325a() {
                                gVar.f49980l = false;
                                aVar.mo30314a("");
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.lottie.AbstractC21078f
                            /* renamed from: a */
                            public final /* synthetic */ void mo30326a(Bitmap bitmap) {
                                value.f50075g = bitmap;
                                if (atomicInteger.decrementAndGet() == 0) {
                                    gVar.f49980l = true;
                                    aVar.mo30313a(gVar);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m39744a(final String str, AbstractC21037d dVar, AbstractC20932a aVar) {
        C21088g a = C21035g.f49916a.mo34510a(null);
        if (m39745a(a)) {
            aVar.mo30313a(a);
        } else {
            C21123o.f50102a.execute(new AbstractRunnableC21126p(dVar, aVar) {
                /* class com.bytedance.lottie.C21094h.C2109711 */

                /* renamed from: b */
                final /* synthetic */ String f50015b = null;

                static {
                    Covode.recordClassIndex(24713);
                }

                public final void run() {
                    MethodCollector.m26663i(9753);
                    String str = str;
                    String str2 = this.f50015b;
                    WeakReference<AbstractC21037d> weakReference = this.f50112c;
                    WeakReference<AbstractC20932a> weakReference2 = this.f50113d;
                    if (weakReference.get() == null || weakReference2.get() == null) {
                        MethodCollector.m26664o(9753);
                        return;
                    }
                    AbstractC21037d dVar = weakReference.get();
                    AbstractC20932a aVar = weakReference2.get();
                    try {
                        V v = C21094h.m39737a((InputStream) new FileInputStream(new File(str)), str2, true).f50100a;
                        if (v == null) {
                            aVar.mo30314a("fromJsonFileAsyncInternal Unable to parse composition and composition is null");
                            MethodCollector.m26664o(9753);
                            return;
                        }
                        C21094h.m39743a((C21088g) v, dVar, (AbstractC20932a) new AbstractC20932a(str2, aVar) {
                            /* class com.bytedance.lottie.C21094h.C210993 */

                            /* renamed from: a */
                            final /* synthetic */ String f50018a;

                            /* renamed from: b */
                            final /* synthetic */ AbstractC20932a f50019b;

                            static {
                                Covode.recordClassIndex(24715);
                            }

                            @Override // com.bytedance.lottie.AbstractC20932a
                            /* renamed from: a */
                            public final void mo30314a(String str) {
                                this.f50019b.mo30314a(str);
                            }

                            @Override // com.bytedance.lottie.AbstractC20932a
                            /* renamed from: a */
                            public final void mo30313a(C21088g gVar) {
                                C21035g.f49916a.mo34511a(this.f50018a, gVar);
                                this.f50019b.mo30313a(gVar);
                            }

                            {
                                this.f50018a = r1;
                                this.f50019b = r2;
                            }
                        });
                        MethodCollector.m26664o(9753);
                    } catch (Exception e) {
                        aVar.mo30314a("fromJsonFileAsyncInternal Unable to parse composition. Error msg is " + e.toString());
                        MethodCollector.m26664o(9753);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m39742a(Context context, final String str, final String str2, AbstractC21037d dVar, AbstractC20932a aVar) {
        C21088g a = C21035g.f49916a.mo34510a(str2);
        if (m39745a(a)) {
            aVar.mo30313a(a);
        } else {
            C21123o.f50102a.execute(new AbstractRunnableC21126p(dVar, aVar, context) {
                /* class com.bytedance.lottie.C21094h.C210982 */

                static {
                    Covode.recordClassIndex(24714);
                }

                public final void run() {
                    WeakReference<Context> weakReference = this.f50114e;
                    String str = str;
                    String str2 = str2;
                    WeakReference<AbstractC21037d> weakReference2 = this.f50112c;
                    WeakReference<AbstractC20932a> weakReference3 = this.f50113d;
                    if (weakReference.get() != null && weakReference2.get() != null && weakReference3.get() != null) {
                        Context context = weakReference.get();
                        AbstractC20932a aVar = weakReference3.get();
                        AbstractC21037d dVar = weakReference2.get();
                        try {
                            V v = C21094h.m39735a(context, str).f50100a;
                            if (v == null) {
                                aVar.mo30314a("fromJsonAssetSyncInternal Unable to parse composition and composition is null");
                            } else {
                                C21094h.m39743a((C21088g) v, dVar, (AbstractC20932a) new AbstractC20932a(str2, aVar) {
                                    /* class com.bytedance.lottie.C21094h.C211015 */

                                    /* renamed from: a */
                                    final /* synthetic */ String f50024a;

                                    /* renamed from: b */
                                    final /* synthetic */ AbstractC20932a f50025b;

                                    static {
                                        Covode.recordClassIndex(24717);
                                    }

                                    @Override // com.bytedance.lottie.AbstractC20932a
                                    /* renamed from: a */
                                    public final void mo30314a(String str) {
                                        this.f50025b.mo30314a(str);
                                    }

                                    @Override // com.bytedance.lottie.AbstractC20932a
                                    /* renamed from: a */
                                    public final void mo30313a(C21088g gVar) {
                                        C21035g.f49916a.mo34511a(this.f50024a, gVar);
                                        this.f50025b.mo30313a(gVar);
                                    }

                                    {
                                        this.f50024a = r1;
                                        this.f50025b = r2;
                                    }
                                });
                            }
                        } catch (Exception e) {
                            aVar.mo30314a("load composition failed from asset. " + e.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static C21123o<C21088g> m39740a(final String str, Callable<C21122n<C21088g>> callable) {
        final C21088g a = C21035g.f49916a.mo34510a(str);
        if (a != null) {
            return new C21123o<>(new Callable<C21122n<C21088g>>() {
                /* class com.bytedance.lottie.C21094h.CallableC211026 */

                static {
                    Covode.recordClassIndex(24718);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C21122n<C21088g> call() {
                    return new C21122n(a);
                }
            });
        }
        Map<String, C21123o<C21088g>> map = f50009a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        C21123o<C21088g> oVar = new C21123o<>(callable);
        oVar.mo34617a(new AbstractC21119k<C21088g>() {
            /* class com.bytedance.lottie.C21094h.C211037 */

            static {
                Covode.recordClassIndex(24719);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.lottie.AbstractC21119k
            /* renamed from: a */
            public final /* synthetic */ void mo34447a(C21088g gVar) {
                C21088g gVar2 = gVar;
                if (str != null) {
                    C21035g.f49916a.mo34511a(str, gVar2);
                }
                C21094h.f50009a.remove(str);
            }
        });
        oVar.mo34622c(new AbstractC21119k<Throwable>() {
            /* class com.bytedance.lottie.C21094h.C211048 */

            static {
                Covode.recordClassIndex(24720);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.lottie.AbstractC21119k
            /* renamed from: a */
            public final /* synthetic */ void mo34447a(Throwable th) {
                C21094h.f50009a.remove(str);
            }
        });
        map.put(str, oVar);
        return oVar;
    }

    static {
        Covode.recordClassIndex(24710);
    }

    /* renamed from: a */
    public static Context m39732a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static C21118j m39733a(C21088g gVar, String str) {
        for (C21118j jVar : gVar.f49971c.values()) {
            if (jVar.f50072d.equals(str)) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C21122n<C21088g> m39734a(Context context, int i) {
        MethodCollector.m26663i(10840);
        try {
            C21122n<C21088g> a = m39737a(context.getResources().openRawResource(i), m39741a(i), true);
            MethodCollector.m26664o(10840);
            return a;
        } catch (Resources.NotFoundException e) {
            C21122n<C21088g> nVar = new C21122n<>(e);
            MethodCollector.m26664o(10840);
            return nVar;
        }
    }

    /* renamed from: a */
    public static C21122n<C21088g> m39735a(Context context, String str) {
        MethodCollector.m26663i(10700);
        try {
            String concat = "asset_".concat(String.valueOf(str));
            if (str.endsWith(".zip")) {
                C21122n<C21088g> a = m39738a(new ZipInputStream(context.getAssets().open(str)), concat);
                MethodCollector.m26664o(10700);
                return a;
            }
            C21122n<C21088g> a2 = m39737a(context.getAssets().open(str), concat, true);
            MethodCollector.m26664o(10700);
            return a2;
        } catch (IOException e) {
            C21122n<C21088g> nVar = new C21122n<>(e);
            MethodCollector.m26664o(10700);
            return nVar;
        }
    }

    /* renamed from: b */
    private static C21122n<C21088g> m39746b(ZipInputStream zipInputStream, String str) {
        MethodCollector.m26663i(10987);
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            V v = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        v = m39737a((InputStream) zipInputStream, str, false).f50100a;
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
                C21122n<C21088g> nVar = new C21122n<>(new IllegalArgumentException("Unable to parse composition"));
                MethodCollector.m26664o(10987);
                return nVar;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C21118j a = m39733a((C21088g) v, (String) entry.getKey());
                if (a != null) {
                    a.f50075g = (Bitmap) entry.getValue();
                }
            }
            for (Map.Entry<String, C21118j> entry2 : v.f49971c.entrySet()) {
                if (entry2.getValue().f50075g == null) {
                    C21122n<C21088g> nVar2 = new C21122n<>(new IllegalStateException("There is no image for " + entry2.getValue().f50072d));
                    MethodCollector.m26664o(10987);
                    return nVar2;
                }
            }
            C21035g.f49916a.mo34511a(str, v);
            C21122n<C21088g> nVar3 = new C21122n<>((C21088g) v);
            MethodCollector.m26664o(10987);
            return nVar3;
        } catch (IOException e) {
            C21122n<C21088g> nVar4 = new C21122n<>(e);
            MethodCollector.m26664o(10987);
            return nVar4;
        }
    }

    /* renamed from: a */
    public static C21122n<C21088g> m39738a(ZipInputStream zipInputStream, String str) {
        try {
            return m39746b(zipInputStream, str);
        } finally {
            C21087h.m39719a(zipInputStream);
        }
    }

    /* renamed from: a */
    public static C21123o<C21088g> m39739a(final JsonReader jsonReader, String str) {
        return m39740a((String) null, new Callable<C21122n<C21088g>>(null) {
            /* class com.bytedance.lottie.C21094h.CallableC2109610 */

            static {
                Covode.recordClassIndex(24712);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C21122n<C21088g> call() {
                return C21094h.m39736a(jsonReader, null, true);
            }
        });
    }

    /* renamed from: a */
    public static C21122n<C21088g> m39737a(InputStream inputStream, String str, boolean z) {
        try {
            return m39736a(new JsonReader(new InputStreamReader(inputStream)), str, false);
        } finally {
            if (z) {
                C21087h.m39719a(inputStream);
            }
        }
    }

    /* renamed from: a */
    public static C21122n<C21088g> m39736a(JsonReader jsonReader, String str, boolean z) {
        try {
            float a = C21087h.m39715a();
            C0489d<C21023d> dVar = new C0489d<>();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            C0498h<C21032d> hVar = new C0498h<>();
            C21088g gVar = new C21088g();
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
                            C21069r.m39669a(jsonReader, gVar, hashMap, hashMap2);
                            continue;
                        }
                        break;
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            C21069r.m39668a(jsonReader, gVar, arrayList, dVar);
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
                            gVar.mo34562a("Lottie only supports bodymovin >= 4.4.0");
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
                            C21069r.m39667a(jsonReader, gVar, hVar);
                            continue;
                        }
                        break;
                    case 97615364:
                        if (nextName.equals("fonts")) {
                            C21069r.m39670a(jsonReader, hashMap3);
                            continue;
                        }
                        break;
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            gVar.f49976h = new Rect(0, 0, (int) (((float) i) * a), (int) (((float) i2) * a));
            gVar.f49977i = f;
            gVar.f49978j = f2;
            gVar.f49979k = f3;
            gVar.f49975g = arrayList;
            gVar.f49974f = dVar;
            gVar.f49970b = hashMap;
            gVar.f49971c = hashMap2;
            gVar.f49973e = hVar;
            gVar.f49972d = hashMap3;
            C21035g.f49916a.mo34511a(str, gVar);
            C21122n<C21088g> nVar = new C21122n<>(gVar);
            if (z) {
                C21087h.m39719a(jsonReader);
            }
            return nVar;
        } catch (Throwable th) {
            if (z) {
                C21087h.m39719a(jsonReader);
            }
            throw th;
        }
    }
}
