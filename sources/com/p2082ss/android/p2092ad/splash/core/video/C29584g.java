package com.p2082ss.android.p2092ad.splash.core.video;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.C29556v;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29506c;
import com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b;
import com.p2082ss.android.p2092ad.splash.core.video.C29577e;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.p2092ad.splash.p2109f.C29658m;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video.g */
public final class C29584g implements AbstractC29569b, C29577e.AbstractC29581a, HandlerC29663q.AbstractC29664a {

    /* renamed from: a */
    public C29577e f70533a;

    /* renamed from: b */
    public HandlerC29663q f70534b = new HandlerC29663q(this);

    /* renamed from: c */
    public long f70535c = 0;

    /* renamed from: d */
    public C29571c f70536d;

    /* renamed from: e */
    public AbstractC29569b.AbstractC29570a f70537e;

    /* renamed from: f */
    public boolean f70538f = false;

    /* renamed from: g */
    public Runnable f70539g = new Runnable() {
        /* class com.p2082ss.android.p2092ad.splash.core.video.C29584g.RunnableC295862 */

        static {
            Covode.recordClassIndex(35981);
        }

        public final void run() {
            if (C29584g.this.f70536d != null) {
                C29571c cVar = C29584g.this.f70536d;
                if (cVar.f70458d != null) {
                    cVar.f70458d.obtainMessage(108).sendToTarget();
                }
            }
        }
    };

    /* renamed from: h */
    private long f70540h;

    /* renamed from: i */
    private int f70541i;

    /* renamed from: j */
    private ViewGroup f70542j;

    /* renamed from: k */
    private long f70543k = 0;

    /* renamed from: l */
    private String f70544l;

    /* renamed from: m */
    private long f70545m = 0;

    /* renamed from: n */
    private long f70546n;

    /* renamed from: o */
    private List<String> f70547o;

    /* renamed from: p */
    private int[] f70548p = new int[2];

    /* renamed from: q */
    private ArrayList<Runnable> f70549q;

    /* renamed from: r */
    private boolean f70550r;

    /* renamed from: s */
    private WeakReference<Context> f70551s;

    /* renamed from: t */
    private boolean f70552t;

    /* renamed from: u */
    private boolean f70553u = false;

    /* renamed from: v */
    private long f70554v = 0;

    /* renamed from: w */
    private long f70555w = 0;

    /* renamed from: x */
    private Runnable f70556x = new Runnable() {
        /* class com.p2082ss.android.p2092ad.splash.core.video.C29584g.RunnableC295873 */

        static {
            Covode.recordClassIndex(35982);
        }

        public final void run() {
            if (C29584g.this.f70537e != null) {
                C29584g.this.f70537e.mo51415c();
            }
        }
    };

    static {
        Covode.recordClassIndex(35979);
    }

    /* renamed from: c */
    public final void mo51837c() {
        C29571c cVar = this.f70536d;
        if (cVar != null) {
            cVar.mo51813b();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.C29577e.AbstractC29581a
    /* renamed from: a */
    public final void mo51830a() {
        this.f70550r = false;
        C29644g.m59688b("surfaceDestroyed");
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.C29577e.AbstractC29581a
    /* renamed from: b */
    public final void mo51834b() {
        if (this.f70537e != null) {
            this.f70543k = System.currentTimeMillis() - this.f70535c;
            AbstractC29569b.AbstractC29570a aVar = this.f70537e;
            C29658m.m59761a(this.f70545m, this.f70546n);
            aVar.mo51414b();
        }
    }

    /* renamed from: d */
    public final void mo51838d() {
        C29571c cVar = this.f70536d;
        if (cVar != null) {
            cVar.mo51814c();
        }
        C29577e eVar = this.f70533a;
        if (eVar != null) {
            eVar.mo51826e();
        }
        this.f70534b.removeCallbacks(this.f70556x);
    }

    /* renamed from: e */
    private void m59503e() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", this.f70541i);
            String str = "not_real_time";
            if (this.f70538f) {
                str = "real_time";
            }
            jSONObject.put("show_type", str);
            jSONObject.put("ad_sequence", C29556v.m59363a().mo51759p());
            int i = 1;
            jSONObject.putOpt("play_order", 1);
            if (C29495h.f70200X != -1) {
                if (C29495h.f70200X != 1) {
                    i = 2;
                }
                jSONObject.put("awemelaunch", i);
            }
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!C29657l.m59760a(this.f70544l)) {
                jSONObject2.put("log_extra", this.f70544l);
            }
            jSONObject2.put("ad_fetch_time", this.f70554v);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject2 = null;
        }
        C29495h.m59099a(this.f70540h, "splash_ad", "play", jSONObject2);
        C29506c.C29507a aVar = new C29506c.C29507a();
        aVar.f70264a = this.f70555w;
        C29506c a = aVar.mo51606a();
        if (C29495h.m59095a().f70654b) {
            C29495h.m59108g().mo51602a(null, "play", this.f70540h, this.f70547o, this.f70544l, true, -1, null, a);
        } else {
            C29495h.m59108g().mo51604c(null, this.f70540h, this.f70547o, this.f70544l, true, -1, null, a);
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.C29577e.AbstractC29581a
    /* renamed from: a */
    public final void mo51832a(MotionEvent motionEvent) {
        AbstractC29569b.AbstractC29570a aVar = this.f70537e;
        if (aVar != null) {
            C29658m.m59761a(this.f70545m, this.f70546n);
            aVar.mo51412a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.C29577e.AbstractC29581a
    /* renamed from: a */
    public final void mo51833a(SurfaceHolder surfaceHolder) {
        this.f70550r = true;
        C29571c cVar = this.f70536d;
        if (cVar != null) {
            cVar.mo51812a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
                  (r1v0 'cVar' com.ss.android.ad.splash.core.video.c)
                  (wrap: com.ss.android.ad.splash.core.video.c$2 : 0x000a: CONSTRUCTOR  (r0v1 com.ss.android.ad.splash.core.video.c$2) = (r1v0 'cVar' com.ss.android.ad.splash.core.video.c), (r3v0 'surfaceHolder' android.view.SurfaceHolder) call: com.ss.android.ad.splash.core.video.c.2.<init>(com.ss.android.ad.splash.core.video.c, android.view.SurfaceHolder):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.ss.android.ad.splash.core.video.c.a(java.lang.Runnable):void in method: com.ss.android.ad.splash.core.video.g.a(android.view.SurfaceHolder):void, file: classes9.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r0v1 com.ss.android.ad.splash.core.video.c$2) = (r1v0 'cVar' com.ss.android.ad.splash.core.video.c), (r3v0 'surfaceHolder' android.view.SurfaceHolder) call: com.ss.android.ad.splash.core.video.c.2.<init>(com.ss.android.ad.splash.core.video.c, android.view.SurfaceHolder):void type: CONSTRUCTOR in method: com.ss.android.ad.splash.core.video.g.a(android.view.SurfaceHolder):void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ad.splash.core.video.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                r0 = 1
                r2.f70550r = r0
                com.ss.android.ad.splash.core.video.c r1 = r2.f70536d
                if (r1 != 0) goto L_0x0008
                return
            L_0x0008:
                com.ss.android.ad.splash.core.video.c$2 r0 = new com.ss.android.ad.splash.core.video.c$2
                r0.<init>(r3)
                r1.mo51812a(r0)
                java.util.ArrayList<java.lang.Runnable> r0 = r2.f70549q
                if (r0 == 0) goto L_0x001a
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x001b
            L_0x001a:
                return
            L_0x001b:
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<java.lang.Runnable> r0 = r2.f70549q
                r1.<init>(r0)
                java.util.Iterator r1 = r1.iterator()
            L_0x0026:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x0036
                java.lang.Object r0 = r1.next()
                java.lang.Runnable r0 = (java.lang.Runnable) r0
                r0.run()
                goto L_0x0026
            L_0x0036:
                java.util.ArrayList<java.lang.Runnable> r0 = r2.f70549q
                r0.clear()
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.video.C29584g.mo51833a(android.view.SurfaceHolder):void");
        }

        @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
        /* renamed from: a */
        public final void mo28809a(Message message) {
            WeakReference<Context> weakReference;
            C29577e eVar;
            if (this.f70533a != null && message != null && (weakReference = this.f70551s) != null && weakReference.get() != null) {
                int i = message.what;
                if (i != 108) {
                    if (i != 109) {
                        switch (i) {
                            case 302:
                                int i2 = message.what;
                                WeakReference<Context> weakReference2 = this.f70551s;
                                if (weakReference2 != null && weakReference2.get() != null && (eVar = this.f70533a) != null) {
                                    eVar.mo51824c();
                                    AbstractC29569b.AbstractC29570a aVar = this.f70537e;
                                    if (aVar != null) {
                                        aVar.mo51413a(this.f70543k);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 303:
                                C29577e eVar2 = this.f70533a;
                                if (eVar2 != null) {
                                    eVar2.mo51824c();
                                }
                                AbstractC29569b.AbstractC29570a aVar2 = this.f70537e;
                                if (aVar2 != null) {
                                    C29658m.m59761a(this.f70545m, this.f70546n);
                                    aVar2.mo51411a();
                                    return;
                                }
                                return;
                            case 304:
                                int i3 = message.arg1;
                                C29577e eVar3 = this.f70533a;
                                if (eVar3 != null) {
                                    eVar3.mo51824c();
                                }
                                if (this.f70552t && i3 == 3 && !this.f70553u) {
                                    m59503e();
                                    this.f70553u = true;
                                    return;
                                }
                                return;
                            case 305:
                                HandlerC29663q qVar = this.f70534b;
                                if (qVar != null) {
                                    qVar.removeCallbacks(this.f70556x);
                                }
                                if (!this.f70552t && !this.f70553u) {
                                    m59503e();
                                    this.f70553u = true;
                                }
                                C29577e eVar4 = this.f70533a;
                                if (eVar4 != null) {
                                    eVar4.mo51824c();
                                    return;
                                }
                                return;
                            case 306:
                                C29577e eVar5 = this.f70533a;
                                if (eVar5 != null) {
                                    eVar5.mo51824c();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } else if (message.obj instanceof Long) {
                        this.f70545m = ((Long) message.obj).longValue();
                    }
                } else if (message.obj instanceof Long) {
                    this.f70546n = ((Long) message.obj).longValue();
                }
            }
        }

        /* renamed from: a */
        public final boolean mo51836a(C29582f fVar) {
            int i;
            MethodCollector.m26663i(10583);
            if (C29657l.m59760a(fVar.f70500b) || C29657l.m59760a(fVar.f70499a)) {
                C29644g.m59691e("No video info");
                MethodCollector.m26664o(10583);
                return false;
            }
            this.f70544l = fVar.f70505g;
            this.f70540h = fVar.f70501c;
            this.f70541i = fVar.f70510l;
            this.f70554v = fVar.f70506h;
            this.f70533a.f70494s = fVar.f70513o;
            if (fVar.f70508j) {
                C29577e eVar = this.f70533a;
                int i2 = fVar.f70511m;
                int i3 = fVar.f70512n;
                if (!(eVar.f70481f == null || (i2 == 0 && i3 == 0))) {
                    ((RelativeLayout.LayoutParams) eVar.f70481f.getLayoutParams()).setMargins(i2, i3, i2, i3);
                }
            }
            C29577e eVar2 = this.f70533a;
            boolean z = fVar.f70508j;
            boolean z2 = fVar.f70509k;
            if (eVar2.f70494s) {
                eVar2.f70482g.setVisibility(8);
                if (z) {
                    eVar2.f70479d.setVisibility(0);
                    eVar2.f70493r.setVisibility(0);
                    if (C29495h.f70180D) {
                        eVar2.f70492q.setVisibility(0);
                    }
                }
                if (z2) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) eVar2.f70491p.getLayoutParams();
                    layoutParams.height = C29654j.m59754h() - 4;
                    eVar2.f70491p.setLayoutParams(layoutParams);
                    eVar2.f70491p.setVisibility(4);
                    eVar2.f70489n.setPadding(4, 4, 0, 4);
                    eVar2.f70489n.setVisibility(0);
                    eVar2.f70490o.setBackgroundResource(R.drawable.bkm);
                    eVar2.f70490o.setTextColor(eVar2.f70486k.getResources().getColor(R.color.p_));
                }
            } else {
                eVar2.f70482g.setVisibility(8);
                if (z) {
                    eVar2.f70479d.setVisibility(0);
                    if (C29495h.f70180D) {
                        eVar2.f70477b.setVisibility(0);
                    }
                }
                if (z2) {
                    eVar2.f70476a.setVisibility(0);
                    eVar2.f70478c.setVisibility(0);
                }
                if (z && C29495h.f70178B == 1) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(11);
                    layoutParams2.setMargins(0, 0, (int) C29661o.m59767a(eVar2.f70486k, 10.0f), 0);
                    eVar2.f70476a.setLayoutParams(layoutParams2);
                    eVar2.f70476a.setPadding(0, 0, 0, (int) C29661o.m59767a(eVar2.f70486k, 10.0f));
                    eVar2.mo51822b();
                } else if (!z2) {
                    eVar2.mo51822b();
                }
            }
            C29577e eVar3 = this.f70533a;
            int i4 = fVar.f70502d;
            int i5 = fVar.f70503e;
            eVar3.f70483h = i4;
            eVar3.f70484i = i5;
            C29577e eVar4 = this.f70533a;
            int i6 = fVar.f70514p;
            if (C29495h.f70245u != null) {
                eVar4.f70479d.setImageResource(C29495h.f70245u.mo28673a(i6));
            }
            C29577e eVar5 = this.f70533a;
            ViewGroup viewGroup = this.f70542j;
            if (eVar5.f70485j.getParent() != null) {
                ((ViewGroup) eVar5.f70485j.getParent()).removeView(eVar5.f70485j);
            }
            viewGroup.addView(eVar5.f70485j);
            eVar5.mo51823b(0);
            int i7 = fVar.f70507i;
            if (!(this.f70533a.mo51820a() instanceof FrameLayout.LayoutParams)) {
                C29644g.m59688b("syncPositionForSplash layout params!");
            } else {
                this.f70542j.getLocationInWindow(this.f70548p);
                FrameLayout.LayoutParams a = this.f70533a.mo51820a();
                if (a != null) {
                    a.topMargin = i7;
                    a.leftMargin = 0;
                    a.gravity = 51;
                    this.f70533a.f70485j.setLayoutParams(a);
                }
            }
            this.f70534b = new HandlerC29663q(this);
            this.f70536d = new C29571c(this.f70534b);
            C29577e eVar6 = this.f70533a;
            int i8 = fVar.f70502d;
            if (i8 == -1) {
                i8 = eVar6.f70486k.getResources().getDisplayMetrics().widthPixels;
            }
            if (i8 > 0) {
                if (eVar6.f70483h <= 0 || eVar6.f70484i <= 0) {
                    i = 0;
                } else {
                    i = eVar6.f70486k.getResources().getDimensionPixelSize(R.dimen.su);
                    int dimensionPixelSize = eVar6.f70486k.getResources().getDimensionPixelSize(R.dimen.sv);
                    int i9 = (int) (((float) eVar6.f70484i) * ((((float) i8) * 1.0f) / ((float) eVar6.f70483h)));
                    if (i9 <= i) {
                        if (i9 < dimensionPixelSize) {
                            i = dimensionPixelSize;
                        } else {
                            i = i9;
                        }
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = eVar6.f70485j.getLayoutParams();
                layoutParams3.width = i8;
                if (i == -1 || i == -2 || i > 0) {
                    layoutParams3.height = i;
                }
                eVar6.f70485j.setLayoutParams(layoutParams3);
            }
            this.f70543k = 0;
            this.f70533a.f70482g.setVisibility(0);
            try {
                String str = fVar.f70499a;
                C29571c cVar = this.f70536d;
                if (cVar != null) {
                    cVar.mo51812a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0215: INVOKE  
                          (r1v9 'cVar' com.ss.android.ad.splash.core.video.c)
                          (wrap: com.ss.android.ad.splash.core.video.c$3 : 0x0212: CONSTRUCTOR  (r0v58 com.ss.android.ad.splash.core.video.c$3) = (r1v9 'cVar' com.ss.android.ad.splash.core.video.c), (r4v6 'str' java.lang.String) call: com.ss.android.ad.splash.core.video.c.3.<init>(com.ss.android.ad.splash.core.video.c, java.lang.String):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.android.ad.splash.core.video.c.a(java.lang.Runnable):void in method: com.ss.android.ad.splash.core.video.g.a(com.ss.android.ad.splash.core.video.f):boolean, file: classes9.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0212: CONSTRUCTOR  (r0v58 com.ss.android.ad.splash.core.video.c$3) = (r1v9 'cVar' com.ss.android.ad.splash.core.video.c), (r4v6 'str' java.lang.String) call: com.ss.android.ad.splash.core.video.c.3.<init>(com.ss.android.ad.splash.core.video.c, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.ad.splash.core.video.g.a(com.ss.android.ad.splash.core.video.f):boolean, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 28 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ad.splash.core.video.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 34 more
                        */
                    /*
                    // Method dump skipped, instructions count: 609
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.video.C29584g.mo51836a(com.ss.android.ad.splash.core.video.f):boolean");
                }

                public C29584g(Context context, ViewGroup viewGroup) {
                    this.f70542j = viewGroup;
                    this.f70551s = new WeakReference<>(context);
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C29577e eVar = new C29577e(context, C1764a.m5927a(LayoutInflater.from(applicationContext), R.layout.b0s, null, false));
                    this.f70533a = eVar;
                    eVar.f70488m = this;
                    int i = Build.VERSION.SDK_INT;
                    this.f70552t = true;
                }

                @Override // com.p2082ss.android.p2092ad.splash.core.video.C29577e.AbstractC29581a
                /* renamed from: a */
                public final void mo51831a(int i, int i2, int i3) {
                    C29644g.m59688b("surfaceChanged, format = " + i + ", width = " + i2 + ", height = " + i3);
                }
            }
