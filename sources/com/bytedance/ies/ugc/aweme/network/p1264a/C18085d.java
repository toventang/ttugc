package com.bytedance.ies.ugc.aweme.network.p1264a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.ugc.aweme.network.a.d */
public final class C18085d<T> implements AbstractC22043e<TypedInput, C18079b<T>> {

    /* renamed from: a */
    public final C27910f f43054a;

    /* renamed from: b */
    public final AbstractC28031v<T> f43055b;

    static {
        Covode.recordClassIndex(20722);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.retrofit2.AbstractC22043e
    /* renamed from: a */
    public final /* synthetic */ Object mo11580a(TypedInput typedInput) {
        final TypedInput typedInput2 = typedInput;
        C18090g gVar = new C18090g(typedInput2.mo11577in());
        C18087e eVar = new C18087e();
        final C18079b bVar = new C18079b(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR  (r2v1 'bVar' com.bytedance.ies.ugc.aweme.network.a.b A[DONT_INLINE]) = 
              (wrap: com.bytedance.ies.ugc.aweme.network.a.g$1 : 0x0012: CONSTRUCTOR  (r0v1 com.bytedance.ies.ugc.aweme.network.a.g$1) = (r2v0 'gVar' com.bytedance.ies.ugc.aweme.network.a.g), (r1v0 'eVar' com.bytedance.ies.ugc.aweme.network.a.e) call: com.bytedance.ies.ugc.aweme.network.a.g.1.<init>(com.bytedance.ies.ugc.aweme.network.a.g, com.bytedance.ies.ugc.aweme.network.a.e):void type: CONSTRUCTOR)
             call: com.bytedance.ies.ugc.aweme.network.a.b.<init>(com.bytedance.ies.ugc.aweme.network.a.b$a):void type: CONSTRUCTOR in method: com.bytedance.ies.ugc.aweme.network.a.d.a(com.bytedance.retrofit2.mime.TypedInput):java.lang.Object, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r0v1 com.bytedance.ies.ugc.aweme.network.a.g$1) = (r2v0 'gVar' com.bytedance.ies.ugc.aweme.network.a.g), (r1v0 'eVar' com.bytedance.ies.ugc.aweme.network.a.e) call: com.bytedance.ies.ugc.aweme.network.a.g.1.<init>(com.bytedance.ies.ugc.aweme.network.a.g, com.bytedance.ies.ugc.aweme.network.a.e):void type: CONSTRUCTOR in method: com.bytedance.ies.ugc.aweme.network.a.d.a(com.bytedance.retrofit2.mime.TypedInput):java.lang.Object, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.ugc.aweme.network.a.g, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.retrofit2.mime.TypedInput r4 = (com.bytedance.retrofit2.mime.TypedInput) r4
            com.bytedance.ies.ugc.aweme.network.a.g r2 = new com.bytedance.ies.ugc.aweme.network.a.g
            java.io.InputStream r0 = r4.mo11577in()
            r2.<init>(r0)
            com.bytedance.ies.ugc.aweme.network.a.e r1 = new com.bytedance.ies.ugc.aweme.network.a.e
            r1.<init>()
            com.bytedance.ies.ugc.aweme.network.a.g$1 r0 = new com.bytedance.ies.ugc.aweme.network.a.g$1
            r0.<init>(r1)
            com.bytedance.ies.ugc.aweme.network.a.b r2 = new com.bytedance.ies.ugc.aweme.network.a.b
            r2.<init>(r0)
            r2.f43044b = r1
            com.bytedance.ies.ugc.aweme.network.a.d$1 r0 = new com.bytedance.ies.ugc.aweme.network.a.d$1
            r0.<init>(r4, r2)
            com.bytedance.ies.ugc.aweme.network.a.b$1 r1 = new com.bytedance.ies.ugc.aweme.network.a.b$1
            r1.<init>(r0)
            com.bytedance.ies.ugc.aweme.network.a.b$2 r0 = new com.bytedance.ies.ugc.aweme.network.a.b$2
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.network.p1264a.C18085d.mo11580a(java.lang.Object):java.lang.Object");
    }

    C18085d(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f43054a = fVar;
        this.f43055b = vVar;
    }
}
