package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18079b;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.j */
final /* synthetic */ class C42417j implements AbstractC1729g {

    /* renamed from: a */
    private final C42412i f98830a;

    /* renamed from: b */
    private final C42427n f98831b;

    static {
        Covode.recordClassIndex(50362);
    }

    C42417j(C42412i iVar, C42427n nVar) {
        this.f98830a = iVar;
        this.f98831b = nVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C42412i iVar2 = this.f98830a;
        C42427n nVar = this.f98831b;
        iVar2.f98816d = System.currentTimeMillis();
        C18079b bVar = (C18079b) iVar.mo5545d();
        if (bVar != null) {
            bVar.mo28838a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: INVOKE  
                  (r1v1 'bVar' com.bytedance.ies.ugc.aweme.network.a.b)
                  (wrap: com.ss.android.ugc.aweme.discover.mixfeed.i$1 : 0x0014: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.discover.mixfeed.i$1) = 
                  (r3v0 'iVar2' com.ss.android.ugc.aweme.discover.mixfeed.i)
                  (r2v0 'nVar' com.ss.android.ugc.aweme.discover.mixfeed.n)
                  (r5v0 'iVar' b.i)
                 call: com.ss.android.ugc.aweme.discover.mixfeed.i.1.<init>(com.ss.android.ugc.aweme.discover.mixfeed.i, com.ss.android.ugc.aweme.discover.mixfeed.n, b.i):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.ies.ugc.aweme.network.a.b.a(com.bytedance.ies.ugc.aweme.network.a.a):void in method: com.ss.android.ugc.aweme.discover.mixfeed.j.then(b.i):java.lang.Object, file: classes7.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.discover.mixfeed.i$1) = 
                  (r3v0 'iVar2' com.ss.android.ugc.aweme.discover.mixfeed.i)
                  (r2v0 'nVar' com.ss.android.ugc.aweme.discover.mixfeed.n)
                  (r5v0 'iVar' b.i)
                 call: com.ss.android.ugc.aweme.discover.mixfeed.i.1.<init>(com.ss.android.ugc.aweme.discover.mixfeed.i, com.ss.android.ugc.aweme.discover.mixfeed.n, b.i):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.discover.mixfeed.j.then(b.i):java.lang.Object, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.discover.mixfeed.i, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.discover.mixfeed.i r3 = r4.f98830a
                com.ss.android.ugc.aweme.discover.mixfeed.n r2 = r4.f98831b
                long r0 = java.lang.System.currentTimeMillis()
                r3.f98816d = r0
                java.lang.Object r1 = r5.mo5545d()
                com.bytedance.ies.ugc.aweme.network.a.b r1 = (com.bytedance.ies.ugc.aweme.network.p1264a.C18079b) r1
                if (r1 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.discover.mixfeed.i$1 r0 = new com.ss.android.ugc.aweme.discover.mixfeed.i$1
                r0.<init>(r2, r5)
                r1.mo28838a(r0)
            L_0x001a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.mixfeed.C42417j.then(b.i):java.lang.Object");
        }
    }
