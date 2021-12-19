package com.bytedance.apm.block.p766a;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.AbstractC12350a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p788p.C12569d;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.monitor.collector.AbstractC21470a;
import com.bytedance.monitor.collector.C21495h;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.services.apm.api.AbstractC22711d;
import com.bytedance.services.apm.api.C22708a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.apm.block.a.f */
public final class C12364f implements AbstractC22711d {

    /* renamed from: r */
    public static final C12364f f29788r = new C12364f();

    /* renamed from: a */
    public volatile boolean f29789a;

    /* renamed from: b */
    public final C12363e f29790b = new C12363e();

    /* renamed from: c */
    long[] f29791c = new long[4];

    /* renamed from: d */
    public final List<AbstractC12350a> f29792d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public boolean f29793e = false;

    /* renamed from: f */
    boolean f29794f = false;

    /* renamed from: g */
    public boolean f29795g = false;

    /* renamed from: h */
    public Object f29796h;

    /* renamed from: i */
    public Object[] f29797i;

    /* renamed from: j */
    public long[] f29798j;

    /* renamed from: k */
    public Object f29799k;

    /* renamed from: l */
    public Method f29800l;

    /* renamed from: m */
    public Choreographer f29801m;

    /* renamed from: n */
    boolean f29802n = false;

    /* renamed from: o */
    public final C12569d f29803o = new C12569d("looper_monitor");

    /* renamed from: p */
    Runnable f29804p;

    /* renamed from: q */
    long f29805q = -1;

    /* renamed from: s */
    public boolean f29806s;

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: c */
    public final void mo20109c(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: l_ */
    public final void mo20110l_() {
    }

    static {
        Covode.recordClassIndex(14170);
    }

    private C12364f() {
    }

    /* renamed from: c */
    private synchronized void m22208c() {
        if (C12397c.m22286c()) {
            if (this.f29806s) {
                if (!this.f29789a) {
                    this.f29789a = true;
                }
                if (this.f29793e) {
                    int i = Build.VERSION.SDK_INT;
                    mo20121a(this.f29804p);
                }
                return;
            }
            throw new RuntimeException("never init!");
        }
    }

    /* renamed from: d */
    private synchronized void m22209d() {
        if (C12397c.m22285b()) {
            if (this.f29806s) {
                if (this.f29789a) {
                    this.f29789a = false;
                }
                return;
            }
            throw new RuntimeException("MainThreadMonitor is never init!");
        }
    }

    /* renamed from: a */
    public final void mo20119a() {
        if (!this.f29806s) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ActivityLifeObserver.getInstance().register(this);
                C21495h.m40377a();
                C21495h.f50996b = new AbstractC21470a() {
                    /* class com.bytedance.apm.block.p766a.C12364f.C123651 */

                    static {
                        Covode.recordClassIndex(14171);
                    }

                    @Override // com.bytedance.monitor.collector.AbstractC21470a
                    /* renamed from: a */
                    public final boolean mo20124a() {
                        return C12364f.this.f29789a;
                    }

                    @Override // com.bytedance.monitor.collector.AbstractC21470a
                    /* renamed from: a */
                    public final void mo20123a(String str) {
                        super.mo20123a(str);
                        C12364f fVar = C12364f.this;
                        fVar.f29795g = true;
                        fVar.f29791c[0] = AbstractC21470a.f50893b;
                        fVar.f29791c[2] = AbstractC21470a.f50894c;
                        List<AbstractC12350a> list = fVar.f29792d;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            AbstractC12350a aVar = list.get(i);
                            if (!aVar.f29758a) {
                                aVar.mo20106a(str);
                            }
                        }
                    }

                    @Override // com.bytedance.monitor.collector.AbstractC21470a
                    /* renamed from: b */
                    public final void mo20125b(String str) {
                        super.mo20125b(str);
                        C12364f fVar = C12364f.this;
                        boolean z = fVar.f29794f;
                        char c = 0;
                        if (fVar.f29793e && fVar.f29794f) {
                            int i = Build.VERSION.SDK_INT;
                            fVar.mo20121a(fVar.f29804p);
                            fVar.f29794f = false;
                            long j = AbstractC21470a.f50893b;
                            long j2 = fVar.f29805q;
                            if (fVar.f29798j != null) {
                                if (C21501k.m40384a().mo35103d() != null) {
                                    C21501k.m40384a().mo35103d().mo35084a(fVar.f29798j);
                                }
                                C12364f.f29788r.f29803o.mo20398a(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: INVOKE  
                                      (wrap: com.bytedance.apm.p.d : 0x0048: IGET  (r4v3 com.bytedance.apm.p.d) = 
                                      (wrap: com.bytedance.apm.block.a.f : 0x0046: SGET  (r0v24 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                                     com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                                      (wrap: com.bytedance.apm.block.a.d$1 : 0x004c: CONSTRUCTOR  (r0v25 com.bytedance.apm.block.a.d$1) = 
                                      (wrap: com.bytedance.apm.block.a.d : 0x0040: INVOKE  (r10v0 com.bytedance.apm.block.a.d) =  type: STATIC call: com.bytedance.apm.block.a.d.a():com.bytedance.apm.block.a.d)
                                      (r1v4 'j' long)
                                      (wrap: long[] : 0x0044: IGET  (r9v1 long[]) = (r3v0 'fVar' com.bytedance.apm.block.a.f) com.bytedance.apm.block.a.f.j long[])
                                     call: com.bytedance.apm.block.a.d.1.<init>(com.bytedance.apm.block.a.d, long, long[]):void type: CONSTRUCTOR)
                                     type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.block.a.f.1.b(java.lang.String):void, file: classes.dex
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
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004c: CONSTRUCTOR  (r0v25 com.bytedance.apm.block.a.d$1) = 
                                      (wrap: com.bytedance.apm.block.a.d : 0x0040: INVOKE  (r10v0 com.bytedance.apm.block.a.d) =  type: STATIC call: com.bytedance.apm.block.a.d.a():com.bytedance.apm.block.a.d)
                                      (r1v4 'j' long)
                                      (wrap: long[] : 0x0044: IGET  (r9v1 long[]) = (r3v0 'fVar' com.bytedance.apm.block.a.f) com.bytedance.apm.block.a.f.j long[])
                                     call: com.bytedance.apm.block.a.d.1.<init>(com.bytedance.apm.block.a.d, long, long[]):void type: CONSTRUCTOR in method: com.bytedance.apm.block.a.f.1.b(java.lang.String):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 24 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.d, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 30 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 191
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.block.p766a.C12364f.C123651.mo20125b(java.lang.String):void");
                            }
                        };
                        this.f29806s = true;
                        return;
                    }
                    throw new AssertionError("must be init in main thread!");
                }
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: b */
            public final void mo20035b(Activity activity) {
                int i = Build.VERSION.SDK_INT;
                if (this.f29801m == null && this.f29793e) {
                    try {
                        this.f29801m = Choreographer.getInstance();
                    } catch (Exception unused) {
                    }
                    C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                        /* class com.bytedance.apm.block.p766a.C12364f.RunnableC123673 */

                        static {
                            Covode.recordClassIndex(14173);
                        }

                        public final void run() {
                            try {
                                C12364f.this.f29804p = new Runnable() {
                                    /* class com.bytedance.apm.block.p766a.C12364f.RunnableC123673.RunnableC123681 */

                                    static {
                                        Covode.recordClassIndex(14174);
                                    }

                                    public final void run() {
                                        try {
                                            C12364f fVar = C12364f.this;
                                            try {
                                                if (Build.VERSION.SDK_INT <= 22) {
                                                    fVar.f29805q = ((Long) C12364f.m22204a(fVar.f29799k, "mTimestampNanos")).longValue();
                                                    fVar.f29805q /= 1000000;
                                                } else if (fVar.f29798j == null) {
                                                    fVar.f29805q = AbstractC21470a.f50893b;
                                                } else {
                                                    fVar.f29805q = fVar.f29798j[1] / 1000000;
                                                }
                                                fVar.f29794f = true;
                                            } finally {
                                                fVar.f29802n = false;
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                };
                                C12364f fVar = C12364f.this;
                                fVar.f29796h = C12364f.m22204a(fVar.f29801m, "mLock");
                                if (C12364f.this.f29796h == null) {
                                    C12364f fVar2 = C12364f.this;
                                    fVar2.f29796h = C12364f.m22207b(fVar2.f29801m, "mLock");
                                }
                                C12364f fVar3 = C12364f.this;
                                fVar3.f29797i = (Object[]) C12364f.m22204a(fVar3.f29801m, "mCallbackQueues");
                                if (C12364f.this.f29797i == null) {
                                    C12364f fVar4 = C12364f.this;
                                    fVar4.f29797i = (Object[]) C12364f.m22207b(fVar4.f29801m, "mCallbackQueues");
                                }
                                if (Build.VERSION.SDK_INT == 28) {
                                    C12364f fVar5 = C12364f.this;
                                    fVar5.f29798j = (long[]) C12364f.m22207b(C12364f.m22207b(fVar5.f29801m, "mFrameInfo"), "mFrameInfo");
                                } else if (Build.VERSION.SDK_INT > 28) {
                                    C12364f fVar6 = C12364f.this;
                                    fVar6.f29798j = (long[]) C12364f.m22207b(C12364f.m22207b(fVar6.f29801m, "mFrameInfo"), "frameInfo");
                                } else if (Build.VERSION.SDK_INT > 22) {
                                    C12364f fVar7 = C12364f.this;
                                    fVar7.f29798j = (long[]) C12364f.m22204a(C12364f.m22204a(fVar7.f29801m, "mFrameInfo"), "mFrameInfo");
                                } else {
                                    C12364f fVar8 = C12364f.this;
                                    fVar8.f29799k = C12364f.m22204a(fVar8.f29801m, "mDisplayEventReceiver");
                                }
                                if (C12364f.this.f29798j == null && Build.VERSION.SDK_INT > 22) {
                                    C22708a.m42800a("FrameInfoIsNull");
                                }
                                if (C12364f.this.f29796h == null) {
                                    C22708a.m42800a("CallbackQueueLockIsNull");
                                }
                                if (C12364f.this.f29797i == null) {
                                    C22708a.m42800a("callbackQueuesIsNull");
                                }
                                C12364f fVar9 = C12364f.this;
                                fVar9.f29800l = C12364f.m22206a(fVar9.f29797i[0], "addCallbackLocked", Long.TYPE, Object.class, Object.class);
                                int i = Build.VERSION.SDK_INT;
                                C12364f fVar10 = C12364f.this;
                                fVar10.mo20121a(fVar10.f29804p);
                            } catch (Exception e) {
                                C22708a.m42803a((Throwable) e, "MainThreadMonitor_fullFps");
                            }
                        }
                    });
                }
            }

            /* renamed from: b */
            public final void mo20122b(AbstractC12350a aVar) {
                this.f29792d.remove(aVar);
                if (this.f29792d.isEmpty()) {
                    m22209d();
                }
            }

            /* renamed from: a */
            public final void mo20120a(AbstractC12350a aVar) {
                if (!this.f29789a) {
                    m22208c();
                }
                if (!this.f29792d.contains(aVar)) {
                    this.f29792d.add(aVar);
                }
            }

            /* renamed from: a */
            public final synchronized void mo20121a(Runnable runnable) {
                if (this.f29789a) {
                    if (!this.f29802n) {
                        try {
                            synchronized (this.f29796h) {
                                Method method = this.f29800l;
                                if (method != null) {
                                    Object obj = this.f29797i[0];
                                    Object[] objArr = {-1L, runnable, null};
                                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_block_trace_MainThreadMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    if (((Boolean) a.first).booleanValue()) {
                                        Object obj2 = a.second;
                                    } else {
                                        C15346a.m28242a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_bytedance_apm_block_trace_MainThreadMonitor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                    }
                                    this.f29802n = true;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }

            /* renamed from: a */
            public static <T> T m22204a(Object obj, String str) {
                try {
                    Field declaredField = obj.getClass().getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return (T) declaredField.get(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            /* renamed from: b */
            public static <T> T m22207b(Object obj, String str) {
                try {
                    Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), str);
                    field.setAccessible(true);
                    return (T) field.get(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: a */
            public final void mo20108a(Activity activity, Bundle bundle) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Window window = activity.getWindow();
                        window.setCallback(new AbstractWindow$CallbackC12381j(window.getCallback()) {
                            /* class com.bytedance.apm.block.p766a.C12364f.C123694 */

                            static {
                                Covode.recordClassIndex(14175);
                            }

                            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                                if (!C12364f.this.f29795g) {
                                    C12364f.this.f29790b.mo20117a(keyEvent.getEventTime());
                                }
                                return this.f29864b.dispatchKeyEvent(keyEvent);
                            }

                            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                                if (!C12364f.this.f29795g) {
                                    C12364f.this.f29790b.mo20117a(motionEvent.getEventTime());
                                }
                                return this.f29864b.dispatchTouchEvent(motionEvent);
                            }
                        });
                    }
                } catch (Exception unused) {
                }
            }

            /* renamed from: a */
            public static Method m22206a(Object obj, String str, Class<?>... clsArr) {
                try {
                    Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: a */
            public static Method m22205a(Class cls, String str, Class<?>... clsArr) {
                try {
                    Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
                    method.setAccessible(true);
                    return method;
                } catch (Exception unused) {
                    return null;
                }
            }
        }
