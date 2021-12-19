package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.a.f */
public final /* synthetic */ class View$OnClickListenerC63358f implements View.OnClickListener {

    /* renamed from: a */
    private final C63356e f143857a;

    static {
        Covode.recordClassIndex(74649);
    }

    View$OnClickListenerC63358f(C63356e eVar) {
        this.f143857a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C63356e eVar = this.f143857a;
        C31575b.m65859a();
        if (!C31575b.f75524a.mo57069e().isLogin()) {
            C58957c.m108318a((Activity) eVar.f143852a, "", "click_draft");
        } else {
            AVExternalServiceImpl.m113114a().asyncService("DraftBox", 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.services.IExternalService : 0x0020: INVOKE  (r2v0 com.ss.android.ugc.aweme.services.IExternalService) =  type: STATIC call: com.ss.android.ugc.aweme.out.AVExternalServiceImpl.a():com.ss.android.ugc.aweme.services.IExternalService)
                  ("DraftBox")
                  (wrap: com.ss.android.ugc.aweme.profile.a.e$1 : 0x0026: CONSTRUCTOR  (r1v0 com.ss.android.ugc.aweme.profile.a.e$1) = (r3v0 'eVar' com.ss.android.ugc.aweme.profile.a.e) call: com.ss.android.ugc.aweme.profile.a.e.1.<init>(com.ss.android.ugc.aweme.profile.a.e):void type: CONSTRUCTOR)
                 type: INTERFACE call: com.ss.android.ugc.aweme.services.IExternalService.asyncService(java.lang.String, com.ss.android.ugc.aweme.services.IExternalService$ServiceLoadCallback):void in method: com.ss.android.ugc.aweme.profile.a.f.onClick(android.view.View):void, file: classes5.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: CONSTRUCTOR  (r1v0 com.ss.android.ugc.aweme.profile.a.e$1) = (r3v0 'eVar' com.ss.android.ugc.aweme.profile.a.e) call: com.ss.android.ugc.aweme.profile.a.e.1.<init>(com.ss.android.ugc.aweme.profile.a.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.a.f.onClick(android.view.View):void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.profile.a.e, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.profile.a.e r3 = r4.f143857a
                com.p2082ss.android.ugc.aweme.account.C31575b.m65859a()
                com.ss.android.ugc.aweme.IAccountService r0 = com.p2082ss.android.ugc.aweme.account.C31575b.f75524a
                com.ss.android.ugc.aweme.IAccountUserService r0 = r0.mo57069e()
                boolean r0 = r0.isLogin()
                if (r0 != 0) goto L_0x0020
                android.content.Context r2 = r3.f143852a
                android.app.Activity r2 = (android.app.Activity) r2
                java.lang.String r1 = ""
                java.lang.String r0 = "click_draft"
                com.p2082ss.android.ugc.aweme.login.C58957c.m108318a(r2, r1, r0)
                return
            L_0x0020:
                com.ss.android.ugc.aweme.services.IExternalService r2 = com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl.m113114a()
                com.ss.android.ugc.aweme.profile.a.e$1 r1 = new com.ss.android.ugc.aweme.profile.a.e$1
                r1.<init>()
                java.lang.String r0 = "DraftBox"
                r2.asyncService(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3565a.View$OnClickListenerC63358f.onClick(android.view.View):void");
        }
    }
