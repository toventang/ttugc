package com.p2082ss.android.ugc.aweme.settingsrequest;

import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.p1007g.C14853c;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.experiment.C46872eb;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68021bg;
import com.p2082ss.android.ugc.aweme.setting.C68052ce;
import com.p2082ss.android.ugc.aweme.setting.IAbTestManager;
import com.p2082ss.android.ugc.aweme.settings.p3737a.C68723a;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68769a;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68773d;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3738a.C68768a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3740c.C68789d;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.a */
public class C68765a implements IAbTestManager, C68052ce.AbstractC68053a {

    /* renamed from: a */
    private static volatile C68765a f153820a;

    /* renamed from: b */
    private C13605d<AbstractC68021bg> f153821b = new C13605d<>();

    static {
        Covode.recordClassIndex(81040);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager, com.p2082ss.android.ugc.aweme.setting.C68052ce.AbstractC68053a
    public final void cG_() {
        C68769a.m121238a();
        C14853c.m27281b();
    }

    /* renamed from: f */
    private static void m121213f() {
        Keva.getRepoSync("ab_repo_cold_boot", 0).storeBoolean("clear_red_point_cost", true);
    }

    public C68765a() {
        C68052ce.f152437b.mo108671a(3, this);
    }

    /* renamed from: c */
    public static void m121210c() {
        m121211d();
        VideoBitRateABManager.f180314a.mo123828c();
        m121213f();
        C29902a.m60273a().initNotificationChannel();
        C1731i.m5640b(CallableC68782b.f153837a, C1731i.f5562a);
        C68768a.m121218a();
        m121212e();
    }

    /* renamed from: d */
    private static void m121211d() {
        boolean z = true;
        if (C16048b.m29633a().mo25421a(true, "use_surface_view", false) != C68789d.f153848a) {
            z = false;
        }
        C80771f.m140087a().storeBoolean("useSurfaceView", z);
    }

    /* renamed from: e */
    private static void m121212e() {
        Keva.getRepo("settings_v3_config", 1).storeBoolean("tt_use_libra_config_and", SettingsManager.m29616a().mo25400a("tt_use_libra_setting", false));
    }

    /* renamed from: b */
    public static C68765a m121209b() {
        MethodCollector.m26663i(11967);
        if (f153820a == null) {
            synchronized (C68765a.class) {
                try {
                    if (f153820a == null) {
                        f153820a = new C68765a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11967);
                    throw th;
                }
            }
        }
        C68765a aVar = f153820a;
        MethodCollector.m26664o(11967);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95589a(AbstractC68021bg bgVar) {
        this.f153821b.mo21864a(bgVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95588a(C28022o oVar) {
        C28022o oVar2 = new C28022o();
        oVar2.mo46797a("data", oVar);
        C68769a.m121239a(oVar2);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
    /* renamed from: a */
    public final void mo95587a(AbstractC28019l lVar) {
        if (lVar != null) {
            try {
                AbstractC88979t.m154294a(new C68773d(lVar)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                      (wrap: f.a.t : 0x001b: INVOKE  (r1v2 f.a.t) = 
                      (wrap: f.a.t : 0x0011: INVOKE  (r1v1 f.a.t) = 
                      (wrap: f.a.t : 0x0007: INVOKE  (r1v0 f.a.t) = 
                      (wrap: com.ss.android.ugc.aweme.settingsrequest.api.d : 0x0004: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.settingsrequest.api.d) = (r3v0 'lVar' com.google.gson.l) call: com.ss.android.ugc.aweme.settingsrequest.api.d.<init>(com.google.gson.l):void type: CONSTRUCTOR)
                     type: STATIC call: f.a.t.a(f.a.w):f.a.t)
                      (wrap: f.a.aa : 0x000d: INVOKE  (r0v3 f.a.aa) = (wrap: f.a.aa : 0x000b: SGET  (r0v2 f.a.aa) =  f.a.k.a.c f.a.aa) type: STATIC call: f.a.h.a.b(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.b(f.a.aa):f.a.t)
                      (wrap: f.a.aa : 0x0017: INVOKE  (r0v5 f.a.aa) = (wrap: f.a.aa : 0x0015: SGET  (r0v4 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: f.a.z : ?: CAST (f.a.z) (wrap: com.ss.android.ugc.aweme.settingsrequest.api.a$1 : 0x0021: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.settingsrequest.api.a$1) =  call: com.ss.android.ugc.aweme.settingsrequest.api.a.1.<init>():void type: CONSTRUCTOR))
                     type: VIRTUAL call: f.a.t.b(f.a.z):void in method: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (f.a.z) (wrap: com.ss.android.ugc.aweme.settingsrequest.api.a$1 : 0x0021: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.settingsrequest.api.a$1) =  call: com.ss.android.ugc.aweme.settingsrequest.api.a.1.<init>():void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.settingsrequest.api.a$1) =  call: com.ss.android.ugc.aweme.settingsrequest.api.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.settingsrequest.api.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                    this = this;
                    if (r3 == 0) goto L_0x002c
                    com.ss.android.ugc.aweme.settingsrequest.api.d r0 = new com.ss.android.ugc.aweme.settingsrequest.api.d     // Catch:{ Exception -> 0x0028 }
                    r0.<init>(r3)     // Catch:{ Exception -> 0x0028 }
                    f.a.t r1 = p4560f.p4561a.AbstractC88979t.m154294a(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.t r1 = r1.mo143278b(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = p4560f.p4561a.p4562a.p4564b.C88392a.f200660a     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = p4560f.p4561a.p4562a.p4563a.C88391a.m153580a(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.t r1 = r1.mo143261a(r0)     // Catch:{ Exception -> 0x0028 }
                    com.ss.android.ugc.aweme.settingsrequest.api.a$1 r0 = new com.ss.android.ugc.aweme.settingsrequest.api.a$1     // Catch:{ Exception -> 0x0028 }
                    r0.<init>()     // Catch:{ Exception -> 0x0028 }
                    r1.mo143062b(r0)     // Catch:{ Exception -> 0x0028 }
                    return
                L_0x0028:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x002c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.settingsrequest.C68765a.mo95587a(com.google.gson.l):void");
            }

            @Override // com.p2082ss.android.ugc.aweme.setting.IAbTestManager
            /* renamed from: a */
            public final void mo95590a(boolean z) {
                C68052ce.f152437b.mo108672a(3, z);
                if (z) {
                    if (C46872eb.f109220d) {
                        C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.settingsrequest.C68765a.RunnableC687661 */

                            static {
                                Covode.recordClassIndex(81041);
                            }

                            public final void run() {
                                C1731i.m5640b(new CallableC68785c(this), C1731i.f5562a);
                            }
                        }, 300);
                    } else {
                        m121210c();
                    }
                    C51423a.m95784a(4, "InterestSelectExperiment", "ab value refresh success,start to notify");
                    try {
                        Iterator<AbstractC68021bg> it = this.f153821b.iterator();
                        while (it.hasNext()) {
                            AbstractC68021bg next = it.next();
                            if (next != null) {
                                next.mo84734bI();
                            }
                        }
                    } catch (ConcurrentModificationException e) {
                        C51423a.m95790a((Throwable) e);
                    }
                    if (C46872eb.f109220d) {
                        C12895a.f31387b.f31389a.post(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.settingsrequest.C68765a.RunnableC687672 */

                            static {
                                Covode.recordClassIndex(81042);
                            }

                            public final void run() {
                                SettingsRequestServiceImpl.m65417i().mo57276a(C17867d.m33078a());
                            }
                        });
                        return;
                    }
                    C68723a.m121159a(SettingsManager.m29616a().mo25400a("enable_safe_view_checker", false));
                    SettingsRequestServiceImpl.m65417i().mo57276a(C17867d.m33078a());
                }
            }
        }
