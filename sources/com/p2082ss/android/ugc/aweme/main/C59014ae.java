package com.p2082ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.tiktok.homepage.mainfragment.C22764a;
import com.bytedance.tiktok.homepage.mainfragment.C22767d;
import com.bytedance.tiktok.homepage.mainfragment.C22768e;
import com.bytedance.tiktok.homepage.mainfragment.RunnableC22766c;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22771a;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22774d;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22777e;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22778f;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22800g;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22804k;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.C22807l;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39237h;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.feed.AbstractC48019aa;
import com.p2082ss.android.ugc.aweme.feed.C48020ab;
import com.p2082ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49667ab;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.FollowTab;
import com.p2082ss.android.ugc.aweme.follow.p2996b.C51072a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.homepage.api.data.C52948a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.C53298a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.C53305b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.FlippableViewPagerExt;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53385d;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.experiment.C59086g;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59091c;
import com.p2082ss.android.ugc.aweme.main.p3435h.C59101a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.service.IFeedDebugService;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.ae */
public class C59014ae extends AbstractC34586a implements AbstractC2599d, AbstractC15497d, AbstractC22772b, AbstractC39273a, AbstractC53383b, AbstractC59105l, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    C59019b f134343A = new C59019b(this);

    /* renamed from: B */
    protected C69488a f134344B;

    /* renamed from: C */
    public C52948a f134345C;

    /* renamed from: D */
    HomePageDataViewModel f134346D;

    /* renamed from: E */
    public int f134347E = 0;

    /* renamed from: F */
    AbstractC88412b f134348F = null;

    /* renamed from: G */
    public C22767d f134349G;

    /* renamed from: H */
    boolean f134350H = false;

    /* renamed from: I */
    C50041af f134351I;

    /* renamed from: J */
    boolean f134352J = false;

    /* renamed from: K */
    private C22804k f134353K = new C22804k(this);

    /* renamed from: L */
    private C53298a f134354L = new C53298a();

    /* renamed from: M */
    private ScrollSwitchStateManager f134355M;

    /* renamed from: N */
    private AdHomePageDataVM f134356N;

    /* renamed from: O */
    private IAccountService.AbstractC31272b f134357O = null;

    /* renamed from: P */
    private String f134358P;

    /* renamed from: Q */
    private View[] f134359Q;

    /* renamed from: R */
    private AbstractC39237h f134360R;

    /* renamed from: S */
    private C22768e f134361S;

    /* renamed from: T */
    private C22764a f134362T;

    /* renamed from: U */
    private final AbstractC1214u<C18017a> f134363U = new C59020af(this);

    /* renamed from: a */
    ViewGroup f134364a;

    /* renamed from: b */
    FrameLayout f134365b;

    /* renamed from: c */
    public FlippableViewPagerExt f134366c;

    /* renamed from: d */
    C53385d f134367d;

    /* renamed from: e */
    int f134368e = 1;

    /* renamed from: j */
    View f134369j;

    /* renamed from: k */
    FrameLayout f134370k;

    /* renamed from: l */
    View f134371l;

    /* renamed from: m */
    ViewStub f134372m;

    /* renamed from: n */
    C22807l f134373n;

    /* renamed from: o */
    C22774d f134374o = new C22774d(this, this);

    /* renamed from: p */
    C22771a f134375p = new C22771a(this);

    /* renamed from: q */
    C22800g f134376q = new C22800g(this);

    /* renamed from: r */
    C22778f f134377r = new C22778f(this);

    /* renamed from: s */
    C22777e f134378s = new C22777e(this);

    /* renamed from: t */
    View f134379t;

    /* renamed from: u */
    LinearLayout f134380u;

    /* renamed from: v */
    ImageView f134381v;

    /* renamed from: w */
    AnimatedImageView f134382w;

    /* renamed from: y */
    public C53305b f134383y;

    /* renamed from: z */
    public boolean f134384z = false;

    static {
        Covode.recordClassIndex(69359);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "HOME";
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        return null;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(60, new RunnableC90250g(C59014ae.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(137, new RunnableC90250g(C59014ae.class, "onNotificationIndicatorEvent", C61561m.class, ThreadMode.MAIN, 0, false));
        hashMap.put(270, new RunnableC90250g(C59014ae.class, "onLiveCleanEvent", C48020ab.class, ThreadMode.POSTING, 0, false));
        hashMap.put(335, new RunnableC90250g(C59014ae.class, "onResumeSwipeAfterLoginEvent", C49667ab.class, ThreadMode.MAIN, 0, false));
        hashMap.put(336, new RunnableC90250g(C59014ae.class, "onFollowBubbleShowEvent", C51072a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(337, new RunnableC90250g(C59014ae.class, "onTimeLineTabEvent", C59091c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b
    /* renamed from: h */
    public final FrameLayout mo37093h() {
        return this.f134365b;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59105l
    /* renamed from: o */
    public final C52948a mo96550o() {
        return this.f134345C;
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(2223327);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a
    /* renamed from: f */
    public final void mo68647f() {
        m108459a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a
    /* renamed from: j */
    public final void mo68648j() {
        m108459a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59105l
    /* renamed from: p */
    public final String mo96557p() {
        String str = this.f134358P;
        this.f134358P = "";
        return str;
    }

    /* renamed from: t */
    private void m108460t() {
        if (this.f134383y != null) {
            this.f134376q.mo37112f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: k */
    public final boolean mo89965k() {
        C69488a aVar = this.f134344B;
        if (aVar == null || !aVar.mo109737a("swipe_up_guide")) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final AbstractC50477z mo96547l() {
        C53305b bVar = this.f134383y;
        if (bVar == null) {
            return null;
        }
        return (AbstractC50477z) bVar.mo89711a();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b
    /* renamed from: e */
    public final Aweme mo37090e() {
        if (getActivity() == null) {
            return null;
        }
        return AwemeChangeCallBack.m108593a(getActivity());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b
    /* renamed from: g */
    public final String mo37091g() {
        FlippableViewPagerExt flippableViewPagerExt;
        int b;
        C53305b bVar = this.f134383y;
        if (bVar == null || (flippableViewPagerExt = this.f134366c) == null || (b = bVar.mo89712b(flippableViewPagerExt.getCurrentItemCompat())) == 0 || b != 1) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22772b
    /* renamed from: i */
    public final SpecialTopicEntry mo37094i() {
        try {
            return (SpecialTopicEntry) C16048b.m29633a().mo25415a(true, "special_event_entrypoint", SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59105l
    /* renamed from: m */
    public final boolean mo96548m() {
        FlippableViewPagerExt flippableViewPagerExt;
        C53305b bVar = this.f134383y;
        if (bVar == null || (flippableViewPagerExt = this.f134366c) == null || bVar.mo89712b(flippableViewPagerExt.getCurrentItemCompat()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59105l
    /* renamed from: n */
    public final boolean mo96549n() {
        FlippableViewPagerExt flippableViewPagerExt;
        C53305b bVar = this.f134383y;
        if (bVar == null || (flippableViewPagerExt = this.f134366c) == null || bVar.mo89712b(flippableViewPagerExt.getCurrentItemCompat()) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        C53298a aVar = this.f134354L;
        C89219l.m154721d(this, "");
        aVar.f122336b = null;
        C22764a aVar2 = this.f134362T;
        if (aVar2 != null) {
            EventBus.m156962a().mo145395b(aVar2);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C58939a.C58940a.f134171a.f134170a.getResFakerService().mo96420b(this.f134364a);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59105l
    /* renamed from: q */
    public final String mo96558q() {
        FollowTab followTab;
        ActivityC0945e activity = getActivity();
        if (activity == null || (followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(activity).mo89735a("Following")) == null) {
            return "";
        }
        return followTab.mo85043l();
    }

    /* renamed from: r */
    public final void mo96559r() {
        AbstractC50477z s = mo96547l();
        if (s != null && (s instanceof C50041af)) {
            s.f116589y = "press_back";
            s.mo85173q();
            getContext();
            C39162r.m79454a("click_back_fresh", "homepage_hot", 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f134357O != null) {
            C31575b.m65859a();
            C31575b.f75524a.mo57066b(this.f134357O);
        }
        EventBus.m156962a().mo145395b(this);
        GlobalAcViewModel.m91042a(requireActivity());
        C22771a aVar = this.f134375p;
        EventBus.m156962a().mo145395b(aVar);
        if (aVar.f53782a != null) {
            aVar.f53783b.mo99179a("homepage_hot");
        }
        EventBus.m156962a().mo145395b(this.f134374o);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        MethodCollector.m26663i(7140);
        super.onPause();
        C22800g gVar = this.f134376q;
        if (gVar.f53839a != null) {
            C40556v a = C40556v.m81851a();
            SingleWebView singleWebView = gVar.f53839a;
            if (!TextUtils.isEmpty("/ies-cdn-alisg/tiktok_activities/covid19") && singleWebView != null) {
                synchronized (a.f94899e) {
                    try {
                        ViewGroup viewGroup = (ViewGroup) singleWebView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(singleWebView);
                        }
                        Context context = singleWebView.getContext();
                        if (context instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context).setBaseContext(C17867d.m33078a());
                        }
                        a.f94897c.put("/ies-cdn-alisg/tiktok_activities/covid19", singleWebView);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7140);
                        throw th;
                    }
                }
            }
            gVar.f53839a = null;
        }
        ServiceManager.get().getService(IFeedDebugService.class);
        this.f134348F = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C59028an.f134400a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C59029ao(this));
        MethodCollector.m26664o(7140);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        FollowTab followTab;
        C58945a.C58947b.f134185a.mo96425a("cold_boot_main_fragment_onresume", false);
        super.onResume();
        if (this.f134367d.mo89973b() && (followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(getActivity()).mo89735a("Following")) != null) {
            followTab.mo85042k();
        }
        FlippableViewPagerExt flippableViewPagerExt = this.f134366c;
        if (!(flippableViewPagerExt == null || this.f134367d == null)) {
            this.f134367d.mo89971a(flippableViewPagerExt.getCurrentItemCompat(), 3);
        }
        C58939a.C58940a.f134171a.f134170a.getResFakerService().mo96419a(this.f134364a);
        C22771a aVar = this.f134375p;
        if (!(aVar.f53782a == null || aVar.f53784c == null)) {
            aVar.f53783b.mo99180b(aVar.f53784c.mo37091g());
        }
        ServiceManager.get().getService(IFeedDebugService.class);
        getActivity();
        this.f134348F = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C59027am(this));
        C58945a.C58947b.f134185a.mo96429b("cold_boot_main_fragment_onresume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.ae$b */
    static class C59019b extends AbstractRunnableC59056be<C59014ae> {
        static {
            Covode.recordClassIndex(69364);
        }

        C59019b(C59014ae aeVar) {
            super(aeVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.main.AbstractRunnableC59056be
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo96561a(C59014ae aeVar) {
            C59014ae aeVar2 = aeVar;
            if (aeVar2 != null) {
                C29339a.m58753a(aeVar2.f134343A, 120000);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: a */
    public final void mo89961a(int i) {
        this.f134368e = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @AbstractC90264r
    public void onFollowBubbleShowEvent(C51072a aVar) {
        this.f134358P = aVar.f117799a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Fragment mo96545c(int i) {
        try {
            Fragment fragment = this.f134383y.f122348c.get(i);
            C89219l.m154716b(fragment, "");
            return fragment;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C22764a aVar = new C22764a(this);
        this.f134362T = aVar;
        C29339a.m58753a(new RunnableC22766c(aVar, activity), 3000);
    }

    @AbstractC90264r
    public void onDislikeAwemeEvent(C49678f fVar) {
        HomePageDataViewModel homePageDataViewModel;
        if (fVar.f114342b == 1 && (homePageDataViewModel = this.f134346D) != null) {
            homePageDataViewModel.mo89325a().postValue(true);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onResumeSwipeAfterLoginEvent(C49667ab abVar) {
        if (abVar != null && this.f134366c != null && C59086g.m108564b()) {
            boolean a = C59086g.m108563a();
            this.f134366c.f122369a = a;
            if (a && !C59086g.m108565c()) {
                C59086g.m108566d();
            }
        }
    }

    /* renamed from: a */
    private void m108459a(boolean z) {
        Fragment a = this.f134383y.mo89711a();
        if (a instanceof AbstractC48019aa) {
            AbstractC49815a b = ((AbstractC48019aa) a).mo80042b();
            if (b instanceof AbstractC50085av) {
                AbstractC50085av avVar = (AbstractC50085av) b;
                if (z) {
                    avVar.mo70515t();
                } else {
                    avVar.mo70428v();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: b */
    public final void mo89964b(int i) {
        MainActivity mainActivity;
        if ((getActivity() instanceof MainActivity) && (mainActivity = (MainActivity) getActivity()) != null && !mainActivity.isDestroyed()) {
            if (i != this.f134347E) {
                C59101a.m108579b(getActivity());
            } else {
                C59101a.m108577a(getActivity());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f134349G = new C22767d();
        this.f134360R = ProtectionServiceImpl.m81109l().mo68714k();
        this.f134361S = new C22768e();
        EventBus.m156966a(EventBus.m156962a(), this.f134362T);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onTimeLineTabEvent(C59091c cVar) {
        if (af_()) {
            this.f134383y.f122349d = SharePrefCache.inst().getShowTimeLineTab().mo59941c().booleanValue();
            this.f134383y.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: a */
    public final boolean mo89962a(String str) {
        String str2;
        if (C31575b.m65865g().isLogin()) {
            return false;
        }
        if (this.f134383y.mo89712b(this.f134366c.getCurrentItemCompat()) == 0) {
            str2 = "homepage_hot";
        } else {
            str2 = "";
        }
        C58957c.m108324a(this, str2, str, (Bundle) null, new AbstractC34543f() {
            /* class com.p2082ss.android.ugc.aweme.main.C59014ae.C590173 */

            static {
                Covode.recordClassIndex(69362);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
                C59014ae.this.f134345C = null;
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                boolean z;
                AbstractC50477z zVar;
                if (C59014ae.this.f134366c != null && C59014ae.this.af_()) {
                    int b = C59014ae.this.f134383y.mo89712b(C59014ae.this.f134366c.getCurrentItemCompat());
                    C59014ae aeVar = C59014ae.this;
                    if (b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aeVar.f134384z = z;
                    if (C59014ae.this.f134384z && (zVar = (AbstractC50477z) C59014ae.this.f134383y.mo89711a()) != null) {
                        zVar.mo85159d(false);
                    }
                    int c = C59014ae.this.f134383y.mo89713c(1);
                    Bundle bundle = new Bundle();
                    bundle.putString(C34792be.f82123b, C34792be.f82126e);
                    Hox.C15490a.m28529a(C59014ae.this.getActivity()).mo25210b("HOME", c, bundle);
                }
                C59014ae.this.f134345C = null;
            }
        });
        return true;
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        C53305b bVar;
        AbstractC50477z zVar;
        String string = bundle.getString(C34792be.f82123b, "");
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d("HOME");
        String d2 = Hox.C15490a.m28529a(getActivity()).mo25216d(d);
        if (string.equals(C34792be.f82125d) || bundle.getBoolean(d)) {
            AVExternalServiceImpl.m113114a().publishService().uploadRecoverPopViewSetVisibility(false);
            ((MainAnimViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(MainAnimViewModel.class)).f134238e.setValue(false);
        } else if (!((!string.equals(C34792be.f82124c) && !bundle.getBoolean(d2)) || (bVar = this.f134383y) == null || (zVar = (AbstractC50477z) bVar.mo89711a()) == null)) {
            zVar.mo85720w();
        }
        this.f134377r.mo37103a(false);
    }

    /* renamed from: d */
    public final void mo96546d(int i) {
        int i2;
        AbstractC50477z zVar;
        if (this.f134366c != null && this.f134383y != null) {
            if (C39223a.m79601o().mo68703a() && i == 0 && mo96548m()) {
                i = this.f134366c.getCurrentItemCompat();
            }
            if (i == 0) {
                i2 = 1;
            } else if (i == 1) {
                i2 = 0;
            } else {
                return;
            }
            if (this.f134383y.mo89712b(this.f134366c.getCurrentItemCompat()) != i2) {
                C53305b bVar = this.f134383y;
                if (!(bVar == null || (zVar = (AbstractC50477z) bVar.mo89711a()) == null)) {
                    zVar.mo85159d(true);
                }
                int c = this.f134383y.mo89713c(i2);
                Bundle bundle = new Bundle();
                bundle.putString(C34792be.f82123b, C34792be.f82126e);
                Hox.C15490a.m28529a(getActivity()).mo25210b("HOME", c, bundle);
            }
        }
    }

    @AbstractC90264r
    public void onLiveCleanEvent(C48020ab abVar) {
        float f;
        if (this.f134359Q == null) {
            this.f134359Q = new View[]{this.f134369j, this.f134365b, this.f134370k, this.f134381v, this.f134380u};
        }
        if (!abVar.f111243a) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (!abVar.f111243a) {
            m108458a(new C59030ap(f), this.f134359Q);
            if (f == 1.0f) {
                HomePageUIFrameServiceImpl.m108627e().setTitleTabVisibility(true);
                return;
            }
            return;
        }
        m108458a(new C59022ah(f), this.f134359Q);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onNotificationIndicatorEvent(C61561m mVar) {
        FollowTab followTab;
        if (af_()) {
            if ((mVar.mo99296b(38) || mVar.mo99296b(39) || mVar.mo99296b(40) || mVar.mo99296b(41)) && this.f134367d.mo89973b() && (followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(getActivity()).mo89735a("Following")) != null) {
                followTab.mo85042k();
            }
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        String string = bundle.getString(C34792be.f82123b, "");
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d("HOME");
        String d2 = Hox.C15490a.m28529a(getActivity()).mo25216d(d);
        if (string.equals(C34792be.f82125d) || bundle.getBoolean(d)) {
            m108460t();
            ((MainAnimViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(MainAnimViewModel.class)).f134238e.setValue(true);
            if (bundle.getInt(C34792be.f82129h, -1) == 1) {
                AVExternalServiceImpl.m113114a().publishService().uploadRecoverPopViewSetVisibility(true);
            }
        } else if (string.equals(C34792be.f82124c) || bundle.getBoolean(d2)) {
            m108460t();
            ((MainAnimViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(MainAnimViewModel.class)).f134238e.setValue(true);
        }
        this.f134377r.mo37103a(true);
    }

    /* renamed from: a */
    private static String m108457a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.ae$a */
    static class C59018a {

        /* renamed from: a */
        ITpcConsentService f134388a;

        /* renamed from: b */
        boolean f134389b;

        /* renamed from: c */
        WeakReference<Activity> f134390c;

        static {
            Covode.recordClassIndex(69363);
        }

        public C59018a(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f134388a = iTpcConsentService;
            this.f134389b = iTpcConsentService.mo68637a((AbstractC39273a) null);
            this.f134390c = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    private static <T extends View> void m108458a(AbstractC0688a<T> aVar, T[] tArr) {
        for (T t : tArr) {
            try {
                aVar.mo2720a(t);
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: a */
    public final boolean mo89963a(boolean z, String str) {
        AbstractC50477z zVar;
        C53305b bVar = this.f134383y;
        if (bVar == null || this.f134366c == null || (zVar = (AbstractC50477z) bVar.mo89711a()) == null) {
            return false;
        }
        int b = this.f134383y.mo89712b(this.f134366c.getCurrentItemCompat());
        if (b == 0) {
            C29823c.m60080a(getContext(), str, "homepage_hot");
        } else if (b == 1) {
            FollowTab followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(getActivity()).mo89735a("Following");
            if (followTab != null) {
                followTab.mo85039a(true);
            }
            C29823c.m60080a(getContext(), str, "homepage_follow");
        }
        return zVar.mo85156a(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0759, code lost:
        if (r1 != false) goto L_0x02f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0343  */
    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 1896
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.C59014ae.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        C58945a.C58947b.f134185a.mo96425a("cold_boot_main_fragment_create_view", false);
        C89219l.m154721d(this, "");
        C89219l.m154721d(layoutInflater, "");
        if (C67261e.m119185c()) {
            a = C1870c.m6045a((Activity) getActivity(), (int) R.layout.a3k);
            C89219l.m154716b(a, "");
        } else {
            a = C1870c.m6045a((Activity) getActivity(), (int) R.layout.a3j);
            C89219l.m154716b(a, "");
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_main_fragment_create_view", false);
        return a;
    }
}
