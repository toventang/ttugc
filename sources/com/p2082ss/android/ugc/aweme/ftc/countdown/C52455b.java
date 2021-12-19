package com.p2082ss.android.ugc.aweme.ftc.countdown;

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
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1617a.C22116a;
import com.bytedance.scene.p1617a.p1618a.C22118b;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.b */
public final class C52455b extends AbstractC2562j<AbstractC52454a> implements AbstractC20382b, AbstractC21566a, AbstractC52454a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120794a = {new C89232y(C52455b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b */
    public final AbstractC14177d f120795b = ((AbstractC14177d) getDiContainer().mo35249a(AbstractC14177d.class, (String) null));

    /* renamed from: c */
    public final AbstractC52568a f120796c = ((AbstractC52568a) getDiContainer().mo35249a(AbstractC52568a.class, (String) null));

    /* renamed from: d */
    final C2563k<Integer> f120797d;

    /* renamed from: e */
    public int f120798e;

    /* renamed from: f */
    public AbstractC22219j f120799f;

    /* renamed from: g */
    public final AbstractC52488i f120800g;

    /* renamed from: h */
    public final AbstractC22186b f120801h;

    /* renamed from: i */
    private final AbstractC89248d f120802i = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: j */
    private final C2559g<Integer> f120803j;

    /* renamed from: k */
    private final C21582f f120804k;

    static {
        Covode.recordClassIndex(61851);
    }

    /* renamed from: b */
    public final AbstractC14193m mo88230b() {
        return (AbstractC14193m) this.f120802i.mo23374a(this, f120794a[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52454a
    /* renamed from: a */
    public final C2559g<Integer> mo88228a() {
        return this.f120803j;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC52454a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120804k;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.b$b */
    public static final class C52458b implements AbstractC52488i {

        /* renamed from: a */
        final /* synthetic */ C52455b f120806a;

        static {
            Covode.recordClassIndex(61854);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52488i
        /* renamed from: a */
        public final void mo88232a() {
            this.f120806a.mo88229a(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52488i
        /* renamed from: b */
        public final void mo88236b() {
            if (this.f120806a.f120801h.f52549m != null) {
                this.f120806a.f120796c.mo88325b(false);
                this.f120806a.mo88230b().mo22897e(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52488i
        /* renamed from: c */
        public final void mo88237c() {
            C22239d a;
            if (this.f120806a.f120801h.f52549m != null) {
                this.f120806a.mo88230b().mo22897e(false);
                this.f120806a.f120795b.mo22779a(new C14171ac(true, false, 6));
                AbstractC22219j jVar = this.f120806a.f120799f;
                if (jVar != null && (a = C22227b.m41825a(this.f120806a.f120801h)) != null) {
                    a.mo36536b(jVar);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52458b(C52455b bVar) {
            this.f120806a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52488i
        /* renamed from: a */
        public final void mo88233a(int i) {
            C52455b bVar = this.f120806a;
            bVar.f120798e = i;
            bVar.f120797d.mo6999a(Integer.valueOf(i));
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52488i
        /* renamed from: a */
        public final void mo88235a(boolean z) {
            this.f120806a.f120795b.mo22779a(new C14171ac(!z, false, 6));
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52488i
        /* renamed from: a */
        public final void mo88234a(long j) {
            if (this.f120806a.f120801h.f52549m != null) {
                this.f120806a.mo88230b().mo22876a(new C14196o(3, this.f120806a.f120798e, 4));
                this.f120806a.mo88230b().mo22872a(this.f120806a.f120798e);
                AbstractC52568a aVar = (AbstractC52568a) this.f120806a.getDiContainer().mo35252b(AbstractC52568a.class, null);
                if (aVar != null) {
                    aVar.mo88325b(true);
                    aVar.mo88324b();
                    aVar.mo88328e();
                    aVar.mo88327d();
                }
                this.f120806a.mo88230b().mo22897e(false);
                this.f120806a.mo88230b().mo22873a(j);
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

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.b$a */
    public static final class C52456a extends C22118b {
        static {
            Covode.recordClassIndex(61852);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.countdown.b$a$a */
        static final class C52457a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C22116a f120805a;

            static {
                Covode.recordClassIndex(61853);
            }

            C52457a(C22116a aVar) {
                this.f120805a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22116a aVar = this.f120805a;
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
            ofFloat.addUpdateListener(new C52457a(aVar));
            C89219l.m154716b(ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(250L);
            return ofFloat;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52454a
    /* renamed from: a */
    public final void mo88229a(boolean z) {
        C22239d a = C22227b.m41825a(this.f120801h);
        if (a != null) {
            if (z && !C67279a.m119197a(a, C52489j.class)) {
                C52489j jVar = new C52489j(this.f120800g);
                this.f120799f = jVar;
                C22154f.C22155a aVar = new C22154f.C22155a();
                aVar.f52384a = true;
                aVar.f52386c = new C52456a();
                a.mo36537b(jVar, aVar.mo36338b());
            } else if (C67279a.m119197a(a, C52489j.class)) {
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

    public C52455b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f120801h = bVar;
        this.f120804k = fVar;
        C2563k<Integer> kVar = new C2563k<>();
        this.f120797d = kVar;
        this.f120803j = kVar;
        this.f120800g = new C52458b(this);
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
