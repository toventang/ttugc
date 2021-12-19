package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.setting.C68062ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm */
public final class C70282bm extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: d */
    public static final C70283a f157134d = new C70283a((byte) 0);

    /* renamed from: a */
    public ImageView f157135a;

    /* renamed from: b */
    public TextView f157136b;

    /* renamed from: c */
    public CutVideoViewModel f157137c;

    /* renamed from: e */
    private CutVideoTitleBarViewModel f157138e;

    static {
        Covode.recordClassIndex(82725);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$a */
    public static final class C70283a {
        static {
            Covode.recordClassIndex(82726);
        }

        private C70283a() {
        }

        public /* synthetic */ C70283a(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$c */
    public static final class C70285c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157140a;

        static {
            Covode.recordClassIndex(82728);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70285c(C70282bm bmVar) {
            this.f157140a = bmVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C73975b.C73976a.f166071a.start("av_video_edit", "click onNext btn");
            C70282bm.m124067c(this.f157140a).mo33689c(CutVideoViewModel.C70149a.f156835a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$b */
    static final class View$OnClickListenerC70284b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157139a;

        static {
            Covode.recordClassIndex(82727);
        }

        View$OnClickListenerC70284b(C70282bm bmVar) {
            this.f157139a = bmVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C70282bm.m124067c(this.f157139a).mo110800a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m124065a(C70282bm bmVar) {
        ImageView imageView = bmVar.f157135a;
        if (imageView == null) {
            C89219l.m154710a("ivBack");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m124066b(C70282bm bmVar) {
        TextView textView = bmVar.f157136b;
        if (textView == null) {
            C89219l.m154710a("tvNext");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoViewModel m124067c(C70282bm bmVar) {
        CutVideoViewModel cutVideoViewModel = bmVar.f157137c;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f157137c = (CutVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(CutVideoTitleBarViewModel.class);
        C89219l.m154716b(a2, "");
        this.f157138e = (CutVideoTitleBarViewModel) a2;
        Typeface a3 = C17301b.m32033a().mo27611a(C17303d.f41573g);
        if (a3 != null) {
            TextView textView = this.f157136b;
            if (textView == null) {
                C89219l.m154710a("tvNext");
            }
            textView.setTypeface(a3);
        }
        CutVideoViewModel cutVideoViewModel = this.f157137c;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            View view = this.f52550n;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ((int) C13628n.m24520b(this.f52549m, 25.0f)) + C70636dh.m124833c(this.f52549m);
            View view2 = this.f52550n;
            C89219l.m154716b(view2, "");
            view2.setLayoutParams(layoutParams2);
        } else {
            View view3 = this.f52550n;
            C89219l.m154716b(view3, "");
            if (view3.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = C70636dh.m124833c(this.f52549m);
                view3.setLayoutParams(layoutParams4);
            } else if (view3.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.topMargin = C70636dh.m124833c(this.f52549m);
                view3.setLayoutParams(layoutParams6);
            }
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f157138e;
        if (cutVideoTitleBarViewModel == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel, C70292bn.f157148a, new C20370ah(), new C70288e(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f157138e;
        if (cutVideoTitleBarViewModel2 == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel2, C70293bo.f157149a, new C20370ah(), new C70289f(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel3 = this.f157138e;
        if (cutVideoTitleBarViewModel3 == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel3, C70294bp.f157150a, new C20370ah(), new C70290g(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel4 = this.f157138e;
        if (cutVideoTitleBarViewModel4 == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel4, C70295bq.f157151a, new C20370ah(), new C70291h(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel5 = this.f157138e;
        if (cutVideoTitleBarViewModel5 == null) {
            C89219l.m154710a("titleBarViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoTitleBarViewModel5, C70296br.f157152a, new C70286d(this));
        ImageView imageView = this.f157135a;
        if (imageView == null) {
            C89219l.m154710a("ivBack");
        }
        imageView.setOnClickListener(new View$OnClickListenerC70284b(this));
        TextView textView2 = this.f157136b;
        if (textView2 == null) {
            C89219l.m154710a("tvNext");
        }
        textView2.setOnClickListener(new C70285c(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$e */
    static final class C70288e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157144a;

        static {
            Covode.recordClassIndex(82731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70288e(C70282bm bmVar) {
            super(2);
            this.f157144a = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            ImageView a = C70282bm.m124065a(this.f157144a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$f */
    static final class C70289f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157145a;

        static {
            Covode.recordClassIndex(82732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70289f(C70282bm bmVar) {
            super(2);
            this.f157145a = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            TextView b = C70282bm.m124066b(this.f157145a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 4;
            }
            b.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$g */
    static final class C70290g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157146a;

        static {
            Covode.recordClassIndex(82733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70290g(C70282bm bmVar) {
            super(2);
            this.f157146a = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70282bm.m124065a(this.f157146a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$h */
    static final class C70291h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157147a;

        static {
            Covode.recordClassIndex(82734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70291h(C70282bm bmVar) {
            super(2);
            this.f157147a = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70282bm.m124066b(this.f157147a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.arw, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bm$d */
    static final class C70286d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70282bm f157141a;

        static {
            Covode.recordClassIndex(82729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70286d(C70282bm bmVar) {
            super(2);
            this.f157141a = bmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            final boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            float f = 0.0f;
            float f2 = 1.0f;
            if (!booleanValue) {
                f = 1.0f;
                f2 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f157141a.f52550n, "alpha", f, f2);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.addListener(new AnimatorListenerAdapter(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70282bm.C70286d.C702871 */

                /* renamed from: a */
                final /* synthetic */ C70286d f157142a;

                static {
                    Covode.recordClassIndex(82730);
                }

                public final void onAnimationEnd(Animator animator) {
                    C89219l.m154721d(animator, "");
                    super.onAnimationEnd(animator);
                    if (booleanValue) {
                        View view = this.f157142a.f157141a.f52550n;
                        if (view != null) {
                            view.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    View view2 = this.f157142a.f157141a.f52550n;
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                }

                {
                    this.f157142a = r1;
                }
            });
            ofFloat.start();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.brv);
        C89219l.m154716b(c, "");
        this.f157135a = (ImageView) c;
        if (C68062ck.m120368a()) {
            ImageView imageView = this.f157135a;
            if (imageView == null) {
                C89219l.m154710a("ivBack");
            }
            imageView.setImageResource(2131232190);
        }
        View c2 = mo36475c(R.id.ero);
        C89219l.m154716b(c2, "");
        this.f157136b = (TextView) c2;
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
