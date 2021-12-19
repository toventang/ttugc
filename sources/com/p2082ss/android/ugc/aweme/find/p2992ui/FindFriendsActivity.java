package com.p2082ss.android.ugc.aweme.find.p2992ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20371ai;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.find.p2990a.C50939a;
import com.p2082ss.android.ugc.aweme.find.p2991b.C50942a;
import com.p2082ss.android.ugc.aweme.find.p2992ui.FriendsSearchResultView;
import com.p2082ss.android.ugc.aweme.find.viewmodel.C51034a;
import com.p2082ss.android.ugc.aweme.find.viewmodel.C51039e;
import com.p2082ss.android.ugc.aweme.find.viewmodel.C51041f;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteFriendsActivity;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteUserListActivity;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qrcode.C66416k;
import com.p2082ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p2082ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80547hs;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
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
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity */
public final class FindFriendsActivity extends ActivityC17312a implements AbstractC2597b, AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: a */
    public final C34499i f117570a = new C34499i();

    /* renamed from: b */
    public final C50939a f117571b;

    /* renamed from: c */
    public final SearchKeywordPresenter f117572c;

    /* renamed from: d */
    public C50942a f117573d;

    /* renamed from: e */
    private final lifecycleAwareLazy f117574e;

    /* renamed from: f */
    private final C88411a f117575f;

    /* renamed from: g */
    private final AbstractC89244h f117576g;

    /* renamed from: h */
    private final AbstractC89244h f117577h;

    /* renamed from: i */
    private final AbstractC89244h f117578i;

    /* renamed from: j */
    private SparseArray f117579j;

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$a */
    public static final class C50951a extends AbstractC89220m implements AbstractC89183m<FindFriendsState, Bundle, FindFriendsState> {
        public static final C50951a INSTANCE = new C50951a();

        static {
            Covode.recordClassIndex(60128);
        }

        public C50951a() {
            super(2);
        }

        public final FindFriendsState invoke(FindFriendsState findFriendsState, Bundle bundle) {
            C89219l.m154719c(findFriendsState, "");
            return findFriendsState;
        }
    }

    static {
        Covode.recordClassIndex(60127);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f117579j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f117579j == null) {
            this.f117579j = new SparseArray();
        }
        View view = (View) this.f117579j.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117579j.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "2793";
    }

    /* renamed from: e */
    public final FindFriendsViewModel mo86306e() {
        return (FindFriendsViewModel) this.f117574e.getValue();
    }

    /* renamed from: f */
    public final WrapLinearLayoutManager mo86307f() {
        return (WrapLinearLayoutManager) this.f117576g.getValue();
    }

    /* renamed from: g */
    public final C50981x.C509821 mo86308g() {
        return (C50981x.C509821) this.f117578i.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f117570a;
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

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$c */
    static final class RunnableC50954c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117585a;

        static {
            Covode.recordClassIndex(60131);
        }

        RunnableC50954c(FindFriendsActivity findFriendsActivity) {
            this.f117585a = findFriendsActivity;
        }

        public final void run() {
            this.f117585a.f117571b.f117550b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$u */
    static final class C50976u extends AbstractC89220m implements AbstractC89171a<WrapLinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117611a;

        static {
            Covode.recordClassIndex(60153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50976u(FindFriendsActivity findFriendsActivity) {
            super(0);
            this.f117611a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WrapLinearLayoutManager invoke() {
            return new WrapLinearLayoutManager();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$x */
    static final class C50981x extends AbstractC89220m implements AbstractC89171a<C509821> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117616a;

        static {
            Covode.recordClassIndex(60158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50981x(FindFriendsActivity findFriendsActivity) {
            super(0);
            this.f117616a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C509821 invoke() {
            return new FriendsSearchResultView.AbstractC50983a(this) {
                /* class com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity.C50981x.C509821 */

                /* renamed from: a */
                final /* synthetic */ C50981x f117617a;

                static {
                    Covode.recordClassIndex(60159);
                }

                @Override // com.p2082ss.android.ugc.aweme.find.p2992ui.FriendsSearchResultView.AbstractC50983a
                /* renamed from: a */
                public final void mo86317a() {
                    DmtEditText dmtEditText = (DmtEditText) this.f117617a.f117616a._$_findCachedViewById(R.id.ax4);
                    C89219l.m154716b(dmtEditText, "");
                    if (dmtEditText.isCursorVisible()) {
                        DmtEditText dmtEditText2 = (DmtEditText) this.f117617a.f117616a._$_findCachedViewById(R.id.ax4);
                        C89219l.m154716b(dmtEditText2, "");
                        dmtEditText2.setCursorVisible(false);
                        C39115e.m79412a(this.f117617a.f117616a, this.f117617a.f117616a._$_findCachedViewById(R.id.ax4));
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f117617a = r1;
                }
            };
        }
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        C89219l.m154721d(this, "");
        return null;
    }

    /* renamed from: h */
    private static boolean m95371h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        C89219l.m154721d(this, "");
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        withState(mo86306e(), new C50957f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$w */
    static final class C50980w implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117615a;

        static {
            Covode.recordClassIndex(60157);
        }

        C50980w(FindFriendsActivity findFriendsActivity) {
            this.f117615a = findFriendsActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            this.f117615a.f117571b.ao_();
            this.f117615a.mo86306e().mo86372a(-2);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f117575f.mo142944a();
        C50942a aVar = this.f117573d;
        if (aVar != null) {
            aVar.mo86296c();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onResume", true);
        super.onResume();
        mo86306e().mo86371a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$h */
    public static final class C50959h implements C50942a.AbstractC50944b {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117592a;

        static {
            Covode.recordClassIndex(60136);
        }

        @Override // com.p2082ss.android.ugc.aweme.find.p2991b.C50942a.AbstractC50944b
        /* renamed from: b */
        public final void mo86298b() {
            if (!this.f117592a.isDestroyed()) {
                TuxTextView tuxTextView = (TuxTextView) this.f117592a._$_findCachedViewById(R.id.f35);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                FriendsSearchResultView friendsSearchResultView = (FriendsSearchResultView) this.f117592a._$_findCachedViewById(R.id.c65);
                C89219l.m154716b(friendsSearchResultView, "");
                friendsSearchResultView.setVisibility(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.find.p2991b.C50942a.AbstractC50944b
        /* renamed from: a */
        public final void mo86297a() {
            if (!this.f117592a.isDestroyed()) {
                ((DmtEditText) this.f117592a._$_findCachedViewById(R.id.ax4)).clearFocus();
                TuxTextView tuxTextView = (TuxTextView) this.f117592a._$_findCachedViewById(R.id.f35);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                FriendsSearchResultView friendsSearchResultView = (FriendsSearchResultView) this.f117592a._$_findCachedViewById(R.id.c65);
                C89219l.m154716b(friendsSearchResultView, "");
                friendsSearchResultView.setVisibility(8);
                this.f117592a.mo86305a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50959h(FindFriendsActivity findFriendsActivity) {
            this.f117592a = findFriendsActivity;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$b */
    public static final class C50952b extends AbstractC89220m implements AbstractC89171a<FindFriendsViewModel> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0218d f117580a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f117581b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f117582c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89277c f117583d;

        static {
            Covode.recordClassIndex(60129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C50952b(ActivityC0218d dVar, AbstractC89277c cVar, AbstractC89183m mVar, AbstractC89277c cVar2) {
            super(0);
            this.f117580a = dVar;
            this.f117581b = cVar;
            this.f117582c = mVar;
            this.f117583d = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.f117580a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f117583d
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r3)
                h.k.c r0 = r4.f117581b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m95378x9a20dd29(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel> r0 = com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.mo33696a(r0)
                if (r0 == 0) goto L_0x0038
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$b$1 r0 = new com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$b$1
                r0.<init>(r4)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity.C50952b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_find_ui_FindFriendsActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95378x9a20dd29(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public FindFriendsActivity() {
        AbstractC89277c a = C89204ab.m154669a(FindFriendsViewModel.class);
        this.f117574e = new lifecycleAwareLazy(this, new C50952b(this, a, C50951a.INSTANCE, a));
        this.f117571b = new C50939a();
        this.f117575f = new C88411a();
        this.f117572c = new SearchKeywordPresenter(this);
        this.f117576g = C89250i.m154773a((AbstractC89171a) new C50976u(this));
        this.f117577h = RouteArgExtension.INSTANCE.optionalArg(this, C50956e.f117588a, "previous_page", String.class);
        this.f117578i = C89250i.m154773a((AbstractC89171a) new C50981x(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$e */
    static final class C50956e extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C50956e f117588a = new C50956e();

        static {
            Covode.recordClassIndex(60133);
        }

        C50956e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$t */
    public static final class C50975t implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117610a;

        static {
            Covode.recordClassIndex(60152);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50975t(FindFriendsActivity findFriendsActivity) {
            this.f117610a = findFriendsActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f117610a.finish();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
            C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "find_friends").f79943a);
            C66416k.f149319a.mo105291a((Context) this.f117610a, false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$j */
    static final class View$OnClickListenerC50962j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117595a;

        static {
            Covode.recordClassIndex(60139);
        }

        View$OnClickListenerC50962j(FindFriendsActivity findFriendsActivity) {
            this.f117595a = findFriendsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117595a.mo86306e().mo86375c(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$k */
    static final class View$OnClickListenerC50963k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117596a;

        static {
            Covode.recordClassIndex(60140);
        }

        View$OnClickListenerC50963k(FindFriendsActivity findFriendsActivity) {
            this.f117596a = findFriendsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117596a.mo86306e().mo86375c(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$o */
    static final class View$OnClickListenerC50967o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117600a;

        static {
            Covode.recordClassIndex(60144);
        }

        View$OnClickListenerC50967o(FindFriendsActivity findFriendsActivity) {
            this.f117600a = findFriendsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117600a.mo86306e().mo86374b(-1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$n */
    static final class C50966n extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117599a;

        static {
            Covode.recordClassIndex(60143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50966n(FindFriendsActivity findFriendsActivity) {
            super(1);
            this.f117599a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            C51488a.m95912a("find_friends_page");
            FindFriendsActivity findFriendsActivity = this.f117599a;
            Intent a = InviteFriendsActivity.m96331a(findFriendsActivity, "find_friends_page");
            C84349a.m145093a(a, findFriendsActivity);
            findFriendsActivity.startActivity(a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$v */
    static final class C50977v extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C50977v f117612a = new C50977v();

        static {
            Covode.recordClassIndex(60154);
        }

        C50977v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C509781.f117613a);
            baseActivityViewModel2.config(C509792.f117614a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$d */
    static final class C50955d extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117586a;

        /* renamed from: b */
        final /* synthetic */ List f117587b;

        static {
            Covode.recordClassIndex(60132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50955d(FindFriendsActivity findFriendsActivity, List list) {
            super(1);
            this.f117586a = findFriendsActivity;
            this.f117587b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            if (this.f117587b.isEmpty() && findFriendsState2.getChannels().size() == 1) {
                RecyclerView recyclerView = (RecyclerView) this.f117586a._$_findCachedViewById(R.id.dfi);
                C89219l.m154716b(recyclerView, "");
                recyclerView.setVisibility(8);
                ((DmtStatusView) this.f117586a._$_findCachedViewById(R.id.e7i)).mo27385g();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$f */
    public static final class C50957f extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117589a;

        static {
            Covode.recordClassIndex(60134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50957f(FindFriendsActivity findFriendsActivity) {
            super(1);
            this.f117589a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            if (findFriendsState2.getSearchType().f117733a != 0) {
                this.f117589a.mo86306e().mo86375c(0);
            } else {
                FindFriendsActivity.super.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$l */
    static final class C50964l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117597a;

        static {
            Covode.recordClassIndex(60141);
        }

        C50964l(FindFriendsActivity findFriendsActivity) {
            this.f117597a = findFriendsActivity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2 = (String) obj;
            SearchKeywordPresenter searchKeywordPresenter = this.f117597a.f117572c;
            if (str2 != null) {
                str = str2.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            searchKeywordPresenter.mo94219a(new C57071b(str, ""));
            if (str2 == null || str2.length() <= 0) {
                this.f117597a.mo86306e().mo86375c(3);
            } else {
                this.f117597a.mo86306e().mo86375c(2);
            }
        }
    }

    /* renamed from: a */
    public final void mo86305a(boolean z) {
        int i;
        boolean z2;
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c62);
        C89219l.m154716b(frameLayout, "");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        AppBarLayout.C26570b bVar = (AppBarLayout.C26570b) layoutParams;
        int n = mo86307f().mo4374n() + 1;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dfi);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (n < i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            bVar.f62704a = 0;
            ((AppBarLayout) _$_findCachedViewById(R.id.ki)).setExpanded(true);
        } else {
            bVar.f62704a = 1;
        }
        FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c62);
        C89219l.m154716b(frameLayout2, "");
        frameLayout2.setLayoutParams(bVar);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onCreate", true);
        activityConfiguration(C50977v.f117612a);
        super.onCreate(bundle);
        setContentView(R.layout.a1y);
        String str = (String) this.f117577h.getValue();
        if (str != null) {
            FindFriendsViewModel e = mo86306e();
            C89219l.m154721d(str, "");
            e.f117700c = str;
        }
        AbstractC88412b unused = selectSubscribe(mo86306e(), C50988a.f117631a, C50989b.f117632a, new C20370ah(), new C50968p(this));
        selectSubscribe(mo86306e(), C50990c.f117633a, C20371ai.m38578b(), new C50970q(this));
        selectSubscribe(mo86306e(), C50991d.f117634a, C20371ai.m38578b(), new C50972r(this));
        AbstractC88412b unused2 = selectSubscribe(mo86306e(), C50992e.f117635a, new C20370ah(), new C50973s(this));
        ((AbstractC17250a) _$_findCachedViewById(R.id.eiz)).setTitle(R.string.bwx);
        NormalTitleBar normalTitleBar = (NormalTitleBar) _$_findCachedViewById(R.id.eiz);
        C89219l.m154716b(normalTitleBar, "");
        ((AbstractC17250a) _$_findCachedViewById(R.id.eiz)).setTitleColor(C0643b.m2378c(normalTitleBar.getContext(), R.color.bx));
        ((NormalTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C50975t(this));
        if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
            NormalTitleBar normalTitleBar2 = (NormalTitleBar) _$_findCachedViewById(R.id.eiz);
            C89219l.m154716b(normalTitleBar2, "");
            ImageView endBtn = normalTitleBar2.getEndBtn();
            C89219l.m154716b(endBtn, "");
            endBtn.setVisibility(8);
        }
        ((FriendsSearchResultView) _$_findCachedViewById(R.id.c65)).mo86319a(this, this.f117572c, mo86308g());
        View _$_findCachedViewById = _$_findCachedViewById(R.id.amb);
        C89219l.m154716b(_$_findCachedViewById, "");
        _$_findCachedViewById.setVisibility(8);
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m95371h();
        }
        if (C58029j.f132256h) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.c62);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
        }
        ((DmtEditText) _$_findCachedViewById(R.id.ax4)).setOnTouchListener(new View$OnTouchListenerC50960i(this));
        ((TuxTextView) _$_findCachedViewById(R.id.f35)).setOnClickListener(new View$OnClickListenerC50962j(this));
        ((ImageButton) _$_findCachedViewById(R.id.ys)).setOnClickListener(new View$OnClickListenerC50963k(this));
        DmtEditText dmtEditText = (DmtEditText) _$_findCachedViewById(R.id.ax4);
        C89219l.m154716b(dmtEditText, "");
        C89219l.m154721d(dmtEditText, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        AbstractC88979t a = AbstractC88979t.m154294a(new C80547hs.C80549b(eVar));
        C89219l.m154716b(a, "");
        C80547hs.C80550c cVar = new C80547hs.C80550c(eVar);
        dmtEditText.addTextChangedListener(cVar);
        AbstractC88979t a2 = a.mo143262a(new C80547hs.C80548a(dmtEditText, cVar));
        C89219l.m154716b(a2, "");
        AbstractC88412b d = a2.mo143291d(500, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C50964l(this));
        C89219l.m154716b(d, "");
        C88934a.m154195a(d, this.f117575f);
        ((DmtEditText) _$_findCachedViewById(R.id.ax4)).setOnEditorActionListener(new C50965m(this));
        if (this.f117573d == null) {
            FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.c63);
            C89219l.m154716b(frameLayout2, "");
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f35);
            C89219l.m154716b(tuxTextView, "");
            FriendsSearchResultView friendsSearchResultView = (FriendsSearchResultView) _$_findCachedViewById(R.id.c65);
            C89219l.m154716b(friendsSearchResultView, "");
            this.f117573d = new C50942a(frameLayout2, tuxTextView, friendsSearchResultView, new C50959h(this));
        }
        this.f117571b.f117549a = mo86306e().f117700c;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dfi);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(this.f117571b);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.dfi);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setLayoutManager(mo86307f());
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        ((RecyclerView) _$_findCachedViewById(R.id.dfi)).mo4405a(new C50958g(this, aVar));
        C17273d a3 = C81437h.m141212a(this, new View$OnClickListenerC50967o(this));
        C17275e eVar2 = new C17275e(this);
        eVar2.setStatus(a3);
        C50993f fVar = new C50993f(this, (byte) 0);
        fVar.setOnClickButtonListener(new C50966n(this));
        ((DmtStatusView) _$_findCachedViewById(R.id.e7i)).setBuilder(DmtStatusView.C17269a.m31905a(this).mo27397a().mo27406b(fVar).mo27408c(eVar2));
        mo86306e().mo86374b(-1);
        User b = C80580in.m139683b();
        C89219l.m154716b(b, "");
        AbstractC88412b g = C79515b.m138229a(this, C79496a.class, b.getUid(), "find_friends_page", "auto", false, true, null).mo143300g();
        C89219l.m154716b(g, "");
        C88934a.m154195a(g, this.f117575f);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.find.ui.FindFriendsActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$g */
    public static final class C50958g extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117590a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f117591b;

        static {
            Covode.recordClassIndex(60135);
        }

        C50958g(FindFriendsActivity findFriendsActivity, C89233z.C89234a aVar) {
            this.f117590a = findFriendsActivity;
            this.f117591b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            int i3;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (!this.f117591b.element) {
                this.f117591b.element = true;
                int n = this.f117590a.mo86307f().mo4374n() + 1;
                RecyclerView recyclerView2 = (RecyclerView) this.f117590a._$_findCachedViewById(R.id.dfi);
                C89219l.m154716b(recyclerView2, "");
                RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    i3 = adapter.getItemCount();
                } else {
                    i3 = 0;
                }
                if (n == i3) {
                    FrameLayout frameLayout = (FrameLayout) this.f117590a._$_findCachedViewById(R.id.c62);
                    C89219l.m154716b(frameLayout, "");
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
                    AppBarLayout.C26570b bVar = (AppBarLayout.C26570b) layoutParams;
                    bVar.f62704a = 0;
                    FrameLayout frameLayout2 = (FrameLayout) this.f117590a._$_findCachedViewById(R.id.c62);
                    C89219l.m154716b(frameLayout2, "");
                    frameLayout2.setLayoutParams(bVar);
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$q */
    static final class C50970q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117603a;

        static {
            Covode.recordClassIndex(60147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50970q(FindFriendsActivity findFriendsActivity) {
            super(2);
            this.f117603a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Integer> list) {
            AbstractC20477i iVar2 = iVar;
            final List<? extends Integer> list2 = list;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list2, "");
            iVar2.withState(this.f117603a.mo86306e(), new AbstractC89172b<FindFriendsState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity.C50970q.C509711 */

                /* renamed from: a */
                final /* synthetic */ C50970q f117604a;

                static {
                    Covode.recordClassIndex(60148);
                }

                {
                    this.f117604a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    C89219l.m154721d(findFriendsState2, "");
                    if (findFriendsState2.getResType().f117731a != -1 && findFriendsState2.getList().isEmpty() && list2.size() == 1) {
                        RecyclerView recyclerView = (RecyclerView) this.f117604a.f117603a._$_findCachedViewById(R.id.dfi);
                        C89219l.m154716b(recyclerView, "");
                        recyclerView.setVisibility(8);
                        ((DmtStatusView) this.f117604a.f117603a._$_findCachedViewById(R.id.e7i)).mo27385g();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$s */
    static final class C50973s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C51039e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117607a;

        static {
            Covode.recordClassIndex(60150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50973s(FindFriendsActivity findFriendsActivity) {
            super(2);
            this.f117607a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C51039e eVar) {
            AbstractC20477i iVar2 = iVar;
            final C51039e eVar2 = eVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(eVar2, "");
            iVar2.withState(this.f117607a.mo86306e(), new AbstractC89172b<FindFriendsState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity.C50973s.C509741 */

                /* renamed from: a */
                final /* synthetic */ C50973s f117608a;

                static {
                    Covode.recordClassIndex(60151);
                }

                {
                    this.f117608a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    C89219l.m154721d(findFriendsState2, "");
                    List<C51034a> list = findFriendsState2.getList();
                    List<Integer> channels = findFriendsState2.getChannels();
                    boolean hasMore = findFriendsState2.getHasMore();
                    int i = eVar2.f117731a;
                    if (i == -1) {
                        FindFriendsActivity findFriendsActivity = this.f117608a.f117607a;
                        RecyclerView recyclerView = (RecyclerView) findFriendsActivity._$_findCachedViewById(R.id.dfi);
                        C89219l.m154716b(recyclerView, "");
                        recyclerView.setVisibility(8);
                        findFriendsActivity.mo86306e().mo86372a(0);
                        ((DmtStatusView) findFriendsActivity._$_findCachedViewById(R.id.e7i)).mo27384f();
                    } else if (i == 1) {
                        FindFriendsActivity findFriendsActivity2 = this.f117608a.f117607a;
                        ((DmtStatusView) findFriendsActivity2._$_findCachedViewById(R.id.e7i)).mo27382d();
                        DmtStatusView dmtStatusView = (DmtStatusView) findFriendsActivity2._$_findCachedViewById(R.id.e7i);
                        C89219l.m154716b(dmtStatusView, "");
                        dmtStatusView.setVisibility(8);
                        RecyclerView recyclerView2 = (RecyclerView) findFriendsActivity2._$_findCachedViewById(R.id.dfi);
                        C89219l.m154716b(recyclerView2, "");
                        recyclerView2.setVisibility(0);
                        FrameLayout frameLayout = (FrameLayout) findFriendsActivity2._$_findCachedViewById(R.id.c62);
                        C89219l.m154716b(frameLayout, "");
                        if (frameLayout.getVisibility() == 8) {
                            FrameLayout frameLayout2 = (FrameLayout) findFriendsActivity2._$_findCachedViewById(R.id.c62);
                            C89219l.m154716b(frameLayout2, "");
                            frameLayout2.setVisibility(0);
                        }
                        findFriendsActivity2.f117571b.mo62377b_(list);
                        if (!hasMore) {
                            findFriendsActivity2.f117571b.mo67813a((AbstractC39063h.AbstractC39067a) null);
                            findFriendsActivity2.f117571b.mo67829d(false);
                        } else {
                            findFriendsActivity2.f117571b.aq_();
                            findFriendsActivity2.f117571b.mo67829d(true);
                            findFriendsActivity2.f117571b.mo67813a((AbstractC39063h.AbstractC39067a) new C50980w(findFriendsActivity2));
                        }
                        if (list.isEmpty() && !hasMore && channels.size() == 1) {
                            RecyclerView recyclerView3 = (RecyclerView) findFriendsActivity2._$_findCachedViewById(R.id.dfi);
                            C89219l.m154716b(recyclerView3, "");
                            recyclerView3.setVisibility(8);
                            ((DmtStatusView) findFriendsActivity2._$_findCachedViewById(R.id.e7i)).mo27385g();
                        }
                    } else if (i != 2) {
                        if (i == 3) {
                            FrameLayout frameLayout3 = (FrameLayout) this.f117608a.f117607a._$_findCachedViewById(R.id.c62);
                            C89219l.m154716b(frameLayout3, "");
                            if (frameLayout3.getVisibility() == 0) {
                                FrameLayout frameLayout4 = (FrameLayout) this.f117608a.f117607a._$_findCachedViewById(R.id.c62);
                                C89219l.m154716b(frameLayout4, "");
                                frameLayout4.setVisibility(8);
                            }
                            RecyclerView recyclerView4 = (RecyclerView) this.f117608a.f117607a._$_findCachedViewById(R.id.dfi);
                            C89219l.m154716b(recyclerView4, "");
                            recyclerView4.setVisibility(8);
                            ((DmtStatusView) this.f117608a.f117607a._$_findCachedViewById(R.id.e7i)).mo27387h();
                        } else if (i != 4) {
                            switch (i) {
                                case HandlerC21534a.f51116a:
                                    FindFriendsActivity findFriendsActivity3 = this.f117608a.f117607a;
                                    findFriendsActivity3.f117571b.f117550b = true;
                                    findFriendsActivity3.f117571b.mo62377b_(list);
                                    ((RecyclerView) findFriendsActivity3._$_findCachedViewById(R.id.dfi)).post(new RunnableC50954c(findFriendsActivity3));
                                    findFriendsActivity3.withState(findFriendsActivity3.mo86306e(), new C50955d(findFriendsActivity3, list));
                                    break;
                                case 101:
                                    FindFriendsActivity findFriendsActivity4 = this.f117608a.f117607a;
                                    findFriendsActivity4.startActivityForResult(InviteFriendsActivity.m96331a(findFriendsActivity4, "find_friends_page"), 101);
                                    break;
                                case 102:
                                    C79519c.C79521b bVar = C79519c.C79521b.f178476a;
                                    User b = C80580in.m139683b();
                                    C89219l.m154716b(b, "");
                                    C51488a.m95940d("fb", C80538hl.m139614a(bVar.mo86987a(b.getUid())));
                                    Intent intent = new Intent(this.f117608a.f117607a, InviteUserListActivity.class);
                                    intent.putExtra(StringSet.type, 3);
                                    FindFriendsActivity findFriendsActivity5 = this.f117608a.f117607a;
                                    C84349a.m145093a(intent, findFriendsActivity5);
                                    findFriendsActivity5.startActivity(intent);
                                    break;
                                case 103:
                                    C51488a.m95940d("contact", C79519c.C79520a.f178475a.mo86984c());
                                    SmartRouter.buildRoute(this.f117608a.f117607a, "//friends/contacts").open();
                                    break;
                            }
                        } else {
                            this.f117608a.f117607a.f117571b.mo67824j();
                        }
                    } else if (hasMore) {
                        this.f117608a.f117607a.f117571b.aq_();
                        this.f117608a.f117607a.f117571b.mo62377b_(list);
                    } else {
                        this.f117608a.f117607a.f117571b.mo67813a((AbstractC39063h.AbstractC39067a) null);
                        this.f117608a.f117607a.f117571b.mo67829d(false);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$i */
    static final class View$OnTouchListenerC50960i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117593a;

        static {
            Covode.recordClassIndex(60137);
        }

        View$OnTouchListenerC50960i(FindFriendsActivity findFriendsActivity) {
            this.f117593a = findFriendsActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 1) {
                return false;
            }
            DmtEditText dmtEditText = (DmtEditText) this.f117593a._$_findCachedViewById(R.id.ax4);
            C89219l.m154716b(dmtEditText, "");
            dmtEditText.setCursorVisible(true);
            FindFriendsActivity findFriendsActivity = this.f117593a;
            findFriendsActivity.withState(findFriendsActivity.mo86306e(), new AbstractC89172b<FindFriendsState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity.View$OnTouchListenerC50960i.C509611 */

                /* renamed from: a */
                final /* synthetic */ View$OnTouchListenerC50960i f117594a;

                static {
                    Covode.recordClassIndex(60138);
                }

                {
                    this.f117594a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
                    C89219l.m154721d(findFriendsState, "");
                    this.f117594a.f117593a.mo86306e().mo86375c(1);
                    return C89391z.f203057a;
                }
            });
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$r */
    static final class C50972r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C51041f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117606a;

        static {
            Covode.recordClassIndex(60149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50972r(FindFriendsActivity findFriendsActivity) {
            super(2);
            this.f117606a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C51041f fVar) {
            C51041f fVar2 = fVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(fVar2, "");
            int i = fVar2.f117733a;
            if (i == 0) {
                FindFriendsActivity findFriendsActivity = this.f117606a;
                C39115e.m79412a(findFriendsActivity, findFriendsActivity._$_findCachedViewById(R.id.ax4));
                this.f117606a.f117572c.mo94219a(new C57071b("", ""));
                DmtEditText dmtEditText = (DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4);
                C89219l.m154716b(dmtEditText, "");
                Editable text = dmtEditText.getText();
                if (text != null) {
                    text.clear();
                }
                DmtEditText dmtEditText2 = (DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4);
                C89219l.m154716b(dmtEditText2, "");
                dmtEditText2.setCursorVisible(false);
                ((DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4)).clearFocus();
                ImageButton imageButton = (ImageButton) this.f117606a._$_findCachedViewById(R.id.ys);
                C89219l.m154716b(imageButton, "");
                imageButton.setVisibility(8);
                ((FriendsSearchResultView) this.f117606a._$_findCachedViewById(R.id.c65)).mo86318a();
                C50942a aVar = this.f117606a.f117573d;
                if (aVar != null) {
                    aVar.mo86296c();
                    if (aVar.f117557a != 0) {
                        aVar.mo86294a().start();
                    }
                }
            } else if (i == 1) {
                FindFriendsActivity findFriendsActivity2 = this.f117606a;
                ((FriendsSearchResultView) this.f117606a._$_findCachedViewById(R.id.c65)).mo86319a(findFriendsActivity2, findFriendsActivity2.f117572c, this.f117606a.mo86308g());
                C50942a aVar2 = this.f117606a.f117573d;
                if (aVar2 != null) {
                    aVar2.mo86296c();
                    if (aVar2.f117557a != 1) {
                        aVar2.mo86295b().start();
                    }
                }
                this.f117606a.mo86305a(false);
            } else if (i == 2) {
                ImageButton imageButton2 = (ImageButton) this.f117606a._$_findCachedViewById(R.id.ys);
                C89219l.m154716b(imageButton2, "");
                imageButton2.setVisibility(0);
                ((FriendsSearchResultView) this.f117606a._$_findCachedViewById(R.id.c65)).mo86320c();
            } else if (i == 3) {
                ImageButton imageButton3 = (ImageButton) this.f117606a._$_findCachedViewById(R.id.ys);
                C89219l.m154716b(imageButton3, "");
                if (imageButton3.getVisibility() == 0) {
                    this.f117606a.f117572c.mo94219a(new C57071b("", ""));
                    DmtEditText dmtEditText3 = (DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4);
                    C89219l.m154716b(dmtEditText3, "");
                    Editable text2 = dmtEditText3.getText();
                    if (text2 != null) {
                        text2.clear();
                    }
                    DmtEditText dmtEditText4 = (DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4);
                    C89219l.m154716b(dmtEditText4, "");
                    dmtEditText4.setCursorVisible(true);
                    ((DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4)).requestFocus();
                    ImageButton imageButton4 = (ImageButton) this.f117606a._$_findCachedViewById(R.id.ys);
                    C89219l.m154716b(imageButton4, "");
                    imageButton4.setVisibility(8);
                    C39115e.m79413a(this.f117606a._$_findCachedViewById(R.id.ax4));
                    ((FriendsSearchResultView) this.f117606a._$_findCachedViewById(R.id.c65)).mo86318a();
                }
            } else if (i == 4) {
                DmtEditText dmtEditText5 = (DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4);
                C89219l.m154716b(dmtEditText5, "");
                dmtEditText5.setCursorVisible(false);
                ((DmtEditText) this.f117606a._$_findCachedViewById(R.id.ax4)).clearFocus();
                FindFriendsActivity findFriendsActivity3 = this.f117606a;
                C39115e.m79412a(findFriendsActivity3, findFriendsActivity3._$_findCachedViewById(R.id.ax4));
                ((FriendsSearchResultView) this.f117606a._$_findCachedViewById(R.id.c65)).mo86320c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo86306e().mo86371a();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$m */
    static final class C50965m implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117598a;

        static {
            Covode.recordClassIndex(60142);
        }

        C50965m(FindFriendsActivity findFriendsActivity) {
            this.f117598a = findFriendsActivity;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            if (TextUtils.isEmpty(this.f117598a.f117572c.mo94218a().f129938a)) {
                return true;
            }
            this.f117598a.mo86306e().mo86375c(4);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FindFriendsActivity$p */
    static final class C50968p extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Boolean, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsActivity f117601a;

        static {
            Covode.recordClassIndex(60145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50968p(FindFriendsActivity findFriendsActivity) {
            super(3);
            this.f117601a = findFriendsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool, Boolean bool2) {
            AbstractC20477i iVar2 = iVar;
            bool.booleanValue();
            bool2.booleanValue();
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f117601a.mo86306e(), new AbstractC89172b<FindFriendsState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.find.p2992ui.FindFriendsActivity.C50968p.C509691 */

                /* renamed from: a */
                final /* synthetic */ C50968p f117602a;

                static {
                    Covode.recordClassIndex(60146);
                }

                {
                    this.f117602a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
                    FindFriendsState findFriendsState2 = findFriendsState;
                    C89219l.m154721d(findFriendsState2, "");
                    if (findFriendsState2.getHasMore() || !findFriendsState2.getCanShowEmtpyTail()) {
                        this.f117602a.f117601a.f117571b.mo86293m();
                    } else {
                        this.f117602a.f117601a.f117571b.mo86292l();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
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
