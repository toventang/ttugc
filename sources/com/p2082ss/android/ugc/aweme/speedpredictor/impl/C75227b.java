package com.p2082ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30093n;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75216b;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75219d;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.C75221e;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.p2082ss.android.ugc.aweme.speedpredictor.impl.C75222a;
import com.p2082ss.android.ugc.p4314h.AbstractC84109c;
import com.p2082ss.android.ugc.p4314h.C84107a;
import com.p2082ss.android.ugc.p4314h.C84108b;
import com.p2082ss.android.ugc.p4314h.C84111e;
import com.p2082ss.android.ugc.p4314h.C84114f;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.b */
public final class C75227b implements ISpeedCalculator {

    /* renamed from: a */
    private final Map<Object, Object> f169136a = new HashMap();

    /* renamed from: b */
    private final AbstractC84109c f169137b = C84116g.m144636e().f187709b;

    static {
        Covode.recordClassIndex(88114);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: a */
    public final double mo118391a() {
        return this.f169137b.mo124230d();
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: b */
    public final double mo118397b() {
        return this.f169137b.mo124223a();
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: e */
    public final void mo118400e() {
        this.f169137b.mo124229c();
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: d */
    public final C75221e[] mo118399d() {
        return C75222a.C75226c.m131988a(this.f169137b.mo124228b());
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: c */
    public final int mo118398c() {
        double d = this.f169137b.mo124230d();
        if (d == -1.0d) {
            return -1;
        }
        return (int) ((d / 8.0d) / 1000.0d);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: a */
    public final void mo118392a(double d) {
        this.f169137b.mo124224a(d);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: a */
    public final void mo118393a(int i) {
        this.f169137b.mo124226a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    /* renamed from: a */
    public final void mo118395a(AbstractC75219d dVar) {
        C75222a.C75223a.C752241 r0;
        AbstractC84109c cVar = this.f169137b;
        if (dVar == null) {
            r0 = null;
        } else {
            r0 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r0v0 'r0' com.ss.android.ugc.aweme.speedpredictor.impl.a$a$1) = (r3v0 'dVar' com.ss.android.ugc.aweme.speedpredictor.api.d) call: com.ss.android.ugc.aweme.speedpredictor.impl.a.a.1.<init>(com.ss.android.ugc.aweme.speedpredictor.api.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.speedpredictor.impl.b.a(com.ss.android.ugc.aweme.speedpredictor.api.d):void, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.speedpredictor.impl.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
                this = this;
                com.ss.android.ugc.h.c r1 = r2.f169137b
                if (r3 != 0) goto L_0x0009
                r0 = 0
            L_0x0005:
                r1.mo124227a(r0)
                return
            L_0x0009:
                com.ss.android.ugc.aweme.speedpredictor.impl.a$a$1 r0 = new com.ss.android.ugc.aweme.speedpredictor.impl.a$a$1
                r0.<init>(r3)
                goto L_0x0005
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.speedpredictor.impl.C75227b.mo118395a(com.ss.android.ugc.aweme.speedpredictor.api.d):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
        /* renamed from: a */
        public final void mo118396a(C75221e eVar) {
            this.f169137b.mo124225a(eVar.f169133c, eVar.f169131a / 8.0d, (long) eVar.f169132b);
        }

        @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
        /* renamed from: a */
        public final void mo118394a(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
            Object c;
            if (iSpeedCalculatorConfig != null) {
                this.f169137b.mo124226a(iSpeedCalculatorConfig.getSpeedQueueSize());
                this.f169137b.mo124224a(iSpeedCalculatorConfig.getDefaultSpeedInBPS());
                AbstractC75219d.EnumC75220a speedAlgorithmType = iSpeedCalculatorConfig.getSpeedAlgorithmType();
                if (speedAlgorithmType == AbstractC75219d.EnumC75220a.INTELLIGENT) {
                    boolean z = true;
                    if (AbstractC75216b.C75217a.f169129a == null || !AbstractC75216b.C75217a.f169129a.mo118409a() || AbstractC75216b.C75217a.f169129a == null || !AbstractC75216b.C75217a.f169129a.mo118410b()) {
                        z = false;
                    }
                    C752281 r2 = null;
                    if (!z || AbstractC75216b.C75217a.f169129a == null || (c = AbstractC75216b.C75217a.f169129a.mo118411c()) == null || !(c instanceof C84116g.AbstractC84117a)) {
                        this.f169137b.mo124227a(new C84111e(new C75229c(iSpeedCalculatorConfig)));
                        C84114f fVar = C84114f.C84115a.f187706a;
                        final AbstractC75215a intelligentAlgoConfig = iSpeedCalculatorConfig.getIntelligentAlgoConfig();
                        if (intelligentAlgoConfig != null) {
                            r2 = new AbstractC30093n() {
                                /* class com.p2082ss.android.ugc.aweme.speedpredictor.impl.C75227b.C752281 */

                                static {
                                    Covode.recordClassIndex(88115);
                                }

                                @Override // com.p2082ss.android.p2160ml.AbstractC30093n
                                /* renamed from: a */
                                public final String mo53467a() {
                                    return intelligentAlgoConfig.mo118402a();
                                }

                                @Override // com.p2082ss.android.p2160ml.AbstractC30093n
                                /* renamed from: b */
                                public final String mo53468b() {
                                    return intelligentAlgoConfig.mo118403b();
                                }

                                @Override // com.p2082ss.android.p2160ml.AbstractC30093n
                                /* renamed from: c */
                                public final boolean mo53469c() {
                                    return intelligentAlgoConfig.mo118404c();
                                }

                                @Override // com.p2082ss.android.p2160ml.AbstractC30093n
                                /* renamed from: d */
                                public final String mo53470d() {
                                    return intelligentAlgoConfig.mo118405d();
                                }
                            };
                        }
                        fVar.f187705a = new C30091m(r2);
                        fVar.f187705a.mo53464b();
                        return;
                    }
                    this.f169137b.mo124227a((C84116g.AbstractC84117a) c);
                } else if (speedAlgorithmType == AbstractC75219d.EnumC75220a.AVERAGE) {
                    this.f169137b.mo124227a(new C84107a());
                } else {
                    this.f169137b.mo124227a(new C84108b());
                }
            }
        }
    }
