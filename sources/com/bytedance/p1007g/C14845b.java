package com.bytedance.p1007g;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1007g.p1010c.C14855a;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.g.b */
public final class C14845b {

    /* renamed from: k */
    private static Map<String, String> f36240k = new ConcurrentHashMap();

    /* renamed from: a */
    JSONObject f36241a;

    /* renamed from: b */
    public C14859e f36242b;

    /* renamed from: c */
    final Map<String, Runnable> f36243c = new ConcurrentHashMap();

    /* renamed from: d */
    private final String f36244d;

    /* renamed from: e */
    private final Context f36245e;

    /* renamed from: f */
    private Map<String, Integer> f36246f;

    /* renamed from: g */
    private final Map<String, Object> f36247g = new ConcurrentHashMap();

    /* renamed from: h */
    private AbstractC14864i f36248h;

    /* renamed from: i */
    private AbstractC14863h f36249i;

    /* renamed from: j */
    private Future f36250j;

    static {
        Covode.recordClassIndex(16946);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23883b() {
        MethodCollector.m26663i(5768);
        Future future = this.f36250j;
        if (future != null) {
            future.cancel(true);
        }
        this.f36250j = C14866k.m27293a(new Runnable() {
            /* class com.bytedance.p1007g.C14845b.RunnableC148472 */

            static {
                Covode.recordClassIndex(16948);
            }

            public final void run() {
                C14845b.this.mo23882a();
            }
        }, 0);
        MethodCollector.m26664o(5768);
    }

    /* renamed from: a */
    public final void mo23882a() {
        try {
            StringBuilder sb = new StringBuilder(this.f36244d);
            if (!f36240k.isEmpty()) {
                if (this.f36244d.indexOf(63) < 0) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                boolean z = true;
                for (Map.Entry<String, String> entry : f36240k.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(entry.getKey(), "UTF-8")).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                }
            }
            JSONObject jSONObject = new JSONObject(this.f36249i.mo23897a(sb.toString()));
            if (jSONObject.has("code") && jSONObject.has("data") && jSONObject.optInt("code", -1) == 0) {
                m27269a(jSONObject.getJSONObject("data"));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m27269a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                    long j = jSONObject3.getLong("et");
                    if (j > 0) {
                        hashMap2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.f36247g.clear();
        this.f36241a = jSONObject2;
        C14866k.m27292a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: INVOKE  
              (wrap: com.bytedance.g.a$1 : 0x005d: CONSTRUCTOR  (r0v2 com.bytedance.g.a$1) = 
              (wrap: android.content.Context : 0x0057: IGET  (r1v0 android.content.Context) = (r10v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
              ("SP_EXPERIMENT_CACHE")
              ("SP_EXPERIMENT_CACHE")
              (r7v0 'jSONObject2' org.json.JSONObject)
             call: com.bytedance.g.a.1.<init>(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR)
             type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.bytedance.g.b.a(org.json.JSONObject):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: CONSTRUCTOR  (r0v2 com.bytedance.g.a$1) = 
              (wrap: android.content.Context : 0x0057: IGET  (r1v0 android.content.Context) = (r10v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
              ("SP_EXPERIMENT_CACHE")
              ("SP_EXPERIMENT_CACHE")
              (r7v0 'jSONObject2' org.json.JSONObject)
             call: com.bytedance.g.a.1.<init>(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR in method: com.bytedance.g.b.a(org.json.JSONObject):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1007g.C14845b.m27269a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    private <T> T m27268a(String str, Type type) {
        try {
            if (this.f36247g.containsKey(str) && this.f36247g.get(str).getClass() == type) {
                return (T) this.f36247g.get(str);
            }
            T t = (T) this.f36248h.mo23898a(this.f36241a.optString(str, ""), type);
            if (t == null) {
                this.f36247g.remove(str);
                return null;
            }
            this.f36247g.put(str, t);
            return t;
        } catch (Exception unused) {
            this.f36247g.remove(str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo23880a(final String str, final C14855a<T> aVar, boolean z) {
        int nextInt;
        MethodCollector.m26663i(5773);
        if (aVar == null || TextUtils.isEmpty(aVar.f36283a) || aVar.f36285c == null || aVar.f36285c.length == 0) {
            MethodCollector.m26664o(5773);
            return null;
        }
        String str2 = aVar.f36283a;
        synchronized (this) {
            try {
                if (this.f36246f.containsKey(str2)) {
                    nextInt = this.f36246f.get(str2).intValue();
                } else {
                    nextInt = new Random().nextInt(1000);
                    this.f36246f.put(str2, Integer.valueOf(nextInt));
                    C14866k.m27292a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0057: INVOKE  
                          (wrap: com.bytedance.g.a$2 : 0x0054: CONSTRUCTOR  (r0v12 com.bytedance.g.a$2) = 
                          (wrap: android.content.Context : 0x004e: IGET  (r2v0 android.content.Context) = (r12v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
                          ("CLIENT_EXPERIMENT_CACHE_TAG")
                          (r3v0 'str2' java.lang.String)
                          (r8v0 'nextInt' int)
                         call: com.bytedance.g.a.2.<init>(android.content.Context, java.lang.String, java.lang.String, int):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.bytedance.g.b.a(java.lang.String, com.bytedance.g.c.a<T>, boolean):T, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: CONSTRUCTOR  (r0v12 com.bytedance.g.a$2) = 
                          (wrap: android.content.Context : 0x004e: IGET  (r2v0 android.content.Context) = (r12v0 'this' com.bytedance.g.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.b.e android.content.Context)
                          ("CLIENT_EXPERIMENT_CACHE_TAG")
                          (r3v0 'str2' java.lang.String)
                          (r8v0 'nextInt' int)
                         call: com.bytedance.g.a.2.<init>(android.content.Context, java.lang.String, java.lang.String, int):void type: CONSTRUCTOR in method: com.bytedance.g.b.a(java.lang.String, com.bytedance.g.c.a<T>, boolean):T, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 185
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1007g.C14845b.mo23880a(java.lang.String, com.bytedance.g.c.a, boolean):java.lang.Object");
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final <T> T mo23881a(String str, Type type, boolean z) {
                    T t = null;
                    if (type == Boolean.class || type == Boolean.TYPE) {
                        if (this.f36241a.has(str)) {
                            t = (T) Boolean.valueOf(this.f36241a.optBoolean(str));
                        }
                    } else if (type == Integer.class || type == Short.class || type == Integer.TYPE || type == Short.TYPE) {
                        if (this.f36241a.has(str)) {
                            t = (T) Integer.valueOf(this.f36241a.optInt(str));
                        }
                    } else if (type == Float.class || type == Float.TYPE) {
                        if (this.f36241a.has(str)) {
                            t = (T) Float.valueOf((float) this.f36241a.optDouble(str));
                        }
                    } else if (type == Long.class || type == Long.TYPE) {
                        if (this.f36241a.has(str)) {
                            t = (T) Long.valueOf(this.f36241a.optLong(str));
                        }
                    } else if (type != Double.class && type != Double.TYPE) {
                        t = type == String.class ? (T) this.f36241a.optString(str, null) : (T) m27268a(str, type);
                    } else if (this.f36241a.has(str)) {
                        t = (T) Double.valueOf(this.f36241a.optDouble(str));
                    }
                    RunnableC148483 r2 = new Runnable(str, false) {
                        /* class com.bytedance.p1007g.C14845b.RunnableC148483 */

                        /* renamed from: a */
                        final /* synthetic */ String f36253a;

                        /* renamed from: b */
                        final /* synthetic */ boolean f36254b = false;

                        static {
                            Covode.recordClassIndex(16949);
                        }

                        public final void run() {
                            C14859e eVar = C14845b.this.f36242b;
                            String str = this.f36253a;
                            boolean z = this.f36254b;
                            if (!eVar.f36297e.containsKey(str)) {
                                return;
                            }
                            if (!z || !TextUtils.isEmpty(eVar.f36296d)) {
                                String str2 = eVar.f36297e.get(str);
                                if (!TextUtils.isEmpty(str2) && !eVar.f36294b.contains(str2) && !eVar.f36295c.contains(str2)) {
                                    if (z) {
                                        eVar.f36295c.add(str2);
                                        C14837a.m27263a(eVar.f36293a, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE_" + eVar.f36296d, eVar.f36294b);
                                    } else {
                                        eVar.f36294b.add(str2);
                                        C14837a.m27263a(eVar.f36293a, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", eVar.f36294b);
                                    }
                                    eVar.mo23892a();
                                }
                            }
                        }

                        {
                            this.f36253a = r3;
                        }
                    };
                    if (z) {
                        r2.run();
                    } else {
                        this.f36243c.put(str, r2);
                    }
                    return t;
                }

                C14845b(Application application, String str, boolean z, AbstractC14864i iVar, AbstractC14862g gVar, AbstractC14863h hVar, Map<String, String> map, Set<String> set) {
                    this.f36244d = str;
                    f36240k = map;
                    this.f36245e = application;
                    this.f36241a = C14837a.m27261a(application, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_CACHE");
                    this.f36246f = C14837a.m27264b(application, "CLIENT_EXPERIMENT_CACHE_TAG");
                    this.f36242b = new C14859e(application, gVar, set);
                    this.f36248h = iVar;
                    this.f36249i = hVar;
                    if (z) {
                        this.f36250j = C14866k.m27293a(new Runnable() {
                            /* class com.bytedance.p1007g.C14845b.RunnableC148461 */

                            static {
                                Covode.recordClassIndex(16947);
                            }

                            public final void run() {
                                C14845b.this.mo23882a();
                            }
                        }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                }
            }
