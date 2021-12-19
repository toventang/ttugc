package com.bytedance.p1007g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1007g.p1010c.C14855a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.g.e */
public final class C14859e {

    /* renamed from: a */
    Context f36293a;

    /* renamed from: b */
    Set<String> f36294b;

    /* renamed from: c */
    Set<String> f36295c;

    /* renamed from: d */
    String f36296d;

    /* renamed from: e */
    Map<String, String> f36297e;

    /* renamed from: f */
    Map<String, Map<String, String>> f36298f = new ConcurrentHashMap();

    /* renamed from: g */
    public List<String> f36299g = new CopyOnWriteArrayList();

    /* renamed from: h */
    private AbstractC14862g f36300h;

    /* renamed from: i */
    private Set<String> f36301i = new ConcurrentSkipListSet();

    /* renamed from: j */
    private Set<String> f36302j;

    /* renamed from: k */
    private String f36303k;

    static {
        Covode.recordClassIndex(16960);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23892a() {
        String a;
        if (!this.f36294b.isEmpty() || !this.f36295c.isEmpty() || !this.f36301i.isEmpty() || !this.f36302j.isEmpty()) {
            a = m27284a(this.f36294b, this.f36295c, this.f36301i, this.f36302j);
        } else {
            a = null;
        }
        if (!TextUtils.equals(a, this.f36303k)) {
            this.f36303k = a;
            AbstractC14862g gVar = this.f36300h;
            if (gVar != null) {
                gVar.mo23896a(a);
            }
        }
    }

    /* renamed from: a */
    private static String m27284a(Set<String>... setArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        int i = 0;
        do {
            Set<String> set = setArr[i];
            if (set != null) {
                for (String str : set) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(',');
                    }
                    sb.append(str);
                }
            }
            i++;
        } while (i < 4);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo23894a(String str, List<String> list) {
        Map<String, String> map = this.f36298f.get(str);
        for (String str2 : map.keySet()) {
            if (!list.contains(str2)) {
                try {
                    this.f36301i.remove(map.get(str2));
                    map.remove(str2);
                    C14866k.m27292a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                          (wrap: com.bytedance.g.a$6 : 0x003c: CONSTRUCTOR  (r0v6 com.bytedance.g.a$6) = 
                          (wrap: android.content.Context : 0x002e: IGET  (r2v0 android.content.Context) = (r6v0 'this' com.bytedance.g.e A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.e.a android.content.Context)
                          (wrap: java.lang.String : 0x0036: INVOKE  (r1v2 java.lang.String) = 
                          ("SP_CLIENT_EXPOSURE_CACHE$$$")
                          (wrap: java.lang.String : 0x0032: INVOKE  (r0v5 java.lang.String) = (r7v0 'str' java.lang.String) type: STATIC call: java.lang.String.valueOf(java.lang.Object):java.lang.String)
                         type: VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String)
                          (r3v1 'str2' java.lang.String)
                         call: com.bytedance.g.a.6.<init>(android.content.Context, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.bytedance.g.e.a(java.lang.String, java.util.List<java.lang.String>):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: CONSTRUCTOR  (r0v6 com.bytedance.g.a$6) = 
                          (wrap: android.content.Context : 0x002e: IGET  (r2v0 android.content.Context) = (r6v0 'this' com.bytedance.g.e A[IMMUTABLE_TYPE, THIS]) com.bytedance.g.e.a android.content.Context)
                          (wrap: java.lang.String : 0x0036: INVOKE  (r1v2 java.lang.String) = 
                          ("SP_CLIENT_EXPOSURE_CACHE$$$")
                          (wrap: java.lang.String : 0x0032: INVOKE  (r0v5 java.lang.String) = (r7v0 'str' java.lang.String) type: STATIC call: java.lang.String.valueOf(java.lang.Object):java.lang.String)
                         type: VIRTUAL call: java.lang.String.concat(java.lang.String):java.lang.String)
                          (r3v1 'str2' java.lang.String)
                         call: com.bytedance.g.a.6.<init>(android.content.Context, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.g.e.a(java.lang.String, java.util.List<java.lang.String>):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                        this = this;
                        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r6.f36298f
                        java.lang.Object r5 = r0.get(r7)
                        java.util.Map r5 = (java.util.Map) r5
                        java.util.Set r0 = r5.keySet()
                        java.util.Iterator r4 = r0.iterator()
                    L_0x0010:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x0043
                        java.lang.Object r3 = r4.next()
                        java.lang.String r3 = (java.lang.String) r3
                        boolean r0 = r8.contains(r3)
                        if (r0 != 0) goto L_0x0010
                        java.util.Set<java.lang.String> r1 = r6.f36301i     // Catch:{ all -> 0x0010 }
                        java.lang.Object r0 = r5.get(r3)     // Catch:{ all -> 0x0010 }
                        r1.remove(r0)     // Catch:{ all -> 0x0010 }
                        r5.remove(r3)     // Catch:{ all -> 0x0010 }
                        android.content.Context r2 = r6.f36293a     // Catch:{ all -> 0x0010 }
                        java.lang.String r1 = "SP_CLIENT_EXPOSURE_CACHE$$$"
                        java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0010 }
                        java.lang.String r1 = r1.concat(r0)     // Catch:{ all -> 0x0010 }
                        com.bytedance.g.a$6 r0 = new com.bytedance.g.a$6     // Catch:{ all -> 0x0010 }
                        r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x0010 }
                        com.bytedance.p1007g.C14866k.m27292a(r0)     // Catch:{ all -> 0x0010 }
                        goto L_0x0010
                    L_0x0043:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1007g.C14859e.mo23894a(java.lang.String, java.util.List):void");
                }

                C14859e(Context context, AbstractC14862g gVar, Set<String> set) {
                    this.f36293a = context;
                    this.f36300h = gVar;
                    this.f36302j = set;
                    this.f36296d = C14837a.m27260a(context, "SP_EXPERIMENT_CACHE").getString("ab_test_current_uid", "");
                    this.f36294b = C14837a.m27265b(context, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE");
                    this.f36295c = C14837a.m27265b(context, "SP_EXPERIMENT_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE_" + this.f36296d);
                    this.f36297e = C14837a.m27266c(context, "SP_EXPERIMENT_EXPOSURE_CACHE");
                    for (String str : C14837a.m27265b(context, "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE")) {
                        Map<String, String> c = C14837a.m27266c(context, "SP_CLIENT_EXPOSURE_CACHE$$$".concat(String.valueOf(str)));
                        this.f36298f.put(str, c);
                        this.f36301i.addAll(c.values());
                    }
                    mo23892a();
                    C14866k.f36305a.schedule(new Runnable() {
                        /* class com.bytedance.p1007g.C14859e.RunnableC148601 */

                        static {
                            Covode.recordClassIndex(16961);
                        }

                        public final void run() {
                            C14859e eVar = C14859e.this;
                            eVar.mo23894a("ab_test_noapt_module_name", eVar.f36299g);
                        }
                    }, 5000, TimeUnit.MILLISECONDS);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final <T> void mo23893a(String str, C14855a<T> aVar, String str2) {
                    if (aVar != null) {
                        String str3 = aVar.f36286d;
                        if (!this.f36298f.containsKey(str3)) {
                            this.f36298f.put(str3, new ConcurrentHashMap());
                            C14837a.m27263a(this.f36293a, "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", this.f36298f.keySet());
                        }
                        if (aVar.f36287e != null) {
                            mo23894a(str3, Arrays.asList(aVar.f36287e));
                        } else {
                            this.f36299g.add(str);
                        }
                        Map<String, String> map = this.f36298f.get(str3);
                        String str4 = map.get(str);
                        if (!TextUtils.equals(str4, str2)) {
                            if (!TextUtils.isEmpty(str4)) {
                                this.f36301i.remove(str4);
                                map.remove(str);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                this.f36301i.add(str2);
                                map.put(str, str2);
                            }
                            C14837a.m27262a(this.f36293a, "SP_CLIENT_EXPOSURE_CACHE$$$".concat(String.valueOf(str3)), str, str2);
                            mo23892a();
                        }
                    }
                }
            }
