package com.p2082ss.android.ugc.aweme.homepage.msadapt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.C33955at;
import com.p2082ss.android.ugc.aweme.C34406ba;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.challenge.api.C35490a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40543j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.C52981a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.AbstractC59106m;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.p3427a.C59008a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.music.service.MusicDetailService;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity */
public final class DoubleFragmentMainActivity extends AbstractActivityC52980a implements C59008a.AbstractC59009a, AbstractC59103j, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private SurfaceDuoLayout f121807a;

    /* renamed from: b */
    private ScrollSwitchStateManager f121808b;

    /* renamed from: c */
    private final AbstractC89244h f121809c = C89250i.m154773a((AbstractC89171a) C52974c.f121820a);

    /* renamed from: d */
    private C33955at f121810d;

    /* renamed from: e */
    private final String f121811e = "msadapt";

    /* renamed from: f */
    private String f121812f = "DISCOVER";

    /* renamed from: g */
    private Fragment f121813g;

    /* renamed from: h */
    private Fragment f121814h;

    /* renamed from: i */
    private Fragment f121815i;

    /* renamed from: j */
    private int f121816j;

    /* renamed from: k */
    private final String f121817k = "end";

    /* renamed from: l */
    private SparseArray f121818l;

    static {
        Covode.recordClassIndex(62505);
    }

    /* renamed from: b */
    private final Fragment m97890b() {
        return (Fragment) this.f121809c.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f121818l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f121818l == null) {
            this.f121818l = new SparseArray();
        }
        View view = (View) this.f121818l.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f121818l.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(16, new RunnableC90250g(DoubleFragmentMainActivity.class, "onScrollToProfileEvent", C49669ad.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final boolean hasRegistedResumeAction() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final boolean isMainTabVisible() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final boolean isUnderMainTab() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final boolean isUnderThirdTab() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final void onFeedRecommendFragmentReady() {
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final void onKeyBack() {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public final void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final void setTabBackground(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public final void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity$a */
    public static final class C52972a implements AbstractC59106m {
        static {
            Covode.recordClassIndex(62506);
        }

        @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59106m
        /* renamed from: a */
        public final void mo89425a() {
        }

        C52972a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity$e */
    static final class RunnableC52977e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DoubleFragmentMainActivity f121823a;

        static {
            Covode.recordClassIndex(62511);
        }

        RunnableC52977e(DoubleFragmentMainActivity doubleFragmentMainActivity) {
            this.f121823a = doubleFragmentMainActivity;
        }

        public final void run() {
            this.f121823a.mo89412a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final AbstractC59106m getMainHelper() {
        return new C52972a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
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

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity$c */
    static final class C52974c extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C52974c f121820a = new C52974c();

        static {
            Covode.recordClassIndex(62508);
        }

        C52974c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return MainServiceImpl.createIMainServicebyMonsterPlugin(false).obtainMainPageFragment();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity$f */
    static final class RunnableC52978f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f121824a;

        /* renamed from: b */
        final /* synthetic */ Aweme f121825b;

        static {
            Covode.recordClassIndex(62512);
        }

        RunnableC52978f(Fragment fragment, Aweme aweme) {
            this.f121824a = fragment;
            this.f121825b = aweme;
        }

        public final void run() {
            ProfileServiceImpl.m114884g().updateUserInfo(this.f121824a, this.f121825b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final Fragment getCurFragment() {
        Fragment b = m97890b();
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.p3427a.C59008a.AbstractC59009a
    public final AbstractC59108o getHelper() {
        AbstractC59108o a = HomePageUIFrameServiceImpl.m108627e().mo89380a((Context) this);
        if (a == null) {
            C89219l.m154715b();
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final boolean isDuoDualMode() {
        if (!C52981a.C52982a.m97912b(this)) {
            return false;
        }
        return C52981a.C52982a.m97914d(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public final String getEnterFrom() {
        AbstractC59105l a = MSAdaptionService.m97895c().mo89368a((Activity) this);
        if (a == null || a.mo96548m() || !a.mo96549n()) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        super.onBackPressed();
        if (MSAdaptionService.m97895c().mo89377c((Context) this)) {
            SmartRouter.buildRoute(this, "//duo").withParam("duo_type", "duo_back").open();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", true);
        super.onResume();
        C52981a.C52982a.m97914d(this);
        if (!C52981a.C52982a.m97914d(this)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", false);
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

    /* renamed from: a */
    public final void mo89412a() {
        Fragment a = mo89411a(false);
        if (a != null) {
            if (m97888a(a)) {
                int i = this.f121816j;
                if (i > 0) {
                    int i2 = 1;
                    while (true) {
                        getSupportFragmentManager().mo3562c();
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                this.f121816j = 0;
                return;
            }
            getSupportFragmentManager().mo3562c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity$b */
    public static final class C52973b implements AwemeChangeCallBack.AbstractC59111a {

        /* renamed from: a */
        final /* synthetic */ DoubleFragmentMainActivity f121819a;

        static {
            Covode.recordClassIndex(62507);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52973b(DoubleFragmentMainActivity doubleFragmentMainActivity) {
            this.f121819a = doubleFragmentMainActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
        /* renamed from: a */
        public final void mo37101a(Aweme aweme) {
            ProfileServiceImpl.m114884g().updateUserInfo(this.f121819a.mo89411a(true), aweme);
            if (aweme != null) {
                MSAdaptionService.m97895c().mo89371a(aweme);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m97883a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity$d */
    static final class C52975d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C52975d f121821a = new C52975d();

        static {
            Covode.recordClassIndex(62509);
        }

        C52975d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C529761.f121822a);
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onScrollToProfileEvent(C49669ad adVar) {
        if (MSAdaptionService.m97895c().mo89377c((Context) this)) {
            SmartRouter.buildRoute(this, "//duo").withParam("duo_type", "duo_profile").open();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        if (C52981a.C52982a.m97912b(this) && C52981a.C52982a.m97914d(this) && getResources().getConfiguration().orientation == 1) {
            AbstractC1196i lifecycle = getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
                SmartRouter.buildRoute(this, "//main").open();
                finish();
            }
        }
        if (!C52981a.C52982a.m97914d(this)) {
            AbstractC1196i lifecycle2 = getLifecycle();
            C89219l.m154716b(lifecycle2, "");
            if (lifecycle2.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
                SmartRouter.buildRoute(this, "//main").open();
                finish();
            }
        }
    }

    /* renamed from: a */
    private static boolean m97888a(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return TextUtils.equals(fragment.getTag(), "duo_detail");
    }

    /* renamed from: a */
    private static boolean m97889a(String str) {
        if (C89219l.m154714a((Object) str, (Object) "DISCOVER") || C89219l.m154714a((Object) str, (Object) "NOTIFICATION") || C89219l.m154714a((Object) str, (Object) "USER")) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.homepage.msadapt.AbstractActivityC52980a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        View view;
        C33955at atVar;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", true);
        activityConfiguration(C52975d.f121821a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.b9);
        Hox.C15490a.m28529a(this).mo25206a(this, HomePageUIFrameServiceImpl.m108627e().mo89379a((ActivityC0945e) this));
        ScrollSwitchStateManager a = ScrollSwitchStateManager.C52950a.m97811a(this);
        this.f121808b = a;
        if (a == null) {
            C89219l.m154710a("stateManager");
        }
        a.mo89341a("page_feed");
        Bundle bundle2 = new Bundle();
        bundle2.putString(C34792be.f82123b, C34792be.f82125d);
        Hox.C15490a.m28529a(this).mo25211b("HOME", bundle2);
        this.f121810d = new C33955at();
        if (!(getApplication() == null || (atVar = this.f121810d) == null)) {
            atVar.mo60225a(getApplication());
        }
        AwemeChangeCallBack.m108597b(this, this, new C52973b(this));
        SurfaceDuoLayout surfaceDuoLayout = (SurfaceDuoLayout) findViewById(R.id.avu);
        this.f121807a = surfaceDuoLayout;
        AbstractC34586a aVar = null;
        if (surfaceDuoLayout != null) {
            view = surfaceDuoLayout.findViewById(R.id.b41);
        } else {
            view = null;
        }
        if (view != null) {
            SurfaceDuoLayout surfaceDuoLayout2 = this.f121807a;
            if (surfaceDuoLayout2 != null) {
                surfaceDuoLayout2.findViewById(R.id.b41);
            }
            Fragment b = m97890b();
            if (b == null) {
                C89219l.m154715b();
            }
            m97885a(R.id.b41, b);
            MSAdaptionService.m97895c().mo89369a(m97890b());
            Fragment obtainFriendTabFragment = MainServiceImpl.createIMainServicebyMonsterPlugin(false).obtainFriendTabFragment();
            C89219l.m154716b(obtainFriendTabFragment, "");
            this.f121813g = obtainFriendTabFragment;
            Class a2 = C61611b.f139811a.mo99371a();
            if (a2 != null) {
                aVar = (AbstractC34586a) a2.newInstance();
            }
            this.f121814h = aVar;
            Fragment obtainMyProfileFragment = ProfileServiceImpl.m114884g().obtainMyProfileFragment();
            if (obtainMyProfileFragment == null) {
                C89219l.m154715b();
            }
            this.f121815i = obtainMyProfileFragment;
            AbstractC0976n a3 = getSupportFragmentManager().mo3552a();
            C89219l.m154716b(a3, "");
            Fragment fragment = this.f121813g;
            if (fragment == null) {
                C89219l.m154715b();
            }
            AbstractC0976n a4 = a3.mo3454a(R.id.b42, fragment, "DISCOVER");
            Fragment fragment2 = this.f121814h;
            if (fragment2 == null) {
                C89219l.m154715b();
            }
            AbstractC0976n a5 = a4.mo3454a(R.id.b42, fragment2, "NOTIFICATION");
            Fragment fragment3 = this.f121815i;
            if (fragment3 == null) {
                C89219l.m154715b();
            }
            AbstractC0976n a6 = a5.mo3454a(R.id.b42, fragment3, "USER");
            Fragment fragment4 = this.f121813g;
            if (fragment4 == null) {
                C89219l.m154715b();
            }
            AbstractC0976n c = a6.mo3474c(fragment4);
            Fragment fragment5 = this.f121814h;
            if (fragment5 == null) {
                C89219l.m154715b();
            }
            AbstractC0976n b2 = c.mo3471b(fragment5);
            Fragment fragment6 = this.f121815i;
            if (fragment6 == null) {
                C89219l.m154715b();
            }
            b2.mo3471b(fragment6).mo3467b();
        } else {
            Fragment b3 = m97890b();
            if (b3 == null) {
                C89219l.m154715b();
            }
            m97885a(R.id.b42, b3);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        setIntent(intent);
        Fragment fragment = null;
        r4 = null;
        r4 = null;
        r4 = null;
        Fragment fragment2 = null;
        String str2 = null;
        if (intent != null) {
            str = m97884a(intent, "duo_type");
        } else {
            str = null;
        }
        boolean a = m97888a(mo89411a(false));
        boolean z = !TextUtils.equals("duo_back", str);
        if (TextUtils.equals(str, "duo_detail") || (z && a)) {
            this.f121816j++;
        }
        if (intent != null) {
            m97884a(intent, "duo_type");
            String a2 = m97884a(intent, "duo_type");
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case -2080291192:
                        if (a2.equals("duo_back")) {
                            mo89412a();
                            return;
                        }
                        return;
                    case -1938590286:
                        if (a2.equals("duo_detail")) {
                            C89219l.m154721d(this, "");
                            if (MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
                                fragment = C34406ba.m70397a().mo57054a(this);
                            }
                            m97886a(fragment, "duo_detail", false);
                            return;
                        }
                        return;
                    case -1833904024:
                        if (a2.equals("duo_profile")) {
                            Fragment a3 = mo89411a(true);
                            if (a3 != null) {
                                str2 = a3.getTag();
                            }
                            if (!TextUtils.equals(str2, "duo_profile")) {
                                Fragment obtainUserProfileFragment = ProfileServiceImpl.m114884g().obtainUserProfileFragment();
                                Aweme a4 = AwemeChangeCallBack.m108593a(this);
                                m97886a(obtainUserProfileFragment, "duo_profile", true);
                                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC52978f(obtainUserProfileFragment, a4), 1000);
                                return;
                            }
                            return;
                        }
                        return;
                    case -300053832:
                        if (a2.equals("duo_webview")) {
                            C40543j jVar = new C40543j();
                            jVar.mo69667a(new RunnableC52977e(this));
                            jVar.setArguments(m97883a(getIntent()));
                            m97886a((Fragment) jVar, "duo_webview", true);
                            return;
                        }
                        return;
                    case -30215092:
                        if (a2.equals("duo_music_detail")) {
                            m97886a((DoubleFragmentMainActivity) MusicDetailService.m110596a().mo98580a(getIntent()), (Fragment) "duo_music_detail", (String) true);
                            return;
                        }
                        return;
                    case 962860898:
                        if (a2.equals("duo_challenge")) {
                            m97886a((DoubleFragmentMainActivity) C35490a.f83707a.mo62370a(getIntent()), (Fragment) "duo_challenge", (String) true);
                            return;
                        }
                        return;
                    case 971786005:
                        if (a2.equals("duo_bottom_click")) {
                            String a5 = m97884a(intent, "duo_clicked_tab_name");
                            if (a5 == null) {
                                a5 = "";
                            }
                            C89219l.m154716b(a5, "");
                            if (TextUtils.equals(a5, "PUBLISH")) {
                                Toast makeText = Toast.makeText(this, getString(R.string.bed), 0);
                                if (Build.VERSION.SDK_INT == 25) {
                                    C80567ic.m139657a(makeText);
                                }
                                makeText.show();
                                return;
                            } else if (!TextUtils.equals(a5, "HOME")) {
                                this.f121812f = a5;
                                int hashCode = a5.hashCode();
                                if (hashCode != -1382453013) {
                                    if (hashCode != 2614219) {
                                        if (hashCode == 1055811561 && a5.equals("DISCOVER")) {
                                            fragment2 = this.f121813g;
                                        }
                                    } else if (a5.equals("USER")) {
                                        fragment2 = this.f121815i;
                                    }
                                } else if (a5.equals("NOTIFICATION")) {
                                    fragment2 = this.f121814h;
                                }
                                m97886a((DoubleFragmentMainActivity) fragment2, (Fragment) a5, (String) true);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo89411a(boolean z) {
        boolean z2;
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        List<Fragment> f = supportFragmentManager.mo3565f();
        C89219l.m154716b(f, "");
        if (f == null) {
            return null;
        }
        for (Fragment fragment : f) {
            if (fragment != null && fragment.isVisible()) {
                if (TextUtils.equals(fragment.getTag(), "HOME") || TextUtils.equals(fragment.getTag(), "duo_detail")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (!z2) {
                        return fragment;
                    }
                } else if (z2) {
                    return fragment;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m97884a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final void m97885a(int i, Fragment fragment) {
        if (this.f121807a != null && findViewById(i) != null) {
            AbstractC0976n b = getSupportFragmentManager().mo3552a().mo3470b(i, fragment, "HOME");
            C89219l.m154716b(b, "");
            b.mo3473c();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m97886a(Fragment fragment, String str, boolean z) {
        int i;
        if (fragment != null) {
            if (z) {
                i = R.id.b42;
            } else {
                i = R.id.b41;
            }
            Fragment a = mo89411a(z);
            AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
            C89219l.m154716b(a2, "");
            if (a != null) {
                a2.mo3471b(a);
            }
            if (m97889a(str)) {
                a2.mo3474c(fragment);
            } else {
                a2.mo3454a(i, fragment, str);
            }
            a2.mo3457a((String) null);
            a2.mo3467b();
        }
    }
}
