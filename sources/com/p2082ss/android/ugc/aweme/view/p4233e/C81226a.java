package com.p2082ss.android.ugc.aweme.view.p4233e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39082ag;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.C60161t;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81135g;
import com.p2082ss.android.ugc.aweme.viewModel.C81391a;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Date;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.view.e.a */
public final class C81226a extends Fragment implements AbstractC20527q, C81135g.AbstractC81137b {

    /* renamed from: b */
    public static final C81227a f181519b = new C81227a((byte) 0);

    /* renamed from: a */
    public boolean f181520a;

    /* renamed from: c */
    private final AbstractC89244h f181521c = C89250i.m154773a((AbstractC89171a) new C81228b(this));

    /* renamed from: d */
    private final AbstractC89244h f181522d = C89250i.m154773a((AbstractC89171a) new C81229c(this));

    /* renamed from: e */
    private final AbstractC89244h f181523e = C89250i.m154773a((AbstractC89171a) new C81238l(this));

    /* renamed from: f */
    private SparseArray f181524f;

    static {
        Covode.recordClassIndex(94556);
    }

    /* renamed from: c */
    private float m140986c() {
        return ((Number) this.f181522d.getValue()).floatValue();
    }

    /* renamed from: d */
    private final ProfileNaviOnboardingViewModel m140987d() {
        return (ProfileNaviOnboardingViewModel) this.f181523e.getValue();
    }

    /* renamed from: a */
    public final float mo124707a() {
        return ((Number) this.f181521c.getValue()).floatValue();
    }

    /* renamed from: a */
    public final View mo124708a(int i) {
        if (this.f181524f == null) {
            this.f181524f = new SparseArray();
        }
        View view = (View) this.f181524f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181524f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$a */
    public static final class C81227a {
        static {
            Covode.recordClassIndex(94557);
        }

        private C81227a() {
        }

        public /* synthetic */ C81227a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<C60161t> mo124712b() {
        return ((ProfileNaviOnboardingState) m140987d().mo33676a(this)).getStarterAvatarList();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f181524f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$b */
    static final class C81228b extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C81226a f181525a;

        static {
            Covode.recordClassIndex(94558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81228b(C81226a aVar) {
            super(0);
            this.f181525a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            Resources resources;
            ActivityC0945e activity = this.f181525a.getActivity();
            if (activity != null) {
                resources = activity.getResources();
            } else {
                resources = null;
            }
            return Float.valueOf(C39082ag.C39083a.m79346a(100.0f, resources));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$c */
    static final class C81229c extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C81226a f181526a;

        static {
            Covode.recordClassIndex(94559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81229c(C81226a aVar) {
            super(0);
            this.f181526a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            Resources resources;
            ActivityC0945e activity = this.f181526a.getActivity();
            if (activity != null) {
                resources = activity.getResources();
            } else {
                resources = null;
            }
            return Float.valueOf(C39082ag.C39083a.m79346a(44.0f, resources));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$l */
    static final class C81238l extends AbstractC89220m implements AbstractC89171a<ProfileNaviOnboardingViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81226a f181536a;

        static {
            Covode.recordClassIndex(94568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81238l(C81226a aVar) {
            super(0);
            this.f181536a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviOnboardingViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181536a.requireActivity()).mo33800a(ProfileNaviOnboardingViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SharedPreferences preferences;
        super.onStart();
        TuxIconView tuxIconView = (TuxIconView) mo124708a(R.id.cqx);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new View$OnClickListenerC81235i(this));
        }
        C20766v a = C20761r.m39057a(Uri.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_starter_display_image.png"));
        SmartImageView smartImageView = (SmartImageView) mo124708a(R.id.cr2);
        C89219l.m154716b(smartImageView, "");
        a.f49105b = smartImageView.getContext();
        a.f49092E = (SmartImageView) mo124708a(R.id.cr2);
        a.mo34186c();
        AbstractC88412b unused = selectSubscribe(m140987d(), C81240c.f181538a, new C20370ah(), new C81233g(this));
        AbstractC88412b unused2 = selectSubscribe(m140987d(), C81241d.f181539a, new C20370ah(), new C81234h(this));
        if (mo124712b() == null) {
            ProfileNaviOnboardingViewModel d = m140987d();
            ActivityC0945e activity = getActivity();
            if (activity != null && (preferences = activity.getPreferences(0)) != null) {
                C89219l.m154721d(preferences, "");
                d.f181740c = preferences;
                if (!preferences.getBoolean(ProfileNaviOnboardingViewModel.f181736d, false)) {
                    d.mo33689c(ProfileNaviOnboardingViewModel.C81374g.f181755a);
                    d.f181739b.removeCallbacksAndMessages(null);
                    d.f181739b.postDelayed(new ProfileNaviOnboardingViewModel.RunnableC81375h(d), d.f181738a);
                    return;
                }
                d.mo124895b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$d */
    public static final class C81230d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C81226a f181527a;

        static {
            Covode.recordClassIndex(94560);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81230d(C81226a aVar) {
            this.f181527a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            RecyclerView recyclerView = (RecyclerView) this.f181527a.mo124708a(R.id.cqy);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$f */
    public static final class C81232f extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C81226a f181530a;

        static {
            Covode.recordClassIndex(94562);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81232f(C81226a aVar) {
            this.f181530a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            float a;
            TuxTextView tuxTextView;
            TuxTextView tuxTextView2;
            C89219l.m154721d(recyclerView, "");
            C81226a aVar = this.f181530a;
            float computeVerticalScrollOffset = (float) recyclerView.computeVerticalScrollOffset();
            if (computeVerticalScrollOffset >= aVar.mo124707a()) {
                a = 0.0f;
            } else {
                a = (aVar.mo124707a() - computeVerticalScrollOffset) / aVar.mo124707a();
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) aVar.mo124708a(R.id.cr1);
            if (constraintLayout != null) {
                constraintLayout.setScaleX(a);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) aVar.mo124708a(R.id.cr1);
            if (constraintLayout2 != null) {
                constraintLayout2.setScaleY(a);
            }
            if (a == 0.0f && (tuxTextView2 = (TuxTextView) aVar.mo124708a(R.id.d9b)) != null && tuxTextView2.getVisibility() == 8) {
                aVar.mo124711a(true);
            } else if (a > 0.0f && (tuxTextView = (TuxTextView) aVar.mo124708a(R.id.d9b)) != null && tuxTextView.getVisibility() == 0) {
                aVar.mo124711a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$j */
    public static final class C81236j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C81226a f181534a;

        static {
            Covode.recordClassIndex(94566);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81236j(C81226a aVar) {
            this.f181534a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            TuxTextView tuxTextView = (TuxTextView) this.f181534a.mo124708a(R.id.d9b);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$k */
    public static final class C81237k implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C81226a f181535a;

        static {
            Covode.recordClassIndex(94567);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81237k(C81226a aVar) {
            this.f181535a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            TuxTextView tuxTextView = (TuxTextView) this.f181535a.mo124708a(R.id.d9b);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$e */
    public static final class C81231e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TextView f181528a;

        /* renamed from: b */
        final /* synthetic */ String f181529b;

        static {
            Covode.recordClassIndex(94561);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 50.0f, 0.0f);
            C89219l.m154716b(ofFloat, "");
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f);
            C89219l.m154716b(ofFloat2, "");
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f181528a, ofFloat, ofFloat2);
            C89219l.m154716b(ofPropertyValuesHolder, "");
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(200L);
            TextView textView = this.f181528a;
            if (textView != null) {
                textView.setText(this.f181529b);
            }
            ofPropertyValuesHolder.start();
        }

        C81231e(TextView textView, String str) {
            this.f181528a = textView;
            this.f181529b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$i */
    static final class View$OnClickListenerC81235i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81226a f181533a;

        static {
            Covode.recordClassIndex(94565);
        }

        View$OnClickListenerC81235i(C81226a aVar) {
            this.f181533a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f181533a.f181520a) {
                C39162r.m79460a("exit_avatar_welcome_intro", new C33744d().mo59983a("enter_from", C34891a.f82340a).mo59983a("enter_method", "click").f79943a);
            } else {
                C39162r.m79460a("exit_avatar_edit_page", new C33744d().mo59983a("enter_from", C34891a.f82340a).f79943a);
            }
            ActivityC0945e activity = this.f181533a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81135g.AbstractC81137b
    /* renamed from: a */
    public final void mo124596a(C60161t tVar) {
        C89219l.m154721d(tVar, "");
        String valueOf = String.valueOf(tVar.mo97835a());
        C39162r.m79460a("choose_starter_avatar", new C33744d().mo59983a("item_id", valueOf).mo59983a("start_time", String.valueOf(new Date().getTime())).mo59983a("enter_from", C34891a.f82340a).f79943a);
        m140987d().mo124893a(tVar, 0);
    }

    /* renamed from: a */
    public final void mo124710a(List<C60161t> list) {
        int i;
        RecyclerView recyclerView = (RecyclerView) mo124708a(R.id.cqy);
        C89219l.m154716b(recyclerView, "");
        if (recyclerView.getAdapter() == null) {
            C81135g gVar = new C81135g(list, this);
            RecyclerView recyclerView2 = (RecyclerView) mo124708a(R.id.cqy);
            if (recyclerView2 != null) {
                getActivity();
                recyclerView2.setLayoutManager(new GridLayoutManager(2));
            }
            RecyclerView recyclerView3 = (RecyclerView) mo124708a(R.id.cqy);
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(gVar);
            }
            RecyclerView recyclerView4 = (RecyclerView) mo124708a(R.id.cqy);
            if (recyclerView4 != null) {
                recyclerView4.mo4405a(new C81232f(this));
            }
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                Resources resources = activity.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                } else {
                    i = 0;
                }
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, (float) i, 0.0f);
                C89219l.m154716b(ofFloat, "");
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(mo124708a(R.id.cqy), ofFloat);
                C89219l.m154716b(ofPropertyValuesHolder, "");
                ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                ofPropertyValuesHolder.setDuration(1000L);
                ofPropertyValuesHolder.addListener(new C81230d(this));
                ofPropertyValuesHolder.start();
                return;
            }
            return;
        }
        RecyclerView recyclerView5 = (RecyclerView) mo124708a(R.id.cqy);
        C89219l.m154716b(recyclerView5, "");
        if (recyclerView5.getAdapter() instanceof C81135g) {
            RecyclerView recyclerView6 = (RecyclerView) mo124708a(R.id.cqy);
            C89219l.m154716b(recyclerView6, "");
            RecyclerView.AbstractC1350a adapter = recyclerView6.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.adapter.ProfileNaviStarterAvatarListAdapter");
            ((C81135g) adapter).f181320a = list;
            RecyclerView recyclerView7 = (RecyclerView) mo124708a(R.id.cqy);
            C89219l.m154716b(recyclerView7, "");
            RecyclerView.AbstractC1350a adapter2 = recyclerView7.getAdapter();
            Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.adapter.ProfileNaviStarterAvatarListAdapter");
            adapter2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo124711a(boolean z) {
        if (z) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f - m140986c(), 0.0f);
            C89219l.m154716b(ofFloat, "");
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(mo124708a(R.id.d9b), ofFloat);
            C89219l.m154716b(ofPropertyValuesHolder, "");
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.addListener(new C81236j(this));
            ofPropertyValuesHolder.start();
            return;
        }
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0.0f, 0.0f - m140986c());
        C89219l.m154716b(ofFloat2, "");
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(mo124708a(R.id.d9b), ofFloat2);
        C89219l.m154716b(ofPropertyValuesHolder2, "");
        ofPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        ofPropertyValuesHolder2.setDuration(200L);
        ofPropertyValuesHolder2.addListener(new C81237k(this));
        ofPropertyValuesHolder2.start();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$h */
    static final class C81234h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C60161t>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81226a f181532a;

        static {
            Covode.recordClassIndex(94564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81234h(C81226a aVar) {
            super(2);
            this.f181532a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.ugc.aweme.view.e.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C60161t> list) {
            List<? extends C60161t> list2 = list;
            C89219l.m154721d(iVar, "");
            if (list2 != null) {
                this.f181532a.mo124710a((List<C60161t>) list2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo124709a(String str, String str2) {
        m140985a((TextView) mo124708a(R.id.cqz), str);
        m140985a((TextView) mo124708a(R.id.cr0), str2);
    }

    /* renamed from: a */
    private static void m140985a(TextView textView, String str) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -50.0f);
        C89219l.m154716b(ofFloat, "");
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f);
        C89219l.m154716b(ofFloat2, "");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(textView, ofFloat, ofFloat2);
        C89219l.m154716b(ofPropertyValuesHolder, "");
        ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        ofPropertyValuesHolder.setDuration(300L);
        ofPropertyValuesHolder.addListener(new C81231e(textView, str));
        ofPropertyValuesHolder.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e.a$g */
    static final class C81233g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C81391a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81226a f181531a;

        static {
            Covode.recordClassIndex(94563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81233g(C81226a aVar) {
            super(2);
            this.f181531a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C81391a aVar) {
            String str;
            String str2;
            String str3;
            C81391a aVar2 = aVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(aVar2, "");
            int i = C81239b.f181537a[aVar2.f181778a.ordinal()];
            String str4 = null;
            if (i == 1) {
                C39162r.m79460a("show_avatar_welcome_intro", new C33744d().mo59983a("enter_from", C34891a.f82340a).mo59983a("enter_method", "click").f79943a);
                this.f181531a.f181520a = true;
                C81226a aVar3 = this.f181531a;
                Context context = aVar3.getContext();
                if (context != null) {
                    str = context.getString(R.string.a04);
                } else {
                    str = null;
                }
                Context context2 = this.f181531a.getContext();
                if (context2 != null) {
                    str4 = context2.getString(R.string.a0x);
                }
                aVar3.mo124709a(str, str4);
            } else if (i == 2) {
                C81226a aVar4 = this.f181531a;
                Context context3 = aVar4.getContext();
                if (context3 != null) {
                    str2 = context3.getString(R.string.a0_);
                } else {
                    str2 = null;
                }
                Context context4 = this.f181531a.getContext();
                if (context4 != null) {
                    str4 = context4.getString(R.string.zv);
                }
                aVar4.mo124709a(str2, str4);
            } else if (i == 3) {
                C81226a aVar5 = this.f181531a;
                Context context5 = aVar5.getContext();
                if (context5 != null) {
                    str3 = context5.getString(R.string.a04);
                } else {
                    str3 = null;
                }
                Context context6 = aVar5.getContext();
                if (context6 != null) {
                    str4 = context6.getString(R.string.zy);
                }
                aVar5.mo124709a(str3, str4);
                aVar5.mo124710a(aVar5.mo124712b());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C39162r.m79460a("show_avatar_edit_page", new C33744d().mo59983a("enter_from", C34891a.f82340a).f79943a);
        return C1764a.m5927a(layoutInflater, R.layout.aox, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
