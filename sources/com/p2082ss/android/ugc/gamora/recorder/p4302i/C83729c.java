package com.p2082ss.android.ugc.gamora.recorder.p4302i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
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
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.property.C65439dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.i.c */
public final class C83729c extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: c */
    public static final C83730a f186880c = new C83730a((byte) 0);

    /* renamed from: a */
    public RelativeLayout f186881a;

    /* renamed from: b */
    public RelativeLayout f186882b;

    /* renamed from: d */
    private final C2560h<Boolean> f186883d;

    /* renamed from: e */
    private final C2560h<Boolean> f186884e;

    /* renamed from: f */
    private final C2560h<Boolean> f186885f;

    static {
        Covode.recordClassIndex(97619);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.c$a */
    public static final class C83730a {
        static {
            Covode.recordClassIndex(97620);
        }

        private C83730a() {
        }

        public /* synthetic */ C83730a(byte b) {
            this();
        }
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

    /* renamed from: a */
    public static final /* synthetic */ RelativeLayout m144067a(C83729c cVar) {
        RelativeLayout relativeLayout = cVar.f186882b;
        if (relativeLayout == null) {
            C89219l.m154710a("cornersTop");
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ RelativeLayout m144068b(C83729c cVar) {
        RelativeLayout relativeLayout = cVar.f186881a;
        if (relativeLayout == null) {
            C89219l.m154710a("cornersBottom");
        }
        return relativeLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.c$b */
    static final class C83731b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83729c f186886a;

        static {
            Covode.recordClassIndex(97621);
        }

        C83731b(C83729c cVar) {
            this.f186886a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ViewGroup.LayoutParams layoutParams = C83729c.m144067a(this.f186886a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C70636dh.m124833c(this.f186886a.mo36486t());
            } else {
                i = 0;
            }
            layoutParams2.topMargin = i;
            C83729c.m144067a(this.f186886a).setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.c$c */
    static final class C83732c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83729c f186887a;

        static {
            Covode.recordClassIndex(97622);
        }

        C83732c(C83729c cVar) {
            this.f186887a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ViewGroup.LayoutParams layoutParams = C83729c.m144068b(this.f186887a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C33398a.m68487c();
            } else {
                i = 0;
            }
            layoutParams2.bottomMargin = i;
            C83729c.m144068b(this.f186887a).setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.i.c$d */
    static final class C83733d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83729c f186888a;

        static {
            Covode.recordClassIndex(97623);
        }

        C83733d(C83729c cVar) {
            this.f186888a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            RelativeLayout a = C83729c.m144067a(this.f186888a);
            C89219l.m154716b(bool, "");
            int i2 = 0;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
            RelativeLayout b = C83729c.m144068b(this.f186888a);
            if (!bool.booleanValue()) {
                i2 = 4;
            }
            b.setVisibility(i2);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.aer);
        C89219l.m154716b(c, "");
        this.f186882b = (RelativeLayout) c;
        View c2 = mo36475c(R.id.aeq);
        C89219l.m154716b(c2, "");
        this.f186881a = (RelativeLayout) c2;
        RelativeLayout relativeLayout = this.f186882b;
        if (relativeLayout == null) {
            C89219l.m154710a("cornersTop");
        }
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f186881a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("cornersBottom");
        }
        relativeLayout2.setVisibility(0);
        this.f186884e.mo7036a(this, new C83731b(this));
        this.f186885f.mo7036a(this, new C83732c(this));
        if (C65439dv.m117157a()) {
            RelativeLayout relativeLayout3 = this.f186881a;
            if (relativeLayout3 == null) {
                C89219l.m154710a("cornersBottom");
            }
            relativeLayout3.setVisibility(4);
            RelativeLayout relativeLayout4 = this.f186882b;
            if (relativeLayout4 == null) {
                C89219l.m154710a("cornersTop");
            }
            relativeLayout4.setVisibility(4);
            return;
        }
        this.f186883d.mo7036a(this, new C83733d(this));
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
        View a = C1764a.m5927a(layoutInflater, R.layout.bi0, viewGroup, false);
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

    public C83729c(C2560h<Boolean> hVar, C2560h<Boolean> hVar2, C2560h<Boolean> hVar3) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        C89219l.m154721d(hVar3, "");
        this.f186883d = hVar;
        this.f186884e = hVar2;
        this.f186885f = hVar3;
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
