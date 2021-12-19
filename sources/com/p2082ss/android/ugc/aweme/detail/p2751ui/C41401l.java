package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.LayoutInflater$Factory2C0956j;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34691k;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34690j;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.C38486c;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.C41127g;
import com.p2082ss.android.ugc.aweme.detail.p2745d.C41119a;
import com.p2082ss.android.ugc.aweme.detail.p2745d.C41120b;
import com.p2082ss.android.ugc.aweme.detail.p2746e.C41122a;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.EnumC52955c;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.C59092g;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60796e;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2481cm.C36141a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47965o;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.p3864e.C72869a;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76107b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76592b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.l */
public class C41401l extends AbstractC34586a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: w */
    public static final Map<String, String> f96578w;

    /* renamed from: A */
    private AnalysisStayTimeFragmentComponent f96579A;

    /* renamed from: B */
    private C41119a f96580B;

    /* renamed from: C */
    private C41120b f96581C;

    /* renamed from: D */
    private String f96582D = "";

    /* renamed from: E */
    private String f96583E = "DetailFragment";

    /* renamed from: a */
    protected ScrollableViewPager f96584a;

    /* renamed from: b */
    public AbstractC59108o f96585b;

    /* renamed from: c */
    protected ScrollSwitchStateManager f96586c;

    /* renamed from: d */
    protected HomePageDataViewModel f96587d;

    /* renamed from: e */
    protected C34700p f96588e;

    /* renamed from: j */
    protected C49812b f96589j = new C49812b();

    /* renamed from: k */
    protected boolean f96590k = false;

    /* renamed from: l */
    protected boolean f96591l;

    /* renamed from: m */
    protected DataCenter f96592m;

    /* renamed from: n */
    protected String f96593n;

    /* renamed from: o */
    protected Aweme f96594o;

    /* renamed from: p */
    protected Aweme f96595p;

    /* renamed from: q */
    String f96596q = "";

    /* renamed from: r */
    public IAdSceneService f96597r;

    /* renamed from: s */
    boolean f96598s = false;

    /* renamed from: t */
    String f96599t = "";

    /* renamed from: u */
    String f96600u = "";

    /* renamed from: v */
    public boolean f96601v = true;

    /* renamed from: y */
    private int f96602y = -1;

    /* renamed from: z */
    private boolean f96603z = false;

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(16, new RunnableC90250g(C41401l.class, "onScrollToProfileEvent", C49669ad.class, ThreadMode.POSTING, 0, false));
        hashMap.put(368, new RunnableC90250g(C41401l.class, "onTalentProfileAdEvent", C38486c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(168, new RunnableC90250g(C41401l.class, "receiveJumpToRecord", C76107b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: h */
    public final Aweme mo70671h() {
        return this.f96594o;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    /* renamed from: m */
    private static boolean m83283m() {
        ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
        if (e != null) {
            return e.mo67033c();
        }
        return false;
    }

    /* renamed from: u */
    private boolean m83291u() {
        return this.f96589j.getEventType().equals("playlist");
    }

    /* renamed from: v */
    private boolean m83292v() {
        return this.f96589j.getEventType().equals("westwindow");
    }

    /* renamed from: i */
    public final void mo70672i() {
        this.f96592m.mo60191a("onBack", (Object) null);
    }

    static {
        Covode.recordClassIndex(49296);
        C414119 r1 = new HashMap<String, String>() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414119 */

            static {
                Covode.recordClassIndex(49306);
            }

            public final boolean containsKey(Object obj) {
                if (obj == null) {
                    return false;
                }
                return super.containsKey(obj);
            }
        };
        f96578w = r1;
        r1.put("westwindow", "westwindow");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        if (m83289s()) {
            return new Analysis().setLabelName("others_homepage");
        }
        return super.mo59595F();
    }

    /* renamed from: a */
    public final void mo70655a() {
        if (C37699a.m76271aq(this.f96594o)) {
            this.f96584a.setOnFlingEndListener(new AbstractC34691k() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414097 */

                static {
                    Covode.recordClassIndex(49304);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34691k
                /* renamed from: a */
                public final void mo61352a() {
                    C41401l.this.f96586c.mo89340a(EnumC52955c.INSTANCE);
                }
            });
        }
    }

    /* renamed from: d */
    public final boolean mo70668d() {
        if (this.f96585b == null || !this.f96586c.mo89350b("page_profile")) {
            return false;
        }
        this.f96585b.mo96579a();
        return true;
    }

    /* renamed from: g */
    public final C41426z mo70670g() {
        if (this.f96588e == null) {
            return null;
        }
        C34685e d = this.f96586c.mo89354d("page_feed");
        if (d instanceof C41426z) {
            return (C41426z) d;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo70675l() {
        if (C37699a.m76271aq(this.f96594o)) {
            new C79459a(getContext()).mo123050a(R.string.o6).mo123053a();
        }
    }

    /* renamed from: n */
    private boolean m83284n() {
        if (C80580in.m139687c() || m83285o() || C37699a.m76271aq(this.f96594o) || TextUtils.equals("new_ad_fake_user", this.f96589j.getEventType()) || "from_publish_add_video".equals(this.f96589j.getFrom())) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m83285o() {
        boolean z;
        int videoType = this.f96589j.getVideoType();
        if (videoType == 0 || videoType == 15) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = "from_profile_self".equals(this.f96589j.getFrom());
        boolean equals2 = "from_profile_other".equals(this.f96589j.getFrom());
        if ((equals || equals2) && z) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m83287q() {
        Aweme aweme;
        if (this.f96589j.getVideoType() == 14 || !m83288r() || (aweme = this.f96594o) == null || aweme.getAuthor() == null || !TextUtils.equals(this.f96594o.getAuthor().getUid(), this.f96589j.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private boolean m83289s() {
        if (m83290t() || f96578w.containsKey(this.f96589j.getEventType()) || m83291u() || m83292v()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private boolean m83290t() {
        if (TextUtils.isEmpty(this.f96589j.getFeedsAwemeId())) {
            return false;
        }
        if (TextUtils.equals(this.f96589j.getPreviousPage(), "homepage_follow") || TextUtils.equals(this.f96589j.getPreviousPage(), "homepage_hot")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo70669e() {
        if (C41127g.m82827a(this.f96589j.getFrom()) && getActivity() != null) {
            C49625h.m93072a().f114189a = FeedSharePlayerViewModel.getPlayerManager(getActivity());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo70674k() {
        Aweme aweme;
        IAdSceneService iAdSceneService;
        if (this.f96586c.mo89350b("page_feed") && mo70670g() != null && (aweme = this.f96594o) != null && aweme.isAd() && (iAdSceneService = this.f96597r) != null) {
            iAdSceneService.mo28466c().mo28502a(getContext());
        }
    }

    /* renamed from: p */
    private boolean m83286p() {
        if (("from_nearby".equals(this.f96589j.getFrom()) || "from_search_mix".equals(this.f96589j.getFrom()) || "from_search_live".equals(this.f96589j.getFrom()) || "trending_page".equals(this.f96589j.getFrom())) && this.f96594o.isLive()) {
            return true;
        }
        return m83287q();
    }

    /* renamed from: r */
    private boolean m83288r() {
        if ("from_profile_self".equals(this.f96589j.getFrom()) || "from_profile_other".equals(this.f96589j.getFrom()) || "STORY_ENTRANCE_OTHER".equals(this.f96589j.getFrom()) || "STORY_ENTRANCE_MINE".equals(this.f96589j.getFrom()) || "from_ad_new_fake_user".equals(this.f96589j.getFrom())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo70673j() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            if (C58956a.m108315a(this.f96594o)) {
                String a = C58956a.m108314a(this.f96594o, R.string.h8k);
                if (a != null) {
                    new C79459a(getContext()).mo123052a(a).mo123053a();
                }
            } else if (this.f96594o.isImage()) {
                new C79459a(activity).mo123050a(R.string.civ).mo123053a();
            } else {
                new C79459a(activity).mo123050a(R.string.h8k).mo123053a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (TextUtils.equals(this.f96589j.getEnterPlayMethod(), "click_avatar_dot")) {
            AbstractC81915c.m141874a(new C76592b());
        }
        if (!TextUtils.isEmpty(this.f96589j.getReactSessionId()) && this.f96594o != null) {
            AbstractC81915c.m141874a(new C47965o(this.f96589j.getReactSessionId(), 2, C81079v.m140776O().mo123891n(), this.f96594o.getAid()));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f96603z) {
            C72869a.f163501a = "prop_reuse";
            new Intent();
            ArrayList<String> arrayList = new ArrayList<>();
            String[] split = this.f96594o.getStickerIDs().split(",");
            for (String str : split) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            final RecordConfig.Builder translationType = new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).stickers(arrayList).autoUseSticker(arrayList.get(0)).stickerMusic(this.f96594o.getMusic()).translationType(3);
            AVExternalServiceImpl.m113114a().asyncService("DetailFeed", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414021 */

                static {
                    Covode.recordClassIndex(49297);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(C41401l.this.getActivity(), translationType.build());
                }
            });
            this.f96603z = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.C34701a mo70662b() {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.mo70662b():com.ss.android.ugc.aweme.base.ui.p$a");
    }

    /* renamed from: c */
    public final void mo70667c() {
        Aweme aweme = this.f96594o;
        if (aweme != null) {
            if (!aweme.isCanPlay() || this.f96594o.isDelete()) {
                this.f96586c.mo89338a(this.f96581C);
                C51423a.m95791b(4, this.f96583E, "aweme id:" + this.f96594o.getAid() + "can play: " + this.f96594o.isCanPlay() + "  is delete:" + this.f96594o.isDelete());
                if (!this.f96594o.isCanPlay()) {
                    this.f96584a.post(new RunnableC41422w(this));
                }
            } else if (C37699a.m76271aq(this.f96594o)) {
                this.f96586c.mo89338a(this.f96581C);
            } else {
                if (!C37699a.m76314s(this.f96594o) || !C37699a.m76202E(this.f96594o)) {
                    if (!C37699a.m76202E(this.f96594o)) {
                        this.f96586c.mo89338a(this.f96580B);
                    } else {
                        this.f96586c.mo89338a(this.f96581C);
                    }
                } else if (C37699a.m76203F(this.f96594o)) {
                    this.f96586c.mo89338a(this.f96580B);
                    return;
                } else if (C37699a.m76275au(this.f96594o).booleanValue()) {
                    this.f96586c.mo89338a(this.f96581C);
                    return;
                } else if (!C37699a.m76243aO(this.f96594o) || C37699a.m76313r(this.f96594o) || C37699a.m76291d(this.f96594o.getAwemeRawAd())) {
                    this.f96586c.mo89338a(this.f96581C);
                } else {
                    this.f96586c.mo89338a(this.f96580B);
                }
                if (C80580in.m139687c() || m83286p()) {
                    this.f96586c.mo89338a(this.f96581C);
                }
            }
        }
    }

    @AbstractC90264r
    public void receiveJumpToRecord(C76107b bVar) {
        this.f96603z = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo70666c(String str) {
        this.f96588e.mo61368a(str);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo70664b(Boolean bool) {
        this.f96584a.f81886b = bool.booleanValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f96579A;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.mo61005b(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo70665b(String str) {
        AbstractC0952i iVar = this.f96588e.f81976g;
        if ((iVar instanceof LayoutInflater$Factory2C0956j) && ((LayoutInflater$Factory2C0956j) iVar).f3399c) {
            C1731i.m5640b(new CallableC41415p(this, str), C1731i.f5564c);
        } else {
            this.f96588e.mo61368a(str);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onTalentProfileAdEvent(C38486c cVar) {
        List<Aweme> list;
        C41426z g;
        if (cVar != null && (list = cVar.f90907a) != null && (g = mo70670g()) != null && g.f96636k != null) {
            g.f96636k.mo70395c(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70656a(ScrollableViewPager.AbstractC34662a aVar) {
        if (this.f96589j.isPlaylistCleanMode()) {
            this.f96584a.f81890f = new ScrollableViewPager.AbstractC34662a() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414054 */

                static {
                    Covode.recordClassIndex(49300);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a
                /* renamed from: a */
                public final boolean mo61308a(float f, float f2) {
                    return false;
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager.AbstractC34662a
                /* renamed from: a */
                public final boolean mo61309a(int i) {
                    return false;
                }
            };
            return;
        }
        this.f96584a.f81890f = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C59218am mo70654a(C59218am amVar) {
        amVar.f134902d = this.f96589j.getPreviousPage();
        amVar.f134903e = this.f96589j.getUid();
        amVar.f134901c = this.f96589j.getFeedsAwemeId();
        String str = f96578w.get(this.f96589j.getEventType());
        if (!TextUtils.isEmpty(str)) {
            amVar.mo96758a(str);
        }
        if (m83291u()) {
            amVar.mo96758a("playlist");
            amVar.f134906r = this.f96589j.getPlayListId();
            amVar.f134900b = this.f96589j.getEnterPlaylistGroupId();
        }
        return amVar;
    }

    /* renamed from: b */
    public final void mo70663b(Aweme aweme) {
        String authorUid = aweme.getAuthorUid();
        if ((!aweme.isAd() || !C37699a.m76202E(aweme)) && aweme.isAd() && aweme.getAwemeRawAd() != null) {
            aweme.getAwemeRawAd().setPageFrom(this.f96589j.getEventType());
        }
        this.f96596q = authorUid;
        String eventType = this.f96589j.getEventType();
        int i = this.f96602y;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(eventType, "");
        C49672ag agVar = new C49672ag(21, aweme);
        agVar.f114320f = eventType;
        agVar.f114323i = i;
        AbstractC81915c.m141874a(agVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70658a(Boolean bool) {
        this.f96584a.setPagingMainValve(bool.booleanValue());
    }

    /* renamed from: a */
    public final void mo70657a(Aweme aweme) {
        if (!this.f96598s) {
            if (TextUtils.equals(this.f96599t, aweme.getAid())) {
                this.f96598s = true;
            } else {
                return;
            }
        }
        if (!TextUtils.equals(this.f96600u, aweme.getAid())) {
            this.f96600u = aweme.getAid();
            if (TextUtils.equals(this.f96589j.getFrom(), "from_challenge") && TextUtils.equals(this.f96589j.getEventType(), "challenge") && TextUtils.equals(this.f96589j.getPreviousPage(), "discovery")) {
                C39162r.m79460a("discovery_video_play", new C33744d().mo59983a("enter_from", "challenge").mo59983a("tag_id", this.f96589j.getChallengeId()).mo59983a("group_id", aweme.getAid()).mo59983a("process_id", this.f96589j.getProcessId()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(RequestIdService.m70076a().mo60693a(aweme, this.f96589j.getVideoType() + 3000))).mo59983a("tag_line", this.f96582D).f79943a);
            } else if (TextUtils.equals(this.f96589j.getFrom(), "from_music") && TextUtils.equals(this.f96589j.getEventType(), "single_song") && TextUtils.equals(this.f96589j.getPreviousPage(), "discovery")) {
                C39162r.m79460a("discovery_video_play", new C33744d().mo59983a("enter_from", "single_song").mo59983a("music_id", this.f96589j.getMusicId()).mo59983a("group_id", aweme.getAid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(RequestIdService.m70076a().mo60693a(aweme, this.f96589j.getVideoType() + 4000))).mo59983a("tag_line", this.f96582D).f79943a);
            }
            if (TextUtils.equals(this.f96589j.getFrom(), "from_discovery_challenge") && TextUtils.equals(this.f96589j.getEventType(), "discovery")) {
                C39162r.m79460a("discovery_video_play", new C33744d().mo59983a("enter_from", "discovery").mo59983a("tag_id", this.f96589j.getChallengeId()).mo59983a("group_id", aweme.getAid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(RequestIdService.m70076a().mo60693a(aweme, this.f96589j.getVideoType() + 3000))).mo59983a("tag_line", this.f96582D).f79943a);
            } else if (TextUtils.equals(this.f96589j.getFrom(), "from_music") && TextUtils.equals(this.f96589j.getEventType(), "discovery")) {
                C39162r.m79460a("discovery_video_play", new C33744d().mo59983a("enter_from", "discovery").mo59983a("music_id", this.f96589j.getMusicId()).mo59983a("group_id", aweme.getAid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(RequestIdService.m70076a().mo60693a(aweme, this.f96589j.getVideoType() + 4000))).mo59983a("tag_line", this.f96582D).f79943a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    @org.greenrobot.eventbus.AbstractC90264r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollToProfileEvent(com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad r6) {
        /*
        // Method dump skipped, instructions count: 477
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.onScrollToProfileEvent(com.ss.android.ugc.aweme.feed.i.ad):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70659a(Integer num) {
        IAdSceneService iAdSceneService;
        C41178b bVar;
        AbstractC48149ai aC;
        String aid;
        String a = this.f96586c.mo89335a(num.intValue());
        if ("page_profile".equals(a)) {
            String str = this.f96587d.f121740f;
            if (this.f96587d.f121741g == null) {
                aid = "";
            } else {
                aid = this.f96587d.f121741g.getAid();
            }
            AbstractC64005b.C64007b.m115770a(str, aid);
        }
        String a2 = this.f96586c.mo89335a(num.intValue());
        if ("page_feed".equals(a2) || "page_profile".equals(a2)) {
            if (num.intValue() == 0) {
                AbstractC81915c.m141874a(new C60796e());
                if (this.f96579A != null && m83289s()) {
                    this.f96579A.onResume();
                }
            } else if (num.intValue() == 1) {
                if (this.f96579A != null && m83289s()) {
                    this.f96579A.onPause();
                }
                C36141a.C36142a.f85377d = String.valueOf(num);
                C41426z g = mo70670g();
                if (!(g == null || (bVar = g.f96636k) == null || (aC = bVar.mo81108aC()) == null)) {
                    aC.mo80207b(6);
                }
            }
        }
        if (!this.f96587d.f121746l && this.f96584a != null && TextUtils.equals(a, "page_profile") && this.f96594o != null && (iAdSceneService = this.f96597r) != null) {
            iAdSceneService.mo28466c().mo28513c(this.f96594o, getContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo70660a(String str) {
        if (!"on_ear_phone_unplug".equals(str)) {
            return;
        }
        if (C81079v.m140776O().mo123892o()) {
            C81079v.m140776O().mo123908B();
            C59092g.m108570a("play", this.f96589j.getFrom(), this.f96594o);
            return;
        }
        C59092g.m108570a("pause", this.f96589j.getFrom(), this.f96594o);
    }

    /* renamed from: a */
    public static C41401l m83282a(C49812b bVar, Bundle bundle) {
        bundle.putSerializable("feed_param", bVar);
        C41401l lVar = new C41401l();
        lVar.setArguments(bundle);
        return lVar;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f96592m = DataCenter.m69492a(C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null), this);
        this.f96584a = (ScrollableViewPager) view.findViewById(R.id.fgn);
        this.f96597r = AdSceneServiceImpl.m33210f();
        Bundle arguments = getArguments();
        this.f96589j = (C49812b) arguments.getSerializable("feed_param");
        this.f96590k = arguments.getBoolean("extra_challenge_is_hashtag", false);
        this.f96602y = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        this.f96582D = arguments.getString("extra_hashtag_tagline", "");
        if (TextUtils.equals("", this.f96599t) && this.f96589j.getAid() != null) {
            this.f96599t = this.f96589j.getAid();
        }
        String from = this.f96589j.getFrom();
        if (C89219l.m154714a((Object) "from_profile_self", (Object) from) || C89219l.m154714a((Object) "from_profile_other", (Object) from) || C89219l.m154714a((Object) "from_roaming", (Object) from)) {
            this.f96591l = true;
        }
        String string = arguments.getString("auto_route_schema", "");
        if (!TextUtils.isEmpty(string)) {
            SmartRouter.buildRoute(this, string).open();
        }
        this.f96586c = ScrollSwitchStateManager.C52950a.m97811a(getActivity());
        this.f96587d = HomePageDataViewModel.C52942a.m97777a(getActivity());
        C34700p.C34701a b = mo70662b();
        b.f81981b = new C34700p.AbstractC34703b() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414108 */

            static {
                Covode.recordClassIndex(49305);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.AbstractC34703b
            /* renamed from: a */
            public final void mo61373a(HashMap<Integer, C34685e> hashMap) {
                C41401l.this.f96586c.mo89343a(hashMap);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.AbstractC34703b
            /* renamed from: a */
            public final void mo61374a(List<C34690j> list) {
                C41401l.this.f96586c.mo89344a(list);
            }
        };
        if (this.f96589j.isHotSpot() || MSAdaptionService.m97895c().mo89377c(getContext())) {
            this.f96588e = b.mo61371a(getChildFragmentManager());
        } else {
            this.f96588e = b.mo61371a(getFragmentManager());
        }
        this.f96584a.setAdapter(this.f96588e);
        this.f96584a.mo61356a(new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414032 */

            static {
                Covode.recordClassIndex(49298);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
                C41401l.this.f96586c.mo89355d(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                C41401l.this.f96586c.mo89352c(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                C41401l.this.f96586c.mo89336a(i, f, i2);
            }
        });
        this.f96586c.mo89339a(new AbstractC52954b() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414043 */

            static {
                Covode.recordClassIndex(49299);
            }

            @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
            /* renamed from: a */
            public final int mo70679a() {
                return C41401l.this.f96584a.getCurrentItem();
            }

            @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
            /* renamed from: a */
            public final void mo70680a(int i) {
                C41401l.this.f96584a.setCurrentItem(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.homepage.api.interaction.AbstractC52954b
            /* renamed from: a */
            public final void mo70681a(int i, boolean z) {
                C41401l.this.f96584a.mo61355a(i, z);
            }
        });
        this.f96584a.setOnFlingEndListener(new AbstractC34691k() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414086 */

            static {
                Covode.recordClassIndex(49303);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34691k
            /* renamed from: a */
            public final void mo61352a() {
                C41401l.this.f96586c.mo89340a(EnumC52955c.INSTANCE);
            }
        });
        this.f96586c.mo89356d(getActivity(), new C41421v(this));
        this.f96586c.mo89356d(getActivity(), new C41412m(this));
        this.f96586c.mo89337a(getActivity(), new C41413n(this));
        ScrollSwitchStateManager scrollSwitchStateManager = this.f96586c;
        ActivityC0945e activity = getActivity();
        C41416q qVar = new C41416q(this);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(qVar, "");
        scrollSwitchStateManager.f121761c.observe(activity, qVar);
        this.f96586c.mo89349b(this, new C41417r(this));
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.f96586c;
        ActivityC0945e activity2 = getActivity();
        C41418s sVar = new C41418s(this);
        C89219l.m154721d(activity2, "");
        C89219l.m154721d(sVar, "");
        scrollSwitchStateManager2.f121762d.observe(activity2, sVar);
        this.f96586c.mo89357e(getActivity(), new C41419t(this));
        this.f96585b = BusinessComponentServiceUtils.newScrollSwitchHelper(getActivity(), this.f96584a, this.f96588e);
        this.f96580B = new C41119a(getActivity());
        this.f96581C = new C41120b(getActivity(), this.f96580B);
        this.f96588e.notifyDataSetChanged();
        HomePageDataViewModel.C52942a.m97777a(getActivity()).mo89326a(this.f96589j.getEventType());
        this.f96586c.mo89342a("page_feed", false);
        if (this.f96589j.isChain()) {
            this.f96588e.f81978i = C41420u.f96623a;
        }
        AwemeChangeCallBack.m108594a(getActivity(), this, new AwemeChangeCallBack.AbstractC59111a() {
            /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414065 */

            static {
                Covode.recordClassIndex(49301);
            }

            @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
            /* renamed from: a */
            public final void mo37101a(Aweme aweme) {
                boolean z;
                C41401l.this.f96601v = false;
                if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null)) {
                    aweme.getAwemeRawAd().setPageFrom(C41401l.this.f96589j.getEventType());
                }
                if (!(C41401l.this.f96595p == aweme || C41401l.this.f96597r == null)) {
                    AbstractC17897a c = C41401l.this.f96597r.mo28466c();
                    Context context = C41401l.this.getContext();
                    if (!TextUtils.equals(C41401l.this.f96589j.getEventType(), "general_search") || C41401l.this.f96595p != null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c.mo28510a(aweme, context, false, z);
                }
                C41401l.this.f96595p = aweme;
                if (aweme != null && aweme.getAuthor() != null) {
                    C41401l.this.f96594o = aweme;
                    C41401l.this.mo70657a(aweme);
                    C41401l.this.mo70667c();
                    C41401l.this.mo70655a();
                    C41401l.this.f96593n = aweme.getAuthorUid();
                    C29339a.m58753a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l.C414065.RunnableC414071 */

                        static {
                            Covode.recordClassIndex(49302);
                        }

                        public final void run() {
                            if (C41401l.this.isAdded() && !C41401l.this.getActivity().isFinishing() && C41401l.this.f96594o != null) {
                                C41401l.this.mo70663b(C41401l.this.f96594o);
                            }
                        }
                    }, 300);
                }
            }
        });
        this.f96586c.mo89338a(this.f96580B);
        this.f96587d.f121743i.observe(getActivity(), new C41414o(this));
        if (m83289s()) {
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this, true);
            this.f96579A = analysisStayTimeFragmentComponent;
            analysisStayTimeFragmentComponent.f81540b = new C41423x(this);
        }
    }

    /* renamed from: a */
    public final void mo70661a(boolean z, int i) {
        Aweme aweme;
        long j;
        C41122a aVar = C41122a.f96119a;
        C41426z g = mo70670g();
        if (g != null) {
            aweme = g.f96636k.mo70518x();
        } else {
            aweme = null;
        }
        String from = this.f96589j.getFrom();
        int videoType = this.f96589j.getVideoType();
        String eventType = this.f96589j.getEventType();
        C41426z g2 = mo70670g();
        if (g2 != null) {
            j = g2.f96636k.mo70444K();
        } else {
            j = -1;
        }
        aVar.mo70373a(aweme, from, videoType, eventType, j, z, i, this.f96589j);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.wi, viewGroup, false);
    }
}
