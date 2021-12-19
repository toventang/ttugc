package com.p2082ss.android.ugc.aweme.ftc.p3032d;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
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
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.d.b */
public final class C52503b extends AbstractC2562j<AbstractC52502a> implements AbstractC20382b, AbstractC21566a, AbstractC52502a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120901a = {new C89232y(C52503b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C52503b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC52502a f120902b = this;

    /* renamed from: c */
    public final C2564l<C89378p<Float, Float>> f120903c = new C2564l<>(null);

    /* renamed from: d */
    public final ActivityC0945e f120904d = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: e */
    public final ShortVideoContext f120905e = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: f */
    final AbstractC89248d f120906f = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: g */
    public final AbstractC22186b f120907g;

    /* renamed from: h */
    private final C2564l<Drawable> f120908h = new C2564l<>(null);

    /* renamed from: i */
    private final AbstractC14177d f120909i = ((AbstractC14177d) getDiContainer().mo35249a(AbstractC14177d.class, (String) null));

    /* renamed from: j */
    private final AbstractC89248d f120910j = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);

    /* renamed from: k */
    private final AbstractC89244h f120911k = C89250i.m154773a((AbstractC89171a) new C52511h(this));

    /* renamed from: l */
    private final C21582f f120912l;

    static {
        Covode.recordClassIndex(61899);
    }

    /* renamed from: b */
    public final AbstractC71864a mo88296b() {
        return (AbstractC71864a) this.f120910j.mo23374a(this, f120901a[1]);
    }

    /* renamed from: c */
    public final AbstractC52525e mo88297c() {
        return (AbstractC52525e) this.f120911k.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$b */
    public static final class C52505b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C52505b f120914a = new C52505b();

        static {
            Covode.recordClassIndex(61901);
        }

        C52505b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC52502a getApiComponent() {
        return this.f120902b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120912l;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$e */
    static final class C52508e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52503b f120917a;

        static {
            Covode.recordClassIndex(61904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52508e(C52503b bVar) {
            super(0);
            this.f120917a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f120917a.mo88294a();
            return C89391z.f203057a;
        }
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$a */
    public static final class C52504a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52503b f120913a;

        static {
            Covode.recordClassIndex(61900);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52504a(C52503b bVar) {
            super(0);
            this.f120913a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f120913a.mo88297c().mo88298a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$c */
    public static final class C52506c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52503b f120915a;

        static {
            Covode.recordClassIndex(61902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52506c(C52503b bVar) {
            super(0);
            this.f120915a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63238c.f143587n.mo101713a();
            this.f120915a.mo88297c().mo88298a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$h */
    static final class C52511h extends AbstractC89220m implements AbstractC89171a<C52512c> {

        /* renamed from: a */
        final /* synthetic */ C52503b f120920a;

        static {
            Covode.recordClassIndex(61907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52511h(C52503b bVar) {
            super(0);
            this.f120920a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52512c invoke() {
            ActivityC0945e eVar = this.f120920a.f120904d;
            C52503b bVar = this.f120920a;
            return new C52512c(eVar, (AbstractC14193m) bVar.f120906f.mo23374a(bVar, C52503b.f120901a[0]));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$d */
    public static final class C52507d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52503b f120916a;

        static {
            Covode.recordClassIndex(61903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52507d(C52503b bVar) {
            super(0);
            this.f120916a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39162r.m79460a("reshoot", new C84425b().mo129406a("creation_id", this.f120916a.f120905e.f155830o).mo129406a("shoot_way", this.f120916a.f120905e.f155831p).mo129403a("draft_id", this.f120916a.f120905e.f155740A).f188764a);
            this.f120916a.mo88297c().mo88301b();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52502a
    /* renamed from: a */
    public final void mo88294a() {
        if (this.f120905e.f155817b.f155645a == 1 && !this.f120905e.f155817b.f155653i) {
            mo88297c().mo88299a(new C52504a(this));
        } else if (this.f120905e.f155817b.mo109896h() == 0) {
            mo88297c().mo88298a();
        } else {
            mo88297c().mo88300a(C52505b.f120914a, new C52506c(this), new C52507d(this));
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f120907g.mo36387a(R.id.dg9, new C52519d(new C52508e(this), this.f120908h, this.f120903c, mo88296b().mo113515d()), "FTCRecordExitScene");
        this.f120909i.mo22799ag().mo6997a(this, new C52509f(this));
        mo88296b().mo113507a().mo7036a(this, new C52510g(this));
    }

    /* renamed from: a */
    public final void mo88295a(boolean z) {
        AbstractC22186b bVar = this.f120907g;
        if (z) {
            C22226a.m41823a(bVar, "FTCRecordExitScene");
        } else {
            C22226a.m41824b(bVar, "FTCRecordExitScene");
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$f */
    static final class C52509f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52503b f120918a;

        static {
            Covode.recordClassIndex(61905);
        }

        C52509f(C52503b bVar) {
            this.f120918a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z = ((C14191k) obj).f34466b;
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(1.0f);
            if (z) {
                this.f120918a.f120903c.mo7019b(C89387v.m154943a(valueOf, valueOf2));
            } else {
                this.f120918a.f120903c.mo7019b(C89387v.m154943a(valueOf2, valueOf));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.b$g */
    static final class C52510g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52503b f120919a;

        static {
            Covode.recordClassIndex(61906);
        }

        C52510g(C52503b bVar) {
            this.f120919a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f120919a.mo88296b().mo113519g()) {
                this.f120919a.mo88295a(false);
                return;
            }
            C52503b bVar = this.f120919a;
            C89219l.m154716b(bool, "");
            bVar.mo88295a(bool.booleanValue());
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C52503b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f120907g = bVar;
        this.f120912l = fVar;
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
