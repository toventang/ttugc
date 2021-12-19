package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p122a.C2541b;
import com.bytedance.p122a.C2543d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23129d;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23158e;
import com.bytedance.tux.p1722h.C23159f;
import com.kakao.usermgmt.StringSet;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35502b;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35672z;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38167al;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.C38480a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.C38486c;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39074m;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.common.p2632d.C39092a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.detail.transition.AbstractC41336c;
import com.p2082ss.android.ugc.aweme.detail.transition.C41327a;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.detail.transition.C41337d;
import com.p2082ss.android.ugc.aweme.detail.transition.FeedShareElementInfo;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.experiment.C46934fk;
import com.p2082ss.android.ugc.aweme.experiment.C46937fn;
import com.p2082ss.android.ugc.aweme.experiment.C47033k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49695w;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59402b;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59403c;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59405e;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59406f;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59407g;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59408h;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2433ca.C35345c;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2436cc.C35435d;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;
import com.p2082ss.android.ugc.aweme.p2715cs.C40748a;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63753j;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63347b;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63351c;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63372l;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63408v;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63495b;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63762ab;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63775e;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63781k;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63782l;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63785n;
import com.p2082ss.android.ugc.aweme.profile.p3575f.CallableC63780j;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64013bc;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63833b;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63843j;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63861y;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63862z;
import com.p2082ss.android.ugc.aweme.profile.service.C63867b;
import com.p2082ss.android.ugc.aweme.profile.service.C63868c;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68067b;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68071f;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.C68570bv;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.ProfileStoryApi;
import com.p2082ss.android.ugc.aweme.story.archive.C76460a;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76619a;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76620b;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.C76626d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.p2082ss.android.ugc.aweme.story.model.C77380c;
import com.p2082ss.android.ugc.aweme.story.model.C77381d;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.userstory.C77693b;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.C80541ho;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C80654ab;
import com.p2082ss.android.ugc.aweme.views.AbstractC81445m;
import com.p2082ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.c */
public class C64066c extends AbstractC64005b implements AbstractC39063h.AbstractC39067a, AbstractC39097c<C63351c>, AbstractC39102c<Aweme>, AbstractC39103d<Aweme>, AbstractC49762o, AbstractC63990as, AbstractC76618d, AbstractC76618d, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    protected ViewStub f145301A;

    /* renamed from: B */
    protected View f145302B;

    /* renamed from: C */
    protected boolean f145303C;

    /* renamed from: D */
    View f145304D;

    /* renamed from: E */
    public String f145305E;

    /* renamed from: F */
    public View f145306F;

    /* renamed from: G */
    AbstractC88412b f145307G;

    /* renamed from: H */
    protected ProfileViewModel f145308H;

    /* renamed from: I */
    protected C39092a f145309I;

    /* renamed from: J */
    public AbstractC63985aq.AbstractC63988c f145310J;

    /* renamed from: K */
    private LinearLayout f145311K;

    /* renamed from: L */
    private String f145312L;

    /* renamed from: M */
    private String f145313M;

    /* renamed from: Q */
    private String f145314Q;

    /* renamed from: R */
    private AbstractC88412b f145315R;

    /* renamed from: S */
    private int f145316S;

    /* renamed from: T */
    private boolean f145317T = true;

    /* renamed from: U */
    private boolean f145318U;

    /* renamed from: V */
    private C76460a f145319V;

    /* renamed from: W */
    private C64013bc f145320W;

    /* renamed from: X */
    private boolean f145321X;

    /* renamed from: Y */
    private boolean f145322Y;

    /* renamed from: Z */
    private boolean f145323Z;

    /* renamed from: aa */
    private Aweme f145324aa;

    /* renamed from: ab */
    private String f145325ab;

    /* renamed from: ac */
    private boolean f145326ac;

    /* renamed from: ad */
    private boolean f145327ad;

    /* renamed from: ae */
    private boolean f145328ae;

    /* renamed from: af */
    private boolean f145329af;

    /* renamed from: ag */
    private Boolean f145330ag = false;

    /* renamed from: ah */
    private boolean f145331ah = false;

    /* renamed from: ai */
    private String f145332ai;

    /* renamed from: aj */
    private String f145333aj;

    /* renamed from: ak */
    private String f145334ak;

    /* renamed from: al */
    private boolean f145335al = false;

    /* renamed from: am */
    private MineUserStoryFetcher f145336am = new MineUserStoryFetcher((byte) 0);

    /* renamed from: an */
    private boolean f145337an = true;

    /* renamed from: ao */
    private boolean f145338ao = false;

    /* renamed from: ap */
    private IDraftService.DraftListener f145339ap = new IDraftService.DraftListenerAdapter() {
        /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.C640693 */

        static {
            Covode.recordClassIndex(75513);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftClean() {
            if (C64066c.this.f145346j && C64066c.this.f145345e == 0) {
                C64066c.this.mo103678o();
                C64066c.this.mo103702x();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftDelete(C43223c cVar) {
            C77283a.m135111b("AwemeListFragmentImpl", "onDraftDelete -> delete draft");
            if (C64066c.this.f145346j && C64066c.this.f145345e == 0) {
                C64066c.this.mo103658I();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener, com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter
        public final void onDraftUpdate(C43223c cVar) {
            if (C64066c.this.f145346j && C64066c.this.f145345e == 0) {
                C64066c.this.mo103658I();
            }
        }
    };

    /* renamed from: aq */
    private boolean f145340aq = false;

    /* renamed from: ar */
    private boolean f145341ar = false;

    /* renamed from: b */
    protected User f145342b;

    /* renamed from: c */
    protected String f145343c;

    /* renamed from: d */
    protected String f145344d;

    /* renamed from: e */
    protected int f145345e;

    /* renamed from: j */
    protected boolean f145346j;

    /* renamed from: k */
    protected boolean f145347k;

    /* renamed from: l */
    protected boolean f145348l;

    /* renamed from: m */
    protected int f145349m = -1;

    /* renamed from: n */
    protected RecyclerView f145350n;

    /* renamed from: o */
    public String f145351o = "";

    /* renamed from: p */
    protected C63347b f145352p;

    /* renamed from: q */
    protected WrapGridLayoutManager f145353q;

    /* renamed from: r */
    public C39101b<AbstractC39100a> f145354r;

    /* renamed from: s */
    protected DmtStatusView f145355s;

    /* renamed from: t */
    protected AbstractC63985aq.AbstractC63986a f145356t;

    /* renamed from: u */
    protected boolean f145357u = true;

    /* renamed from: v */
    protected DmtStatusView.C17269a f145358v;

    /* renamed from: w */
    protected boolean f145359w;

    /* renamed from: y */
    protected boolean f145360y = true;

    /* renamed from: z */
    public boolean f145361z;

    static {
        Covode.recordClassIndex(75510);
    }

    /* renamed from: d */
    private static boolean m115911d(int i) {
        return i == 4;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: A */
    public final void mo103555A() {
        this.f145359w = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo103571a() {
        return R.layout.an0;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final boolean mo62670a(C39108i<Aweme> iVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Aweme> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(97, new RunnableC90250g(C64066c.class, "onPrivateModelEvent", C49695w.class, ThreadMode.POSTING, 0, false));
        hashMap.put(322, new RunnableC90250g(C64066c.class, "onMixDeleteEvent", C59406f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(2, new RunnableC90250g(C64066c.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, true));
        hashMap.put(350, new RunnableC90250g(C64066c.class, "onGuideCardChange", C63372l.class, ThreadMode.MAIN, 0, false));
        hashMap.put(351, new RunnableC90250g(C64066c.class, "onPublishStatusUpdate", C71900f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(352, new RunnableC90250g(C64066c.class, "onMixCreatedEvent", C59405e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(353, new RunnableC90250g(C64066c.class, "onProAccountStateChangeEvent", C68067b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(354, new RunnableC90250g(C64066c.class, "checkRemoveTalentAdData", C38480a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(355, new RunnableC90250g(C64066c.class, "onDarkmodeStatusEvent", C63495b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(71, new RunnableC90250g(C64066c.class, "onUpdateWhoCanSeeMyLikeListModeEvent", C68570bv.class, ThreadMode.MAIN, 0, false));
        hashMap.put(36, new RunnableC90250g(C64066c.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(356, new RunnableC90250g(C64066c.class, "onRemoveVideoFromMix", C59408h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(33, new RunnableC90250g(C64066c.class, "onDynamicEvent", C35502b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(357, new RunnableC90250g(C64066c.class, "onSwitchCreatorAccountSuccessEvent", C68071f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(72, new RunnableC90250g(C64066c.class, "onUpdateUserEvent", C34572c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(34, new RunnableC90250g(C64066c.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(358, new RunnableC90250g(C64066c.class, "checkRemoveTalentAdData", C59402b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(52, new RunnableC90250g(C64066c.class, "onSwitchBusinessAccountSuccessEvent", C68070e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(359, new RunnableC90250g(C64066c.class, "onMixManageDoneClickEvent", C59407g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(130, new RunnableC90250g(C64066c.class, "onChangePlayListNameEvent", C59403c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        return this.f145338ao;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: b */
    public void mo102299b(boolean z) {
        if (this.f145321X != z) {
            if (this.f145303C) {
                m115874N();
            }
            this.f145321X = z;
            m115882V();
            this.f145355s.mo27385g();
        }
    }

    /* renamed from: a */
    private void m115895a(C43223c cVar) {
        C63347b bVar = this.f145352p;
        if (bVar != null && !bVar.f143779B) {
            bVar.f143800h = cVar;
            bVar.f143796d = true;
            bVar.notifyDataSetChanged();
        }
        DmtStatusView dmtStatusView = this.f145355s;
        if (dmtStatusView != null && !dmtStatusView.mo27389j()) {
            this.f145355s.mo27382d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103666a(FeedItemList feedItemList) {
        if (C13603b.m24435a((Collection) feedItemList.getItems())) {
            mo98052k();
            return;
        }
        C63833b bVar = (C63833b) this.f145354r.f92286h;
        Message obtainMessage = bVar.mHandler.obtainMessage(0);
        obtainMessage.obj = feedItemList;
        bVar.handleMsg(obtainMessage);
        getActivity();
        if (m115877Q()) {
            mo98052k();
        } else {
            this.f145357u = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo103663a(IAVDraftService iAVDraftService) {
        try {
            C63867b.f144793a.checkToTransformMusDraft();
            C29339a.m58754b(new RunnableC64160l(this, iAVDraftService.draftList(false)));
            return null;
        } catch (Throwable th) {
            C51423a.m95790a(th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103668a(boolean z, C59864a aVar) {
        User curUser = C31575b.m65865g().getCurUser();
        if (aVar != null) {
            List<C59867d> mixList = aVar.getMixList();
            if (!this.f145346j || !curUser.isSecret()) {
                if (z) {
                    if (m115878R().booleanValue() || !this.f145346j) {
                        if (mixList != null) {
                            if (mixList.size() > 0) {
                                this.f145352p.mo101977a(true, aVar);
                                return;
                            } else if (mixList.size() == 0 && this.f145346j && MixFeedService.m109435k().mo97330f()) {
                                this.f145352p.mo101977a(true, (C59864a) null);
                                return;
                            } else if (mixList.size() != 0) {
                                return;
                            }
                        } else if (this.f145346j && MixFeedService.m109435k().mo97330f()) {
                            this.f145352p.mo101977a(true, (C59864a) null);
                            return;
                        }
                        if (this.f145346j) {
                            return;
                        }
                    } else {
                        this.f145352p.mo101977a(false, (C59864a) null);
                        return;
                    }
                }
                this.f145352p.mo101977a(false, (C59864a) null);
                return;
            }
            this.f145352p.mo101977a(false, (C59864a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103669a(boolean z, C77381d dVar) {
        this.f145318U = false;
        C77380c detail = dVar.getDetail();
        boolean n = this.f145352p.mo101981n();
        this.f145352p.mo101976a(detail);
        if (this.f145352p.mo101984q()) {
            if (z && !this.f145355s.mo27389j() && !this.f145355s.mo27391l()) {
                boolean n2 = this.f145352p.mo101981n();
                if (n) {
                    if (n2) {
                        this.f145352p.notifyItemChanged(0);
                    } else {
                        this.f145352p.notifyItemRemoved(0);
                    }
                } else if (n2) {
                    this.f145352p.notifyItemInserted(0);
                }
            }
            m115914f(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103670a(boolean z, Throwable th) {
        C77283a.m135109a("profile", th);
        this.f145318U = false;
        this.f145319V = null;
        m115914f(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: a */
    public final void mo65249a(String str, String str2) {
        C39101b<AbstractC39100a> bVar;
        if (!TextUtils.equals(this.f145343c, str) && !TextUtils.equals(this.f145344d, str2)) {
            this.f145357u = true;
        }
        this.f145343c = str;
        this.f145344d = str2;
        C63347b bVar2 = this.f145352p;
        if (bVar2 != null) {
            bVar2.f143807z = str;
            bVar2.f143778A = str2;
        }
        if (this.f145345e == 0 && !this.f145346j && (bVar = this.f145354r) != null) {
            ((C63862z) bVar).f144786a = this.f145343c;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
        String str;
        if (!m115912d(list, z)) {
            C63782l.m115340b();
            if (af_()) {
                if (C46934fk.f109377a) {
                    C80446fr.m139456a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    C80446fr.m139459b(3000);
                }
                boolean z2 = true;
                this.f145352p.mo67829d(true);
                if (getTag() != null && (str = this.f145343c) != null && str.equals(AbstractC64005b.C64007b.f145160b) && getTag().endsWith(Integer.toString(0)) && AbstractC64005b.C64007b.f145159a > 0) {
                    C1731i.m5640b(new CallableC64171r(AbstractC64005b.C64007b.f145161c, AbstractC64005b.C64007b.f145159a), C1731i.f5562a);
                    AbstractC64005b.C64007b.f145159a = 0;
                    AbstractC64005b.C64007b.f145160b = null;
                    AbstractC64005b.C64007b.m115769a("");
                }
                this.f145360y = true;
                this.f145331ah = true;
                this.f145355s.mo27382d();
                this.f145352p.aq_();
                this.f145352p.f143805x = z;
                List<Aweme> d = m115909d(list);
                m115906c(d);
                this.f145352p.mo62377b_(d);
                if (!this.f145346j) {
                    mo103659J();
                }
                if (m115883W()) {
                    mo103572a(d != null ? d.size() : 0);
                }
                if (this.f145346j && this.f145345e == 0) {
                    this.f145308H.mo104029a(d);
                }
                if (this.f145346j && this.f145345e == 14) {
                    this.f145308H.mo104031b(d);
                }
                if (this.f145346j && TextUtils.equals(this.f145459O, C80541ho.m139617a(1)) && !C33842s.C33843a.f80132a.mo60060d().mo59941c().booleanValue() && !C33842s.C33843a.f80132a.mo60057a().mo59941c().booleanValue() && this.f145304D != null && this.f145352p.mo60933c() != 0 && !this.f145322Y) {
                    this.f145304D.setVisibility(0);
                }
                if (d != null && !d.isEmpty()) {
                    z2 = false;
                } else if (this.f145355s != null) {
                    if (this.f145303C) {
                        mo103574n();
                    } else if (!this.f145352p.mo101981n()) {
                        mo59525f();
                    }
                }
                if (this.f145356t != null && (!z2 || this.f145352p.mo101981n())) {
                    this.f145356t.mo103567a(this.f145345e);
                }
                this.f145338ao = z;
                this.f145316S = 0;
                mo59513a(z);
                if (!this.f145346j) {
                    C63782l.m115341c();
                    C2541b.m7437b("profile", C2543d.m7441a(this.f145459O));
                    C35434c.m72464b(C35435d.f83603a);
                    C35435d.f83604b = false;
                } else if (C35435d.f83605c) {
                    C35434c.m72464b("my_profile");
                    C35435d.f83605c = false;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        if (!z) {
            this.f145352p.mo67813a((AbstractC39063h.AbstractC39067a) null);
            this.f145352p.mo67829d(false);
            return;
        }
        m115884X();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: a */
    public final void mo103560a(boolean z, boolean z2) {
        C1731i.m5631a(100).mo5534a(new C64172s(this, z, z2), C1731i.f5564c, null);
    }

    /* renamed from: a */
    private boolean m115898a(Bundle bundle) {
        View view;
        Activity activity;
        if (C41333b.f96464a && this.f145348l && getActivity() != null && (view = this.f145306F) != null && !TextUtils.isEmpty(C0792v.m2778l(view))) {
            try {
                bundle.putBoolean("feed_transition_enable", true);
                if (Build.VERSION.SDK_INT >= 21) {
                    ActivityC0945e activity2 = getActivity();
                    C640704 r2 = new AbstractC41336c() {
                        /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.C640704 */

                        static {
                            Covode.recordClassIndex(75514);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.detail.transition.AbstractC41336c
                        /* renamed from: a */
                        public final FeedShareElementInfo[] mo70603a() {
                            if (!TextUtils.isEmpty(C64066c.this.f145305E) && C64066c.this.f145306F != null && !TextUtils.equals(C64066c.this.f145305E, C64066c.this.f145306F.getTransitionName())) {
                                C64066c.this.mo103703z();
                            }
                            if (C64066c.this.f145306F == null) {
                                return new FeedShareElementInfo[0];
                            }
                            return new FeedShareElementInfo[]{new FeedShareElementInfo(C64066c.this.f145306F)};
                        }
                    };
                    C89219l.m154721d(activity2, "");
                    C89219l.m154721d(r2, "");
                    C41333b.m83194a((Activity) activity2, false);
                    C41337d a = C41337d.C41338a.m83197a();
                    C89219l.m154721d(activity2, "");
                    a.f96473a = new WeakReference<>(activity2);
                    WeakReference<Activity> weakReference = a.f96473a;
                    if (!(weakReference == null || (activity = weakReference.get()) == null)) {
                        C89219l.m154716b(activity, "");
                        if (!activity.isFinishing()) {
                            activity.getWindow().setFlags(16, 16);
                        }
                    }
                    activity2.setExitSharedElementCallback(new C41327a.SharedElementCallbackC41328a(activity2, r2));
                    FeedShareElementInfo<?>[] a2 = r2.mo70603a();
                    int length = a2.length;
                    View[] viewArr = new View[length];
                    for (int i = 0; i < length; i++) {
                        View view2 = a2[i].f96449a;
                        if (view2 != null) {
                            viewArr[i] = view2;
                        }
                    }
                    SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(C41333b.m83192a(activity2, viewArr)).withParam("activity_has_activity_options", true).open();
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final void mo62668a(List<Aweme> list, int i) {
        if (af_() && !C13603b.m24435a((Collection) list)) {
            if (this.f145352p.f143796d) {
                i++;
            }
            if (this.f145352p.mo101983p() == 0) {
                this.f145352p.mo62377b_(m115909d(list));
                this.f145355s.setVisibility(4);
            } else {
                if (C63873h.f144797a.shouldUseRecyclerPartialUpdate()) {
                    this.f145352p.notifyItemInserted(i);
                } else {
                    this.f145352p.mo62377b_(m115909d(list));
                }
                RecyclerView recyclerView = this.f145350n;
                if (recyclerView != null) {
                    recyclerView.post(new RunnableC64173t(this));
                }
            }
            AbstractC63985aq.AbstractC63986a aVar = this.f145356t;
            if (aVar != null) {
                aVar.mo103567a(this.f145345e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: a */
    public final void mo103559a(String str, boolean z) {
        this.f145305E = str;
        if (Build.VERSION.SDK_INT >= 21 && this.f145352p != null && this.f145306F != null && !TextUtils.isEmpty(this.f145305E)) {
            int o = this.f145352p.mo101982o();
            int a = this.f145352p.mo67803a(this.f145305E) + o;
            int l = this.f145353q.mo4372l();
            int n = this.f145353q.mo4374n();
            boolean z2 = !TextUtils.equals(this.f145305E, this.f145306F.getTransitionName());
            if (a >= o) {
                if ((a < l || a > n) && (z2 || !m115907c(l))) {
                    AbstractC81915c.m141874a(new C64120cq(this.f145346j));
                    this.f145353q.mo4363e(a);
                    return;
                }
                View aa = m115899aa();
                if (aa != null) {
                    Rect rect = new Rect();
                    aa.getLocalVisibleRect(rect);
                    int height = aa.getHeight();
                    if (z) {
                        if (C33403c.C33406b.f79409a != null && C33403c.C33406b.f79409a.f79387l.f79407e != null) {
                            int i = C33403c.C33406b.f79409a.f79387l.f79405c;
                            Rect rect2 = new Rect();
                            aa.getGlobalVisibleRect(rect2);
                            Rect rect3 = C33403c.C33406b.f79409a.f79387l.f79407e;
                            if (rect2.bottom - rect2.top < height) {
                                if (!m115907c(l)) {
                                    AbstractC81915c.m141874a(new C64119cp(this.f145346j, (float) (((rect2.bottom - rect2.top) - height) - i)));
                                } else if (rect.top > 0) {
                                    this.f145350n.scrollBy(0, (rect2.bottom - rect2.top) - height);
                                } else {
                                    this.f145350n.scrollBy(0, -(((rect2.bottom - rect2.top) - height) - i));
                                }
                            } else if (rect2.bottom >= rect3.bottom || rect2.bottom <= rect3.bottom - i) {
                                if (m115907c(l)) {
                                    return;
                                }
                                if (rect2.top > rect3.bottom || rect2.bottom > rect3.bottom) {
                                    AbstractC81915c.m141874a(new C64120cq(this.f145346j));
                                    this.f145353q.mo4363e(a);
                                }
                            } else if (m115907c(l)) {
                                this.f145350n.scrollBy(0, -((rect3.bottom - i) - rect2.bottom));
                            } else {
                                AbstractC81915c.m141874a(new C64119cp(this.f145346j, (float) ((rect3.bottom - i) - rect2.bottom)));
                            }
                        }
                    } else if (rect.top > 0 && (rect.bottom > 0 || rect.bottom - rect.top < height)) {
                        AbstractC81915c.m141874a(new C64120cq(this.f145346j));
                        this.f145353q.mo4363e(a);
                    } else if (rect.top == 0 && rect.bottom - rect.top < height) {
                        if (m115907c(l)) {
                            int height2 = this.f145306F.getHeight();
                            Rect rect4 = new Rect();
                            this.f145306F.getLocalVisibleRect(rect4);
                            if (rect4.top > 0 && rect4.left == 0 && rect4.bottom == height2) {
                                this.f145350n.scrollBy(0, -rect4.top);
                            } else if (rect4.top == 0 && rect4.left == 0 && rect4.bottom < height2) {
                                this.f145350n.scrollBy(0, height2 - rect4.bottom);
                            }
                        } else {
                            AbstractC81915c.m141874a(new C64119cp(this.f145346j, (float) (rect.bottom - height)));
                        }
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: a */
    public void mo103557a(User user) {
        String string;
        String string2;
        MethodCollector.m26663i(8587);
        this.f145342b = user;
        if (!this.f145346j && !C80580in.m139687c() && this.f145345e == 1) {
            Context context = getContext();
            boolean z = this.f145341ar;
            LinearLayout linearLayout = this.f145311K;
            if (!(linearLayout == null || context == null)) {
                linearLayout.removeAllViews();
                if (z) {
                    string = context.getString(R.string.eva);
                    string2 = context.getString(R.string.ev_);
                } else {
                    string = context.getString(R.string.evi);
                    string2 = context.getString(R.string.evb);
                }
                m115892a(context, this.f145311K, string, C1764a.m5928a(string2, new Object[]{C80580in.m139684b(this.f145342b)}));
            }
        }
        C39101b<AbstractC39100a> bVar = this.f145354r;
        if (bVar == null) {
            MethodCollector.m26664o(8587);
            return;
        }
        AbstractC39100a aVar = (AbstractC39100a) bVar.f92286h;
        if (!(aVar instanceof C63833b)) {
            MethodCollector.m26664o(8587);
            return;
        }
        ((C63833b) aVar).f144719d = this.f145342b;
        MethodCollector.m26664o(8587);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo103662a(final Context context, boolean z) {
        String string;
        String string2;
        MethodCollector.m26663i(8741);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z) {
            string = getString(R.string.evn);
        } else {
            string = getString(R.string.evi);
        }
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setTuxFont(32);
        Integer a = C23155d.m43641a(context, R.attr.bc);
        if (a != null) {
            tuxTextView.setTextColor(a.intValue());
        }
        tuxTextView.setGravity(17);
        tuxTextView.setText(string);
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(17);
        Integer a2 = C23155d.m43641a(context, R.attr.bi);
        if (a2 != null) {
            tuxTextView2.setTextColor(a2.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f145335al) {
            if (z) {
                string2 = C1764a.m5928a(getString(R.string.evm), new Object[]{getString(R.string.evl)});
            } else {
                string2 = getString(R.string.evp);
            }
            sb.append(string2);
        }
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        if (context != null) {
            String string3 = getString(R.string.evl);
            if (z) {
                int indexOf = sb2.indexOf(string3);
                int length = string3.length() + indexOf;
                if (indexOf >= 0 && length >= 0) {
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.C640715 */

                        static {
                            Covode.recordClassIndex(75515);
                        }

                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        public final void onClick(View view) {
                            SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                        }
                    }, indexOf, length, 18);
                    spannableStringBuilder.setSpan(new C23129d(C34728n.m70946a(17.0d)), indexOf, length, 18);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bh)), indexOf, length, 18);
                }
                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        tuxTextView2.setText(spannableStringBuilder);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C23159f.m43650b(12);
        linearLayout.addView(tuxTextView2, layoutParams);
        MethodCollector.m26664o(8741);
        return linearLayout;
    }

    /* renamed from: a */
    public final void mo103665a(Aweme aweme) {
        C77283a.m135111b("AwemeListFragmentImpl", "onUserStoryUpdated, uid" + aweme.getAuthorUid() + " aweme instance: " + System.identityHashCode(aweme));
        if (this.f145345e == 0) {
            if (C76706a.m134273a(aweme.getUserStory())) {
                m115910d(this.f145343c);
                return;
            }
            C39101b<AbstractC39100a> bVar = this.f145354r;
            if (bVar != null && bVar.f92286h != null) {
                List items = ((AbstractC39100a) this.f145354r.f92286h).getItems();
                int a = C63408v.C63411a.m114972a(items);
                C77283a.m135111b("AwemeListFragmentImpl", "onUserStoryUpdated, indexInModel: ".concat(String.valueOf(a)));
                if (a < 0) {
                    ((C63833b) this.f145354r.f92286h).mo103308a(aweme);
                } else if (C63408v.C63411a.m114974a((Aweme) items.get(a), aweme)) {
                    items.set(a, aweme);
                }
                List e = this.f145352p.mo63369e();
                int a2 = C63408v.C63411a.m114972a(e);
                if (a2 >= 0 && C63408v.C63411a.m114974a((Aweme) e.get(a2), aweme)) {
                    e.set(a2, aweme);
                    C63347b bVar2 = this.f145352p;
                    bVar2.notifyItemChanged(bVar2.mo101982o() + a2);
                }
                C77283a.m135111b("AwemeListFragmentImpl", "onUserStoryUpdated, indexInAdapter: ".concat(String.valueOf(a2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103667a(List list) {
        if (list == null || list.isEmpty()) {
            mo103678o();
            mo103702x();
            return;
        }
        m115895a((C43223c) list.get(list.size() - 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x024b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103664a(android.view.View r17, com.p2082ss.android.ugc.aweme.feed.model.Aweme r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 838
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.mo103664a(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo67855a(C63351c cVar) {
        if (((AbstractC39054a) cVar).f92231m != null && this.f145360y && this.f145309I != null) {
            this.f145360y = false;
            mo103560a(false, false);
        }
    }

    /* renamed from: a */
    private void m115896a(Aweme aweme, C49672ag agVar) {
        if (aweme != null) {
            if (!C63753j.f144516a || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
                if (aweme.getAwemeType() != 40) {
                    this.f145324aa = aweme;
                } else if (C76660b.m134246f()) {
                    Aweme a = C77260g.f173332a.mo120157e().mo120170a();
                    this.f145324aa = a;
                    String str = this.f145343c;
                    if (str != null && str.equals(a.getAuthor().getUid())) {
                        mo103665a(this.f145324aa);
                    }
                    this.f145324aa = null;
                } else {
                    return;
                }
                if (this.f145354r == null) {
                    this.f145326ac = true;
                } else {
                    m115903ae();
                }
                EventBus.m156962a().mo145399f(agVar);
            }
        }
    }

    /* renamed from: ab */
    private static void m115900ab() {
        if (C47033k.f109571a) {
            C35345c.m72333a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        if (!C46937fn.f109393c) {
            mo62679l();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: s */
    public final void mo79786s() {
        m115905b((Aweme) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: y */
    public final void mo103566y() {
        C39092a aVar = this.f145309I;
        if (aVar != null) {
            aVar.mo67849a();
        }
    }

    /* renamed from: M */
    private int m115873M() {
        return m115887a(this.f145346j, this.f145345e);
    }

    /* renamed from: N */
    private void m115874N() {
        View view = this.f145302B;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: P */
    private static boolean m115876P() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: R */
    private static Boolean m115878R() {
        return Boolean.valueOf(MixFeedService.m109435k().mo97327c());
    }

    /* renamed from: S */
    private void m115879S() {
        if (m115881U()) {
            this.f145355s.mo27384f();
        }
    }

    /* renamed from: W */
    private boolean m115883W() {
        return TextUtils.equals(this.f145459O, C80541ho.m139617a(0));
    }

    /* renamed from: Z */
    private boolean m115886Z() {
        if (!this.f145346j || this.f145345e != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: af */
    private void m115904af() {
        C63347b bVar = this.f145352p;
        if (bVar != null && this.f145308H != null) {
            bVar.mo101985r();
        }
    }

    /* renamed from: D */
    public final void mo103656D() {
        RecyclerView recyclerView = this.f145350n;
        if (recyclerView != null) {
            recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 25);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo103661L() {
        this.f145350n.mo4413b(0);
        C39092a aVar = this.f145309I;
        if (aVar != null) {
            aVar.mo67850a(false, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        if (af_()) {
            this.f145352p.ao_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        if (!this.f145357u || this.f145323Z || this.f145321X) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public View mo62680m() {
        if (!af_()) {
            return null;
        }
        return this.f145350n;
    }

    /* renamed from: o */
    public final void mo103678o() {
        C63347b bVar = this.f145352p;
        if (bVar != null) {
            bVar.f143796d = false;
            bVar.f143800h = null;
            bVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo103697q() {
        getActivity();
        this.f145353q = new WrapGridLayoutManager(3, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: w */
    public final void mo103565w() {
        C63347b bVar = this.f145352p;
        if (bVar != null && bVar.getItemCount() < 24) {
            mo62679l();
        }
    }

    /* renamed from: z */
    public final void mo103703z() {
        this.f145306F = m115899aa();
        this.f145305E = null;
    }

    /* renamed from: O */
    private void m115875O() {
        if (this.f145346j && this.f145345e == 0) {
            IAVDraftService draftService = AVExternalServiceImpl.m113114a().draftService();
            C1731i.m5640b(new CallableC64162n(this, draftService), draftService.executor());
        }
    }

    /* renamed from: Q */
    private static boolean m115877Q() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean P = m115876P();
        C58029j.f132256h = P;
        return P;
    }

    /* renamed from: U */
    private boolean m115881U() {
        if (this.f145352p.getItemCount() != 0 || this.f145352p.f143796d) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private void m115884X() {
        if (m115885Y()) {
            this.f145352p.mo101978b(((C63833b) this.f145354r.f92286h).f144720e);
            this.f145352p.mo67829d(true);
        }
    }

    /* renamed from: Y */
    private boolean m115885Y() {
        C39101b<AbstractC39100a> bVar = this.f145354r;
        if (bVar == null || !(bVar.f92286h instanceof C63833b) || !((C63833b) this.f145354r.f92286h).mo103312c()) {
            return false;
        }
        return true;
    }

    /* renamed from: ac */
    private boolean m115901ac() {
        C63347b bVar;
        if (!af_() || (bVar = this.f145352p) == null || bVar.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final void mo103657E() {
        C63347b bVar = this.f145352p;
        if (bVar != null) {
            bVar.f143781D = null;
            if (bVar.f143783F != null) {
                bVar.f143783F.mo97059a(bVar.f143807z, bVar.f143778A, null);
            }
        }
    }

    /* renamed from: I */
    public final void mo103658I() {
        IAVDraftService draftService = AVExternalServiceImpl.m113114a().draftService();
        C1731i.m5640b(new CallableC64157i(this, draftService), draftService.executor());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final C89391z mo103659J() {
        if (this.f145346j) {
            return C89391z.f203057a;
        }
        C80654ab.m139875a(this.f145345e, new C64158j(this));
        return C89391z.f203057a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo103675c() {
        MethodCollector.m26663i(8211);
        if (this.f145302B == null) {
            this.f145302B = this.f145301A.inflate();
        }
        View view = this.f145302B;
        MethodCollector.m26664o(8211);
        return view;
    }

    /* renamed from: n */
    public void mo103574n() {
        if (!this.f145321X && !this.f145323Z && af_()) {
            this.f145355s.setVisibility(4);
            mo103675c().setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onStop() {
        if (getUserVisibleHint()) {
            mo103566y();
        }
        try {
            if (af_()) {
                m115894a(this.f145350n);
            }
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final RecyclerView.AbstractC1361h mo103698r() {
        return new C63966a((int) C13628n.m24520b(getContext(), 1.0f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo103702x() {
        if (this.f145352p.getItemCount() == 0) {
            this.f145355s.setVisibility(4);
            AbstractC63985aq.AbstractC63986a aVar = this.f145356t;
            if (aVar != null) {
                aVar.mo103568a(this.f145346j, this.f145345e);
            }
        }
    }

    /* renamed from: T */
    private boolean m115880T() {
        if ((!this.f145346j || this.f145345e != 0 || (!this.f145352p.f143796d && !this.f145352p.mo101986s())) && this.f145352p.getItemCount() <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        if (af_()) {
            if (!this.f145346j && (TextUtils.equals(this.f145459O, C80541ho.m139617a(1)) || C34729o.m70960b(getView()) || this.f145361z)) {
                C2541b.m7434a("profile", C2543d.m7441a(this.f145459O));
            }
            m115874N();
            m115879S();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public void bS_() {
        if (af_()) {
            if (this.f145321X || this.f145323Z) {
                mo59525f();
            } else if (this.f145355s == null || !this.f145303C) {
                mo103701v();
            } else {
                mo103574n();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onPause() {
        super.onPause();
        C63785n.m115348a(false);
        if (getUserVisibleHint()) {
            mo103566y();
        }
        try {
            if (af_()) {
                m115894a(this.f145350n);
            }
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
        if (!this.f145346j) {
            C2541b.m7439c("profile", C2543d.m7441a(this.f145459O));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo103700u() {
        if (this.f145345e != 0 || this.f145346j) {
            this.f145354r = new C63861y();
        } else {
            C63862z zVar = new C63862z();
            this.f145354r = zVar;
            zVar.f144786a = this.f145343c;
        }
        this.f145354r.mo67839a_(this);
        this.f145354r.mo67865a((AbstractC39103d) this);
        C63833b bVar = new C63833b();
        bVar.f144719d = this.f145342b;
        C63833b.m115501a(getActivity());
        this.f145354r.mo67838a((AbstractC39085b) bVar);
    }

    /* renamed from: aa */
    private View m115899aa() {
        View childAt;
        int a = (this.f145352p.mo67803a(this.f145305E) - this.f145353q.mo4371k()) + this.f145352p.mo101982o();
        if (a < 0 || (childAt = this.f145350n.getChildAt(a)) == null || !(this.f145350n.mo4393a(childAt) instanceof C63351c)) {
            return null;
        }
        this.f145306F = ((C63351c) this.f145350n.mo4393a(childAt)).f92232n;
        return ((C63351c) this.f145350n.mo4393a(childAt)).f92232n;
    }

    /* renamed from: ae */
    private void m115903ae() {
        int i;
        List items;
        C39101b<AbstractC39100a> bVar = this.f145354r;
        if (bVar == null || bVar.f92286h == null || ((AbstractC39100a) this.f145354r.f92286h).getItems() == null || (items = ((AbstractC39100a) this.f145354r.f92286h).getItems()) == null) {
            i = 0;
        } else {
            Iterator it = items.iterator();
            i = 0;
            while (it.hasNext() && ((Aweme) it.next()).isTop()) {
                i++;
            }
        }
        Aweme aweme = this.f145324aa;
        if (aweme != null && this.f145354r.mo67867a(aweme, i)) {
            if (this.f145324aa.getAwemeType() != 40) {
                ((C63833b) this.f145354r.f92286h).mo103303a(this.f145324aa, this.f145343c);
            }
            mo103560a(false, true);
            this.f145355s.setVisibility(4);
            AbstractC63985aq.AbstractC63986a aVar = this.f145356t;
            if (aVar != null) {
                aVar.mo103567a(this.f145345e);
            }
        }
    }

    /* renamed from: B */
    public final void mo103655B() {
        boolean z;
        T t;
        StringBuilder append = new StringBuilder("clearData(), type is ").append(this.f145345e).append(", mAwemeAdapter null is ");
        if (this.f145352p == null) {
            z = true;
        } else {
            z = false;
        }
        C63781k.m115337a(append.append(z).toString());
        C63347b bVar = this.f145352p;
        if (bVar != null) {
            bVar.aq_();
            this.f145352p.mo67810f();
            this.f145357u = true;
            if (this.f145354r.f92286h != null && (t = this.f145354r.f92286h.mData) != null) {
                t.maxCursor = 0;
                t.items = null;
                t.hasMore = 0;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: C */
    public final ArrayList<Aweme> mo103556C() {
        C63347b bVar = this.f145352p;
        if (bVar == null || ((AbstractC39058d) bVar).f92236l == null || ((AbstractC39058d) this.f145352p).f92236l.size() < 3) {
            return null;
        }
        ArrayList<Aweme> arrayList = new ArrayList<>();
        for (Aweme aweme : ((AbstractC39058d) this.f145352p).f92236l) {
            if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
                arrayList.add(aweme);
                if (arrayList.size() >= 3) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ List mo103660K() {
        int l = this.f145353q.mo4372l();
        int n = this.f145353q.mo4374n();
        List e = this.f145352p.mo63369e();
        if (e == null) {
            return null;
        }
        C89219l.m154721d("others profile list visible items: " + l + " - " + n, "");
        if (l < 0 || l > e.size() || n < 0 || n > e.size()) {
            return null;
        }
        return e.subList(l, n);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (m115886Z()) {
            AVExternalServiceImpl.m113114a().draftService().unregisterListener(this.f145339ap);
        }
        super.onDestroyView();
        C39101b<AbstractC39100a> bVar = this.f145354r;
        if (bVar != null) {
            bVar.ck_();
        }
        C38167al.m77380a().f90148a.clear();
        C38167al.m77380a().f90149b = false;
        C63347b bVar2 = this.f145352p;
        if (bVar2 != null) {
            bVar2.mo67810f();
        }
        AbstractC88412b bVar3 = this.f145315R;
        if (bVar3 != null) {
            bVar3.dispose();
        }
        AbstractC88412b bVar4 = this.f145307G;
        if (bVar4 != null) {
            bVar4.dispose();
        }
        C1870c.m6051a("profile_item_aweme");
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onStart() {
        RecyclerView recyclerView;
        super.onStart();
        try {
            if (this.f145352p != null) {
                if (this.f145346j && m115883W()) {
                    List e = this.f145352p.mo63369e();
                    int a = C63408v.C63411a.m114972a(((AbstractC39058d) this.f145352p).f92236l);
                    if (a >= 0) {
                        e.set(a, MineUserStoryFetcher.m135716a());
                    }
                }
                this.f145352p.notifyDataSetChanged();
                if (m115911d(this.f145345e) && (recyclerView = this.f145350n) != null) {
                    C63868c.f144795a.setDataSetChangedOnStart(true);
                    recyclerView.post(RunnableC64155g.f145516a);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo103699t() {
        String str;
        ActivityC0945e activity = getActivity();
        boolean z = this.f145346j;
        if (z || this.f145345e == 4) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C63347b bVar = new C63347b(activity, str, z, this.f145345e, this, this, this.f145343c, this.f145344d);
        this.f145352p = bVar;
        String str2 = this.f145325ab;
        if (str2 != null) {
            bVar.f143780C = str2;
        }
        this.f145352p.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f145352p.f143798f = this.f145347k;
        if (this.f145345e == 0) {
            this.f145352p.f92248t = new AbstractC39074m() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.C640682 */

                static {
                    Covode.recordClassIndex(75512);
                }

                @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39074m
                /* renamed from: b */
                public final int mo67830b(int i) {
                    if (i == 5 || i == 8 || i == 9 || i == 10) {
                        return ((GridLayoutManager) C64066c.this.f145353q).f4316b;
                    }
                    return 1;
                }
            };
        }
        if (this.f145346j && this.f145345e == 0) {
            this.f145308H.mo104027a();
        }
    }

    /* renamed from: V */
    private void m115882V() {
        DmtStatusView dmtStatusView;
        int M = m115873M();
        if (M != 0 && this.f145358v != null && (dmtStatusView = this.f145355s) != null) {
            dmtStatusView.mo27382d();
            int i = this.f145345e;
            if (i == 4) {
                m115893a(getContext(), this.f145355s, this.f145358v);
            } else {
                if (this.f145346j) {
                    if (i == 1) {
                        if (C80580in.m139687c()) {
                            this.f145358v.mo27406b(m115889a(getContext(), M));
                        } else if (C33842s.C33843a.f80132a.mo60059c().mo59941c().intValue() == 0) {
                            this.f145358v.mo27406b(mo103662a(getContext(), false));
                        } else {
                            this.f145358v.mo27406b(mo103662a(getContext(), true));
                        }
                    }
                } else if (i == 1) {
                    if (C80580in.m139687c()) {
                        this.f145358v.mo27406b(m115889a(getContext(), M));
                    } else {
                        this.f145358v.mo27406b(mo103671b(getContext(), false));
                    }
                }
                this.f145358v.mo27406b(m115889a(getContext(), M));
            }
            this.f145355s.setBuilder(this.f145358v);
        }
    }

    /* renamed from: ad */
    private void m115902ad() {
        int size;
        AbstractC39100a aVar = (AbstractC39100a) this.f145354r.f92286h;
        if (aVar instanceof C63833b) {
            List items = aVar.getItems();
            if (items == null) {
                size = 0;
            } else {
                size = items.size();
            }
            int i = this.f145345e;
            if (i == 14) {
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Aweme aweme = (Aweme) items.get(i2);
                    if (!(aweme == null || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() == 1)) {
                        this.f145354r.mo67866a(items.get(i2));
                    }
                }
            } else if (i == 0) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = size - 1; i3 >= 0; i3--) {
                    Aweme aweme2 = (Aweme) items.get(i3);
                    if (aweme2 != null && aweme2.getStatus() != null && !aweme2.isTop() && aweme2.getStatus().getPrivateStatus() == 1) {
                        this.f145354r.mo67866a(aweme2);
                        arrayList.add(aweme2);
                    }
                }
                ((C63833b) this.f145354r.f92286h).mo103306a(arrayList, this.f145343c);
            }
            this.f145352p.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public void mo59525f() {
        if (af_()) {
            if (!this.f145346j) {
                C63782l.m115340b();
                C2541b.m7437b("profile", C2543d.m7441a(this.f145459O));
                C35434c.m72464b(C35435d.f83603a);
                C35435d.f83604b = false;
            }
            if (((AbstractC39100a) this.f145354r.f92286h).isHasMore() && !this.f145323Z && !this.f145321X) {
                mo62679l();
            }
            this.f145331ah = true;
            if (this.f145346j && this.f145345e == 0) {
                if (!C13603b.m24435a((Collection) this.f145352p.mo63369e())) {
                    this.f145352p.mo67810f();
                }
                if (this.f145352p.getItemCount() != 0 || this.f145352p.f143796d) {
                    AbstractC63985aq.AbstractC63986a aVar = this.f145356t;
                    if (aVar != null) {
                        aVar.mo103567a(this.f145345e);
                    }
                } else if (this.f145356t != null && !((AbstractC39100a) this.f145354r.f92286h).isHasMore()) {
                    this.f145356t.mo103568a(this.f145346j, this.f145345e);
                }
                this.f145355s.setVisibility(4);
            } else if (this.f145352p.f143801i != null) {
                this.f145355s.setVisibility(4);
            } else {
                m115874N();
                if (!((AbstractC39100a) this.f145354r.f92286h).isHasMore()) {
                    m115882V();
                    this.f145355s.mo27385g();
                    View view = this.f145304D;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    AbstractC63985aq.AbstractC63986a aVar2 = this.f145356t;
                    if (aVar2 != null) {
                        aVar2.mo103568a(this.f145346j, this.f145345e);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65254g() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.mo65254g():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo103573j() {
        int M = m115873M();
        this.f145358v = DmtStatusView.C17269a.m31905a(getContext());
        TuxTextView a = m115889a(getContext(), (int) R.string.cxj);
        a.setOnClickListener(new View$OnClickListenerC64146d(this));
        this.f145358v.mo27408c(a);
        int i = this.f145345e;
        if (i == 4) {
            m115893a(getContext(), this.f145355s, this.f145358v);
        } else {
            try {
                if (this.f145346j) {
                    if (i == 1) {
                        if (C80580in.m139687c()) {
                            this.f145358v.mo27406b(m115889a(getContext(), M));
                        } else if (C33842s.C33843a.f80132a.mo60059c().mo59941c().intValue() == 0) {
                            this.f145358v.mo27406b(mo103662a(getContext(), false));
                        } else {
                            this.f145358v.mo27406b(mo103662a(getContext(), true));
                        }
                    }
                } else if (i == 1) {
                    if (C80580in.m139687c()) {
                        this.f145358v.mo27406b(m115889a(getContext(), M));
                    } else {
                        this.f145358v.mo27406b(mo103671b(getContext(), false));
                    }
                }
                this.f145358v.mo27406b(m115889a(getContext(), M));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f145355s.setBuilder(this.f145358v);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        int i;
        int i2;
        int i3;
        if (this.f145338ao) {
            if (!C80580in.m139687c() || !m115886Z()) {
                if (this.f145346j) {
                    int i4 = this.f145345e;
                    C63347b bVar = this.f145352p;
                    if (bVar == null || bVar.mo63369e() == null) {
                        i3 = 0;
                    } else {
                        i3 = this.f145352p.mo63369e().size();
                    }
                    C63775e.m115331a(i4, true, i3);
                }
                C39101b<AbstractC39100a> bVar2 = this.f145354r;
                Object[] objArr = new Object[6];
                objArr[0] = 4;
                objArr[1] = true;
                objArr[2] = this.f145343c;
                objArr[3] = Integer.valueOf(this.f145345e);
                if (this.f145346j) {
                    i = 1000;
                } else {
                    i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                }
                objArr[4] = Integer.valueOf(i);
                objArr[5] = this.f145344d;
                bVar2.mo57616a(objArr);
                if (C46937fn.f109392b && this.f145345e == 0) {
                    if (C63833b.f144715f > 0) {
                        i2 = C63833b.f144715f + 8;
                    } else {
                        i2 = 20;
                    }
                    int i5 = i2 - this.f145352p.f143784G;
                    for (int i6 = 0; i6 < i5; i6++) {
                        C1870c.m6050a(getActivity(), "profile_item_aweme");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onResume() {
        View view;
        super.onResume();
        C41337d.C41338a.m83197a().mo70604a();
        C63785n.m115348a(true);
        if (this.f145346j && TextUtils.equals(this.f145459O, C80541ho.m139617a(1)) && ((C33842s.C33843a.f80132a.mo60060d().mo59941c().booleanValue() || this.f145352p.mo60933c() == 0 || C33842s.C33843a.f80132a.mo60057a().mo59941c().booleanValue()) && (view = this.f145304D) != null && view.getVisibility() == 0)) {
            this.f145304D.setVisibility(8);
            this.f145322Y = true;
        }
        if (getUserVisibleHint() && !C16048b.m29633a().mo25421a(true, "stop_main_anim_when_invisible", false)) {
            mo103560a(false, true);
        }
        if (this.f145327ad) {
            this.f145327ad = false;
            m115902ad();
        }
        if (this.f145328ae) {
            this.f145328ae = false;
            m115902ad();
            mo98052k();
        }
        if (this.f145329af) {
            this.f145329af = false;
            mo98052k();
        }
        m115904af();
        if (this.f145330ag.booleanValue()) {
            mo98052k();
            this.f145330ag = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo103575p() {
        C35672z zVar;
        String str;
        this.f145350n.setOverScrollMode(2);
        mo103697q();
        this.f145350n.setLayoutManager(this.f145353q);
        this.f145350n.mo4402a(mo103698r());
        if (!C62845i.m113257a()) {
            zVar = new C35672z();
            this.f145350n.mo4405a(zVar);
        } else {
            zVar = null;
        }
        this.f145309I = new C39092a(this.f145350n, zVar);
        if (C46937fn.f109393c) {
            this.f145350n.mo4405a(new RecyclerView.AbstractC1371n() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.C640671 */

                static {
                    Covode.recordClassIndex(75511);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4753a(RecyclerView recyclerView, int i) {
                    int i2;
                    super.mo4753a(recyclerView, i);
                    if (i == 0) {
                        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof GridLayoutManager) {
                            i2 = ((LinearLayoutManager) layoutManager).mo4373m();
                        } else {
                            i2 = -1;
                        }
                        recyclerView.getLayoutManager().mo4685A();
                        if (i2 > recyclerView.getLayoutManager().mo4685A() - 15) {
                            C64066c.this.mo62679l();
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                    super.mo4754a(recyclerView, i, i2);
                }
            });
        }
        this.f145350n = C63873h.f144797a.buildBaseRecyclerView(this.f145350n, this);
        if (this.f145346j) {
            str = "my_profile";
        } else {
            str = "user_profile";
        }
        C80330da.C80331a.m139266a(str).mo123698a(this.f145350n);
        mo103699t();
        this.f145350n.setAdapter(this.f145352p);
        mo103700u();
        if ((this.f145346j && this.f145345e == 0) || this.f145359w || this.f145458N) {
            mo103701v();
        }
        int i = this.f145349m;
        if (i > 0) {
            this.f145350n.setPadding(0, 0, 0, i);
        }
        if (this.f145326ac) {
            m115903ae();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo103701v() {
        if (!this.f145346j || this.f145345e != 0 || !MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(getContext())) {
            if (!this.f145346j) {
                if (getArguments() == null || !getArguments().containsKey("is_first_time")) {
                    C63782l.m115339a(C63782l.m115342d(), "others_homepage");
                } else {
                    getArguments().remove("is_first_time");
                }
            }
            mo98052k();
        } else {
            if (TextUtils.isEmpty(this.f145343c)) {
                this.f145343c = C31575b.m65865g().getCurUserId();
            }
            if (TextUtils.isEmpty(this.f145344d)) {
                this.f145344d = C31575b.m65865g().getCurSecUserId();
            }
            this.f145357u = false;
            if (!C80580in.m139687c()) {
                ((C63833b) this.f145354r.f92286h).mo103309b(this.f145343c).mo143254a(new C64153e(this), new C64161m(this));
            }
        }
        m115875O();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as
    /* renamed from: k */
    public final boolean mo98052k() {
        int i;
        int i2;
        if (C46937fn.f109393c && this.f145354r.mo67842j()) {
            return false;
        }
        if ((C80580in.m139687c() && m115886Z()) || !af_()) {
            return false;
        }
        getActivity();
        if (!m115877Q()) {
            new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
            if (m115880T()) {
                this.f145355s.mo27387h();
            } else {
                this.f145355s.mo27382d();
            }
            this.f145357u = true;
            return false;
        }
        m115879S();
        boolean z = !this.f145354r.mo67842j();
        if (this.f145346j && TextUtils.isEmpty(this.f145343c)) {
            this.f145343c = C31575b.m65865g().getCurUserId();
        }
        if (this.f145346j && TextUtils.isEmpty(this.f145344d)) {
            this.f145344d = C31575b.m65865g().getCurSecUserId();
        }
        if (!TextUtils.isEmpty(this.f145343c)) {
            C1731i.m5640b(new CallableC63780j(this.f145345e, this.f145343c), C39162r.m79452a());
            if (this.f145346j) {
                C63775e.m115331a(this.f145345e, false, 0);
            }
            C39101b<AbstractC39100a> bVar = this.f145354r;
            Object[] objArr = new Object[6];
            objArr[0] = 1;
            objArr[1] = true;
            objArr[2] = this.f145343c;
            objArr[3] = Integer.valueOf(this.f145345e);
            if (this.f145346j) {
                i = 1000;
            } else {
                i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            objArr[4] = Integer.valueOf(i);
            objArr[5] = this.f145344d;
            bVar.mo57616a(objArr);
            this.f145357u = false;
            if (this.f145345e == 0 && (!this.f145346j || m115878R().booleanValue())) {
                MixFeedService.m109435k().mo97318a(this.f145343c, this.f145344d, new C64163o(this));
            }
            m115913e(false);
            if (C46937fn.f109392b && this.f145345e == 0) {
                C1870c.m6051a("profile_item_aweme");
                if (C63833b.f144715f > 0) {
                    i2 = C63833b.f144715f;
                } else {
                    i2 = 12;
                }
                int i3 = i2 - this.f145352p.f143784G;
                for (int i4 = 0; i4 < i3; i4++) {
                    C1870c.m6050a(getActivity(), "profile_item_aweme");
                }
            }
        }
        return z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c_ */
    public final void mo103562c_(String str) {
        this.f145333aj = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: d */
    public final void mo103563d(boolean z) {
        this.f145347k = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c_ */
    public final void mo98050c_(boolean z) {
        this.f145303C = z;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onGuideCardChange(C63372l lVar) {
        this.f145352p.mo101980m();
    }

    /* renamed from: c */
    private boolean m115907c(int i) {
        if (i > this.f145352p.mo101982o() + 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq
    /* renamed from: a */
    public final void mo103558a(AbstractC63985aq.AbstractC63986a aVar) {
        this.f145356t = aVar;
    }

    /* renamed from: b */
    public final void mo103673b(String str) {
        this.f145325ab = str;
        C63347b bVar = this.f145352p;
        if (bVar != null) {
            bVar.f143780C = str;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void checkRemoveTalentAdData(C59402b bVar) {
        this.f145352p.mo101977a(bVar.f135694a, (C59864a) null);
    }

    @AbstractC90264r
    public void onDarkmodeStatusEvent(C63495b bVar) {
        if (this.f145346j) {
            int i = this.f145345e;
            if (i == 14 || i == 0) {
                this.f145329af = true;
            }
        }
    }

    @AbstractC90264r
    public void onDynamicEvent(C35502b bVar) {
        if (bVar.f83727a == 0) {
            mo103560a(true, false);
        } else {
            mo103566y();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            m115904af();
        }
    }

    @AbstractC90264r
    public void onMixCreatedEvent(C59405e eVar) {
        if (this.f145345e == 0 && this.f145346j) {
            this.f145330ag = true;
        }
    }

    @AbstractC90264r
    public void onMixManageDoneClickEvent(C59407g gVar) {
        if (this.f145345e == 0 && this.f145346j) {
            mo98052k();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onProAccountStateChangeEvent(C68067b bVar) {
        if (this.f145345e == 0 && this.f145346j) {
            this.f145340aq = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onSwitchBusinessAccountSuccessEvent(C68070e eVar) {
        if (this.f145345e == 0 && this.f145346j) {
            this.f145340aq = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onSwitchCreatorAccountSuccessEvent(C68071f fVar) {
        if (this.f145345e == 0 && this.f145346j) {
            this.f145340aq = true;
        }
    }

    /* renamed from: f */
    private void m115914f(boolean z) {
        C76460a aVar;
        if (!z && (aVar = this.f145319V) != null) {
            mo59512a(aVar.f171734a, this.f145319V.f171735b);
            this.f145319V = null;
        }
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        if (C63873h.f144797a.onAntiCrawlerEvent(aVar.f81610a)) {
            EventBus.m156962a().mo145397d(aVar);
            mo98052k();
        }
    }

    @AbstractC90264r
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        C63347b bVar;
        if (af_() && (bVar = this.f145352p) != null) {
            bVar.mo67804a(followStatusEvent.status);
        }
    }

    @AbstractC90264r
    public void onPublishStatusUpdate(C71900f fVar) {
        if (fVar.f161088b == 9) {
            m115875O();
        }
        if (fVar.f161088b == 2) {
            m115875O();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onUpdateUserEvent(C34572c cVar) {
        if (this.f145345e == 0 && this.f145346j && this.f145340aq) {
            this.f145340aq = false;
            mo98052k();
        }
    }

    /* renamed from: c */
    private boolean m115908c(Aweme aweme) {
        List<Aweme> list = ((AbstractC39058d) this.f145352p).f92236l;
        if (list == null) {
            return false;
        }
        for (Aweme aweme2 : list) {
            if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m115913e(boolean z) {
        if (this.f145352p.mo101984q()) {
            AbstractC88412b bVar = this.f145315R;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f145318U = true;
            this.f145315R = ProfileStoryApi.f171678a.getStoryArchDetail().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64164p(this, z), new C64170q(this, z));
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(C68570bv bvVar) {
        if (this.f145346j && TextUtils.equals(this.f145459O, C80541ho.m139617a(1))) {
            m115882V();
            if (this.f145352p.getItemCount() == 0) {
                this.f145355s.mo27385g();
            } else {
                this.f145355s.setVisibility(4);
            }
        }
    }

    /* renamed from: c */
    private void m115906c(List<Aweme> list) {
        Aweme aweme = this.f145324aa;
        if (!(aweme == null || aweme.getVideo() == null || list == null)) {
            for (Aweme aweme2 : list) {
                if (!(aweme2.getAid() == null || !aweme2.getAid().equals(this.f145324aa.getAid()) || aweme2.getVideo() == null)) {
                    aweme2.getVideo().setCover(this.f145324aa.getVideo().getCover());
                    aweme2.getVideo().setDynamicCover(this.f145324aa.getVideo().getDynamicCover());
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private static List<Aweme> m115909d(List<Aweme> list) {
        ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
        if (list == null || e == null || e.mo67032b() == null || e.mo67032b().isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null && (aweme.getAwemeRawAd() == null || !e.mo67032b().contains(aweme.getAwemeRawAd().getCreativeIdStr()))) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @AbstractC90264r
    public void onChangePlayListNameEvent(C59403c cVar) {
        if (this.f145345e == 0 && this.f145346j) {
            this.f145330ag = true;
            List e = this.f145352p.mo63369e();
            for (int i = 0; i < e.size(); i++) {
                if (!(e.get(i) == null || ((Aweme) e.get(i)).playlist_info == null)) {
                    String mixId = ((Aweme) e.get(i)).playlist_info.getMixId();
                    if (cVar.f135696b != null && cVar.f135696b.equals(mixId)) {
                        ((Aweme) e.get(i)).playlist_info.setMixName(cVar.f135695a);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getParentFragment() != null) {
            this.f145308H = ProfileViewModel.C64397a.m116300a(getParentFragment());
        }
        Bundle arguments = getArguments();
        this.f145345e = arguments.getInt(StringSet.type);
        String string = arguments.getString("uid");
        String string2 = arguments.getString("sec_user_id");
        if (!TextUtils.isEmpty(string)) {
            this.f145343c = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            this.f145344d = string2;
        }
        this.f145346j = arguments.getBoolean("is_my_profile");
        this.f145348l = arguments.getBoolean("is_scene_transition_enable");
        this.f145349m = arguments.getInt("bottom_bar_height");
        this.f145359w = arguments.getBoolean("should_refresh_on_init_data", false);
        if (C46934fk.f109378b && this.f145345e == 0) {
            this.f145359w = true;
        }
    }

    @AbstractC90264r
    public void onMixDeleteEvent(C59406f fVar) {
        if (this.f145345e == 0 && this.f145346j) {
            this.f145330ag = true;
            new C79459a(getContext()).mo123050a(R.string.gfv).mo123053a();
            List e = this.f145352p.mo63369e();
            for (int i = 0; i < e.size(); i++) {
                if (!(e.get(i) == null || ((Aweme) e.get(i)).playlist_info == null)) {
                    String mixId = ((Aweme) e.get(i)).playlist_info.getMixId();
                    if (fVar.f135704b != null && fVar.f135704b.equals(mixId)) {
                        ((Aweme) e.get(i)).playlist_info = null;
                    }
                }
            }
        }
    }

    @AbstractC90264r
    public void onPrivateModelEvent(C49695w wVar) {
        int i;
        if (!(wVar.f114365b == null || this.f145352p == null)) {
            if (!this.f145346j || !C63753j.f144516a || !((i = this.f145345e) == 14 || i == 0)) {
                for (int i2 = 0; i2 < this.f145352p.mo63369e().size(); i2++) {
                    Aweme aweme = (Aweme) this.f145352p.mo63369e().get(i2);
                    if (aweme.getAid().equals(wVar.f114365b.getAid())) {
                        aweme.setStatus(wVar.f114365b.getStatus());
                        this.f145352p.notifyItemChanged(i2);
                        return;
                    }
                }
                return;
            }
            this.f145328ae = true;
        }
    }

    @AbstractC90264r
    public void onRemoveVideoFromMix(C59408h hVar) {
        String str;
        if (this.f145345e == 0 && this.f145346j) {
            this.f145330ag = true;
            if (hVar == null || hVar.f135705a == null) {
                str = "";
            } else {
                str = hVar.f135705a.getAid();
            }
            List e = this.f145352p.mo63369e();
            if (this.f145352p.mo63369e() == null) {
                mo98052k();
                this.f145330ag = false;
            }
            for (int i = 0; i < e.size(); i++) {
                if (str.equals(((Aweme) e.get(i)).getAid()) && e.get(i) != null && ((Aweme) e.get(i)).playlist_info != null) {
                    ((Aweme) e.get(i)).playlist_info = null;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m115905b(Aweme aweme) {
        C39101b<AbstractC39100a> bVar = this.f145354r;
        if (bVar == null || bVar.f92286h == null) {
            C51423a.m95784a(5, "AwemeListFragment", "syncData() NOT executed");
            return;
        }
        C51423a.m95784a(3, "AwemeListFragment", "syncData() start");
        boolean z = false;
        List items = ((AbstractC39100a) this.f145354r.f92286h).getItems();
        HashSet hashSet = new HashSet();
        if (items != null && items.size() > 0) {
            Iterator it = items.iterator();
            while (it.hasNext()) {
                Aweme aweme2 = (Aweme) it.next();
                int i = this.f145345e;
                if (i != 1) {
                    if (i == 4 && (aweme2 == null || !aweme2.isCollected() || (aweme != null && TextUtils.equals(aweme2.getAid(), aweme.getAid()) && !aweme.isCollected()))) {
                        it.remove();
                        if (aweme2 != null) {
                            hashSet.add(aweme2.getAid());
                        }
                    }
                } else if (aweme2 == null || !aweme2.isLike() || (aweme != null && TextUtils.equals(aweme2.getAid(), aweme.getAid()) && !aweme.isLike())) {
                    it.remove();
                    if (aweme2 != null) {
                        hashSet.add(aweme2.getAid());
                    }
                }
                z = true;
            }
            if (z && this.f145352p != null) {
                C63781k.m115337a("notifyDataSetChanged() called in syncData(), removed aids = ".concat(String.valueOf(hashSet)));
                this.f145352p.notifyDataSetChanged();
            }
        }
        if (!this.f145355s.mo27391l()) {
            if (m115901ac()) {
                mo59525f();
            }
            this.f145354r.mo57528c();
        }
    }

    /* renamed from: d */
    private void m115910d(String str) {
        C39101b<AbstractC39100a> bVar;
        if (this.f145345e == 0 && str.equals(this.f145343c) && (bVar = this.f145354r) != null && bVar.f92286h != null) {
            List items = ((AbstractC39100a) this.f145354r.f92286h).getItems();
            int a = C63408v.C63411a.m114972a(items);
            if (a >= 0) {
                items.remove(a);
            }
            List e = this.f145352p.mo63369e();
            int a2 = C63408v.C63411a.m114972a(e);
            if (a2 >= 0) {
                e.remove(a2);
                this.f145352p.notifyDataSetChanged();
            }
            C77283a.m135111b("AwemeListFragmentImpl", "onUserStoryDeleted: uid: ".concat(String.valueOf(str)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        if (af_()) {
            if (this.f145352p.getItemCount() == 0) {
                this.f145355s.mo27382d();
                AbstractC63985aq.AbstractC63986a aVar = this.f145356t;
                if (aVar != null) {
                    aVar.mo103568a(this.f145346j, this.f145345e);
                }
            }
            this.f145352p.mo67824j();
            C63775e.m115333a(this.f145345e, true, exc);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void checkRemoveTalentAdData(C38480a aVar) {
        ITalentAdRevenueShareService e;
        if (!this.f145346j) {
            AbstractC39100a aVar2 = (AbstractC39100a) this.f145354r.f92286h;
            if (aVar2 instanceof C63833b) {
                C63833b bVar = (C63833b) aVar2;
                if (!(bVar.mData == null || ((FeedItemList) bVar.mData).getItems() == null || (e = TalentAdRevenueShareServiceImpl.m77931e()) == null || e.mo67032b() == null || e.mo67032b().isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    for (Aweme aweme : ((FeedItemList) bVar.mData).getItems()) {
                        if (aweme != null && (aweme.getAwemeRawAd() == null || !e.mo67032b().contains(aweme.getAwemeRawAd().getCreativeIdStr()))) {
                            arrayList.add(aweme);
                        }
                    }
                    e.mo67032b().clear();
                    ((FeedItemList) bVar.mData).items = arrayList;
                    AbstractC81915c.m141874a(new C38486c(((FeedItemList) bVar.mData).getItems()));
                }
            }
            ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.m77931e();
            if (e2 != null) {
                e2.mo67034d();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C63347b bVar;
        C63347b bVar2;
        RecyclerView recyclerView;
        int i;
        super.setUserVisibleHint(z);
        if (af_()) {
            boolean z2 = true;
            if (z) {
                if (!this.f145317T && this.f145346j && (recyclerView = this.f145350n) != null && ((i = this.f145345e) == 0 || i == 1 || i == 14)) {
                    recyclerView.mo4413b(0);
                    mo98052k();
                }
                this.f145317T = false;
                if (af_() && this.f145350n != null && (bVar2 = this.f145352p) != null && !bVar2.f143798f) {
                    this.f145352p.f143798f = true;
                    int childCount = this.f145350n.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        RecyclerView.ViewHolder f = this.f145350n.mo4451f(i2);
                        if (f instanceof C63351c) {
                            C63351c cVar = (C63351c) f;
                            cVar.mo101991f();
                            mo67855a(cVar);
                        }
                    }
                }
            } else {
                mo103566y();
                if (!this.f145346j) {
                    C2541b.m7439c("profile", C2543d.m7441a(this.f145459O));
                }
            }
            C38167al a = C38167al.m77380a();
            if (this.f145345e != 0) {
                z2 = false;
            }
            a.f90149b = z2;
            if (m115911d(this.f145345e) && (bVar = this.f145352p) != null) {
                bVar.f143804w = z;
            }
            if (this.f145337an != z && this.f145345e == 0) {
                this.f145337an = z;
                C63785n.m115348a(z);
            }
        }
    }

    /* renamed from: a */
    private void mo103572a(int i) {
        float f;
        int i2;
        String str;
        Context context = getContext();
        if (context != null) {
            int[] iArr = {-1, -1};
            this.f145350n.getLocationOnScreen(iArr);
            int i3 = iArr[1];
            if (i3 >= 0) {
                float f2 = 0.0f;
                if (TextUtils.equals(this.f145351o, "from_main")) {
                    f = C23159f.m43648a((Number) 58);
                } else {
                    f = 0.0f;
                }
                C89219l.m154719c(context, "");
                Resources resources = context.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i4 = 0;
                if (displayMetrics != null) {
                    i2 = displayMetrics.heightPixels;
                } else {
                    i2 = 0;
                }
                float a = ((float) ((i2 + C23158e.m43647a(context)) - i3)) - f;
                if (a > 0.0f) {
                    f2 = a;
                }
                float a2 = f2 / C23159f.m43648a((Number) 170);
                int i5 = (int) a2;
                if (a2 > ((float) i5)) {
                    a2 = (float) (i5 + 1);
                }
                int i6 = ((int) a2) * 3;
                int i7 = i6 - i;
                if (i7 >= 0) {
                    i4 = i7;
                }
                C33744d a3 = new C33744d().mo59980a("empty_num", i4).mo59980a("video_num", i6 - i4);
                if (this.f145346j) {
                    str = "personal_homepage";
                } else {
                    a3.mo59983a("profile_user_id", this.f145343c);
                    str = "others_homepage";
                }
                a3.mo59983a("enter_from", str);
                C39162r.m79460a("video_show_cnt", a3.f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: b */
    public final void mo62671b(int i) {
        if (af_()) {
            if (this.f145352p.f143796d) {
                i++;
            }
            if (i <= this.f145352p.getItemCount() || i == 0) {
                this.f145352p.notifyItemRemoved(i);
                if (this.f145352p.mo60933c() == 0) {
                    int i2 = this.f145345e;
                    if (i2 == 1) {
                        m115882V();
                        this.f145355s.mo27385g();
                    } else if (i2 == 14) {
                        this.f145355s.mo27385g();
                    } else {
                        this.f145355s.setVisibility(4);
                    }
                    AbstractC63985aq.AbstractC63986a aVar = this.f145356t;
                    if (aVar != null) {
                        aVar.mo103568a(this.f145346j, this.f145345e);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c */
    public void mo102301c(boolean z) {
        if (this.f145323Z != z) {
            this.f145323Z = z;
            m115882V();
            DmtStatusView dmtStatusView = this.f145355s;
            if (dmtStatusView != null) {
                dmtStatusView.mo27385g();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        AbstractC63985aq.AbstractC63988c cVar;
        if (af_()) {
            if (!m115880T()) {
                if (!this.f145346j && 1 == this.f145345e && (cVar = this.f145310J) != null) {
                    cVar.mo103570a(false);
                }
                this.f145355s.mo27382d();
            } else if (this.f145346j || 1 != this.f145345e) {
                if (this.f145352p.mo101981n()) {
                    this.f145352p.mo101976a((C77380c) null);
                    this.f145352p.notifyItemRemoved(0);
                }
                this.f145355s.mo27387h();
            } else if (!(exc instanceof C34485a) || ((C34480a) exc).getErrorCode() != 7) {
                this.f145355s.mo27387h();
                AbstractC63985aq.AbstractC63988c cVar2 = this.f145310J;
                if (cVar2 != null) {
                    cVar2.mo103570a(false);
                }
            } else {
                DmtStatusView dmtStatusView = this.f145355s;
                dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(mo103671b(getContext(), true)));
                this.f145355s.mo27385g();
                AbstractC63985aq.AbstractC63988c cVar3 = this.f145310J;
                if (cVar3 != null) {
                    cVar3.mo103570a(true);
                }
            }
            if (!C13603b.m24435a((Collection) this.f145352p.mo63369e())) {
                this.f145352p.mo67810f();
            }
            this.f145357u = true;
            C63775e.m115333a(this.f145345e, false, exc);
            m115904af();
            if (!this.f145346j) {
                C63762ab abVar = C63782l.f144576a;
                if (abVar != null) {
                    abVar.mo102327c();
                }
                C2541b.m7435a("profile", C2543d.m7441a(this.f145459O), C16105a.m29902a(C17867d.m33078a(), exc));
                C35434c.m72462a(C35435d.f83603a, EnumC35431b.FAIL);
                C35435d.f83604b = false;
            }
        }
    }

    @AbstractC90264r(mo145423b = true)
    public void onVideoEvent(C49672ag agVar) {
        String str;
        Aweme a;
        Aweme aweme;
        int a2;
        int b;
        if ((agVar.f114315a == 15 || agVar.f114315a == 2 || agVar.f114315a == 13 || agVar.f114315a == 21 || agVar.f114315a == 54) && af_()) {
            int i = agVar.f114315a;
            if (i != 2) {
                if (i != 13) {
                    if (i != 15) {
                        if (i != 21) {
                            if (i == 54 && (agVar.f114316b instanceof Aweme) && m115911d(this.f145345e)) {
                                Aweme aweme2 = (Aweme) agVar.f114316b;
                                if (!aweme2.isCollected()) {
                                    m115905b(aweme2);
                                }
                            }
                        } else if ((agVar.f114316b instanceof Aweme) && (aweme = (Aweme) agVar.f114316b) != null && this.f145345e == agVar.f114322h && !agVar.f114320f.equals("playlist") && (a2 = this.f145352p.mo67803a(aweme.getAid())) != -1 && (this.f145350n.getLayoutManager() instanceof AbstractC81445m)) {
                            RecyclerView recyclerView = this.f145350n;
                            if (!C41333b.f96464a) {
                                View c = recyclerView.getLayoutManager().mo4358c(a2);
                                if (c != null) {
                                    int[] iArr = new int[2];
                                    c.getLocationOnScreen(iArr);
                                    Activity activity = (Activity) recyclerView.getContext();
                                    int i2 = Build.VERSION.SDK_INT;
                                    if (activity != null) {
                                        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                                        DisplayMetrics displayMetrics = new DisplayMetrics();
                                        defaultDisplay.getRealMetrics(displayMetrics);
                                        b = displayMetrics.heightPixels;
                                    } else {
                                        b = C13628n.m24521b(C17867d.m33078a());
                                    }
                                    int i3 = b - iArr[1];
                                    if (c.getHeight() > 0 && (((float) i3) * 1.0f) / ((float) c.getHeight()) > 0.4f) {
                                        return;
                                    }
                                }
                                AbstractC81915c.m141874a(new C64120cq(this.f145346j));
                                ((AbstractC81445m) this.f145350n.getLayoutManager()).mo125099a(a2, 0);
                            }
                        }
                    } else if (this.f145346j) {
                        int i4 = this.f145345e;
                        if (i4 == 0) {
                            if (agVar.f114316b instanceof Aweme) {
                                m115896a(AwemeService.m70060b().mo60677a((Aweme) agVar.f114316b), agVar);
                            } else if (agVar.f114316b instanceof List) {
                                for (Aweme aweme3 : (List) agVar.f114316b) {
                                    m115896a(AwemeService.m70060b().mo60677a(aweme3), agVar);
                                }
                            }
                        } else if (i4 == 14 && C63753j.f144516a && (a = AwemeService.m70060b().mo60677a((Aweme) agVar.f114316b)) != null && a.getStatus().getPrivateStatus() == 1) {
                            AbstractC39100a aVar = (AbstractC39100a) this.f145354r.f92286h;
                            if (aVar instanceof C63833b) {
                                this.f145327ad = true;
                                ((C63833b) aVar).mo103308a(a);
                                if (C63753j.f144516a) {
                                    this.f145355s.setVisibility(4);
                                }
                            }
                        }
                    }
                } else if (this.f145346j && this.f145345e == 1) {
                    String str2 = (String) agVar.f114316b;
                    Aweme b2 = AwemeService.m70060b().mo60684b(str2);
                    if ((b2 != null || (b2 = AwemeService.m70060b().mo60680a(str2, this.f145345e)) != null) && b2.getAwemeType() != 13) {
                        if (b2.getUserDigg() != 0) {
                            if (!(m115908c(b2) || this.f145354r.mo67867a(b2, 0))) {
                            }
                        } else if (isResumed() && SettingsManager.m29616a().mo25400a("profile_favorite_undigg_optimize_setting", true) && m115908c(b2)) {
                            boolean a3 = this.f145354r.mo67866a(b2);
                            this.f145352p.notifyDataSetChanged();
                            C63781k.m115337a("handle cancel digg in favorite list for aid " + b2.getAid() + ", result is " + a3);
                        }
                    }
                }
            } else if (this.f145346j) {
                String str3 = (String) agVar.f114316b;
                int i5 = this.f145345e;
                if (i5 == 0) {
                    if (af_() && !TextUtils.isEmpty(str3)) {
                        Aweme a4 = C50545m.m94761a(str3);
                        C63833b bVar = (C63833b) this.f145354r.f92286h;
                        String str4 = this.f145343c;
                        if (a4 != null) {
                            AbstractC88979t.m154294a(new C63843j(bVar, str4, a4)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
                        }
                        if (this.f145354r.mo67866a(a4)) {
                            this.f145352p.notifyDataSetChanged();
                        }
                    }
                } else if (i5 == 14) {
                    C63347b bVar2 = this.f145352p;
                    if (bVar2.f143782E == null || bVar2.f143782E.getItems() == null || bVar2.f143782E.getItems().isEmpty()) {
                        str = null;
                    } else {
                        str = bVar2.f143782E.getItems().get(0).getAid();
                    }
                    if (TextUtils.equals(str3, str)) {
                        m115913e(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo103674b(List list) {
        if (C13603b.m24435a((Collection) list)) {
            mo103678o();
        } else {
            m115895a((C43223c) list.get(list.size() - 1));
        }
    }

    /* renamed from: a */
    private static void m115894a(RecyclerView recyclerView) {
        RecyclerView.ViewHolder a;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (!(childAt == null || (a = recyclerView.mo4393a(childAt)) == null || a.getItemViewType() != 0)) {
                    ((AbstractC39062g) a).at_();
                }
            }
        }
    }

    /* renamed from: a */
    private static TuxTextView m115889a(Context context, int i) {
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(C0643b.m2378c(context, R.color.c4));
        tuxTextView.setText(i);
        return tuxTextView;
    }

    /* renamed from: d */
    private boolean m115912d(List<Aweme> list, boolean z) {
        if (!this.f145318U || !this.f145352p.mo101984q()) {
            return false;
        }
        this.f145319V = new C76460a(list, z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Object mo103672b(boolean z, boolean z2) {
        C39092a aVar;
        if (!C34729o.m70960b(getView()) || (aVar = this.f145309I) == null) {
            return null;
        }
        aVar.mo67850a(z, z2);
        return null;
    }

    /* renamed from: a */
    private static int m115887a(boolean z, int i) {
        if (z) {
            if (i == 0) {
                return R.string.bn6;
            }
            if (i != 1 || C80580in.m139687c()) {
                return R.string.dc2;
            }
            if (C33842s.C33843a.f80132a.mo60059c().mo59941c().intValue() == 0) {
                return R.string.cuq;
            }
            return R.string.cur;
        } else if (i == 0) {
            return R.string.h58;
        } else {
            if (i == 4) {
                return R.string.bmo;
            }
            return R.string.h51;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m115890a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put("group_id", str);
            C40748a.f95401a = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(C40748a.f95401a));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C29819a.m60077a("post_list", jSONObject);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo103671b(Context context, boolean z) {
        String string;
        String string2;
        MethodCollector.m26663i(8743);
        this.f145341ar = z;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f145311K = linearLayout;
        linearLayout.setOrientation(1);
        if (z) {
            string = context.getString(R.string.eva);
            string2 = context.getString(R.string.ev_);
        } else {
            string = context.getString(R.string.evi);
            string2 = context.getString(R.string.evb);
        }
        m115892a(context, this.f145311K, string, C1764a.m5928a(string2, new Object[]{C80580in.m139684b(this.f145342b)}));
        LinearLayout linearLayout2 = this.f145311K;
        MethodCollector.m26664o(8743);
        return linearLayout2;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC89277c a;
        super.onViewCreated(view, bundle);
        if (m115886Z()) {
            AVExternalServiceImpl.m113114a().draftService().registerListener(this.f145339ap);
        }
        mo103575p();
        if (this.f145345e == 0 && C76660b.m134246f() && this.f145346j && C80580in.m139683b().getUid() != null) {
            if (this.f145320W == null) {
                C64013bc bcVar = new C64013bc(this);
                this.f145320W = bcVar;
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String curUserId = g.getCurUserId();
                C89219l.m154716b(curUserId, "");
                AbstractC89290k[] kVarArr = new AbstractC89290k[0];
                C77693b bVar = C77693b.f174258c;
                if (C89219l.m154714a(C89204ab.m154669a(C76619a.class), C89204ab.m154669a(C76620b.class))) {
                    a = C89204ab.m154669a(C76620b.class);
                } else {
                    a = C89204ab.m154669a(C76619a.class);
                }
                StoryReceiver storyReceiver = new StoryReceiver(curUserId, bcVar, bVar);
                if (C89219l.m154714a(a, C89204ab.m154669a(C76620b.class))) {
                    bVar.mo120328a((AbstractC76618d) bcVar, storyReceiver);
                }
                AbstractC88412b a2 = bVar.mo120326a().mo143268a(new C64013bc.C64014a(curUserId, bVar)).mo143292d(new C64013bc.C64015b(kVarArr)).mo143263a(bVar.f171955b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C64013bc.C64016c(bcVar), C64013bc.C64017d.f145178a);
                C89219l.m154716b(a2, "");
                C76626d.m134214a(a2, storyReceiver);
                this.f145320W.f145172a = new C64156h(this);
            }
            C77283a.m135111b("AwemeListFragmentImpl", "#" + System.identityHashCode(this) + ", init: uid: " + this.f145343c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Aweme> list, boolean z) {
        AbstractC63985aq.AbstractC63986a aVar;
        if (af_()) {
            this.f145352p.aq_();
            this.f145352p.f143805x = z;
            if (this.f145352p.getItemCount() == 0) {
                if (!C13603b.m24435a((Collection) list)) {
                    AbstractC63985aq.AbstractC63986a aVar2 = this.f145356t;
                    if (aVar2 != null) {
                        aVar2.mo103567a(this.f145345e);
                    }
                } else if (!z && (aVar = this.f145356t) != null) {
                    aVar.mo103568a(this.f145346j, this.f145345e);
                }
            }
            List<Aweme> d = m115909d(list);
            if (C46937fn.f109391a) {
                this.f145352p.mo62376b(d);
            } else {
                this.f145352p.mo62377b_(d);
            }
            this.f145338ao = z;
            if (this.f145352p.mo60933c() != 0 || z || !this.f145355s.mo27389j()) {
                if (C13603b.m24435a((Collection) d) && z && !this.f145323Z && !this.f145321X) {
                    mo62679l();
                } else if (!C13603b.m24435a((Collection) d)) {
                    this.f145355s.mo27379a(true);
                }
            } else if (!this.f145346j || this.f145345e != 0) {
                m115882V();
                this.f145355s.mo27385g();
            }
            mo59513a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1870c.m6045a((Activity) getActivity(), mo103571a());
        this.f145350n = (RecyclerView) a.findViewById(R.id.b0k);
        this.f145301A = (ViewStub) a.findViewById(R.id.ea0);
        RecyclerView recyclerView = this.f145350n;
        if (recyclerView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) recyclerView).setLabel("profile_list");
        }
        if (C63873h.f144797a.shouldUseRecyclerPartialUpdate() && this.f145350n.getItemAnimator() != null) {
            this.f145350n.getItemAnimator().f4467i = 0;
        }
        boolean f = C68432f.f153189a.mo108870f();
        this.f145335al = f;
        if (f || C33842s.C33843a.f80132a.mo60059c().mo59941c().intValue() == 0) {
            this.f145304D = m115888a(a, this.f145346j, this.f145459O, false);
        } else {
            this.f145304D = m115888a(a, this.f145346j, this.f145459O, true);
        }
        this.f145355s = (DmtStatusView) a.findViewById(R.id.e7i);
        mo103573j();
        return a;
    }

    /* renamed from: a */
    private static void m115893a(Context context, DmtStatusView dmtStatusView, DmtStatusView.C17269a aVar) {
        if (dmtStatusView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dmtStatusView.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.width = -1;
            layoutParams.height = -1;
            dmtStatusView.setLayoutParams(layoutParams);
            MtEmptyView a = MtEmptyView.m31926a(context);
            a.setStatus(new C17273d.C17274a(context).mo27462b(R.string.bsa).mo27464c(R.string.bs_).mo27457a(2131233461).f41365a);
            aVar.mo27406b(a);
        }
    }

    /* renamed from: a */
    private static View m115888a(View view, boolean z, String str, boolean z2) {
        final Context context = view.getContext();
        if (!z || !TextUtils.equals(str, C80541ho.m139617a(1)) || C80580in.m139687c() || !C33842s.C33843a.f80132a.mo60058b().mo59941c().booleanValue() || C33842s.C33843a.f80132a.mo60060d().mo59941c().booleanValue() || C33842s.C33843a.f80132a.mo60057a().mo59941c().booleanValue() || !z2) {
            return null;
        }
        final View findViewById = view.findViewById(R.id.bcr);
        TextView textView = (TextView) view.findViewById(R.id.c8t);
        ImageView imageView = (ImageView) view.findViewById(R.id.bu5);
        imageView.setImageResource(2131232200);
        textView.setTextColor(C0643b.m2378c(context, R.color.c2));
        findViewById.setBackgroundColor(C0643b.m2378c(context, R.color.l));
        String string = context.getString(R.string.evo);
        String string2 = context.getString(R.string.evl);
        String a = C1764a.m5928a(string, new Object[]{context.getString(R.string.evl)});
        SpannableString spannableString = new SpannableString(a);
        int indexOf = a.indexOf(string2);
        int length = string2.length() + indexOf;
        if (indexOf >= 0 && length >= 0) {
            spannableString.setSpan(new ClickableSpan() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c.C640726 */

                static {
                    Covode.recordClassIndex(75516);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    C33842s.C33843a.f80132a.mo60057a().mo59940b(true);
                    findViewById.setVisibility(8);
                    SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                }
            }, indexOf, length, 18);
            spannableString.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.bh)), indexOf, length, 18);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        imageView.setOnClickListener(new View$OnClickListenerC64154f(findViewById));
        return findViewById;
    }

    /* renamed from: a */
    private static void m115892a(Context context, LinearLayout linearLayout, String str, String str2) {
        MethodCollector.m26663i(8885);
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setTuxFont(32);
        tuxTextView.setGravity(17);
        tuxTextView.setText(str);
        Integer a = C23155d.m43641a(context, R.attr.bc);
        if (a != null) {
            tuxTextView.setTextColor(a.intValue());
        }
        linearLayout.addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(17);
        tuxTextView2.setText(str2);
        Integer a2 = C23155d.m43641a(context, R.attr.bi);
        if (a2 != null) {
            tuxTextView2.setTextColor(a2.intValue());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C23159f.m43650b(12);
        linearLayout.addView(tuxTextView2, layoutParams);
        MethodCollector.m26664o(8885);
    }
}
