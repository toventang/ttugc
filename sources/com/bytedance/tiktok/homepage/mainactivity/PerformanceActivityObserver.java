package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.aweme.core.C12899a;
import com.bytedance.aweme.core.C12904b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.liko.leakdetector.AbstractC20856b;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22014v;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.p2152i.C29944a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarBorderView;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.p2082ss.android.ugc.aweme.experiment.C46714av;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.experiment.C46805cu;
import com.p2082ss.android.ugc.aweme.experiment.C46806cv;
import com.p2082ss.android.ugc.aweme.experiment.C46825dd;
import com.p2082ss.android.ugc.aweme.experiment.C46870e;
import com.p2082ss.android.ugc.aweme.experiment.C46919ez;
import com.p2082ss.android.ugc.aweme.experiment.C46986gs;
import com.p2082ss.android.ugc.aweme.homepage.business.C52967b;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.p2340at.C33956a;
import com.p2082ss.android.ugc.aweme.p2340at.C33957b;
import com.p2082ss.android.ugc.aweme.p2433ca.C35350g;
import com.p2082ss.android.ugc.aweme.p2433ca.C35351h;
import com.p2082ss.android.ugc.aweme.p2726da.C40928a;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C90205x;
import p4600h.p4611f.p4613b.C89219l;

public class PerformanceActivityObserver {

    /* renamed from: a */
    private boolean f53699a;

    /* renamed from: b */
    private boolean f53700b;

    interface FileApi {
        static {
            Covode.recordClassIndex(26622);
        }

        @AbstractC22012t
        @AbstractC22009q
        AbstractC21983b<String> upload(@AbstractC21993ag String str, @AbstractC22014v List<C90205x.C90207b> list);
    }

    static {
        Covode.recordClassIndex(26621);
    }

    /* access modifiers changed from: package-private */
    public class LikoInitTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(26623);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BACKGROUND;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        LikoInitTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            try {
                AbstractC20856b.C20857a.f49313a = new C22757m(this);
                LeakDetectorInstaller.INSTANCE.tryInstall(context);
                if (C17867d.f42590n > 0) {
                    C17873f.m33099g().mo143289d(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: INVOKE  
                          (wrap: f.a.t<java.lang.Boolean> : 0x001e: INVOKE  (r1v0 f.a.t<java.lang.Boolean>) =  type: STATIC call: com.bytedance.ies.ugc.appcontext.f.g():f.a.t)
                          (wrap: com.bytedance.liko.a.b$1 : 0x0024: CONSTRUCTOR  (r0v5 com.bytedance.liko.a.b$1) = 
                          (wrap: android.os.Handler : 0x0016: CONSTRUCTOR  (r3v0 android.os.Handler) = 
                          (wrap: android.os.Looper : 0x0012: INVOKE  (r0v4 android.os.Looper) =  type: STATIC call: android.os.Looper.getMainLooper():android.os.Looper)
                         call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.liko.a.b$b : 0x001b: CONSTRUCTOR  (r2v0 com.bytedance.liko.a.b$b) =  call: com.bytedance.liko.a.b.b.<init>():void type: CONSTRUCTOR)
                         call: com.bytedance.liko.a.b.1.<init>(android.os.Handler, com.bytedance.liko.a.b$b):void type: CONSTRUCTOR)
                         type: VIRTUAL call: f.a.t.d(f.a.d.f):f.a.b.b in method: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.a(android.content.Context):void, file: classes2.dex
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r0v5 com.bytedance.liko.a.b$1) = 
                          (wrap: android.os.Handler : 0x0016: CONSTRUCTOR  (r3v0 android.os.Handler) = 
                          (wrap: android.os.Looper : 0x0012: INVOKE  (r0v4 android.os.Looper) =  type: STATIC call: android.os.Looper.getMainLooper():android.os.Looper)
                         call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.liko.a.b$b : 0x001b: CONSTRUCTOR  (r2v0 com.bytedance.liko.a.b$b) =  call: com.bytedance.liko.a.b.b.<init>():void type: CONSTRUCTOR)
                         call: com.bytedance.liko.a.b.1.<init>(android.os.Handler, com.bytedance.liko.a.b$b):void type: CONSTRUCTOR in method: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.a(android.content.Context):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.liko.a.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                        this = this;
                        com.bytedance.tiktok.homepage.mainactivity.m r0 = new com.bytedance.tiktok.homepage.mainactivity.m     // Catch:{ all -> 0x004d }
                        r0.<init>(r4)     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.leakdetector.AbstractC20856b.C20857a.f49313a = r0     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.leakdetector.LeakDetectorInstaller r0 = com.bytedance.liko.leakdetector.LeakDetectorInstaller.INSTANCE     // Catch:{ all -> 0x004d }
                        r0.tryInstall(r5)     // Catch:{ all -> 0x004d }
                        int r0 = com.bytedance.ies.ugc.appcontext.C17867d.f42590n     // Catch:{ all -> 0x004d }
                        if (r0 <= 0) goto L_0x0046
                        android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x004d }
                        android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x004d }
                        r3.<init>(r0)     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.a.b$b r2 = new com.bytedance.liko.a.b$b     // Catch:{ all -> 0x004d }
                        r2.<init>()     // Catch:{ all -> 0x004d }
                        f.a.t r1 = com.bytedance.ies.ugc.appcontext.C17873f.m33099g()     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.a.b$1 r0 = new com.bytedance.liko.a.b$1     // Catch:{ all -> 0x004d }
                        r0.<init>(r3, r2)     // Catch:{ all -> 0x004d }
                        r1.mo143289d(r0)     // Catch:{ all -> 0x004d }
                        android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C17867d.m33078a()     // Catch:{ all -> 0x004d }
                        android.content.res.Resources r0 = r1.getResources()     // Catch:{ all -> 0x004d }
                        android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x004d }
                        int r0 = r0.widthPixels     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.p1484b.C20839c.f49279b = r0     // Catch:{ all -> 0x004d }
                        android.content.res.Resources r0 = r1.getResources()     // Catch:{ all -> 0x004d }
                        android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x004d }
                        int r0 = r0.heightPixels     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.p1484b.C20839c.f49280c = r0     // Catch:{ all -> 0x004d }
                    L_0x0046:
                        com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$2 r0 = new com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver$LikoInitTask$2     // Catch:{ all -> 0x004d }
                        r0.<init>()     // Catch:{ all -> 0x004d }
                        com.bytedance.liko.leakdetector.strategy.p1488a.p1489a.C20871d.f49358a = r0     // Catch:{ all -> 0x004d }
                    L_0x004d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver.LikoInitTask.mo28600a(android.content.Context):void");
                }
            }

            /* renamed from: a */
            static void m42873a(ActivityC0945e eVar) {
                if (C46806cv.f109047a || C46919ez.m90220b() || C46805cu.f109046c || C35351h.m72352a()) {
                    C40928a.f95750a.mo70123a();
                }
                if (C46870e.f109214b) {
                    ((X2CAdWebPage) C58221f.m105149b(X2CAdWebPage.class)).mo67523a((Activity) eVar);
                }
                C61439n.f139483c = C46796cm.f109016a;
                LocationServiceImpl.m145036c().mo129342a(C46796cm.f109016a);
            }

            /* renamed from: a */
            public final void mo37052a(ActivityC0945e eVar, Hox hox) {
                if (!C46714av.m90101c()) {
                    C58221f.m105153e().mo95704a(new PreloadActicityTask()).mo95704a(C52967b.m97879a(hox)).mo95706a();
                }
                C12904b.C12905a aVar = new C12904b.C12905a();
                aVar.f31424b = 30;
                aVar.f31423a = C12904b.EnumC12906b.COMMIT;
                C12904b a = aVar.mo20733a();
                C89219l.m154719c(a, "");
                C89219l.m154719c(a, "");
                C12899a.f31397d = a;
                if (!C12899a.f31396c) {
                    C12899a.f31395b = Choreographer.getInstance();
                    C12899a.f31400g = C12899a.m23145a();
                    while (true) {
                        if (C12899a.f31394a < 0) {
                            break;
                        }
                        try {
                            Method method = C12899a.f31400g;
                            if (method == null) {
                                C89219l.m154707a();
                            }
                            C12899a.m23144a(method, C12899a.f31395b, new Object[]{Integer.valueOf(C12899a.f31394a), C12899a.f31401h, null, 0});
                        } catch (Exception unused) {
                            if (C12899a.f31394a == 0) {
                                C12899a.f31400g = null;
                            }
                            C12899a.f31394a--;
                        }
                    }
                    C12899a.f31396c = true;
                }
                C58016d.f132224e = true;
                C29944a.f71429a = C46796cm.f109016a;
                if (C46714av.m90100b()) {
                    C35350g.m72350a(new RunnableC22755k(this, eVar));
                } else {
                    m42873a(eVar);
                }
            }

            /* renamed from: a */
            public final void mo37053a(ActivityC0945e eVar, boolean z) {
                if (z) {
                    if (C58140b.m105075a()) {
                        if (C33956a.f80310a.isEmpty()) {
                            C33956a.f80310a.put("system_launch", new AtomicBoolean(false));
                            C33956a.f80310a.put("system_launch_1_minute", new AtomicBoolean(false));
                            C33956a.f80310a.put("system_launch_1_minute_feed", new AtomicBoolean(false));
                            C33956a.f80310a.put("system_launch_2_minute", new AtomicBoolean(false));
                            C33956a.f80310a.put("system_launch_2_minute_feed", new AtomicBoolean(false));
                        }
                        Iterator<AtomicBoolean> it = C33956a.f80310a.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().get()) {
                                    break;
                                }
                            } else {
                                C80330da.C80331a.m139266a("system_launch").mo123697a();
                                if (C46986gs.m90266b()) {
                                    C80330da.C80331a.m139266a("system_launch_1_minute").mo123697a();
                                }
                                if (C46986gs.m90267c()) {
                                    C80330da.C80331a.m139266a("system_launch_1_minute_feed").mo123697a();
                                }
                                if (C46986gs.m90268d()) {
                                    C80330da.C80331a.m139266a("system_launch_2_minute").mo123697a();
                                }
                                if (C46986gs.m90269e()) {
                                    C80330da.C80331a.m139266a("system_launch_2_minute_feed").mo123697a();
                                }
                                C17873f.m33099g().mo143289d(C33957b.f80320a);
                            }
                        }
                        if (!this.f53699a) {
                            this.f53699a = true;
                            C58221f.m105153e().mo95704a(new LikoInitTask()).mo95706a();
                            if (!C67261e.m119188f()) {
                                C1870c.m6049a((Context) eVar, (int) R.layout.aj2);
                                C1870c.m6049a((Context) eVar, (int) R.layout.ld);
                            }
                        }
                    }
                    if (!this.f53700b) {
                        this.f53700b = true;
                        C58254p.f132679a.postDelayed(RunnableC22756l.f53746a, 10000);
                    }
                    SmartAvatarBorderView.setOpt(C46825dd.f109088a);
                }
            }
        }
