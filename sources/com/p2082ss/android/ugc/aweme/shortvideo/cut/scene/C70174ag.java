package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70433c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70435a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
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
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ag */
public final class C70174ag extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: e */
    public static final C70175a f156915e = new C70175a((byte) 0);

    /* renamed from: a */
    public C70242ba f156916a;

    /* renamed from: b */
    public AbstractC70435a f156917b;

    /* renamed from: c */
    public StickPointModeChangeView f156918c;

    /* renamed from: d */
    public CutVideoMultiModeViewModel f156919d;

    static {
        Covode.recordClassIndex(82617);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ag$a */
    public static final class C70175a {
        static {
            Covode.recordClassIndex(82618);
        }

        private C70175a() {
        }

        public /* synthetic */ C70175a(byte b) {
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
    public final StickPointModeChangeView mo110835a() {
        StickPointModeChangeView stickPointModeChangeView = this.f156918c;
        if (stickPointModeChangeView == null) {
            C89219l.m154710a("modelChangeView");
        }
        return stickPointModeChangeView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ag$b */
    public static final class C70176b implements AbstractC70435a {

        /* renamed from: a */
        final /* synthetic */ C70174ag f156920a;

        static {
            Covode.recordClassIndex(82619);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70176b(C70174ag agVar) {
            this.f156920a = agVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70435a
        /* renamed from: a */
        public final void mo110829a(int i) {
            String str;
            if (C70174ag.m123892a(this.f156920a).f156806a != i) {
                C70174ag.m123892a(this.f156920a).f156806a = i;
                if (C70174ag.m123892a(this.f156920a).f156806a == 1) {
                    CutVideoMultiModeViewModel a = C70174ag.m123892a(this.f156920a);
                    Activity activity = this.f156920a.f52549m;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    a.mo110719a((ActivityC0945e) activity, false);
                } else {
                    CutVideoMultiModeViewModel a2 = C70174ag.m123892a(this.f156920a);
                    Activity activity2 = this.f156920a.f52549m;
                    Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ActivityC0945e eVar = (ActivityC0945e) activity2;
                    C89219l.m154721d(eVar, "");
                    AbstractC70298bt btVar = a2.f156807b;
                    if (btVar == null) {
                        C89219l.m154710a("stickerPointController");
                    }
                    btVar.mo110878d();
                    new C79459a(eVar).mo123052a(eVar.getResources().getString(R.string.g4s)).mo123053a();
                    JediViewModel a3 = C20531t.m38716a(eVar).mo33800a(CutVideoListViewModel.class);
                    C89219l.m154716b(a3, "");
                    ((CutVideoListViewModel) a3).mo110698b(true);
                    JediViewModel a4 = C20531t.m38716a(eVar).mo33800a(CutVideoEditViewModel.class);
                    C89219l.m154716b(a4, "");
                    CutVideoEditViewModel cutVideoEditViewModel = (CutVideoEditViewModel) a4;
                    cutVideoEditViewModel.mo110670b(false);
                    AbstractC70298bt btVar2 = a2.f156807b;
                    if (btVar2 == null) {
                        C89219l.m154710a("stickerPointController");
                    }
                    btVar2.mo110885k().mo110930a(false);
                    cutVideoEditViewModel.mo110667a();
                }
                AbstractC70435a aVar = this.f156920a.f156917b;
                if (aVar != null) {
                    aVar.mo110829a(i);
                }
                boolean a5 = C70174ag.m123892a(this.f156920a).mo110720a();
                C84425b a6 = C70463h.m124284a();
                if (a5) {
                    str = "sync_on";
                } else {
                    str = "sync_off";
                }
                C39162r.m79460a("change_sync_mode", a6.mo129406a("to_status", str).f188764a);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoMultiModeViewModel m123892a(C70174ag agVar) {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = agVar.f156919d;
        if (cutVideoMultiModeViewModel == null) {
            C89219l.m154710a("multiModelViewModel");
        }
        return cutVideoMultiModeViewModel;
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
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoMultiModeViewModel.class);
        C89219l.m154716b(a, "");
        this.f156919d = (CutVideoMultiModeViewModel) a;
        StickPointModeChangeView stickPointModeChangeView = this.f156918c;
        if (stickPointModeChangeView == null) {
            C89219l.m154710a("modelChangeView");
        }
        stickPointModeChangeView.setStickPointModeChangeListener(new C70176b(this));
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f156919d;
        if (cutVideoMultiModeViewModel == null) {
            C89219l.m154710a("multiModelViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoMultiModeViewModel, C70179ah.f156923a, new C70177c(this));
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f156919d;
        if (cutVideoMultiModeViewModel2 == null) {
            C89219l.m154710a("multiModelViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, cutVideoMultiModeViewModel2, C70180ai.f156924a, new C70178d(this));
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
        View a = C1764a.m5927a(layoutInflater, R.layout.arp, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ag$c */
    static final class C70177c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70174ag f156921a;

        static {
            Covode.recordClassIndex(82620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70177c(C70174ag agVar) {
            super(2);
            this.f156921a = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70433c.m124217b(this.f156921a.mo110835a());
            } else {
                this.f156921a.mo110835a().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ag$d */
    static final class C70178d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70174ag f156922a;

        static {
            Covode.recordClassIndex(82621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70178d(C70174ag agVar) {
            super(2);
            this.f156922a = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                C70433c.m124216a(this.f156922a.mo110835a());
            } else {
                this.f156922a.mo110835a().setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.cl4);
        C89219l.m154716b(c, "");
        this.f156918c = (StickPointModeChangeView) c;
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
