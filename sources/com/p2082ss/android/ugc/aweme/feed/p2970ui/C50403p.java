package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.p1998c.p2001c.C27404ap;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.C33069b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34567d;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.experiment.C46871ea;
import com.p2082ss.android.ugc.aweme.feed.C48315aj;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48152al;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48292q;
import com.p2082ss.android.ugc.aweme.feed.api.C48334h;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e;
import com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49589f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2946g.C49567b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49687o;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49698y;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49750g;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49764q;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49772a;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49806f;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.AbstractC49787b;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49885v;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49982q;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49986s;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2976c.C50454a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.follow.p2996b.C51073b;
import com.p2082ss.android.ugc.aweme.follow.p2996b.C51074c;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51079a;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51084e;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.homepage.api.data.C52948a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.model.C58724c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59102i;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.C59037aw;
import com.p2082ss.android.ugc.aweme.main.C59063c;
import com.p2082ss.android.ugc.aweme.metrics.C59250o;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61499b;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.service.AbstractC67848b;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.sticker.types.unlock.C76107b;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.p2082ss.android.ugc.aweme.utils.C80456ft;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.p */
public class C50403p extends AbstractC50300f implements AbstractC15497d, AbstractC48152al, AbstractC49589f, AbstractC49750g, AbstractC49764q, AbstractC50084au, AbstractC59102i, AbstractC67848b, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private int f116364A = -1;

    /* renamed from: B */
    private boolean f116365B = true;

    /* renamed from: C */
    private LiveSkyLightTouchEventFrameLayout f116366C;

    /* renamed from: D */
    private FrameLayout f116367D;

    /* renamed from: E */
    private TextView f116368E;

    /* renamed from: F */
    private boolean f116369F = false;

    /* renamed from: G */
    private MineUserStoryFetcher f116370G = new MineUserStoryFetcher((byte) 0);

    /* renamed from: H */
    private AbstractC50407b f116371H;

    /* renamed from: I */
    private boolean f116372I = false;

    /* renamed from: m */
    AbstractC49588e f116373m;

    /* renamed from: n */
    FrameLayout f116374n;

    /* renamed from: o */
    C50069ap f116375o;

    /* renamed from: p */
    boolean f116376p = false;

    /* renamed from: q */
    public C49885v f116377q = new C49885v("homepage_follow");

    /* renamed from: r */
    AbstractC49787b f116378r = null;

    /* renamed from: z */
    private C88411a f116379z = new C88411a();

    static {
        Covode.recordClassIndex(59535);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49589f
    /* renamed from: b */
    public final boolean mo80042b() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49589f
    /* renamed from: c */
    public final Fragment mo81378c() {
        return this;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(167, new RunnableC90250g(C50403p.class, "onProfileFollow", C35503c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C50403p.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(168, new RunnableC90250g(C50403p.class, "receiveJumpToRecord", C76107b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(169, new RunnableC90250g(C50403p.class, "onLiveRoomScrollEvent", C58724c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(170, new RunnableC90250g(C50403p.class, "onVideoPublishEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(35, new RunnableC90250g(C50403p.class, "onBlockUserEvent", C63494a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(13, new RunnableC90250g(C50403p.class, "onProfileFollowEvent", C35503c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(171, new RunnableC90250g(C50403p.class, "onRefreshFollowEvent", C51074c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(172, new RunnableC90250g(C50403p.class, "onLeaveFollowFeedPage", C51073b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59102i
    /* renamed from: u */
    public final String mo85175u() {
        return "FeedFollowFragment";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50084au
    /* renamed from: r */
    public final ViewGroup mo85219r() {
        return this.f116367D;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.p$a */
    class C50406a extends AbstractC50407b<C49986s> {
        static {
            Covode.recordClassIndex(59538);
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: b */
        public final void mo85594b() {
            ((C49986s) this.f116383b).f115321c = true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: a */
        public final void mo85588a() {
            this.f116383b.mo67838a((AbstractC39085b) new C51079a());
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: d */
        public final boolean mo85596d() {
            C49986s sVar = (C49986s) this.f116383b;
            if (sVar.f92286h == null || !((AbstractC39100a) sVar.f92286h).isDataEmpty()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: e */
        public final boolean mo85597e() {
            C49986s sVar = (C49986s) this.f116383b;
            if (sVar.f92286h == null || !((C51079a) sVar.f92286h).f117825h) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: c */
        public final boolean mo85595c() {
            List<FollowFeed> list;
            C61499b a = C61499b.C61500a.m111344a("feed");
            C49986s sVar = (C49986s) this.f116383b;
            ArrayList arrayList = null;
            if (!(sVar.f92286h == null || (list = ((C51079a) sVar.f92286h).f117824g) == null || list.size() == 0)) {
                arrayList = new ArrayList();
                for (FollowFeed followFeed : list) {
                    if (followFeed.getFeedType() == 65280) {
                        arrayList.add(followFeed.getAweme().getAid());
                    }
                }
            }
            if (!C13603b.m24435a((Collection) arrayList)) {
                a.f139601c = arrayList;
            } else if (a.f139601c != null) {
                a.f139601c.clear();
            }
            C39101b bVar = this.f116383b;
            C51084e a2 = C51084e.C51085a.m95502a(4, 2, 1, C61499b.C61500a.m111344a("feed").mo99145b());
            a2.f117862a = C61499b.C61500a.m111344a("feed").mo99143a();
            return bVar.mo57616a(4, a2.mo86497a());
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: a */
        public final void mo85589a(AbstractC49992x xVar) {
            ((C49986s) this.f116383b).f115320b = xVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: a */
        public final boolean mo85593a(Object obj) {
            C39101b bVar = this.f116383b;
            FollowFeed followFeed = new FollowFeed();
            followFeed.setFeedType(1);
            followFeed.setAweme((Aweme) obj);
            return bVar.mo67867a(followFeed, 0);
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: a */
        public final void mo85591a(boolean z) {
            String str;
            boolean z2;
            Fragment fragment = C50403p.this.f116587v;
            if (fragment instanceof AbstractC59105l) {
                str = ((AbstractC59105l) fragment).mo96557p();
            } else {
                str = "";
            }
            C49986s sVar = (C49986s) this.f116383b;
            C50403p pVar = C50403p.this;
            if (!(pVar.getActivity() instanceof AbstractC59103j) || !ScrollSwitchStateManager.C52950a.m97811a(pVar.getActivity()).mo89350b("page_feed") || !((AbstractC59103j) pVar.getActivity()).isUnderMainTab()) {
                z2 = false;
            } else {
                z2 = true;
            }
            ((C51079a) sVar.f92286h).f117820c = z;
            sVar.f115319a = z;
            sVar.f115322d = !z2;
            C39101b bVar = this.f116383b;
            C51084e a = C51084e.C51085a.m95502a(1, 0, 1, C61499b.C61500a.m111344a("feed").mo99145b());
            a.f117863b = str;
            bVar.mo57616a(1, a.mo86497a());
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: a */
        public final boolean mo85592a(Aweme aweme) {
            C49986s sVar = (C49986s) this.f116383b;
            String authorUid = aweme.getAuthorUid();
            if (!TextUtils.isEmpty(authorUid) && ((AbstractC39100a) sVar.f92286h).getItems() != null) {
                for (int size = ((AbstractC39100a) sVar.f92286h).getItems().size() - 1; size >= 0; size--) {
                    Aweme aweme2 = ((AbstractC61496a) ((AbstractC39100a) sVar.f92286h).getItems().get(size)).getAweme();
                    if (aweme2 != null && TextUtils.equals(authorUid, aweme2.getAuthorUid())) {
                        ((AbstractC39100a) sVar.f92286h).getItems().remove(size);
                    }
                }
            }
            return mo85593a((Object) aweme);
        }

        C50406a(C49986s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.AbstractC50407b
        /* renamed from: a */
        public final void mo85590a(String str, String str2, String str3) {
            C39101b bVar = this.f116383b;
            C51084e a = C51084e.C51085a.m95502a(1, 0, 1, C61499b.C61500a.m111344a("feed").mo99145b());
            a.f117863b = str;
            a.f117864c = str2;
            a.f117865d = str3;
            bVar.mo57616a(1, a.mo86497a());
        }
    }

    /* renamed from: z */
    private void m94510z() {
        if (this.f116140j != null) {
            m94506A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49589f
    /* renamed from: e */
    public final void mo81379e() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f116135a;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.mo85755f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49589f
    /* renamed from: f */
    public final void mo81380f() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f116135a;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.mo85754e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49750g
    /* renamed from: g */
    public final boolean mo84306g() {
        return this.f116371H.mo85597e();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: h */
    public final C39101b mo85163h() {
        return this.f116371H.f116383b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c
    /* renamed from: k */
    public final boolean mo70693k() {
        m94510z();
        return super.mo70693k();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: m */
    public final void mo85166m() {
        this.f116377q.mo84732bG();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50083at
    /* renamed from: p */
    public final AbstractC48149ai mo85172p() {
        return this.f116377q.mo81108aC();
    }

    /* renamed from: A */
    private int m94506A() {
        C49885v vVar = this.f116377q;
        if (vVar != null) {
            return vVar.mo84729bD();
        }
        return 0;
    }

    /* renamed from: y */
    private static boolean m94509y() {
        if (C16048b.m29633a().mo25412a(true, "i18n_following_live_skylight_type", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    /* renamed from: G */
    public final SparseArray<AbstractC81911c> mo61042G() {
        SparseArray<AbstractC81911c> G = super.mo61042G();
        G.append(C34567d.C34568a.f81607c, this.f116377q);
        return G;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: i */
    public final boolean mo85164i() {
        this.f116371H.mo85594b();
        return this.f116371H.mo85595c();
    }

    /* renamed from: n */
    public final void mo85577n() {
        if (this.f116375o != null) {
            af_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48152al
    /* renamed from: o */
    public final boolean mo80291o() {
        C49885v vVar = this.f116377q;
        if (vVar == null || !vVar.mo84763bp()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        this.f116379z.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: q */
    public final void mo85173q() {
        this.f116141k.setRefreshing(true);
        mo85156a(false);
    }

    /* renamed from: B */
    private void m94507B() {
        if (this.f116375o != null && af_()) {
            mo85576a(false, false);
            mo85577n();
        }
    }

    /* renamed from: v */
    static boolean m94508v() {
        AbstractC58593c d = LiveOuterService.m107269s().mo95830d();
        if (d != null) {
            return ((Boolean) d.mo12981a("live_skylight_frequently_refresh", (Object) false)).booleanValue();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak
    /* renamed from: a */
    public final void mo70521a() {
        m94510z();
        this.f116371H.mo85595c();
        if (C49783b.m93234a()) {
            C49772a.m93222b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50084au
    /* renamed from: s */
    public final void mo85220s() {
        C50069ap apVar = this.f116375o;
        if (apVar != null) {
            apVar.mo85205a(new ArrayList());
            m94507B();
            FrameLayout frameLayout = this.f116374n;
            if (frameLayout != null) {
                mo85575a(frameLayout, false, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50084au
    /* renamed from: t */
    public final void mo85221t() {
        C50069ap apVar = this.f116375o;
        if (apVar != null) {
            apVar.mo85205a(new ArrayList());
            m94507B();
            FrameLayout frameLayout = this.f116374n;
            if (frameLayout != null) {
                mo85575a(frameLayout, false, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49764q
    /* renamed from: d */
    public final void mo71309d() {
        C50069ap apVar;
        if (m94509y() && (apVar = this.f116375o) != null) {
            if (apVar.f115596c.size() == 0) {
                m94507B();
            } else if (!this.f116369F && this.f116375o != null && af_() && m94509y()) {
                mo85576a(true, false);
                mo85577n();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: j */
    public final void mo85468j() {
        AbstractC49588e a = BusinessComponentServiceUtils.getBusinessBridgeService().mo121228a(this, this);
        this.f116373m = a;
        this.f116377q.f114981a = a;
        this.f116137c.mo61104a((int) C13628n.m24520b(getActivity(), 49.0f), (int) C13628n.m24520b(getActivity(), 113.0f));
        this.f116141k = new C59037aw(this.f116137c);
        this.f116377q.mo84688a((ViewPager.AbstractC1579e) new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.C504041 */

            static {
                Covode.recordClassIndex(59536);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
                if (r4 == (r3.f116380a.f116377q.f114768W.getCount() - 1)) goto L_0x0018;
             */
            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r4) {
                /*
                    r3 = this;
                    boolean r0 = com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b.m93234a()
                    if (r0 == 0) goto L_0x0033
                    r1 = 1
                    if (r4 == 0) goto L_0x0018
                    if (r4 <= 0) goto L_0x002c
                    com.ss.android.ugc.aweme.feed.ui.p r0 = com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.this     // Catch:{ Exception -> 0x002f }
                    com.ss.android.ugc.aweme.feed.q.v r0 = r0.f116377q     // Catch:{ Exception -> 0x002f }
                    com.ss.android.ugc.aweme.feed.adapter.b r0 = r0.f114768W     // Catch:{ Exception -> 0x002f }
                    int r0 = r0.getCount()     // Catch:{ Exception -> 0x002f }
                    int r0 = r0 - r1
                    if (r4 != r0) goto L_0x002c
                L_0x0018:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x002f }
                    boolean r0 = com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b.m93234a()     // Catch:{ Exception -> 0x002f }
                    if (r0 == 0) goto L_0x002e
                    java.util.concurrent.atomic.AtomicBoolean r1 = com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49806f.f114573c     // Catch:{ Exception -> 0x002f }
                    boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x002f }
                    r1.set(r0)     // Catch:{ Exception -> 0x002f }
                    goto L_0x002e
                L_0x002c:
                    r1 = 0
                    goto L_0x0018
                L_0x002e:
                    return
                L_0x002f:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x0033:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.C504041.onPageSelected(int):void");
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onDestroyView() {
        super.onDestroyView();
        this.f116377q.mo70413r();
        C50069ap apVar = this.f116375o;
        if (apVar != null) {
            C49982q qVar = apVar.f115594a;
            if (qVar == null) {
                C89219l.m154710a("mPresenter");
            }
            qVar.f115312a.dispose();
        }
        AbstractC49787b bVar = this.f116378r;
        if (bVar != null) {
            bVar.mo84326a();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onResume() {
        String str;
        super.onResume();
        if (this.f116364A == -1) {
            this.f116364A = C31575b.m65865g().getCurUser().getFollowingCount();
        }
        if (getUserVisibleHint() && isResumed() && this.f116587v != null && !this.f116587v.isHidden() && C80456ft.m139463a()) {
            C49907s.m93686a(EnumC48310af.FOLLOW);
            if (!this.f116365B) {
                Fragment fragment = this.f116587v;
                if (fragment instanceof AbstractC59105l) {
                    str = ((AbstractC59105l) fragment).mo96558q();
                } else {
                    str = null;
                }
                C1731i.m5640b(new CallableC50466w(this, str), C39162r.m79452a());
            }
            this.f116365B = false;
        }
        getActivity().getWindow().setBackgroundDrawableResource(R.color.a2);
        if (this.f116372I) {
            this.f116372I = false;
        }
    }

    @AbstractC90264r
    public void receiveJumpToRecord(C76107b bVar) {
        this.f116372I = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    @AbstractC90264r
    public void onProfileFollow(C35503c cVar) {
        AbstractC49588e eVar = this.f116373m;
        if (eVar != null) {
            eVar.mo81327a(cVar);
        }
    }

    @AbstractC90264r
    public void onRefreshFollowEvent(C51074c cVar) {
        mo85156a(false);
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo85156a(false);
        }
    }

    @AbstractC90264r
    public void onBlockUserEvent(C63494a aVar) {
        User user = aVar.f144112a;
        C50069ap apVar = this.f116375o;
        if (apVar != null && user != null && apVar.mo85206b(user.getUid()) == 0) {
            m94507B();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: a */
    public final DmtStatusView mo85153a(Context context) {
        C50090az azVar = new C50090az(context);
        azVar.mo85224a(C50463t.f116559a, new C50464u(this), new C50465v(this));
        azVar.mo85226d(1);
        azVar.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.n4));
        return azVar;
    }

    @AbstractC90264r
    public void onLeaveFollowFeedPage(C51073b bVar) {
        if (this.f116369F) {
            C50069ap apVar = this.f116375o;
            String str = bVar.f117800a;
            C89219l.m154721d(str, "");
            for (T t : apVar.f115596c) {
                if (C89361p.m154872a(str, t.getUser().getUid(), true)) {
                    t.setShowBluePoint(false);
                }
            }
            apVar.mo85201a();
        }
    }

    @AbstractC90264r
    public void onProfileFollowEvent(C35503c cVar) {
        if (this.f116375o != null && cVar.f83728a == 0 && cVar.f83729b != null && (cVar.f83729b instanceof User) && this.f116375o.mo85206b(((User) cVar.f83729b).getUid()) == 0) {
            m94507B();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: d */
    public final void mo85159d(boolean z) {
        super.mo85159d(z);
        AbstractC81915c.m141874a(new C50454a(2, this.f116377q.mo81109aD(), this.f116377q));
        AbstractC49588e eVar = this.f116373m;
        if (eVar != null) {
            eVar.onPause();
        }
        this.f116377q.mo84793n(z);
        C49806f.m93268b(false);
    }

    @AbstractC90264r
    public void onLiveRoomScrollEvent(C58724c cVar) {
        C50069ap apVar = this.f116375o;
        C89219l.m154721d(cVar, "");
        C50074aq aqVar = apVar.f115595b;
        if (aqVar == null) {
            C89219l.m154710a("mListView");
        }
        long j = cVar.f133657a;
        if (j >= 0) {
            C48292q qVar = aqVar.f115606b;
            if (qVar == null) {
                C89219l.m154710a("mAdapter");
            }
            List e = qVar.mo63369e();
            C89219l.m154716b(e, "");
            int i = 0;
            for (Object obj : e) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                C48337k kVar = (C48337k) obj;
                if (!(kVar instanceof C48337k) || kVar.getUser().roomId != j) {
                    i = i2;
                } else if (i > 0) {
                    aqVar.mo85211a(i - 1);
                    return;
                } else {
                    aqVar.mo85211a(i);
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50084au
    /* renamed from: a */
    public final void mo85218a(List<C48337k> list) {
        if (this.f116375o != null && af_()) {
            this.f116376p = true;
            this.f116375o.mo85205a(list);
            this.f116368E.setText(C17867d.m33078a().getResources().getQuantityString(R.plurals.ex, list.size(), Integer.valueOf(list.size())));
            mo85576a(true, false);
            mo85577n();
            mo85575a(this.f116374n, false, true);
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        String string = bundle.getString(C34792be.f82123b, "");
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d("Following");
        String d2 = Hox.C15490a.m28529a(getActivity()).mo25216d(d);
        String d3 = Hox.C15490a.m28529a(getActivity()).mo25216d(d2);
        if (string.equals(C34792be.f82126e) || bundle.getBoolean(d)) {
            this.f116377q.mo70492e(false);
            AbstractC81915c.m141874a(new C33069b(false));
            mo85159d(false);
        } else if (string.equals(C34792be.f82125d) || bundle.getBoolean(d2)) {
            mo85159d(true);
        } else if (string.equals(C34792be.f82124c) || bundle.getBoolean(d3)) {
            AbstractC48149ai aC = this.f116377q.mo81108aC();
            if (aC != null) {
                aC.mo80207b(1);
            }
            Aweme aweme = HomePageDataViewModel.C52942a.m97777a(getActivity()).f121745k;
            if (aweme != null) {
                C49567b.C49568a.f114022a.mo81321a(aweme.getAid());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r5.mo27383e() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        if (r6.f116371H.mo85596d() == false) goto L_0x00f6;
     */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85158c(boolean r7) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p.mo85158c(boolean):void");
    }

    @AbstractC90264r
    public void onVideoPublishEvent(C49672ag agVar) {
        Aweme a;
        Aweme a2;
        if (agVar.f114315a == 15 && C46871ea.m90184a()) {
            C50114bh.f115687b = true;
            if (agVar.f114316b instanceof Aweme) {
                Aweme aweme = (Aweme) agVar.f114316b;
                if (C46871ea.m90186b(aweme)) {
                    if (C76706a.m134277c(aweme)) {
                        a2 = C76706a.m134283i((Aweme) agVar.f114316b);
                        C77260g.f173332a.mo120158f().mo120166a(a2);
                    } else {
                        a2 = AwemeService.m70060b().mo60677a(aweme);
                    }
                    if (a2 != null && !C80636z.m139819d(a2)) {
                        if (C76706a.m134277c(aweme)) {
                            this.f116371H.mo85592a(MineUserStoryFetcher.m135716a());
                        } else {
                            this.f116371H.mo85593a((Object) a2);
                        }
                        DmtStatusView b = mo85467b(true);
                        if (b != null) {
                            b.mo27382d();
                        }
                        AbstractC49588e eVar = this.f116373m;
                        if (eVar != null) {
                            eVar.mo81333c();
                        }
                    }
                }
            } else if (agVar.f114316b instanceof List) {
                boolean z = false;
                for (Aweme aweme2 : C27404ap.m54810a((List) agVar.f114316b)) {
                    if (C46871ea.m90186b(aweme2)) {
                        if (C76706a.m134277c(aweme2)) {
                            a = C76706a.m134283i(aweme2);
                            C77260g.f173332a.mo120158f().mo120166a(a);
                        } else {
                            a = AwemeService.m70060b().mo60677a(aweme2);
                        }
                        if (a != null && !C80636z.m139819d(a)) {
                            if (C76706a.m134277c(aweme2)) {
                                this.f116371H.mo85592a(MineUserStoryFetcher.m135716a());
                            } else {
                                this.f116371H.mo85593a((Object) a);
                            }
                            z = true;
                        }
                    }
                }
                if (z) {
                    DmtStatusView b2 = mo85467b(true);
                    if (b2 != null) {
                        b2.mo27382d();
                    }
                    AbstractC49588e eVar2 = this.f116373m;
                    if (eVar2 != null) {
                        eVar2.mo81333c();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        String string = bundle.getString(C34792be.f82123b, "");
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d("Following");
        String d2 = Hox.C15490a.m28529a(getActivity()).mo25216d(d);
        String d3 = Hox.C15490a.m28529a(getActivity()).mo25216d(d2);
        if (string.equals(C34792be.f82126e) || bundle.getBoolean(d)) {
            this.f116377q.mo70492e(true);
            if (isResumed() && this.f116587v != null && !this.f116587v.isHidden()) {
                C49907s.m93686a(EnumC48310af.FOLLOW);
                C59250o oVar = new C59250o();
                oVar.f135279a = "homepage_follow";
                oVar.mo96792f();
            }
            if (this.f116369F) {
                AbstractC81915c.m141874a(new C33069b(true));
            }
            mo85158c(false);
        } else if (string.equals(C34792be.f82125d) || bundle.getBoolean(d2)) {
            this.f116377q.mo70492e(true);
            if (isResumed() && this.f116587v != null && !this.f116587v.isHidden()) {
                C49907s.m93686a(EnumC48310af.FOLLOW);
                C59250o oVar2 = new C59250o();
                oVar2.f135279a = "homepage_follow";
                oVar2.mo96792f();
            }
            if (this.f116369F) {
                AbstractC81915c.m141874a(new C33069b(true));
            }
            mo85158c(true);
        } else if (string.equals(C34792be.f82124c) || bundle.getBoolean(d3)) {
            this.f116377q.mo70492e(true);
            if (isResumed() && this.f116587v != null && !this.f116587v.isHidden()) {
                C49907s.m93686a(EnumC48310af.FOLLOW);
                C59250o oVar3 = new C59250o();
                oVar3.f135279a = "homepage_follow";
                oVar3.mo96792f();
            }
            if (this.f116369F) {
                AbstractC81915c.m141874a(new C33069b(true));
            }
            mo85158c(true);
            AbstractC48149ai aC = this.f116377q.mo81108aC();
            if (aC != null) {
                aC.mo80207b(1);
            }
            Aweme aweme = HomePageDataViewModel.C52942a.m97777a(getActivity()).f121745k;
            if (aweme != null) {
                C49567b.C49568a.f114022a.mo81321a(aweme.getAid());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: a */
    public final boolean mo85156a(boolean z) {
        AbstractC49588e eVar = this.f116373m;
        if (eVar != null) {
            eVar.mo81333c();
        }
        C50069ap apVar = this.f116375o;
        if (apVar != null && this.f116376p) {
            apVar.mo85204a("homepage_folllow_refresh");
        }
        AbstractC81915c.m141874a(new C49687o());
        if (!C31575b.m65865g().isLogin()) {
            this.f116377q.mo84907f();
            AbstractC81915c.m141874a(new C49698y("HOME"));
            return false;
        } else if (!super.mo85156a(z)) {
            return false;
        } else {
            m94510z();
            this.f116371H.mo85591a(z);
            this.f116364A = C31575b.m65865g().getCurUser().getFollowingCount();
            if (!C49783b.m93234a()) {
                return true;
            }
            C49772a.m93222b();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.p$b */
    abstract class AbstractC50407b<T extends C39101b> {

        /* renamed from: b */
        public T f116383b;

        static {
            Covode.recordClassIndex(59539);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo85588a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo85589a(AbstractC49992x xVar);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo85590a(String str, String str2, String str3);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo85591a(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo85592a(Aweme aweme);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo85593a(Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo85594b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo85595c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract boolean mo85596d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract boolean mo85597e();

        AbstractC50407b(T t) {
            this.f116383b = t;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        MethodCollector.m26663i(7284);
        if (this.f116371H == null) {
            this.f116371H = new C50406a(new C49986s());
        }
        this.f116371H = this.f116371H;
        super.onViewCreated(view, bundle);
        mo85721x();
        this.f116366C = (LiveSkyLightTouchEventFrameLayout) view.findViewById(R.id.b44);
        this.f116367D = (FrameLayout) view.findViewById(R.id.b5h);
        this.f116374n = (FrameLayout) view.findViewById(R.id.b5g);
        this.f116368E = (TextView) view.findViewById(R.id.f42);
        this.f116374n.setOnClickListener(new View$OnClickListenerC50422q(this));
        this.f116377q.mo70460a(new C49812b().setEventType("homepage_follow").setPageType(1).setPreviousPagePosition("follow_button"));
        this.f116377q.mo70393a(view, bundle);
        this.f116377q.mo84915a((AbstractC48151ak) this);
        this.f116377q.f114982b = this;
        this.f116377q.mo70471a((AbstractC49746c) this);
        this.f116377q.f114817as = this;
        this.f116377q.f114983c = this;
        this.f116140j.mo67839a_(this.f116377q);
        this.f116371H.mo85589a((AbstractC49992x) this.f116377q);
        this.f116140j.mo67865a((AbstractC39103d) this.f116377q);
        this.f116371H.mo85588a();
        m94510z();
        Fragment fragment = this.f116587v;
        String str3 = null;
        if (fragment instanceof AbstractC59105l) {
            AbstractC59105l lVar = (AbstractC59105l) fragment;
            C52948a o = lVar.mo96550o();
            if (o != null) {
                str3 = o.mo89329a();
                str = o.mo89330b();
                str2 = o.mo89331c();
            } else {
                String p = lVar.mo96557p();
                str2 = null;
                str3 = p;
                str = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        if (C31575b.m65865g().isLogin()) {
            this.f116371H.mo85590a(str3, str, str2);
        } else {
            this.f116377q.mo84907f();
        }
        C59063c.m108543a().mo96594a(false);
        if (m94509y()) {
            Context context = view.getContext();
            C50069ap apVar = new C50069ap();
            this.f116375o = apVar;
            C89219l.m154721d(context, "");
            C89219l.m154721d(this, "");
            C89219l.m154721d(this, "");
            apVar.f115594a = new C49982q(this);
            apVar.f115595b = new C50074aq(context);
            mo85219r().removeAllViews();
            C50074aq aqVar = apVar.f115595b;
            if (aqVar == null) {
                C89219l.m154710a("mListView");
            }
            ViewGroup.LayoutParams layoutParams = aqVar.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin += C34723i.m70927b();
                ViewGroup r = mo85219r();
                C50074aq aqVar2 = apVar.f115595b;
                if (aqVar2 == null) {
                    C89219l.m154710a("mListView");
                }
                r.addView(aqVar2, marginLayoutParams);
                apVar.f115597d = new WeakReference<>(getActivity());
                FrameLayout frameLayout = this.f116367D;
                FrameLayout frameLayout2 = this.f116374n;
                C89219l.m154721d(frameLayout, "");
                C89219l.m154721d(frameLayout2, "");
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.height = C34728n.m70946a(173.0d) + C34723i.m70927b();
                    frameLayout.setLayoutParams(marginLayoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.topMargin += C34728n.m70946a(58.0d) + C34723i.m70927b();
                        frameLayout2.setLayoutParams(marginLayoutParams3);
                        this.f116366C.setScrollPredicate(new C50423r(this));
                        this.f116366C.setCallBack(new C50424s(this));
                        C50069ap apVar2 = this.f116375o;
                        if (apVar2 != null) {
                            apVar2.mo85204a("homepage_hot");
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        MethodCollector.m26664o(7284);
                        throw nullPointerException;
                    }
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    MethodCollector.m26664o(7284);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.m26664o(7284);
                throw nullPointerException3;
            }
        }
        if (this.f116378r == null && C49783b.m93234a()) {
            this.f116378r = C48334h.m91798a().newTopNoticeFeedManager(getActivity(), this.f116136b);
        }
        C49806f.m93268b(true);
        EventBus.m156966a(EventBus.m156962a(), this);
        MethodCollector.m26664o(7284);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85576a(boolean z, boolean z2) {
        if (this.f116375o != null && af_()) {
            int b = C50069ap.m94001b();
            if (z) {
                this.f116377q.mo84906d();
                this.f116375o.mo85202a(this.f116366C, 0.0f, (float) b, z2);
                this.f116366C.setNeedIntercept(true);
                AbstractC81915c.m141874a(new C33069b(true));
            } else {
                this.f116377q.mo84908j();
                this.f116375o.mo85202a(this.f116366C, (float) b, 0.0f, z2);
                this.f116366C.setNeedIntercept(false);
                AbstractC81915c.m141874a(new C33069b(false));
            }
            C59063c.m108543a().mo96594a(z);
            this.f116369F = z;
            C48315aj.f111964a = z;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.f116373m.mo81334d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C35434c.m72461a("homepage_follow");
        return C1870c.m6045a((Activity) getContext(), (int) R.layout.a0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85575a(View view, boolean z, boolean z2) {
        if (this.f116375o != null && af_() && view != null) {
            if (z) {
                this.f116375o.mo85203a(view, z2);
            } else {
                this.f116375o.mo85207b(view, z2);
            }
        }
    }
}
