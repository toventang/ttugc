package com.bytedance.apm.trace.p791b;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.C12390g;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.apm.trace.p791b.C12612a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.b.b */
public final class C12616b {

    /* renamed from: c */
    public static boolean f30682c;

    /* renamed from: n */
    public static final Long f30683n = 200L;

    /* renamed from: o */
    public static final Long f30684o = 1000L;

    /* renamed from: a */
    public String f30685a;

    /* renamed from: b */
    public volatile boolean f30686b;

    /* renamed from: d */
    public AbstractC12623d f30687d;

    /* renamed from: e */
    public AbstractC12622c f30688e;

    /* renamed from: f */
    public AbstractC12624e f30689f;

    /* renamed from: g */
    LinkedList<Integer> f30690g;

    /* renamed from: h */
    public float f30691h;

    /* renamed from: i */
    public float f30692i;

    /* renamed from: j */
    public float f30693j;

    /* renamed from: k */
    public float f30694k;

    /* renamed from: l */
    public C12620a f30695l;

    /* renamed from: m */
    WindowManager f30696m;

    /* renamed from: p */
    public final JSONObject f30697p;

    /* renamed from: q */
    public long f30698q;

    /* renamed from: r */
    public long f30699r;

    /* renamed from: s */
    public int f30700s;

    /* renamed from: t */
    private C12625c f30701t;

    /* renamed from: u */
    private Choreographer.FrameCallback f30702u;

    /* renamed from: v */
    private boolean f30703v;

    /* renamed from: com.bytedance.apm.trace.b.b$b */
    public interface AbstractC12621b {
        static {
            Covode.recordClassIndex(14438);
        }
    }

    /* renamed from: com.bytedance.apm.trace.b.b$c */
    public interface AbstractC12622c {
        static {
            Covode.recordClassIndex(14439);
        }

        /* renamed from: a */
        void mo20435a(JSONObject jSONObject);
    }

    /* renamed from: com.bytedance.apm.trace.b.b$d */
    public interface AbstractC12623d {
        static {
            Covode.recordClassIndex(14440);
        }

        /* renamed from: a */
        void mo20436a(double d);
    }

    /* renamed from: com.bytedance.apm.trace.b.b$e */
    public interface AbstractC12624e {
        static {
            Covode.recordClassIndex(14441);
        }
    }

    /* renamed from: a */
    static void m22742a(WindowManager windowManager, View view) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            C15346a.m28240a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_apm_trace_fps_FpsTracer_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    static {
        Covode.recordClassIndex(14433);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        com.bytedance.apm.p788p.C12560b.C12564a.f30567a.mo20387a(new com.bytedance.apm.trace.p791b.C12616b.RunnableC126193(r7));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20430b() {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.p791b.C12616b.mo20430b():void");
    }

    /* renamed from: a */
    public final void mo20427a() {
        C12625c cVar = this.f30701t;
        if (cVar != null) {
            if (cVar.f30715b) {
                return;
            }
            if (cVar.f30730t || C12397c.f29946p || C12556c.m22586a("fps_drop", cVar.f30714a) || C12556c.m22586a("fps", cVar.f30714a)) {
                cVar.f30722i = 0.0f;
                cVar.f30723j = 0.0f;
                cVar.f30724k = 0.0f;
                cVar.f30725l = 0.0f;
                cVar.f30726m = 0;
                int i = Build.VERSION.SDK_INT;
                if (C12625c.f30713s != null) {
                    cVar.f30715b = true;
                    C12364f.f29788r.f29803o.mo20398a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: INVOKE  
                          (wrap: com.bytedance.apm.p.d : 0x004d: IGET  (r1v3 com.bytedance.apm.p.d) = 
                          (wrap: com.bytedance.apm.block.a.f : 0x004b: SGET  (r0v25 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                         com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                          (wrap: com.bytedance.apm.block.a.b$2 : 0x0051: CONSTRUCTOR  (r0v26 com.bytedance.apm.block.a.b$2) = 
                          (wrap: com.bytedance.apm.block.a.b : 0x0049: SGET  (r2v1 com.bytedance.apm.block.a.b) =  com.bytedance.apm.trace.b.c.s com.bytedance.apm.block.a.b)
                          (r9v0 'cVar' com.bytedance.apm.trace.b.c)
                         call: com.bytedance.apm.block.a.b.2.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.trace.b.b.a():void, file: classes.dex
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
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: CONSTRUCTOR  (r0v26 com.bytedance.apm.block.a.b$2) = 
                          (wrap: com.bytedance.apm.block.a.b : 0x0049: SGET  (r2v1 com.bytedance.apm.block.a.b) =  com.bytedance.apm.trace.b.c.s com.bytedance.apm.block.a.b)
                          (r9v0 'cVar' com.bytedance.apm.trace.b.c)
                         call: com.bytedance.apm.block.a.b.2.<init>(com.bytedance.apm.block.a.b, com.bytedance.apm.trace.b.c):void type: CONSTRUCTOR in method: com.bytedance.apm.trace.b.b.a():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 41 more
                        */
                    /*
                    // Method dump skipped, instructions count: 196
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.trace.p791b.C12616b.mo20427a():void");
                }

                /* renamed from: a */
                public static void m22743a(String str) {
                    C12390g.m22259a(str);
                }

                /* renamed from: b */
                public static void m22744b(String str) {
                    C12390g.m22260b(str);
                }

                /* renamed from: a */
                public final void mo20428a(AbstractC12622c cVar) {
                    C12625c cVar2 = this.f30701t;
                    if (cVar2 != null) {
                        cVar2.f30719f = cVar;
                    }
                    this.f30688e = cVar;
                }

                /* renamed from: a */
                public final void mo20429a(AbstractC12623d dVar) {
                    C12625c cVar = this.f30701t;
                    if (cVar != null) {
                        cVar.f30717d = dVar;
                    }
                    this.f30687d = dVar;
                }

                /* renamed from: com.bytedance.apm.trace.b.b$a */
                class C12620a extends View {

                    /* renamed from: a */
                    public long f30708a = -1;

                    /* renamed from: b */
                    public int f30709b;

                    static {
                        Covode.recordClassIndex(14437);
                    }

                    /* access modifiers changed from: protected */
                    public final void onDraw(Canvas canvas) {
                        if (this.f30708a == -1) {
                            this.f30708a = SystemClock.elapsedRealtime();
                            this.f30709b = 0;
                        } else {
                            this.f30709b++;
                        }
                        if (C12616b.this.f30689f != null) {
                            SystemClock.elapsedRealtime();
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f30708a;
                        if (elapsedRealtime > C12616b.f30683n.longValue()) {
                            double d = (double) this.f30709b;
                            double d2 = (double) elapsedRealtime;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            double d3 = d / d2;
                            double longValue = (double) C12616b.f30684o.longValue();
                            Double.isNaN(longValue);
                            double d4 = d3 * longValue;
                            if (C12616b.this.f30687d != null) {
                                C12616b.this.f30687d.mo20436a(d4);
                            }
                            C12612a.C12615b.f30681a.mo20425a(C12616b.this.f30685a, (float) d4);
                            C12616b bVar = C12616b.this;
                            if (bVar.f30686b) {
                                try {
                                    C12616b.m22742a(bVar.f30696m, bVar.f30695l);
                                    bVar.f30695l.f30708a = -1;
                                    bVar.f30695l.f30709b = 0;
                                } catch (Exception unused) {
                                }
                                bVar.f30686b = false;
                            }
                        }
                    }

                    public C12620a(Context context) {
                        super(context);
                    }
                }

                public C12616b(String str, boolean z) {
                    this(str, z, (byte) 0);
                }

                /* renamed from: a */
                private static Object m22741a(Context context, String str) {
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

                private C12616b(String str, boolean z, byte b) {
                    this.f30698q = -1;
                    this.f30699r = -1;
                    this.f30697p = null;
                    if (f30682c) {
                        this.f30701t = new C12625c(str, z);
                        return;
                    }
                    this.f30685a = str;
                    this.f30703v = z;
                    this.f30690g = new LinkedList<>();
                    int i = Build.VERSION.SDK_INT;
                }
            }
