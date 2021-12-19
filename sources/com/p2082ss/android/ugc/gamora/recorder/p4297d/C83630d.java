package com.p2082ss.android.ugc.gamora.recorder.p4297d;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63175ai;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p2082ss.android.ugc.aweme.tools.C78483e;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.d.d */
public final class C83630d extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: c */
    public static final C83631a f186711c = new C83631a((byte) 0);

    /* renamed from: a */
    long f186712a;

    /* renamed from: b */
    public LinearLayout f186713b;

    /* renamed from: d */
    private TuxTextView f186714d;

    /* renamed from: e */
    private final C2560h<Boolean> f186715e;

    static {
        Covode.recordClassIndex(97520);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.d$a */
    public static final class C83631a {
        static {
            Covode.recordClassIndex(97521);
        }

        private C83631a() {
        }

        public /* synthetic */ C83631a(byte b) {
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
    public static final /* synthetic */ LinearLayout m143968a(C83630d dVar) {
        LinearLayout linearLayout = dVar.f186713b;
        if (linearLayout == null) {
            C89219l.m154710a("commerceStickerGoods");
        }
        return linearLayout;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    public C83630d(C2560h<Boolean> hVar) {
        C89219l.m154721d(hVar, "");
        this.f186715e = hVar;
        FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
        C89219l.m154716b(faceStickerBean, "");
        this.f186712a = faceStickerBean.getStickerId();
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.ab0);
        C89219l.m154716b(c, "");
        this.f186713b = (LinearLayout) c;
        View c2 = mo36475c(R.id.ab1);
        C89219l.m154716b(c2, "");
        TuxTextView tuxTextView = (TuxTextView) c2;
        this.f186714d = tuxTextView;
        if (tuxTextView == null) {
            C89219l.m154710a("commerceStickerText");
        }
        tuxTextView.setTuxFont(52);
        this.f186715e.mo7036a(this, new C83632b(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.d$b */
    static final class C83632b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83630d f186716a;

        static {
            Covode.recordClassIndex(97522);
        }

        C83632b(C83630d dVar) {
            this.f186716a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int b;
            Boolean bool = (Boolean) obj;
            int b2 = (int) C13628n.m24520b(this.f186716a.f52549m, 33.0f);
            ViewGroup.LayoutParams layoutParams = C83630d.m143968a(this.f186716a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                b = b2 + ((int) C13628n.m24520b(this.f186716a.f52549m, 186.0f));
            } else {
                b = (int) C13628n.m24520b(this.f186716a.f52549m, 186.0f);
            }
            layoutParams2.bottomMargin = b;
            C83630d.m143968a(this.f186716a).setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.d.d$c */
    public static final class View$OnClickListenerC83633c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83630d f186717a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f186718b;

        /* renamed from: c */
        final /* synthetic */ C78483e f186719c;

        /* renamed from: d */
        final /* synthetic */ FaceStickerCommerceBean f186720d;

        static {
            Covode.recordClassIndex(97523);
        }

        View$OnClickListenerC83633c(C83630d dVar, FaceStickerBean faceStickerBean, C78483e eVar, FaceStickerCommerceBean faceStickerCommerceBean) {
            this.f186717a = dVar;
            this.f186718b = faceStickerBean;
            this.f186719c = eVar;
            this.f186720d = faceStickerCommerceBean;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            a.f156490i = true;
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, "");
            a2.f156491j = false;
            C80322d.m139251a("click_transform_link", new C84425b().mo129404a("prop_id", this.f186718b.getStickerId()).mo129406a("shoot_way", this.f186719c.f176389b).mo129406a("carrier_type", "video_shoot_page").f188764a);
            if (!C63238c.f143585l.mo93822a(this.f186717a.mo36486t(), this.f186720d.f169519b)) {
                AbstractC63175ai aiVar = C63238c.f143585l;
                Activity t = this.f186717a.mo36486t();
                String str = this.f186720d.f169518a;
                C89219l.m154716b(str, "");
                String valueOf = String.valueOf(this.f186718b.getStickerId());
                if (!TextUtils.isEmpty(str)) {
                    Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("enter_from", "commerce_sticker_button");
                    if (TextUtils.isEmpty(valueOf)) {
                        valueOf = "";
                    }
                    str = appendQueryParameter.appendQueryParameter("sticker_id", valueOf).build().toString();
                }
                C89219l.m154716b(str, "");
                aiVar.mo93823a(t, str, null);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo128640a(C78483e eVar) {
        C89219l.m154721d(eVar, "");
        FaceStickerBean faceStickerBean = eVar.f176390c;
        boolean z = false;
        if (faceStickerBean == null || !C83624b.m143964a(faceStickerBean)) {
            AbstractC22219j jVar = this.f52551o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            ((AbstractC22186b) jVar).mo36413d(this);
            return false;
        }
        AbstractC22219j jVar2 = this.f52551o;
        Objects.requireNonNull(jVar2, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        ((AbstractC22186b) jVar2).mo36417e(this);
        FaceStickerCommerceBean faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean();
        if (faceStickerCommerceBean == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(faceStickerCommerceBean, "");
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        if (!a.f156491j.booleanValue()) {
            C80322d.m139251a("show_transform_link", new C84425b().mo129404a("prop_id", faceStickerBean.getStickerId()).mo129406a("shoot_way", eVar.f176389b).mo129406a("carrier_type", "video_shoot_page").f188764a);
            z = true;
        }
        this.f186712a = faceStickerBean.getStickerId();
        TuxTextView tuxTextView = this.f186714d;
        if (tuxTextView == null) {
            C89219l.m154710a("commerceStickerText");
        }
        tuxTextView.setText(faceStickerCommerceBean.f169520c);
        LinearLayout linearLayout = this.f186713b;
        if (linearLayout == null) {
            C89219l.m154710a("commerceStickerGoods");
        }
        linearLayout.setOnClickListener(new View$OnClickListenerC83633c(this, faceStickerBean, eVar, faceStickerCommerceBean));
        return z;
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
        View a = C1764a.m5927a(layoutInflater, R.layout.bht, viewGroup, false);
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
