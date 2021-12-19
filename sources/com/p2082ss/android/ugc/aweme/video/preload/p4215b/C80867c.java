package com.p2082ss.android.ugc.aweme.video.preload.p4215b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.C75221e;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.p2082ss.android.ugc.aweme.video.preload.p4215b.C80861a;
import com.p2082ss.android.ugc.p4314h.AbstractC84109c;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.p4314h.C84119i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.preload.b.c */
public final class C80867c implements AbstractC84109c {

    /* renamed from: a */
    private final Map<Object, Object> f180805a = new HashMap();

    /* renamed from: b */
    private ISpeedCalculator f180806b = AbstractC74616d.m131036a().mo117294f();

    static {
        Covode.recordClassIndex(94165);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final double mo124223a() {
        return this.f180806b.mo118397b();
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: c */
    public final void mo124229c() {
        this.f180806b.mo118400e();
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84110d
    /* renamed from: d */
    public final double mo124230d() {
        return this.f180806b.mo118391a();
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: b */
    public final C84119i[] mo124228b() {
        return C80861a.C80865c.m140280a(this.f180806b.mo118399d());
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124224a(double d) {
        this.f180806b.mo118392a(d);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124226a(int i) {
        this.f180806b.mo118393a(i);
    }

    @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
    /* renamed from: a */
    public final void mo124227a(C84116g.AbstractC84117a aVar) {
        C80861a.C80862a.C808631 r0;
        ISpeedCalculator iSpeedCalculator = this.f180806b;
        if (aVar == null) {
            r0 = null;
        } else {
            r0 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r0v0 'r0' com.ss.android.ugc.aweme.video.preload.b.a$a$1) = (r3v0 'aVar' com.ss.android.ugc.h.g$a) call: com.ss.android.ugc.aweme.video.preload.b.a.a.1.<init>(com.ss.android.ugc.h.g$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.preload.b.c.a(com.ss.android.ugc.h.g$a):void, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.preload.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator r1 = r2.f180806b
                if (r3 != 0) goto L_0x0009
                r0 = 0
            L_0x0005:
                r1.mo118395a(r0)
                return
            L_0x0009:
                com.ss.android.ugc.aweme.video.preload.b.a$a$1 r0 = new com.ss.android.ugc.aweme.video.preload.b.a$a$1
                r0.<init>(r3)
                goto L_0x0005
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.preload.p4215b.C80867c.mo124227a(com.ss.android.ugc.h.g$a):void");
        }

        @Override // com.p2082ss.android.ugc.p4314h.AbstractC84109c
        /* renamed from: a */
        public final void mo124225a(double d, double d2, long j) {
            this.f180806b.mo118396a(new C75221e(d2 * 8.0d, (double) j));
        }
    }
