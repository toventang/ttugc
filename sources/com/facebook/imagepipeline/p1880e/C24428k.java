package com.facebook.imagepipeline.p1880e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1832d.C24094l;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.imagepipeline.memory.C24479ac;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24327a;
import com.facebook.imagepipeline.p1871a.p1873b.C24328b;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1878c.C24352a;
import com.facebook.imagepipeline.p1878c.C24353b;
import com.facebook.imagepipeline.p1878c.C24356e;
import com.facebook.imagepipeline.p1879d.AbstractC24395n;
import com.facebook.imagepipeline.p1879d.C24366a;
import com.facebook.imagepipeline.p1879d.C24368b;
import com.facebook.imagepipeline.p1879d.C24373e;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1879d.C24396o;
import com.facebook.imagepipeline.p1879d.C24398q;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1882g.C24440b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1887l.AbstractC24469g;
import com.facebook.imagepipeline.p1887l.C24463a;
import com.facebook.imagepipeline.p1887l.C24466d;
import com.facebook.imagepipeline.p1887l.C24467e;
import com.facebook.imagepipeline.p1887l.C24468f;
import com.facebook.imagepipeline.p1889n.C24573az;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.imagepipeline.p1892q.AbstractC24650c;
import com.facebook.imagepipeline.p1892q.C24652e;
import com.facebook.imagepipeline.p1892q.C24654g;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1828b.AbstractC24056i;
import com.facebook.p1870h.C24316d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Collections;

/* renamed from: com.facebook.imagepipeline.e.k */
public class C24428k {

    /* renamed from: a */
    private static final Class<?> f57984a = C24428k.class;

    /* renamed from: b */
    private static C24428k f57985b;

    /* renamed from: v */
    private static AbstractC24442c f57986v;

    /* renamed from: c */
    private C24573az f57987c;

    /* renamed from: d */
    private C24420i f57988d;

    /* renamed from: e */
    private AbstractC24412g f57989e;

    /* renamed from: f */
    private C24382h<AbstractC24026e, AbstractC24454c> f57990f;

    /* renamed from: g */
    private C24396o<AbstractC24026e, AbstractC24454c> f57991g;

    /* renamed from: h */
    private C24382h<AbstractC24026e, AbstractC24111h> f57992h;

    /* renamed from: i */
    private C24396o<AbstractC24026e, AbstractC24111h> f57993i;

    /* renamed from: j */
    private C24373e f57994j;

    /* renamed from: k */
    private AbstractC24056i f57995k;

    /* renamed from: l */
    private AbstractC24442c f57996l;

    /* renamed from: m */
    private C24413h f57997m;

    /* renamed from: n */
    private AbstractC24650c f57998n;

    /* renamed from: o */
    private C24431m f57999o;

    /* renamed from: p */
    private C24432n f58000p;

    /* renamed from: q */
    private C24373e f58001q;

    /* renamed from: r */
    private AbstractC24056i f58002r;

    /* renamed from: s */
    private AbstractC24357f f58003s;

    /* renamed from: t */
    private AbstractC24469g f58004t;

    /* renamed from: u */
    private AbstractC24327a f58005u;

    static {
        Covode.recordClassIndex(28571);
    }

    /* renamed from: a */
    public static C24428k m46551a() {
        return (C24428k) C24091i.m45618a(f57985b, "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: j */
    private C24382h<AbstractC24026e, AbstractC24454c> m46558j() {
        if (this.f57990f == null) {
            m46557i();
            this.f57990f = C24366a.m46375a(this.f57988d.f57896b, this.f57988d.f57910p, this.f57988d.f57897c);
        }
        return this.f57990f;
    }

    /* renamed from: b */
    public final AbstractC24327a mo40244b() {
        if (this.f58005u == null) {
            m46557i();
            this.f58005u = C24328b.m46299a(mo40248f(), this.f57988d.f57903i, m46558j());
        }
        return this.f58005u;
    }

    /* renamed from: c */
    public final C24396o<AbstractC24026e, AbstractC24454c> mo40245c() {
        if (this.f57991g == null) {
            m46557i();
            this.f57991g = C24368b.m46377a(m46558j(), this.f57988d.f57904j);
        }
        return this.f57991g;
    }

    /* renamed from: d */
    public final AbstractC24056i mo40246d() {
        if (this.f57995k == null) {
            m46557i();
            this.f57995k = this.f57988d.f57901g.mo40221a(this.f57988d.f57909o);
        }
        return this.f57995k;
    }

    /* renamed from: f */
    public final AbstractC24357f mo40248f() {
        if (this.f58003s == null) {
            m46557i();
            this.f58003s = m46550a(this.f57988d.f57914t, mo40249g());
        }
        return this.f58003s;
    }

    /* renamed from: g */
    public final AbstractC24469g mo40249g() {
        if (this.f58004t == null) {
            m46557i();
            this.f58004t = m46552a(this.f57988d.f57914t, this.f57988d.f57920z.f57965o, this.f57988d.f57920z.f57966p);
        }
        return this.f58004t;
    }

    /* renamed from: h */
    public final AbstractC24056i mo40250h() {
        if (this.f58002r == null) {
            m46557i();
            this.f58002r = this.f57988d.f57901g.mo40221a(this.f57988d.f57918x);
        }
        return this.f58002r;
    }

    /* renamed from: k */
    private C24382h<AbstractC24026e, AbstractC24111h> m46559k() {
        if (this.f57992h == null) {
            m46557i();
            AbstractC24093k<C24398q> kVar = this.f57988d.f57902h;
            AbstractC24107d dVar = this.f57988d.f57910p;
            C24382h<AbstractC24026e, AbstractC24111h> hVar = new C24382h<>(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r0v4 'hVar' com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>) = 
                  (wrap: com.facebook.imagepipeline.d.l$1 : 0x0011: CONSTRUCTOR  (r2v0 com.facebook.imagepipeline.d.l$1) =  call: com.facebook.imagepipeline.d.l.1.<init>():void type: CONSTRUCTOR)
                  (wrap: com.facebook.imagepipeline.d.s : 0x0016: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.s) =  call: com.facebook.imagepipeline.d.s.<init>():void type: CONSTRUCTOR)
                  (r4v0 'kVar' com.facebook.common.d.k<com.facebook.imagepipeline.d.q>)
                 call: com.facebook.imagepipeline.d.h.<init>(com.facebook.imagepipeline.d.w, com.facebook.imagepipeline.d.h$a, com.facebook.common.d.k):void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.k():com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes9.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r2v0 com.facebook.imagepipeline.d.l$1) =  call: com.facebook.imagepipeline.d.l.1.<init>():void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.k():com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.imagepipeline.d.l, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r5.f57992h
                if (r0 != 0) goto L_0x0023
                r5.m46557i()
                com.facebook.imagepipeline.e.i r0 = r5.f57988d
                com.facebook.common.d.k<com.facebook.imagepipeline.d.q> r4 = r0.f57902h
                com.facebook.imagepipeline.e.i r0 = r5.f57988d
                com.facebook.common.g.d r3 = r0.f57910p
                com.facebook.imagepipeline.d.l$1 r2 = new com.facebook.imagepipeline.d.l$1
                r2.<init>()
                com.facebook.imagepipeline.d.s r1 = new com.facebook.imagepipeline.d.s
                r1.<init>()
                com.facebook.imagepipeline.d.h r0 = new com.facebook.imagepipeline.d.h
                r0.<init>(r2, r1, r4)
                r3.mo34255a(r0)
                r5.f57992h = r0
            L_0x0023:
                com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r5.f57992h
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1880e.C24428k.m46559k():com.facebook.imagepipeline.d.h");
        }

        /* renamed from: l */
        private C24396o<AbstractC24026e, AbstractC24111h> m46560l() {
            if (this.f57993i == null) {
                m46557i();
                C24382h<AbstractC24026e, AbstractC24111h> k = m46559k();
                AbstractC24395n nVar = this.f57988d.f57904j;
                nVar.mo34248b(k);
                this.f57993i = new C24396o<>(k, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: IPUT  
                      (wrap: com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h> : 0x0019: CONSTRUCTOR  (r0v4 com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>) = 
                      (r2v0 'k' com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>)
                      (wrap: com.facebook.imagepipeline.d.m$1 : 0x0014: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.m$1) = (r0v3 'nVar' com.facebook.imagepipeline.d.n) call: com.facebook.imagepipeline.d.m.1.<init>(com.facebook.imagepipeline.d.n):void type: CONSTRUCTOR)
                     call: com.facebook.imagepipeline.d.o.<init>(com.facebook.imagepipeline.d.p, com.facebook.imagepipeline.d.r):void type: CONSTRUCTOR)
                      (r3v0 'this' com.facebook.imagepipeline.e.k A[IMMUTABLE_TYPE, THIS])
                     com.facebook.imagepipeline.e.k.i com.facebook.imagepipeline.d.o in method: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes9.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR  (r0v4 com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>) = 
                      (r2v0 'k' com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>)
                      (wrap: com.facebook.imagepipeline.d.m$1 : 0x0014: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.m$1) = (r0v3 'nVar' com.facebook.imagepipeline.d.n) call: com.facebook.imagepipeline.d.m.1.<init>(com.facebook.imagepipeline.d.n):void type: CONSTRUCTOR)
                     call: com.facebook.imagepipeline.d.o.<init>(com.facebook.imagepipeline.d.p, com.facebook.imagepipeline.d.r):void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 19 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.m$1) = (r0v3 'nVar' com.facebook.imagepipeline.d.n) call: com.facebook.imagepipeline.d.m.1.<init>(com.facebook.imagepipeline.d.n):void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 23 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.imagepipeline.d.m, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 29 more
                    */
                /*
                    this = this;
                    com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r3.f57993i
                    if (r0 != 0) goto L_0x001e
                    r3.m46557i()
                    com.facebook.imagepipeline.d.h r2 = r3.m46559k()
                    com.facebook.imagepipeline.e.i r0 = r3.f57988d
                    com.facebook.imagepipeline.d.n r0 = r0.f57904j
                    r0.mo34248b(r2)
                    com.facebook.imagepipeline.d.m$1 r1 = new com.facebook.imagepipeline.d.m$1
                    r1.<init>(r0)
                    com.facebook.imagepipeline.d.o r0 = new com.facebook.imagepipeline.d.o
                    r0.<init>(r2, r1)
                    r3.f57993i = r0
                L_0x001e:
                    com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r3.f57993i
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1880e.C24428k.m46560l():com.facebook.imagepipeline.d.o");
            }

            /* renamed from: n */
            private C24373e m46562n() {
                if (this.f57994j == null) {
                    m46557i();
                    this.f57994j = new C24373e(mo40246d(), this.f57988d.f57914t.mo40353a(this.f57988d.f57911q), this.f57988d.f57914t.mo40357d(), this.f57988d.f57903i.mo40216a(), this.f57988d.f57903i.mo40217b(), this.f57988d.f57904j);
                }
                return this.f57994j;
            }

            /* renamed from: q */
            private C24373e m46565q() {
                if (this.f58001q == null) {
                    m46557i();
                    this.f58001q = new C24373e(mo40250h(), this.f57988d.f57914t.mo40353a(this.f57988d.f57911q), this.f57988d.f57914t.mo40357d(), this.f57988d.f57903i.mo40216a(), this.f57988d.f57903i.mo40217b(), this.f57988d.f57904j);
                }
                return this.f58001q;
            }

            /* renamed from: s */
            private AbstractC24442c m46567s() {
                if (f57986v == null) {
                    try {
                        f57986v = (AbstractC24442c) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(AbstractC24113i.class).newInstance(this.f57988d.f57914t.mo40353a(0));
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                return f57986v;
            }

            /* renamed from: i */
            private void m46557i() {
                MethodCollector.m26663i(6829);
                if (this.f57988d != null) {
                    MethodCollector.m26664o(6829);
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f57988d == null) {
                            C24644b.m47156a();
                            this.f57988d = (C24420i) C24091i.m45617a(this.f57989e.mo34191a());
                            this.f57987c = new C24573az(this.f57988d.f57903i.mo40220e());
                            C24644b.m47156a();
                            MethodCollector.m26664o(6829);
                        }
                    } finally {
                        MethodCollector.m26664o(6829);
                    }
                }
            }

            /* renamed from: m */
            private AbstractC24442c m46561m() {
                AbstractC24442c cVar;
                if (this.f57996l == null) {
                    m46557i();
                    if (this.f57988d.f57905k != null) {
                        this.f57996l = this.f57988d.f57905k;
                    } else {
                        AbstractC24327a b = mo40244b();
                        AbstractC24442c s = m46567s();
                        AbstractC24442c cVar2 = null;
                        if (b != null) {
                            cVar2 = b.getGifDecoder(Bitmap.Config.RGB_565);
                            cVar = b.getWebPDecoder(Bitmap.Config.RGB_565);
                        } else {
                            cVar = null;
                        }
                        if (this.f57988d.f57919y == null) {
                            this.f57996l = new C24440b(cVar2, cVar, s, mo40249g());
                        } else {
                            this.f57996l = new C24440b(cVar2, cVar, s, mo40249g(), this.f57988d.f57919y.f58074a);
                            C24316d b2 = C24316d.m46271b();
                            b2.f57667a = this.f57988d.f57919y.f58075b;
                            b2.mo40110a();
                        }
                    }
                }
                return this.f57996l;
            }

            /* renamed from: p */
            private C24432n m46564p() {
                boolean z;
                m46557i();
                if (Build.VERSION.SDK_INT < 24 || !this.f57988d.f57920z.f57956f) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.f58000p == null) {
                    this.f58000p = new C24432n(m46556b(this.f57988d.f57899e).getContentResolver(), m46563o(), this.f57988d.f57912r, this.f57988d.f57917w, this.f57988d.f57920z.f57951a, this.f57987c, this.f57988d.f57900f, z, this.f57988d.f57920z.f57962l, this.f57988d.f57893A, m46566r());
                }
                return this.f58000p;
            }

            /* renamed from: r */
            private AbstractC24650c m46566r() {
                if (this.f57998n == null) {
                    m46557i();
                    if (this.f57988d.f57906l == null && this.f57988d.f57907m == null && this.f57988d.f57920z.f57961k) {
                        this.f57998n = new C24654g(this.f57988d.f57920z.f57960j);
                    } else {
                        this.f57998n = new C24652e(this.f57988d.f57920z.f57960j, this.f57988d.f57920z.f57955e, this.f57988d.f57906l, this.f57988d.f57907m);
                    }
                }
                return this.f57998n;
            }

            /* renamed from: e */
            public final C24413h mo40247e() {
                if (this.f57997m == null) {
                    m46557i();
                    this.f57997m = new C24413h(m46564p(), Collections.unmodifiableSet(this.f57988d.f57916v), this.f57988d.f57908n, mo40245c(), m46560l(), m46562n(), m46565q(), this.f57988d.f57898d, this.f57987c, C24094l.m45626a(false), this.f57988d.f57920z.f57964n);
                }
                return this.f57997m;
            }

            /* renamed from: o */
            private C24431m m46563o() {
                if (this.f57999o == null) {
                    m46557i();
                    this.f57999o = this.f57988d.f57920z.f57963m.mo40243a(this.f57988d.f57899e, this.f57988d.f57914t.mo40358e(), m46561m(), this.f57988d.f57915u, this.f57988d.f57900f, this.f57988d.f57917w, this.f57988d.f57920z.f57953c, this.f57988d.f57903i, this.f57988d.f57914t.mo40353a(this.f57988d.f57911q), mo40245c(), m46560l(), m46562n(), m46565q(), this.f57988d.f57898d, mo40248f(), this.f57988d.f57920z.f57957g, this.f57988d.f57920z.f57958h, this.f57988d.f57920z.f57959i, this.f57988d.f57920z.f57960j);
                }
                return this.f57999o;
            }

            private C24428k(AbstractC24412g gVar) {
                this.f57989e = (AbstractC24412g) C24091i.m45617a(gVar);
            }

            /* renamed from: b */
            private static Context m46556b(Context context) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    return C58003a.f132199a;
                }
                return applicationContext;
            }

            private C24428k(C24420i iVar) {
                C24644b.m47156a();
                this.f57988d = (C24420i) C24091i.m45617a(iVar);
                this.f57987c = new C24573az(iVar.f57903i.mo40220e());
                C24644b.m47156a();
            }

            /* renamed from: a */
            public static synchronized void m46553a(Context context) {
                synchronized (C24428k.class) {
                    MethodCollector.m26663i(6686);
                    C24644b.m47156a();
                    m46555a(C24420i.m46539a(context).mo40240a());
                    C24644b.m47156a();
                    MethodCollector.m26664o(6686);
                }
            }

            /* renamed from: a */
            public static synchronized void m46555a(C24420i iVar) {
                synchronized (C24428k.class) {
                    MethodCollector.m26663i(6687);
                    if (f57985b != null) {
                        C24099a.m45647b(f57984a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                    }
                    f57985b = new C24428k(iVar);
                    MethodCollector.m26664o(6687);
                }
            }

            /* renamed from: a */
            private static AbstractC24357f m46550a(C24479ac acVar, AbstractC24469g gVar) {
                if (Build.VERSION.SDK_INT >= 21) {
                    return new C24352a(acVar.mo40354a());
                }
                int i = Build.VERSION.SDK_INT;
                return new C24356e(new C24353b(acVar.mo40353a(0)), gVar);
            }

            /* renamed from: a */
            public static synchronized void m46554a(AbstractC24412g gVar, Boolean bool) {
                synchronized (C24428k.class) {
                    MethodCollector.m26663i(6827);
                    if (f57985b != null) {
                        C24099a.m45647b(f57984a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                    }
                    f57985b = new C24428k(gVar);
                    if (Boolean.TRUE == bool) {
                        f57985b.m46557i();
                    }
                    MethodCollector.m26664o(6827);
                }
            }

            /* renamed from: a */
            private static AbstractC24469g m46552a(C24479ac acVar, boolean z, boolean z2) {
                if (Build.VERSION.SDK_INT == 28 && z2) {
                    int c = acVar.mo40356c();
                    return new C24468f(acVar.mo40354a(), c, new C0693f.C0696c(c));
                } else if (Build.VERSION.SDK_INT >= 26) {
                    int c2 = acVar.mo40356c();
                    return new C24467e(acVar.mo40354a(), c2, new C0693f.C0696c(c2));
                } else if (Build.VERSION.SDK_INT >= 21) {
                    int c3 = acVar.mo40356c();
                    return new C24463a(acVar.mo40354a(), c3, new C0693f.C0696c(c3));
                } else {
                    if (z) {
                        int i = Build.VERSION.SDK_INT;
                    }
                    return new C24466d(acVar.mo40355b());
                }
            }
        }
