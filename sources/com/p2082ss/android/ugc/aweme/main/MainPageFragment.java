package com.p2082ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17238d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainpagefragment.C22810a;
import com.bytedance.tiktok.homepage.mainpagefragment.C22813d;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22822a;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22825c;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22831d;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22832e;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.AbstractC22854a;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.C22855b;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.C22858c;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NotificationCountViewManager;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.security.C32940d;
import com.p2082ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.api.C33539h;
import com.p2082ss.android.ugc.aweme.api.IZeroRatingService;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39227a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f;
import com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.p2082ss.android.ugc.aweme.discover.tooltip.C42536d;
import com.p2082ss.android.ugc.aweme.feed.C48020ab;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49688p;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49692t;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49698y;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50083at;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50308a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.p2971a.C50035a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBarMaskView;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50445e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50447g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.p3013c.C51480a;
import com.p2082ss.android.ugc.aweme.friends.p3013c.C51483d;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51526g;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.homepage.C52957b;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.MainBottomTabView;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.homepage.story.container.C53048f;
import com.p2082ss.android.ugc.aweme.homepage.story.container.C53055h;
import com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer;
import com.p2082ss.android.ugc.aweme.homepage.story.container.StoryContainer$attachHost$1;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.legoImp.task.HwWallpaperMobEventTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59044b;
import com.p2082ss.android.ugc.aweme.main.p3435h.C59101a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.C59247l;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61515c;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61562n;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62230g;
import com.p2082ss.android.ugc.aweme.notification.view.C62295f;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33923b;
import com.p2082ss.android.ugc.aweme.p2481cm.C36141a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.p3073a.p3074a.p3075a.p3077b.C53609a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79655e;
import com.p2082ss.android.ugc.aweme.port.AbstractC63145a;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63502h;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b;
import com.p2082ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.share.C68955h;
import com.p2082ss.android.ugc.aweme.share.model.C69332d;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment */
public final class MainPageFragment extends C34685e implements AbstractC15497d, FragmentTabHost.AbstractC18281b, AbstractC22854a, AbstractC34687g, AbstractC56223a, AbstractC90252i, AbstractC90253j {

    /* renamed from: F */
    public static final C58983a f134240F = new C58983a((byte) 0);

    /* renamed from: A */
    public C22858c f134241A;

    /* renamed from: B */
    public AbstractC23317a f134242B;

    /* renamed from: C */
    public C22810a f134243C;

    /* renamed from: D */
    public C50445e f134244D;

    /* renamed from: E */
    public final String f134245E = "page_feed";

    /* renamed from: G */
    private AbstractC39235f f134246G;

    /* renamed from: H */
    private View f134247H;

    /* renamed from: I */
    private HomePageDataViewModel f134248I;

    /* renamed from: J */
    private AdHomePageDataVM f134249J;

    /* renamed from: K */
    private C69488a f134250K;

    /* renamed from: L */
    private final C52957b f134251L = new C52957b();

    /* renamed from: M */
    private boolean f134252M;

    /* renamed from: N */
    private C22813d f134253N;

    /* renamed from: O */
    private SocialRecFriendsConditionViewModel f134254O;

    /* renamed from: P */
    private HandlerC58984b f134255P = new HandlerC58984b();

    /* renamed from: Q */
    private final AbstractC1214u<C18017a> f134256Q = new C59000r(this);

    /* renamed from: R */
    private SparseArray f134257R;

    /* renamed from: a */
    public View[] f134258a = new View[0];

    /* renamed from: b */
    public View f134259b;

    /* renamed from: c */
    public MainBottomTabView f134260c;

    /* renamed from: d */
    public ViewStub f134261d;

    /* renamed from: e */
    public View f134262e;

    /* renamed from: j */
    public TabChangeManager f134263j;

    /* renamed from: k */
    public FrameLayout f134264k;

    /* renamed from: l */
    public MainPageDataViewModel f134265l;

    /* renamed from: m */
    public ScrollSwitchStateManager f134266m;

    /* renamed from: n */
    public DataCenter f134267n;

    /* renamed from: o */
    public boolean f134268o;

    /* renamed from: p */
    public View f134269p;

    /* renamed from: q */
    MainAnimViewModel f134270q;

    /* renamed from: r */
    public boolean f134271r;

    /* renamed from: s */
    public C22822a f134272s = new C22822a();

    /* renamed from: t */
    public C22825c f134273t;

    /* renamed from: u */
    public FissionPopupWindowHelp f134274u;

    /* renamed from: v */
    public SafeInfoNoticePopupWindowHelp f134275v;

    /* renamed from: w */
    public C22831d f134276w;

    /* renamed from: y */
    public C22832e f134277y;

    /* renamed from: z */
    public C53609a f134278z;

    static {
        Covode.recordClassIndex(69318);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: a */
    public final View mo61343a(int i) {
        if (this.f134257R == null) {
            this.f134257R = new SparseArray();
        }
        View view = (View) this.f134257R.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f134257R.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: e */
    public final void mo61344e() {
        SparseArray sparseArray = this.f134257R;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(269, new RunnableC90250g(MainPageFragment.class, "onShoutoutsOptOut", C63502h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(223, new RunnableC90250g(MainPageFragment.class, "onComplianceDialogCheckEvent", C39227a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(270, new RunnableC90250g(MainPageFragment.class, "onLiveCleanEvent", C48020ab.class, ThreadMode.POSTING, 0, false));
        hashMap.put(271, new RunnableC90250g(MainPageFragment.class, "onMaintabVisibleChange", C49692t.class, ThreadMode.POSTING, 0, false));
        hashMap.put(272, new RunnableC90250g(MainPageFragment.class, "onRefreshEndEvent", C49698y.class, ThreadMode.POSTING, 0, false));
        hashMap.put(273, new RunnableC90250g(MainPageFragment.class, "onPermissionPopupEvent", C51480a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(274, new RunnableC90250g(MainPageFragment.class, "onShowSocialRecFriendsDialogEvent", C51483d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(21, new RunnableC90250g(MainPageFragment.class, "onMobEnterFromEvent", C49688p.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$DownloadFestivalTask */
    final class DownloadFestivalTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(69319);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BOOT_FINISH;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DownloadFestivalTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            C89219l.m154721d(context, "");
            C22810a aVar = MainPageFragment.this.f134243C;
            if (aVar != null) {
                aVar.mo37118a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$InitBubbleGuideTask */
    final class InitBubbleGuideTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(69320);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BOOT_FINISH;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$InitBubbleGuideTask$a */
        static final class RunnableC58982a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InitBubbleGuideTask f134281a;

            static {
                Covode.recordClassIndex(69321);
            }

            RunnableC58982a(InitBubbleGuideTask initBubbleGuideTask) {
                this.f134281a = initBubbleGuideTask;
            }

            public final void run() {
                boolean z;
                MainPageFragment mainPageFragment = MainPageFragment.this;
                mainPageFragment.mo96510n();
                C22822a aVar = mainPageFragment.f134272s;
                ViewStub viewStub = mainPageFragment.f134261d;
                if (viewStub == null) {
                    C89219l.m154715b();
                }
                boolean z2 = mainPageFragment.f134268o;
                AbstractC23317a aVar2 = mainPageFragment.f134242B;
                ActivityC0945e activity = mainPageFragment.getActivity();
                boolean z3 = C50308a.f116164g;
                C89219l.m154721d(viewStub, "");
                AbstractC63145a<Boolean> bubbleGuideShown = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().bubbleGuideShown();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    User curUser = g2.getCurUser();
                    C89219l.m154716b(curUser, "");
                    if (curUser.isShowImageBubble() && !bubbleGuideShown.get().booleanValue()) {
                        aVar.f53891a = new C59044b(viewStub);
                        if (z2) {
                            aVar.f53892b = true;
                        } else {
                            aVar.mo37141a();
                        }
                        bubbleGuideShown.set(true);
                        return;
                    }
                }
                if (!z2) {
                    aVar.f53895e = z3;
                    if (aVar2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (activity != null) {
                        aVar.f53894d = HomePageDataViewModel.C52942a.m97777a(activity);
                        AwemeChangeCallBack.m108594a(activity, activity, new C22822a.C22823a(Keva.getRepo("repo_story_cold_start"), aVar, activity, z, aVar2));
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public InitBubbleGuideTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            C89219l.m154721d(context, "");
            C29339a.m58754b(new RunnableC58982a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$a */
    public static final class C58983a {
        static {
            Covode.recordClassIndex(69322);
        }

        private C58983a() {
        }

        public /* synthetic */ C58983a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.AbstractC22854a
    /* renamed from: c */
    public final void mo37168c() {
        C22825c cVar = this.f134273t;
        if (cVar != null) {
            cVar.f53914n = false;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C17233a.f41165a = false;
    }

    /* renamed from: o */
    private Fragment m108383o() {
        TabChangeManager tabChangeManager = this.f134263j;
        if (tabChangeManager == null) {
            return null;
        }
        return tabChangeManager.mo96536b();
    }

    /* renamed from: p */
    private String m108384p() {
        C22831d dVar = this.f134276w;
        if (dVar == null) {
            C89219l.m154715b();
        }
        return dVar.f53924b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: k */
    public final void mo93048k() {
        C22825c cVar = this.f134273t;
        if (cVar == null) {
            C89219l.m154715b();
        }
        cVar.mo37147a();
    }

    /* renamed from: m */
    public final Aweme mo96509m() {
        HomePageDataViewModel homePageDataViewModel = this.f134248I;
        if (homePageDataViewModel == null) {
            C89219l.m154715b();
        }
        return homePageDataViewModel.f121745k;
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.AbstractC22854a
    /* renamed from: b */
    public final void mo37167b() {
        C22825c cVar = this.f134273t;
        if (cVar != null) {
            if (cVar.f53910j) {
                C22825c cVar2 = this.f134273t;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                cVar2.mo37147a();
            }
            C22825c cVar3 = this.f134273t;
            if (cVar3 == null) {
                C89219l.m154715b();
            }
            cVar3.f53914n = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: h */
    public final boolean mo93045h() {
        C22825c cVar = this.f134273t;
        if (cVar == null) {
            C89219l.m154715b();
        }
        if (cVar.f53910j) {
            return false;
        }
        TabChangeManager tabChangeManager = this.f134263j;
        if (tabChangeManager == null) {
            C89219l.m154715b();
        }
        if (!TextUtils.equals("USER", tabChangeManager.f134312d)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: i */
    public final boolean mo93046i() {
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            return true;
        }
        if (!(activity instanceof MainActivity) || !((MainActivity) activity).isDestroyed()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$c */
    static final class CallableC58985c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134282a;

        /* renamed from: b */
        final /* synthetic */ boolean f134283b;

        /* renamed from: c */
        final /* synthetic */ String f134284c;

        static {
            Covode.recordClassIndex(69324);
        }

        CallableC58985c(MainPageFragment mainPageFragment, boolean z, String str) {
            this.f134282a = mainPageFragment;
            this.f134283b = z;
            this.f134284c = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            if (this.f134283b) {
                str = "enter_homepage_hot";
            } else {
                str = "enter_homepage_follow";
            }
            C59247l lVar = new C59247l(str);
            lVar.f135247a = "publish";
            C59247l a = lVar.mo96816a("publish");
            a.f135248b = this.f134284c;
            if (this.f134282a.mo96509m() != null) {
                a.mo96817f(this.f134282a.mo96509m());
            }
            a.mo96792f();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$l */
    public static final class C58994l implements C69488a.AbstractC69490b {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134293a;

        static {
            Covode.recordClassIndex(69333);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: a */
        public final void mo87085a() {
            if (this.f134293a.f134260c != null) {
                MainBottomTabView mainBottomTabView = this.f134293a.f134260c;
                if (mainBottomTabView == null) {
                    C89219l.m154715b();
                }
                mainBottomTabView.setAlpha(0.5f);
            }
            if (this.f134293a.f134266m != null) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.f134293a.f134266m;
                if (scrollSwitchStateManager == null) {
                    C89219l.m154715b();
                }
                scrollSwitchStateManager.mo89345a(false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
        /* renamed from: b */
        public final void mo87086b() {
            if (this.f134293a.f134260c != null) {
                MainBottomTabView mainBottomTabView = this.f134293a.f134260c;
                if (mainBottomTabView == null) {
                    C89219l.m154715b();
                }
                mainBottomTabView.setAlpha(1.0f);
            }
            if (this.f134293a.f134266m != null) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.f134293a.f134266m;
                if (scrollSwitchStateManager == null) {
                    C89219l.m154715b();
                }
                scrollSwitchStateManager.mo89345a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58994l(MainPageFragment mainPageFragment) {
            this.f134293a = mainPageFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$p */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC58998p implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134298a;

        static {
            Covode.recordClassIndex(69337);
        }

        public final void onGlobalLayout() {
            View view = this.f134298a.f134262e;
            if (view == null) {
                C89219l.m154715b();
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f134298a.f134271r = true;
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f134298a.f134274u;
            if (fissionPopupWindowHelp == null) {
                C89219l.m154715b();
            }
            fissionPopupWindowHelp.f53871k = this.f134298a.f134271r;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC58998p(MainPageFragment mainPageFragment) {
            this.f134298a = mainPageFragment;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: f */
    public final void mo93043f() {
        TabChangeManager tabChangeManager = this.f134263j;
        if (tabChangeManager == null) {
            C89219l.m154715b();
        }
        Fragment b = tabChangeManager.mo96536b();
        if (b != null && (b instanceof C59014ae)) {
            AbstractC50477z s = ((C59014ae) b).mo96547l();
            if (s instanceof C50041af) {
                C50041af afVar = (C50041af) s;
                if (afVar.f115519n != null) {
                    afVar.f115519n.mo84716aX();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: g */
    public final String mo93044g() {
        MainActivity mainActivity;
        String enterFrom;
        if (MSAdaptionService.m97895c().mo89377c(getContext())) {
            enterFrom = "homepage_hot";
        } else if (!(getActivity() instanceof MainActivity) || (mainActivity = (MainActivity) getActivity()) == null || (enterFrom = mainActivity.getEnterFrom()) == null) {
            return "";
        }
        return enterFrom;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: j */
    public final String mo93047j() {
        AbstractC50477z s;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f134266m;
        if (scrollSwitchStateManager == null) {
            C89219l.m154715b();
        }
        Fragment b = scrollSwitchStateManager.mo89347b();
        if (b == null || !(b instanceof C59014ae) || (s = ((C59014ae) b).mo96547l()) == null) {
            return null;
        }
        if (s instanceof C50403p) {
            return "homepage_follow";
        }
        if (s instanceof C50041af) {
            return "homepage_hot";
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$q */
    static final class RunnableC58999q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134299a;

        /* renamed from: b */
        final /* synthetic */ String f134300b;

        static {
            Covode.recordClassIndex(69338);
        }

        RunnableC58999q(MainPageFragment mainPageFragment, String str) {
            this.f134299a = mainPageFragment;
            this.f134300b = str;
        }

        public final void run() {
            MainBottomTabView mainBottomTabView = this.f134299a.f134260c;
            if (mainBottomTabView == null) {
                C89219l.m154715b();
            }
            String str = this.f134300b;
            if (str == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(str, "");
            C58945a.C58947b.f134185a.f134176c = false;
            C58945a.C58947b.f134185a.f134180g = false;
            Activity a = C34729o.m70950a(mainBottomTabView.getContext());
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) a).mo89358e(str);
            C53318b bVar = (C53318b) mainBottomTabView.get().mo89735a("PUBLISH");
            if (bVar != null) {
                bVar.mo89775j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$s */
    static final class RunnableC59001s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134302a;

        static {
            Covode.recordClassIndex(69340);
        }

        RunnableC59001s(MainPageFragment mainPageFragment) {
            this.f134302a = mainPageFragment;
        }

        public final void run() {
            C1213t<Boolean> tVar;
            MainPageFragment mainPageFragment = this.f134302a;
            ActivityC0945e activity = mainPageFragment.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (Hox.C15490a.m28529a(activity).mo25213b("HOME")) {
                Bundle bundle = new Bundle();
                bundle.putString(C34792be.f82123b, C34792be.f82125d);
                ActivityC0945e activity2 = mainPageFragment.getActivity();
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity2, "");
                Hox.C15490a.m28529a(activity2).mo25208a("HOME", bundle);
                MainAnimViewModel mainAnimViewModel = mainPageFragment.f134270q;
                if (!(mainAnimViewModel == null || (tVar = mainAnimViewModel.f134238e) == null)) {
                    tVar.setValue(false);
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(C34792be.f82123b, C34792be.f82125d);
            ActivityC0945e activity3 = this.f134302a.getActivity();
            if (activity3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity3, "");
            Hox.C15490a.m28529a(activity3).mo25211b("DISCOVER", bundle2);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainpagefragment.notification.AbstractC22854a
    /* renamed from: a */
    public final void mo37166a() {
        C22825c cVar = this.f134273t;
        if (cVar != null) {
            if (cVar.f53901a == null && cVar.f53915o) {
                cVar.mo37150d();
            }
            try {
                AbstractC18234b bVar = cVar.f53904d;
                if (bVar == null) {
                    C89219l.m154710a("mFragment");
                }
                if (bVar.af_()) {
                    ScrollSwitchStateManager scrollSwitchStateManager = cVar.f53907g;
                    if (scrollSwitchStateManager == null) {
                        C89219l.m154710a("mStateManager");
                    }
                    if (!scrollSwitchStateManager.mo89350b("page_profile") && cVar.f53915o) {
                        cVar.mo37149c();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: d */
    public final void mo93042d() {
        AbstractC50477z zVar;
        Fragment o = m108383o();
        AbstractC48149ai aiVar = null;
        if (o instanceof C59014ae) {
            zVar = ((C59014ae) o).mo96547l();
        } else {
            zVar = null;
        }
        if (zVar instanceof AbstractC50083at) {
            aiVar = ((AbstractC50083at) zVar).mo85172p();
        }
        Fragment o2 = m108383o();
        if (o2 instanceof C59014ae) {
            AbstractC50477z s = ((C59014ae) o2).mo96547l();
            C89219l.m154716b(s, "");
            if ((s instanceof C50041af) && aiVar != null && aiVar.mo80231v() != null) {
                aiVar.mo80231v().mo80186ab();
            }
        }
    }

    /* renamed from: l */
    public final void mo96508l() {
        C1213t<Boolean> tVar;
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        if (Hox.C15490a.m28529a(activity).mo25213b("HOME")) {
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82125d);
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            Hox.C15490a.m28529a(activity2).mo25208a("HOME", bundle);
            MainAnimViewModel mainAnimViewModel = this.f134270q;
            if (mainAnimViewModel != null && (tVar = mainAnimViewModel.f134238e) != null) {
                tVar.setValue(true);
            }
        }
    }

    /* renamed from: n */
    public final void mo96510n() {
        MainBottomTabView mainBottomTabView;
        if (!this.f134252M) {
            this.f134252M = true;
            Keva repo = Keva.getRepo("repo_story_cold_start");
            if (repo.getInt("key_setting", 0) == 5 && repo.getBoolean("key_new_version", false) && repo.getLong("key_tutorial_last_time", 0) == 0 && (mainBottomTabView = this.f134260c) != null && getContext() != null) {
                Context context = mainBottomTabView.getContext();
                C89219l.m154716b(context, "");
                this.f134242B = ((C23329a) new C23329a(context).mo38041b(mainBottomTabView).mo38034a(EnumC23352h.TOP).mo38039b((int) C13628n.m24520b(mainBottomTabView.getContext(), 10.0f))).mo38023e(R.string.g57).mo38012d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Runnable runnable;
        Handler handler;
        super.onDestroyView();
        C50445e eVar = this.f134244D;
        if (eVar != null) {
            eVar.mo85689b();
        }
        this.f134272s.mo37142b();
        C22825c cVar = this.f134273t;
        if (cVar == null) {
            C89219l.m154715b();
        }
        EventBus.m156962a().mo145395b(cVar);
        if (cVar.f53901a != null) {
            C62295f fVar = cVar.f53901a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            if (fVar.isShowing()) {
                C62295f fVar2 = cVar.f53901a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                fVar2.mo100288a();
            }
        }
        SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp = this.f134275v;
        if (safeInfoNoticePopupWindowHelp == null) {
            C89219l.m154715b();
        }
        EventBus.m156962a().mo145395b(safeInfoNoticePopupWindowHelp);
        if (safeInfoNoticePopupWindowHelp.f53883a != null) {
            C32940d dVar = safeInfoNoticePopupWindowHelp.f53883a;
            if (dVar == null) {
                C89219l.m154715b();
            }
            try {
                dVar.dismiss();
            } catch (Exception unused) {
            }
            safeInfoNoticePopupWindowHelp.f53883a = null;
        }
        C22858c cVar2 = this.f134241A;
        if (cVar2 == null) {
            C89219l.m154715b();
        }
        EventBus.m156962a().mo145395b(cVar2);
        if (cVar2.f53984e != null) {
            C31575b.m65859a();
            IAccountService iAccountService = C31575b.f75524a;
            IAccountService.AbstractC31272b bVar = cVar2.f53984e;
            if (bVar == null) {
                C89219l.m154715b();
            }
            iAccountService.mo57066b(bVar);
        }
        if (!(cVar2.f53985f == null || (runnable = cVar2.f53987h) == null || (handler = cVar2.f53985f) == null)) {
            handler.removeCallbacks(runnable);
        }
        FissionPopupWindowHelp fissionPopupWindowHelp = this.f134274u;
        if (fissionPopupWindowHelp == null) {
            C89219l.m154715b();
        }
        EventBus.m156962a().mo145395b(fissionPopupWindowHelp);
        C53609a aVar = this.f134278z;
        if (aVar != null) {
            EventBus.m156962a().mo145395b(aVar);
        }
        C22831d dVar2 = this.f134276w;
        if (dVar2 == null) {
            C89219l.m154715b();
        }
        EventBus.m156962a().mo145395b(dVar2);
        C22832e eVar2 = this.f134277y;
        if (eVar2 == null) {
            C89219l.m154715b();
        }
        eVar2.f53931b.mo142944a();
        C22813d dVar3 = this.f134253N;
        if (dVar3 == null) {
            C89219l.m154715b();
        }
        EventBus.m156962a().mo145395b(dVar3);
        C22810a aVar2 = this.f134243C;
        if (aVar2 != null) {
            EventBus.m156962a().mo145395b(aVar2);
        }
        C33923b a = C33923b.m69462a();
        if (a.f80235c != null) {
            a.f80235c = null;
        }
        NotificationCountViewManager.f53973a = null;
        mo61344e();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean b;
        boolean z;
        Fragment b2;
        boolean a;
        AbstractC53316a aVar;
        AbstractC59040ay ayVar;
        super.onResume();
        C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_fragment_onresume", false);
        if (m108383o() != null) {
            Fragment o = m108383o();
            if (o == null) {
                C89219l.m154715b();
            }
            C17233a.f41165a = TextUtils.equals(o.getTag(), "HOME");
        }
        C22858c cVar = this.f134241A;
        if (cVar == null) {
            C89219l.m154715b();
        }
        if (cVar.f53989j) {
            b = C22855b.m43079a();
        } else {
            b = C68432f.f153189a.mo108865b();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Boolean> enableProfileActivityLink = inst.getEnableProfileActivityLink();
        C89219l.m154716b(enableProfileActivityLink, "");
        Boolean c = enableProfileActivityLink.mo59941c();
        C89219l.m154716b(c, "");
        if (!c.booleanValue() || ((ayVar = (AbstractC59040ay) C34506c.m70491a(cVar.f53981b.getContext(), AbstractC59040ay.class)) != null && TextUtils.equals(ayVar.mo60970a(""), "true"))) {
            z = false;
        } else {
            z = true;
        }
        if (!b && !z) {
            cVar.mo37176f();
        } else if (cVar.f53981b.af_() && (aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(cVar.f53980a).mo89739b("USER")) != null) {
            aVar.mo89752a(false, 0);
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            if (cVar.f53989j) {
                a = C22855b.m43080b();
            } else {
                a = C62230g.m112530a();
            }
            if (!a || !cVar.f53988i) {
                cVar.mo37175e();
            } else {
                cVar.mo37177g();
            }
        }
        cVar.f53989j = false;
        TabChangeManager tabChangeManager = this.f134263j;
        if (tabChangeManager == null) {
            C89219l.m154715b();
        }
        if ((!C89219l.m154714a((Object) "HOME", (Object) tabChangeManager.f134312d)) && C59101a.m108578a()) {
            C59101a.m108579b(getActivity());
        }
        C22813d dVar = this.f134253N;
        if (dVar == null) {
            C89219l.m154715b();
        }
        if (!TextUtils.isEmpty(dVar.f53860a)) {
            if (C51648a.f118980a.mo87333m()) {
                if (C51648a.f118980a.mo87325e()) {
                    C51526g.m95991b();
                    C22813d.m43035a();
                } else {
                    C51648a.f118980a.mo87308a(dVar.f53860a, true);
                }
            }
            dVar.f53860a = "";
        }
        TabChangeManager tabChangeManager2 = this.f134263j;
        if (!(tabChangeManager2 == null || (b2 = tabChangeManager2.mo96536b()) == null || !(b2 instanceof AbstractC2597b))) {
            C2592b.m7537a((AbstractC2597b) b2);
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_fragment_onresume", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$e */
    static final class C58987e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134286a;

        static {
            Covode.recordClassIndex(69326);
        }

        C58987e(MainPageFragment mainPageFragment) {
            this.f134286a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f134286a.mo96508l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$n */
    static final class C58996n<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ float f134295a;

        static {
            Covode.recordClassIndex(69335);
        }

        C58996n(float f) {
            this.f134295a = f;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            View view = (View) obj;
            C89219l.m154721d(view, "");
            view.setAlpha(this.f134295a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$f */
    static final class C58988f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134287a;

        static {
            Covode.recordClassIndex(69327);
        }

        C58988f(MainPageFragment mainPageFragment) {
            this.f134287a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C33942b bVar = (C33942b) obj;
            C89219l.m154721d(bVar, "");
            MainPageFragment mainPageFragment = this.f134287a;
            Object a = bVar.mo60212a();
            C89219l.m154716b(a, "");
            mainPageFragment.mo96507b(((Boolean) a).booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$k */
    static final class C58993k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134292a;

        static {
            Covode.recordClassIndex(69332);
        }

        C58993k(MainPageFragment mainPageFragment) {
            this.f134292a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C33942b bVar = (C33942b) obj;
            C89219l.m154721d(bVar, "");
            C50445e eVar = this.f134292a.f134244D;
            if (eVar != null) {
                Boolean bool = (Boolean) bVar.mo60212a();
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                eVar.mo85690b(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$m */
    static final class C58995m<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ float f134294a;

        static {
            Covode.recordClassIndex(69334);
        }

        C58995m(float f) {
            this.f134294a = f;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            View view = (View) obj;
            C89219l.m154721d(view, "");
            C17238d.m31812a(view, view.getAlpha(), this.f134294a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$o */
    static final class C58997o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134296a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f134297b;

        static {
            Covode.recordClassIndex(69336);
        }

        C58997o(MainPageFragment mainPageFragment, ActivityC0945e eVar) {
            this.f134296a = mainPageFragment;
            this.f134297b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC35329by a;
            String str = (String) obj;
            if (str != null && !this.f134296a.mo96506a(str) && (a = HomeTabViewModel.C53309a.m98315a(this.f134297b).mo89735a(str)) != null) {
                a.mo57292h();
            }
        }
    }

    @AbstractC90264r
    public final void onMobEnterFromEvent(C49688p pVar) {
        C89219l.m154721d(pVar, "");
        MainPageDataViewModel mainPageDataViewModel = this.f134265l;
        if (mainPageDataViewModel == null) {
            C89219l.m154715b();
        }
        String str = pVar.f114354a;
        C89219l.m154716b(str, "");
        C89219l.m154721d(str, "");
        mainPageDataViewModel.f121754b = str;
    }

    @AbstractC90264r
    public final void onShoutoutsOptOut(C63502h hVar) {
        C89219l.m154721d(hVar, "");
        Context context = getContext();
        if (context != null) {
            Intent mainActivityIntent = MainActivity.getMainActivityIntent(getContext());
            mainActivityIntent.putExtra("extra.from.shoutouts.opt.out", true);
            C84349a.m145093a(mainActivityIntent, context);
            context.startActivity(mainActivityIntent);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onShowSocialRecFriendsDialogEvent(C51483d dVar) {
        C89219l.m154721d(dVar, "");
        C22832e eVar = this.f134277y;
        if (eVar == null) {
            C89219l.m154715b();
        }
        int i = dVar.f118668a;
        C89378p<Boolean, Boolean> pVar = dVar.f118669b;
        C89219l.m154721d(pVar, "");
        eVar.mo37160a(i, pVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$i */
    static final class C58991i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134290a;

        static {
            Covode.recordClassIndex(69330);
        }

        C58991i(MainPageFragment mainPageFragment) {
            this.f134290a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C33942b bVar = (C33942b) obj;
            C89219l.m154721d(bVar, "");
            MainPageFragment mainPageFragment = this.f134290a;
            String str = (String) bVar.mo60212a();
            if (str != null) {
                MainBottomTabView mainBottomTabView = mainPageFragment.f134260c;
                if (mainBottomTabView == null) {
                    C89219l.m154715b();
                }
                mainBottomTabView.post(new RunnableC58999q(mainPageFragment, str));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$j */
    static final class C58992j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134291a;

        static {
            Covode.recordClassIndex(69331);
        }

        C58992j(MainPageFragment mainPageFragment) {
            this.f134291a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C33942b bVar = (C33942b) obj;
            C89219l.m154721d(bVar, "");
            MainBottomTabView mainBottomTabView = this.f134291a.f134260c;
            if (mainBottomTabView != null) {
                AbstractC53316a aVar = (AbstractC53316a) mainBottomTabView.get().mo89739b((String) bVar.mo60212a());
                if (aVar != null) {
                    aVar.performClick();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo96507b(boolean z) {
        int i;
        Resources resources;
        String.valueOf(z);
        if (!z) {
            i = R.color.lr;
        } else {
            i = R.color.b2;
        }
        Context context = getContext();
        if (!(context == null || (resources = context.getResources()) == null)) {
            int color = resources.getColor(i);
            View view = this.f134259b;
            if (view != null) {
                view.setBackgroundColor(color);
            }
        }
        MainActivity mainActivity = (MainActivity) getActivity();
        if (mainActivity != null) {
            mainActivity.refreshSlideSwitchCanScrollRight();
        }
    }

    @AbstractC90264r
    public final void onComplianceDialogCheckEvent(C39227a aVar) {
        if (aVar != null) {
            if (aVar.f92670a) {
                C22831d dVar = this.f134276w;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                dVar.mo37157a();
            }
            C50308a.f116164g = true;
            AbstractC81915c.m141874a(new C50035a());
            C22822a aVar2 = this.f134272s;
            if (aVar2 != null) {
                aVar2.f53895e = true;
            }
        }
    }

    @AbstractC90264r
    public final void onMaintabVisibleChange(C49692t tVar) {
        C89219l.m154721d(tVar, "");
        int i = tVar.f114358a;
        MainBottomTabView mainBottomTabView = this.f134260c;
        if (mainBottomTabView == null) {
            C89219l.m154715b();
        }
        if (i != mainBottomTabView.getVisibility()) {
            View view = this.f134259b;
            if (view == null) {
                C89219l.m154715b();
            }
            view.setVisibility(i);
            MainBottomTabView mainBottomTabView2 = this.f134260c;
            if (mainBottomTabView2 == null) {
                C89219l.m154715b();
            }
            mainBottomTabView2.setVisibility(i);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onPermissionPopupEvent(C51480a aVar) {
        Context context;
        C89219l.m154721d(aVar, "");
        if (C89219l.m154714a((Object) aVar.f118667b, (Object) "publish") && (context = getContext()) != null) {
            C51648a aVar2 = C51648a.f118980a;
            String str = aVar.f118667b;
            C89219l.m154716b(context, "");
            aVar2.mo87304a(3, "homepage_follow", str, context);
        }
    }

    @AbstractC90264r
    public final void onRefreshEndEvent(C49698y yVar) {
        String str;
        C89219l.m154721d(yVar, "");
        if (af_()) {
            if (!TextUtils.isEmpty(yVar.f114373a)) {
                str = yVar.f114373a;
            } else {
                str = "HOME";
            }
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            HomeTabViewModel a = HomeTabViewModel.C53309a.m98315a((ActivityC0945e) context);
            if (str == null) {
                C89219l.m154715b();
            }
            AbstractC53316a aVar = (AbstractC53316a) a.mo89739b(str);
            if (aVar != null && aVar.f122393a) {
                aVar.f122393a = false;
                aVar.mo89762i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$b */
    static final class HandlerC58984b extends Handler {
        static {
            Covode.recordClassIndex(69323);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 1) {
                removeMessages(1);
                if (!C17233a.f41165a) {
                    sendMessage(Message.obtain(message));
                } else if (C80422fe.m139428d(C17867d.m33078a())) {
                    IZeroRatingService f = ZeroRatingServiceImpl.m141669f();
                    C89219l.m154716b(f, "");
                    if (f.mo59645b() && C16048b.m29633a().mo25411a("enable_zero_rating_toast", ClientExpManager.enable_zero_rating_toast()) == 1) {
                        IZeroRatingService f2 = ZeroRatingServiceImpl.m141669f();
                        C89219l.m154716b(f2, "");
                        f2.mo59646c().mo59652a();
                        new C79459a(C17867d.m33078a()).mo123050a(R.string.c0_).mo123053a();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$d */
    static final class C58986d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134285a;

        static {
            Covode.recordClassIndex(69325);
        }

        C58986d(MainPageFragment mainPageFragment) {
            this.f134285a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C33942b bVar = (C33942b) obj;
            C89219l.m154721d(bVar, "");
            Boolean bool = (Boolean) bVar.mo60212a();
            if (this.f134285a.f134278z != null) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    C53609a aVar = this.f134285a.f134278z;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.f123030a.mo93043f();
                    aVar.f123030a.mo93041a(true);
                    return;
                }
                C53609a aVar2 = this.f134285a.f134278z;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                aVar2.f123030a.mo93041a(false);
            }
        }
    }

    @AbstractC90264r
    public final void onLiveCleanEvent(C48020ab abVar) {
        float f;
        C89219l.m154721d(abVar, "");
        if (this.f134258a == null) {
            this.f134258a = new View[]{this.f134262e, this.f134260c};
        }
        if (!abVar.f111243a) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (!abVar.f111243a) {
            m108382a(new C58995m(f), this.f134258a);
            if (f == 1.0f) {
                HomePageUIFrameServiceImpl.m108627e().setTitleTabVisibility(true);
                return;
            }
            return;
        }
        m108382a(new C58996n(f), this.f134258a);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$g */
    static final class C58989g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134288a;

        static {
            Covode.recordClassIndex(69328);
        }

        C58989g(MainPageFragment mainPageFragment) {
            this.f134288a = mainPageFragment;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.aweme.main.ae */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
            if ((r0 instanceof com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af) == false) goto L_0x0072;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054 A[Catch:{ ClassCastException -> 0x00a2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[Catch:{ ClassCastException -> 0x00a2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[Catch:{ ClassCastException -> 0x00a2 }] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.MainPageFragment.C58989g.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$r */
    static final class C59000r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134301a;

        static {
            Covode.recordClassIndex(69339);
        }

        C59000r(MainPageFragment mainPageFragment) {
            this.f134301a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            C18017a aVar = (C18017a) obj;
            MainPageFragment mainPageFragment = this.f134301a;
            if (aVar.f42891a != 4) {
                z = true;
            } else {
                z = false;
            }
            mainPageFragment.f134268o = z;
            C22822a aVar2 = this.f134301a.f134272s;
            if (this.f134301a.f134268o) {
                aVar2.mo37142b();
            } else if (aVar2.f53892b) {
                aVar2.f53892b = false;
                aVar2.mo37141a();
            }
            if (this.f134301a.f134268o) {
                C22825c cVar = this.f134301a.f134273t;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo37147a();
                AbstractC23317a aVar3 = this.f134301a.f134242B;
                if (aVar3 != null && aVar3.isShowing()) {
                    aVar3.dismiss();
                }
            }
            this.f134301a.mo96510n();
            C22825c cVar2 = this.f134301a.f134273t;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            cVar2.f53912l = this.f134301a.f134268o;
            C22825c cVar3 = this.f134301a.f134273t;
            if (cVar3 == null) {
                C89219l.m154715b();
            }
            if (this.f134301a.f134242B == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            cVar3.f53913m = !z2;
            C17975i.m33461a(aVar.f42891a, this.f134301a.f134259b, this.f134301a.f134260c);
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        C1213t<String> tVar;
        C89219l.m154721d(bundle, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        String d = Hox.C15490a.m28529a(activity).mo25216d(this.f134245E);
        if (C89219l.m154714a((Object) bundle.getString(C34792be.f82123b, ""), (Object) C34792be.f82124c) || bundle.getBoolean(d)) {
            TabAlphaController.m108430a().mo96525a(true);
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154716b(requireActivity, "");
            C63419ae aeVar = C63419ae.f143971a;
            ActivityC0945e requireActivity2 = requireActivity();
            C89219l.m154716b(requireActivity2, "");
            aeVar.preloadProfile(requireActivity2, this.f134245E);
            AbstractC81915c.m141874a(new C69332d(true));
            if (TextUtils.isEmpty(C36141a.C36142a.f85377d)) {
                C36141a.C36142a.f85374a = this.f134245E;
            }
            HomePageDataViewModel homePageDataViewModel = this.f134248I;
            if (homePageDataViewModel != null && !homePageDataViewModel.f121746l) {
                HomePageDataViewModel homePageDataViewModel2 = this.f134248I;
                Aweme aweme = null;
                if (!(homePageDataViewModel2 == null || homePageDataViewModel2.f121745k == null || !(requireActivity instanceof MainActivity))) {
                    MainActivity mainActivity = (MainActivity) requireActivity;
                    HomePageDataViewModel homePageDataViewModel3 = this.f134248I;
                    if (homePageDataViewModel3 != null) {
                        aweme = homePageDataViewModel3.f121745k;
                    }
                    mainActivity.flingBackToFeedChange(aweme, getContext());
                }
            }
            MainAnimViewModel mainAnimViewModel = this.f134270q;
            if (!(mainAnimViewModel == null || (tVar = mainAnimViewModel.f134237d) == null)) {
                tVar.setValue(this.f134245E);
            }
            C17233a.f41165a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$h */
    static final class C58990h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ MainPageFragment f134289a;

        static {
            Covode.recordClassIndex(69329);
        }

        C58990h(MainPageFragment mainPageFragment) {
            this.f134289a = mainPageFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C33942b bVar = (C33942b) obj;
            String str = "";
            C89219l.m154721d(bVar, str);
            MainPageFragment mainPageFragment = this.f134289a;
            Object a = bVar.mo60212a();
            C89219l.m154716b(a, str);
            Intent intent = (Intent) a;
            C89219l.m154721d(intent, str);
            try {
                if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(C34792be.f82123b, C34792be.f82125d);
                    ActivityC0945e activity = mainPageFragment.getActivity();
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, str);
                    Hox.C15490a.m28529a(activity).mo25211b("HOME", bundle);
                    mainPageFragment.mo96507b(false);
                    TabChangeManager tabChangeManager = mainPageFragment.f134263j;
                    if (tabChangeManager == null) {
                        C89219l.m154715b();
                    }
                    Fragment b = tabChangeManager.mo96536b();
                    if (b != null) {
                        C59014ae aeVar = (C59014ae) b;
                        if (aeVar != null) {
                            aeVar.mo96546d(1);
                        }
                        ScrollSwitchStateManager scrollSwitchStateManager = mainPageFragment.f134266m;
                        if (scrollSwitchStateManager == null) {
                            C89219l.m154715b();
                        }
                        scrollSwitchStateManager.mo89345a(true);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
                } else if (intent.getBooleanExtra("extra.from.shoutouts.opt.out", false)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(C34792be.f82123b, C34792be.f82125d);
                    bundle2.putBoolean("extra.from.shoutouts.opt.out", true);
                    ActivityC0945e requireActivity = mainPageFragment.requireActivity();
                    C89219l.m154716b(requireActivity, str);
                    Hox.C15490a.m28529a(requireActivity).mo25211b("USER", bundle2);
                } else {
                    String a2 = MainPageFragment.m108381a(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                    if (a2 == null) {
                        a2 = str;
                    }
                    C89219l.m154716b(a2, str);
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    if (C89219l.m154714a((Object) "USER", (Object) a2)) {
                        Context context = mainPageFragment.getContext();
                        if (context != null) {
                            View b2 = HomeTabViewModel.C53309a.m98315a((ActivityC0945e) context).mo89739b("USER");
                            if (b2 != null) {
                                b2.performClick();
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(C34792be.f82123b, C34792be.f82125d);
                    ActivityC0945e activity2 = mainPageFragment.getActivity();
                    if (activity2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity2, str);
                    Hox.C15490a.m28529a(activity2).mo25211b(a2, bundle3);
                    if (C89219l.m154714a((Object) "HOME", (Object) a2)) {
                        int intExtra = intent.getIntExtra("tab", 1);
                        TabChangeManager tabChangeManager2 = mainPageFragment.f134263j;
                        if (tabChangeManager2 == null) {
                            C89219l.m154715b();
                        }
                        Fragment b3 = tabChangeManager2.mo96536b();
                        if (b3 != null) {
                            C59014ae aeVar2 = (C59014ae) b3;
                            if (aeVar2 != null) {
                                aeVar2.mo96546d(intExtra);
                            }
                            MainBottomTabView mainBottomTabView = mainPageFragment.f134260c;
                            if (mainBottomTabView == null) {
                                C89219l.m154715b();
                            }
                            if (mainBottomTabView.getVisibility() == 8) {
                                View view = mainPageFragment.f134259b;
                                if (view == null) {
                                    C89219l.m154715b();
                                }
                                view.setVisibility(0);
                                MainBottomTabView mainBottomTabView2 = mainPageFragment.f134260c;
                                if (mainBottomTabView2 == null) {
                                    C89219l.m154715b();
                                }
                                mainBottomTabView2.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
                    }
                    if (C89219l.m154714a((Object) "NOTIFICATION", (Object) a2)) {
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, str);
                        if (!g.isLogin()) {
                            String g2 = mainPageFragment.mo93044g();
                            if (g2 != null) {
                                str = g2;
                            }
                            C58957c.m108322a(mainPageFragment, str, "click_message");
                            return;
                        }
                        AbstractC81915c.m141874a(new C61562n());
                    }
                    C22858c cVar = mainPageFragment.f134241A;
                    if (cVar == null) {
                        C89219l.m154715b();
                    }
                    cVar.mo37175e();
                }
            } catch (Exception e) {
                C51423a.m95787a(e.getMessage());
            }
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String c;
        String str4;
        HomePageDataViewModel homePageDataViewModel;
        Aweme aweme;
        C89219l.m154721d(bundle, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        String d = Hox.C15490a.m28529a(activity).mo25216d(this.f134245E);
        if (C89219l.m154714a((Object) bundle.getString(C34792be.f82123b, ""), (Object) C34792be.f82124c) || bundle.getBoolean(d)) {
            TabAlphaController.m108430a().mo96525a(false);
            C58949c.f134187a = false;
            C58945a.C58947b.f134185a.f134176c = false;
            C58945a.C58947b.f134185a.f134180g = false;
            C81079v.m140776O().mo123908B();
            C80749k.m140049a().mo123953b();
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154716b(requireActivity, "");
            HomePageDataViewModel homePageDataViewModel2 = this.f134248I;
            String str5 = null;
            if (!(homePageDataViewModel2 == null || homePageDataViewModel2.f121746l || (homePageDataViewModel = this.f134248I) == null || homePageDataViewModel.f121745k == null || !(requireActivity instanceof MainActivity))) {
                MainActivity mainActivity = (MainActivity) requireActivity;
                HomePageDataViewModel homePageDataViewModel3 = this.f134248I;
                if (homePageDataViewModel3 != null) {
                    aweme = homePageDataViewModel3.f121745k;
                } else {
                    aweme = null;
                }
                mainActivity.flingToIndexChange(aweme, getContext());
            }
            Aweme m = mo96509m();
            if (m != null) {
                C39163s sVar = new C39163s();
                HomePageDataViewModel homePageDataViewModel4 = this.f134248I;
                if (homePageDataViewModel4 != null) {
                    str = homePageDataViewModel4.mo89328c();
                } else {
                    str = null;
                }
                sVar.mo67941a("enter_from", str);
                HomePageDataViewModel homePageDataViewModel5 = this.f134248I;
                if (homePageDataViewModel5 != null && !homePageDataViewModel5.f121746l) {
                    getContext();
                    C39162r.m79459a("slide_left", "left", m108384p(), m.getAid(), sVar.mo67942a());
                    HomePageDataViewModel homePageDataViewModel6 = this.f134248I;
                    if (!(homePageDataViewModel6 == null || (c = homePageDataViewModel6.mo89328c()) == null)) {
                        C59252q qVar = (C59252q) new C59252q().mo96825o(c).mo96741a("slide_left");
                        qVar.f135318u = "";
                        qVar.f135319v = "";
                        qVar.f135317t = "";
                        C59252q c2 = qVar.mo96823c(m, 0);
                        c2.f135314q = m108384p();
                        HomePageDataViewModel homePageDataViewModel7 = this.f134248I;
                        if (homePageDataViewModel7 != null) {
                            str4 = homePageDataViewModel7.f121744j;
                        } else {
                            str4 = null;
                        }
                        c2.f135315r = str4;
                        c2.mo96740a(getContext()).mo96792f();
                    }
                    C59256u a = new C59256u().mo96834a("homepage_hot");
                    a.f135350a = C59256u.EnumC59259c.ITEM;
                    a.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
                    C59256u a2 = a.mo96749g(m).mo96832a(m.getAuthor());
                    User author = m.getAuthor();
                    if (author != null) {
                        str3 = author.getRequestId();
                    } else {
                        str3 = null;
                    }
                    a2.mo96841s(str3).mo96835b();
                }
                sVar.mo67941a("group_id", m.getAid());
                sVar.mo67941a("enter_method", "slide_left");
                HomePageDataViewModel homePageDataViewModel8 = this.f134248I;
                if (homePageDataViewModel8 != null) {
                    str2 = homePageDataViewModel8.f121744j;
                } else {
                    str2 = null;
                }
                sVar.mo67941a("request_id", str2);
                sVar.mo67941a("enter_type", "normal_way");
                MobClick labelName = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                User author2 = m.getAuthor();
                if (author2 != null) {
                    str5 = author2.getUid();
                }
                C39162r.onEvent(labelName.setValue(str5).setJsonObject(sVar.mo67942a()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a
    /* renamed from: a */
    public final void mo93041a(boolean z) {
        float f;
        float f2;
        Fragment b;
        MainBottomTabView mainBottomTabView = this.f134260c;
        if (mainBottomTabView == null) {
            C89219l.m154715b();
        }
        float alpha = mainBottomTabView.getAlpha();
        float f3 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        C17238d.m31812a(mainBottomTabView, alpha, f);
        View view = this.f134259b;
        if (view == null) {
            C89219l.m154715b();
        }
        float alpha2 = view.getAlpha();
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        C17238d.m31812a(view, alpha2, f2);
        TabChangeManager tabChangeManager = this.f134263j;
        if (tabChangeManager != null && (b = tabChangeManager.mo96536b()) != null && (b instanceof C59014ae)) {
            ViewPropertyAnimator animate = ((C59014ae) b).f134370k.animate();
            if (!z) {
                f3 = 1.0f;
            }
            animate.alpha(f3).setDuration(200).start();
        }
    }

    /* renamed from: a */
    public final boolean mo96506a(String str) {
        Context context;
        Configuration configuration;
        Context context2 = getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) context2;
        if (C69488a.C69489a.m122709a(eVar).mo109737a("swipe_up_guide")) {
            return true;
        }
        TabChangeManager a = TabChangeManager.C59002a.m108439a(eVar);
        AbstractC81915c.m141874a(new C68955h(str, a.f134312d));
        C36141a.C36142a.f85374a = str;
        if (!TextUtils.equals(a.f134312d, str)) {
            HomePageUIFrameServiceImpl.m108627e().mo89387b();
        }
        IMSAdaptionService c = MSAdaptionService.m97895c();
        Fragment b = a.mo96536b();
        if (b != null) {
            context = b.getContext();
        } else {
            context = null;
        }
        if (!c.mo89375b(context)) {
            return false;
        }
        Resources resources = eVar.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            SmartRouter.buildRoute(eVar, "//duo").withParam("duo_type", "duo_bottom_click").withParam("duo_clicked_tab_name", str).open();
            return true;
        } else if (!TextUtils.equals(str, "PUBLISH")) {
            return false;
        } else {
            new C23144b(eVar).mo37640e(R.string.bed).mo37637b();
            return true;
        }
    }

    /* renamed from: a */
    static String m108381a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T extends View> void m108382a(AbstractC0688a<T> aVar, T[] tArr) {
        for (T t : tArr) {
            try {
                aVar.mo2720a(t);
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        C1213t<C18017a> tVar;
        C1213t<Boolean> tVar2;
        C1213t<Boolean> tVar3;
        C1213t<Boolean> tVar4;
        View view2;
        MethodCollector.m26663i(7787);
        C89219l.m154721d(view, "");
        C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_fragment_view_created", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_fragment_super_view_created", false);
        super.onViewCreated(view, bundle);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_fragment_super_view_created", false);
        AbstractC56869p.C56870a.m103133a().mo94053a("MainPageFragment onViewCreated");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f134270q = (MainAnimViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MainAnimViewModel.class);
        this.f134262e = view;
        if (view == null) {
            C89219l.m154715b();
        }
        this.f134259b = view.findViewById(R.id.vf);
        View view3 = this.f134262e;
        if (view3 == null) {
            C89219l.m154715b();
        }
        this.f134260c = (MainBottomTabView) view3.findViewById(R.id.ci0);
        View view4 = this.f134262e;
        if (view4 == null) {
            C89219l.m154715b();
        }
        this.f134261d = (ViewStub) view4.findViewById(R.id.zh);
        View view5 = this.f134262e;
        if (view5 != null) {
            frameLayout = (FrameLayout) view5.findViewById(R.id.d3m);
        } else {
            frameLayout = null;
        }
        this.f134264k = frameLayout;
        IPolicyNoticeService n = C39223a.m79600n();
        View view6 = this.f134262e;
        if (view6 == null) {
            C89219l.m154715b();
        }
        View a = n.mo68667a(view6);
        this.f134247H = a;
        FrameLayout frameLayout2 = this.f134264k;
        if (frameLayout2 != null) {
            frameLayout2.addView(a);
        }
        View view7 = this.f134247H;
        if (view7 != null) {
            this.f134246G = (AbstractC39235f) view7;
            View view8 = this.f134262e;
            if (view8 == null) {
                C89219l.m154715b();
            }
            this.f134269p = view8.findViewById(R.id.fhw);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_fragment_init_view_model", false);
            C69488a a2 = C69488a.C69489a.m122709a(activity);
            this.f134250K = a2;
            if (a2 == null) {
                C89219l.m154715b();
            }
            a2.mo109734a(new C58994l(this));
            C89219l.m154721d(this, "");
            AbstractC1174ac a3 = C1181ae.m3879a(this, new MainPageDataViewModel.C52946a.C52947a()).mo3983a(MainPageDataViewModel.class);
            C89219l.m154716b(a3, "");
            MainPageDataViewModel mainPageDataViewModel = (MainPageDataViewModel) a3;
            this.f134265l = mainPageDataViewModel;
            if (mainPageDataViewModel == null) {
                C89219l.m154715b();
            }
            mainPageDataViewModel.f121753a = this.f134269p;
            this.f134263j = TabChangeManager.C59002a.m108439a(activity);
            this.f134248I = HomePageDataViewModel.C52942a.m97777a(activity);
            this.f134266m = ScrollSwitchStateManager.C52950a.m97811a(activity);
            this.f134249J = AdHomePageDataVM.C17902a.m33208a(activity);
            this.f134254O = SocialRecFriendsConditionViewModel.C66896a.m118645a(activity);
            this.f134273t = new C22825c(this);
            AbstractC39235f fVar = this.f134246G;
            if (fVar == null) {
                C89219l.m154715b();
            }
            MainBottomTabView mainBottomTabView = this.f134260c;
            if (mainBottomTabView == null) {
                C89219l.m154715b();
            }
            TabChangeManager tabChangeManager = this.f134263j;
            if (tabChangeManager == null) {
                C89219l.m154715b();
            }
            this.f134275v = new SafeInfoNoticePopupWindowHelp(this, this, fVar, mainBottomTabView, tabChangeManager);
            View view9 = this.f134262e;
            if (view9 == null) {
                C89219l.m154715b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.f134266m;
            if (scrollSwitchStateManager == null) {
                C89219l.m154715b();
            }
            this.f134274u = new FissionPopupWindowHelp(this, this, view9, scrollSwitchStateManager);
            HomePageDataViewModel homePageDataViewModel = this.f134248I;
            if (homePageDataViewModel == null) {
                C89219l.m154715b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.f134266m;
            if (scrollSwitchStateManager2 == null) {
                C89219l.m154715b();
            }
            this.f134276w = new C22831d(this, this, homePageDataViewModel, scrollSwitchStateManager2);
            SocialRecFriendsConditionViewModel socialRecFriendsConditionViewModel = this.f134254O;
            if (socialRecFriendsConditionViewModel == null) {
                C89219l.m154715b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager3 = this.f134266m;
            if (scrollSwitchStateManager3 == null) {
                C89219l.m154715b();
            }
            this.f134277y = new C22832e(this, socialRecFriendsConditionViewModel, scrollSwitchStateManager3);
            this.f134243C = new C22810a(this, activity);
            C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_fragment_init_view_model", false);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_fragment_proxy_onviewcreated", false);
            this.f134251L.mo89404a(this, view);
            C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_fragment_proxy_onviewcreated", false);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_bottom_tab_view_build_view", false);
            View view10 = this.f134262e;
            if (view10 == null) {
                C89219l.m154715b();
            }
            this.f134259b = view10.findViewById(R.id.vf);
            View view11 = this.f134262e;
            if (view11 == null) {
                C89219l.m154715b();
            }
            this.f134261d = (ViewStub) view11.findViewById(R.id.zh);
            MainBottomTabView mainBottomTabView2 = this.f134260c;
            if (mainBottomTabView2 == null) {
                C89219l.m154715b();
            }
            mainBottomTabView2.mo89741a();
            if (C33403c.C33406b.f79409a.f79388q) {
                MainBottomTabView mainBottomTabView3 = this.f134260c;
                if (mainBottomTabView3 == null) {
                    C89219l.m154715b();
                }
                Context context = getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                mainBottomTabView3.setBackgroundColor(C0643b.m2378c(context, R.color.a2));
                MainBottomTabView mainBottomTabView4 = this.f134260c;
                if (mainBottomTabView4 == null) {
                    C89219l.m154715b();
                }
                mainBottomTabView4.mo89744b();
            }
            TabAlphaController a4 = TabAlphaController.m108430a();
            MainBottomTabView mainBottomTabView5 = this.f134260c;
            if (mainBottomTabView5 != null) {
                a4.f134305a = mainBottomTabView5;
            }
            C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_bottom_tab_view_build_view", false);
            C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_bottom_tab_build_view_to_onviewcreated_end", false);
            MainPageFragmentImpl.m43110j().mo37203a(this);
            C53318b bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(activity).mo89735a("PUBLISH");
            if (bVar != null && bVar.f122397a == null) {
                bVar.f122397a = HomePageUIFrameServiceImpl.m108627e().mo89378a(bVar.f122401j, bVar.mo89774b().f100354h);
            }
            ScrollSwitchStateManager scrollSwitchStateManager4 = this.f134266m;
            if (scrollSwitchStateManager4 == null) {
                C89219l.m154715b();
            }
            C58997o oVar = new C58997o(this, activity);
            C89219l.m154721d(this, "");
            C89219l.m154721d(oVar, "");
            scrollSwitchStateManager4.f121765g.observe(this, oVar);
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            DataCenter a5 = DataCenter.m69492a(C1181ae.m3881a(activity2, (C1175ad.AbstractC1177b) null), this);
            this.f134267n = a5;
            if (a5 == null) {
                C89219l.m154715b();
            }
            a5.mo60189a("ENTER_DISLIKE_MODE", (AbstractC1214u<C33942b>) new C58986d(this)).mo60189a("handlePageResume", (AbstractC1214u<C33942b>) new C58987e(this)).mo60189a("setTabBackground", (AbstractC1214u<C33942b>) new C58988f(this)).mo60189a("changeTabAfterPublish", (AbstractC1214u<C33942b>) new C58989g(this)).mo60190a("onNewIntent", new C58990h(this), true).mo60190a("proformToTab", new C58991i(this), true).mo60190a("performClickTab", new C58992j(this), true);
            View view12 = this.f134262e;
            if (view12 == null) {
                C89219l.m154715b();
            }
            VideoSeekBarMaskView videoSeekBarMaskView = (VideoSeekBarMaskView) view12.findViewById(R.id.ci2);
            View view13 = this.f134262e;
            if (view13 == null) {
                C89219l.m154715b();
            }
            VideoSeekBar videoSeekBar = (VideoSeekBar) view13.findViewById(R.id.fdm);
            C89219l.m154716b(videoSeekBar, "");
            videoSeekBarMaskView.setSeekBarView(videoSeekBar);
            View view14 = this.f134262e;
            if (view14 == null) {
                C89219l.m154715b();
            }
            ViewGroup viewGroup = (ViewGroup) view14.findViewById(R.id.fdn);
            View view15 = this.f134262e;
            if (view15 == null) {
                C89219l.m154715b();
            }
            TuxTextView tuxTextView = (TuxTextView) view15.findViewById(R.id.agw);
            View view16 = this.f134262e;
            if (view16 == null) {
                C89219l.m154715b();
            }
            TuxTextView tuxTextView2 = (TuxTextView) view16.findViewById(R.id.eml);
            tuxTextView.mo37697a(32.0f);
            tuxTextView2.mo37697a(32.0f);
            C89219l.m154716b(viewGroup, "");
            C89219l.m154716b(tuxTextView, "");
            C89219l.m154716b(tuxTextView2, "");
            ScrollSwitchStateManager scrollSwitchStateManager5 = this.f134266m;
            if (scrollSwitchStateManager5 == null) {
                C89219l.m154715b();
            }
            this.f134244D = new C50445e(new C50447g(videoSeekBar, viewGroup, tuxTextView, tuxTextView2, scrollSwitchStateManager5));
            DataCenter dataCenter = this.f134267n;
            if (dataCenter == null) {
                C89219l.m154715b();
            }
            dataCenter.mo60189a("ENTER_DISLIKE_MODE", (AbstractC1214u<C33942b>) new C58993k(this));
            new C58221f.C58224c().mo95703b((AbstractC58264w) new DownloadFestivalTask()).mo95703b((AbstractC58264w) new InitBubbleGuideTask()).mo95703b((AbstractC58264w) new HwWallpaperMobEventTask()).mo95703b((AbstractC58264w) new MultiProcessMobEventTask()).mo95706a();
            DataCenter dataCenter2 = this.f134267n;
            if (dataCenter2 == null) {
                C89219l.m154715b();
            }
            Boolean bool = (Boolean) dataCenter2.mo60195b("start_from_logout_or_switch", (Object) false);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if ((!g.isLogin() || C39223a.m79601o().mo68703a()) && C39223a.m79592f().mo68589b() && !bool.booleanValue() && (view2 = this.f134262e) != null) {
                view2.postDelayed(new RunnableC59001s(this), 100);
            }
            View view17 = this.f134262e;
            if (view17 == null) {
                C89219l.m154715b();
            }
            view17.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC58998p(this));
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f134274u;
            if (fissionPopupWindowHelp == null) {
                C89219l.m154715b();
            }
            fissionPopupWindowHelp.f53866f = (FeedPanelStateViewModel) C1181ae.m3881a(fissionPopupWindowHelp.f53863c.requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(FeedPanelStateViewModel.class);
            FeedPanelStateViewModel feedPanelStateViewModel = fissionPopupWindowHelp.f53866f;
            if (!(feedPanelStateViewModel == null || (tVar4 = feedPanelStateViewModel.f155229c) == null)) {
                tVar4.observe(fissionPopupWindowHelp.f53863c, new FissionPopupWindowHelp.C22815b(fissionPopupWindowHelp));
            }
            FeedPanelStateViewModel feedPanelStateViewModel2 = fissionPopupWindowHelp.f53866f;
            if (!(feedPanelStateViewModel2 == null || (tVar3 = feedPanelStateViewModel2.f155228b) == null)) {
                tVar3.observe(fissionPopupWindowHelp.f53863c, new FissionPopupWindowHelp.C22816c(fissionPopupWindowHelp));
            }
            FeedPanelStateViewModel feedPanelStateViewModel3 = fissionPopupWindowHelp.f53866f;
            if (!(feedPanelStateViewModel3 == null || (tVar2 = feedPanelStateViewModel3.f155230d) == null)) {
                tVar2.observe(fissionPopupWindowHelp.f53863c, new FissionPopupWindowHelp.C22817d(fissionPopupWindowHelp));
            }
            View view18 = this.f134262e;
            if (view18 instanceof ViewGroup) {
                if (view18 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(view18, "");
                C79655e.f178750a = new WeakReference<>(view18);
            }
            MainBottomTabView mainBottomTabView6 = this.f134260c;
            if (mainBottomTabView6 == null) {
                C89219l.m154715b();
            }
            C22825c cVar = this.f134273t;
            if (cVar == null) {
                C89219l.m154715b();
            }
            TabChangeManager tabChangeManager2 = this.f134263j;
            if (tabChangeManager2 == null) {
                C89219l.m154715b();
            }
            AbstractC39235f fVar2 = this.f134246G;
            if (fVar2 == null) {
                C89219l.m154715b();
            }
            ScrollSwitchStateManager scrollSwitchStateManager6 = this.f134266m;
            if (scrollSwitchStateManager6 == null) {
                C89219l.m154715b();
            }
            MainAnimViewModel mainAnimViewModel = this.f134270q;
            if (mainAnimViewModel == null) {
                C89219l.m154715b();
            }
            C22858c cVar2 = new C22858c(activity, mainBottomTabView6, this, cVar, tabChangeManager2, fVar2, scrollSwitchStateManager6, mainAnimViewModel);
            this.f134241A = cVar2;
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            if (g2.isLogin()) {
                cVar2.mo37172b();
            } else {
                cVar2.f53984e = new C22858c.C22870j(cVar2);
                C31575b.m65859a();
                IAccountService iAccountService = C31575b.f75524a;
                IAccountService.AbstractC31272b bVar2 = cVar2.f53984e;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                iAccountService.mo57064a(bVar2);
            }
            HomePageDataViewModel homePageDataViewModel2 = this.f134248I;
            if (homePageDataViewModel2 == null) {
                C89219l.m154715b();
            }
            MainPageDataViewModel mainPageDataViewModel2 = this.f134265l;
            if (mainPageDataViewModel2 == null) {
                C89219l.m154715b();
            }
            DataCenter dataCenter3 = this.f134267n;
            if (dataCenter3 == null) {
                C89219l.m154715b();
            }
            this.f134278z = new C53609a(this, homePageDataViewModel2, mainPageDataViewModel2, dataCenter3, this);
            this.f134253N = new C22813d();
            AdHomePageDataVM adHomePageDataVM = this.f134249J;
            if (!(adHomePageDataVM == null || (tVar = adHomePageDataVM.f42662b) == null)) {
                tVar.observe(this, this.f134256Q);
            }
            C89219l.m154721d(this, "");
            NotificationCountViewManager.f53973a = this;
            C42536d.C42537a.m85035b();
            C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_fragment_view_created", false);
            C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_bottom_tab_build_view_to_onviewcreated_end", false);
            if (C33539h.m68712a()) {
                ZeroRatingServiceImpl.m141669f().mo59642a(this.f134255P);
            }
            MethodCollector.m26664o(7787);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.interfaces.IPolicyNoticeToast");
        MethodCollector.m26664o(7787);
        throw nullPointerException;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        C80611a.m139766a(getActivity(), i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View rootView;
        MethodCollector.m26663i(7461);
        C89219l.m154721d(layoutInflater, "");
        C58945a.C58947b.f134185a.mo96429b("cold_boot_resume_to_mainpage_create_view", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_mainpage_fragment_create_view", false);
        MainLooperOptService b = MainLooperOptService.m105334b((MainLooperOptService.EnumC58297a) null);
        if (b != null) {
            if (b.f132762d == null && MainLooperOptService.f132758h && (rootView = viewGroup.getRootView()) != null) {
                b.f132762d = b.mo95724a(rootView.getParent());
                if (b.f132762d == null) {
                    b.f132762d = b.mo95728b(rootView.getParent());
                }
            }
            b.mo95726a(MainLooperOptService.EnumC58297a.WATCH_WINDOW_FOCUS_CHANGE);
        }
        C52957b bVar = this.f134251L;
        C89219l.m154721d(this, "");
        C89219l.m154721d(layoutInflater, "");
        if (C67261e.m119184b()) {
            i = R.layout.a3m;
        } else {
            i = R.layout.a3l;
        }
        View a = C1870c.m6045a((Activity) getActivity(), i);
        C89219l.m154716b(a, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(this, "");
        if (C53055h.f121997c) {
            Context context = a.getContext();
            C89219l.m154716b(context, "");
            C53048f fVar = new C53048f(context, (byte) 0);
            fVar.addView(a, new StepDrawerContainer.C53038c(0));
            C89219l.m154721d(this, "");
            fVar.f121985i = this;
            AbstractC18234b bVar2 = fVar.f121985i;
            if (bVar2 == null) {
                C89219l.m154710a("hostFragment");
            }
            bVar2.getLifecycle().mo4012a(new StoryContainer$attachHost$1(fVar));
            a = fVar;
        }
        if (!C67261e.m119184b()) {
            getActivity();
            if (a != null) {
                ViewStub viewStub = (ViewStub) ((ViewGroup) a).findViewById(R.id.fhn);
                if (viewStub != null) {
                    viewStub.inflate();
                }
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(7461);
                throw nullPointerException;
            }
        }
        bVar.f121785a = (FragmentTabHost) a.findViewById(R.id.ci5);
        FragmentTabHost fragmentTabHost = bVar.f121785a;
        if (fragmentTabHost != null) {
            fragmentTabHost.setHideWhenTabChanged(true);
        }
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        bVar.f121787c = ScrollSwitchStateManager.C52950a.m97811a(activity);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_mainpage_fragment_create_view", false);
        MethodCollector.m26664o(7461);
        return a;
    }

    @Override // com.bytedance.ies.uikit.tabhost.FragmentTabHost.AbstractC18281b
    /* renamed from: a */
    public final void mo29236a(String str, Fragment fragment, Fragment fragment2) {
        C77717b.m135747a(getActivity(), str);
        if (TextUtils.equals(str, "HOME")) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                C80420fc.m139413a(activity);
            }
        } else {
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null) {
                C89219l.m154721d(activity2, "");
                C89219l.m154721d(activity2, "");
                Window window = activity2.getWindow();
                if (window != null) {
                    C89219l.m154721d(window, "");
                    C80420fc.m139415a(window, -1, true);
                }
            }
        }
        if ((fragment2 instanceof C61515c) || (fragment2 instanceof AbstractC64149b)) {
            fragment2.setUserVisibleHint(false);
        }
        if ((fragment instanceof C61515c) && fragment != null) {
            fragment.setUserVisibleHint(true);
        }
        if (fragment instanceof C64208b) {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> enableProfileActivityLink = inst.getEnableProfileActivityLink();
            C89219l.m154716b(enableProfileActivityLink, "");
            Boolean c = enableProfileActivityLink.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue()) {
                C22858c cVar = this.f134241A;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                cVar.mo37176f();
                AbstractC59040ay ayVar = (AbstractC59040ay) C34506c.m70491a(getContext(), AbstractC59040ay.class);
                if (ayVar != null) {
                    ayVar.mo60975b("true");
                }
            }
        }
        if (fragment != null) {
            SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp = this.f134275v;
            if (safeInfoNoticePopupWindowHelp == null) {
                C89219l.m154715b();
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            boolean isLogin = g.isLogin();
            C89219l.m154721d(fragment, "");
            if (isLogin) {
                Keva repo = Keva.getRepo("account_security_keva_name");
                StringBuilder sb = new StringBuilder("prior_to_safe_info_");
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                if (repo.getBoolean(sb.append(g2.getCurUserId()).toString(), false) || (fragment instanceof C59014ae)) {
                    safeInfoNoticePopupWindowHelp.mo37134a();
                    return;
                }
                Keva repo2 = Keva.getRepo("account_security_keva_name");
                StringBuilder sb2 = new StringBuilder("last_time_fetch_safe_info_");
                IAccountUserService g3 = C31575b.m65865g();
                C89219l.m154716b(g3, "");
                long j = repo2.getLong(sb2.append(g3.getCurUserId()).toString(), 0);
                if (j == 0 || j < System.currentTimeMillis()) {
                    SafeInfoNoticeApi a = SafeInfoNoticeApi.C32936a.m67574a();
                    IAccountUserService g4 = C31575b.m65865g();
                    C89219l.m154716b(g4, "");
                    a.safeInfoNoticeMsg(g4.isChildrenMode()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new SafeInfoNoticePopupWindowHelp.C22821a(safeInfoNoticePopupWindowHelp));
                    return;
                }
                safeInfoNoticePopupWindowHelp.mo37135a(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0178  */
    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61348a(java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.MainPageFragment.mo61348a(java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
