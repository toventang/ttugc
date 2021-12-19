package com.bytedance.apm.trace.p791b;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.block.p766a.C12352b;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.trace.p791b.C12612a;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.b.c */
public final class C12625c {

    /* renamed from: q */
    public static final Long f30711q = 200L;

    /* renamed from: r */
    public static final Long f30712r = 1000L;

    /* renamed from: s */
    public static C12352b f30713s;

    /* renamed from: a */
    public final String f30714a;

    /* renamed from: b */
    public volatile boolean f30715b;

    /* renamed from: c */
    public C12352b.C12356a f30716c = new C12352b.C12356a();

    /* renamed from: d */
    public C12616b.AbstractC12623d f30717d;

    /* renamed from: e */
    public C12616b.AbstractC12624e f30718e = null;

    /* renamed from: f */
    public volatile C12616b.AbstractC12622c f30719f;

    /* renamed from: g */
    public volatile C12616b.AbstractC12621b f30720g;

    /* renamed from: h */
    public LinkedList<Integer> f30721h;

    /* renamed from: i */
    public float f30722i = 0.0f;

    /* renamed from: j */
    public float f30723j = 0.0f;

    /* renamed from: k */
    public float f30724k = 0.0f;

    /* renamed from: l */
    public float f30725l = 0.0f;

    /* renamed from: m */
    long f30726m = 0;

    /* renamed from: n */
    public long f30727n = 0;

    /* renamed from: o */
    public C12628a f30728o = null;

    /* renamed from: p */
    WindowManager f30729p = null;

    /* renamed from: t */
    final boolean f30730t;

    /* renamed from: u */
    public final JSONObject f30731u;

    /* renamed from: a */
    static void m22752a(WindowManager windowManager, View view) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            C15346a.m28240a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_apm_trace_fps_RealFpsTracer_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    static {
        Covode.recordClassIndex(14442);
    }

    /* renamed from: a */
    public final synchronized void mo20437a() {
        int i = Build.VERSION.SDK_INT;
        C12352b bVar = f30713s;
        if (bVar != null) {
            C12364f.f29788r.f29803o.mo20398a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: INVOKE  
                  (wrap: com.bytedance.apm.p.d : 0x000b: IGET  (r1v0 com.bytedance.apm.p.d) = 
                  (wrap: com.bytedance.apm.block.a.f : 0x0009: SGET  (r0v4 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                 com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                  (wrap: com.bytedance.apm.block.a.b$3 : 0x000f: CONSTRUCTOR  (r0v5 com.bytedance.apm.block.a.b$3) = (r2v0 'bVar' com.bytedance.apm.block.a.b), (r4v0 'this' com.bytedance.apm.trace.b.c A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.apm.block.a.b.3.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.trace.b.c.a():void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v5 com.bytedance.apm.block.a.b$3) = (r2v0 'bVar' com.bytedance.apm.block.a.b), (r4v0 'this' com.bytedance.apm.trace.b.c A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.apm.block.a.b.3.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR in method: com.bytedance.apm.trace.b.c.a():void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
                this = this;
                monitor-enter(r4)
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0056 }
                r0 = 16
                com.bytedance.apm.block.a.b r2 = com.bytedance.apm.trace.p791b.C12625c.f30713s     // Catch:{ all -> 0x0056 }
                if (r2 == 0) goto L_0x004f
                com.bytedance.apm.block.a.f r0 = com.bytedance.apm.block.p766a.C12364f.f29788r     // Catch:{ all -> 0x0056 }
                com.bytedance.apm.p.d r1 = r0.f29803o     // Catch:{ all -> 0x0056 }
                com.bytedance.apm.block.a.b$3 r0 = new com.bytedance.apm.block.a.b$3     // Catch:{ all -> 0x0056 }
                r0.<init>(r4)     // Catch:{ all -> 0x0056 }
                r1.mo20398a(r0)     // Catch:{ all -> 0x0056 }
                boolean r0 = r4.f30715b     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x004f
                android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0056 }
                monitor-enter(r4)     // Catch:{ all -> 0x0056 }
                java.util.LinkedList<java.lang.Integer> r0 = r4.f30721h     // Catch:{ all -> 0x003f }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003f }
                if (r0 == 0) goto L_0x0027
                monitor-exit(r4)     // Catch:{ all -> 0x003f }
                goto L_0x004c
            L_0x0027:
                r0 = 0
                r4.f30727n = r0     // Catch:{ all -> 0x003f }
                java.util.LinkedList<java.lang.Integer> r3 = r4.f30721h     // Catch:{ all -> 0x003f }
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x003f }
                r0.<init>()     // Catch:{ all -> 0x003f }
                r4.f30721h = r0     // Catch:{ all -> 0x003f }
                com.bytedance.apm.block.a.b$a r2 = r4.f30716c     // Catch:{ all -> 0x003f }
                com.bytedance.apm.block.a.b$a r0 = new com.bytedance.apm.block.a.b$a     // Catch:{ all -> 0x003f }
                r0.<init>()     // Catch:{ all -> 0x003f }
                r4.f30716c = r0     // Catch:{ all -> 0x003f }
                monitor-exit(r4)     // Catch:{ all -> 0x003f }
                goto L_0x0042
            L_0x003f:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0042:
                com.bytedance.apm.p.b r1 = com.bytedance.apm.p788p.C12560b.C12564a.f30567a
                com.bytedance.apm.trace.b.c$2 r0 = new com.bytedance.apm.trace.b.c$2
                r0.<init>(r3, r2)
                r1.mo20387a(r0)
            L_0x004c:
                r0 = 0
                r4.f30715b = r0
            L_0x004f:
                java.lang.String r0 = r4.f30714a
                com.bytedance.apm.block.C12390g.m22260b(r0)
                monitor-exit(r4)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.p791b.C12625c.mo20437a():void");
        }

        /* renamed from: com.bytedance.apm.trace.b.c$a */
        class C12628a extends View {

            /* renamed from: a */
            public long f30736a = -1;

            /* renamed from: b */
            public int f30737b;

            static {
                Covode.recordClassIndex(14445);
            }

            /* access modifiers changed from: protected */
            public final void onDraw(Canvas canvas) {
                if (this.f30736a == -1) {
                    this.f30736a = SystemClock.elapsedRealtime();
                    this.f30737b = 0;
                } else {
                    this.f30737b++;
                }
                if (C12625c.this.f30718e != null) {
                    SystemClock.elapsedRealtime();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f30736a;
                if (elapsedRealtime > C12625c.f30711q.longValue()) {
                    double d = (double) this.f30737b;
                    double d2 = (double) elapsedRealtime;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    double longValue = (double) C12625c.f30712r.longValue();
                    Double.isNaN(longValue);
                    double d4 = d3 * longValue;
                    if (C12625c.this.f30717d != null) {
                        C12625c.this.f30717d.mo20436a(d4);
                    }
                    C12612a.C12615b.f30681a.mo20425a(C12625c.this.f30714a, (float) d4);
                    C12625c cVar = C12625c.this;
                    if (cVar.f30715b) {
                        try {
                            C12625c.m22752a(cVar.f30729p, cVar.f30728o);
                            cVar.f30728o.f30736a = -1;
                            cVar.f30728o.f30737b = 0;
                        } catch (Exception unused) {
                        }
                        cVar.f30715b = false;
                    }
                }
            }

            public C12628a(Context context) {
                super(context);
            }
        }

        public C12625c(String str, boolean z) {
            this.f30714a = str;
            this.f30730t = z;
            this.f30731u = null;
            this.f30721h = new LinkedList<>();
            int i = Build.VERSION.SDK_INT;
        }

        /* renamed from: a */
        private static Object m22751a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }
    }
