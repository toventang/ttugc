package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
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
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C70563d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70983b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80221ao;
import com.p2082ss.android.ugc.gamora.editor.corner.C82092c;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82005a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au */
public final class C70217au extends AbstractC82005a implements AbstractC20382b {

    /* renamed from: j */
    public static final C70218a f157000j = new C70218a((byte) 0);

    /* renamed from: f */
    public VECutVideoPresenter f157001f;

    /* renamed from: g */
    public AbstractC70297bs f157002g;

    /* renamed from: h */
    CutVideoViewModel f157003h;

    /* renamed from: i */
    public CutMultiVideoViewModel f157004i;

    /* renamed from: k */
    private VideoEditViewModel f157005k;

    /* renamed from: l */
    private CutVideoPreviewViewModel f157006l;

    /* renamed from: t */
    private final AbstractC89244h f157007t = C89250i.m154773a((AbstractC89171a) new C70219b(this));

    /* renamed from: u */
    private final AbstractC89244h f157008u = C89250i.m154773a((AbstractC89171a) new C70228j(this));

    /* renamed from: v */
    private final AbstractC89244h f157009v = C89250i.m154773a((AbstractC89171a) new C70220c(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$g */
    static final class C70225g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C70225g f157017a = new C70225g();

        static {
            Covode.recordClassIndex(82668);
        }

        C70225g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$h */
    static final class C70226h implements AbstractC88428a {

        /* renamed from: a */
        public static final C70226h f157018a = new C70226h();

        static {
            Covode.recordClassIndex(82669);
        }

        C70226h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
        }
    }

    static {
        Covode.recordClassIndex(82660);
    }

    /* renamed from: F */
    public final C70306e mo110857F() {
        return (C70306e) this.f157007t.getValue();
    }

    /* renamed from: G */
    public final C70333n mo110858G() {
        return (C70333n) this.f157008u.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$a */
    public static final class C70218a {
        static {
            Covode.recordClassIndex(82661);
        }

        private C70218a() {
        }

        public /* synthetic */ C70218a(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$c */
    static final class C70220c extends AbstractC89220m implements AbstractC89171a<C82092c> {

        /* renamed from: a */
        final /* synthetic */ C70217au f157011a;

        static {
            Covode.recordClassIndex(82663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70220c(C70217au auVar) {
            super(0);
            this.f157011a = auVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82092c invoke() {
            C82092c cVar = new C82092c();
            this.f157011a.mo36387a(R.id.e1a, cVar, "EditCornerScene");
            return cVar;
        }
    }

    /* renamed from: E */
    public final VECutVideoPresenter mo62771E() {
        VECutVideoPresenter vECutVideoPresenter = this.f157001f;
        if (vECutVideoPresenter == null) {
            C89219l.m154710a("presenter");
        }
        return vECutVideoPresenter;
    }

    /* renamed from: H */
    public final AbstractC70527h mo110859H() {
        return mo110858G().mo110956b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$j */
    static final class C70228j extends AbstractC89220m implements AbstractC89171a<C70333n> {

        /* renamed from: a */
        final /* synthetic */ C70217au f157020a;

        static {
            Covode.recordClassIndex(82671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70228j(C70217au auVar) {
            super(0);
            this.f157020a = auVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70333n invoke() {
            C70333n nVar = new C70333n(false, true, 1);
            nVar.mo110954a(this.f157020a.mo62771E());
            this.f157020a.mo36387a(R.id.e1a, nVar, "CutVideoEditScene");
            return nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$b */
    static final class C70219b extends AbstractC89220m implements AbstractC89171a<C70306e> {

        /* renamed from: a */
        final /* synthetic */ C70217au f157010a;

        static {
            Covode.recordClassIndex(82662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70219b(C70217au auVar) {
            super(0);
            this.f157010a = auVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70306e invoke() {
            C70306e eVar = new C70306e();
            eVar.mo110943a(this.f157010a.mo62771E());
            AbstractC70297bs bsVar = this.f157010a.f157002g;
            if (bsVar == null) {
                C89219l.m154710a("previewEditCallback");
            }
            eVar.mo110944a(bsVar);
            this.f157010a.mo36387a(R.id.e1a, eVar, "CutVideoBottomBarScene");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$i */
    static final class RunnableC70227i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70217au f157019a;

        static {
            Covode.recordClassIndex(82670);
        }

        RunnableC70227i(C70217au auVar) {
            this.f157019a = auVar;
        }

        public final void run() {
            Activity t = this.f157019a.mo36486t();
            C89219l.m154716b(t, "");
            View startSlide = this.f157019a.mo110858G().mo110956b().getStartSlide();
            C89219l.m154716b(startSlide, "");
            C80221ao.m139048a(t, startSlide, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$d */
    static final class RunnableC70221d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70217au f157012a;

        static {
            Covode.recordClassIndex(82664);
        }

        RunnableC70221d(C70217au auVar) {
            this.f157012a = auVar;
        }

        public final void run() {
            C70217au auVar = this.f157012a;
            if (C70983b.m125339a() && auVar.mo110859H().getMaxCutDuration() >= 60000) {
                CutVideoViewModel cutVideoViewModel = auVar.f157003h;
                if (cutVideoViewModel == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                String str = cutVideoViewModel.mo110802b().f156844b;
                if (str == null || str.length() <= 0) {
                    CutVideoViewModel cutVideoViewModel2 = auVar.f157003h;
                    if (cutVideoViewModel2 == null) {
                        C89219l.m154710a("cutVideoViewModel");
                    }
                    ArrayList<MediaModel> arrayList = cutVideoViewModel2.mo110802b().f156843a;
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(it.next().f134668h));
                    }
                    if (C89070n.m154600t(arrayList2) > 60000 && C80221ao.m139049a(false)) {
                        auVar.mo110858G().mo110956b().post(new RunnableC70227i(auVar));
                    }
                } else {
                    AbstractC88979t.m154294a(new C70222e(auVar, str)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C70223f(auVar), C70225g.f157017a, C70226h.f157018a);
                }
            }
            C73991bj.m130128a("get edit view duration");
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$e */
    static final class C70222e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C70217au f157013a;

        /* renamed from: b */
        final /* synthetic */ String f157014b;

        static {
            Covode.recordClassIndex(82665);
        }

        C70222e(C70217au auVar, String str) {
            this.f157013a = auVar;
            this.f157014b = str;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<MediaModel> vVar) {
            C89219l.m154721d(vVar, "");
            String str = this.f157014b;
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f157013a.f157004i;
            if (cutMultiVideoViewModel == null) {
                C89219l.m154710a("cutMultiVideoViewModel");
            }
            MediaModel a = C70563d.m124625a(str, cutMultiVideoViewModel);
            if (a != null) {
                vVar.mo143031a(a);
            }
            vVar.mo143023a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.au$f */
    static final class C70223f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C70217au f157015a;

        static {
            Covode.recordClassIndex(82666);
        }

        C70223f(C70217au auVar) {
            this.f157015a = auVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            MediaModel mediaModel = (MediaModel) obj;
            C89219l.m154716b(mediaModel, "");
            if (mediaModel.f134668h > 60000 && C80221ao.m139049a(false)) {
                this.f157015a.mo110858G().mo110956b().post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70217au.C70223f.RunnableC702241 */

                    /* renamed from: a */
                    final /* synthetic */ C70223f f157016a;

                    static {
                        Covode.recordClassIndex(82667);
                    }

                    {
                        this.f157016a = r1;
                    }

                    public final void run() {
                        Activity t = this.f157016a.f157015a.mo36486t();
                        C89219l.m154716b(t, "");
                        View startSlide = this.f157016a.f157015a.mo110858G().mo110956b().getStartSlide();
                        C89219l.m154716b(startSlide, "");
                        C80221ao.m139048a(t, startSlide, false);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f157003h = (CutVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a2, "");
        this.f157005k = (VideoEditViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity3).mo33800a(CutVideoPreviewViewModel.class);
        C89219l.m154716b(a3, "");
        this.f157006l = (CutVideoPreviewViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a4 = C1181ae.m3881a((ActivityC0945e) activity4, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a4, "");
        this.f157004i = (CutMultiVideoViewModel) a4;
        View view = mo110857F().f52550n;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        View view2 = mo110857F().f52550n;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(layoutParams2);
        View view3 = mo110858G().f52550n;
        C89219l.m154716b(view3, "");
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.gravity = 80;
        View view4 = mo110858G().f52550n;
        C89219l.m154716b(view4, "");
        view4.setLayoutParams(layoutParams4);
        mo110858G().f52550n.post(new RunnableC70221d(this));
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.art, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        mo36417e(mo110857F());
        mo36417e(mo110858G());
        mo36417e((C82092c) this.f157009v.getValue());
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
