package com.facebook.p1814a.p1820e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.EnumC25029u;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24759o;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.C24780u;
import com.facebook.internal.C24783w;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23916e;
import com.facebook.p1814a.C23973h;
import com.facebook.p1814a.C23998m;
import com.facebook.p1814a.p1815a.ViewTreeObserver$OnGlobalFocusChangeListenerC23872d;
import com.facebook.p1814a.p1816b.C23889b;
import com.facebook.p1814a.p1816b.C23894c;
import com.facebook.p1814a.p1816b.C23901e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.a.e.a */
public class C23922a {

    /* renamed from: a */
    public static final String f56639a = C23922a.class.getCanonicalName();

    /* renamed from: b */
    public static final ScheduledExecutorService f56640b;

    /* renamed from: c */
    public static volatile ScheduledFuture f56641c;

    /* renamed from: d */
    public static final Object f56642d = new Object();

    /* renamed from: e */
    public static AtomicInteger f56643e = new AtomicInteger(0);

    /* renamed from: f */
    public static volatile C23944i f56644f;

    /* renamed from: g */
    public static String f56645g;

    /* renamed from: h */
    public static long f56646h;

    /* renamed from: i */
    public static int f56647i = 0;

    /* renamed from: j */
    public static WeakReference<Activity> f56648j;

    /* renamed from: k */
    private static AtomicBoolean f56649k = new AtomicBoolean(false);

    /* renamed from: a */
    public static int m45236a() {
        C24699ae.m47299a();
        C24768q a = C24770r.m47425a(C24872m.f59041a);
        if (a == null) {
            return 60;
        }
        return a.f58756d;
    }

    /* renamed from: b */
    static void m45238b() {
        MethodCollector.m26663i(8263);
        synchronized (f56642d) {
            try {
                if (f56641c != null) {
                    f56641c.cancel(false);
                }
                f56641c = null;
            } finally {
                MethodCollector.m26664o(8263);
            }
        }
    }

    static {
        Covode.recordClassIndex(28043);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        f56640b = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static void m45237a(Application application, String str) {
        if (f56649k.compareAndSet(false, true)) {
            C24759o.m47407a(C24759o.EnumC24763b.CodelessEvents, new C24759o.AbstractC24762a() {
                /* class com.facebook.p1814a.p1820e.C23922a.C239231 */

                static {
                    Covode.recordClassIndex(28044);
                }

                @Override // com.facebook.internal.C24759o.AbstractC24762a
                /* renamed from: a */
                public final void mo39416a(boolean z) {
                    if (z) {
                        if (!C24677a.m47209a(C23889b.class)) {
                            try {
                                C23889b.f56560d.set(true);
                            } catch (Throwable th) {
                                C24677a.m47208a(th, C23889b.class);
                            }
                        }
                    } else if (!C24677a.m47209a(C23889b.class)) {
                        try {
                            C23889b.f56560d.set(false);
                        } catch (Throwable th2) {
                            C24677a.m47208a(th2, C23889b.class);
                        }
                    }
                }
            });
            f56645g = str;
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                /* class com.facebook.p1814a.p1820e.C23922a.C239242 */

                static {
                    Covode.recordClassIndex(28045);
                }

                public final void onActivityStarted(Activity activity) {
                    C23922a.f56647i++;
                    C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivityStarted");
                }

                public final void onActivityDestroyed(Activity activity) {
                    C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivityDestroyed");
                    if (!C24677a.m47209a(C23889b.class)) {
                        try {
                            C23894c a = C23894c.m45185a();
                            if (!C24677a.m47209a(a)) {
                                try {
                                    a.f56574e.remove(Integer.valueOf(activity.hashCode()));
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, a);
                                }
                            }
                        } catch (Throwable th2) {
                            C24677a.m47208a(th2, C23889b.class);
                        }
                    }
                }

                public final void onActivityStopped(Activity activity) {
                    C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivityStopped");
                    if (!C24677a.m47209a(C23973h.class)) {
                        try {
                            if (!C24677a.m47209a(C23916e.class)) {
                                try {
                                    C23916e.f56627b.execute(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                                          (wrap: java.util.concurrent.ScheduledExecutorService : 0x0019: SGET  (r1v3 java.util.concurrent.ScheduledExecutorService) =  com.facebook.a.e.b java.util.concurrent.ScheduledExecutorService)
                                          (wrap: com.facebook.a.e$2 : 0x001d: CONSTRUCTOR  (r0v9 com.facebook.a.e$2) =  call: com.facebook.a.e.2.<init>():void type: CONSTRUCTOR)
                                         type: INTERFACE call: java.util.concurrent.ScheduledExecutorService.execute(java.lang.Runnable):void in method: com.facebook.a.e.a.2.onActivityStopped(android.app.Activity):void, file: classes6.dex
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
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v9 com.facebook.a.e$2) =  call: com.facebook.a.e.2.<init>():void type: CONSTRUCTOR in method: com.facebook.a.e.a.2.onActivityStopped(android.app.Activity):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 34 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.e, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 40 more
                                        */
                                    /*
                                        this = this;
                                        com.facebook.u r2 = com.facebook.EnumC25029u.APP_EVENTS
                                        java.lang.String r1 = com.facebook.p1814a.p1820e.C23922a.f56639a
                                        java.lang.String r0 = "onActivityStopped"
                                        com.facebook.internal.C24783w.m47440a(r2, r1, r0)
                                        java.lang.Class<com.facebook.a.h> r0 = com.facebook.p1814a.C23973h.class
                                        boolean r0 = com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r0)
                                        if (r0 != 0) goto L_0x0031
                                        java.lang.Class<com.facebook.a.e> r0 = com.facebook.p1814a.C23916e.class
                                        boolean r0 = com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r0)     // Catch:{ all -> 0x002b }
                                        if (r0 != 0) goto L_0x0031
                                        java.util.concurrent.ScheduledExecutorService r1 = com.facebook.p1814a.C23916e.f56627b     // Catch:{ all -> 0x0024 }
                                        com.facebook.a.e$2 r0 = new com.facebook.a.e$2     // Catch:{ all -> 0x0024 }
                                        r0.<init>()     // Catch:{ all -> 0x0024 }
                                        r1.execute(r0)     // Catch:{ all -> 0x0024 }
                                        goto L_0x0031
                                    L_0x0024:
                                        r1 = move-exception
                                        java.lang.Class<com.facebook.a.e> r0 = com.facebook.p1814a.C23916e.class
                                        com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r1, r0)
                                        goto L_0x0031
                                    L_0x002b:
                                        r1 = move-exception
                                        java.lang.Class<com.facebook.a.h> r0 = com.facebook.p1814a.C23973h.class
                                        com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r1, r0)
                                    L_0x0031:
                                        int r0 = com.facebook.p1814a.p1820e.C23922a.f56647i
                                        int r0 = r0 + -1
                                        com.facebook.p1814a.p1820e.C23922a.f56647i = r0
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1820e.C23922a.C239242.onActivityStopped(android.app.Activity):void");
                                }

                                public final void onActivityPaused(Activity activity) {
                                    C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivityPaused");
                                    if (C23922a.f56643e.decrementAndGet() < 0) {
                                        C23922a.f56643e.set(0);
                                    }
                                    C23922a.m45238b();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    String c = C24693ad.m47272c(activity);
                                    if (!C24677a.m47209a(C23889b.class)) {
                                        try {
                                            if (C23889b.f56560d.get()) {
                                                C23894c a = C23894c.m45185a();
                                                if (!C24677a.m47209a(a)) {
                                                    try {
                                                        if (!C24780u.m47438a()) {
                                                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                                a.f56571b.remove(activity);
                                                                a.f56572c.clear();
                                                                a.f56574e.put(Integer.valueOf(activity.hashCode()), (HashSet) a.f56573d.clone());
                                                                a.f56573d.clear();
                                                            } else {
                                                                throw new C24798j("Can't remove activity from CodelessMatcher on non-UI thread");
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        C24677a.m47208a(th, a);
                                                    }
                                                }
                                                if (C23889b.f56559c != null) {
                                                    C23901e eVar = C23889b.f56559c;
                                                    if (!C24677a.m47209a(eVar)) {
                                                        try {
                                                            if (!(eVar.f56594b.get() == null || eVar.f56595c == null)) {
                                                                try {
                                                                    eVar.f56595c.cancel();
                                                                    eVar.f56595c = null;
                                                                } catch (Exception unused) {
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            C24677a.m47208a(th2, eVar);
                                                        }
                                                    }
                                                }
                                                if (C23889b.f56558b != null) {
                                                    C23889b.f56558b.unregisterListener(C23889b.f56557a);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            C24677a.m47208a(th3, C23889b.class);
                                        }
                                    }
                                    C23922a.f56640b.execute(new Runnable(currentTimeMillis, c) {
                                        /* class com.facebook.p1814a.p1820e.C23922a.RunnableC239275 */

                                        /* renamed from: a */
                                        final /* synthetic */ long f56653a;

                                        /* renamed from: b */
                                        final /* synthetic */ String f56654b;

                                        static {
                                            Covode.recordClassIndex(28048);
                                        }

                                        public final void run() {
                                            long j;
                                            MethodCollector.m26663i(7832);
                                            if (C24677a.m47209a(this)) {
                                                MethodCollector.m26664o(7832);
                                                return;
                                            }
                                            try {
                                                if (C23922a.f56644f == null) {
                                                    C23922a.f56644f = new C23944i(Long.valueOf(this.f56653a), null);
                                                }
                                                C23922a.f56644f.f56683b = Long.valueOf(this.f56653a);
                                                if (C23922a.f56643e.get() <= 0) {
                                                    RunnableC239281 r5 = new Runnable() {
                                                        /* class com.facebook.p1814a.p1820e.C23922a.RunnableC239275.RunnableC239281 */

                                                        static {
                                                            Covode.recordClassIndex(28049);
                                                        }

                                                        public final void run() {
                                                            MethodCollector.m26663i(8265);
                                                            if (C24677a.m47209a(this)) {
                                                                MethodCollector.m26664o(8265);
                                                                return;
                                                            }
                                                            try {
                                                                if (C23922a.f56644f == null) {
                                                                    C23922a.f56644f = new C23944i(Long.valueOf(RunnableC239275.this.f56653a), null);
                                                                }
                                                                if (C23922a.f56643e.get() <= 0) {
                                                                    C23945j.m45268a(RunnableC239275.this.f56654b, C23922a.f56644f, C23922a.f56645g);
                                                                    C24699ae.m47299a();
                                                                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g).edit();
                                                                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                                                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                                                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                                                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                                                    edit.apply();
                                                                    C24699ae.m47299a();
                                                                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g).edit();
                                                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                                                    edit2.apply();
                                                                    C23922a.f56644f = null;
                                                                }
                                                                synchronized (C23922a.f56642d) {
                                                                    try {
                                                                        C23922a.f56641c = null;
                                                                    } finally {
                                                                        MethodCollector.m26664o(8265);
                                                                    }
                                                                }
                                                            } catch (Throwable th) {
                                                                C24677a.m47208a(th, this);
                                                                MethodCollector.m26664o(8265);
                                                            }
                                                        }
                                                    };
                                                    synchronized (C23922a.f56642d) {
                                                        try {
                                                            C23922a.f56641c = C23922a.f56640b.schedule(r5, (long) C23922a.m45236a(), TimeUnit.SECONDS);
                                                        } catch (Throwable th) {
                                                            MethodCollector.m26664o(7832);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                long j2 = C23922a.f56646h;
                                                if (j2 > 0) {
                                                    j = (this.f56653a - j2) / 1000;
                                                } else {
                                                    j = 0;
                                                }
                                                String str = this.f56654b;
                                                C24699ae.m47299a();
                                                Context context = C24872m.f59047g;
                                                C24699ae.m47299a();
                                                String str2 = C24872m.f59041a;
                                                C24699ae.m47301a((Object) context, "context");
                                                C24768q a = C24770r.m47427a(str2, false);
                                                if (a != null && a.f58759g && j > 0) {
                                                    C23998m mVar = new C23998m(context);
                                                    new Bundle(1).putCharSequence("fb_aa_time_spent_view_name", str);
                                                    mVar.mo39474a((double) j);
                                                }
                                                C23922a.f56644f.mo39444c();
                                                MethodCollector.m26664o(7832);
                                            } catch (Throwable th2) {
                                                C24677a.m47208a(th2, this);
                                                MethodCollector.m26664o(7832);
                                            }
                                        }

                                        {
                                            this.f56653a = r1;
                                            this.f56654b = r3;
                                        }
                                    });
                                }

                                public final void onActivityResumed(Activity activity) {
                                    ViewTreeObserver$OnGlobalFocusChangeListenerC23872d dVar;
                                    View a;
                                    C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivityResumed");
                                    C23922a.f56648j = new WeakReference<>(activity);
                                    C23922a.f56643e.incrementAndGet();
                                    C23922a.m45238b();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    C23922a.f56646h = currentTimeMillis;
                                    String c = C24693ad.m47272c(activity);
                                    if (!C24677a.m47209a(C23889b.class)) {
                                        try {
                                            if (C23889b.f56560d.get()) {
                                                C23894c a2 = C23894c.m45185a();
                                                if (!C24677a.m47209a(a2)) {
                                                    try {
                                                        if (!C24780u.m47438a()) {
                                                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                                a2.f56571b.add(activity);
                                                                a2.f56573d.clear();
                                                                if (a2.f56574e.containsKey(Integer.valueOf(activity.hashCode()))) {
                                                                    a2.f56573d = a2.f56574e.get(Integer.valueOf(activity.hashCode()));
                                                                }
                                                                if (!C24677a.m47209a(a2)) {
                                                                    try {
                                                                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                                            a2.mo39389b();
                                                                        } else {
                                                                            a2.f56570a.post(
                                                                            /*  JADX ERROR: Method code generation error
                                                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: INVOKE  
                                                                                  (wrap: android.os.Handler : 0x0095: IGET  (r1v18 android.os.Handler) = (r2v9 'a2' com.facebook.a.b.c) com.facebook.a.b.c.a android.os.Handler)
                                                                                  (wrap: com.facebook.a.b.c$1 : 0x0099: CONSTRUCTOR  (r0v61 com.facebook.a.b.c$1) = (r2v9 'a2' com.facebook.a.b.c) call: com.facebook.a.b.c.1.<init>(com.facebook.a.b.c):void type: CONSTRUCTOR)
                                                                                 type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.facebook.a.e.a.2.onActivityResumed(android.app.Activity):void, file: classes6.dex
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
                                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                                                                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0099: CONSTRUCTOR  (r0v61 com.facebook.a.b.c$1) = (r2v9 'a2' com.facebook.a.b.c) call: com.facebook.a.b.c.1.<init>(com.facebook.a.b.c):void type: CONSTRUCTOR in method: com.facebook.a.e.a.2.onActivityResumed(android.app.Activity):void, file: classes6.dex
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                                                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                                                                	... 64 more
                                                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.a.b.c, state: GENERATED_AND_UNLOADED
                                                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                                                                	... 70 more
                                                                                */
                                                                            /*
                                                                            // Method dump skipped, instructions count: 453
                                                                            */
                                                                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1820e.C23922a.C239242.onActivityResumed(android.app.Activity):void");
                                                                        }

                                                                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                                                                            C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivitySaveInstanceState");
                                                                        }

                                                                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                                                                            C24783w.m47440a(EnumC25029u.APP_EVENTS, C23922a.f56639a, "onActivityCreated");
                                                                            C23922a.f56640b.execute(new Runnable() {
                                                                                /* class com.facebook.p1814a.p1820e.C23922a.RunnableC239253 */

                                                                                static {
                                                                                    Covode.recordClassIndex(28046);
                                                                                }

                                                                                public final void run() {
                                                                                    if (!C24677a.m47209a(this)) {
                                                                                        try {
                                                                                            if (C23922a.f56644f == null) {
                                                                                                C24699ae.m47299a();
                                                                                                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g);
                                                                                                long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
                                                                                                long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
                                                                                                C23944i iVar = null;
                                                                                                iVar = null;
                                                                                                C23946k kVar = null;
                                                                                                iVar = null;
                                                                                                String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                                                                                                if (!(j == 0 || j2 == 0)) {
                                                                                                    if (string != null) {
                                                                                                        C23944i iVar2 = new C23944i(Long.valueOf(j), Long.valueOf(j2));
                                                                                                        iVar2.f56684c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                                                                                                        C24699ae.m47299a();
                                                                                                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(C24872m.f59047g);
                                                                                                        if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                                                                                                            kVar = new C23946k(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                                                                                                        }
                                                                                                        iVar2.f56686e = kVar;
                                                                                                        iVar2.f56685d = Long.valueOf(System.currentTimeMillis());
                                                                                                        iVar2.f56687f = UUID.fromString(string);
                                                                                                        iVar = iVar2;
                                                                                                    }
                                                                                                }
                                                                                                C23922a.f56644f = iVar;
                                                                                            }
                                                                                        } catch (Throwable th) {
                                                                                            C24677a.m47208a(th, this);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        }
