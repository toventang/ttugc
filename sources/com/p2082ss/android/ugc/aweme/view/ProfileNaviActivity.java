package com.p2082ss.android.ugc.aweme.view;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0569a;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
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
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39076ab;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import com.p2082ss.android.ugc.aweme.model.C60140b;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.view.p4230b.C81156c;
import com.p2082ss.android.ugc.aweme.view.p4231c.C81175a;
import com.p2082ss.android.ugc.aweme.view.p4233e.C81226a;
import com.p2082ss.android.ugc.aweme.view.p4234f.C81253a;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89062h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity */
public final class ProfileNaviActivity extends ActivityC0218d implements AbstractC20527q {

    /* renamed from: c */
    public static final C81091a f181237c = new C81091a((byte) 0);

    /* renamed from: a */
    final C89062h<EnumC81092b> f181238a = new C89062h<>();

    /* renamed from: b */
    public final String[] f181239b = {"android.permission.CAMERA"};

    /* renamed from: d */
    private final AbstractC89244h f181240d = C89250i.m154773a((AbstractC89171a) new C81111u(this));

    /* renamed from: e */
    private final AbstractC89244h f181241e = C89250i.m154773a((AbstractC89171a) new C81094d(this));

    /* renamed from: f */
    private final AbstractC89244h f181242f = C89250i.m154773a((AbstractC89171a) new C81095e(this));

    /* renamed from: g */
    private final AbstractC89244h f181243g = C89250i.m154773a((AbstractC89171a) new C81093c(this));

    /* renamed from: h */
    private final AbstractC89244h f181244h = C89250i.m154773a((AbstractC89171a) new C81116z(this));

    /* renamed from: i */
    private final AbstractC89244h f181245i = C89250i.m154773a((AbstractC89171a) new C81114x(this));

    /* renamed from: j */
    private SparseArray f181246j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$b */
    public enum EnumC81092b {
        ONBOARDING,
        EDITOR,
        HUB,
        IMAGE_EDITOR;

        static {
            Covode.recordClassIndex(94420);
        }
    }

    static {
        Covode.recordClassIndex(94418);
    }

    /* renamed from: d */
    private final ProfileNaviOnboardingViewModel m140868d() {
        return (ProfileNaviOnboardingViewModel) this.f181240d.getValue();
    }

    /* renamed from: e */
    private final ProfileNaviHubViewModel m140869e() {
        return (ProfileNaviHubViewModel) this.f181242f.getValue();
    }

    /* renamed from: f */
    private final ProfileNaviCreatorViewModel m140870f() {
        return (ProfileNaviCreatorViewModel) this.f181243g.getValue();
    }

    /* renamed from: g */
    private final ProfileNaviSwitcherViewModel m140871g() {
        return (ProfileNaviSwitcherViewModel) this.f181244h.getValue();
    }

    /* renamed from: a */
    public final View mo124571a(int i) {
        if (this.f181246j == null) {
            this.f181246j = new SparseArray();
        }
        View view = (View) this.f181246j.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f181246j.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ProfileNaviEditorViewModel mo124572a() {
        return (ProfileNaviEditorViewModel) this.f181241e.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$a */
    public static final class C81091a {
        static {
            Covode.recordClassIndex(94419);
        }

        private C81091a() {
        }

        public /* synthetic */ C81091a(byte b) {
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

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        mo124578c();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$c */
    static final class C81093c extends AbstractC89220m implements AbstractC89171a<ProfileNaviCreatorViewModel> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181252a;

        static {
            Covode.recordClassIndex(94421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81093c(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.f181252a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181252a).mo33800a(ProfileNaviCreatorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$d */
    static final class C81094d extends AbstractC89220m implements AbstractC89171a<ProfileNaviEditorViewModel> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181253a;

        static {
            Covode.recordClassIndex(94422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81094d(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.f181253a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviEditorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181253a).mo33800a(ProfileNaviEditorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$e */
    static final class C81095e extends AbstractC89220m implements AbstractC89171a<ProfileNaviHubViewModel> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181254a;

        static {
            Covode.recordClassIndex(94423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81095e(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.f181254a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviHubViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181254a).mo33800a(ProfileNaviHubViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$u */
    static final class C81111u extends AbstractC89220m implements AbstractC89171a<ProfileNaviOnboardingViewModel> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181270a;

        static {
            Covode.recordClassIndex(94439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81111u(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.f181270a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviOnboardingViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181270a).mo33800a(ProfileNaviOnboardingViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$x */
    static final class C81114x extends AbstractC89220m implements AbstractC89171a<ProfileNaviSpinnerViewModel> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181273a;

        static {
            Covode.recordClassIndex(94442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81114x(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.f181273a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviSpinnerViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181273a).mo33800a(ProfileNaviSpinnerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$z */
    static final class C81116z extends AbstractC89220m implements AbstractC89171a<ProfileNaviSwitcherViewModel> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181275a;

        static {
            Covode.recordClassIndex(94444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81116z(ProfileNaviActivity profileNaviActivity) {
            super(0);
            this.f181275a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviSwitcherViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181275a).mo33800a(ProfileNaviSwitcherViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: c */
    public final void mo124578c() {
        m140868d().mo124891a();
        mo124572a().mo124837a();
        m140870f().mo124795a();
        m140871g().mo124924a();
        m140869e().mo124873a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$y */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC81115y implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181274a;

        static {
            Covode.recordClassIndex(94443);
        }

        public final void onGlobalLayout() {
            ProfileNaviActivity profileNaviActivity = this.f181274a;
            if (Build.VERSION.SDK_INT >= 21) {
                FrameLayout frameLayout = (FrameLayout) profileNaviActivity.mo124571a(R.id.d8a);
                C89219l.m154716b(frameLayout, "");
                int width = frameLayout.getWidth();
                FrameLayout frameLayout2 = (FrameLayout) profileNaviActivity.mo124571a(R.id.d8a);
                C89219l.m154716b(frameLayout2, "");
                double max = (double) Math.max(width, frameLayout2.getHeight());
                Double.isNaN(max);
                float f = (float) (max * 1.1d);
                FrameLayout frameLayout3 = (FrameLayout) profileNaviActivity.mo124571a(R.id.d8a);
                C89219l.m154716b(frameLayout3, "");
                int width2 = frameLayout3.getWidth() / 2;
                FrameLayout frameLayout4 = (FrameLayout) profileNaviActivity.mo124571a(R.id.d8a);
                C89219l.m154716b(frameLayout4, "");
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(profileNaviActivity.mo124571a(R.id.d8a), width2, (frameLayout4.getHeight() / 3) * 2, 0.0f, f);
                C89219l.m154716b(createCircularReveal, "");
                createCircularReveal.setDuration(400);
                createCircularReveal.setInterpolator(new AccelerateInterpolator());
                FrameLayout frameLayout5 = (FrameLayout) profileNaviActivity.mo124571a(R.id.d8a);
                C89219l.m154716b(frameLayout5, "");
                frameLayout5.setVisibility(0);
                createCircularReveal.start();
            } else {
                FrameLayout frameLayout6 = (FrameLayout) profileNaviActivity.mo124571a(R.id.d8a);
                C89219l.m154716b(frameLayout6, "");
                frameLayout6.setVisibility(0);
            }
            FrameLayout frameLayout7 = (FrameLayout) this.f181274a.mo124571a(R.id.d8a);
            C89219l.m154716b(frameLayout7, "");
            frameLayout7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC81115y(ProfileNaviActivity profileNaviActivity) {
            this.f181274a = profileNaviActivity;
        }
    }

    /* renamed from: b */
    public final void mo124577b() {
        mo124572a();
        if (!C39076ab.f92277c || C0569a.m2367a((Context) this, "android.permission.CAMERA") == 0 || Build.VERSION.SDK_INT < 23) {
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            mo124574a(new C81156c(supportFragmentManager));
            return;
        }
        C17197a.C17200a b = new C17197a.C17200a(this).mo27189a(R.string.zu).mo27194b(R.string.zt);
        b.f41067M = true;
        C17197a a = b.mo27190a(R.string.zw, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81112v(this), false).mo27195b(R.string.zx, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81113w(this), false).mo27193a();
        C39162r.m79460a("show_avatar_camera_access", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
        a.mo27185c();
    }

    /* renamed from: b */
    private final void m140867b(Fragment fragment) {
        if (fragment instanceof C81226a) {
            this.f181238a.mo143482a(EnumC81092b.ONBOARDING);
        } else if (fragment instanceof C81156c) {
            this.f181238a.mo143482a(EnumC81092b.EDITOR);
        } else if (fragment instanceof C81253a) {
            this.f181238a.mo143482a(EnumC81092b.IMAGE_EDITOR);
        } else if (fragment instanceof C81175a) {
            this.f181238a.mo143482a(EnumC81092b.HUB);
        }
    }

    /* renamed from: b */
    private final void m140866b(Bundle bundle) {
        if (bundle != null || Build.VERSION.SDK_INT < 21) {
            FrameLayout frameLayout = (FrameLayout) mo124571a(R.id.d8a);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) mo124571a(R.id.d8a);
        C89219l.m154716b(frameLayout2, "");
        frameLayout2.setVisibility(4);
        FrameLayout frameLayout3 = (FrameLayout) mo124571a(R.id.d8a);
        C89219l.m154716b(frameLayout3, "");
        ViewTreeObserver viewTreeObserver = frameLayout3.getViewTreeObserver();
        C89219l.m154716b(viewTreeObserver, "");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC81115y(this));
        }
    }

    /* renamed from: a */
    public final void mo124573a(Bundle bundle) {
        mo124576a(false);
        m140866b(bundle);
        String a = m140864a(getIntent(), "edit_navi_id_key");
        if (C80537hk.m139613a(a)) {
            ProfileNaviOnboardingViewModel d = m140868d();
            if (a == null) {
                C89219l.m154715b();
            }
            d.mo124894a(a, 0);
            return;
        }
        String a2 = m140864a(getIntent(), "set_profile_photo_navi_id_key");
        if (C80537hk.m139613a(a2)) {
            mo124572a();
            if (C60159r.f137142e != null) {
                ProfileNaviCreatorViewModel f = m140870f();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                f.mo124798a(a2, 0);
                return;
            }
            mo124576a(true);
            return;
        }
        C81226a aVar = new C81226a();
        if (getIntent().getIntExtra("entry_point", 0) == 1) {
            m140869e().mo124876a(true);
        } else {
            mo124574a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo124574a(Fragment fragment) {
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        a.mo3470b(R.id.d8a, fragment, "navi_fragment");
        m140867b(fragment);
        a.mo3467b();
    }

    /* renamed from: a */
    public final void mo124575a(String str) {
        String a = m140864a(getIntent(), "set_profile_photo_navi_id_key");
        C81253a a2 = C81253a.C81254a.m141011a(str);
        if (C80537hk.m139613a(a)) {
            a2 = C81253a.C81254a.m141011a("set_profile_photo");
        }
        mo124574a(a2);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", true);
        super.onCreate(bundle);
        String a = m140864a(getIntent(), "enter_from");
        if (a != null) {
            C89219l.m154721d(a, "");
            C34891a.f82340a = a;
        }
        setContentView(R.layout.aol);
        mo124572a().mo124838a((Context) this);
        m140870f();
        C60140b.f137081a.clear();
        mo124573a(bundle);
        AbstractC88412b unused = selectSubscribe(m140868d(), C81283h.f181607a, new C20370ah(), new C81101k(this));
        AbstractC88412b unused2 = selectSubscribe(mo124572a(), C81294s.f181618a, new C20370ah(), new C81108r(this));
        AbstractC88412b unused3 = selectSubscribe(mo124572a(), C81295t.f181619a, new C20370ah(), new C81109s(this));
        AbstractC88412b unused4 = selectSubscribe(mo124572a(), C81296u.f181620a, new C20370ah(), new C81110t(this));
        AbstractC88412b unused5 = selectSubscribe(m140869e(), C81297v.f181621a, new C20370ah(), new C81096f(this));
        AbstractC88412b unused6 = selectSubscribe(m140869e(), C81284i.f181608a, new C20370ah(), new C81097g(this));
        AbstractC88412b unused7 = selectSubscribe(m140869e(), C81285j.f181609a, new C20370ah(), new C81098h(this));
        AbstractC88412b unused8 = selectSubscribe(m140870f(), C81286k.f181610a, new C20370ah(), new C81099i(this));
        AbstractC88412b unused9 = selectSubscribe(m140870f(), C81287l.f181611a, new C20370ah(), new C81100j(this));
        AbstractC88412b unused10 = selectSubscribe(m140869e(), C81288m.f181612a, new C20370ah(), new C81102l(this));
        AbstractC88412b unused11 = selectSubscribe(m140869e(), C81289n.f181613a, new C20370ah(), new C81103m(this));
        AbstractC88412b unused12 = selectSubscribe(m140870f(), C81290o.f181614a, new C20370ah(), new C81104n(this));
        AbstractC88412b unused13 = selectSubscribe(m140871g(), C81291p.f181615a, new C20370ah(), new C81105o(this));
        AbstractC88412b unused14 = selectSubscribe(m140869e(), C81292q.f181616a, new C20370ah(), new C81106p(this));
        AbstractC88412b unused15 = selectSubscribe((ProfileNaviSpinnerViewModel) this.f181245i.getValue(), C81293r.f181617a, new C20370ah(), new C81107q(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.view.ProfileNaviActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo124576a(boolean z) {
        if (z) {
            CardView cardView = (CardView) mo124571a(R.id.d90);
            C89219l.m154716b(cardView, "");
            cardView.setVisibility(0);
            ((TuxDualBallView) mo124571a(R.id.d8z)).mo37884b();
            return;
        }
        ((TuxDualBallView) mo124571a(R.id.d8z)).mo37885c();
        CardView cardView2 = (CardView) mo124571a(R.id.d90);
        C89219l.m154716b(cardView2, "");
        cardView2.setVisibility(4);
    }

    /* renamed from: a */
    private static String m140864a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$f */
    static final class C81096f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181255a;

        static {
            Covode.recordClassIndex(94424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81096f(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181255a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181255a.mo124575a("set_profile_photo");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$g */
    static final class C81097g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181256a;

        static {
            Covode.recordClassIndex(94425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81097g(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181256a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181256a.mo124574a(new C81226a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$h */
    static final class C81098h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181257a;

        static {
            Covode.recordClassIndex(94426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81098h(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181257a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181257a.mo124574a(new C81175a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$i */
    static final class C81099i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181258a;

        static {
            Covode.recordClassIndex(94427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81099i(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181258a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181258a.mo124578c();
                this.f181258a.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$k */
    static final class C81101k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C60107b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181260a;

        static {
            Covode.recordClassIndex(94429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81101k(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181260a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C60107b bVar) {
            C60107b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            if (bVar2 != null) {
                this.f181260a.mo124572a();
                C89219l.m154721d(bVar2, "");
                C60159r.m109649a(bVar2);
                this.f181260a.mo124577b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$l */
    static final class C81102l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181261a;

        static {
            Covode.recordClassIndex(94430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81102l(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181261a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181261a.mo124577b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$m */
    static final class C81103m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181262a;

        static {
            Covode.recordClassIndex(94431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81103m(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181262a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181262a.mo124578c();
                this.f181262a.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$n */
    static final class C81104n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181263a;

        static {
            Covode.recordClassIndex(94432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81104n(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181263a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181263a.mo124575a((ProfileNaviActivity) "avatar_hub");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$o */
    static final class C81105o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181264a;

        static {
            Covode.recordClassIndex(94433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81105o(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181264a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181264a.mo124578c();
                this.f181264a.mo124574a(new C81226a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$p */
    static final class C81106p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181265a;

        static {
            Covode.recordClassIndex(94434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81106p(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181265a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181265a.mo124578c();
                this.f181265a.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$q */
    static final class C81107q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181266a;

        static {
            Covode.recordClassIndex(94435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81107q(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181266a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            this.f181266a.mo124576a(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$r */
    static final class C81108r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181267a;

        static {
            Covode.recordClassIndex(94436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81108r(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181267a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181267a.mo124574a(new C81175a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$s */
    static final class C81109s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends AbstractC60162u>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181268a;

        static {
            Covode.recordClassIndex(94437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81109s(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181268a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends AbstractC60162u> list) {
            C89219l.m154721d(iVar, "");
            if (list != null && this.f181268a.getSupportFragmentManager().mo3551a("navi_fragment") == null) {
                this.f181268a.mo124573a((Bundle) null);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$t */
    static final class C81110t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181269a;

        static {
            Covode.recordClassIndex(94438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81110t(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181269a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181269a.mo124578c();
                this.f181269a.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$w */
    public static final class DialogInterface$OnClickListenerC81113w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181272a;

        static {
            Covode.recordClassIndex(94441);
        }

        DialogInterface$OnClickListenerC81113w(ProfileNaviActivity profileNaviActivity) {
            this.f181272a = profileNaviActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("deny_avatar_camera", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            ProfileNaviActivity profileNaviActivity = this.f181272a;
            AbstractC0952i supportFragmentManager = this.f181272a.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            profileNaviActivity.mo124574a(new C81156c(supportFragmentManager));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$j */
    static final class C81100j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181259a;

        static {
            Covode.recordClassIndex(94428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81100j(ProfileNaviActivity profileNaviActivity) {
            super(2);
            this.f181259a = profileNaviActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                ProfileNaviActivity profileNaviActivity = this.f181259a;
                if (!profileNaviActivity.f181238a.isEmpty()) {
                    profileNaviActivity.f181238a.mo143487b();
                }
                if (profileNaviActivity.f181238a.isEmpty()) {
                    profileNaviActivity.mo124578c();
                    profileNaviActivity.finish();
                } else {
                    int i = C81282g.f181606a[profileNaviActivity.f181238a.mo143487b().ordinal()];
                    if (i == 1) {
                        profileNaviActivity.mo124578c();
                        profileNaviActivity.mo124574a(new C81226a());
                    } else if (i == 2) {
                        profileNaviActivity.mo124577b();
                    } else if (i == 3) {
                        profileNaviActivity.mo124575a((ProfileNaviActivity) "avatar_hub");
                    } else if (i == 4) {
                        profileNaviActivity.mo124574a(new C81175a());
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.ProfileNaviActivity$v */
    public static final class DialogInterface$OnClickListenerC81112v implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviActivity f181271a;

        static {
            Covode.recordClassIndex(94440);
        }

        DialogInterface$OnClickListenerC81112v(ProfileNaviActivity profileNaviActivity) {
            this.f181271a = profileNaviActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("allow_avatar_camera", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            ProfileNaviActivity profileNaviActivity = this.f181271a;
            String[] strArr = profileNaviActivity.f181239b;
            if (!((Boolean) C15346a.m28238a(profileNaviActivity, new Object[]{strArr, 12345}, 102600, "void", false, null).first).booleanValue()) {
                C15346a.m28240a(null, profileNaviActivity, new Object[]{strArr, 12345}, 102600, "com_ss_android_ugc_aweme_view_ProfileNaviActivity$showEditorFragment$tuxDialogBuilder$1_com_ss_android_ugc_aweme_view_ProfileNaviActivity_requestPermissions(Lcom/ss/android/ugc/aweme/view/ProfileNaviActivity;[Ljava/lang/String;I)V");
                profileNaviActivity.requestPermissions(strArr, 12345);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        mo124574a(new C81156c(supportFragmentManager));
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
