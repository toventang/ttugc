package com.bytedance.p1399im.core.internal.p1431d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.AbstractC19965d;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.C19957b;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.d.c */
public class C19967c {

    /* renamed from: b */
    private static C19967c f47470b;

    /* renamed from: a */
    public final List<AbstractC19965d> f47471a;

    static {
        Covode.recordClassIndex(22811);
    }

    /* renamed from: a */
    public static C19967c m37645a() {
        MethodCollector.m26663i(10225);
        if (f47470b == null) {
            synchronized (C19967c.class) {
                try {
                    if (f47470b == null) {
                        f47470b = new C19967c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10225);
                    throw th;
                }
            }
        }
        C19967c cVar = f47470b;
        MethodCollector.m26664o(10225);
        return cVar;
    }

    private C19967c() {
        C19957b.C199636 r2;
        AbstractC19969e a;
        C19957b.C199625 r1 = null;
        C19512f.m36457b("RequestManagerFactory", "config:" + C19483d.m36365a().mo31141b().f46261az, (Throwable) null);
        C19957b.C199581 r4 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r4v0 'r4' com.bytedance.im.core.internal.d.b.b$1) =  call: com.bytedance.im.core.internal.d.b.b.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.d.c.<init>():void, file: classes10.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.d.b.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1431d.C19967c.<init>():void");
    }

    /* renamed from: a */
    public final void mo31850a(C19978k kVar) {
        for (AbstractC19965d dVar : this.f47471a) {
            if (dVar.mo31846a(kVar)) {
                dVar.mo31842a().mo31830e(kVar);
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo31851a(HandlerC20049x xVar) {
        for (AbstractC19965d dVar : this.f47471a) {
            dVar.mo31842a().mo31820a(xVar);
        }
    }
}
