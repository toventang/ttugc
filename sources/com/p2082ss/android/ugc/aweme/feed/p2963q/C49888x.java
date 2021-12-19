package com.p2082ss.android.ugc.aweme.feed.p2963q;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1258b.C17935a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.p2144h.C29919b;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39106g;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43313a;
import com.p2082ss.android.ugc.aweme.experiment.C46702an;
import com.p2082ss.android.ugc.aweme.experiment.C46704ao;
import com.p2082ss.android.ugc.aweme.experiment.C46775by;
import com.p2082ss.android.ugc.aweme.experiment.C46802cs;
import com.p2082ss.android.ugc.aweme.experiment.C46972gg;
import com.p2082ss.android.ugc.aweme.experiment.FeedRefreshViewModel;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48306z;
import com.p2082ss.android.ugc.aweme.feed.api.C48334h;
import com.p2082ss.android.ugc.aweme.feed.cache.AbstractC49298b;
import com.p2082ss.android.ugc.aweme.feed.cache.C49300d;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49502ae;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49527r;
import com.p2082ss.android.ugc.aweme.feed.guide.C49592h;
import com.p2082ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49665a;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49671af;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49676d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49685m;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49693u;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49751h;
import com.p2082ss.android.ugc.aweme.feed.p2968t.C49932a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50092b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.C50418a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50434a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2976c.C50456b;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50525aa;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.C59037aw;
import com.p2082ss.android.ugc.aweme.main.C59038ax;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.experiment.C59086g;
import com.p2082ss.android.ugc.aweme.main.guide.C59096b;
import com.p2082ss.android.ugc.aweme.main.guide.C59097c;
import com.p2082ss.android.ugc.aweme.main.guide.RunnableC59099e;
import com.p2082ss.android.ugc.aweme.main.guide.ViewStub$OnInflateListenerC59098d;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61499b;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2340at.C33956a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedLoadMoreService;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79639a;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79646c;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79657g;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79663h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.push.C65692b;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80524hb;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80686l;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80687m;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.q.x */
public class C49888x extends AbstractC49815a implements AbstractC49298b, AbstractC49751h, AbstractC49992x, AbstractC50085av, AbstractC50085av {

    /* renamed from: d */
    public static boolean f114990d = true;

    /* renamed from: e */
    public static boolean f114991e;

    /* renamed from: A */
    private boolean f114992A = false;

    /* renamed from: B */
    private boolean f114993B = true;

    /* renamed from: C */
    private final List<C0692e<Aweme, Integer>> f114994C = new ArrayList();

    /* renamed from: D */
    private boolean f114995D = false;

    /* renamed from: E */
    private boolean f114996E = false;

    /* renamed from: F */
    private int f114997F = 0;

    /* renamed from: G */
    private boolean f114998G = false;

    /* renamed from: a */
    private ViewGroup f114999a;

    /* renamed from: b */
    private ViewStub f115000b;

    /* renamed from: c */
    private C50092b f115001c;

    /* renamed from: f */
    public int f115002f;

    /* renamed from: g */
    public boolean f115003g = true;

    /* renamed from: h */
    public int f115004h = -1;

    /* renamed from: i */
    public PopupWindow f115005i;

    /* renamed from: j */
    public int f115006j = 0;

    /* renamed from: k */
    DataSetObserver f115007k = new DataSetObserver() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C498891 */

        static {
            Covode.recordClassIndex(58996);
        }

        public final void onChanged() {
            C49888x.this.f115002f++;
            UgAllServiceImpl.m65444c();
        }
    };

    /* renamed from: l */
    public C80524hb f115008l = new C80524hb() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C499008 */

        static {
            Covode.recordClassIndex(59007);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80524hb, com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: a */
        public final void mo70708a(String str) {
            super.mo70708a(str);
            AbstractC80321cz b = C80330da.C80331a.m139267b(str);
            if (b != null) {
                int currentItem = C49888x.this.f114759N.getCurrentItem();
                b.mo123696a("launch_vv", Integer.toString(currentItem)).mo123696a("current_video", C33956a.m69537a(C49888x.this.f114768W.mo80287c(currentItem)));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80524hb, com.p2082ss.android.ugc.aweme.utils.AbstractC80347dl
        /* renamed from: b */
        public final void mo70709b(String str) {
            super.mo70709b(str);
            AbstractC80321cz b = C80330da.C80331a.m139267b(str);
            if (b != null) {
                b.mo123696a("next_video", C33956a.m69537a(C49888x.this.f114768W.mo80287c(C49888x.this.f114759N.getCurrentItem())));
            }
        }
    };

    /* renamed from: m */
    int f115009m = -1;

    /* renamed from: n */
    protected ISmartFeedLoadMoreService.AbstractC59994a f115010n = new C49902y(this);

    /* renamed from: o */
    String f115011o = null;

    /* renamed from: p */
    int f115012p = 0;

    /* renamed from: q */
    boolean f115013q = false;

    /* renamed from: r */
    private boolean f115014r;

    /* renamed from: s */
    private C59097c f115015s;

    /* renamed from: t */
    private boolean f115016t;

    /* renamed from: u */
    private C79663h f115017u;

    /* renamed from: v */
    private Handler f115018v = new Handler(Looper.getMainLooper());

    /* renamed from: w */
    private String f115019w = "";

    /* renamed from: x */
    private AbstractC50085av.AbstractC50086a f115020x;

    /* renamed from: y */
    private AtomicBoolean f115021y = new AtomicBoolean(false);

    /* renamed from: z */
    private boolean f115022z = false;

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: F */
    public final boolean mo70440F() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: c */
    public final void mo70479c(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(225, new RunnableC90250g(C49888x.class, "onDeleteAwemeEvent", C49677e.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(60, new RunnableC90250g(C49888x.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(226, new RunnableC90250g(C49888x.class, "onVideoCleanModeEvent", C50456b.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(227, new RunnableC90250g(C49888x.class, "onInterceptedResumePlayOnResume", C43313a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(228, new RunnableC90250g(C49888x.class, "onVPAOptOutEvent", C49671af.class, ThreadMode.MAIN, 0, false));
        subscriberEventTypes.put(6, new RunnableC90250g(C49888x.class, "onVideoPlayerEvent", C71904j.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(229, new RunnableC90250g(C49888x.class, "OnDeleteTopViewAwemeEvent", C17935a.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(230, new RunnableC90250g(C49888x.class, "onRefreshEvent", C79646c.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(231, new RunnableC90250g(C49888x.class, "onCommentDialogEvent", C49676d.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(232, new RunnableC90250g(C49888x.class, "onBackupUpdateEvent", C49665a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: N */
    public final ViewGroup mo70447N() {
        return this.f114999a;
    }

    /* renamed from: a */
    public final void mo84915a(AbstractC48151ak akVar) {
        if (this.f114758M != null) {
            this.f114758M.setLoadMoreListener(akVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo84689a(AbstractC48149ai aiVar) {
        super.mo84689a(aiVar);
        if (TextUtils.equals(this.f114782aJ.getEventType(), "homepage_hot")) {
            long H = this.f114783aK.mo81169H();
            long j = mo84707aO().mo123887j();
            int i = this.f114783aK.f113723p;
            int currentItem = this.f114759N.getCurrentItem() - 1;
            if (AdShowTimeGapManager.m77034a() && currentItem >= 0 && currentItem <= AdShowTimeGapManager.f89779f.size()) {
                if (currentItem == AdShowTimeGapManager.f89779f.size()) {
                    AdShowTimeGapManager.f89779f.add(Long.valueOf(H + (((long) i) * j)));
                    return;
                }
                ArrayList<Long> arrayList = AdShowTimeGapManager.f89779f;
                arrayList.set(currentItem, Long.valueOf(arrayList.get(currentItem).longValue() + H + (((long) i) * j)));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        if ((false | r5) != false) goto L_0x01d5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo84902a(java.util.List<com.p2082ss.android.ugc.aweme.feed.model.Aweme> r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.mo84902a(java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo84916a(Aweme aweme) {
        String aid = aweme.getAid();
        if (!TextUtils.isEmpty(aid)) {
            if (this.f114843br != null) {
                C49932a aVar = this.f114843br;
                if (aVar.f115094a != null) {
                    aVar.f115094a.clearFlag();
                }
            }
            mo84790m(aid);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo84920a(boolean z, int i) {
        if (this.f114816ar != null) {
            SmartFeedLoadMoreService.getDebug();
            if (z) {
                mo81098a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.RunnableC4989212 */

                    static {
                        Covode.recordClassIndex(58999);
                    }

                    public final void run() {
                        C49888x.this.f114816ar.mo70693k();
                    }
                }, (long) i);
            }
        }
    }

    /* renamed from: a */
    public final void mo84918a(Exception exc) {
        if (mo84730bE()) {
            this.f114778aF.setRefreshing(false);
            if (this.f114768W.getCount() == 0) {
                DmtStatusView o = mo84794o(true);
                if (o != null) {
                    o.setVisibility(0);
                    o.mo27387h();
                    return;
                }
                return;
            }
            new C79459a(this.f183419bv).mo123050a(R.string.cxf).mo123053a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70467a(com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag r12) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.mo70467a(com.ss.android.ugc.aweme.feed.i.ag):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84919a(String str) {
        if (!C13603b.m24435a((Collection) this.f114768W.mo80288e()) && !TextUtils.isEmpty(str) && this.f114768W.mo80324a(str)) {
            mo84689a(this.f114797aY);
            mo84767bt();
            m93604C();
            mo84774g(this.f114759N.getCurrentItem());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49751h
    /* renamed from: a */
    public final void mo84307a(List<? extends Aweme> list, int i, int i2, final AbstractC49751h.AbstractC49752a aVar) {
        Fragment aH_ = aH_();
        if (aH_ instanceof AbstractC49751h) {
            ((AbstractC49751h) aH_).mo84307a(list, i, i2, new AbstractC49751h.AbstractC49752a() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C498954 */

                static {
                    Covode.recordClassIndex(59002);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49751h.AbstractC49752a
                /* renamed from: a */
                public final void mo67219a(String str, Exception exc) {
                    AbstractC49751h.AbstractC49752a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo67219a(str, exc);
                    }
                }
            });
        } else {
            aVar.mo67219a("unsupported", null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av
    /* renamed from: a */
    public final void mo84917a(AbstractC50085av.AbstractC50086a aVar) {
        AbstractC50085av.AbstractC50086a aVar2;
        this.f115020x = aVar;
        if (this.f115021y.get() && (aVar2 = this.f115020x) != null) {
            aVar2.mo85222a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: p */
    public final void mo70407p() {
        this.f114766U.setViewPager(this.f114759N);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ void mo70429y() {
        mo70464a(0, 1200);
    }

    static {
        Covode.recordClassIndex(58995);
    }

    /* renamed from: K */
    private ActivityC0945e m93607K() {
        if (this.f183419bv instanceof ActivityC0945e) {
            return (ActivityC0945e) this.f183419bv;
        }
        return null;
    }

    /* renamed from: d */
    private void mo84906d() {
        if (mo84701aI()) {
            C61499b.C61500a.m111344a(this.f114796aX).mo99146c();
        }
    }

    /* renamed from: j */
    private int mo84908j() {
        "homepage_hot".equals(this.f114782aJ.getEventType());
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: B */
    public final void mo70436B() {
        if (!mo84926k()) {
            super.mo70436B();
        }
    }

    public final void aW_() {
        if (mo84730bE()) {
            this.f114758M.mo85749a();
        }
    }

    public final void bl_() {
        if (mo84730bE()) {
            boolean z = this.f115014r;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo84927l() {
        DmtStatusView o = mo84794o(true);
        if (o != null) {
            o.mo27385g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av
    /* renamed from: t */
    public final void mo70515t() {
        mo63634a(new C49672ag(37));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av
    /* renamed from: v */
    public final void mo70428v() {
        mo63634a(new C49672ag(28));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50085av
    /* renamed from: w */
    public final void mo70517w() {
        if (this.f114783aK != null) {
            this.f114783aK.mo81167F();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: J */
    public final void mo70443J() {
        super.mo70443J();
        C50092b bVar = this.f115001c;
        if (bVar != null && bVar.f115626b) {
            this.f115001c.mo85232e();
        }
        mo70464a(0, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: bl */
    public final void mo84759bl() {
        if (this.f183419bv != null && mo84905c() && mo84911bW()) {
            super.mo84759bl();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo84905c() {
        Activity activity = this.f183419bv;
        if (!(activity instanceof AbstractC59103j) || !((AbstractC59103j) activity).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo84907f() {
        if (mo84730bE()) {
            m93606G();
            this.f114778aF.setRefreshing(false);
            if (!this.f114992A) {
                mo84927l();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: r */
    public final void mo70413r() {
        this.f114768W.unregisterDataSetObserver(this.f115007k);
        C38000g.m77058i().mo67218c();
        super.mo70413r();
        C81067m.C81070a.m140763a().mo124532e(this.f114799aa);
    }

    /* renamed from: C */
    private void m93604C() {
        if (this.f114768W.getCount() == mo84908j()) {
            AbstractC81915c.m141874a(new C49685m("from_full_recommend"));
        }
        this.f114759N.post(new RunnableC49839ac(this));
    }

    /* renamed from: D */
    private void m93605D() {
        MethodCollector.m26663i(5144);
        ViewStub viewStub = this.f115000b;
        if (viewStub != null) {
            viewStub.inflate();
            this.f115000b = null;
            ViewGroup viewGroup = (ViewGroup) this.f114999a.findViewById(R.id.i1);
            if (viewGroup != null) {
                this.f115001c = new C50092b(viewGroup);
            }
        }
        MethodCollector.m26664o(5144);
    }

    /* renamed from: G */
    private void m93606G() {
        this.f115016t = false;
        C50092b bVar = this.f115001c;
        if (bVar != null && bVar.f115626b && "homepage_hot".equals(this.f114782aJ.getEventType()) && this.f114782aJ.getPageType() == 0) {
            this.f115001c.mo85229b();
            mo84732bG();
        }
    }

    /* renamed from: m */
    public final void mo70387m() {
        Aweme c;
        C79663h hVar;
        if (this.f114759N != null && this.f114768W != null && (c = this.f114768W.mo80287c(this.f114759N.getCurrentItem())) != null && c.getUserDigg() == 1 && (hVar = this.f115017u) != null) {
            hVar.mo123211a(this.f183419bv, c);
        }
    }

    /* renamed from: o */
    public final void mo70389o() {
        if (this.f114837bl != 4) {
            this.f115016t = true;
            m93606G();
            return;
        }
        if (this.f115001c == null) {
            m93605D();
        }
        if (this.f115001c != null) {
            mo81102au();
            mo84717aY();
            this.f115001c.mo85228a();
            this.f115016t = false;
            mo84732bG();
        }
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
            this.f115005i = C79657g.m138457a(this.f183419bv, bj.mo80119ad().findViewById(R.id.dxw), new C49847ak(this));
            C79657g.m138460a(new C49848al(this));
            C79657g.m138459a();
            mo84855s(aD);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: H */
    public void mo70402H() {
        String aid;
        super.mo70402H();
        Aweme aD = mo81109aD();
        C59097c cVar = this.f115015s;
        if (cVar != null) {
            boolean z = true;
            if (aD == null || aD.getAuthor() == null || !(aD.getAuthor().getFollowStatus() == 1 || aD.getAuthor().getFollowStatus() == 2)) {
                z = false;
            }
            cVar.f134506b = z;
        }
        if (aD == null) {
            aid = "";
        } else {
            aid = aD.getAid();
        }
        C70747dv.f158357a = aid;
        this.f114997F = this.f114770Y;
        LocationServiceImpl.m145036c().mo129341a(mo81116aG(), m93607K());
    }

    /* renamed from: b */
    public final void mo84922b() {
        boolean z;
        if (mo84730bE()) {
            AbstractC48191b bVar = this.f114768W;
            if (bVar == null || bVar.getCount() != 1 || !C37699a.m76199B(bVar.mo80287c(0))) {
                z = false;
            } else {
                z = true;
            }
            C50092b bVar2 = this.f115001c;
            if (bVar2 != null && bVar2.f115626b) {
                this.f114778aF.setRefreshing(true);
            } else if (z) {
                bl_();
            } else if (!this.f114992A) {
                this.f114778aF.setRefreshing(false);
                DmtStatusView o = mo84794o(true);
                if (o != null) {
                    o.setVisibility(0);
                    o.mo27384f();
                }
            } else if (this.f114998G) {
                this.f114998G = false;
            } else {
                this.f114778aF.setRefreshing(true);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo84926k() {
        if ((this.f183419bv instanceof AbstractC59103j) && ((AbstractC59103j) this.f183419bv).isDuoDualMode()) {
            return false;
        }
        if (this.f183419bv == null || !mo84905c() || !mo84911bW() || !ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) this.f183419bv).mo89350b("page_feed")) {
            return true;
        }
        BusinessComponentServiceUtils.getBusinessBridgeService().mo121230b();
        if (!C48334h.m91799b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: aQ */
    public final void mo84709aQ() {
        int i;
        Aweme c;
        User author;
        String str;
        Aweme c2;
        if ((C46775by.m90126a() || ((Boolean) LiveOuterService.m107269s().mo95830d().mo12981a("enable_refresh_foru_avatar_live_status", (Object) false)).booleanValue()) && this.f114770Y <= this.f114768W.getCount() - 2 && (c = this.f114768W.mo80287c((i = this.f114770Y + 2))) != null && (author = c.getAuthor()) != null) {
            ArrayList arrayList = new ArrayList();
            for (int max = Math.max(this.f114770Y - 5, 0); max <= i + 5; max++) {
                if (max != this.f114770Y) {
                    if (max >= this.f114768W.getCount() - 1 || (c2 = this.f114768W.mo80287c(max)) == null) {
                        break;
                    } else if (c2.getAuthor() != null) {
                        arrayList.add(c2.getAuthor());
                    }
                }
            }
            if (author.roomId != 0) {
                if (c.getAwemeType() != 101) {
                    str = "tiktok_video_head";
                } else if ("homepage_follow".equals(this.f114782aJ.getEventType())) {
                    str = "tiktok_follow_below";
                } else {
                    str = "tiktok_video_feed";
                }
                BusinessComponentServiceUtils.getLiveStateManager().mo96085a(author, arrayList, new C49846aj(this, c, i, author), str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: bF */
    public final void mo84731bF() {
        MethodCollector.m26663i(5140);
        if (!mo84753bf()) {
            MethodCollector.m26664o(5140);
        } else if (!C59086g.m108563a()) {
            MethodCollector.m26664o(5140);
        } else {
            C59097c cVar = this.f115015s;
            if (cVar != null && C59038ax.m108507a().getBoolean("shouldShowScrollToFeedFollowGuideMT", true) && cVar.f134506b && !this.f114788aP && !this.f114789aQ) {
                C59097c cVar2 = this.f115015s;
                ViewStub viewStub = (ViewStub) this.f114999a.findViewById(R.id.ea3);
                if (viewStub != null) {
                    viewStub.setOnInflateListener(new ViewStub$OnInflateListenerC59098d(cVar2));
                    if (!cVar2.f134507c) {
                        cVar2.f134508d = viewStub.inflate();
                        if (cVar2.f134508d != null) {
                            cVar2.f134509e = (AnimationImageView) cVar2.f134508d.findViewById(R.id.bw0);
                            try {
                                if (C80471gb.m139483a(cVar2.f134508d.getContext())) {
                                    ((TextView) cVar2.f134508d.findViewById(R.id.bf6)).setText(R.string.caa);
                                    cVar2.f134509e.setScaleX(-1.0f);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (cVar2.f134509e != null && !C59097c.f134505a) {
                                cVar2.f134509e.setRepeatCount(3);
                                cVar2.f134509e.setAnimation("right_pic.json");
                                cVar2.f134509e.setProgress(0.0f);
                                cVar2.f134509e.mo5826a();
                                C59097c.f134505a = true;
                                C59038ax.m108509c();
                            }
                        }
                        AbstractC81915c.m141874a(new C59096b(true));
                        cVar2.f134508d.postDelayed(new RunnableC59099e(cVar2), 5200);
                    }
                }
            }
            MethodCollector.m26664o(5140);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: by */
    public void mo84772by() {
        super.mo84772by();
        if (this.f114989bu) {
            if (mo81108aC() != null) {
                mo81108aC().mo80155a();
            }
            if (!(this.f114768W == null || this.f114759N == null)) {
                this.f114768W.mo80330g(this.f114770Y);
                mo84707aO().mo123937a(this.f114783aK);
                C80749k.m140049a();
                Aweme c = this.f114768W.mo80287c(this.f114759N.getCurrentItem());
                if ((this.f183419bv instanceof ActivityC0945e) && mo84727bB()) {
                    C49693u uVar = new C49693u(c);
                    uVar.f114360b = true;
                    AbstractC81915c.m141874a(uVar);
                    AwemeChangeCallBack.m108596a((ActivityC0945e) this.f183419bv, c);
                }
                AbstractC48149ai bg = mo84754bg();
                if (C80771f.f180597a && bg != null) {
                    bg.mo80210c(1);
                }
                C50525aa.m94708a(C50545m.m94769f(c), "handlePageResume");
                C50525aa.m94710b("tryPlay", mo70489e(c));
            }
            C50092b bVar = this.f115001c;
            if (bVar != null && bVar.f115626b) {
                this.f115001c.mo85231d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: q */
    public void mo70513q() {
        AbstractC50085av.AbstractC50086a aVar;
        AbstractC59105l a;
        AbstractC59105l lVar;
        super.mo70513q();
        if (this.f114989bu) {
            if ((this.f183419bv instanceof ActivityC0945e) && mo84727bB()) {
                try {
                    ActivityC0945e eVar = (ActivityC0945e) this.f183419bv;
                    if (!(eVar.getSupportFragmentManager() == null || (lVar = (AbstractC59105l) TabChangeManager.C59002a.m108439a(eVar).mo96530a("HOME")) == null || aH_() == null || !aH_().equals(lVar.mo96547l()))) {
                        C50092b bVar = this.f115001c;
                        if (bVar != null && bVar.f115626b && ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) this.f183419bv).mo89350b("page_feed")) {
                            this.f115001c.mo85231d();
                        }
                        mo84707aO().mo123937a(this.f114783aK);
                        C80749k.m140049a();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            boolean b = ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) this.f183419bv).mo89350b("page_feed");
            IMSAdaptionService c = MSAdaptionService.m97895c();
            if (c.mo89375b(this.f183419bv) && (a = c.mo89368a(this.f183419bv)) != null && (a.mo96548m() || a.mo96549n())) {
                b = true;
            }
            if (this.f115022z && mo84905c() && b) {
                this.f115022z = false;
            } else if (mo84905c() && this.f114768W != null && this.f114768W.getCount() > 0 && b && ((!f114991e || C68909c.m121607b("download")) && !mo84926k())) {
                super.mo84787l(false);
            }
            if (this.f115021y.get() && (aVar = this.f115020x) != null) {
                aVar.mo85222a();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: s */
    public final void mo70514s() {
        this.f114768W.getCount();
        if (SmartFeedLoadMoreService.instance().isSmartFeedLoadMoreScene(this.f114782aJ.getEventType()) && SmartFeedLoadMoreService.instance().needCheckLoadMore(this.f114770Y, this.f114768W.getCount(), this.f114768W.mo80287c(this.f114770Y))) {
            AbstractC56869p a = AbstractC56869p.C56870a.m103133a();
            if (a.mo63252c() != 1 || a.f129508a) {
                SmartFeedLoadMoreService.instance().startSmartFeedLoadMoreJudge(this.f114768W.mo80287c(this.f114770Y), this.f115010n);
            } else {
                return;
            }
        }
        if ((this.f114770Y >= this.f114768W.getCount() - mo84908j() || (this.f114770Y == this.f114768W.getCount() - 1 && this.f114768W.getCount() <= 3)) && this.f114816ar != null) {
            AbstractC56869p a2 = AbstractC56869p.C56870a.m103133a();
            if (a2.mo63252c() == 1 && !a2.f129508a) {
                return;
            }
            if ((!C46702an.m90093b() && !C46704ao.m90095b()) || this.f114770Y != 0 || this.f114768W.getCount() != 1 || !this.f114768W.mo80287c(0).isFromSplitData()) {
                if (!C46802cs.f109036a || this.f114770Y == 0) {
                    this.f114816ar.mo70693k();
                } else {
                    C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.RunnableC498932 */

                        static {
                            Covode.recordClassIndex(59000);
                        }

                        public final void run() {
                            C49888x.this.f114816ar.mo70693k();
                        }
                    }, 500);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void mo70518x() {
        if (mo84730bE()) {
            AbstractC48149ai bk = mo84758bk();
            if (bk != null) {
                bk.mo70615a(bk.mo80206b());
                if ((this.f183419bv instanceof ActivityC0945e) && mo84727bB() && this.f114827bb) {
                    AbstractC81915c.m141874a(new C49693u(bk.mo80206b()));
                    AwemeChangeCallBack.m108596a((ActivityC0945e) this.f183419bv, bk.mo80206b());
                }
                AbstractC81915c.m141874a(new C50434a(bk.mo80206b(), this.f114782aJ.getEventType(), this.f114782aJ.getPageType(), this));
            }
            AbstractC48149ai bg = mo84754bg();
            if (C49502ae.m92739a(this.f114782aJ.getEventType()) && bg != null && bg.mo80155a() == 101) {
                if (this.f114783aK != null) {
                    this.f114783aK.mo81167F();
                }
                if (this.f183419bv instanceof ActivityC0945e) {
                    AwemeChangeCallBack.m108596a((ActivityC0945e) this.f183419bv, bg.mo80206b());
                }
            }
            if (bk == null || bk.mo80155a() != 2) {
                mo81102au();
                C80749k.m140049a().mo123953b();
                mo84759bl();
                if (C80771f.f180597a && bk != null) {
                    bk.mo80227r();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.cache.AbstractC49298b
    /* renamed from: a */
    public final void mo80894a() {
        String str;
        VideoUrlModel properPlayAddr;
        if (mo84753bf() && this.f114759N != null && mo81116aG() != null && m93315o(mo81116aG())) {
            if (this.f114843br == null) {
                this.f114843br = new C49932a(mo70451R());
            }
            Aweme aD = mo81109aD();
            if (aD != null) {
                Video video = aD.getVideo();
                str = null;
                if (video != null) {
                    if (C16048b.m29633a().mo25421a(true, "bytevc1_play_addr_policy_unify", true)) {
                        properPlayAddr = C80942a.m140472a(C80716a.C80717a.f180462a.mo123864a().getVideoPlayAddr(C80942a.m140477a(video), C84199c.f187979a.getPlayerType()));
                    } else {
                        properPlayAddr = video.getProperPlayAddr();
                    }
                    if (properPlayAddr != null) {
                        str = properPlayAddr.getBitRatedRatioUri();
                    }
                }
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                this.f114843br.mo84979a(false, str, 0, 0, this.f114768W, mo81110aE(), true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x
    /* renamed from: c */
    public final void mo70483c(boolean z) {
        this.f115014r = z;
    }

    @AbstractC90264r
    public void onRefreshEvent(C79646c cVar) {
        this.f115009m = cVar.f178729a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: m */
    public final void mo84789m(Aweme aweme) {
        if (!mo84926k()) {
            super.mo84789m(aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    @AbstractC90264r
    public void onVideoPlayerEvent(C71904j jVar) {
        int i = jVar.f161106c;
        if (i == 2 || i == 3) {
            C79657g.m138462b();
        }
        super.onVideoPlayerEvent(jVar);
    }

    /* renamed from: a */
    private void m93610a(boolean z) {
        FeedRefreshViewModel a;
        if (mo84753bf() && (a = FeedRefreshViewModel.m90082a(this.f183419bv)) != null) {
            a.mo79312a().postValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    private boolean m93611b(String str) {
        mo84717aY();
        this.f114768W.notifyDataSetChanged();
        m93604C();
        mo70402H();
        mo84698a(str, false);
        return false;
    }

    @AbstractC90264r
    public void OnDeleteTopViewAwemeEvent(C17935a aVar) {
        Aweme d = this.f114768W.mo80326d(0);
        if (d != null && TextUtils.equals(d.getAid(), aVar.f42754a.getAid())) {
            mo62671b(0);
            C17975i.f42812l = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: e */
    public final String mo70489e(Aweme aweme) {
        if (!mo84905c() || !mo84911bW()) {
            return "23";
        }
        return super.mo70489e(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: l */
    public final void mo84787l(boolean z) {
        if (!mo84926k()) {
            super.mo84787l(z);
        }
    }

    @AbstractC90264r
    public void onInterceptedResumePlayOnResume(C43313a aVar) {
        if (this.f183419bv != null && this.f183419bv.hashCode() == aVar.f101085a) {
            this.f115022z = !aVar.f101086b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo70406b(Aweme aweme) {
        Integer insertIndex = C48334h.m91798a().getInsertIndex(mo81110aE(), aweme);
        if (insertIndex != null) {
            C51423a.m95791b(4, f114752J, "start to insert at " + insertIndex + "thread: " + Thread.currentThread());
            try {
                m93608a(aweme, insertIndex.intValue());
            } catch (Exception e) {
                C51423a.m95786a(e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: d */
    public final void mo70485d(int i) {
        List<Aweme> d;
        if (this.f114768W != null && (d = this.f114768W.mo80327d()) != null && d.size() - 1 >= i) {
            Aweme aweme = d.get(i);
            if (C76706a.m134277c(aweme) && C50545m.m94762a(aweme)) {
                mo62671b(i);
                m93611b(aweme.getAid());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: e */
    public final void mo70492e(boolean z) {
        C50092b bVar;
        super.mo70492e(z);
        if (z && (bVar = this.f115001c) != null && bVar.f115626b) {
            this.f115001c.mo85231d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: n */
    public void mo84793n(boolean z) {
        super.mo84793n(z);
        mo84718aZ();
        C50525aa.m94707a("handlePageStop");
        mo84762bo();
        C80749k.m140049a().mo123953b();
        mo84773bz();
        C50092b bVar = this.f115001c;
        if (bVar != null && bVar.f115626b) {
            this.f115001c.mo85232e();
        }
        mo70464a(0, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    public void onAwesomeSplashEvent(C18017a aVar) {
        super.onAwesomeSplashEvent(aVar);
        if (aVar.f42891a == 4 && this.f115016t && "homepage_hot".equals(this.f114782aJ.getEventType()) && this.f114782aJ.getPageType() == 0 && C39223a.m79592f().mo68589b() && C39223a.m79592f().mo68587a() != null) {
            mo70389o();
        }
    }

    @AbstractC90264r
    public void onBackupUpdateEvent(C49665a aVar) {
        Map<String, AwemeStatisticsBackup> map = aVar.f114308a;
        if (!(!mo84753bf() || map == null || map.size() == 0)) {
            C49841ae aeVar = new C49841ae(map, aVar);
            if (this.f114759N != null) {
                int childCount = this.f114759N.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Object tag = this.f114759N.getChildAt(i).getTag(R.id.b0u);
                    if (tag != null) {
                        try {
                            aeVar.accept(tag);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @AbstractC90264r
    public void onCommentDialogEvent(C49676d dVar) {
        AbstractC37879bc t;
        boolean z = true;
        if (dVar.f114332a != 1) {
            z = false;
        }
        this.f114995D = z;
        mo84777h(z);
        if (mo84753bf()) {
            mo84780i(this.f114995D);
            if (!this.f114995D && this.f115013q) {
                AbstractC48149ai bg = mo84754bg();
                if (!(bg == null || (t = bg.mo80229t()) == null)) {
                    t.mo65934J();
                }
                m93609a(this.f115011o, this.f115019w);
                this.f115013q = false;
                this.f115019w = "";
            }
        }
    }

    @AbstractC90264r
    public void onDislikeAwemeEvent(C49678f fVar) {
        if (fVar.f114345e == this.f183419bv.hashCode() && !this.f114781aI.booleanValue()) {
            if (m93607K() != null) {
                C69488a.C69489a.m122709a(m93607K()).mo109736a("long_press_layer", fVar.f114341a);
            }
            mo84700a(fVar.f114341a, fVar.mo81454a());
        }
    }

    /* renamed from: c */
    public void mo84904c(Exception exc) {
        if (mo84730bE()) {
            if (!"homepage_hot".equals(this.f114782aJ.getEventType()) || this.f114782aJ.getPageType() != 0 || !(exc instanceof C34485a) || ((C34480a) exc).getErrorCode() != 13315) {
                m93606G();
                this.f114758M.mo85751b();
                return;
            }
            C39223a.m79592f().mo68588a(new AbstractC39230a() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C4989010 */

                static {
                    Covode.recordClassIndex(58997);
                }

                @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a
                /* renamed from: a */
                public final void mo68108a() {
                    if (!C39223a.m79592f().mo68589b() || C39223a.m79592f().mo68587a() == null) {
                        mo68109a(0);
                        return;
                    }
                    C49888x.this.f114758M.mo85753d();
                    C49888x.this.f114768W.mo80286a(new ArrayList());
                    C33830n.m69192a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, "/aweme/v1/algo/free/settings/").mo59974a("status", (Integer) 0).mo59977a());
                    C49888x.this.mo70389o();
                }

                @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a
                /* renamed from: a */
                public final void mo68109a(int i) {
                    C33830n.m69192a("compliance_api_status", "", new C33743c().mo59974a("error_message", Integer.valueOf(i)).mo59976a(StringSet.type, "/aweme/v1/algo/free/settings/").mo59974a("status", (Integer) 1).mo59977a());
                    C49888x.this.f114758M.mo85751b();
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: d */
    public final void mo70486d(Exception exc) {
        if (mo84730bE()) {
            C33615a.m68848a((Context) this.f183419bv, (Throwable) exc, (int) R.string.b5_);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: h */
    public final void mo70497h(String str) {
        if (mo84730bE()) {
            if (this.f114817as == null || !this.f114817as.mo70688a(str)) {
                if (str != null && this.f114768W != null && this.f114768W.mo80327d() != null) {
                    List<Aweme> d = this.f114768W.mo80327d();
                    int i = 0;
                    while (true) {
                        if (i >= d.size()) {
                            break;
                        }
                        Aweme aweme = d.get(i);
                        if (!C76706a.m134277c(aweme)) {
                            if (aweme != null && str.equals(aweme.getAid())) {
                                mo62671b(i);
                                break;
                            }
                        } else {
                            mo84685a(i, str);
                        }
                        i++;
                    }
                }
                super.mo70497h(str);
            }
            m93611b(str);
            super.mo70497h(str);
        }
    }

    @AbstractC90264r
    public void onDeleteAwemeEvent(C49677e eVar) {
        if (TextUtils.equals(this.f114782aJ.getEventType(), eVar.f114339b)) {
            if (eVar.f114338a != null) {
                C51423a.m95793c(4, f114752J, "onDeleteAwemeEvent" + eVar.f114338a.getAid());
            }
            Aweme aweme = eVar.f114338a;
            if (TextUtils.equals(eVar.f114340c, C49677e.f114337e) && C76706a.m134278d(aweme)) {
                if (aweme != null) {
                    aweme = C77260g.f173332a.mo120157e().mo120171a(aweme.getAuthorUid());
                } else {
                    return;
                }
            }
            if (aweme != null && this.f114817as != null && this.f114817as.mo70687a(aweme)) {
                m93611b(aweme.getAid());
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onVPAOptOutEvent(C49671af afVar) {
        if (TextUtils.equals(this.f114782aJ.getEventType(), "homepage_hot")) {
            boolean z = false;
            ArrayList arrayList = new ArrayList();
            for (int i = this.f114770Y + 1; i < this.f114768W.getCount(); i++) {
                if (this.f114768W.mo80287c(i).getUploadMiscInfoStruct().vpaInfo.getInfoBarType() != 0) {
                    arrayList.add(this.f114768W.mo80287c(i).getAid());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f114817as != null && this.f114817as.mo70688a(str)) {
                    z = true;
                }
            }
            if (z) {
                this.f114768W.notifyDataSetChanged();
            }
            arrayList.clear();
            if (this.f114768W.getCount() > this.f114770Y + 1) {
                AbstractC81915c.m141874a(new C79639a());
            }
        }
    }

    @AbstractC90264r
    public void onVideoCleanModeEvent(C50456b bVar) {
        AbstractC48149ai bg;
        int i = bVar.f116533c;
        boolean z = bVar.f116531a;
        if (i == 1) {
            AbstractC48149ai bk = mo84758bk();
            if (bk != null && bVar.f116532b != null && bk.mo80206b() != null && bVar.f116532b.getAid().equals(bk.mo80206b().getAid())) {
                this.f114766U.setCanTouch(!z);
                bk.mo80169a(z, false);
            }
        } else if (i == 2 && !TextUtils.isEmpty(bVar.f116532b.getAid()) && (bg = mo84754bg()) != null && bVar.f116532b != null && bg.mo80206b() != null && (bg instanceof AbstractC48149ai)) {
            bg.mo80169a(z, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: d */
    public final void mo70487d(String str) {
        if (mo84730bE()) {
            if (TextUtils.equals(this.f115011o, str)) {
                this.f115012p++;
                if (C49527r.m92769b() != 0 && C48314ai.m91747a()) {
                    if (!this.f114996E && this.f115012p >= C49527r.m92768a() && !C49592h.C49593a.f114095a.mo81382a(str)) {
                        if (this.f114995D) {
                            this.f115013q = true;
                            this.f115019w = "loop2";
                        } else {
                            m93609a(str, "loop2");
                        }
                        if (this.f115012p == 2) {
                            C33830n.m70668a("awe_share_guide_type_log", new C33743c().mo59976a("awe_share_guide_type", C48314ai.m91750c()).mo59977a());
                        }
                    } else if (this.f115012p == 2) {
                        C33830n.m70668a("awe_share_guide_type_log", new C33743c().mo59976a("awe_share_guide_type", "none").mo59977a());
                    }
                }
            } else {
                this.f115012p = 1;
                this.f115011o = str;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84774g(int r8) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.mo84774g(int):void");
    }

    /* renamed from: b */
    public final void mo84923b(Exception exc) {
        boolean z;
        if (mo84730bE()) {
            AbstractC48191b bVar = this.f114768W;
            if (bVar == null || bVar.getCount() != 1 || !C37699a.m76199B(bVar.mo80287c(0))) {
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(C49710k.f114405m)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("URL", C49710k.f114405m);
                    jSONObject.put("DNS", C49710k.f114408p.f35367j);
                    jSONObject.put("Connect", C49710k.f114408p.f35368k);
                    jSONObject.put("SSL", C49710k.f114408p.f35369l);
                    jSONObject.put("Request", C49710k.f114408p.f35371n);
                    jSONObject.put("Response", C49710k.f114408p.f35372o);
                    jSONObject.put("ttfbMs", C49710k.f114408p.f35374q);
                    jSONObject.put("total", C49710k.f114408p.f35375r);
                    jSONObject.put("extra", C49710k.f114409q);
                    jSONObject.put("exception", C49710k.f114406n);
                    jSONObject.put("requestInfo", C49710k.f114408p);
                    jSONObject.put("eTime", C49710k.f114407o);
                    Context a = C17867d.m33078a();
                    if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132254f = NetworkUtils.getNetworkAccessType(a);
                    }
                    jSONObject.put("network", C58029j.f132254f);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C33830n.m70668a("feed_retry_e", jSONObject);
            }
            if (!"homepage_hot".equals(this.f114782aJ.getEventType()) || this.f114782aJ.getPageType() != 0 || !(exc instanceof C34485a) || ((C34480a) exc).getErrorCode() != 13315) {
                this.f114778aF.setRefreshing(false);
                m93606G();
                if (this.f114992A || z) {
                    new C79459a(this.f183419bv).mo123050a(R.string.dcq).mo123053a();
                } else {
                    DmtStatusView o = mo84794o(true);
                    if (o != null) {
                        try {
                            o.mo27387h();
                        } catch (RuntimeException e2) {
                            C51423a.m95786a((Exception) e2);
                            new C79459a(this.f183419bv).mo123050a(R.string.dcq).mo123053a();
                        }
                    }
                }
                if (this.f114794aV != null && this.f114794aV.mo109737a("swipe_up_guide")) {
                    if (this.f114845bt != null) {
                        this.f114845bt.mo123215c();
                    }
                    if (this.f114844bs != null) {
                        this.f114844bs.mo123204a();
                    }
                    this.f114794aV.mo109736a("swipe_up_guide", false);
                }
                m93610a(false);
                return;
            }
            C39223a.m79592f().mo68588a(new AbstractC39230a() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C499019 */

                static {
                    Covode.recordClassIndex(59008);
                }

                @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a
                /* renamed from: a */
                public final void mo68108a() {
                    if (!C39223a.m79592f().mo68589b() || C39223a.m79592f().mo68587a() == null) {
                        mo68109a(0);
                        return;
                    }
                    C49888x.this.f114778aF.setRefreshing(false);
                    C49888x.this.f114768W.mo80286a(new ArrayList());
                    DmtStatusView o = C49888x.this.mo84794o(false);
                    if (o != null) {
                        o.mo27382d();
                    }
                    C33830n.m69192a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, "/aweme/v1/algo/free/settings/").mo59974a("status", (Integer) 0).mo59977a());
                    C49888x.this.mo70389o();
                }

                @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39230a
                /* renamed from: a */
                public final void mo68109a(int i) {
                    C33830n.m69192a("compliance_api_status", "", new C33743c().mo59974a("error_message", Integer.valueOf(i)).mo59976a(StringSet.type, "/aweme/v1/algo/free/settings/").mo59974a("status", (Integer) 1).mo59977a());
                    C49888x.this.mo84907f();
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: a */
    public final void mo70547a(Bundle bundle) {
        super.mo70547a(bundle);
        if (this.f115015s == null) {
            this.f115015s = new C59097c();
        }
        Activity activity = this.f183419bv;
        if (activity instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) activity;
            ((LiveData) FeedRefreshViewModel.C46672a.m90084a(eVar).f108821a.getValue()).observe(eVar, new C49903z(this));
        }
    }

    /* renamed from: d */
    private void mo84887d(List<Aweme> list, boolean z) {
        C81067m.C81070a.m140763a().mo124528a(list, !z, mo84702aJ());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo84684a(int i, Aweme aweme) {
        super.mo84684a(i, aweme);
        if (this.f114817as != null && aweme != null) {
            this.f114817as.mo70688a(aweme.getAid());
        }
    }

    public C49888x(String str, int i) {
        super(str, i);
        if (mo84753bf()) {
            C89219l.m154721d(this, "");
            C49300d.f113311c = new WeakReference<>(this);
        }
    }

    /* renamed from: a */
    private void m93608a(Aweme aweme, int i) {
        try {
            mo84721b(aweme, i);
            C51423a.m95791b(4, f114752J, "insertItemAllowNextTimeOk insert success aid:" + aweme.getAid() + ",pos:" + i);
        } catch (C39106g unused) {
            C51423a.m95791b(4, f114752J, "insertItemAllowNextTimeOk insert fail,wait, aid:" + aweme.getAid() + ",pos:" + i);
            this.f114994C.add(new C0692e<>(aweme, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    private void m93609a(String str, String str2) {
        String str3;
        if (C79657g.m138466c(mo81109aD())) {
            C33744d a = new C33744d().mo59983a(C29919b.f71386n, "homepage_hot").mo59983a(C29919b.f71390r, str);
            if (C49527r.m92769b() == 1) {
                str3 = "double";
            } else {
                str3 = "triple";
            }
            C39162r.m79460a("share_highlight", a.mo59983a("repeat", str3).mo59983a("highlight_cause", str2).f79943a);
            AbstractC48148ah bj = mo84757bj();
            if (bj != null) {
                bj.mo80098L();
            }
        }
    }

    /* renamed from: c */
    public final void mo84925c(List<Aweme> list, boolean z) {
        if (mo84730bE()) {
            boolean z2 = false;
            this.f114778aF.setRefreshing(false);
            if (z || this.f115014r) {
                if (this.f115014r && !C13603b.m24435a((Collection) list) && this.f114768W.getCount() != list.size()) {
                    z2 = true;
                }
                this.f114822ax = z2;
                int count = this.f114768W.getCount();
                this.f114768W.mo80286a(list);
                if (!this.f115014r) {
                    this.f114759N.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.RunnableC498943 */

                        static {
                            Covode.recordClassIndex(59001);
                        }

                        public final void run() {
                            if (C49888x.this.f114759N != null) {
                                C49888x.this.f114770Y = 0;
                                C49888x.this.f114800ab = true;
                                C49888x.this.f114759N.mo67973a(0, false);
                            }
                        }
                    });
                }
                int count2 = this.f114768W.getCount();
                if (count < count2 && list != null && list.size() >= count2) {
                    mo84887d(list.subList(count, count2), true);
                }
            } else if (this.f114989bu && this.f183419bv != null && mo84905c()) {
                new C79459a(this.f183419bv).mo123050a(R.string.b3f).mo123053a();
                if (this.f114759N.getCurrentItem() > 1) {
                    this.f114759N.mo67973a(0, false);
                } else {
                    this.f114759N.setCurrentItemWithDefaultVelocity(0);
                }
            }
            mo84906d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public final void mo70464a(long j, long j2) {
        AbstractC48148ah bj = mo84757bj();
        if (!(bj == null || bj.mo80119ad() == null || j < 0)) {
            Handler handler = this.f115018v;
            bj.getClass();
            handler.postDelayed(RunnableC49837aa.m93540a(bj), j);
        }
        PopupWindow popupWindow = this.f115005i;
        if (popupWindow != null && popupWindow.isShowing() && j2 >= 0) {
            this.f115018v.postDelayed(new RunnableC49838ab(this), j2);
        }
        C79657g.m138465c();
    }

    /* renamed from: b */
    public void mo84903b(List<Aweme> list, boolean z) {
        if (!mo84730bE()) {
            C51423a.m95784a(4, "FeedFetchModel", "FullFeedFragmentPanel receive onLoadMoreResult,but invalid");
            return;
        }
        m93606G();
        this.f114778aF.setRefreshing(false);
        this.f114768W.f111624b = z;
        if (z || this.f115014r) {
            this.f114758M.mo85753d();
        } else {
            this.f114758M.mo85752c();
        }
        final Aweme c = this.f114768W.mo80287c(this.f114759N.getCurrentItem());
        if (C80687m.f180392b && f114990d) {
            f114990d = false;
        } else if (c != null && C80686l.f180389a) {
            C40780g.m82241a().execute(new RunnableC49845ai(this, c));
        }
        int count = this.f114768W.getCount();
        final int a = C50545m.m94760a(list, c);
        this.f114768W.mo80286a(list);
        if (!this.f114994C.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f114994C);
            this.f114994C.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0692e eVar = (C0692e) it.next();
                F f = eVar.f2750a;
                S s = eVar.f2751b;
                C51423a.m95791b(4, f114752J, "pendingAddAwemeList insert aid:" + f.getAid() + ",pos:" + ((Object) s));
                m93608a((Aweme) f, s.intValue());
            }
        }
        int count2 = this.f114768W.getCount();
        if (count < count2 && list != null && list.size() >= count2) {
            mo84887d(list.subList(count, count2), true);
        }
        if (!this.f115014r) {
            this.f114759N.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.RunnableC4989111 */

                static {
                    Covode.recordClassIndex(58998);
                }

                public final void run() {
                    if (C49888x.this.f183419bv != null && !C49888x.this.f183419bv.isFinishing() && a < C49888x.this.f114768W.getCount() - 1 && C49888x.this.f114759N != null && !C37699a.m76199B(c)) {
                        C49888x.this.f114770Y = a + 1;
                        C49888x.this.f114800ab = true;
                        C49888x.this.f114759N.setCurrentItemWithDefaultVelocity(C49888x.this.f114770Y);
                    }
                }
            });
        }
        mo84906d();
        if (C16048b.m29633a().mo25421a(true, "is_preload_process_data", false)) {
            mo84707aO().mo123939a(list);
        }
        if (mo84753bf() && !C49300d.f113309a) {
            C49300d.f113309a = true;
            if (C49300d.f113310b) {
                C49300d.m92355a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: a */
    public void mo70393a(View view, Bundle bundle) {
        super.mo70393a(view, bundle);
        this.f114999a = (ViewGroup) view.findViewById(R.id.b11);
        this.f115000b = (ViewStub) view.findViewById(R.id.i2);
        this.f114999a.setOnClickListener(View$OnClickListenerC49842af.f114919a);
        Activity activity = this.f183419bv;
        if (activity instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) activity;
            AwemeChangeCallBack.m108594a(eVar, eVar, new AwemeChangeCallBack.AbstractC59111a() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C498965 */

                static {
                    Covode.recordClassIndex(59003);
                }

                @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
                /* renamed from: a */
                public final void mo37101a(Aweme aweme) {
                    C49888x.this.f115003g = false;
                }
            });
        }
        this.f114778aF = new C59037aw(this.f114766U);
        this.f114759N.mo67974a(new ViewPager.C1582h() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.C498976 */

            /* renamed from: a */
            boolean f115034a;

            /* renamed from: b */
            int f115035b = -1;

            static {
                Covode.recordClassIndex(59004);
            }

            @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
                C49888x.this.f115006j = i;
                if (i == 1) {
                    this.f115034a = false;
                } else if (i == 0) {
                    C49888x.this.mo70387m();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                int currentItem;
                Fragment fragment;
                C71904j jVar = new C71904j(10);
                boolean z = true;
                jVar.f161108e = 1;
                AbstractC81915c.m141874a(jVar);
                Aweme c = C49888x.this.f114768W.mo80287c(C49888x.this.f114759N.getCurrentItem());
                C49888x xVar = C49888x.this;
                int i2 = this.f115035b;
                Aweme aweme = null;
                if (C33918a.m69450a() && (fragment = xVar.f183420bw) != null && (fragment.getParentFragment() instanceof AbstractC59105l) && fragment.getParentFragment() != null && !C37699a.m76314s(c) && C33918a.f80229c < 6 && i > i2 && C33918a.f80229c <= 6) {
                    C33918a.f80229c++;
                }
                if (C37699a.m76314s(c)) {
                    AbstractC81915c.m141874a(new C65692b());
                }
                C49888x xVar2 = C49888x.this;
                xVar2.f115004h = Math.max(xVar2.f115004h, i);
                if (this.f115035b == i + 1) {
                    AbstractC48149ai bg = C49888x.this.mo84754bg();
                    if (C49888x.this.mo81109aD() == null || C49888x.this.mo81109aD().isAd()) {
                        z = false;
                    }
                    if ((bg instanceof AbstractC48234cd) && z) {
                        C50418a.C50419a.m94568a(i + 2, ((AbstractC48234cd) bg).mo80200au());
                    } else if ((bg instanceof AbstractC48145ae) && z) {
                        C50418a.C50419a.m94568a(i + 2, ((AbstractC48145ae) bg).mo80284I());
                    }
                } else {
                    C49888x xVar3 = C49888x.this;
                    if (xVar3.f114759N == null) {
                        currentItem = xVar3.f114770Y;
                    } else {
                        currentItem = xVar3.f114759N.getCurrentItem();
                    }
                    if (currentItem > 0 && xVar3.f114768W != null) {
                        aweme = xVar3.f114768W.mo80287c(currentItem - 1);
                    }
                    AbstractC48149ai bi = C49888x.this.mo84756bi();
                    if (aweme == null || aweme.isAd()) {
                        z = false;
                    }
                    if ((bi instanceof AbstractC48234cd) && z) {
                        C50418a.C50419a.m94568a(i, ((AbstractC48234cd) bi).mo80200au());
                    } else if ((bi instanceof AbstractC48145ae) && z) {
                        C50418a.C50419a.m94568a(i, ((AbstractC48145ae) bi).mo80284I());
                    }
                }
                C49888x.this.mo84703aK();
                this.f115035b = i;
            }

            @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                if (!this.f115034a) {
                    this.f115034a = true;
                }
                if (C49888x.this.f115005i != null && C49888x.this.f115005i.isShowing()) {
                    C49888x.this.f115005i.dismiss();
                    C49888x.this.f115005i = null;
                }
            }
        });
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.CallableC498987 */

            static {
                Covode.recordClassIndex(59005);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final AbstractC80321cz a = C80330da.C80331a.m139266a(C49888x.this.f114782aJ.getEventType());
                if (C49888x.this.f114759N == null) {
                    return null;
                }
                C49888x.this.f114759N.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x.CallableC498987.RunnableC498991 */

                    static {
                        Covode.recordClassIndex(59006);
                    }

                    public final void run() {
                        a.mo123695a(C49888x.this.f115008l).mo123699a(C49888x.this.f114759N);
                    }
                });
                return null;
            }
        }, C1731i.f5562a);
        this.f114768W.registerDataSetObserver(this.f115007k);
        this.f114758M.mo85753d();
        this.f114758M.mo85750a(this.f114759N, this.f114766U);
        this.f114758M.setLabel("main_feed");
        if ("homepage_hot".equals(this.f114782aJ.getEventType()) && this.f114782aJ.getPageType() == 0 && C39223a.m79592f().mo68589b() && C39223a.m79592f().mo68587a() != null) {
            mo70389o();
        }
        ActivityC0945e K = m93607K();
        if (K == null) {
            C51423a.m95786a((Exception) new RuntimeException("bindLiveData fail"));
        } else if (mo84753bf()) {
            InterestViewModel.C49703a.m93116a(K).f114386a.observe(K, new C49843ag(this));
        }
        this.f115017u = new C79663h(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    /* renamed from: a */
    public AbstractC48191b mo70459a(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar) {
        return new C48306z(context, layoutInflater, sVar, fragment, onTouchListener, baseFeedPageParams, lVar);
    }
}
