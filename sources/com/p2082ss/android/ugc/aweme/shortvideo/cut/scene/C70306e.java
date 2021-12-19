package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
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
import com.google.android.material.internal.CheckableImageButton;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70082m;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70094o;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C70563d;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e */
public final class C70306e extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: v */
    public static final C70307a f157157v = new C70307a((byte) 0);

    /* renamed from: a */
    public C70242ba f157158a;

    /* renamed from: b */
    public VECutVideoPresenter f157159b;

    /* renamed from: c */
    public AbstractC70297bs f157160c;

    /* renamed from: d */
    TextView f157161d;

    /* renamed from: e */
    public ImageView f157162e;

    /* renamed from: f */
    public CheckableImageButton f157163f;

    /* renamed from: g */
    public ImageView f157164g;

    /* renamed from: h */
    public CutVideoBottomBarViewModel f157165h;

    /* renamed from: i */
    public CutVideoViewModel f157166i;

    /* renamed from: j */
    VideoEditViewModel f157167j;

    /* renamed from: k */
    public CutVideoListViewModel f157168k;

    /* renamed from: l */
    public CutVideoSpeedViewModel f157169l;

    /* renamed from: t */
    public CutMultiVideoViewModel f157170t;

    /* renamed from: u */
    CutVideoEditViewModel f157171u;

    static {
        Covode.recordClassIndex(82749);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$a */
    public static final class C70307a {
        static {
            Covode.recordClassIndex(82750);
        }

        private C70307a() {
        }

        public /* synthetic */ C70307a(byte b) {
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
    public final AbstractC70297bs mo110942a() {
        AbstractC70297bs bsVar = this.f157160c;
        if (bsVar == null) {
            C89219l.m154710a("previewEditCallback");
        }
        return bsVar;
    }

    /* renamed from: a */
    public final void mo110943a(VECutVideoPresenter vECutVideoPresenter) {
        C89219l.m154721d(vECutVideoPresenter, "");
        this.f157159b = vECutVideoPresenter;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$p */
    public static final class C70323p extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C70306e f157193a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f157194b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f157195c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89235b f157196d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f157197e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89236c f157198f;

        /* renamed from: g */
        final /* synthetic */ View f157199g;

        static {
            Covode.recordClassIndex(82766);
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f157199g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f157199g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f157199g.setEnabled(true);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f157193a.f157170t;
            if (cutMultiVideoViewModel == null) {
                C89219l.m154710a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo110478b();
        }

        C70323p(C70306e eVar, C89233z.C89236c cVar, C89233z.C89235b bVar, C89233z.C89235b bVar2, C89233z.C89236c cVar2, C89233z.C89236c cVar3, View view) {
            this.f157193a = eVar;
            this.f157194b = cVar;
            this.f157195c = bVar;
            this.f157196d = bVar2;
            this.f157197e = cVar2;
            this.f157198f = cVar3;
            this.f157199g = view;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CheckableImageButton m124102a(C70306e eVar) {
        CheckableImageButton checkableImageButton = eVar.f157163f;
        if (checkableImageButton == null) {
            C89219l.m154710a("ivSpeed");
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m124103b(C70306e eVar) {
        ImageView imageView = eVar.f157162e;
        if (imageView == null) {
            C89219l.m154710a("ivRotate");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m124104c(C70306e eVar) {
        ImageView imageView = eVar.f157164g;
        if (imageView == null) {
            C89219l.m154710a("ivDelete");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoListViewModel m124105d(C70306e eVar) {
        CutVideoListViewModel cutVideoListViewModel = eVar.f157168k;
        if (cutVideoListViewModel == null) {
            C89219l.m154710a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoViewModel m124106e(C70306e eVar) {
        CutVideoViewModel cutVideoViewModel = eVar.f157166i;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ CutVideoSpeedViewModel m124107f(C70306e eVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = eVar.f157169l;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$i */
    static final class C70316i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70306e f157180a;

        static {
            Covode.recordClassIndex(82759);
        }

        C70316i(C70306e eVar) {
            this.f157180a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                float floatValue = f.floatValue();
                View view = this.f157180a.f52550n;
                C89219l.m154716b(view, "");
                view.setAlpha(floatValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$j */
    static final class C70317j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70306e f157181a;

        static {
            Covode.recordClassIndex(82760);
        }

        C70317j(C70306e eVar) {
            this.f157181a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View view = this.f157181a.f52550n;
                C89219l.m154716b(view, "");
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$b */
    static final class View$OnClickListenerC70308b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70306e f157172a;

        static {
            Covode.recordClassIndex(82751);
        }

        View$OnClickListenerC70308b(C70306e eVar) {
            this.f157172a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C70306e eVar = this.f157172a;
            C703091 r4 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70306e.View$OnClickListenerC70308b.C703091 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC70308b f157173a;

                static {
                    Covode.recordClassIndex(82752);
                }

                {
                    this.f157173a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C70306e.m124105d(this.f157173a.f157172a).mo33689c(CutVideoListViewModel.C70115b.f156793a);
                    return C89391z.f203057a;
                }
            };
            Activity activity = eVar.f52549m;
            if (activity != null) {
                new C17197a.C17200a(activity).mo27194b(R.string.b5o).mo27195b(R.string.d55, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.b4w, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70324q(r4), false).mo27193a().mo27184b().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$c */
    static final class View$OnClickListenerC70310c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70306e f157174a;

        static {
            Covode.recordClassIndex(82753);
        }

        View$OnClickListenerC70310c(C70306e eVar) {
            this.f157174a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            boolean isChecked = C70306e.m124102a(this.f157174a).isChecked();
            C70306e.m124102a(this.f157174a).toggle();
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f157174a.f157165h;
            if (cutVideoBottomBarViewModel == null) {
                C89219l.m154710a("bottomBarViewModel");
            }
            cutVideoBottomBarViewModel.mo110649b(!isChecked);
            if (C70306e.m124106e(this.f157174a).mo110803g()) {
                C70306e.m124105d(this.f157174a).mo33689c(new CutVideoListViewModel.C70125l(!isChecked));
            } else if (!isChecked) {
                CutVideoSpeedViewModel f = C70306e.m124107f(this.f157174a);
                EnumC78601i a = C70082m.m123739a(this.f157174a.mo110942a().mo110852L().getCurrentSpeed());
                C89219l.m154716b(a, "");
                f.mo110750a(a);
                C70306e.m124107f(this.f157174a).mo110754b(true);
            } else {
                C70306e.m124107f(this.f157174a).mo110754b(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$o */
    static final class C70322o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C70306e f157186a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f157187b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f157188c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89235b f157189d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89236c f157190e;

        /* renamed from: f */
        final /* synthetic */ C89233z.C89236c f157191f;

        /* renamed from: g */
        final /* synthetic */ View f157192g;

        static {
            Covode.recordClassIndex(82765);
        }

        C70322o(C70306e eVar, C89233z.C89236c cVar, C89233z.C89235b bVar, C89233z.C89235b bVar2, C89233z.C89236c cVar2, C89233z.C89236c cVar3, View view) {
            this.f157186a = eVar;
            this.f157187b = cVar;
            this.f157188c = bVar;
            this.f157189d = bVar2;
            this.f157190e = cVar2;
            this.f157191f = cVar3;
            this.f157192g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VECutVideoPresenter vECutVideoPresenter = this.f157186a.f157159b;
            if (vECutVideoPresenter == null) {
                C89219l.m154710a("presenter");
            }
            VECutVideoPresenter.m123653a(vECutVideoPresenter, C70306e.m124105d(this.f157186a).f156789b, (90.0f * animatedFraction) + ((float) this.f157187b.element), false, (this.f157189d.element * animatedFraction) + this.f157188c.element, this.f157188c.element + (this.f157189d.element * animatedFraction), this.f157190e.element, this.f157191f.element, 4);
        }
    }

    /* renamed from: a */
    public final void mo110944a(AbstractC70297bs bsVar) {
        C89219l.m154721d(bsVar, "");
        this.f157160c = bsVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$d */
    static final class View$OnClickListenerC70311d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70306e f157175a;

        static {
            Covode.recordClassIndex(82754);
        }

        View$OnClickListenerC70311d(C70306e eVar) {
            this.f157175a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
            if (r0 == null) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
            if (r0 == null) goto L_0x0138;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
            if (r0 == null) goto L_0x0149;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
            // Method dump skipped, instructions count: 490
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70306e.View$OnClickListenerC70311d.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(CutVideoBottomBarViewModel.class);
        C89219l.m154716b(a, "");
        this.f157165h = (CutVideoBottomBarViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a2, "");
        this.f157166i = (CutVideoViewModel) a2;
        Activity activity3 = this.f52549m;
        Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a3 = C1181ae.m3881a((ActivityC0945e) activity3, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a3, "");
        this.f157167j = (VideoEditViewModel) a3;
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a4 = C20531t.m38716a((ActivityC0945e) activity4).mo33800a(CutVideoListViewModel.class);
        C89219l.m154716b(a4, "");
        this.f157168k = (CutVideoListViewModel) a4;
        Activity activity5 = this.f52549m;
        Objects.requireNonNull(activity5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a5 = C20531t.m38716a((ActivityC0945e) activity5).mo33800a(CutVideoSpeedViewModel.class);
        C89219l.m154716b(a5, "");
        this.f157169l = (CutVideoSpeedViewModel) a5;
        Activity activity6 = this.f52549m;
        Objects.requireNonNull(activity6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a6 = C1181ae.m3881a((ActivityC0945e) activity6, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a6, "");
        this.f157170t = (CutMultiVideoViewModel) a6;
        Activity activity7 = this.f52549m;
        Objects.requireNonNull(activity7, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a7 = C20531t.m38716a((ActivityC0945e) activity7).mo33800a(CutVideoEditViewModel.class);
        C89219l.m154716b(a7, "");
        this.f157171u = (CutVideoEditViewModel) a7;
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.f157165h;
        if (cutVideoBottomBarViewModel == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, C70325f.f157201a, new C20370ah(), new C70318k(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.f157165h;
        if (cutVideoBottomBarViewModel2 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel2, C70329j.f157205a, new C20370ah(), new C70319l(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel3 = this.f157165h;
        if (cutVideoBottomBarViewModel3 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel3, C70330k.f157206a, new C20370ah(), new C70320m(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel4 = this.f157165h;
        if (cutVideoBottomBarViewModel4 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel4, C70331l.f157207a, new C20370ah(), new C70321n(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel5 = this.f157165h;
        if (cutVideoBottomBarViewModel5 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel5, C70332m.f157208a, new C20370ah(), new C70312e(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel6 = this.f157165h;
        if (cutVideoBottomBarViewModel6 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel6, C70326g.f157202a, new C20370ah(), new C70313f(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel7 = this.f157165h;
        if (cutVideoBottomBarViewModel7 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel7, C70327h.f157203a, new C20370ah(), new C70314g(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel8 = this.f157165h;
        if (cutVideoBottomBarViewModel8 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel8, C70328i.f157204a, new C20370ah(), new C70315h(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel9 = this.f157165h;
        if (cutVideoBottomBarViewModel9 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel9.mo110644a().observe(this, new C70316i(this));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel10 = this.f157165h;
        if (cutVideoBottomBarViewModel10 == null) {
            C89219l.m154710a("bottomBarViewModel");
        }
        cutVideoBottomBarViewModel10.mo110647b().observe(this, new C70317j(this));
        CutVideoViewModel cutVideoViewModel = this.f157166i;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            ImageView imageView = this.f157162e;
            if (imageView == null) {
                C89219l.m154710a("ivRotate");
            }
            boolean z = false;
            imageView.setVisibility(0);
            VideoEditViewModel videoEditViewModel = this.f157167j;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            if (videoEditViewModel.mo111235n()) {
                VideoEditViewModel videoEditViewModel2 = this.f157167j;
                if (videoEditViewModel2 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                VideoSegment videoSegment = videoEditViewModel2.mo111232k().get(0);
                CutVideoBottomBarViewModel cutVideoBottomBarViewModel11 = this.f157165h;
                if (cutVideoBottomBarViewModel11 == null) {
                    C89219l.m154710a("bottomBarViewModel");
                }
                CutVideoViewModel cutVideoViewModel2 = this.f157166i;
                if (cutVideoViewModel2 == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                if (cutVideoViewModel2.mo110804h() && C70094o.m123774a(videoSegment)) {
                    z = true;
                }
                cutVideoBottomBarViewModel11.mo110646a(z);
            }
        }
        ImageView imageView2 = this.f157164g;
        if (imageView2 == null) {
            C89219l.m154710a("ivDelete");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC70308b(this));
        CheckableImageButton checkableImageButton = this.f157163f;
        if (checkableImageButton == null) {
            C89219l.m154710a("ivSpeed");
        }
        checkableImageButton.setOnClickListener(new View$OnClickListenerC70310c(this));
        ImageView imageView3 = this.f157162e;
        if (imageView3 == null) {
            C89219l.m154710a("ivRotate");
        }
        imageView3.setOnClickListener(new View$OnClickListenerC70311d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$q */
    static final class DialogInterface$OnClickListenerC70324q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f157200a;

        static {
            Covode.recordClassIndex(82767);
        }

        DialogInterface$OnClickListenerC70324q(AbstractC89171a aVar) {
            this.f157200a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f157200a.invoke();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$e */
    static final class C70312e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157176a;

        static {
            Covode.recordClassIndex(82755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70312e(C70306e eVar) {
            super(2);
            this.f157176a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            ImageView c = C70306e.m124104c(this.f157176a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            c.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$f */
    static final class C70313f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157177a;

        static {
            Covode.recordClassIndex(82756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70313f(C70306e eVar) {
            super(2);
            this.f157177a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70306e.m124102a(this.f157177a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$g */
    static final class C70314g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157178a;

        static {
            Covode.recordClassIndex(82757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70314g(C70306e eVar) {
            super(2);
            this.f157178a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70306e.m124103b(this.f157178a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$h */
    static final class C70315h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157179a;

        static {
            Covode.recordClassIndex(82758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70315h(C70306e eVar) {
            super(2);
            this.f157179a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70306e.m124104c(this.f157179a).setEnabled(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$l */
    static final class C70319l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157183a;

        static {
            Covode.recordClassIndex(82762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70319l(C70306e eVar) {
            super(2);
            this.f157183a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            CheckableImageButton a = C70306e.m124102a(this.f157183a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$m */
    static final class C70320m extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157184a;

        static {
            Covode.recordClassIndex(82763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70320m(C70306e eVar) {
            super(2);
            this.f157184a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            C70306e.m124102a(this.f157184a).setChecked(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$n */
    static final class C70321n extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157185a;

        static {
            Covode.recordClassIndex(82764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70321n(C70306e eVar) {
            super(2);
            this.f157185a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            ImageView b = C70306e.m124103b(this.f157185a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ari, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.e$k */
    static final class C70318k extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70306e f157182a;

        static {
            Covode.recordClassIndex(82761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70318k(C70306e eVar) {
            super(2);
            this.f157182a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(bVar, "");
            C70306e eVar = this.f157182a;
            TextView textView = eVar.f157161d;
            if (textView == null) {
                C89219l.m154710a("tvTime");
            }
            Activity t = eVar.mo36486t();
            C89219l.m154716b(t, "");
            AbstractC70297bs bsVar = eVar.f157160c;
            if (bsVar == null) {
                C89219l.m154710a("previewEditCallback");
            }
            textView.setText(C70563d.m124627a(t, floatValue, bsVar.mo110852L().mo111107d()));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.err);
        C89219l.m154716b(c, "");
        this.f157161d = (TextView) c;
        View c2 = mo36475c(R.id.bs8);
        C89219l.m154716b(c2, "");
        this.f157162e = (ImageView) c2;
        View c3 = mo36475c(R.id.bs_);
        C89219l.m154716b(c3, "");
        this.f157163f = (CheckableImageButton) c3;
        View c4 = mo36475c(R.id.bry);
        C89219l.m154716b(c4, "");
        this.f157164g = (ImageView) c4;
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
