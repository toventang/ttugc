package com.p2082ss.android.ugc.aweme.bitrateselector.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.impl.C34858a;
import com.p2082ss.android.ugc.aweme.bitrateselector.impl.C34873c;
import com.p2082ss.android.ugc.aweme.bitrateselector.impl.C34875d;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34849b;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.C34842a;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.C34855f;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.C34848f;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81975d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81977e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.bitrateselector.impl.b */
public final class C34872b implements AbstractC34849b {

    /* renamed from: a */
    private AbstractC81981g f82322a;

    static {
        Covode.recordClassIndex(41881);
    }

    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34849b
    /* renamed from: a */
    public final void mo61715a(C34855f fVar) {
        AbstractC81981g a;
        int i = C34875d.C348761.f82325a[fVar.f82308f.ordinal()];
        if (i == 1) {
            a = new C81975d.C81976a(C34858a.C34867e.m71228a(fVar.f82303a)).mo127143a(C34858a.C34871g.m71233a(fVar.f82304b)).mo127144b(C34858a.C34861b.m71219a(fVar.f82305c)).mo127142a(C34858a.C34859a.m71213a(fVar.f82306d)).mo61745a();
        } else if (i != 2) {
            a = new C34873c.C34874a(C34858a.C34867e.m71228a(fVar.f82303a)).mo127143a(C34858a.C34871g.m71233a(fVar.f82304b)).mo127144b(C34858a.C34861b.m71219a(fVar.f82305c)).mo127142a(C34858a.C34859a.m71213a(fVar.f82306d)).mo61745a();
        } else {
            a = new C81977e();
        }
        this.f82322a = a;
    }

    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34849b
    /* renamed from: a */
    public final C34848f mo61714a(List<? extends AbstractC34845c> list, Map<String, Object> map) {
        C34842a aVar;
        C34858a.C34864d.C348662 r0;
        AbstractC81981g gVar = this.f82322a;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends AbstractC34845c> it = list.iterator();
        while (true) {
            aVar = null;
            C34858a.C34864d.C348651 r4 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC34845c cVar = (AbstractC34845c) it.next();
            if (cVar != null) {
                r4 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: CONSTRUCTOR  (r4v3 'r4' com.ss.android.ugc.aweme.bitrateselector.impl.a$d$1) = (r0v9 'cVar' com.ss.android.ugc.aweme.bitrateselector.a.a.c) call: com.ss.android.ugc.aweme.bitrateselector.impl.a.d.1.<init>(com.ss.android.ugc.aweme.bitrateselector.a.a.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.bitrateselector.impl.b.a(java.util.List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.c>, java.util.Map<java.lang.String, java.lang.Object>):com.ss.android.ugc.aweme.bitrateselector.a.a.f, file: classes4.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:194)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.bitrateselector.impl.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    */
                /*
                    this = this;
                    com.ss.android.ugc.f.a.a.a.b.g r3 = r5.f82322a
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r1 = r6.iterator()
                L_0x000b:
                    boolean r0 = r1.hasNext()
                    r4 = 0
                    if (r0 == 0) goto L_0x0024
                    java.lang.Object r0 = r1.next()
                    com.ss.android.ugc.aweme.bitrateselector.a.a.c r0 = (com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.AbstractC34845c) r0
                    if (r0 != 0) goto L_0x001e
                L_0x001a:
                    r2.add(r4)
                    goto L_0x000b
                L_0x001e:
                    com.ss.android.ugc.aweme.bitrateselector.impl.a$d$1 r4 = new com.ss.android.ugc.aweme.bitrateselector.impl.a$d$1
                    r4.<init>(r0)
                    goto L_0x001a
                L_0x0024:
                    com.ss.android.ugc.f.a.a.a.a.f r3 = r3.mo61744a(r2, r7)
                    if (r3 != 0) goto L_0x002b
                    return r4
                L_0x002b:
                    com.ss.android.ugc.aweme.bitrateselector.a.a.f r2 = new com.ss.android.ugc.aweme.bitrateselector.a.a.f
                    r2.<init>()
                    com.ss.android.ugc.f.a.a.a.a.c r1 = r3.f183434a
                    if (r1 != 0) goto L_0x0054
                    r0 = r4
                L_0x0035:
                    r2.f82297a = r0
                    double r0 = r3.f183437d
                    r2.f82300d = r0
                    int r0 = r3.f183436c
                    r2.f82299c = r0
                    com.ss.android.ugc.f.a.a.a.b r0 = r3.f183435b
                    if (r0 != 0) goto L_0x0046
                L_0x0043:
                    r2.f82298b = r4
                    return r2
                L_0x0046:
                    com.ss.android.ugc.aweme.bitrateselector.a.a r4 = new com.ss.android.ugc.aweme.bitrateselector.a.a
                    int r1 = r0.getCode()
                    java.lang.String r0 = r0.getMessage()
                    r4.<init>(r1, r0)
                    goto L_0x0043
                L_0x0054:
                    com.ss.android.ugc.aweme.bitrateselector.impl.a$d$2 r0 = new com.ss.android.ugc.aweme.bitrateselector.impl.a$d$2
                    r0.<init>(r1)
                    goto L_0x0035
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bitrateselector.impl.C34872b.mo61714a(java.util.List, java.util.Map):com.ss.android.ugc.aweme.bitrateselector.a.a.f");
            }
        }
