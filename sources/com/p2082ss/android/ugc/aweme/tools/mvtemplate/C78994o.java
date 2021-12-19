package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.o */
public final class C78994o extends AbstractC83467k implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f177520a = {new C89232y(C78994o.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};

    /* renamed from: c */
    public static final C78997b f177521c = new C78997b((byte) 0);

    /* renamed from: b */
    public AbstractC35318a f177522b;

    /* renamed from: d */
    private final AbstractC89244h f177523d;

    /* renamed from: e */
    private final AbstractC89248d f177524e = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);

    /* renamed from: f */
    private final C21582f f177525f;

    static {
        Covode.recordClassIndex(92152);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: a */
    public final String mo108523a() {
        return "RecordMVScene";
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.o$b */
    public static final class C78997b {
        static {
            Covode.recordClassIndex(92155);
        }

        private C78997b() {
        }

        public /* synthetic */ C78997b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f177525f;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: b */
    public final void mo108524b() {
        AbstractC35318a aVar = this.f177522b;
        if (aVar == null) {
            C89219l.m154710a("mvTemplateModule");
        }
        aVar.mo62180e();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: d */
    public final void mo108525d() {
        AbstractC35318a aVar = this.f177522b;
        if (aVar == null) {
            C89219l.m154710a("mvTemplateModule");
        }
        aVar.mo62181f();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        AbstractC35318a aVar = this.f177522b;
        if (aVar == null) {
            C89219l.m154710a("mvTemplateModule");
        }
        aVar.mo62179d();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        AbstractC35318a aVar = this.f177522b;
        if (aVar == null) {
            C89219l.m154710a("mvTemplateModule");
        }
        aVar.mo62175a();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        AbstractC35318a aVar = this.f177522b;
        if (aVar == null) {
            C89219l.m154710a("mvTemplateModule");
        }
        aVar.mo62177b();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: y */
    public final void mo36492y() {
        super.mo36492y();
        AbstractC35318a aVar = this.f177522b;
        if (aVar == null) {
            C89219l.m154710a("mvTemplateModule");
        }
        aVar.mo62178c();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.o$a */
    public static final class C78995a extends AbstractC89220m implements AbstractC89171a<RecordMVViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f177526a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f177527b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f177528c;

        static {
            Covode.recordClassIndex(92153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78995a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f177526a = jVar;
            this.f177527b = cVar;
            this.f177528c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.f177526a
                android.app.Activity r1 = r0.mo36486t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.ss.android.ugc.aweme.tools.mvtemplate.o$a$1 r0 = new com.ss.android.ugc.aweme.tools.mvtemplate.o$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r3.f177528c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                h.k.c r0 = r3.f177527b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m137822xa4ef527b(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78994o.C78995a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_tools_mvtemplate_RecordMVScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m137822xa4ef527b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.o$c */
    static final class C78998c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C78994o f177529a;

        static {
            Covode.recordClassIndex(92156);
        }

        C78998c(C78994o oVar) {
            this.f177529a = oVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            AbstractC35318a aVar = this.f177529a.f177522b;
            if (aVar == null) {
                C89219l.m154710a("mvTemplateModule");
            }
            C89219l.m154716b(bool, "");
            aVar.mo62176a(bool.booleanValue());
        }
    }

    public C78994o(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f177525f = fVar;
        AbstractC89277c a = C89204ab.m154669a(RecordMVViewModel.class);
        this.f177523d = C89250i.m154773a((AbstractC89171a) new C78995a(this, a, a));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        RecordMVViewModel recordMVViewModel = (RecordMVViewModel) this.f177523d.getValue();
        C21582f diContainer = getDiContainer();
        C89219l.m154721d(this, "");
        C89219l.m154721d(recordMVViewModel, "");
        C89219l.m154721d(diContainer, "");
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C78917b bVar = new C78917b((ActivityC0945e) t, (ViewStubCompat) mo36474b(R.id.cpa), diContainer);
        Effect effect = recordMVViewModel.f177204a;
        bVar.f177392d = effect;
        if (effect == null) {
            if (bVar.f177403o) {
                if (bVar.f177389a != null && !bVar.f177389a.isFinishing() && C78917b.m137707h()) {
                    bVar.mo122733i();
                    bVar.f177391c.mo78902a("mv", "all", false, 20, bVar.f177399k, bVar.f177400l, bVar.f177401m, (IFetchCategoryEffectListener) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a6: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.effectplatform.f : 0x0092: IGET  (r3v2 com.ss.android.ugc.aweme.effectplatform.f) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.c com.ss.android.ugc.aweme.effectplatform.f)
                          ("mv")
                          ("all")
                          false
                          (20 int)
                          (wrap: int : 0x0097: IGET  (r8v0 int) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.k int)
                          (wrap: int : 0x0099: IGET  (r9v0 int) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.l int)
                          (wrap: java.lang.String : 0x009b: IGET  (r10v0 java.lang.String) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.m java.lang.String)
                          (wrap: com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener : ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener) (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.b$2 : 0x009f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$2) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.2.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR))
                         type: INTERFACE call: com.ss.android.ugc.aweme.effectplatform.f.a(java.lang.String, java.lang.String, boolean, int, int, int, java.lang.String, com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener):void in method: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void, file: classes9.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener) (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.b$2 : 0x009f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$2) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.2.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$2) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.2.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.mvtemplate.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 201
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78994o.mo22704a(android.os.Bundle):void");
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
                    C89219l.m154721d(vm1, "");
                    C89219l.m154721d(bVar, "");
                    return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
                }

                @Override // com.bytedance.scene.AbstractC22219j
                /* renamed from: a */
                public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    C89219l.m154721d(layoutInflater, "");
                    C89219l.m154721d(viewGroup, "");
                    View a = C1764a.m5927a(layoutInflater, R.layout.bi3, viewGroup, false);
                    C89219l.m154716b(a, "");
                    return a;
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(mVar, "");
                    return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20382b
                public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(mVar, "");
                    AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(mVar, "");
                    return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20382b
                public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(mVar, "");
                    AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20382b
                public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(mVar, "");
                    AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(kVar2, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(qVar, "");
                    return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(ahVar, "");
                    return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(kVar2, "");
                    C89219l.m154721d(kVar3, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(rVar, "");
                    return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
                }

                @Override // com.bytedance.jedi.arch.AbstractC20468h
                public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
                    C89219l.m154721d(jediViewModel, "");
                    C89219l.m154721d(kVar, "");
                    C89219l.m154721d(kVar2, "");
                    C89219l.m154721d(kVar3, "");
                    C89219l.m154721d(kVar4, "");
                    C89219l.m154721d(ahVar, "");
                    C89219l.m154721d(sVar, "");
                    return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
                }
            }
