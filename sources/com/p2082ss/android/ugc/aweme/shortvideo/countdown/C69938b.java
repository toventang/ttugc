package com.p2082ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
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
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.navigation.AbstractC22259h;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1617a.C22116a;
import com.bytedance.scene.p1617a.p1618a.C22118b;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a;
import com.p2082ss.android.ugc.gamora.recorder.p4299f.C83672b;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b */
public final class C69938b extends AbstractC2562j<AbstractC69937a> implements AbstractC20382b, AbstractC21566a, AbstractC69937a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f156298a = {new C89232y(C69938b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C69938b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC14177d f156299b = ((AbstractC14177d) getDiContainer().mo35249a(AbstractC14177d.class, (String) null));

    /* renamed from: c */
    public final AbstractC83746a f156300c = ((AbstractC83746a) getDiContainer().mo35249a(AbstractC83746a.class, (String) null));

    /* renamed from: d */
    public final AbstractC83492a f156301d = ((AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null));

    /* renamed from: e */
    final C2563k<Integer> f156302e;

    /* renamed from: f */
    public int f156303f;

    /* renamed from: g */
    public AbstractC22219j f156304g;

    /* renamed from: h */
    public final AbstractC83671a f156305h;

    /* renamed from: i */
    public final AbstractC22186b f156306i;

    /* renamed from: j */
    private final AbstractC89248d f156307j = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: k */
    private final AbstractC71864a f156308k = ((AbstractC71864a) getDiContainer().mo35249a(AbstractC71864a.class, (String) null));

    /* renamed from: l */
    private final AbstractC89248d f156309l = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: m */
    private final C2559g<Integer> f156310m;

    /* renamed from: n */
    private final C21582f f156311n;

    static {
        Covode.recordClassIndex(82349);
    }

    /* renamed from: b */
    public final AbstractC14193m mo110374b() {
        return (AbstractC14193m) this.f156307j.mo23374a(this, f156298a[0]);
    }

    /* renamed from: c */
    public final AbstractC84089j mo110375c() {
        return (AbstractC84089j) this.f156309l.mo23374a(this, f156298a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69937a
    /* renamed from: a */
    public final C2559g<Integer> mo110372a() {
        return this.f156310m;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC69937a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f156311n;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$b */
    public static final class C69941b implements AbstractC83671a {

        /* renamed from: a */
        final /* synthetic */ C69938b f156313a;

        static {
            Covode.recordClassIndex(82352);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a
        /* renamed from: a */
        public final void mo110378a() {
            this.f156313a.mo110373a(false);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a
        /* renamed from: b */
        public final void mo110382b() {
            if (this.f156313a.f156306i.f52549m != null) {
                this.f156313a.f156300c.mo128718c(false);
                this.f156313a.mo110374b().mo22897e(true);
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a
        /* renamed from: c */
        public final void mo110383c() {
            C22239d a;
            if (this.f156313a.f156306i.f52549m != null) {
                this.f156313a.mo110374b().mo22897e(false);
                this.f156313a.f156299b.mo22779a(new C14171ac(true, false, 6));
                AbstractC22219j jVar = this.f156313a.f156304g;
                if (jVar != null && (a = C22227b.m41825a(this.f156313a.f156306i)) != null) {
                    a.mo36536b(jVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69941b(C69938b bVar) {
            this.f156313a = bVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a
        /* renamed from: a */
        public final void mo110379a(int i) {
            C69938b bVar = this.f156313a;
            bVar.f156303f = i;
            bVar.f156302e.mo6999a(Integer.valueOf(i));
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a
        /* renamed from: a */
        public final void mo110381a(boolean z) {
            this.f156313a.f156299b.mo22779a(new C14171ac(!z, false, 6));
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4299f.AbstractC83671a
        /* renamed from: a */
        public final void mo110380a(long j) {
            if (this.f156313a.f156306i.f52549m != null) {
                this.f156313a.mo110374b().mo22876a(new C14196o(3, this.f156313a.f156303f, 4));
                this.f156313a.mo110374b().mo22872a(this.f156313a.f156303f);
                AbstractC83746a aVar = (AbstractC83746a) this.f156313a.getDiContainer().mo35252b(AbstractC83746a.class, null);
                if (aVar != null) {
                    aVar.mo128718c(true);
                    aVar.mo128710a();
                    aVar.mo128719d();
                    aVar.mo128717c();
                }
                this.f156313a.mo110374b().mo22897e(false);
                this.f156313a.mo110374b().mo22873a(j);
            }
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

    /* renamed from: d */
    public final boolean mo110376d() {
        C22239d a = C22227b.m41825a(this.f156306i);
        if (a == null) {
            C89219l.m154715b();
        }
        return C67279a.m119197a(a, C83672b.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$c */
    public static final class C69942c implements AbstractC22259h {

        /* renamed from: a */
        final /* synthetic */ C69938b f156314a;

        /* renamed from: b */
        final /* synthetic */ C22239d f156315b;

        static {
            Covode.recordClassIndex(82353);
        }

        @Override // com.bytedance.scene.navigation.AbstractC22259h
        /* renamed from: a */
        public final boolean mo36540a() {
            AbstractC83492a aVar = this.f156314a.f156301d;
            if (aVar != null) {
                aVar.mo128511a(1, false);
            }
            AbstractC83492a aVar2 = this.f156314a.f156301d;
            if (aVar2 != null) {
                aVar2.mo128515b(this.f156314a.mo110375c().mo23167t().mo119294f());
            }
            this.f156315b.mo36532a(this);
            return false;
        }

        C69942c(C69938b bVar, C22239d dVar) {
            this.f156314a = bVar;
            this.f156315b = dVar;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$a */
    public static final class C69939a extends C22118b {
        static {
            Covode.recordClassIndex(82350);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.b$a$a */
        static final class C69940a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C22116a f156312a;

            static {
                Covode.recordClassIndex(82351);
            }

            C69940a(C22116a aVar) {
                this.f156312a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22116a aVar = this.f156312a;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                View view = aVar.f52296b;
                C89219l.m154716b(view, "");
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setTranslationY(((Float) animatedValue).floatValue());
            }
        }

        @Override // com.bytedance.scene.p1617a.p1618a.C22118b, com.bytedance.scene.p1617a.AbstractC22139e
        /* renamed from: b */
        public final Animator mo36308b(C22116a aVar, C22116a aVar2) {
            if (aVar == null) {
                return new AnimatorSet();
            }
            View view = aVar.f52296b;
            C89219l.m154716b(view, "");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) view.getMeasuredHeight());
            ofFloat.addUpdateListener(new C69940a(aVar));
            C89219l.m154716b(ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(250L);
            return ofFloat;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69937a
    /* renamed from: a */
    public final void mo110373a(boolean z) {
        C22239d a = C22227b.m41825a(this.f156306i);
        if (a != null) {
            if (z && !C67279a.m119197a(a, C83672b.class)) {
                AbstractC83492a aVar = this.f156301d;
                if (aVar != null) {
                    aVar.mo128511a(1, true);
                }
                AbstractC83492a aVar2 = this.f156301d;
                if (aVar2 != null) {
                    aVar2.mo128516c(null);
                }
                if (C72847c.m128642h(mo110375c().mo23167t().mo119294f())) {
                    this.f156299b.mo22747A().mo56983h();
                }
                C83672b bVar = new C83672b(this.f156305h);
                this.f156304g = bVar;
                C22154f.C22155a aVar3 = new C22154f.C22155a();
                aVar3.f52384a = true;
                aVar3.f52386c = new C69939a();
                a.mo36537b(bVar, aVar3.mo36338b());
                a.mo36528a(C22228c.m41832b(this.f156306i), new C69942c(this, a));
            } else if (C67279a.m119197a(a, C83672b.class)) {
                a.mo36524E();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C69938b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f156306i = bVar;
        this.f156311n = fVar;
        C2563k<Integer> kVar = new C2563k<>();
        this.f156302e = kVar;
        this.f156310m = kVar;
        this.f156305h = new C69941b(this);
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
