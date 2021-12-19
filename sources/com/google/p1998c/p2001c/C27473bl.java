package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bl */
public final class C27473bl<E> extends AbstractC27381ai<E> {

    /* renamed from: a */
    final transient E f64801a;

    /* renamed from: b */
    private transient int f64802b;

    static {
        Covode.recordClassIndex(33053);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final boolean mo45578a() {
        return false;
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    /* renamed from: c */
    public final boolean mo45579c() {
        if (this.f64802b != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    /* renamed from: d */
    public final AbstractC27540z<E> mo45656d() {
        return AbstractC27540z.m55063of(this.f64801a);
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
    public final AbstractC27479br<E> iterator() {
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: RETURN  
              (wrap: com.google.c.c.an$3 : 0x0004: CONSTRUCTOR  (r0v0 com.google.c.c.an$3) = 
              (wrap: E : 0x0000: IGET  (r1v0 E) = (r2v0 'this' com.google.c.c.bl<E> A[IMMUTABLE_TYPE, THIS]) com.google.c.c.bl.a java.lang.Object)
             call: com.google.c.c.an.3.<init>(java.lang.Object):void type: CONSTRUCTOR)
             in method: com.google.c.c.bl.iterator():com.google.c.c.br<E>, file: classes9.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: CONSTRUCTOR  (r0v0 com.google.c.c.an$3) = 
              (wrap: E : 0x0000: IGET  (r1v0 E) = (r2v0 'this' com.google.c.c.bl<E> A[IMMUTABLE_TYPE, THIS]) com.google.c.c.bl.a java.lang.Object)
             call: com.google.c.c.an.3.<init>(java.lang.Object):void type: CONSTRUCTOR in method: com.google.c.c.bl.iterator():com.google.c.c.br<E>, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.c.c.an, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            E r1 = r2.f64801a
            com.google.c.c.an$3 r0 = new com.google.c.c.an$3
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2001c.C27473bl.iterator():com.google.c.c.br");
    }

    @Override // com.google.p1998c.p2001c.AbstractC27381ai
    public final int hashCode() {
        int i = this.f64802b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f64801a.hashCode();
        this.f64802b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "[" + this.f64801a.toString() + ']';
    }

    @Override // com.google.p1998c.p2001c.AbstractC27536x
    public final boolean contains(Object obj) {
        return this.f64801a.equals(obj);
    }

    C27473bl(E e) {
        this.f64801a = (E) C27245k.m54229a(e);
    }

    C27473bl(E e, int i) {
        this.f64801a = e;
        this.f64802b = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27536x
    /* renamed from: a */
    public final int mo45633a(Object[] objArr, int i) {
        objArr[i] = this.f64801a;
        return i + 1;
    }
}
