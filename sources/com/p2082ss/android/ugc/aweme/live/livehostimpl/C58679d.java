package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.livehostimpl.C58650a;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.d */
final /* synthetic */ class C58679d implements IAVEffectService.IAVEffectReadyCallback {

    /* renamed from: a */
    private final C58650a f133590a;

    /* renamed from: b */
    private final C1743j f133591b;

    static {
        Covode.recordClassIndex(68981);
    }

    C58679d(C58650a aVar, C1743j jVar) {
        this.f133590a = aVar;
        this.f133591b = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(Object obj) {
        C58650a aVar = this.f133590a;
        C1743j jVar = this.f133591b;
        IAVEffectService.ResourceFinder resourceFinder = (IAVEffectService.ResourceFinder) obj;
        C58650a.C586511 r0 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r0v0 'r0' com.ss.android.ugc.aweme.live.livehostimpl.a$1) = 
              (r1v0 'aVar' com.ss.android.ugc.aweme.live.livehostimpl.a)
              (r4v1 'resourceFinder' com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$ResourceFinder)
             call: com.ss.android.ugc.aweme.live.livehostimpl.a.1.<init>(com.ss.android.ugc.aweme.live.livehostimpl.a, com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$ResourceFinder):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.live.livehostimpl.d.finish(java.lang.Object):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.live.livehostimpl.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.live.livehostimpl.a r1 = r3.f133590a
            b.j r2 = r3.f133591b
            com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$ResourceFinder r4 = (com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.ResourceFinder) r4
            com.ss.android.ugc.aweme.live.livehostimpl.a$1 r0 = new com.ss.android.ugc.aweme.live.livehostimpl.a$1
            r0.<init>(r4)
            if (r4 == 0) goto L_0x0011
            r2.mo5555a(r0)
            return
        L_0x0011:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Decompress failed"
            r1.<init>(r0)
            r2.mo5556b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58679d.finish(java.lang.Object):void");
    }
}
