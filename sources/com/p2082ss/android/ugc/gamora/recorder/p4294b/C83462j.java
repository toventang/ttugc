package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.common.utility.C13628n;
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
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.views.TransEdgeView;
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
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.j */
public final class C83462j extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: c */
    public static final C83463a f186406c = new C83463a((byte) 0);

    /* renamed from: a */
    public TabHost f186407a;

    /* renamed from: b */
    public final C83410e f186408b;

    /* renamed from: d */
    private final AbstractC89244h f186409d = C89250i.m154773a((AbstractC89171a) new C83465c(this));

    /* renamed from: e */
    private final AbstractC89244h f186410e = C89250i.m154773a((AbstractC89171a) new C83466d(this));

    /* renamed from: f */
    private final C21582f f186411f;

    /* renamed from: g */
    private final ShortVideoContext f186412g;

    /* renamed from: h */
    private final C2560h<Boolean> f186413h;

    static {
        Covode.recordClassIndex(97348);
    }

    /* renamed from: a */
    private final TransEdgeView m143833a() {
        return (TransEdgeView) this.f186410e.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.j$a */
    public static final class C83463a {
        static {
            Covode.recordClassIndex(97349);
        }

        private C83463a() {
        }

        public /* synthetic */ C83463a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186411f;
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

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.j$c */
    static final class C83465c extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C83462j f186415a;

        static {
            Covode.recordClassIndex(97351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83465c(C83462j jVar) {
            super(0);
            this.f186415a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return C83462j.m143832a(this.f186415a).findViewById(R.id.acf);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.j$d */
    static final class C83466d extends AbstractC89220m implements AbstractC89171a<TransEdgeView> {

        /* renamed from: a */
        final /* synthetic */ C83462j f186416a;

        static {
            Covode.recordClassIndex(97352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83466d(C83462j jVar) {
            super(0);
            this.f186416a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TransEdgeView invoke() {
            return C83462j.m143832a(this.f186416a).findViewById(R.id.ee0);
        }
    }

    /* renamed from: b */
    private final void m143834b() {
        ViewGroup.LayoutParams layoutParams = m143833a().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float b = C13628n.m24520b(mo36486t(), 16.0f);
        if (marginLayoutParams.leftMargin > 0 && marginLayoutParams.rightMargin > 0) {
            m143833a().mo125072c();
            m143833a().setDrawSize(b);
        } else if (marginLayoutParams.leftMargin == 0) {
            m143833a().mo125071b();
            m143833a().setDrawSize(b);
        } else if (marginLayoutParams.rightMargin == 0) {
            m143833a().mo125070a();
            m143833a().setDrawSize(b);
        } else {
            m143833a().setDrawSize(0.0f);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TabHost m143832a(C83462j jVar) {
        TabHost tabHost = jVar.f186407a;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        return tabHost;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.j$b */
    static final class C83464b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83462j f186414a;

        static {
            Covode.recordClassIndex(97350);
        }

        C83464b(C83462j jVar) {
            this.f186414a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            ViewGroup.LayoutParams layoutParams = C83462j.m143832a(this.f186414a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = (C33398a.m68487c() - ((int) C13628n.m24520b(this.f186414a.mo36486t(), 40.0f))) / 2;
            } else {
                i = 0;
            }
            marginLayoutParams.bottomMargin = i;
            C83462j.m143832a(this.f186414a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final int mo128477a(Object obj) {
        C89219l.m154721d(obj, "");
        TabHost tabHost = this.f186407a;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost2 = this.f186407a;
            if (tabHost2 == null) {
                C89219l.m154710a("tabHost");
            }
            if (C89219l.m154714a(obj, tabHost2.mo116829a(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo128481b(Integer num) {
        int i;
        ViewGroup.LayoutParams layoutParams = m143833a().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        marginLayoutParams.leftMargin = i;
        TabHost tabHost = this.f186407a;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        if (num != null) {
            i2 = num.intValue();
        }
        tabHost.setStartMargin(i2);
        m143833a().setLayoutParams(marginLayoutParams);
        m143834b();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.vg);
        C89219l.m154716b(c, "");
        TabHost tabHost = (TabHost) c;
        this.f186407a = tabHost;
        C83410e eVar = this.f186408b;
        ShortVideoContext shortVideoContext = this.f186412g;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        eVar.mo128426a(shortVideoContext, tabHost);
        this.f186413h.mo7036a(this, new C83464b(this));
    }

    /* renamed from: a */
    public final void mo128479a(Animation animation) {
        C89219l.m154721d(animation, "");
        TabHost tabHost = this.f186407a;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost.clearAnimation();
        TabHost tabHost2 = this.f186407a;
        if (tabHost2 == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost2.startAnimation(animation);
    }

    /* renamed from: a */
    public final void mo128480a(Integer num) {
        int i;
        ViewGroup.LayoutParams layoutParams = m143833a().getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        marginLayoutParams.rightMargin = i;
        m143833a().setLayoutParams(marginLayoutParams);
        m143834b();
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
        View a = C1764a.m5927a(layoutInflater, R.layout.bho, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo128478a(int i, boolean z) {
        TabHost tabHost = this.f186407a;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost.mo116831a(i, z, true);
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

    public C83462j(C21582f fVar, ShortVideoContext shortVideoContext, C83410e eVar, C2560h<Boolean> hVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(hVar, "");
        this.f186411f = fVar;
        this.f186412g = shortVideoContext;
        this.f186408b = eVar;
        this.f186413h = hVar;
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
