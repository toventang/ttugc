package com.p2082ss.android.ugc.aweme.ftc.p3039k;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
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
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83868e;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.k.a */
public final class C52644a extends AbstractC2562j<AbstractC52653d> implements AbstractC20382b, AbstractC21566a, AbstractC52653d {

    /* renamed from: a */
    public final AbstractC52653d f121180a = this;

    /* renamed from: b */
    public final C2549d<Boolean> f121181b = new C2549d<>(Boolean.valueOf(C63244g.m114602a().mo73277e().getSpeedPanelOpen(false)));

    /* renamed from: c */
    public final C2563k<Integer> f121182c;

    /* renamed from: d */
    final C2563k<EnumC78601i> f121183d;

    /* renamed from: e */
    public final AbstractC83868e f121184e;

    /* renamed from: f */
    public final AbstractC22186b f121185f;

    /* renamed from: g */
    private final AbstractC71864a f121186g = ((AbstractC71864a) getDiContainer().mo35249a(AbstractC71864a.class, (String) null));

    /* renamed from: h */
    private final C2559g<Integer> f121187h;

    /* renamed from: i */
    private final C21582f f121188i;

    static {
        Covode.recordClassIndex(62040);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3039k.AbstractC52653d
    /* renamed from: a */
    public final C2559g<Integer> mo88355a() {
        return this.f121187h;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3039k.AbstractC52653d
    /* renamed from: b */
    public final C2559g<EnumC78601i> mo88357b() {
        return this.f121183d;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC52653d getApiComponent() {
        return this.f121180a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f121188i;
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

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f121185f.mo36387a(R.id.dg9, new C52648b(this.f121186g.mo113513c(), this.f121184e), "FTCRecordSpeedGroupScene");
        C22226a.m41824b(this.f121185f, "FTCRecordSpeedGroupScene");
        this.f121181b.mo7036a(this, new C52645a(this));
        this.f121186g.mo113507a().mo7036a(this, new C52646b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.k.a$c */
    public static final class C52647c implements AbstractC83868e {

        /* renamed from: a */
        final /* synthetic */ C52644a f121191a;

        static {
            Covode.recordClassIndex(62043);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52647c(C52644a aVar) {
            this.f121191a = aVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83868e
        /* renamed from: a */
        public final void mo88358a(EnumC78601i iVar) {
            C89219l.m154721d(iVar, "");
            C52644a aVar = this.f121191a;
            C89219l.m154721d(iVar, "");
            aVar.f121183d.mo6999a(iVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3039k.AbstractC52653d
    /* renamed from: a */
    public final void mo88356a(boolean z) {
        this.f121181b.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.k.a$b */
    static final class C52646b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52644a f121190a;

        static {
            Covode.recordClassIndex(62042);
        }

        C52646b(C52644a aVar) {
            this.f121190a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                T value = this.f121190a.f121181b.f7727a.getValue();
                C89219l.m154716b(value, "");
                if (value.booleanValue()) {
                    C22226a.m41823a(this.f121190a.f121185f, "FTCRecordSpeedGroupScene");
                    return;
                }
                return;
            }
            C22226a.m41824b(this.f121190a.f121185f, "FTCRecordSpeedGroupScene");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.k.a$a */
    static final class C52645a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52644a f121189a;

        static {
            Covode.recordClassIndex(62041);
        }

        C52645a(C52644a aVar) {
            this.f121189a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C63244g.m114602a().mo73277e().setSpeedPanelOpen(true);
                this.f121189a.f121182c.mo6999a((Integer) 0);
                C22226a.m41823a(this.f121189a.f121185f, "FTCRecordSpeedGroupScene");
                return;
            }
            C63244g.m114602a().mo73277e().setSpeedPanelOpen(false);
            this.f121189a.f121182c.mo6999a((Integer) 8);
            C22226a.m41824b(this.f121189a.f121185f, "FTCRecordSpeedGroupScene");
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C52644a(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f121185f = bVar;
        this.f121188i = fVar;
        C2563k<Integer> kVar = new C2563k<>();
        this.f121182c = kVar;
        this.f121183d = new C2563k<>();
        this.f121184e = new C52647c(this);
        this.f121187h = kVar;
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
