package com.p2082ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2366a.C34483c;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39098d;
import com.p2082ss.android.ugc.aweme.experiment.C46954ft;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48165at;
import com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49504ag;
import com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49852ap;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49961ae;
import com.p2082ss.android.ugc.aweme.feed.p2978w.C50486a;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.RecommendCommonUserView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.View$OnClickListenerC64377l;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63823ab;
import com.p2082ss.android.ugc.aweme.recommend.users.C66649a;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2 */
public class EmptyGuideV2 implements AbstractC39097c<View$OnClickListenerC64377l>, AbstractC39098d<View$OnClickListenerC48170aw>, AbstractC49588e, AbstractC49852ap, AbstractC63857u, AbstractC63857u {

    /* renamed from: a */
    public static final String f114034a = EmptyGuideV2.class.getSimpleName();

    /* renamed from: b */
    public DmtStatusView f114035b;

    /* renamed from: c */
    public RecommendCommonUserView f114036c;

    /* renamed from: d */
    public RecommendSuperUserView f114037d;

    /* renamed from: e */
    public Activity f114038e;

    /* renamed from: f */
    public String f114039f;

    /* renamed from: g */
    public C35321b f114040g;

    /* renamed from: h */
    public AbstractC49589f f114041h = AbstractC49589f.f114091e_;

    /* renamed from: i */
    private final View f114042i;

    /* renamed from: j */
    private SimpleDMTDefaultView f114043j;

    /* renamed from: k */
    private List<String> f114044k;

    /* renamed from: l */
    private AbstractC34638b f114045l;

    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    /* renamed from: a */
    public final View mo81325a() {
        return this.f114042i;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    /* renamed from: d */
    public final void mo81334d() {
        m92910b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.f114037d.mo81346a();
    }

    static {
        Covode.recordClassIndex(58412);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        DmtStatusView dmtStatusView = this.f114035b;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: j */
    private boolean m92916j() {
        RecommendCommonUserView recommendCommonUserView = this.f114036c;
        if (recommendCommonUserView != null && recommendCommonUserView.getVisibility() == 0) {
            return true;
        }
        RecommendSuperUserView recommendSuperUserView = this.f114037d;
        if (recommendSuperUserView == null || recommendSuperUserView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m92913g() {
        if (!C66649a.f149816a.mo105651a(true) || SharePrefCache.inst().getIsContactsUploaded().mo59941c().booleanValue()) {
            m92915i();
        } else {
            m92914h();
        }
    }

    /* renamed from: h */
    private void m92914h() {
        m92915i();
        if (SharePrefCache.inst().getIsEuropeCountry().mo59941c().booleanValue() || C46954ft.m90242b()) {
            this.f114043j.mo81367b();
        } else {
            this.f114043j.mo81365a(EnumC17270a.SOLID, R.drawable.aeo, R.string.at9).mo81364a(new View$OnClickListenerC49586c(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    /* renamed from: c */
    public final void mo81333c() {
        AbstractC34638b bVar = this.f114045l;
        if (bVar != null) {
            bVar.setRefreshing(false);
        }
        if (this.f114041h.mo81377b()) {
            if (C46954ft.m90241a()) {
                this.f114037d.setVisibility(8);
                this.f114037d.mo81346a();
            } else {
                this.f114036c.setVisibility(8);
            }
            mo81330a(C31575b.m65865g().isLogin());
            this.f114041h.mo81380f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        RecommendSuperUserView recommendSuperUserView;
        if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).isOnFollowPage(this.f114038e) && (recommendSuperUserView = this.f114037d) != null && recommendSuperUserView.getVisibility() == 0) {
            RecommendSuperUserView recommendSuperUserView2 = this.f114037d;
            RecyclerView recyclerView = recommendSuperUserView2.f114077a;
            if (recyclerView == null) {
                C89219l.m154710a("list");
            }
            GalleryLayoutManager galleryLayoutManager = recommendSuperUserView2.f114079c;
            if (galleryLayoutManager == null) {
                C89219l.m154710a("layoutManager");
            }
            RecyclerView.ViewHolder f = recyclerView.mo4451f(galleryLayoutManager.f114053b);
            if (f != null) {
                Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
                ((View$OnClickListenerC48170aw) f).mo80308e();
            }
        }
    }

    /* renamed from: e */
    private void m92911e() {
        SimpleDMTDefaultView e = this.f114043j.mo81372e((int) C13628n.m24520b(this.f114038e, 7.0f));
        int b = (int) C13628n.m24520b(this.f114038e, 16.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.f114082a.getLayoutParams();
        marginLayoutParams.topMargin = b;
        e.f114082a.setLayoutParams(marginLayoutParams);
        e.mo81371d(C13628n.m24521b(this.f114038e) / 5).mo81363a((int) C13628n.m24520b(this.f114038e, 247.0f)).f114083b.setVisibility(8);
    }

    /* renamed from: f */
    private void m92912f() {
        if (C66649a.f149816a.mo105652b()) {
            this.f114043j.mo81366a("").mo81371d((C13628n.m24521b(this.f114038e) - ((int) C13628n.m24520b(this.f114038e, 172.0f))) / 2).mo81363a((int) C13628n.m24520b(this.f114038e, 180.0f)).mo81370c(R.string.ewm).mo81362a().mo81365a(EnumC17270a.SOLID, -1, R.string.ew8).mo81364a(new View$OnClickListenerC49582a(this));
        } else {
            this.f114043j.mo81368b(R.string.dh2).mo81370c(R.string.byf).mo81365a(EnumC17270a.SOLID, -1, R.string.cy6).mo81364a(new View$OnClickListenerC49585b(this));
        }
    }

    /* renamed from: i */
    private void m92915i() {
        if (C46954ft.m90242b()) {
            this.f114043j.mo81368b(R.string.by2).mo81369c().mo81370c(R.string.by1).mo81371d(((int) C13628n.m24520b(this.f114038e, 58.0f)) + (C13628n.m24521b(this.f114038e) / 13)).mo81372e((int) C13628n.m24520b(this.f114038e, 12.0f)).mo81367b();
            return;
        }
        if (!C31575b.m65865g().isLogin() || C31575b.m65865g().getCurUser().getFollowingCount() == 0) {
            this.f114043j.mo81368b(R.string.byn);
        } else {
            this.f114043j.mo81366a("");
        }
        this.f114043j.mo81370c(R.string.byf).mo81367b();
    }

    /* renamed from: b */
    public final void mo81331b() {
        AbstractC34638b bVar = this.f114045l;
        if (bVar != null) {
            bVar.setRefreshing(false);
        }
        if (this.f114041h.mo81377b()) {
            mo81330a(C31575b.m65865g().isLogin());
            if (C46954ft.m90241a()) {
                this.f114037d.setVisibility(0);
                this.f114037d.setOnViewFirstShowListener(this);
            } else {
                this.f114036c.setVisibility(0);
                this.f114036c.setReminderText(R.string.evs);
                this.f114036c.setBackgroundResource(R.color.c9);
                this.f114036c.setOnViewAttachedToWindowListener(this);
            }
            this.f114041h.mo81379e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: b */
    public final void mo81332b(RecommendList recommendList) {
        mo81328a(recommendList);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c
    /* renamed from: a */
    public final /* synthetic */ void mo67855a(View$OnClickListenerC64377l lVar) {
        User user;
        View$OnClickListenerC64377l lVar2 = lVar;
        if (lVar2 != null && (user = lVar2.f145964e) != null) {
            m92909b(user);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39098d
    /* renamed from: b */
    public final /* synthetic */ void mo67856b(View$OnClickListenerC48170aw awVar) {
        User user;
        UserWithAweme userWithAweme = awVar.f111577i;
        if (userWithAweme != null && (user = userWithAweme.getUser()) != null) {
            m92909b(user);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    /* renamed from: a */
    public final void mo81326a(AbstractC34638b bVar) {
        this.f114045l = bVar;
        mo81330a(C31575b.m65865g().isLogin());
        m92910b(false);
    }

    /* renamed from: b */
    private void m92909b(User user) {
        if (this.f114044k == null) {
            this.f114044k = new ArrayList();
        }
        if (!this.f114044k.contains(user.getUid())) {
            C50486a.m94649a(user, "impression", mo81324a(user), this.f114039f, "cold_launch");
            this.f114044k.add(user.getUid());
        }
    }

    /* renamed from: a */
    public final int mo81324a(User user) {
        C35321b bVar = this.f114040g;
        if (bVar instanceof C63823ab) {
            return ((C63823ab) bVar).mo103279a(user.getUid());
        }
        if (bVar instanceof C49961ae) {
            return ((C49961ae) bVar).mo85001a(user.getUid());
        }
        if (user != null) {
            return 0;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81328a(RecommendList recommendList) {
        boolean z;
        DmtStatusView dmtStatusView = this.f114035b;
        if (dmtStatusView != null) {
            dmtStatusView.mo27382d();
        }
        if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() <= 0) {
            mo81333c();
            return;
        }
        this.f114039f = recommendList.getRid();
        this.f114036c.mo103885a(recommendList.getUserList(), recommendList.getRid());
        boolean hasMore = recommendList.hasMore();
        RecommendCommonUserView recommendCommonUserView = this.f114036c;
        if (!C31575b.m65865g().isLogin() || !hasMore) {
            z = false;
        } else {
            z = true;
        }
        recommendCommonUserView.setShowLookMore(z);
        if (C46954ft.m90242b()) {
            RecommendCommonUserView recommendCommonUserView2 = this.f114036c;
            if (recommendCommonUserView2.f145852e != null) {
                recommendCommonUserView2.f145852e.mo4413b(0);
            }
        }
        this.f114036c.setOnItemOperationListener(new C64357h.AbstractC64362b() {
            /* class com.p2082ss.android.ugc.aweme.feed.guide.EmptyGuideV2.C495734 */

            static {
                Covode.recordClassIndex(58416);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.AbstractC64362b
            /* renamed from: a */
            public final void mo81339a() {
                if (C31575b.m65865g().isLogin()) {
                    ((C63823ab) EmptyGuideV2.this.f114040g).mo103281a(30, C31575b.m65865g().getCurUserId(), 2, C80619d.m139776a(), 2, null);
                } else {
                    EmptyGuideV2.this.f114036c.post(new RunnableC49587d(this));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.AbstractC64362b
            /* renamed from: c */
            public final void mo81342c(User user) {
                C50486a.m94649a(user, "enter_profile", EmptyGuideV2.this.mo81324a(user), EmptyGuideV2.this.f114039f, "cold_launch");
                C50486a.m94650a(EmptyGuideV2.this.f114039f, user);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.AbstractC64362b
            /* renamed from: b */
            public final void mo81341b(User user) {
                if (user.getFollowStatus() == 0) {
                    C50486a.m94649a(user, "follow", EmptyGuideV2.this.mo81324a(user), EmptyGuideV2.this.f114039f, "cold_launch");
                    C50486a.m94648a(user);
                    return;
                }
                C50486a.m94649a(user, "follow_cancel", EmptyGuideV2.this.mo81324a(user), EmptyGuideV2.this.f114039f, "cold_launch");
                C50486a.m94651b(user);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.AbstractC64362b
            /* renamed from: a */
            public final void mo81340a(User user) {
                C50486a.m94649a(user, "delete", EmptyGuideV2.this.mo81324a(user), EmptyGuideV2.this.f114039f, "cold_launch");
                if (EmptyGuideV2.this.f114040g != null) {
                    ((C63823ab) EmptyGuideV2.this.f114040g).mo103282a(user);
                }
            }
        });
        this.f114036c.setOnLookMoreUserListener(new RecommendCommonUserView.AbstractC64344a() {
            /* class com.p2082ss.android.ugc.aweme.feed.guide.EmptyGuideV2.C495745 */

            static {
                Covode.recordClassIndex(58417);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.RecommendCommonUserView.AbstractC64344a
            /* renamed from: a */
            public final void mo81343a() {
                SmartRouter.buildRoute(EmptyGuideV2.this.f114038e, "//friends/find").withParam("previous_page", "").open();
                C39162r.m79460a("click_add_friends", new C33744d().mo59983a("enter_from", "homepage_follow").mo59983a("enter_method", "click_card").mo59983a("trigger_reason", "cold_launch_non_login").f79943a);
            }
        });
        mo81331b();
    }

    /* renamed from: b */
    private void m92910b(boolean z) {
        String str;
        if (this.f114041h.mo81377b()) {
            mo81333c();
            if (this.f114045l != null && m92916j()) {
                this.f114045l.setRefreshing(true);
            }
            if (C46954ft.m90241a()) {
                if (this.f114040g == null) {
                    this.f114040g = new C49961ae(new C48165at(), this);
                }
                C35321b bVar = this.f114040g;
                if (bVar instanceof C49961ae) {
                    ((C49961ae) bVar).mo85002a();
                }
            } else if (z || this.f114040g == null || C46954ft.m90242b()) {
                if (this.f114040g == null) {
                    this.f114040g = new C63823ab(new RecommendCommonUserModel(), this);
                }
                C35321b bVar2 = this.f114040g;
                if (bVar2 instanceof C63823ab) {
                    C63823ab abVar = (C63823ab) bVar2;
                    if (C31575b.m65865g().isLogin()) {
                        str = C31575b.m65865g().getCurUserId();
                    } else {
                        str = "0";
                    }
                    abVar.mo103283a(str, C80619d.m139776a(), C16048b.m29633a().mo25412a(true, "show_super_accounts_to_unlogged_users", 0));
                }
            } else {
                return;
            }
            DmtStatusView dmtStatusView = this.f114035b;
            if (dmtStatusView != null) {
                dmtStatusView.mo27384f();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.AbstractC49588e
    /* renamed from: a */
    public final void mo81327a(C35503c cVar) {
        if (cVar.f83729b instanceof User) {
            RecommendCommonUserView recommendCommonUserView = this.f114036c;
            int i = 0;
            if (recommendCommonUserView == null || C13603b.m24435a((Collection) recommendCommonUserView.getData())) {
                RecommendSuperUserView recommendSuperUserView = this.f114037d;
                if (recommendSuperUserView != null && !C13603b.m24435a((Collection) recommendSuperUserView.getMCardItems())) {
                    List<UserWithAweme> mCardItems = this.f114037d.getMCardItems();
                    User user = (User) cVar.f83729b;
                    int size = mCardItems.size();
                    while (i < size) {
                        User user2 = mCardItems.get(i).getUser();
                        if (TextUtils.equals(user2.getUid(), user.getUid())) {
                            user2.setFollowStatus(cVar.f83728a);
                            if (this.f114040g instanceof C49961ae) {
                                RecommendSuperUserView recommendSuperUserView2 = this.f114037d;
                                if (recommendSuperUserView2.f114079c == null) {
                                    C89219l.m154710a("layoutManager");
                                    return;
                                }
                                GalleryLayoutManager galleryLayoutManager = recommendSuperUserView2.f114079c;
                                if (galleryLayoutManager == null) {
                                    C89219l.m154710a("layoutManager");
                                }
                                Iterator<GalleryLayoutManager.AbstractC49578c> it = galleryLayoutManager.f114061j.iterator();
                                while (it.hasNext()) {
                                    it.next().mo80311h();
                                }
                                return;
                            }
                            return;
                        }
                        i++;
                    }
                    return;
                }
                return;
            }
            List<User> data = this.f114036c.getData();
            User user3 = (User) cVar.f83729b;
            int size2 = data.size();
            while (i < size2) {
                User user4 = data.get(i);
                if (TextUtils.equals(user4.getUid(), user3.getUid())) {
                    user4.setFollowStatus(cVar.f83728a);
                    C35321b bVar = this.f114040g;
                    if (bVar instanceof C63823ab) {
                        ((C63823ab) bVar).mo103286a(data);
                        this.f114036c.mo103885a(data, user4.getRequestId());
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81329a(Exception exc) {
        DmtStatusView dmtStatusView = this.f114035b;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        AbstractC34638b bVar = this.f114045l;
        if (bVar != null) {
            bVar.setRefreshing(false);
        }
        if (exc instanceof C34483c) {
            mo81333c();
        } else {
            C33615a.m68848a((Context) this.f114038e, (Throwable) exc, (int) R.string.g1i);
        }
    }

    /* renamed from: a */
    public final void mo81330a(boolean z) {
        m92911e();
        if (z || C46954ft.m90242b()) {
            m92913g();
        } else {
            m92912f();
        }
    }

    public EmptyGuideV2(Fragment fragment, AbstractC49589f fVar) {
        MethodCollector.m26663i(5959);
        ActivityC0945e activity = fragment.getActivity();
        this.f114038e = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.z6, (ViewGroup) null);
        this.f114042i = inflate;
        this.f114043j = (SimpleDMTDefaultView) inflate.findViewById(R.id.aiu);
        this.f114036c = (RecommendCommonUserView) inflate.findViewById(R.id.fft);
        RecommendSuperUserView recommendSuperUserView = (RecommendSuperUserView) inflate.findViewById(R.id.ebq);
        this.f114037d = recommendSuperUserView;
        recommendSuperUserView.setContainer(new WeakReference<>(this.f114038e));
        if (C49504ag.m92740a()) {
            ViewGroup.LayoutParams layoutParams = this.f114037d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (((((float) C13628n.m24504a(this.f114038e)) * 0.712f) * 1.34f) / 0.93f);
            }
            this.f114037d.setLayoutParams(layoutParams);
        }
        DmtStatusView dmtStatusView = (DmtStatusView) inflate.findViewById(R.id.e7i);
        this.f114035b = dmtStatusView;
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(this.f114038e));
        mo81330a(C31575b.m65865g().isLogin());
        this.f114041h = fVar;
        fragment.getLifecycle().mo4012a(this);
        MethodCollector.m26664o(5959);
    }
}
