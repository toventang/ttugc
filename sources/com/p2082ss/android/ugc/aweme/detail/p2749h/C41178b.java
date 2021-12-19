package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.p2144h.C29919b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36397l;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37837f;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.AbstractC38485b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.C41123f;
import com.p2082ss.android.ugc.aweme.detail.C41127g;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.p2743b.AbstractC41111a;
import com.p2082ss.android.ugc.aweme.detail.p2746e.C41122a;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41129b;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41130c;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l;
import com.p2082ss.android.ugc.aweme.detail.transition.C41327a;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43313a;
import com.p2082ss.android.ugc.aweme.experiment.C46972gg;
import com.p2082ss.android.ugc.aweme.experiment.C47039q;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48302w;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.api.C48334h;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49527r;
import com.p2082ss.android.ugc.aweme.feed.guide.C49592h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49621g;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49646m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49676d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49681i;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49685m;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49745b;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49854ar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50449b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBarMaskView;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50444d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50445e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2975b.C50450a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.follow.p2996b.C51073b;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.p3427a.C59008a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59210ae;
import com.p2082ss.android.ugc.aweme.metrics.C59217al;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61499b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2302b.C33312a;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79657g;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79663h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.service.C67847a;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71896b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.upvote.service.C80034a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.b */
public class C41178b extends AbstractC49815a implements AbstractC36430c, AbstractC41212t, AbstractC41212t {

    /* renamed from: a */
    private static final Set<String> f96213a;

    /* renamed from: A */
    int f96214A;

    /* renamed from: B */
    public boolean f96215B;

    /* renamed from: C */
    public boolean f96216C;

    /* renamed from: D */
    protected int f96217D;

    /* renamed from: E */
    public AbstractC41194b f96218E;

    /* renamed from: F */
    private boolean f96219F;

    /* renamed from: G */
    private String f96220G;

    /* renamed from: H */
    private View f96221H;

    /* renamed from: I */
    private TuxTextView f96222I;

    /* renamed from: b */
    public boolean f96223b;

    /* renamed from: bA */
    private ViewPager.AbstractC1579e f96224bA;

    /* renamed from: bB */
    private boolean f96225bB;

    /* renamed from: bC */
    private AbstractC34466a f96226bC;

    /* renamed from: bD */
    private AtomicBoolean f96227bD;

    /* renamed from: bE */
    private boolean f96228bE;

    /* renamed from: bF */
    private C79663h f96229bF;

    /* renamed from: bG */
    private Runnable f96230bG;

    /* renamed from: bH */
    private RunnableC41193a f96231bH;

    /* renamed from: bI */
    private boolean f96232bI;

    /* renamed from: bJ */
    private boolean f96233bJ;

    /* renamed from: bK */
    private boolean f96234bK;

    /* renamed from: bx */
    private boolean f96235bx;

    /* renamed from: by */
    private Handler f96236by;

    /* renamed from: bz */
    private View f96237bz;

    /* renamed from: c */
    public boolean f96238c;

    /* renamed from: d */
    TuxButton f96239d;

    /* renamed from: e */
    public PopupWindow f96240e;

    /* renamed from: f */
    public AbstractC41262aa f96241f;

    /* renamed from: g */
    protected boolean f96242g;

    /* renamed from: h */
    public boolean f96243h;

    /* renamed from: i */
    public boolean f96244i;

    /* renamed from: j */
    public boolean f96245j;

    /* renamed from: k */
    protected View f96246k;

    /* renamed from: l */
    protected VideoSeekBarMaskView f96247l;

    /* renamed from: m */
    protected AbstractC36413a f96248m;

    /* renamed from: n */
    protected View f96249n;

    /* renamed from: o */
    protected View f96250o;

    /* renamed from: p */
    protected AbstractC77734a f96251p;

    /* renamed from: q */
    C50450a f96252q;

    /* renamed from: r */
    protected AbstractC49746c f96253r;

    /* renamed from: s */
    public AbstractC49745b f96254s;

    /* renamed from: t */
    public AbstractC48151ak f96255t;

    /* renamed from: u */
    public boolean f96256u;

    /* renamed from: v */
    public AbstractC41111a f96257v;

    /* renamed from: w */
    public HashSet<String> f96258w;

    /* renamed from: x */
    public HashSet<String> f96259x;

    /* renamed from: y */
    C49621g f96260y;

    /* renamed from: z */
    public boolean f96261z;

    /* renamed from: com.ss.android.ugc.aweme.detail.h.b$b */
    public interface AbstractC41194b {
        static {
            Covode.recordClassIndex(49077);
        }

        /* renamed from: b */
        void mo70530b();
    }

    /* renamed from: C */
    public void mo70437C() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: F */
    public final boolean mo70440F() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo70403T() {
    }

    /* renamed from: a */
    public void mo70419a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c
    /* renamed from: c */
    public void mo63766c() {
        this.f96244i = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: c */
    public void mo70479c(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c
    /* renamed from: d */
    public void mo63767d() {
        this.f96244i = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(60, new RunnableC90250g(C41178b.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(307, new RunnableC90250g(C41178b.class, "onStoryCommentEvent", C36397l.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(5, new RunnableC90250g(C41178b.class, "onCommentEvent", C36387c.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(6, new RunnableC90250g(C41178b.class, "onVideoPlayerEvent", C71904j.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(308, new RunnableC90250g(C41178b.class, "onVideoCleanModeEvent", C50449b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(309, new RunnableC90250g(C41178b.class, "onHideCommentInputFragmentEvent", C37837f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(310, new RunnableC90250g(C41178b.class, "onDuetSettingEvent", C71896b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(311, new RunnableC90250g(C41178b.class, "onAwemeDeleteEvent", C49677e.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(312, new RunnableC90250g(C41178b.class, "onShowAdLayoutEvent", C33312a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(214, new RunnableC90250g(C41178b.class, "onCancelVideoCoverMaskEvent", C49674b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(227, new RunnableC90250g(C41178b.class, "onInterceptedResumePlayOnResume", C43313a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(313, new RunnableC90250g(C41178b.class, "onShareCompleteEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(231, new RunnableC90250g(C41178b.class, "onCommentDialogEvent", C49676d.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: S */
    public final boolean mo70452S() {
        return this.f96242g;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: a */
    public void mo70393a(View view, Bundle bundle) {
        MethodCollector.m26663i(11427);
        super.mo70393a(view, bundle);
        this.f96247l = (VideoSeekBarMaskView) view.findViewById(R.id.dtu);
        this.f96246k = view.findViewById(R.id.dnh);
        if (!mo70394ab()) {
            new C79459a(this.f183419bv).mo123050a(R.string.dcq).mo123053a();
        } else {
            mo84794o(true).setBuilder(DmtStatusView.C17269a.m31905a(this.f183419bv).mo27398a(R.string.gzs).mo27405b());
            this.f96246k.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.View$OnClickListenerC411791 */

                static {
                    Covode.recordClassIndex(49062);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C41178b.this.mo70441G();
                }
            });
            mo70387m();
            ViewGroup viewGroup = (ViewGroup) this.f96246k;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(this, "");
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            C50450a aVar = new C50450a(context);
            Activity activity = this.f183419bv;
            ScrollSwitchStateManager scrollSwitchStateManager = null;
            if (!(activity instanceof ActivityC0945e)) {
                activity = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) activity;
            if (eVar != null) {
                scrollSwitchStateManager = ScrollSwitchStateManager.C52950a.m97811a(eVar);
            }
            C89219l.m154721d(this, "");
            aVar.f116519a = this;
            VideoSeekBar videoSeekBar = (VideoSeekBar) aVar.mo85702a(R.id.fdm);
            C89219l.m154716b(videoSeekBar, "");
            RelativeLayout relativeLayout = (RelativeLayout) aVar.mo85702a(R.id.fdn);
            C89219l.m154716b(relativeLayout, "");
            TuxTextView tuxTextView = (TuxTextView) aVar.mo85702a(R.id.agw);
            C89219l.m154716b(tuxTextView, "");
            TuxTextView tuxTextView2 = (TuxTextView) aVar.mo85702a(R.id.eml);
            C89219l.m154716b(tuxTextView2, "");
            aVar.f116520b = new C50445e(new C50444d(videoSeekBar, relativeLayout, tuxTextView, tuxTextView2, scrollSwitchStateManager, this));
            VerticalViewPager aR = mo84710aR();
            if (aR != null) {
                aR.mo67974a(new C50450a.C50452b(aVar));
            }
            viewGroup.addView(aVar);
            this.f96252q = aVar;
            this.f96247l.setSeekBarView(aVar.getVideoSeekBar());
            this.f114778aF = this.f114766U;
            this.f114759N.mo67974a(new ViewPager.C1582h() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.C411907 */

                static {
                    Covode.recordClassIndex(49073);
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        C41178b.this.mo70445L();
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageSelected(int i) {
                    C71904j jVar = new C71904j(10);
                    jVar.f161108e = 2;
                    AbstractC81915c.m141874a(jVar);
                    if (!C41178b.this.f114785aM) {
                        String from = C41178b.this.f114782aJ.getFrom();
                        if (TextUtils.equals(from, "from_follow_page") || TextUtils.equals(from, "from_familiar_tab") || TextUtils.equals(from, "from_nearby") || TextUtils.equals("from_search_live", from)) {
                            C41122a.f96119a.mo70373a(C41178b.this.mo70518x(), C41178b.this.f114782aJ.getFrom(), C41178b.this.f114782aJ.getVideoType(), C41178b.this.f114782aJ.getEventType(), C41178b.this.mo70444K(), true, -1, null);
                        }
                    }
                    if (C41178b.this.f114782aJ.isfollowSkyLight().booleanValue()) {
                        Aweme aD = C41178b.this.mo81109aD();
                        if (aD != null || (aD = ((AbstractC48191b) C41178b.this.f114759N.getAdapter()).mo80287c(i)) != null) {
                            User author = aD.getAuthor();
                            if (author.getUniqueId() == null) {
                                C41178b.this.mo70493f("");
                            } else {
                                C41178b.this.mo70493f(author.getUniqueId());
                            }
                            C41178b.this.f114768W.f111625c = C41178b.this.f114782aJ.isHasLatestFollowingUser();
                            String uid = author.getUid();
                            String aid = aD.getAid();
                            C41178b.this.f96215B = TextUtils.equals(C49646m.f114271a.get(uid), aid);
                            C41178b.this.f96216C = TextUtils.equals(C49646m.f114272b.get(uid), aid);
                            if (!C41178b.this.f96259x.contains(uid)) {
                                C41178b.this.f96259x.add(uid);
                                List<String> uidList = C41178b.this.f114782aJ.getUidList();
                                List<String> blueDotList = C41178b.this.f114782aJ.getBlueDotList();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= uidList.size()) {
                                        break;
                                    } else if (!uidList.get(i2).equalsIgnoreCase(uid)) {
                                        i2++;
                                    } else if (blueDotList.get(i2).equalsIgnoreCase("true")) {
                                        AbstractC81915c.m141874a(new C51073b(uid));
                                    }
                                }
                            }
                            C41178b.this.f96258w.add(aid);
                        }
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrolled(int i, float f, int i2) {
                    C41178b.this.mo70462a(i, f);
                }
            });
        }
        this.f96237bz = view;
        this.f96224bA = new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.C411918 */

            static {
                Covode.recordClassIndex(49074);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    C41178b.this.mo70438D();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                if (C41178b.this.f96248m != null) {
                    C41178b.this.f96248m.mo63682a();
                }
                C41178b bVar = C41178b.this;
                Aweme y = bVar.mo70429y();
                if (bVar.f96239d != null) {
                    boolean canShare = y.canShare();
                    bVar.f96239d.setEnabled(canShare);
                    if (canShare) {
                        bVar.f96239d.getBackground().clearColorFilter();
                    } else {
                        bVar.f96239d.getBackground().setColorFilter(new PorterDuffColorFilter(-7829368, PorterDuff.Mode.MULTIPLY));
                    }
                }
                C41178b bVar2 = C41178b.this;
                bVar2.mo70406b(bVar2.mo70429y());
                if (!C47039q.m90298a() && C41178b.this.f114768W != null) {
                    C59217al c = new C59217al().mo96756a(C41178b.this.f114782aJ.getEventType()).mo96757c(C41178b.this.f114768W.mo80287c(i), C41178b.this.f114782aJ.getPageType());
                    c.f134884b = C41178b.this.f114782aJ.getTabName();
                    c.f134887e = C41178b.this.f114782aJ.getChallengeId();
                    c.f134883a = "full";
                    c.mo96792f();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                if (C41178b.this.f96240e != null && C41178b.this.f96240e.isShowing()) {
                    C41178b.this.f96240e.dismiss();
                    C41178b.this.f96240e = null;
                }
            }
        };
        this.f114759N.mo67974a(this.f96224bA);
        AbstractC59108o a = C59008a.m108456a((ActivityC0945e) this.f183419bv);
        if (a != null) {
            a.mo96580a(new ViewPager.AbstractC1579e() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.C411929 */

                static {
                    Covode.recordClassIndex(49075);
                }

                @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageSelected(int i) {
                    if (i == 0) {
                        AwemeChangeCallBack.m108596a((ActivityC0945e) C41178b.this.f183419bv, C41178b.this.f114768W.mo80287c(C41178b.this.f114759N.getCurrentItem()));
                    }
                }
            });
        }
        this.f96229bF = new C79663h(this);
        this.f96226bC = new AbstractC34466a() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.C4118010 */

            static {
                Covode.recordClassIndex(49063);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (C41178b.this.f96245j || 4 != i) {
                    return false;
                }
                return true;
            }
        };
        if ((this.f183419bv instanceof AbstractC34472g) && C41333b.f96464a && this.f114782aJ.isSupportFeedTransition()) {
            ((AbstractC34472g) this.f183419bv).registerActivityOnKeyDownListener(this.f96226bC);
        }
        MethodCollector.m26664o(11427);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public void mo59512a(List<Aweme> list, boolean z) {
        if (mo84730bE()) {
            this.f96242g = z;
            this.f114795aW = true;
            C51423a.m95791b(4, "DetailFragmentPanel", "onRefreshResult mDetailInputFragment.enterNormalMode() " + this.f96232bI);
            AbstractC36413a aVar = this.f96248m;
            if (aVar != null) {
                aVar.mo63692e();
            }
            DmtStatusView o = mo84794o(false);
            if (!this.f96232bI) {
                if (C13617h.m24465a(list)) {
                    DmtStatusView o2 = mo84794o(true);
                    if (o2 != null) {
                        o2.mo27385g();
                    }
                } else {
                    this.f96232bI = true;
                    if (o != null) {
                        o.mo27382d();
                    }
                    C29339a.m58754b(new RunnableC41208p(this));
                }
            } else if (o != null) {
                o.mo27382d();
            }
            if (list == null || list.isEmpty() || !(list.get(0) instanceof Aweme)) {
                list = null;
            }
            List<Aweme> e = m82953e(list);
            this.f114778aF.setRefreshing(false);
            this.f114768W.f111624b = z;
            mo70395c(e);
            mo70476b(e);
            mo84698a("", true);
            AbstractC81915c.m141874a(new C49681i());
            mo70420ad();
            this.f114795aW = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
        C51423a.m95791b(6, "DetailFragmentPanel", "showLoadLatestError " + Log.getStackTraceString(exc));
        if (mo84730bE()) {
            this.f114778aF.setRefreshing(false);
            if (this.f114768W.getCount() == 0) {
                DmtStatusView o = mo84794o(true);
                if (o != null) {
                    o.setVisibility(0);
                    o.mo27387h();
                }
            } else {
                C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.cxf);
            }
            this.f96228bE = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
    /* renamed from: a */
    public void mo61907a(Aweme aweme) {
        String aid;
        MethodCollector.m26663i(11765);
        if (!mo84730bE()) {
            MethodCollector.m26664o(11765);
            return;
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = this.f114782aJ.getAid();
        }
        AbstractC81915c.m141874a(new C41129b(aid, aweme, null));
        DmtStatusView o = mo84794o(false);
        if (o != null) {
            o.setVisibility(8);
        }
        if (aweme == null) {
            ViewStub viewStub = (ViewStub) this.f96246k.findViewById(R.id.b86);
            if (viewStub == null) {
                MethodCollector.m26664o(11765);
                return;
            }
            viewStub.inflate();
            TextView textView = (TextView) this.f96246k.findViewById(R.id.f8q);
            if (textView != null) {
                textView.setVisibility(0);
                MethodCollector.m26664o(11765);
                return;
            }
            new C79459a(this.f183419bv).mo123050a(R.string.h7a).mo123053a();
            MethodCollector.m26664o(11765);
            return;
        }
        mo70406b(aweme);
        if (!C41127g.m82828b(this.f114782aJ.getFrom()) || !aweme.isForwardAweme() || aweme.getForwardItem() != null) {
            if (aweme.getStatus() != null && aweme.getStatus().isDelete()) {
                this.f96246k.postDelayed(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.RunnableC411863 */

                    static {
                        Covode.recordClassIndex(49069);
                    }

                    public final void run() {
                        if (C41178b.this.f183419bv != null && !C41178b.this.f183419bv.isFinishing()) {
                            C41178b.this.f183419bv.finish();
                        }
                    }
                }, 600);
            }
            if (C80580in.m139685b(aweme.getAuthor(), C80580in.m139694g(aweme.getAuthor()))) {
                AbstractC36413a aVar = this.f96248m;
                if (aVar != null) {
                    aVar.mo63685a(false);
                }
                AbstractC41194b bVar = this.f96218E;
                if (bVar != null) {
                    bVar.mo70530b();
                }
            } else {
                ArrayList arrayList = new ArrayList();
                C49621g gVar = this.f96260y;
                if (gVar != null && !gVar.mo81417a(aweme)) {
                    this.f96260y.f114182f = new C41209q(this);
                }
                arrayList.add(AwemeService.m70060b().mo60677a(aweme));
                mo70395c(arrayList);
                AbstractC36413a aVar2 = this.f96248m;
                if (aVar2 != null) {
                    aVar2.mo63686b();
                }
            }
            mo70481c(aweme);
            if (this.f114782aJ.isShowShareAfterOpen()) {
                mo84692a(mo70429y(), (String) null);
            }
            if (this.f114782aJ.getNeedShowDonation()) {
                mo70468a(mo70429y(), 0);
            }
            if (this.f96221H != null) {
                ITranslatedCaptionService j = TranslatedCaptionCacheServiceImpl.m146355j();
                CaptionItemModel d = m82951d(aweme);
                if (this.f96221H.getVisibility() == 0 && d != null && j != null && j.mo108894d(d.getClaSubtitleId())) {
                    this.f96222I.setText(R.string.afz);
                    this.f96221H.setVisibility(8);
                }
                this.f96221H.setOnClickListener(new View$OnClickListenerC41198f(this, aweme));
            }
            if (!(this.f114782aJ.getUpvoteId() == null || aweme.getInteractPermission() == null)) {
                C80034a.f179347a.mo123479a(aweme.getAid(), aweme.getInteractPermission().getUpvote());
            }
            MethodCollector.m26664o(11765);
            return;
        }
        new C79459a(this.f183419bv).mo123050a(R.string.c01).mo123053a();
        MethodCollector.m26664o(11765);
    }

    /* renamed from: a */
    public final void mo70469a(final Aweme aweme, final String str, final int i) {
        if (mo81108aC() != null || i >= 3) {
            mo84695a(mo70429y(), this.f114782aJ.getCid(), this.f114782aJ.isCommentForceOpenReply(), this.f114782aJ.getNeedAutoLikeComment(), this.f114782aJ.getNeedShowReplyPanel(), this.f114782aJ.getCommentUserFollowStatus());
        } else {
            mo81098a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.RunnableC411874 */

                static {
                    Covode.recordClassIndex(49070);
                }

                public final void run() {
                    C41178b.this.mo70469a(aweme, str, i + 1);
                }
            }, 50);
        }
    }

    /* renamed from: a */
    public final void mo70470a(final Aweme aweme, final String str, final int i, final int i2) {
        if (mo81108aC() != null || i2 >= 3) {
            mo84723b(aweme, str, i);
        } else {
            mo81098a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.RunnableC411885 */

                static {
                    Covode.recordClassIndex(49071);
                }

                public final void run() {
                    C41178b.this.mo70470a(aweme, str, i, i2 + 1);
                }
            }, 50);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70468a(Aweme aweme, int i) {
        if (mo81108aC() != null || i >= 3) {
            SmartRouter.buildRoute(this.f183419bv, "aweme://donation/pannel").withParam("enter_method", this.f114782aJ.getEnterMethodValue()).withParam("enter_from", mo81096g(true)).withParam("page_type", this.f114782aJ.getPageType()).withParam("aweme_id", aweme.getAid()).open();
        } else {
            mo81098a(new RunnableC41210r(this, aweme, i), 50);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo70467a(C49672ag agVar) {
        C79663h hVar;
        AbstractC37879bc t;
        C50445e eVar;
        int i = agVar.f114315a;
        if (i != 3) {
            int i2 = 0;
            if (i == 53) {
                if (!this.f114769X) {
                    this.f114769X = true;
                    mo70438D();
                    this.f96227bD.compareAndSet(false, true);
                }
                super.mo63634a(agVar);
                return;
            } else if (i != 57) {
                switch (i) {
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        super.mo63634a(agVar);
                        Aweme aD = mo81109aD();
                        if (this.f96229bF == null) {
                            return;
                        }
                        if ((!this.f114782aJ.isMyProfile() || !C59208ac.m108774h(aD)) && (hVar = this.f96229bF) != null) {
                            hVar.mo123211a(this.f183419bv, aD);
                            return;
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        mo70464a(1200L, 1000L);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        mo70464a(-1L, 0L);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (mo84730bE()) {
                            C50450a aVar = this.f96252q;
                            if (aVar != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) aVar.mo85702a(R.id.fdn);
                                C89219l.m154716b(relativeLayout, "");
                                if (relativeLayout.getVisibility() == 0 && (eVar = aVar.f116520b) != null) {
                                    eVar.mo85691c();
                                }
                            }
                            this.f114759N.setCanTouch(false);
                            this.f114766U.setCanTouch(false);
                            AbstractC48149ai bg = mo84754bg();
                            if (bg != null) {
                                AbstractC37879bc t2 = bg.mo80229t();
                                if (t2 != null) {
                                    t2.mo65974g();
                                }
                                bg.mo80095b(true);
                            }
                            AbstractC48149ai k = mo84785k(this.f114801ac);
                            if (k != null && (t = k.mo80229t()) != null) {
                                t.mo65949a(mo84913bY(), false);
                                t.mo65983p();
                                return;
                            }
                            return;
                        }
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        if (mo81108aC() == null || !mo81108aC().mo80102Q()) {
                            this.f114759N.setCanTouch(true);
                            this.f114766U.setCanTouch(true);
                            AbstractC48149ai bg2 = mo84754bg();
                            if (bg2 == null) {
                                return;
                            }
                            if (this.f96234bK) {
                                bg2.mo80095b(true);
                                return;
                            } else {
                                bg2.mo80095b(false);
                                return;
                            }
                        } else {
                            return;
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        Activity activity = this.f183419bv;
                        if (activity != null) {
                            activity.onBackPressed();
                            return;
                        }
                        return;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        if (!mo70394ab()) {
                            new C79459a(this.f183419bv).mo123050a(R.string.dcq).mo123053a();
                            return;
                        }
                        Bundle bundle = agVar.f114317c;
                        if (bundle != null) {
                            i2 = bundle.getInt("emojiReact", 0);
                        }
                        m82945a(mo84758bk(), true, i2);
                        return;
                }
            } else if (!mo70394ab()) {
                new C79459a(this.f183419bv).mo123050a(R.string.dcq).mo123053a();
                return;
            } else {
                m82945a(mo84758bk(), false, 0);
                return;
            }
        } else if (!this.f114781aI.booleanValue()) {
            mo70464a(0L, 0L);
        } else {
            return;
        }
        super.mo63634a(agVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
    /* renamed from: a */
    public final void mo70473a(List<Aweme> list) {
        int size;
        if (mo84730bE()) {
            this.f114770Y = 0;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Aweme a = AwemeService.m70060b().mo60677a(list.get(i2));
                list.set(i2, a);
                if (a != null && C13627m.m24499a(a.getAid(), this.f114782aJ.getAid())) {
                    i = i2;
                }
            }
            mo70395c(list);
            this.f114770Y = i;
            this.f114759N.mo67973a(this.f114770Y, false);
            this.f114759N.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.RunnableC411896 */

                static {
                    Covode.recordClassIndex(49072);
                }

                public final void run() {
                    if (C41178b.this.f96248m != null) {
                        C41178b.this.f96248m.mo63686b();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo70472a(String str) {
        mo84691a(mo70429y(), 0, str);
    }

    /* renamed from: a */
    public final void mo70466a(Comment comment) {
        AbstractC77713a af;
        if (comment != null && (af = mo70422af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.mo121205b(comment);
        }
    }

    /* renamed from: G */
    public final void mo70441G() {
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63693g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: M */
    public final String mo70446M() {
        return this.f114782aJ.getTabName();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: N */
    public final ViewGroup mo70447N() {
        return (ViewGroup) this.f96246k;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: O */
    public final String mo70448O() {
        return this.f114782aJ.getTracker();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: R */
    public final PreloadStrategyConfig mo70451R() {
        return C49527r.m92771d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final /* synthetic */ void mo70455W() {
        mo70464a(0L, 1200L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final /* synthetic */ void mo70458Z() {
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63686b();
        }
    }

    /* renamed from: h */
    public final Aweme mo70496h() {
        return mo70429y();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad
    /* renamed from: l */
    public final void mo70501l() {
        Activity activity = this.f183419bv;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: ad */
    private void mo70420ad() {
        if (mo84701aI()) {
            C61499b.C61500a.m111344a(this.f114796aX).mo99146c();
        }
    }

    /* renamed from: o */
    private static boolean mo70389o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: A */
    public final void mo70435A() {
        super.mo70435A();
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63685a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: B */
    public final void mo70436B() {
        if (!mo70421ae()) {
            super.mo70436B();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: J */
    public final void mo70443J() {
        super.mo70443J();
        mo70464a(0L, 0L);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        C51423a.m95784a(4, "DetailFragmentPanel", "showLoadEmpty mDetailInputFragment.enterCleanMode()");
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63690d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: z */
    public final boolean mo70519z() {
        boolean z = super.mo70519z();
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63685a(!z);
        }
        return z;
    }

    static {
        Covode.recordClassIndex(49061);
        HashSet hashSet = new HashSet();
        f96213a = hashSet;
        hashSet.add("from_search");
        hashSet.add("from_search_mix");
    }

    /* renamed from: ab */
    private static boolean mo70394ab() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean o = mo70389o();
        C58029j.f132256h = o;
        return o;
    }

    /* renamed from: af */
    private AbstractC77713a mo70422af() {
        AbstractC48136a P;
        AbstractC48149ai bg = mo84754bg();
        if (bg == null || (P = bg.mo80101P()) == null) {
            return null;
        }
        return P.mo80278h();
    }

    /* renamed from: K */
    public final long mo70444K() {
        if (this.f114783aK != null) {
            return this.f114783aK.mo81205d(C49625h.m93072a().f114190b);
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: P */
    public final void mo70449P() {
        if (!C41401l.f96578w.containsKey(this.f114782aJ.getEventType())) {
            super.mo70449P();
        }
    }

    /* renamed from: U */
    public final int mo70453U() {
        if (this.f114768W == null || this.f114798aZ != this.f114768W.getCount() - 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: V */
    public final View mo70454V() {
        AbstractC48149ai aC = mo81108aC();
        if (aC instanceof AbstractC48234cd) {
            return ((AbstractC48234cd) aC).mo80193an();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final /* synthetic */ void mo70457Y() {
        if (this.f114782aJ.isShowShareAfterOpen()) {
            mo84692a(mo70429y(), (String) null);
        }
        if (this.f114782aJ.isShowCommentAfterOpen()) {
            mo84792n(mo70518x());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (mo84730bE() && !this.f96228bE) {
            this.f114758M.mo85749a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public final /* synthetic */ void mo70474aa() {
        if (this.f96248m != null && this.f114782aJ.isAdHasReportReason()) {
            this.f96248m.mo63684a(this.f114782aJ.getAdReportReason(), this.f114782aJ.getAdReportReasonType());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (mo84730bE()) {
            AbstractC36413a aVar = this.f96248m;
            if (aVar != null) {
                aVar.mo63690d();
            }
            DmtStatusView o = mo84794o(true);
            if (o != null) {
                o.setVisibility(0);
                o.mo27384f();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
        if (mo84730bE() && !this.f96228bE) {
            this.f114778aF.setRefreshing(true);
        }
    }

    /* renamed from: j */
    public final boolean mo70499j() {
        if (!m82958t(mo70429y()) || TcmServiceImpl.m135859j().mo121256a(mo70429y(), mo81096g(true))) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final AbstractC0952i mo70500k() {
        if (aH_() == null || aH_().getActivity() == null) {
            return null;
        }
        return aH_().getActivity().getSupportFragmentManager();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo70515t() {
        if ("discovery".equals(this.f114782aJ.getEventType()) || this.f114782aJ.isHotSpot()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: u */
    public final void mo70516u() {
        AbstractC49745b bVar;
        if (mo84730bE() && this.f114768W.f111625c && this.f114770Y == 2 && (bVar = this.f96254s) != null) {
            bVar.mo70694m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo70428v() {
        if (this.f114768W.getCount() == 0) {
            mo70501l();
        } else {
            this.f114759N.post(new RunnableC41211s(this));
        }
    }

    /* renamed from: w */
    public final void mo70517w() {
        this.f114781aI = true;
        if (this.f114782aJ != null) {
            this.f114782aJ.setPlaylistCleanMode(this.f114781aI.booleanValue());
        }
    }

    /* renamed from: ae */
    private boolean mo70421ae() {
        if (!mo84911bW() || !this.f96256u) {
            return true;
        }
        if (this.f183419bv != null) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo121230b();
        }
        if (this.f96235bx) {
            return true;
        }
        if (!this.f96233bJ) {
            return false;
        }
        this.f96233bJ = false;
        return true;
    }

    /* renamed from: D */
    public final void mo70438D() {
        Aweme c;
        C79663h hVar;
        if (this.f114759N != null && this.f114768W != null && (c = this.f114768W.mo80287c(this.f114759N.getCurrentItem())) != null && c.getUserDigg() == 1) {
            if ((!this.f114782aJ.isMyProfile() || !C59208ac.m108774h(c)) && (hVar = this.f96229bF) != null) {
                hVar.mo123211a(this.f183419bv, c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: I */
    public final void mo70442I() {
        if (C41333b.f96464a && this.f114782aJ.isSupportFeedTransition() && !this.f96245j && this.f183419bv != null) {
            C41327a.m83189a(this.f183419bv);
            C51423a.m95784a(6, "FeedShareElement", "FeedShareElement transition in DetailFragmentPanel onDetach exception. ");
        }
        this.f96245j = true;
        super.mo70442I();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: Q */
    public final boolean mo70450Q() {
        Aweme aD = mo81109aD();
        if (aD == null || !C31575b.m65865g().isLogin() || aD.getAuthor() == null || !TextUtils.equals(aD.getAuthor().getUid(), C31575b.m65865g().getCurUserId()) || C16048b.m29633a().mo25412a(true, "enable_preload_hp_personal", 1) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final /* synthetic */ void mo70456X() {
        if (mo84730bE()) {
            AbstractC48149ai bg = mo84754bg();
            if (C50539g.m94752e(bg)) {
                bg.mo70615a(bg.mo80206b());
                mo70489e(bg.mo80206b());
                if (C80771f.f180597a) {
                    bg.mo80227r();
                }
            }
        }
    }

    /* renamed from: x */
    public final Aweme mo70518x() {
        AbstractC48149ai bk = mo84758bk();
        if (bk != null) {
            return bk.mo80089O();
        }
        if (this.f114768W == null || this.f114759N == null) {
            return null;
        }
        return this.f114768W.mo80326d(this.f114759N.getCurrentItem());
    }

    /* renamed from: y */
    public Aweme mo70429y() {
        AbstractC48149ai bk = mo84758bk();
        if (bk != null) {
            return bk.mo80206b();
        }
        if (this.f114768W == null || this.f114759N == null) {
            return null;
        }
        return this.f114768W.mo80287c(this.f114759N.getCurrentItem());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.detail.h.b$a */
    public class RunnableC41193a implements Runnable {

        /* renamed from: a */
        public boolean f96285a;

        /* renamed from: b */
        public int f96286b;

        /* renamed from: d */
        private final List<Aweme> f96288d;

        /* renamed from: e */
        private final boolean f96289e;

        /* renamed from: f */
        private final int f96290f;

        static {
            Covode.recordClassIndex(49076);
        }

        public final void run() {
            Activity activity = C41178b.this.f183419bv;
            if (activity != null) {
                if (C1870c.m6052b(activity, "common_feed_item_feed")) {
                    int i = this.f96286b;
                    if (i == 0) {
                        int size = this.f96288d.size();
                        int i2 = this.f96290f;
                        if (i2 == 0 || i2 == size - 1 || size == 2) {
                            m83060a(2, this.f96288d);
                            return;
                        }
                        int i3 = i2 + 1;
                        if (i3 > size) {
                            m83060a(2, this.f96288d);
                            return;
                        }
                        m83060a(1, this.f96288d.subList(i2, i3));
                        C12895a.f31387b.f31389a.postDelayed(this, 16);
                    } else if (i == 1) {
                        m83060a(2, this.f96288d);
                    }
                } else {
                    C12895a.f31387b.f31389a.postDelayed(this, 16);
                }
            }
        }

        /* renamed from: a */
        private void m83060a(int i, List<Aweme> list) {
            this.f96286b = i;
            C41178b.this.f96261z = true;
            C41178b.this.mo59517b(list, this.f96289e);
            C41178b.this.f96261z = false;
        }

        RunnableC41193a(List<Aweme> list, boolean z, int i) {
            if (list.size() >= 2) {
                this.f96288d = list;
                this.f96289e = z;
                this.f96290f = i;
                return;
            }
            throw new IllegalArgumentException("allAwemeList.size must > 1");
        }
    }

    public C41178b() {
        super("");
        this.f96236by = new Handler(Looper.getMainLooper());
        this.f96237bz = null;
        this.f96242g = false;
        this.f96244i = false;
        this.f96225bB = false;
        this.f96245j = false;
        this.f96227bD = new AtomicBoolean(false);
        this.f96256u = true;
        this.f96258w = new HashSet<>();
        this.f96259x = new HashSet<>();
        this.f96261z = false;
        this.f96214A = 0;
        this.f96230bG = new RunnableC41196d(this);
        this.f96215B = true;
        this.f96231bH = null;
        this.f96232bI = false;
        this.f96233bJ = false;
        this.f96234bK = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: E */
    public final boolean mo70439E() {
        AbstractC48148ah bj = mo84757bj();
        if (bj == null || bj.mo80119ad() == null) {
            return false;
        }
        Aweme aD = mo81109aD();
        if (C46972gg.m90251b() && C79657g.m138461a(aD)) {
            bj.mo80099M();
            mo84855s(aD);
            return true;
        } else if (this.f114826ba || !C46972gg.m90252c() || !C79657g.m138464b(aD)) {
            return false;
        } else {
            this.f96240e = C79657g.m138457a(this.f183419bv, bj.mo80119ad().findViewById(R.id.dxw), new C41199g(this));
            C79657g.m138460a(new C41200h(this));
            C79657g.m138459a();
            mo84855s(aD);
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: H */
    public void mo70402H() {
        super.mo70402H();
        this.f114783aK.mo81213y();
        this.f114759N.postDelayed(this.f96230bG, 150);
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63694h();
        }
        if (C37699a.m76212O(mo81109aD())) {
            new C79459a(this.f183419bv).mo123050a(R.string.cki).mo123053a();
        }
        m82957r(false);
        AbstractC36413a aVar2 = this.f96248m;
        if (aVar2 != null) {
            aVar2.mo63696j();
        }
        this.f96244i = false;
        mo84740bO();
    }

    /* renamed from: L */
    public final void mo70445L() {
        boolean z;
        boolean z2;
        float f;
        Aweme c = this.f114768W.mo80287c(this.f114770Y);
        if (c != null) {
            boolean z3 = true;
            if (c.getAwemeType() == 101) {
                z = true;
            } else {
                z = false;
            }
            if (c.getAwemeType() == 4000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                z3 = false;
                if (C80635y.m139811f(c)) {
                    return;
                }
            }
            AbstractC36413a aVar = this.f96248m;
            float f2 = 0.0f;
            if (aVar != null) {
                aVar.mo63687b(z3);
                AbstractC36413a aVar2 = this.f96248m;
                if (z3) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                aVar2.mo63683a(f);
            }
            AbstractC41111a aVar3 = this.f96257v;
            if (aVar3 != null) {
                if (!z) {
                    f2 = 1.0f;
                }
                aVar3.mo70368a(f2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33409e, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    public void bs_() {
        String str;
        if (C41333b.f96464a && this.f114782aJ.isSupportFeedTransition() && !this.f96245j) {
            if (this.f183419bv != null) {
                C41327a.m83189a(this.f183419bv);
            }
            if (("onAdapterFinish activity's state" + this.f183419bv) != null) {
                str = ", state: " + this.f183419bv.isFinishing();
            } else {
                str = "";
            }
            C51423a.m95791b(6, "FeedShareElement", str);
        }
        this.f96245j = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: s */
    public final void mo70514s() {
        if (mo84730bE()) {
            super.mo70514s();
            if (!this.f114782aJ.isMyProfile() && this.f114770Y != -1 && (this.f114830be instanceof AbstractC38485b)) {
                ((AbstractC38485b) this.f114830be).mo67043a(this.f114770Y, this.f114782aJ.getSecUid());
            }
            if (!this.f114768W.f111624b) {
                this.f114758M.mo85752c();
                return;
            }
            if (mo70515t()) {
                if (this.f114770Y < this.f114768W.getCount() - 3) {
                    return;
                }
            } else if (this.f114770Y != this.f114768W.getCount() - 3) {
                return;
            }
            AbstractC49746c cVar = this.f96253r;
            if (cVar != null) {
                cVar.mo70693k();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: q */
    public final void mo70513q() {
        AbstractC48149ai T;
        super.mo70513q();
        if (this.f114989bu && this.f114768W != null && this.f114768W.getCount() > 0) {
            if (!mo84707aO().mo123945b(this.f114783aK)) {
                AbstractC48149ai bg = mo84754bg();
                if (C50539g.m94752e(bg) && bg.mo80155a() == 40 && bg.mo80206b().getUserStory() != null && (T = bg.mo80105T()) != null) {
                    bg = T;
                }
                mo84707aO().mo123937a(this.f114783aK);
                if (C50539g.m94752e(bg) && (bg.mo80225p().mo80232w() || C80771f.f180597a)) {
                    mo70489e(bg.mo80206b());
                }
            } else if (this.f96256u && !mo70421ae()) {
                super.mo84787l(true);
            }
        }
        this.f96227bD.get();
        ITranslatedCaptionService j = TranslatedCaptionCacheServiceImpl.m146355j();
        CaptionItemModel d = m82951d(mo70429y());
        View view = this.f96221H;
        if (view != null && view.getVisibility() == 0 && d != null && j != null && j.mo108894d(d.getClaSubtitleId())) {
            this.f96221H.setVisibility(8);
            TuxTextView tuxTextView = this.f96222I;
            if (tuxTextView != null) {
                tuxTextView.setText(R.string.afz);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: r */
    public void mo70413r() {
        C50445e eVar;
        super.mo70413r();
        C50450a aVar = this.f96252q;
        if (!(aVar == null || (eVar = aVar.f116520b) == null)) {
            eVar.mo85689b();
        }
        try {
            if (TextUtils.equals("commerce_general", this.f114782aJ.getFrom()) && !C49854ar.m93567a(new StringBuilder().append(mo84707aO().mo123918L().hashCode()).toString())) {
                mo84707aO().mo123914H();
            }
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
        if (this.f114759N != null) {
            this.f114759N.removeCallbacks(this.f96230bG);
        }
        AbstractC36413a aVar2 = this.f96248m;
        if (aVar2 != null) {
            aVar2.mo63688c();
        }
        if (this.f183419bv instanceof AbstractC34472g) {
            ((AbstractC34472g) this.f183419bv).unRegisterActivityOnKeyDownListener(this.f96226bC);
        }
        if (this.f96231bH != null) {
            C12895a.f31387b.f31389a.removeCallbacks(this.f96231bH);
            this.f96231bH = null;
        }
        C81067m.C81070a.m140763a().mo124532e(this.f114799aa);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo70387m() {
        int i;
        MethodCollector.m26663i(11936);
        if (this.f183419bv == null || this.f183419bv.isFinishing()) {
            MethodCollector.m26664o(11936);
        } else if (aH_() == null) {
            MethodCollector.m26664o(11936);
        } else if (this.f114781aI.booleanValue()) {
            MethodCollector.m26664o(11936);
        } else {
            C49812b bVar = this.f114782aJ;
            C89219l.m154721d(bVar, "");
            if (C89219l.m154714a((Object) bVar.getFrom(), (Object) "from_chat_favorite_video_panel")) {
                ViewGroup viewGroup = (ViewGroup) aH_().getView();
                if (viewGroup instanceof FrameLayout) {
                    ConstraintLayout constraintLayout = new ConstraintLayout(this.f183419bv);
                    constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    int dimensionPixelSize = this.f183419bv.getResources().getDimensionPixelSize(R.dimen.it);
                    constraintLayout.setPadding(dimensionPixelSize, this.f183419bv.getResources().getDimensionPixelSize(R.dimen.iu), dimensionPixelSize, 0);
                    constraintLayout.setBackgroundColor(-16777216);
                    viewGroup.addView(constraintLayout, viewGroup.getChildCount());
                    TuxButton tuxButton = new TuxButton(this.f183419bv);
                    ConstraintLayout.C0547a aVar = new ConstraintLayout.C0547a(-1, -2);
                    aVar.f2270h = 0;
                    tuxButton.setLayoutParams(aVar);
                    tuxButton.setButtonSize(3);
                    tuxButton.setButtonVariant(0);
                    tuxButton.setText(R.string.fif);
                    tuxButton.setTextColor(-1);
                    constraintLayout.addView(tuxButton);
                    tuxButton.setOnClickListener(new View$OnClickListenerC41197e(this));
                    this.f96239d = tuxButton;
                }
            } else if (this.f183419bv.getIntent() != null && this.f183419bv.getIntent().getIntExtra("bottom_view_type", 0) == 1) {
                int intExtra = this.f183419bv.getIntent().getIntExtra("translation_status", 0);
                ViewGroup viewGroup2 = (ViewGroup) aH_().getView();
                if (viewGroup2 instanceof FrameLayout) {
                    View a = C1870c.m6046a(this.f183419bv, R.layout.we, viewGroup2, false);
                    a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
                    a.setBackgroundColor(-16777216);
                    View findViewById = a.findViewById(R.id.asm);
                    this.f96221H = findViewById;
                    if (intExtra == 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                    TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.aso);
                    this.f96222I = tuxTextView;
                    if (intExtra == 0) {
                        tuxTextView.setText(R.string.ag4);
                    } else if (intExtra == 1) {
                        tuxTextView.setText(R.string.afz);
                    } else if (intExtra == 2) {
                        tuxTextView.setText(R.string.afy);
                    } else if (intExtra == 3) {
                        tuxTextView.setText(R.string.afx);
                    }
                    viewGroup2.addView(a, viewGroup2.getChildCount());
                }
            } else if (!this.f96243h) {
                this.f96248m = CommentServiceImpl.m73664e().mo63278a(aH_().getView(), mo84913bY(), mo81096g(true), this, this);
            }
            ViewGroup viewGroup3 = (ViewGroup) aH_().getView();
            if (viewGroup3 != null && viewGroup3.findViewById(R.id.c4h) != null) {
                this.f96249n = viewGroup3.findViewById(R.id.c4h);
            } else if (viewGroup3 instanceof FrameLayout) {
                this.f96249n = C1870c.m6046a(this.f183419bv, R.layout.wk, viewGroup3, false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                viewGroup3.addView(this.f96249n, layoutParams);
                this.f96249n.setVisibility(8);
            } else if (viewGroup3 instanceof RelativeLayout) {
                this.f96249n = C1870c.m6046a(this.f183419bv, R.layout.wk, viewGroup3, false);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(14);
                layoutParams2.addRule(12);
                viewGroup3.addView(this.f96249n, layoutParams2);
                this.f96249n.setVisibility(8);
            }
            if (this.f96250o == null) {
                if (this.f96251p == null) {
                    this.f96251p = TcmServiceImpl.m135859j().mo121247a(viewGroup3, this.f183419bv);
                }
                this.f96250o = this.f96251p.mo121267a();
            }
            MethodCollector.m26664o(11936);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0081 A[EDGE_INSN: B:89:0x0081->B:25:0x0081 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70407p() {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.mo70407p():void");
    }

    /* renamed from: a */
    public final void mo70461a(int i) {
        this.f96217D = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41212t
    /* renamed from: i */
    public final void mo70498i(String str) {
        mo70423j(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo70471a(AbstractC49746c cVar) {
        this.f96253r = cVar;
    }

    @AbstractC90264r
    public void onCancelVideoCoverMaskEvent(C49674b bVar) {
        m82957r(bVar.f114331a);
    }

    /* renamed from: b */
    public final void mo70477b(boolean z) {
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63685a(z);
            if (z) {
                mo70435A();
            }
        }
    }

    /* renamed from: c */
    public final void mo70482c(String str) {
        AbstractC77713a af = mo70422af();
        if (af != null) {
            af.mo121204b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: e */
    public final void mo70490e(int i) {
        super.mo70490e(i);
        if (i == 1) {
            mo84739bN();
        } else if (i == 0) {
            mo84740bO();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: h */
    public final void mo70497h(String str) {
        if (mo84730bE()) {
            mo70423j(str);
            super.mo70497h(str);
        }
    }

    /* renamed from: e */
    private static List<Aweme> m82953e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Aweme aweme : list) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m82957r(boolean z) {
        AbstractC36413a aVar;
        boolean z2;
        Aweme bM = mo84738bM();
        if (bM != null && (aVar = this.f96248m) != null) {
            if (z || !C80635y.m139811f(bM)) {
                z2 = false;
            } else {
                z2 = true;
            }
            aVar.mo63691d(z2);
        }
    }

    /* renamed from: c */
    public final void mo70480c(Comment comment) {
        AbstractC77713a af;
        if (comment != null && (af = mo70422af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.mo121206c(comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
    /* renamed from: c_ */
    public final void mo70484c_(Exception exc) {
        if (mo84730bE()) {
            C33615a.m68848a((Context) this.f183419bv, (Throwable) exc, (int) R.string.cxf);
            DmtStatusView o = mo84794o(false);
            if (o != null) {
                o.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    public final void mo70488d(boolean z) {
        this.f114782aJ.setMyProfile(z);
        for (C49431d dVar : this.f114784aL.f113608a) {
            dVar.f113605h = z;
        }
    }

    /* renamed from: f */
    public final void mo70493f(String str) {
        ((TuxTextView) this.f96246k.findViewById(R.id.b87)).setText(str);
    }

    @AbstractC90264r
    public void onDislikeAwemeEvent(C49678f fVar) {
        if (fVar.f114345e == this.f183419bv.hashCode() && !this.f114781aI.booleanValue()) {
            mo84700a(fVar.f114341a, fVar.mo81454a());
        }
    }

    @AbstractC90264r
    public void onInterceptedResumePlayOnResume(C43313a aVar) {
        if (this.f183419bv != null && this.f183419bv.hashCode() == aVar.f101085a) {
            this.f96233bJ = !aVar.f101086b;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    @AbstractC90264r
    public void onVideoPlayerEvent(C71904j jVar) {
        int i = jVar.f161106c;
        if (i != 2 && i != 3) {
            return;
        }
        if (this.f96219F) {
            mo84762bo();
        } else {
            C79657g.m138462b();
        }
    }

    /* renamed from: a */
    private static String m82943a(long j) {
        if (j < 1000 || j >= 10000) {
            return C53437b.m98615a(j);
        }
        return new BigDecimal(j).divide(new BigDecimal(1000), 1, RoundingMode.HALF_UP).toString() + "K";
    }

    /* renamed from: b */
    public final void mo70475b(Comment comment) {
        AbstractC77713a af;
        if (comment != null && (af = mo70422af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.mo121202a(comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
    /* renamed from: b_ */
    public void mo61908b_(Exception exc) {
        if (mo84730bE()) {
            AbstractC81915c.m141874a(new C41129b(this.f114782aJ.getAid(), null, exc));
            C33615a.m68848a((Context) this.f183419bv, (Throwable) exc, (int) R.string.cxf);
            DmtStatusView o = mo84794o(false);
            if (o != null) {
                o.setVisibility(8);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: d */
    public final void mo70485d(int i) {
        if (this.f114768W != null && this.f114768W.mo80288e() != null) {
            Aweme aweme = this.f114768W.mo80288e().get(i);
            if (C76706a.m134277c(aweme) && C50545m.m94762a(aweme)) {
                mo62671b(i);
                mo70428v();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: e */
    public final String mo70489e(Aweme aweme) {
        if (!this.f96256u) {
            return "25";
        }
        if (this.f183419bv != null) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo121230b();
        }
        View m = mo84788m(false);
        if (m != null) {
            m.setAlpha(0.0f);
        }
        return super.mo70489e(aweme);
    }

    /* renamed from: f */
    public final void mo70494f(boolean z) {
        AbstractC48149ai aC = mo81108aC();
        if (aC instanceof AbstractC48234cd) {
            ((AbstractC48234cd) aC).mo70616a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: g */
    public final void mo70495g(String str) {
        super.mo70495g(str);
        AbstractC81915c.m141874a(new C41130c(str));
        if (!this.f96225bB) {
            this.f96225bB = true;
            C35434c.m72464b("detail_page");
        }
        RunnableC41193a aVar = this.f96231bH;
        if (aVar != null && !aVar.f96285a) {
            this.f96231bH.f96285a = true;
            C12895a.f31387b.f31389a.postDelayed(this.f96231bH, 16);
        }
    }

    @AbstractC90264r
    public void onCommentEvent(C36387c cVar) {
        Aweme aweme;
        if (!(cVar == null || (aweme = cVar.f86064d) == null)) {
            for (Aweme aweme2 : this.f114768W.mo80288e()) {
                if (aweme2.getAid().equals(aweme.getAid())) {
                    aweme2.setCommentSetting(aweme.getCommentSetting());
                }
            }
        }
    }

    @AbstractC90264r
    public void onDuetSettingEvent(C71896b bVar) {
        Aweme aweme;
        if (!(bVar == null || (aweme = bVar.f161085a) == null)) {
            for (Aweme aweme2 : this.f114768W.mo80288e()) {
                if (aweme2.getAid().equals(aweme.getAid())) {
                    aweme2.setDuetSetting(aweme.getDuetSetting());
                    aweme2.setReactSetting(aweme.getReactSetting());
                }
            }
        }
    }

    @AbstractC90264r
    public void onHideCommentInputFragmentEvent(C37837f fVar) {
        Activity activity = this.f183419bv;
        if (activity == null || fVar.f89332b != activity.hashCode()) {
            return;
        }
        if (fVar.f89331a) {
            AbstractC36413a aVar = this.f96248m;
            if (aVar != null) {
                aVar.mo63695i();
                return;
            }
            return;
        }
        Fragment aH_ = aH_();
        if (aH_ != null && aH_.getUserVisibleHint()) {
            mo70387m();
            mo70403T();
        }
    }

    @AbstractC90264r
    public void onShareCompleteEvent(C56257j jVar) {
        if (this.f96246k != null && TextUtils.equals("live_event", jVar.f128321d)) {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            try {
                View view = ((ActivityC0945e) this.f183419bv).getSupportFragmentManager().mo3551a("com.bytedance.android.livesdk.browser.fragment.WebDialogFragment").getView();
                Activity activity = this.f183419bv;
                if (view != null && createIIMServicebyMonsterPlugin != null) {
                    createIIMServicebyMonsterPlugin.showIMSnackbar(activity, view, jVar);
                }
            } catch (Error unused) {
            }
        }
    }

    @AbstractC90264r
    public void onShowAdLayoutEvent(C33312a aVar) {
        AbstractC36413a aVar2;
        if (this.f114768W.mo80287c(this.f114770Y) != null && TextUtils.equals(aVar.f79141b, this.f114768W.mo80287c(this.f114770Y).getAid())) {
            boolean z = aVar.f79140a;
            if (this.f114768W.mo80287c(this.f114770Y) != null && (aVar2 = this.f96248m) != null) {
                aVar2.mo63689c(z);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onStoryCommentEvent(C36397l lVar) {
        AbstractC77713a af;
        Comment comment = lVar.f86084b;
        int i = lVar.f86083a;
        if (i == 1) {
            mo70475b(comment);
        } else if (i == 2) {
            mo70480c(comment);
        } else if (i == 3 && comment != null && (af = mo70422af()) != null) {
            comment.getCid();
            comment.getFakeId();
            comment.getText();
            af.mo121208d(comment);
        }
    }

    @AbstractC90264r
    public void onVideoCleanModeEvent(C50449b bVar) {
        AbstractC48149ai bk;
        if (this == bVar.f116517c && (bk = mo84758bk()) != null && bVar.f116516b != null && bk.mo80206b() != null && bVar.f116516b.getAid().equals(bk.mo80206b().getAid())) {
            bk.mo80095b(bVar.f116515a);
        }
    }

    /* renamed from: d */
    static CaptionItemModel m82951d(Aweme aweme) {
        if (!(aweme == null || aweme.getVideo() == null || aweme.getVideo().getCaptionModel() == null || aweme.getVideo().getCaptionModel().getCaptionList() == null || aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage() == null)) {
            long languageId = aweme.getVideo().getCaptionModel().getOriginalCaptionLanguage().getLanguageId();
            for (CaptionItemModel captionItemModel : aweme.getVideo().getCaptionModel().getCaptionList()) {
                if (captionItemModel.getLanguageId() != languageId) {
                    return captionItemModel;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private void mo70423j(String str) {
        if (mo84730bE()) {
            if (C50539g.m94752e(mo84754bg())) {
                mo84761bn();
            }
            if (this.f114817as == null || !this.f114817as.mo70688a(str)) {
                C51423a.m95791b(6, "DeleteAweme", "mDeleteItemListener.deleteItem " + str + " failed");
                m82956r(str);
                return;
            }
            mo70428v();
        }
    }

    /* renamed from: r */
    private void m82956r(String str) {
        if (!(str == null || this.f114768W == null || this.f114768W.mo80288e() == null)) {
            List<Aweme> e = this.f114768W.mo80288e();
            for (int i = 0; i < e.size(); i++) {
                Aweme aweme = e.get(i);
                if (C76706a.m134277c(aweme) && C50545m.m94762a(aweme)) {
                    mo84685a(i, str);
                } else if (aweme != null && str.equals(aweme.getAid())) {
                    mo62671b(i);
                    mo70428v();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m82958t(com.p2082ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.m82958t(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C51423a.m95791b(6, "DetailFragmentPanel", "showLoadError mDetailInputFragment.enterCleanMode() " + Log.getStackTraceString(exc));
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63690d();
        }
        C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.g1i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        if (mo84730bE()) {
            this.f114758M.mo85751b();
            this.f96228bE = false;
            this.f96238c = false;
            C33615a.m68848a(C17867d.m33078a(), (Throwable) exc, (int) R.string.g1i);
        }
    }

    /* renamed from: e */
    public final void mo70491e(String str) {
        MethodCollector.m26663i(11272);
        ViewStub viewStub = (ViewStub) this.f96246k.findViewById(R.id.b88);
        if (viewStub == null) {
            MethodCollector.m26664o(11272);
            return;
        }
        viewStub.inflate();
        mo70493f(str);
        MethodCollector.m26664o(11272);
    }

    @AbstractC90264r
    public void onAwemeDeleteEvent(C49677e eVar) {
        Aweme aweme;
        if (TextUtils.equals(this.f114782aJ.getEventType(), eVar.f114339b) && (aweme = eVar.f114338a) != null && this.f114817as != null && this.f114817as.mo70687a(aweme)) {
            mo84717aY();
            this.f114768W.notifyDataSetChanged();
            if (this.f114768W.getCount() == 3) {
                AbstractC81915c.m141874a(new C49685m("from_full_recommend"));
            }
            this.f114759N.post(new RunnableC41203k(this));
            mo70402H();
        }
    }

    @AbstractC90264r
    public void onCommentDialogEvent(C49676d dVar) {
        boolean z;
        Activity activity = this.f183419bv;
        if (activity != null && !activity.isFinishing() && dVar.f114335d == activity.hashCode()) {
            boolean z2 = false;
            if (dVar.f114332a == 1) {
                z = true;
            } else {
                z = false;
            }
            mo84777h(z);
            if (dVar.f114332a == 1) {
                z2 = true;
            }
            mo84780i(z2);
            if (dVar.f114332a == 1) {
                AbstractC36413a aVar = this.f96248m;
                if (aVar != null) {
                    aVar.mo63695i();
                    return;
                }
                return;
            }
            Fragment aH_ = aH_();
            if (aH_ != null && aH_.getUserVisibleHint()) {
                mo70387m();
                mo70403T();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41178b(com.p2082ss.android.ugc.aweme.feed.param.C49812b r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.<init>(com.ss.android.ugc.aweme.feed.param.b):void");
    }

    /* renamed from: d */
    private static List<Aweme> m82952d(List<Aweme> list) {
        if (!C48334h.m91798a().fullscreenShowLive()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Aweme aweme : list) {
                if (aweme.isLive()) {
                    StreamUrlModel streamUrlModel = aweme.getStreamUrlModel();
                    if (!(aweme.getRoom() == null || streamUrlModel == null || TextUtils.isEmpty(streamUrlModel.f114481id))) {
                        C80749k.m140049a().f180547b.put(streamUrlModel.f114481id, RoomStruct.fromAweme(aweme));
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70406b(Aweme aweme) {
        long playCount;
        String g = mo81096g(true);
        if (this.f96249n != null) {
            if (m82958t(aweme)) {
                this.f96249n.setVisibility(8);
                if (TcmServiceImpl.m135859j().mo121256a(aweme, mo81096g(true))) {
                    mo70477b(false);
                    this.f96251p.mo121268a(aweme);
                    return;
                }
                this.f96251p.mo121269b();
                mo70477b(true);
                return;
            }
            this.f96249n.setVisibility(0);
            mo70477b(false);
            C39162r.m79460a("analytics_banner_show", new C33744d().mo59983a("enter_from", g).mo59983a("group_id", aweme.getAid()).f79943a);
            TextView textView = (TextView) this.f96249n.findViewById(R.id.ex8);
            AwemeStatistics statistics = aweme.getStatistics();
            long j = 0;
            if (statistics == null) {
                playCount = 0;
            } else {
                playCount = statistics.getPlayCount();
            }
            String quantityString = this.f183419bv.getResources().getQuantityString(R.plurals.s, (int) playCount, m82943a(playCount));
            if (statistics != null) {
                j = statistics.getShareCount();
            }
            textView.setText(quantityString + this.f183419bv.getResources().getString(R.string.b94) + " " + this.f183419bv.getResources().getQuantityString(R.plurals.r, (int) j, m82943a(j)));
            this.f96249n.setOnClickListener(new View$OnClickListenerC41205m(this, aweme));
        }
    }

    /* renamed from: c */
    public void mo70395c(List<Aweme> list) {
        if (this.f114768W != null) {
            int count = this.f114768W.getCount();
            this.f114768W.mo80286a(list);
            int count2 = this.f114768W.getCount();
            if (count < count2 && list != null && list.size() >= count2) {
                C81067m.C81070a.m140763a().mo124528a(list.subList(count, count2), !this.f96238c, mo84702aJ());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: e */
    public final void mo70492e(boolean z) {
        super.mo70492e(z);
        if (z) {
            mo70387m();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final AbstractC49815a mo70460a(C49812b bVar) {
        if (bVar.isExposeSharerMsg() && !TextUtils.isEmpty(bVar.getAid())) {
            if (this.f96260y == null) {
                this.f96260y = new C49621g();
            }
            C49621g gVar = this.f96260y;
            C89219l.m154721d(bVar, "");
            gVar.mo81415a(bVar.getAid(), bVar.getShareParamLinkId(), bVar.getShareParamUtmSource(), bVar.getShareParamUserId(), bVar.getShareParamSecUserId(), bVar.isExposeSharerMsg(), bVar.getShareCheckSum(), bVar.getShareTimeStamp());
        }
        this.f114781aI = Boolean.valueOf(bVar.isPlaylistCleanMode());
        if (!(bVar.extra == null || !bVar.extra.containsKey("is_from_add_video_chain") || this.f114783aK == null)) {
            this.f114783aK.f113718k = true;
        }
        return super.mo70460a(bVar);
    }

    /* renamed from: b */
    public void mo70476b(List<Aweme> list) {
        if (!C13603b.m24435a((Collection) list)) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                Aweme aweme = list.get(i);
                if (aweme == null || !TextUtils.equals(aweme.getAid(), this.f114782aJ.getAid())) {
                    i++;
                } else if (i != -1 && i < this.f114768W.getCount()) {
                    if (!(this.f114768W == null || this.f114759N.getExpectedAdapterCount() == this.f114768W.getCount())) {
                        this.f114768W.notifyDataSetChanged();
                    }
                    this.f114759N.mo67973a(i, false);
                    mo70406b(list.get(i));
                    return;
                }
            }
        }
        if (list.size() > 0) {
            mo70406b(list.get(0));
        }
    }

    /* renamed from: c */
    public final void mo70481c(Aweme aweme) {
        if (("message".equals(this.f114782aJ.getEventType()) || "chat".equals(this.f114782aJ.getEventType()) || "push".equals(this.f114782aJ.getEventType()) || "like_list".equals(this.f114782aJ.getEventType()) || "notification_page".equals(this.f114782aJ.getEventType()) || "click_comment_chain".equals(this.f114782aJ.getEventType()) || "click_comment_bubble".equals(this.f114782aJ.getEventType()) || "collection_comment".equals(this.f114782aJ.getEventType()) || "question_list".equals(this.f114782aJ.getEventType())) && ((!TextUtils.isEmpty(this.f114782aJ.getCid()) || this.f114782aJ.isCommentForceOpenReply()) && this.f114782aJ.getCommentDeleted() == 0)) {
            if (this.f114782aJ.getCommentDeleted() == 0 && this.f114782aJ.getLevel1CommentDeleted() == 1) {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.dht).mo123053a();
            } else if (!C80635y.m139811f(aweme)) {
                mo70469a(mo70429y(), this.f114782aJ.getCid(), 0);
                return;
            }
        }
        if (!TextUtils.isEmpty(this.f114782aJ.getVid())) {
            mo84722b(mo70429y(), this.f114782aJ.getVid());
        } else if (!TextUtils.isEmpty(this.f114782aJ.getLikeListIds())) {
            mo70470a(mo70429y(), this.f114782aJ.getLikeListIds(), this.f114782aJ.getLikeCount(), 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: d */
    public final void mo70486d(Exception exc) {
        if (mo84730bE()) {
            if (exc instanceof C34485a) {
                C34480a aVar = (C34480a) exc;
                if (aVar.getErrorCode() == 2130) {
                    C33615a.m68848a((Context) this.f183419bv, (Throwable) exc, (int) R.string.h78);
                } else if (aVar.getErrorCode() == 2752) {
                    if (mo81109aD() == null || mo81109aD().getCommerceVideoAuthInfo() == null || mo81109aD().getCommerceVideoAuthInfo().getAuthStatus() != 2) {
                        C33615a.m68847a((Context) this.f183419bv, exc, (int) R.string.d0w);
                    }
                    C59206ab.m108755a("promote_layer_show").mo96746b("enter_from", this.f114782aJ.getEventType()).mo96746b("content", "delete_fail").mo96746b("group_id", this.f114782aJ.getAid()).mo96792f();
                }
            } else {
                C33615a.m68848a((Context) this.f183419bv, (Throwable) exc, (int) R.string.b5_);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: d */
    public final void mo70487d(String str) {
        String str2;
        if (!mo84730bE() || C49527r.m92769b() == 0 || !C48314ai.m91747a()) {
            return;
        }
        if (TextUtils.equals(this.f96220G, str)) {
            int i = this.f96214A + 1;
            this.f96214A = i;
            if (i >= C49527r.m92768a() && !C49592h.C49593a.f114095a.mo81382a(str)) {
                if (C79657g.m138466c(mo81109aD())) {
                    C33744d a = new C33744d().mo59983a(C29919b.f71386n, "detail").mo59983a(C29919b.f71390r, str);
                    if (C49527r.m92769b() == 1) {
                        str2 = "double";
                    } else {
                        str2 = "triple";
                    }
                    C39162r.m79460a("share_highlight", a.mo59983a("repeat", str2).mo59983a("highlight_cause", "loop2").f79943a);
                    AbstractC48148ah bj = mo84757bj();
                    if (bj != null) {
                        bj.mo80098L();
                    }
                }
                if (this.f96214A == 2) {
                    C33830n.m70668a("awe_share_guide_type_log", new C33743c().mo59976a("awe_share_guide_type", C48314ai.m91750c()).mo59977a());
                }
            } else if (this.f96214A == 2) {
                C33830n.m70668a("awe_share_guide_type_log", new C33743c().mo59976a("awe_share_guide_type", "none").mo59977a());
            }
        } else {
            this.f96214A = 1;
            this.f96220G = str;
        }
    }

    /* renamed from: b */
    public final boolean mo70478b(String str) {
        AbstractC77713a af = mo70422af();
        if (af == null) {
            return false;
        }
        return af.mo121203a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x
    /* renamed from: c */
    public final void mo70483c(boolean z) {
        this.f96228bE = z;
    }

    /* renamed from: c */
    private int m82950c(List<Aweme> list, int i) {
        Aweme aweme;
        int indexOf;
        if (C13603b.m24435a((Collection) list)) {
            return -1;
        }
        List<Aweme> e = this.f114768W.mo80288e();
        if (!C13603b.m24435a((Collection) e) && (aweme = e.get(this.f114770Y)) != null && (indexOf = list.indexOf(aweme) - i) >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo70462a(int i, float f) {
        boolean z;
        Aweme c;
        float max;
        float max2;
        if (f != 0.0f && this.f114768W.getCount() > this.f114770Y + 1) {
            if (this.f114770Y == i) {
                z = true;
            } else {
                z = false;
            }
            Aweme c2 = this.f114768W.mo80287c(this.f114770Y);
            if (z) {
                c = this.f114768W.mo80287c(this.f114770Y + 1);
            } else {
                c = this.f114768W.mo80287c(i);
            }
            if (c2.getAwemeType() == c.getAwemeType()) {
                return;
            }
            if (c2.getAwemeType() != 101 && c.getAwemeType() != 101) {
                return;
            }
            if (c2.getAwemeType() == 101) {
                if (z) {
                    max2 = Math.max(f - 0.5f, 0.0f);
                } else {
                    max2 = Math.max(0.5f - f, 0.0f);
                }
                AbstractC41111a aVar = this.f96257v;
                if (aVar != null) {
                    aVar.mo70368a(max2 * 2.0f);
                }
                AbstractC36413a aVar2 = this.f96248m;
                if (aVar2 != null) {
                    aVar2.mo63683a(max2 * 2.0f);
                }
            } else if (c.getAwemeType() == 101) {
                if (z) {
                    max = Math.max(0.5f - f, 0.0f);
                } else {
                    max = Math.max(f - 0.5f, 0.0f);
                }
                AbstractC41111a aVar3 = this.f96257v;
                if (aVar3 != null) {
                    aVar3.mo70368a(max * 2.0f);
                }
                AbstractC36413a aVar4 = this.f96248m;
                if (aVar4 != null) {
                    aVar4.mo63683a(max * 2.0f);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public void mo59517b(List<Aweme> list, boolean z) {
        RunnableC41193a aVar = this.f96231bH;
        if (aVar != null) {
            boolean z2 = true;
            boolean z3 = !this.f96261z;
            if (aVar.f96286b != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                C12895a.f31387b.f31389a.removeCallbacks(this.f96231bH);
                this.f96231bH = null;
            }
        }
        if (mo84730bE() && !C13603b.m24435a((Collection) list)) {
            this.f96242g = z;
            DmtStatusView a = this.f114758M.mo85748a(false);
            if (a != null) {
                a.mo27383e();
            }
            if (!z) {
                this.f114758M.mo85752c();
            } else {
                this.f114758M.mo85753d();
            }
            if (!this.f96261z) {
                if (list.get(0) instanceof FollowFeed) {
                    list = C67847a.f152048a.mo86500a(list);
                } else if ("homepage_fresh".equalsIgnoreCase(this.f114782aJ.getEventType())) {
                    list = m82952d(list);
                }
            }
            List<Aweme> e = m82953e(list);
            this.f114768W.f111624b = z;
            mo70395c(e);
            final int a2 = C50545m.m94760a(e, this.f114768W.mo80287c(this.f114759N.getCurrentItem()));
            if (!this.f96228bE && this.f96238c) {
                this.f114759N.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.RunnableC4118414 */

                    static {
                        Covode.recordClassIndex(49067);
                    }

                    public final void run() {
                        if (a2 < C41178b.this.f114768W.getCount() - 1 && C41178b.this.f114759N != null) {
                            C41178b.this.f114770Y = a2 + 1;
                            C41178b.this.f114800ab = true;
                            C41178b.this.f114759N.setCurrentItemWithDefaultVelocity(C41178b.this.f114770Y);
                        }
                    }
                });
            }
            this.f96228bE = false;
            this.f96238c = false;
            mo70420ad();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public void mo59523c(List<Aweme> list, boolean z) {
        boolean z2;
        final int i;
        if (mo84730bE()) {
            this.f114778aF.setRefreshing(false);
            this.f114768W.f111625c = z;
            String from = this.f114782aJ.getFrom();
            if (z || this.f96228bE || TextUtils.equals("from_mix_detail_item", from)) {
                if (!this.f96228bE || C13603b.m24435a((Collection) list) || this.f114768W.getCount() == list.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f114822ax = z2;
                if (TextUtils.equals("from_rn_search", from) || TextUtils.equals("from_visual_search_result", from)) {
                    i = m82950c(list, 0);
                } else if (TextUtils.equals("from_chat", from)) {
                    i = m82950c(list, 1);
                } else if (TextUtils.equals("from_following_sky_light", from)) {
                    i = m82950c(list, 1);
                } else if (TextUtils.equals("from_mix_detail_item", from)) {
                    this.f114770Y = this.f114759N.getCurrentItem();
                    i = m82950c(list, 0);
                    this.f114770Y = i;
                } else {
                    i = -1;
                }
                mo70395c(list);
                if (!this.f96228bE) {
                    this.f114759N.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b.RunnableC411852 */

                        static {
                            Covode.recordClassIndex(49068);
                        }

                        public final void run() {
                            if (C41178b.this.f114759N != null) {
                                C41178b.this.f114800ab = true;
                                int i = i;
                                if (i > 0) {
                                    C41178b.this.f114770Y = i;
                                    C41178b.this.f114759N.setCurrentItemWithDefaultVelocity(C41178b.this.f114770Y);
                                    return;
                                }
                                C41178b.this.f114770Y = 0;
                                C41178b.this.f114759N.mo67973a(C41178b.this.f114770Y, false);
                            }
                        }
                    });
                }
            } else if (this.f114989bu) {
                new C79459a(this.f183419bv).mo123050a(R.string.b3f).mo123053a();
                if (this.f114759N.getCurrentItem() > 1) {
                    this.f114759N.mo67973a(0, false);
                } else {
                    this.f114759N.setCurrentItemWithDefaultVelocity(0);
                }
            }
            this.f96228bE = false;
            mo70420ad();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo70463a(int i, boolean z) {
        Aweme c = this.f114768W.mo80287c(i);
        if (this.f114989bu) {
            if (z) {
                String aid = this.f114782aJ.getAid();
                C51423a.m95791b(4, f114752J, "allowAwemeChangeForFirstTime:" + z + ",aid:" + aid);
                if (!TextUtils.isEmpty(aid) && (c == null || !TextUtils.equals(aid, c.getAid()))) {
                    C51423a.m95791b(4, f114752J, "allowAwemeChangeForFirstTime->getAid is not null");
                    return;
                }
            }
            AwemeChangeCallBack.m108596a((ActivityC0945e) this.f183419bv, c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo70464a(long j, long j2) {
        AbstractC48148ah bj = mo84757bj();
        if (!(bj == null || bj.mo80119ad() == null || j < 0)) {
            Handler handler = this.f96236by;
            bj.getClass();
            handler.postDelayed(RunnableC41201i.m83063a(bj), j);
        }
        PopupWindow popupWindow = this.f96240e;
        if (popupWindow != null && popupWindow.isShowing() && j2 >= 0) {
            this.f96236by.postDelayed(new RunnableC41202j(this), j2);
        }
        C79657g.m138465c();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo70465a(MotionEvent motionEvent, AbstractC48149ai aiVar, Aweme aweme) {
        if (!this.f114782aJ.isVideoFromDcd()) {
            super.mo70465a(motionEvent, aiVar, aweme);
        }
    }

    /* renamed from: a */
    private void m82945a(AbstractC48149ai aiVar, boolean z, int i) {
        if (aiVar != null && aiVar.mo80206b() != null) {
            if (!this.f114782aJ.getEventType().equals("opus")) {
                C39162r.m79455a(UGCMonitor.EVENT_COMMENT, this.f114782aJ.getEventType(), this.f114782aJ.getAid(), 0);
            } else if (this.f114782aJ.isMyProfile()) {
                C39162r.m79455a(UGCMonitor.EVENT_COMMENT, "personal_homepage", this.f114782aJ.getAid(), 0);
            } else {
                C39162r.m79455a(UGCMonitor.EVENT_COMMENT, "others_homepage", this.f114782aJ.getAid(), 0);
            }
            m82944a(aiVar, mo81096g(true), z, i);
        }
    }

    /* renamed from: a */
    private void m82944a(AbstractC48149ai aiVar, String str, boolean z, int i) {
        String str2;
        String str3;
        String searchResultId = this.f114782aJ.getSearchResultId();
        if (TextUtils.isEmpty(searchResultId)) {
            searchResultId = C59208ac.m108771e(aiVar.mo80206b());
        }
        int i2 = -1;
        Aweme y = mo70429y();
        String str4 = "";
        String str5 = UGCMonitor.TYPE_POST;
        boolean z2 = false;
        if (y != null) {
            Aweme y2 = mo70429y();
            if (y2.getBottomBarModel() != null) {
                z2 = true;
            }
            i2 = C76598h.m134176a(y2.getAuthor());
            if (C76706a.m134278d(y2)) {
                str5 = "story";
            }
            str2 = C76706a.m134276b(y2);
        } else {
            str2 = str4;
        }
        if (!(mo81109aD() == null || mo81109aD().playlist_info == null)) {
            str4 = mo81109aD().playlist_info.getMixId();
        }
        C59210ae a = new C59210ae().mo96747a(str);
        a.f134799d = "click_bottom_comment_tab";
        if (z) {
            str3 = "close_text_button_send";
        } else {
            str3 = "button_send";
        }
        a.f134777ag = str3;
        a.f134807v = str;
        a.f134750X = FeedParamProvider.C49809a.m93270a(this.f183419bv).getPreviousPagePosition();
        a.f134751Y = z2;
        C59210ae f = a.mo96749g(aiVar.mo80206b());
        f.f134798c = String.valueOf(this.f96217D);
        C59210ae aeVar = (C59210ae) f.mo96810l(this.f114782aJ.getSearchId()).mo96804f(searchResultId);
        aeVar.f134806u = str4;
        aeVar.f134783am = this.f114782aJ.getCategoryName();
        aeVar.f134776af = i2;
        aeVar.f135223W = str5;
        C59210ae aeVar2 = (C59210ae) aeVar.mo96752b_(str2);
        aeVar2.f134787aq = i;
        AbstractC59233c a2 = aeVar2.mo96788a(C80632w.m139800a(aiVar.mo80206b(), "post_comment", str)).mo96788a(C50560y.m94792b(this.f114782aJ.getPreviousPage(), this.f114782aJ.getFromGroupId()));
        C79900c.m138667a(a2, mo70429y(), str);
        a2.mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final AbstractC48191b mo70459a(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
        if (C41127g.m82828b(this.f114782aJ.getFrom())) {
            return new C48302w(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
        }
        return new C41123f(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
    }
}
