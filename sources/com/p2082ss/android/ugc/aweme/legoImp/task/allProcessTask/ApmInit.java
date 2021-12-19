package com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.bytedance.apm.C12255a;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.config.C12415a;
import com.bytedance.apm.config.C12417b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p779k.p781b.AbstractC12525b;
import com.bytedance.apm.p788p.C12566c;
import com.bytedance.apm.trace.C12633d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.monitor.collector.C21478d;
import com.bytedance.monitor.collector.C21512o;
import com.bytedance.monitor.collector.p1551a.C21471a;
import com.bytedance.monitor.p1546a.p1550c.C21455a;
import com.bytedance.monitor.p1546a.p1550c.C21456b;
import com.p2082ss.android.ugc.aweme.experiment.C46883ek;
import com.p2082ss.android.ugc.aweme.experiment.C46889el;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.lang.reflect.Field;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit */
public final class ApmInit implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68665);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048573;
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
        return EnumC58151ae.MAIN;
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

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit$a */
    static final class C58424a implements AbstractC12525b {

        /* renamed from: a */
        public static final C58424a f133033a = new C58424a();

        static {
            Covode.recordClassIndex(68666);
        }

        C58424a() {
        }

        @Override // com.bytedance.apm.p779k.p781b.AbstractC12525b
        /* renamed from: a */
        public final void mo20359a(Activity activity) {
            C89219l.m154716b(activity, "");
            activity.getLocalClassName();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        long j;
        C58945a.C58947b.f134185a.mo96425a("method_init_apm_duration", false);
        if (((Boolean) C46883ek.f109256a.getValue()).booleanValue()) {
            C21512o.f51059a = true;
        }
        if (((Boolean) C46883ek.f109257b.getValue()).booleanValue()) {
            MainLooperOptService.f132758h = false;
        }
        Application a = C17879g.m33104a();
        C12633d dVar = new C12633d();
        dVar.f30753b = true;
        dVar.f30752a = 50000;
        C12417b.C12418a a2 = C12417b.m22355a();
        C12415a.C12416a aVar = new C12415a.C12416a((byte) 0);
        aVar.f30028a = false;
        aVar.f30030c = true;
        aVar.f30029b = 60000;
        aVar.f30031d = true;
        aVar.f30032e = C58424a.f133033a;
        a2.f30069r = new C12415a(aVar);
        try {
            C21478d.f50919a = (Handler) C21471a.m40329a(Choreographer.getInstance(), "mHandler");
            C21478d.f50921c = C21471a.m40329a(Choreographer.getInstance(), "mDisplayEventReceiver");
            Field a3 = C21471a.m40330a((Class<?>) Choreographer.class, "mHandler");
            Object a4 = C21455a.m40297a(C21455a.m40298a(C21456b.f50860a, "objectFieldOffset", Field.class), C21456b.f50861b, a3);
            if (a4 == null) {
                j = 0;
            } else {
                j = ((Long) a4).longValue();
            }
            Choreographer instance = Choreographer.getInstance();
            C21478d.HandlerC21479a aVar2 = C21478d.f50920b;
            Object a5 = C21455a.m40297a(C21455a.m40298a(C21456b.f50860a, "putObject", Object.class, Long.TYPE, Object.class), C21456b.f50861b, instance, Long.valueOf(j), aVar2);
            if (a5 != null) {
                ((Long) a5).longValue();
            }
        } catch (Exception unused) {
        }
        a2.f30060i = C46889el.f109268b;
        C12255a aVar3 = C12255a.C12259a.f29537a;
        ApmDelegate.C12507a.f30372a.f30335c = dVar;
        ApmDelegate.C12507a.f30372a.mo20328a(a, a2.mo20211a());
        if (C12397c.f29933c) {
            C12566c.m22611a().mo20395a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f2: INVOKE  
                  (wrap: com.bytedance.apm.p.c : 0x00e9: INVOKE  (r1v1 com.bytedance.apm.p.c) =  type: STATIC call: com.bytedance.apm.p.c.a():com.bytedance.apm.p.c)
                  (wrap: com.bytedance.apm.a$2 : 0x00ef: CONSTRUCTOR  (r0v18 com.bytedance.apm.a$2) = (r2v1 'aVar3' com.bytedance.apm.a) call: com.bytedance.apm.a.2.<init>(com.bytedance.apm.a):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.apm.p.c.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit.a(android.content.Context):void, file: classes.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ef: CONSTRUCTOR  (r0v18 com.bytedance.apm.a$2) = (r2v1 'aVar3' com.bytedance.apm.a) call: com.bytedance.apm.a.2.<init>(com.bytedance.apm.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit.a(android.content.Context):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit.mo28600a(android.content.Context):void");
        }
    }
