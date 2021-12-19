package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24728c;
import com.facebook.internal.C24759o;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.C24781v;
import com.facebook.internal.C24786y;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.internal.p1899b.p1900a.C24721f;
import com.facebook.p1814a.C23973h;
import com.facebook.p1814a.C23979i;
import com.facebook.p1814a.p1820e.C23922a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58024g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.facebook.m */
public final class C24872m {

    /* renamed from: a */
    public static volatile String f59041a;

    /* renamed from: b */
    public static volatile String f59042b;

    /* renamed from: c */
    public static volatile String f59043c;

    /* renamed from: d */
    public static volatile String f59044d = "facebook.com";

    /* renamed from: e */
    public static volatile boolean f59045e = false;

    /* renamed from: f */
    static boolean f59046f = false;

    /* renamed from: g */
    public static Context f59047g;

    /* renamed from: h */
    public static int f59048h = 64206;

    /* renamed from: i */
    public static boolean f59049i = false;

    /* renamed from: j */
    public static boolean f59050j = false;

    /* renamed from: k */
    static AbstractC24882a f59051k = new AbstractC24882a() {
        /* class com.facebook.C24872m.C248731 */

        static {
            Covode.recordClassIndex(29062);
        }

        @Override // com.facebook.C24872m.AbstractC24882a
        /* renamed from: a */
        public final GraphRequest mo40771a(String str, JSONObject jSONObject) {
            return GraphRequest.m45067a((AccessToken) null, str, jSONObject, (GraphRequest.AbstractC23858b) null);
        }
    };

    /* renamed from: l */
    private static final String f59052l = C24872m.class.getCanonicalName();

    /* renamed from: m */
    private static final HashSet<EnumC25029u> f59053m = new HashSet<>(Arrays.asList(EnumC25029u.DEVELOPER_ERRORS));

    /* renamed from: n */
    private static Executor f59054n;

    /* renamed from: o */
    private static volatile Boolean f59055o;

    /* renamed from: p */
    private static AtomicLong f59056p = new AtomicLong(65536);

    /* renamed from: q */
    private static C24781v<File> f59057q;

    /* renamed from: r */
    private static final Object f59058r = new Object();

    /* renamed from: s */
    private static String f59059s = "v9.0";

    /* renamed from: t */
    private static Boolean f59060t = false;

    /* renamed from: u */
    private static Boolean f59061u = false;

    /* renamed from: com.facebook.m$a */
    public interface AbstractC24882a {
        static {
            Covode.recordClassIndex(29071);
        }

        /* renamed from: a */
        GraphRequest mo40771a(String str, JSONObject jSONObject);
    }

    /* renamed from: com.facebook.m$b */
    public interface AbstractC24883b {
        static {
            Covode.recordClassIndex(29072);
        }
    }

    /* renamed from: e */
    public static String m47693e() {
        C1764a.m5928a("getGraphApiVersion: %s", new Object[]{f59059s});
        return f59059s;
    }

    /* renamed from: f */
    public static long m47695f() {
        C24699ae.m47299a();
        return f59056p.get();
    }

    /* renamed from: b */
    public static synchronized boolean m47688b() {
        boolean booleanValue;
        synchronized (C24872m.class) {
            MethodCollector.m26663i(6746);
            booleanValue = f59061u.booleanValue();
            MethodCollector.m26664o(6746);
        }
        return booleanValue;
    }

    /* renamed from: c */
    public static Executor m47689c() {
        MethodCollector.m26663i(7029);
        synchronized (f59058r) {
            try {
                if (f59054n == null) {
                    f59054n = AsyncTask.THREAD_POOL_EXECUTOR;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(7029);
                throw th;
            }
        }
        Executor executor = f59054n;
        MethodCollector.m26664o(7029);
        return executor;
    }

    /* renamed from: a */
    public static synchronized boolean m47685a() {
        boolean booleanValue;
        synchronized (C24872m.class) {
            MethodCollector.m26663i(6603);
            booleanValue = f59060t.booleanValue();
            MethodCollector.m26664o(6603);
        }
        return booleanValue;
    }

    /* renamed from: d */
    public static String m47691d() {
        String str;
        AccessToken accessToken = C24012b.m45437a().f56861b;
        if (accessToken == null || (str = accessToken.f56410k) == null || !str.equals("gaming")) {
            return f59044d;
        }
        return f59044d.replace("facebook.com", "fb.gg");
    }

    static {
        Covode.recordClassIndex(29061);
    }

    /* renamed from: b */
    public static Context m47687b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static synchronized void m47684a(Context context) {
        synchronized (C24872m.class) {
            MethodCollector.m26663i(6306);
            m47692d(context);
            MethodCollector.m26664o(6306);
        }
    }

    /* renamed from: c */
    public static boolean m47690c(Context context) {
        C24699ae.m47299a();
        return C34822d.m71158a(context, "com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: a */
    public static boolean m47686a(EnumC25029u uVar) {
        boolean z;
        MethodCollector.m26663i(6888);
        HashSet<EnumC25029u> hashSet = f59053m;
        synchronized (hashSet) {
            try {
                if (!f59045e || !hashSet.contains(uVar)) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.m26664o(6888);
            }
        }
        return z;
    }

    /* renamed from: d */
    private static synchronized void m47692d(Context context) {
        synchronized (C24872m.class) {
            MethodCollector.m26663i(6308);
            if (C58024g.f132237b.compareAndSet(false, true)) {
                Executor executor = C58024g.f132236a;
                C24699ae.m47301a(executor, "executor");
                synchronized (f59058r) {
                    try {
                        f59054n = executor;
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6308);
                        throw th;
                    }
                }
            }
            m47694e(context);
            MethodCollector.m26664o(6308);
        }
    }

    /* renamed from: e */
    private static synchronized void m47694e(Context context) {
        ApplicationInfo applicationInfo;
        synchronized (C24872m.class) {
            MethodCollector.m26663i(6463);
            if (f59060t.booleanValue()) {
                MethodCollector.m26664o(6463);
                return;
            }
            C24699ae.m47301a((Object) context, "applicationContext");
            C24699ae.m47306b(context, false);
            C24699ae.m47300a(context, false);
            f59047g = m47687b(context);
            C23973h.m45327a(context);
            Context context2 = f59047g;
            if (context2 != null) {
                try {
                    PackageManager packageManager = context2.getPackageManager();
                    String packageName = context2.getPackageName();
                    if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                        if (C58014b.f132218a == null) {
                            C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                        }
                        applicationInfo = C58014b.f132218a;
                    } else {
                        applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                    }
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        if (f59041a == null) {
                            Object a = m47683a(applicationInfo.metaData, "com.facebook.sdk.ApplicationId");
                            if (a instanceof String) {
                                String str = (String) a;
                                if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                    f59041a = str.substring(2);
                                } else {
                                    f59041a = str;
                                }
                            } else if (a instanceof Number) {
                                C24798j jVar = new C24798j("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                                MethodCollector.m26664o(6463);
                                throw jVar;
                            }
                        }
                        if (f59042b == null) {
                            f59042b = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                        }
                        if (f59043c == null) {
                            f59043c = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                        }
                        if (f59048h == 64206) {
                            f59048h = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                        }
                        if (f59055o == null) {
                            f59055o = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (!C24693ad.m47261a(f59041a)) {
                f59060t = true;
                if (C24006ab.m45405a()) {
                    f59061u = true;
                }
                if ((f59047g instanceof Application) && C24006ab.m45407b()) {
                    C23922a.m45237a((Application) f59047g, f59041a);
                }
                C24770r.m47429a();
                C24786y.m47481b();
                C24728c.m47354a(f59047g);
                f59057q = new C24781v<>(new Callable<File>() {
                    /* class com.facebook.C24872m.CallableC248742 */

                    static {
                        Covode.recordClassIndex(29063);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ File call() {
                        Context context = C24872m.f59047g;
                        if (C58016d.f132221b == null || !C58016d.f132224e) {
                            C58016d.f132221b = context.getCacheDir();
                        }
                        return C58016d.f132221b;
                    }
                });
                C24759o.m47407a(C24759o.EnumC24763b.Instrument, new C24759o.AbstractC24762a() {
                    /* class com.facebook.C24872m.C248753 */

                    static {
                        Covode.recordClassIndex(29064);
                    }

                    @Override // com.facebook.internal.C24759o.AbstractC24762a
                    /* renamed from: a */
                    public final void mo39416a(boolean z) {
                        if (z && C24006ab.m45407b()) {
                            C24759o.m47407a(C24759o.EnumC24763b.CrashReport, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: INVOKE  
                                  (wrap: com.facebook.internal.o$b : 0x0008: SGET  (r1v0 com.facebook.internal.o$b) =  com.facebook.internal.o.b.CrashReport com.facebook.internal.o$b)
                                  (wrap: com.facebook.internal.a.c$1 : 0x000c: CONSTRUCTOR  (r0v1 com.facebook.internal.a.c$1) =  call: com.facebook.internal.a.c.1.<init>():void type: CONSTRUCTOR)
                                 type: STATIC call: com.facebook.internal.o.a(com.facebook.internal.o$b, com.facebook.internal.o$a):void in method: com.facebook.m.3.a(boolean):void, file: classes6.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r0v1 com.facebook.internal.a.c$1) =  call: com.facebook.internal.a.c.1.<init>():void type: CONSTRUCTOR in method: com.facebook.m.3.a(boolean):void, file: classes6.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 21 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.internal.a.c, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 27 more
                                */
                            /*
                                this = this;
                                if (r3 == 0) goto L_0x001c
                                boolean r0 = com.facebook.C24006ab.m45407b()
                                if (r0 == 0) goto L_0x001c
                                com.facebook.internal.o$b r1 = com.facebook.internal.C24759o.EnumC24763b.CrashReport
                                com.facebook.internal.a.c$1 r0 = new com.facebook.internal.a.c$1
                                r0.<init>()
                                com.facebook.internal.C24759o.m47407a(r1, r0)
                                com.facebook.internal.o$b r1 = com.facebook.internal.C24759o.EnumC24763b.ErrorReport
                                com.facebook.internal.a.c$2 r0 = new com.facebook.internal.a.c$2
                                r0.<init>()
                                com.facebook.internal.C24759o.m47407a(r1, r0)
                            L_0x001c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C24872m.C248753.mo39416a(boolean):void");
                        }
                    });
                    C24759o.m47407a(C24759o.EnumC24763b.AppEvents, new C24759o.AbstractC24762a() {
                        /* class com.facebook.C24872m.C248764 */

                        static {
                            Covode.recordClassIndex(29065);
                        }

                        @Override // com.facebook.internal.C24759o.AbstractC24762a
                        /* renamed from: a */
                        public final void mo39416a(boolean z) {
                            if (z && !C24677a.m47209a(C23979i.class)) {
                                try {
                                    C24770r.f58779d.add(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: INVOKE  
                                          (wrap: java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$b> : 0x000f: SGET  (r0v3 java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$b>) =  com.facebook.internal.r.d java.util.concurrent.ConcurrentLinkedQueue)
                                          (wrap: com.facebook.a.i$1 : 0x000c: CONSTRUCTOR  (r1v1 com.facebook.a.i$1) =  call: com.facebook.a.i.1.<init>():void type: CONSTRUCTOR)
                                         type: VIRTUAL call: java.util.concurrent.ConcurrentLinkedQueue.add(java.lang.Object):boolean in method: com.facebook.m.4.a(boolean):void, file: classes6.dex
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
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r1v1 com.facebook.a.i$1) =  call: com.facebook.a.i.1.<init>():void type: CONSTRUCTOR in method: com.facebook.m.4.a(boolean):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 24 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.i, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 30 more
                                        */
                                    /*
                                        this = this;
                                        if (r3 == 0) goto L_0x001e
                                        java.lang.Class<com.facebook.a.i> r0 = com.facebook.p1814a.C23979i.class
                                        boolean r0 = com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r0)
                                        if (r0 != 0) goto L_0x001e
                                        com.facebook.a.i$1 r1 = new com.facebook.a.i$1     // Catch:{ all -> 0x0018 }
                                        r1.<init>()     // Catch:{ all -> 0x0018 }
                                        java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.r$b> r0 = com.facebook.internal.C24770r.f58779d     // Catch:{ all -> 0x0018 }
                                        r0.add(r1)     // Catch:{ all -> 0x0018 }
                                        com.facebook.internal.C24770r.m47429a()     // Catch:{ all -> 0x0018 }
                                        return
                                    L_0x0018:
                                        r1 = move-exception
                                        java.lang.Class<com.facebook.a.i> r0 = com.facebook.p1814a.C23979i.class
                                        com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r1, r0)
                                    L_0x001e:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.C24872m.C248764.mo39416a(boolean):void");
                                }
                            });
                            C24759o.m47407a(C24759o.EnumC24763b.ChromeCustomTabsPrefetching, new C24759o.AbstractC24762a() {
                                /* class com.facebook.C24872m.C248775 */

                                static {
                                    Covode.recordClassIndex(29066);
                                }

                                @Override // com.facebook.internal.C24759o.AbstractC24762a
                                /* renamed from: a */
                                public final void mo39416a(boolean z) {
                                    if (z) {
                                        C24872m.f59049i = true;
                                    }
                                }
                            });
                            C24759o.m47407a(C24759o.EnumC24763b.IgnoreAppSwitchToLoggedOut, new C24759o.AbstractC24762a() {
                                /* class com.facebook.C24872m.C248786 */

                                static {
                                    Covode.recordClassIndex(29067);
                                }

                                @Override // com.facebook.internal.C24759o.AbstractC24762a
                                /* renamed from: a */
                                public final void mo39416a(boolean z) {
                                    if (z) {
                                        C24872m.f59050j = true;
                                    }
                                }
                            });
                            C24759o.m47407a(C24759o.EnumC24763b.Monitoring, new C24759o.AbstractC24762a() {
                                /* class com.facebook.C24872m.C248797 */

                                static {
                                    Covode.recordClassIndex(29068);
                                }

                                @Override // com.facebook.internal.C24759o.AbstractC24762a
                                /* renamed from: a */
                                public final void mo39416a(boolean z) {
                                    if (z && C24006ab.m45410e()) {
                                        C24699ae.m47299a();
                                        C24768q a = C24770r.m47425a(C24872m.f59041a);
                                        if (a != null && a.f58768p) {
                                            C24721f.f58705a.mo40563a();
                                        }
                                    }
                                }
                            });
                            m47689c().execute(new FutureTask(new Callable<Void>(null, context) {
                                /* class com.facebook.C24872m.CallableC248808 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC24883b f59062a = null;

                                /* renamed from: b */
                                final /* synthetic */ Context f59063b;

                                static {
                                    Covode.recordClassIndex(29069);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public Void call() {
                                    MethodCollector.m26663i(6289);
                                    C24012b a = C24012b.m45437a();
                                    AccessToken a2 = a.f56860a.mo39368a();
                                    if (a2 != null) {
                                        a.mo39534a(a2, false);
                                    }
                                    C25031w a3 = C25031w.m47997a();
                                    Profile a4 = a3.f59374a.mo40919a();
                                    if (a4 != null) {
                                        a3.mo40922a(a4, false);
                                    }
                                    if (AccessToken.m45056a() && C25031w.m47997a().f59375b == null) {
                                        Profile.m45113a();
                                    }
                                    Context context = C24872m.f59047g;
                                    String str = C24872m.f59041a;
                                    if (!C24677a.m47209a(C23973h.class)) {
                                        try {
                                            if (C24006ab.m45407b()) {
                                                C23973h.f56747a.execute(
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: INVOKE  
                                                      (wrap: java.util.concurrent.ScheduledThreadPoolExecutor : 0x004c: SGET  (r1v12 java.util.concurrent.ScheduledThreadPoolExecutor) =  com.facebook.a.h.a java.util.concurrent.ScheduledThreadPoolExecutor)
                                                      (wrap: com.facebook.a.h$1 : 0x0050: CONSTRUCTOR  (r0v23 com.facebook.a.h$1) = 
                                                      (r4v0 'context' android.content.Context)
                                                      (wrap: com.facebook.a.h : 0x0049: CONSTRUCTOR  (r2v2 com.facebook.a.h) = (r4v0 'context' android.content.Context), (r1v2 'str' java.lang.String) call: com.facebook.a.h.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                                                     call: com.facebook.a.h.1.<init>(android.content.Context, com.facebook.a.h):void type: CONSTRUCTOR)
                                                     type: VIRTUAL call: java.util.concurrent.ScheduledThreadPoolExecutor.execute(java.lang.Runnable):void in method: com.facebook.m.8.a():java.lang.Void, file: classes6.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r0v23 com.facebook.a.h$1) = 
                                                      (r4v0 'context' android.content.Context)
                                                      (wrap: com.facebook.a.h : 0x0049: CONSTRUCTOR  (r2v2 com.facebook.a.h) = (r4v0 'context' android.content.Context), (r1v2 'str' java.lang.String) call: com.facebook.a.h.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                                                     call: com.facebook.a.h.1.<init>(android.content.Context, com.facebook.a.h):void type: CONSTRUCTOR in method: com.facebook.m.8.a():java.lang.Void, file: classes6.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                    	... 29 more
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.h, state: GENERATED_AND_UNLOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                    	... 35 more
                                                    */
                                                /*
                                                // Method dump skipped, instructions count: 197
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.C24872m.CallableC248808.call():java.lang.Void");
                                            }

                                            {
                                                this.f59063b = r3;
                                            }
                                        }));
                                        MethodCollector.m26664o(6463);
                                        return;
                                    }
                                    C24798j jVar2 = new C24798j("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                                    MethodCollector.m26664o(6463);
                                    throw jVar2;
                                }
                            }

                            /* renamed from: a */
                            private static Object m47683a(Bundle bundle, String str) {
                                try {
                                    return bundle.get(str);
                                } catch (Exception | OutOfMemoryError unused) {
                                    return null;
                                }
                            }
                        }
