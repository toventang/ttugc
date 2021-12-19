package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23783a;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23787c;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23789e;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23791f;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import com.p1795d.p1796a.p1797a.p1798a.p1805f.C23803a;
import com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a;
import com.p1795d.p1796a.p1797a.p1798a.p1806g.C23807b;
import com.p1795d.p1796a.p1797a.p1798a.p1806g.C23808c;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.C23810a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.d.a.a.a.b.l */
public final class C23781l extends AbstractC23771b {

    /* renamed from: i */
    private static final Pattern f56257i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final C23772c f56258a;

    /* renamed from: b */
    public final List<C23787c> f56259b = new ArrayList();

    /* renamed from: c */
    public AbstractC23805a f56260c;

    /* renamed from: d */
    public boolean f56261d = false;

    /* renamed from: e */
    public boolean f56262e = false;

    /* renamed from: f */
    public String f56263f;

    /* renamed from: g */
    boolean f56264g;

    /* renamed from: h */
    boolean f56265h;

    /* renamed from: j */
    private final C23773d f56266j;

    /* renamed from: k */
    private C23803a f56267k;

    static {
        Covode.recordClassIndex(27889);
    }

    /* renamed from: d */
    private C23787c m44939d(View view) {
        for (C23787c cVar : this.f56259b) {
            if (cVar.f56279a.get() == view) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static void m44940e(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: f */
    private void m44941f(View view) {
        this.f56267k = new C23803a(view);
    }

    /* renamed from: c */
    public final View mo39245c() {
        return (View) this.f56267k.get();
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b
    /* renamed from: c */
    public final void mo39239c(View view) {
        if (!this.f56262e) {
            m44940e(view);
            C23787c d = m44939d(view);
            if (d != null) {
                this.f56259b.remove(d);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo39246d() {
        return this.f56261d && !this.f56262e;
    }

    C23781l(C23772c cVar, C23773d dVar) {
        this.f56258a = cVar;
        this.f56266j = dVar;
        this.f56263f = UUID.randomUUID().toString();
        m44941f(null);
        if (dVar.f56242h == EnumC23774e.HTML) {
            this.f56260c = new C23807b(dVar.f56236b);
        } else {
            this.f56260c = new C23808c(Collections.unmodifiableMap(dVar.f56238d), dVar.f56239e);
        }
        this.f56260c.mo39264a();
        C23783a.f56269a.f56270b.add(this);
        AbstractC23805a aVar = this.f56260c;
        C23789e.f56285a.mo39257a(aVar.mo39272c(), "init", cVar.mo39240a());
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b
    /* renamed from: a */
    public final void mo39235a() {
        if (!this.f56261d) {
            this.f56261d = true;
            C23783a.f56269a.mo39248a(this);
            this.f56260c.mo39265a(C23791f.m44969a().f56290a);
            this.f56260c.mo39267a(this, this.f56266j);
        }
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b
    /* renamed from: a */
    public final void mo39236a(View view) {
        if (!this.f56262e) {
            C23801d.m44992a(view, "AdView is null");
            if (mo39245c() != view) {
                m44941f(view);
                this.f56260c.mo39273d();
                Collection<C23781l> unmodifiableCollection = Collections.unmodifiableCollection(C23783a.f56269a.f56270b);
                if (unmodifiableCollection != null && unmodifiableCollection.size() > 0) {
                    for (C23781l lVar : unmodifiableCollection) {
                        if (lVar != this && lVar.mo39245c() == view) {
                            lVar.f56267k.clear();
                        }
                    }
                }
            }
        }
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b
    /* renamed from: b */
    public final void mo39237b() {
        if (!this.f56262e) {
            this.f56267k.clear();
            if (!this.f56262e) {
                this.f56259b.clear();
            }
            this.f56262e = true;
            C23789e.f56285a.mo39257a(this.f56260c.mo39272c(), "finishSession", new Object[0]);
            C23783a aVar = C23783a.f56269a;
            boolean a = aVar.mo39249a();
            aVar.f56270b.remove(this);
            aVar.f56271c.remove(this);
            if (a && !aVar.mo39249a()) {
                C23791f a2 = C23791f.m44969a();
                C23810a aVar2 = C23810a.f56319a;
                C23810a.m45015b();
                aVar2.f56324d.clear();
                C23810a.f56320b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: INVOKE  
                      (wrap: android.os.Handler : 0x004d: SGET  (r1v2 android.os.Handler) =  com.d.a.a.a.h.a.b android.os.Handler)
                      (wrap: com.d.a.a.a.h.a$1 : 0x0051: CONSTRUCTOR  (r0v11 com.d.a.a.a.h.a$1) = (r2v2 'aVar2' com.d.a.a.a.h.a) call: com.d.a.a.a.h.a.1.<init>(com.d.a.a.a.h.a):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.d.a.a.a.b.l.b():void, file: classes7.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: CONSTRUCTOR  (r0v11 com.d.a.a.a.h.a$1) = (r2v2 'aVar2' com.d.a.a.a.h.a) call: com.d.a.a.a.h.a.1.<init>(com.d.a.a.a.h.a):void type: CONSTRUCTOR in method: com.d.a.a.a.b.l.b():void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.d.a.a.a.h.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 131
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l.mo39237b():void");
            }

            @Override // com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b
            /* renamed from: b */
            public final void mo39238b(View view) {
                EnumC23776g gVar = EnumC23776g.OTHER;
                if (!this.f56262e) {
                    m44940e(view);
                    if (m44939d(view) == null) {
                        this.f56259b.add(new C23787c(view, gVar));
                    }
                }
            }

            /* renamed from: e */
            public final boolean mo39247e() {
                return EnumC23778i.NATIVE == this.f56258a.f56230a;
            }
        }
