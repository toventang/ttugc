package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.C16073e;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.abmock.C16087n;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.datacenter.AbstractC16068g;
import com.bytedance.ies.abmock.datacenter.C16051a;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a;
import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46676a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2717cu.p2718a.C40762a;
import java.util.List;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask */
public class ABTask implements AbstractC58264w {

    /* renamed from: a */
    private static volatile boolean f132790a;

    static {
        Covode.recordClassIndex(68385);
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
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$a */
    static class C58302a extends C16051a {
        static {
            Covode.recordClassIndex(68386);
        }

        C58302a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$b */
    static class C58303b extends C16087n {

        /* renamed from: a */
        private Boolean f132791a;

        /* renamed from: b */
        private Boolean f132792b;

        static {
            Covode.recordClassIndex(68387);
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: b */
        public final boolean mo25498b() {
            return true;
        }

        C58303b() {
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: c */
        public final AbstractC16052a mo25499c() {
            return ConfigMock.INSTANCE;
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: d */
        public final String mo25500d() {
            try {
                String curUserId = C31575b.m65865g().getCurUserId();
                if (curUserId == null) {
                    return "";
                }
                return curUserId;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: f */
        public final boolean mo25502f() {
            return ((Boolean) C46676a.f108827a.getValue()).booleanValue();
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: a */
        public final boolean mo25497a() {
            if (this.f132791a == null) {
                this.f132791a = Boolean.valueOf(C13627m.m24499a(C17867d.f42595s, "lark_inhouse"));
            }
            if (this.f132791a.booleanValue()) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: e */
        public final boolean mo25501e() {
            if (this.f132792b == null) {
                this.f132792b = Boolean.valueOf(Keva.getRepoSync("settings_v3_config", 1).getBoolean("tt_use_libra_config_and", false));
            }
            return this.f132792b.booleanValue();
        }

        @Override // com.bytedance.ies.abmock.C16087n, com.bytedance.ies.abmock.datacenter.AbstractC16067f
        /* renamed from: a */
        public final void mo25496a(String str) {
            AppLog.setAbSDKVersion(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ABTask$c */
    static class C58304c extends AbstractC16068g {
        static {
            Covode.recordClassIndex(68388);
        }

        C58304c() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        if (!f132790a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        MethodCollector.m26663i(1302);
        if (!f132790a) {
            synchronized (ABTask.class) {
                try {
                    if (!f132790a) {
                        C58945a.C58947b.f134185a.mo96425a("method_abtask_run_duration", false);
                        C58945a.C58947b.f134185a.mo96425a("method_abtask_anole_duration", false);
                        C89219l.m154719c(new C40762a(), "");
                        C58945a.C58947b.f134185a.mo96429b("method_abtask_anole_duration", false);
                        C58945a.C58947b.f134185a.mo96425a("method_abtask_provider_duration", false);
                        C58303b bVar = new C58303b();
                        C58945a.C58947b.f134185a.mo96429b("method_abtask_provider_duration", false);
                        C58945a.C58947b.f134185a.mo96425a("method_abtask_abvalue_duration", false);
                        C58302a aVar = new C58302a();
                        C58945a.C58947b.f134185a.mo96429b("method_abtask_abvalue_duration", false);
                        C58945a.C58947b.f134185a.mo96425a("method_abtask_setting_duration", false);
                        C58304c cVar = new C58304c();
                        C58945a.C58947b.f134185a.mo96429b("method_abtask_setting_duration", false);
                        C58945a.C58947b.f134185a.mo96425a("method_abtask_init_duration", false);
                        C16083j a = C16083j.m29874a();
                        Application application = (Application) C17867d.m33078a();
                        a.f38733a = application;
                        a.f38734b = bVar;
                        C16048b.m29633a().f38663a = aVar;
                        SettingsManager.m29616a().f38656a = cVar;
                        C16073e.m29864a();
                        C16065e a2 = C16065e.m29769a();
                        AbstractC16052a d = C16083j.m29874a().mo25539d();
                        boolean c = C16083j.m29874a().mo25538c();
                        a2.f38695b = bVar;
                        a2.f38694a = d;
                        a2.f38696c = c;
                        C1731i.m5631a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo5532a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b2: INVOKE  
                              (wrap: b.i<java.lang.Void> : 0x00a9: INVOKE  (r1v12 b.i<java.lang.Void>) = 
                              (wrap: long : ?: CAST (long) (wrap: ?? : ?: SGET   com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT long))
                             type: STATIC call: b.i.a(long):b.i)
                              (wrap: com.bytedance.ies.abmock.datacenter.e$1 : 0x00af: CONSTRUCTOR  (r0v21 com.bytedance.ies.abmock.datacenter.e$1) = (r3v1 'a2' com.bytedance.ies.abmock.datacenter.e) call: com.bytedance.ies.abmock.datacenter.e.1.<init>(com.bytedance.ies.abmock.datacenter.e):void type: CONSTRUCTOR)
                             type: VIRTUAL call: b.i.a(b.g):b.i in method: com.ss.android.ugc.aweme.legoImp.task.ABTask.a(android.content.Context):void, file: classes.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00af: CONSTRUCTOR  (r0v21 com.bytedance.ies.abmock.datacenter.e$1) = (r3v1 'a2' com.bytedance.ies.abmock.datacenter.e) call: com.bytedance.ies.abmock.datacenter.e.1.<init>(com.bytedance.ies.abmock.datacenter.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.ABTask.a(android.content.Context):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 38 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.abmock.datacenter.e, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 44 more
                            */
                        /*
                        // Method dump skipped, instructions count: 234
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.ABTask.mo28600a(android.content.Context):void");
                    }
                }
