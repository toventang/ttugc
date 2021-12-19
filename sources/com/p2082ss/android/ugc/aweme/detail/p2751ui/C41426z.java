package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17238d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23158e;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.IDetailPageShareVMService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34567d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41268ae;
import com.p2082ss.android.ugc.aweme.detail.operators.C41285e;
import com.p2082ss.android.ugc.aweme.detail.operators.C41291k;
import com.p2082ss.android.ugc.aweme.detail.operators.C41314s;
import com.p2082ss.android.ugc.aweme.detail.p2744c.C41116a;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41136a;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41140ab;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41149ac;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41150ad;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41155ae;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41170ag;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41173ah;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41177aj;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41213u;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41214v;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41216w;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41217x;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41424y;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailLoadStateManager;
import com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM;
import com.p2082ss.android.ugc.aweme.discover.C41856b;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49646m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49682j;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49685m;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49688p;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49689q;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49745b;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.p3427a.C59008a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2340at.C33956a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56205f;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80524hb;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80779o;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.FeedPlayerManagerViewModel;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.z */
public class C41426z extends C34685e implements AbstractC1214u<C33942b>, C41178b.AbstractC41194b, AbstractC41361am, AbstractC48151ak, AbstractC49745b, AbstractC49746c, AbstractC49747d, AbstractC49747d, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private AnimatorSet f96628A;

    /* renamed from: B */
    private boolean f96629B = true;

    /* renamed from: a */
    protected DmtStatusView f96630a;

    /* renamed from: b */
    View f96631b;

    /* renamed from: c */
    protected View f96632c;

    /* renamed from: d */
    protected TuxIconView f96633d;

    /* renamed from: e */
    protected FeedSwipeRefreshLayout f96634e;

    /* renamed from: j */
    public C49812b f96635j = new C49812b();

    /* renamed from: k */
    public C41178b f96636k;

    /* renamed from: l */
    protected boolean f96637l = false;

    /* renamed from: m */
    boolean f96638m = true;

    /* renamed from: n */
    boolean f96639n;

    /* renamed from: o */
    int f96640o = 0;

    /* renamed from: p */
    public AbstractC41262aa f96641p = null;

    /* renamed from: q */
    private ViewStub f96642q;

    /* renamed from: r */
    private View f96643r;

    /* renamed from: s */
    private LoadMoreFrameLayout f96644s;

    /* renamed from: t */
    private ViewStub f96645t;

    /* renamed from: u */
    private View f96646u;

    /* renamed from: v */
    private boolean f96647v = false;

    /* renamed from: w */
    private AbstractC59108o f96648w;

    /* renamed from: y */
    private C80524hb f96649y = new C80524hb() {
        /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z.C414271 */

        static {
            Covode.recordClassIndex(49322);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80524hb, com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: b */
        public final void mo70709b(String str) {
            AbstractC80321cz b;
            super.mo70709b(str);
            VerticalViewPager verticalViewPager = C41426z.this.f96636k.f114759N;
            AbstractC48191b bVar = C41426z.this.f96636k.f114768W;
            if (verticalViewPager != null && bVar != null && (b = C80330da.C80331a.m139267b(str)) != null) {
                b.mo123696a("next_video", C33956a.m69537a(bVar.mo80287c(verticalViewPager.getCurrentItem())));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80524hb, com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: a */
        public final void mo70708a(String str) {
            AbstractC80321cz b;
            super.mo70708a(str);
            VerticalViewPager verticalViewPager = C41426z.this.f96636k.f114759N;
            AbstractC48191b bVar = C41426z.this.f96636k.f114768W;
            if (verticalViewPager != null && bVar != null && (b = C80330da.C80331a.m139267b(str)) != null) {
                int currentItem = verticalViewPager.getCurrentItem();
                b.mo123696a("launch_vv", Integer.toString(currentItem)).mo123696a("current_video", C33956a.m69537a(bVar.mo80287c(currentItem)));
                if (C41426z.this.f96635j.isStoryPage()) {
                    b.mo123696a("enter_from", C41426z.this.f96635j.getEventType()).mo123696a("extra_desc", "story_vertical_viewpager");
                }
            }
        }
    };

    /* renamed from: z */
    private DataCenter f96650z;

    static {
        Covode.recordClassIndex(49321);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(192, new RunnableC90250g(C41426z.class, "onFeedFetchEvent", C49685m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(60, new RunnableC90250g(C41426z.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(35, new RunnableC90250g(C41426z.class, "onBlockUserEvent", C63494a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(21, new RunnableC90250g(C41426z.class, "onMobEnterFromEvent", C49688p.class, ThreadMode.POSTING, 0, false));
        hashMap.put(22, new RunnableC90250g(C41426z.class, "onMobRequestIdEvent", C49689q.class, ThreadMode.POSTING, 0, false));
        hashMap.put(193, new RunnableC90250g(C41426z.class, "onDismissTitleTabEvent", C49682j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am
    /* renamed from: p */
    public final DmtStatusView mo70640p() {
        return this.f96630a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak
    /* renamed from: a */
    public final void mo70521a() {
        m83334d(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am
    public boolean bn_() {
        return this.f96636k.mo70452S();
    }

    /* renamed from: n */
    public final void mo70695n() {
        m83334d(1);
    }

    /* renamed from: d */
    private static boolean mo70651d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    private void mo62679l() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: G */
    public final SparseArray<AbstractC81911c> mo61042G() {
        SparseArray<AbstractC81911c> G = super.mo61042G();
        mo70645x();
        G.append(C34567d.C34568a.f81607c, this.f96636k);
        return G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public JediViewModel mo70692j() {
        JediViewModel jediViewModel = C50529ae.f116791b;
        if (C50529ae.f116791b == jediViewModel) {
            C50529ae.f116791b = null;
        }
        return jediViewModel;
    }

    /* renamed from: o */
    public final boolean mo70696o() {
        C41178b bVar = this.f96636k;
        if (bVar == null || !bVar.mo84763bp()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final String mo70703q() {
        return C59208ac.m108775i(AwemeChangeCallBack.m108593a(getActivity()));
    }

    /* renamed from: i */
    private static boolean mo122896i() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean d = mo70651d();
        C58029j.f132256h = d;
        return d;
    }

    /* renamed from: x */
    private void mo70645x() {
        if (this.f96636k == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                m83331a(arguments);
            } else {
                this.f96635j.setEventType("");
            }
            this.f96636k = mo70690c();
        }
    }

    /* renamed from: v */
    private void mo70643v() {
        Aweme y = this.f96636k.mo70429y();
        String from = this.f96635j.getFrom();
        if (y != null && from != null) {
            if (BusinessComponentServiceUtils.getMediumWebViewRefHolder().mo79719a()) {
                BusinessComponentServiceUtils.getMediumWebViewRefHolder().mo79718a(y, "exit");
            }
            if (C41856b.f97654a.mo70763b().mo71051a()) {
                C41856b.f97654a.mo70763b().mo71050a(y, "exit", from);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.AbstractC41194b
    /* renamed from: b */
    public final void mo70530b() {
        MethodCollector.m26663i(7035);
        BusinessComponentServiceUtils.getBusinessBridgeService();
        this.f96645t.setLayoutResource(R.layout.aiv);
        this.f96645t.inflate();
        ScrollSwitchStateManager.C52950a.m97811a(getActivity()).mo89345a(false);
        MethodCollector.m26664o(7035);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c
    /* renamed from: k */
    public final boolean mo70693k() {
        AbstractC41262aa aaVar = this.f96641p;
        if (aaVar == null || aaVar.isLoading() || this.f96641p.cannotLoadMore()) {
            return false;
        }
        AbstractC41262aa aaVar2 = this.f96641p;
        if (aaVar2 instanceof AbstractC41262aa.AbstractC41264b) {
            ((AbstractC41262aa.AbstractC41264b) aaVar2).setPreLoad(true);
        } else {
            this.f96636k.mo70483c(true);
        }
        return m83334d(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49745b
    /* renamed from: m */
    public final boolean mo70694m() {
        AbstractC41262aa aaVar = this.f96641p;
        if (aaVar == null || aaVar.isLoading() || this.f96641p.cannotLoadLatest()) {
            return false;
        }
        AbstractC41262aa aaVar2 = this.f96641p;
        if (!(aaVar2 instanceof AbstractC41262aa.AbstractC41263a)) {
            return false;
        }
        if (aaVar2 instanceof AbstractC41262aa.AbstractC41264b) {
            ((AbstractC41262aa.AbstractC41264b) aaVar2).setPreLoad(true);
        } else {
            this.f96636k.mo70483c(true);
        }
        return m83334d(2);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f96635j.isfollowSkyLight().booleanValue()) {
            C49646m.f114271a = new LinkedHashMap();
            C49646m.f114272b = new LinkedHashMap();
        }
        C80330da.C80331a.m139266a("detail_page").mo123701c();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f96636k.mo70413r();
        AbstractC41262aa aaVar = this.f96641p;
        if (aaVar != null) {
            aaVar.unInit();
        }
        C80779o.f180652a = false;
        if (C80779o.m140115c()) {
            this.f96636k.mo84707aO().mo123909C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo70704r() {
        getActivity();
        if (!mo122896i()) {
            new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
            this.f96634e.setRefreshing(false);
            return;
        }
        AbstractC41262aa aaVar = this.f96641p;
        C49812b bVar = this.f96635j;
        aaVar.request(2, bVar, bVar.getVideoType(), this.f96647v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo70707u() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            View view = this.f96632c;
            C17238d.m31812a(view, view.getAlpha(), 1.0f);
            View view2 = this.f96646u;
            C17238d.m31812a(view2, view2.getAlpha(), 1.0f);
            AbstractC81915c.m141874a(new C49678f(activity.hashCode(), (byte) 0));
        }
    }

    /* renamed from: w */
    private void mo70644w() {
        ActivityC0945e activity;
        mo70643v();
        if (!this.f96637l) {
            if (MSAdaptionService.m97895c().mo89377c((Context) getActivity())) {
                SmartRouter.buildRoute(getActivity(), "//duo").withParam("duo_type", "duo_back").open();
                return;
            }
            mo62679l();
            C49812b bVar = this.f96635j;
            if (bVar != null && bVar.isFromAdsActivity() && (activity = getActivity()) != null) {
                activity.overridePendingTransition(R.anim.cg, R.anim.cg);
            }
        }
    }

    /* renamed from: g */
    public final void mo70706t() {
        if ("westwindow".equals(this.f96635j.getEventType())) {
            C76598h.m134181a("click");
        }
        if (AwemeChangeCallBack.m108593a(getActivity()) != null && AwemeChangeCallBack.m108593a(getActivity()).isAd()) {
            C38000g.m77054e().mo65131a(AwemeChangeCallBack.m108593a(getActivity()), getContext(), this.f96632c);
            C18129a.m33746a("draw_ad", "search_return", AwemeChangeCallBack.m108593a(getActivity()).getAwemeRawAd()).mo28901b();
        }
        this.f96636k.mo70441G();
        mo70644w();
    }

    /* renamed from: c */
    public C41178b mo70690c() {
        Object obj;
        boolean z;
        boolean z2;
        C49812b bVar = this.f96635j;
        Bundle arguments = getArguments();
        String str = "";
        C89219l.m154721d(bVar, str);
        String eventType = bVar.getEventType();
        if (eventType != null) {
            str = eventType;
        }
        Music music = null;
        if (arguments != null) {
            obj = C41424y.C41425a.m83329a(arguments, "feed_data_music");
        } else {
            obj = null;
        }
        if (obj instanceof Music) {
            music = obj;
        }
        Music music2 = music;
        if (C89219l.m154714a((Object) bVar.getFrom(), (Object) "from_publish_add_video")) {
            return new C41136a(arguments);
        }
        if (C89219l.m154714a((Object) str, (Object) "sticker_profile_detail")) {
            return new C41140ab(arguments);
        }
        if (C41424y.C41425a.m83330a() && bVar.getShowAnswerQuestionButton() == 1) {
            return new C41216w(arguments);
        }
        if (C41424y.C41425a.m83330a() && C89219l.m154714a((Object) str, (Object) "single_song") && !CommerceMediaServiceImpl.m77578f().mo66514b(music2)) {
            return new C41214v(arguments, bVar);
        }
        if (C41424y.C41425a.m83330a() && C89219l.m154714a((Object) str, (Object) "mv_page")) {
            return new C41213u(arguments);
        }
        if (C41424y.C41425a.m83330a() && C89219l.m154714a((Object) str, (Object) "prop_page")) {
            return new C41149ac(arguments);
        }
        if (C76660b.m134241a() == 5) {
            z = true;
        } else {
            z = false;
        }
        if (!C89070n.m154522b("personal_homepage", "others_homepage").contains(bVar.getEventType()) || bVar.getVideoType() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean isStoryPage = bVar.isStoryPage();
        if (z && (z2 || isStoryPage)) {
            return new C41170ag(bVar);
        }
        if (bVar.isStoryPage() && C77260g.f173332a.mo120146a()) {
            int a = C76660b.m134241a();
            if (a == 1) {
                return new C41155ae(bVar);
            }
            if (a != 2) {
                return new C41173ah(bVar);
            }
            return new C41150ad(bVar);
        } else if (!C89219l.m154714a((Object) bVar.getFrom(), (Object) "from_chat") || !C56205f.m102122b()) {
            return new C41178b(bVar);
        } else {
            return new C41217x(arguments, bVar);
        }
    }

    /* renamed from: b */
    public final void mo70689b(boolean z) {
        C41178b bVar = this.f96636k;
        if (bVar != null) {
            bVar.mo70494f(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70686a(Boolean bool) {
        this.f96634e.setEnabled(bool.booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am
    /* renamed from: b */
    public final boolean mo70638b(int i) {
        if (this.f96636k.f114768W.getCount() - 1 > i) {
            return true;
        }
        return false;
    }

    @AbstractC90264r
    public void onFeedFetchEvent(C49685m mVar) {
        if (TextUtils.equals(mVar.f114352a, "from_cell_recommend")) {
            m83334d(4);
        }
    }

    /* renamed from: a */
    private void m83331a(Bundle bundle) {
        this.f96635j = (C49812b) bundle.getSerializable("feed_param");
        this.f96647v = bundle.getBoolean("extra_challenge_is_hashtag", false);
    }

    /* renamed from: c */
    private boolean m83332c(int i) {
        if (i != 1) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f96635j.getCid()) || !TextUtils.isEmpty(this.f96635j.getLikeListIds())) {
            return true;
        }
        return false;
    }

    @AbstractC90264r
    public void onMobEnterFromEvent(C49688p pVar) {
        if (pVar != null && this.f96648w != null && getActivity() != null) {
            HomePageDataViewModel.C52942a.m97777a(getActivity()).mo89326a(pVar.f114354a);
        }
    }

    @AbstractC90264r
    public void onMobRequestIdEvent(C49689q qVar) {
        if (qVar != null && this.f96648w != null && getActivity() != null) {
            HomePageDataViewModel.C52942a.m97777a(getActivity()).f121744j = qVar.f114355a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d
    /* renamed from: a */
    public final boolean mo70687a(Aweme aweme) {
        return mo70688a(aweme.getAid());
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        mo70645x();
        super.setUserVisibleHint(z);
        this.f96636k.mo70492e(z);
        if (z) {
            this.f96636k.mo70477b(true);
            this.f96636k.f96256u = true;
            this.f96636k.mo70436B();
            return;
        }
        this.f96636k.mo70477b(false);
        this.f96636k.f96256u = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d
    /* renamed from: a */
    public final boolean mo70688a(String str) {
        AbstractC41262aa aaVar = this.f96641p;
        if (aaVar == null || !aaVar.deleteItem(str)) {
            return false;
        }
        return true;
    }

    @AbstractC90264r
    public void onBlockUserEvent(C63494a aVar) {
        C49812b bVar;
        if (!((Boolean) C41116a.f96111b.getValue()).booleanValue() || (bVar = this.f96635j) == null || !TextUtils.equals(bVar.getEventType(), "personal_homepage") || aVar == null || aVar.f144112a == null || this.f96636k.mo70429y() == null || TextUtils.equals(aVar.f144112a.getUid(), this.f96636k.mo70429y().getAuthorUid())) {
            m83334d(1);
        }
    }

    /* renamed from: d */
    private boolean m83334d(int i) {
        Aweme b;
        C41178b bVar;
        Aweme b2;
        C41178b bVar2;
        AbstractC41262aa aaVar = this.f96641p;
        boolean z = false;
        if (aaVar != null && !aaVar.isLoading()) {
            if (this.f96635j.isFromChatRoomPlaying()) {
                this.f96635j.setIsFromChatRoomPlaying(false);
                FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f96634e;
                if (feedSwipeRefreshLayout != null) {
                    feedSwipeRefreshLayout.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z.RunnableC414282 */

                        static {
                            Covode.recordClassIndex(49323);
                        }

                        public final void run() {
                            C41426z.this.mo70693k();
                        }
                    }, 200);
                }
            }
            z = true;
            if (!TextUtils.equals("from_local", this.f96635j.getQueryAwemeMode()) || (b2 = AwemeService.m70060b().mo60684b(this.f96635j.getAid())) == null || (bVar2 = this.f96636k) == null) {
                if (!(!m83332c(i) || (b = AwemeService.m70060b().mo60684b(this.f96635j.getAid())) == null || (bVar = this.f96636k) == null)) {
                    bVar.mo70481c(b);
                }
                if (this.f96635j.isShouldQueryMyStoryFromCache()) {
                    Aweme a = C77260g.f173332a.mo120157e().mo120170a();
                    C41178b bVar3 = this.f96636k;
                    if (bVar3 != null) {
                        bVar3.mo61907a(a);
                        return true;
                    }
                }
                AbstractC41262aa aaVar2 = this.f96641p;
                C49812b bVar4 = this.f96635j;
                aaVar2.request(i, bVar4, bVar4.getVideoType(), this.f96647v);
            } else {
                bVar2.mo61907a(b2);
                return true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        C41178b bVar2;
        C33942b bVar3 = bVar;
        if (bVar3 != null) {
            String str = bVar3.f80277a;
            str.hashCode();
            int i = 0;
            int i2 = -1;
            switch (str.hashCode()) {
                case -1852517575:
                    if (str.equals("feed_enter_transition_end") && (bVar2 = this.f96636k) != null) {
                        AbstractC48149ai aC = bVar2.mo81108aC();
                        if (aC instanceof AbstractC48234cd) {
                            ((AbstractC48234cd) aC).mo70619i();
                            return;
                        }
                        return;
                    }
                    return;
                case -1013481626:
                    if (str.equals("onBack")) {
                        mo70644w();
                        return;
                    }
                    return;
                case 22405807:
                    if (str.equals("action_remove_recommend_user_card") && bVar3.mo60212a() != null) {
                        String str2 = (String) bVar3.mo60212a();
                        List<Aweme> e = this.f96636k.f114768W.mo80288e();
                        if (e != null && e.size() > 0) {
                            while (true) {
                                if (i < e.size()) {
                                    if (e.get(i) == null || !TextUtils.equals(e.get(i).getAid(), str2)) {
                                        i++;
                                    } else {
                                        i2 = i;
                                    }
                                }
                            }
                        }
                        this.f96636k.mo62671b(i2);
                        return;
                    }
                    return;
                case 89664936:
                    if (str.equals("feed_transition_state")) {
                        mo70689b(((Boolean) bVar3.mo60212a()).booleanValue());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @AbstractC90264r
    public void onDismissTitleTabEvent(C49682j jVar) {
        ObjectAnimator ofFloat;
        if (this.f96629B != jVar.f114349a && this.f96631b != null) {
            AnimatorSet animatorSet = this.f96628A;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f96628A.cancel();
            }
            this.f96629B = jVar.f114349a;
            this.f96628A = new AnimatorSet();
            if (jVar.f114349a) {
                this.f96631b.setVisibility(0);
                if (jVar.f114350b == 0) {
                    View view = this.f96631b;
                    ofFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
                } else {
                    ofFloat = ObjectAnimator.ofFloat(this.f96631b, "alpha", 0.0f, 1.0f);
                }
            } else if (jVar.f114350b == 0) {
                View view2 = this.f96631b;
                ofFloat = ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), (float) (-this.f96631b.getHeight()));
            } else {
                ofFloat = ObjectAnimator.ofFloat(this.f96631b, "alpha", 1.0f, 0.0f);
            }
            if (jVar.f114350b == 0) {
                this.f96628A.setDuration(300L);
            } else {
                this.f96628A.setDuration(150L);
            }
            this.f96628A.play(ofFloat);
            this.f96628A.start();
        }
    }

    /* renamed from: a */
    public AbstractC41262aa mo70641a(AbstractC39100a aVar) {
        AbstractC41268ae aeVar;
        Class<? extends BaseDetailShareVM<?, ?, ?>> second;
        C49812b bVar = this.f96635j;
        JediViewModel<?> j = mo70692j();
        String from = bVar.getFrom();
        if (C41314s.f96426a.size() == 0) {
            for (IDetailPageOperatorService iDetailPageOperatorService : ServiceManager.get().getServices(IDetailPageOperatorService.class)) {
                HashMap<String, AbstractC41265ab> a = iDetailPageOperatorService.mo57213a();
                if (a != null) {
                    C41314s.f96426a.putAll(a);
                }
            }
        }
        if (!TextUtils.isEmpty(from)) {
            if (C41314s.f96426a.containsKey(from)) {
                AbstractC41265ab abVar = C41314s.f96426a.get(from);
                if (abVar != null) {
                    return abVar.mo62369a(bVar, aVar, j);
                }
            } else {
                AbstractC41262aa a2 = BusinessComponentServiceUtils.getDetailPageOperatorProvider().mo70577a(from, bVar, aVar, j);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        if (C41314s.f96427b.size() == 0 && ServiceManager.get().getServices(IDetailPageShareVMService.class) != null) {
            for (IDetailPageShareVMService iDetailPageShareVMService : ServiceManager.get().getServices(IDetailPageShareVMService.class)) {
                HashMap<String, AbstractC41268ae> a3 = iDetailPageShareVMService.mo57214a();
                if (a3 != null) {
                    C41314s.f96427b.putAll(a3);
                }
            }
        }
        if (!TextUtils.isEmpty(from) && C41314s.f96427b.containsKey(from) && (aeVar = C41314s.f96427b.get(from)) != null) {
            C89219l.m154721d(aeVar, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(this, "");
            C89378p<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> a4 = aeVar.mo70579a(bVar);
            if (!(a4 == null || (second = a4.getSecond()) == null)) {
                SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider();
                AbstractC1196i lifecycle = getLifecycle();
                C89219l.m154716b(lifecycle, "");
                BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) sharedViewModelProvider.mo3982a(lifecycle, a4.getFirst(), second);
                if (!baseDetailShareVM.f31148b) {
                    C89219l.m154721d(this, "");
                    if (!baseDetailShareVM.f31148b) {
                        C12642a.C12643a.m22774a(baseDetailShareVM, new BaseDetailShareVM.C41453j(this), null, null, BaseDetailShareVM.C41454k.f96698a, BaseDetailShareVM.C41455l.f96699a);
                    }
                }
                return baseDetailShareVM;
            }
        }
        if (!TextUtils.isEmpty(bVar.getIds()) || !TextUtils.isEmpty(bVar.getPushParams())) {
            return new C41285e(bVar.getIds());
        }
        return new C41291k();
    }

    @AbstractC90264r
    public void onDislikeAwemeEvent(C49678f fVar) {
        String str;
        if (getActivity() != null && fVar.f114345e == getActivity().hashCode() && !C58956a.m108315a(AwemeChangeCallBack.m108593a(getActivity())) && fVar.f114342b == 2) {
            boolean z = fVar.f114341a;
            ScrollSwitchStateManager.C52950a.m97811a(getActivity()).mo89345a(!z);
            if (z) {
                View view = this.f96632c;
                C17238d.m31812a(view, view.getAlpha(), 0.0f);
                View view2 = this.f96646u;
                C17238d.m31812a(view2, view2.getAlpha(), 0.0f);
                if (fVar.mo81454a() && AwemeChangeCallBack.m108593a(getActivity()) != null) {
                    C33744d a = new C33744d().mo59983a("group_id", AwemeChangeCallBack.m108593a(getActivity()).getAid());
                    if (AwemeChangeCallBack.m108593a(getActivity()).getAuthor() != null) {
                        str = AwemeChangeCallBack.m108593a(getActivity()).getAuthor().getUid();
                    } else {
                        str = "";
                    }
                    C33744d a2 = a.mo59983a("author_id", str).mo59983a("content_type", C59208ac.m108773g(AwemeChangeCallBack.m108593a(getActivity()))).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(AwemeChangeCallBack.m108593a(getActivity())))).mo59983a("enter_from", this.f96636k.f114782aJ.getEventType()).mo59983a("enter_method", "detail");
                    C76598h.m134177a(a2, this.f96636k.mo84738bM());
                    if (this.f96636k.mo70429y() != null) {
                        C79900c.m138665a(a2, this.f96636k.mo70429y(), this.f96636k.f114782aJ.getEventType());
                    }
                    C39162r.m79460a("click_trans_layer", a2.f79943a);
                    Dialog newOptionsDialog = BusinessComponentServiceUtils.newOptionsDialog(getContext(), this.f96636k.mo70429y(), this.f96636k.f114782aJ.getEventType());
                    newOptionsDialog.setOnDismissListener(new DialogInterface$OnDismissListenerC41352ad(this));
                    newOptionsDialog.show();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean equals;
        String str;
        MethodCollector.m26663i(7023);
        super.onViewCreated(view, bundle);
        this.f96631b = view.findViewById(R.id.b89);
        this.f96642q = (ViewStub) view.findViewById(R.id.b88);
        this.f96632c = view.findViewById(R.id.pi);
        this.f96633d = (TuxIconView) view.findViewById(R.id.a77);
        this.f96632c.setOnClickListener(new View$OnClickListenerC41353ae(this));
        this.f96633d.setOnClickListener(new View$OnClickListenerC41354af(this));
        this.f96644s = (LoadMoreFrameLayout) view.findViewById(R.id.cg7);
        this.f96634e = (FeedSwipeRefreshLayout) view.findViewById(R.id.dhb);
        this.f96645t = (ViewStub) view.findViewById(R.id.ea1);
        this.f96646u = view.findViewById(R.id.bzd);
        C17233a.f41165a = true;
        this.f96648w = C59008a.m108456a(getActivity());
        this.f96630a = new DmtStatusView(getContext());
        this.f96644s.addView(this.f96630a, new FrameLayout.LayoutParams(-1, -1));
        this.f96630a.setVisibility(8);
        if (TextUtils.equals(this.f96635j.getEventType(), "feed_low_quality") && this.f96635j.isNewLowQualityUser()) {
            new C79459a(getContext()).mo123050a(R.string.czz).mo123053a();
        }
        if (!TextUtils.isEmpty(this.f96635j.getDetailTitleText())) {
            View inflate = this.f96642q.inflate();
            this.f96643r = inflate;
            ((TuxTextView) inflate.findViewById(R.id.b87)).setText(this.f96635j.getDetailTitleText());
        }
        this.f96630a.setBuilder(DmtStatusView.C17269a.m31905a(getActivity()));
        this.f96630a.setBackgroundColor(0);
        ((ViewGroup.MarginLayoutParams) this.f96631b.getLayoutParams()).topMargin = C23158e.m43647a(getContext());
        if (this.f96636k != null) {
            int b = (int) C13628n.m24520b(getContext(), 15.0f);
            ScrollSwitchStateManager a = ScrollSwitchStateManager.C52950a.m97811a(getActivity());
            HomePageDataViewModel a2 = HomePageDataViewModel.C52942a.m97777a(getActivity());
            ActivityC0945e activity = getActivity();
            C41349aa aaVar = new C41349aa(this, a, b);
            C89219l.m154721d(activity, "");
            C89219l.m154721d(aaVar, "");
            a.f121764f.observe(activity, aaVar);
            a.mo89349b(getActivity(), new C41350ab(this, a, a2));
            a.mo89353c(getActivity(), new C41351ac(this));
            getContext();
            if (!mo122896i()) {
                new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
                new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
            }
        }
        this.f96650z = DataCenter.m69492a(C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null), this).mo60189a("action_remove_recommend_user_card", (AbstractC1214u<C33942b>) this).mo60189a("onBack", (AbstractC1214u<C33942b>) this).mo60189a("feed_transition_state", (AbstractC1214u<C33942b>) this).mo60189a("feed_enter_transition_end", (AbstractC1214u<C33942b>) this);
        this.f96634e.setEnabled(false);
        AbstractC39100a aVar = C50529ae.f116790a;
        AbstractC41262aa a3 = mo70641a(aVar);
        this.f96641p = a3;
        int pageType = a3.getPageType(this.f96635j.getVideoType());
        if (!this.f96641p.init(this)) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            MethodCollector.m26664o(7023);
            return;
        }
        AbstractC41262aa aaVar2 = this.f96641p;
        if (aaVar2 instanceof AbstractC41262aa.AbstractC41264b) {
            ((AbstractC41262aa.AbstractC41264b) aaVar2).bindPreLoadView(this.f96636k);
        }
        if ((this.f96641p instanceof AbstractC41262aa.AbstractC41263a) && (!this.f96635j.isfollowSkyLight().booleanValue() || this.f96635j.isHasLatestFollowingUser())) {
            this.f96634e.setEnabled(true);
            DetailLoadStateManager.C41342a.m83213a(getActivity()).f96502a.observe(this, new C41355ag(this));
            this.f96634e.setOnRefreshListener(new C41356ah(this));
        }
        this.f96635j.setPageType(pageType);
        AbstractC80747i iVar = C49625h.m93072a().f114189a;
        C49625h.m93072a().f114189a = null;
        C80779o.f180652a = TextUtils.equals(this.f96635j.getEventType(), "similar_ads");
        if (iVar != null) {
            C49625h.m93072a().f114190b = this.f96635j.getAid();
            C51423a.m95792b("DetailPageFragment", "use share player manager, from " + this.f96635j.getFrom());
            FeedSharePlayerViewModel.getViewModel(getActivity()).player = iVar;
            this.f96636k.mo84696a(iVar);
            C41178b bVar = this.f96636k;
            long j = C49625h.m93072a().f114191c;
            if (bVar.f114783aK != null) {
                bVar.f114783aK.mo81202b(C49625h.m93072a().f114190b, j);
            }
            C49625h.m93072a().f114191c = -1;
        } else if (C80779o.m140115c()) {
            C81079v vVar = new C81079v(false);
            ActivityC0945e activity2 = getActivity();
            C89219l.m154721d(activity2, "");
            C89219l.m154721d(vVar, "");
            FeedPlayerManagerViewModel.C80645a.m139833a(activity2).f180313a = vVar;
            this.f96636k.mo84696a((AbstractC80747i) vVar);
        }
        this.f96636k.f96257v = new C41357ai(this);
        this.f96636k.mo70460a(this.f96635j);
        this.f96641p.getViewModel();
        this.f96636k.f114830be = this.f96641p.getViewModel();
        C41178b bVar2 = this.f96636k;
        Bundle arguments = getArguments();
        if (arguments == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(arguments.getString("trigger_by"), "splash");
        }
        bVar2.f96223b = equals;
        bVar2.f114783aK.f113729v = equals;
        this.f96636k.mo70488d("from_profile_self".equals(this.f96635j.getFrom()));
        this.f96636k.mo70393a(view, bundle);
        this.f96636k.f96218E = this;
        this.f96636k.f96255t = this;
        this.f96636k.mo70471a((AbstractC49746c) this);
        this.f96636k.f96254s = this;
        this.f96636k.f114817as = this;
        if (TextUtils.equals(this.f96635j.getFrom(), "from_follow_page")) {
            this.f96636k.f114796aX = "feed";
        }
        if (this.f96635j.isfollowSkyLight().booleanValue()) {
            C41178b bVar3 = this.f96636k;
            bVar3.f114759N.mo67975a(true, (ViewPager.AbstractC1580f) new C41177aj(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0322: INVOKE  
                  (wrap: com.ss.android.ugc.aweme.common.widget.VerticalViewPager : 0x0316: IGET  (r6v5 com.ss.android.ugc.aweme.common.widget.VerticalViewPager) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) com.ss.android.ugc.aweme.detail.h.b.N com.ss.android.ugc.aweme.common.widget.VerticalViewPager)
                  true
                  (wrap: androidx.viewpager.widget.ViewPager$f : ?: CAST (androidx.viewpager.widget.ViewPager$f) (wrap: com.ss.android.ugc.aweme.detail.h.aj : 0x031f: CONSTRUCTOR  (r1v39 com.ss.android.ugc.aweme.detail.h.aj) = 
                  (wrap: com.ss.android.ugc.aweme.detail.h.b$11 : 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.aweme.detail.h.aj.<init>(com.ss.android.ugc.aweme.detail.h.ai):void type: CONSTRUCTOR))
                 type: VIRTUAL call: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.a(boolean, androidx.viewpager.widget.ViewPager$f):void in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (androidx.viewpager.widget.ViewPager$f) (wrap: com.ss.android.ugc.aweme.detail.h.aj : 0x031f: CONSTRUCTOR  (r1v39 com.ss.android.ugc.aweme.detail.h.aj) = 
                  (wrap: com.ss.android.ugc.aweme.detail.h.b$11 : 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.aweme.detail.h.aj.<init>(com.ss.android.ugc.aweme.detail.h.ai):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x031f: CONSTRUCTOR  (r1v39 com.ss.android.ugc.aweme.detail.h.aj) = 
                  (wrap: com.ss.android.ugc.aweme.detail.h.b$11 : 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR)
                 call: com.ss.android.ugc.aweme.detail.h.aj.<init>(com.ss.android.ugc.aweme.detail.h.ai):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x031c: CONSTRUCTOR  (r0v134 com.ss.android.ugc.aweme.detail.h.b$11) = (r8v1 'bVar3' com.ss.android.ugc.aweme.detail.h.b) call: com.ss.android.ugc.aweme.detail.h.b.11.<init>(com.ss.android.ugc.aweme.detail.h.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.detail.ui.z.onViewCreated(android.view.View, android.os.Bundle):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 33 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.detail.h.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 39 more
                */
            /*
            // Method dump skipped, instructions count: 1122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return C1870c.m6046a(getActivity(), R.layout.wj, viewGroup, false);
        }
    }
