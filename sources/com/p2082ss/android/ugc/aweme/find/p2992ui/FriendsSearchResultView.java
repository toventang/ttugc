package com.p2082ss.android.ugc.aweme.find.p2992ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.status.TuxStatusView;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42639ae;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67471ae;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80494gh;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView */
public final class FriendsSearchResultView extends FrameLayout implements AbstractC39102c<SearchUser> {

    /* renamed from: a */
    public SearchKeywordPresenter f117618a;

    /* renamed from: b */
    public AbstractC42640af f117619b;

    /* renamed from: c */
    public ActivityC17312a f117620c;

    /* renamed from: d */
    public boolean f117621d;

    /* renamed from: e */
    private AbstractC42639ae f117622e;

    /* renamed from: f */
    private AbstractC50983a f117623f;

    /* renamed from: g */
    private SparseArray f117624g;

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView$a */
    public interface AbstractC50983a {
        static {
            Covode.recordClassIndex(60161);
        }

        /* renamed from: a */
        void mo86317a();
    }

    static {
        Covode.recordClassIndex(60160);
    }

    public FriendsSearchResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m95387a(int i) {
        if (this.f117624g == null) {
            this.f117624g = new SparseArray();
        }
        View view = (View) this.f117624g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117624g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<SearchUser> list, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView$e */
    static final class C50987e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FriendsSearchResultView f117630a;

        static {
            Covode.recordClassIndex(60165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50987e(FriendsSearchResultView friendsSearchResultView) {
            super(0);
            this.f117630a = friendsSearchResultView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            SearchKeywordPresenter searchKeywordPresenter = this.f117630a.f117618a;
            if (searchKeywordPresenter == null) {
                C89219l.m154710a("keywordPresenter");
            }
            if (!TextUtils.isEmpty(searchKeywordPresenter.mo94218a().f129938a)) {
                this.f117630a.mo86320c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            AbstractC42639ae aeVar = this.f117622e;
            if (aeVar == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            aeVar.ao_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView$c */
    static final class C50985c implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ FriendsSearchResultView f117627a;

        /* renamed from: b */
        final /* synthetic */ SearchKeywordPresenter f117628b;

        static {
            Covode.recordClassIndex(60163);
        }

        C50985c(FriendsSearchResultView friendsSearchResultView, SearchKeywordPresenter searchKeywordPresenter) {
            this.f117627a = friendsSearchResultView;
            this.f117628b = searchKeywordPresenter;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            AbstractC42640af afVar = this.f117627a.f117619b;
            if (afVar == null) {
                C89219l.m154710a("searchUserPresenter");
            }
            afVar.mo72847a(4, this.f117628b.mo94218a().f129938a, 1);
        }
    }

    /* renamed from: a */
    public final void mo86318a() {
        if (this.f117621d) {
            AbstractC42639ae aeVar = this.f117622e;
            if (aeVar == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            aeVar.mo72843f();
            TuxStatusView tuxStatusView = (TuxStatusView) m95387a(R.id.dsk);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            TuxStatusView tuxStatusView = (TuxStatusView) m95387a(R.id.dsk);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) m95387a(R.id.dsk)).mo37867a();
        }
    }

    /* renamed from: c */
    public final void mo86320c() {
        if (this.f117621d) {
            AbstractC42640af afVar = this.f117619b;
            if (afVar == null) {
                C89219l.m154710a("searchUserPresenter");
            }
            Object[] objArr = new Object[3];
            objArr[0] = 1;
            SearchKeywordPresenter searchKeywordPresenter = this.f117618a;
            if (searchKeywordPresenter == null) {
                C89219l.m154710a("keywordPresenter");
            }
            objArr[1] = searchKeywordPresenter.mo94218a().f129938a;
            objArr[2] = 1;
            afVar.mo72847a(objArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            TuxStatusView tuxStatusView = (TuxStatusView) m95387a(R.id.dsk);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) m95387a(R.id.dsk)).setStatus(C79440a.m138170b(new TuxStatusView.C23263c()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView$d */
    public static final class C50986d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ AbstractC50983a f117629a;

        static {
            Covode.recordClassIndex(60164);
        }

        C50986d(AbstractC50983a aVar) {
            this.f117629a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i != 0) {
                this.f117629a.mo86317a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            AbstractC42639ae aeVar = this.f117622e;
            if (aeVar == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            aeVar.mo72845i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            TuxStatusView tuxStatusView = (TuxStatusView) m95387a(R.id.dsk);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            ((TuxStatusView) m95387a(R.id.dsk)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C50987e(this)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.ui.FriendsSearchResultView$b */
    public static final class C50984b implements AbstractC51187d {

        /* renamed from: a */
        final /* synthetic */ FriendsSearchResultView f117625a;

        /* renamed from: b */
        final /* synthetic */ SearchKeywordPresenter f117626b;

        static {
            Covode.recordClassIndex(60162);
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final boolean mo71326a(User user) {
            C89219l.m154721d(user, "");
            return false;
        }

        C50984b(FriendsSearchResultView friendsSearchResultView, SearchKeywordPresenter searchKeywordPresenter) {
            this.f117625a = friendsSearchResultView;
            this.f117626b = searchKeywordPresenter;
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final void mo71325a(View view, User user, int i, String str, String str2) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(user, "");
            C89219l.m154721d(str, "");
            C67446h hVar = C67446h.f151111a;
            String str3 = this.f117626b.mo94218a().f129938a;
            String requestId = user.getRequestId();
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            hVar.mo106197a(i, str3, 0, requestId, uid, this.f117626b.mo94218a().f129938a);
            ActivityC17312a aVar = this.f117625a.f117620c;
            if (aVar == null) {
                C89219l.m154710a("host");
            }
            SmartRouter.buildRoute(aVar, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "find_friends").withParam("extra_previous_page_position", "main_head").withParam("profile_enterprise_type", C63419ae.f143971a.mo101949a(user)).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<SearchUser> list, boolean z) {
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            AbstractC42640af afVar = this.f117619b;
            if (afVar == null) {
                C89219l.m154710a("searchUserPresenter");
            }
            if (!afVar.mo71327d()) {
                AbstractC42639ae aeVar = this.f117622e;
                if (aeVar == null) {
                    C89219l.m154710a("searchUserAdapter");
                }
                aeVar.ap_();
            } else {
                AbstractC42639ae aeVar2 = this.f117622e;
                if (aeVar2 == null) {
                    C89219l.m154710a("searchUserAdapter");
                }
                aeVar2.aq_();
            }
            AbstractC42639ae aeVar3 = this.f117622e;
            if (aeVar3 == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            aeVar3.mo72841b(list);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<SearchUser> list, boolean z) {
        int i;
        String str;
        SearchUser searchUser;
        LogPbBean logPbBean;
        ActivityC17312a aVar = this.f117620c;
        if (aVar == null) {
            C89219l.m154710a("host");
        }
        if (!aVar.isDestroyed()) {
            SearchKeywordPresenter searchKeywordPresenter = this.f117618a;
            if (searchKeywordPresenter == null) {
                C89219l.m154710a("keywordPresenter");
            }
            if (!TextUtils.isEmpty(searchKeywordPresenter.mo94218a().f129938a)) {
                ActivityC17312a aVar2 = this.f117620c;
                if (aVar2 == null) {
                    C89219l.m154710a("host");
                }
                AbstractC67567q a = C67486am.m119565a(aVar2.hashCode());
                if (a == null) {
                    a = new C67471ae();
                    ActivityC17312a aVar3 = this.f117620c;
                    if (aVar3 == null) {
                        C89219l.m154710a("host");
                    }
                    C67486am.m119566a(aVar3.hashCode(), a);
                }
                C67469ad adVar = new C67469ad();
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    if (list == null || (searchUser = list.get(0)) == null || (logPbBean = searchUser.logPb) == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                    adVar.mo106422a(str);
                }
                SearchKeywordPresenter searchKeywordPresenter2 = this.f117618a;
                if (searchKeywordPresenter2 == null) {
                    C89219l.m154710a("keywordPresenter");
                }
                adVar.mo106423b(searchKeywordPresenter2.mo94218a().f129938a);
                a.mo106428a(0, adVar);
                AbstractC42639ae aeVar = this.f117622e;
                if (aeVar == null) {
                    C89219l.m154710a("searchUserAdapter");
                }
                aeVar.mo72842d(true);
                if (!z) {
                    AbstractC42639ae aeVar2 = this.f117622e;
                    if (aeVar2 == null) {
                        C89219l.m154710a("searchUserAdapter");
                    }
                    aeVar2.ap_();
                } else {
                    AbstractC42639ae aeVar3 = this.f117622e;
                    if (aeVar3 == null) {
                        C89219l.m154710a("searchUserAdapter");
                    }
                    aeVar3.aq_();
                }
                TuxStatusView tuxStatusView = (TuxStatusView) m95387a(R.id.dsk);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(8);
                AbstractC42639ae aeVar4 = this.f117622e;
                if (aeVar4 == null) {
                    C89219l.m154710a("searchUserAdapter");
                }
                aeVar4.mo62377b_(list);
                AbstractC42640af afVar = this.f117619b;
                if (afVar == null) {
                    C89219l.m154710a("searchUserPresenter");
                }
                AbstractC39100a e = afVar.mo71328e();
                C89219l.m154716b(e, "");
                T t = e.mData;
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
                T t2 = t;
                C33744d a2 = new C33744d().mo59983a("enter_from", "find_friends");
                SearchKeywordPresenter searchKeywordPresenter3 = this.f117618a;
                if (searchKeywordPresenter3 == null) {
                    C89219l.m154710a("keywordPresenter");
                }
                C39162r.m79461a("search_user", C59208ac.m108761a(a2.mo59983a("search_keyword", searchKeywordPresenter3.mo94218a().f129938a).mo59983a("log_pb", new C27910f().mo46674b(t2.logPb)).f79943a));
            }
        }
    }

    private /* synthetic */ FriendsSearchResultView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FriendsSearchResultView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10332);
        LayoutInflater.from(context).inflate(R.layout.a2t, this);
        MethodCollector.m26664o(10332);
    }

    /* renamed from: a */
    public final void mo86319a(ActivityC17312a aVar, SearchKeywordPresenter searchKeywordPresenter, AbstractC50983a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(searchKeywordPresenter, "");
        C89219l.m154721d(aVar2, "");
        if (!this.f117621d) {
            this.f117621d = true;
            this.f117620c = aVar;
            this.f117623f = aVar2;
            this.f117618a = searchKeywordPresenter;
            AbstractC42640af a = C67446h.f151111a.mo106191a(false);
            this.f117619b = a;
            if (a == null) {
                C89219l.m154710a("searchUserPresenter");
            }
            a.mo72846a(this);
            AbstractC42640af afVar = this.f117619b;
            if (afVar == null) {
                C89219l.m154710a("searchUserPresenter");
            }
            afVar.mo71294a("find_friends_page");
            AbstractC42639ae a2 = C67446h.f151111a.mo106190a(new C67678d(), searchKeywordPresenter, new C50984b(this, searchKeywordPresenter), null, "find_friends");
            this.f117622e = a2;
            if (a2 == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            a2.mo72836a(new C50985c(this, searchKeywordPresenter));
            AbstractC42639ae aeVar = this.f117622e;
            if (aeVar == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            aeVar.mo72844g(getResources().getColor(R.color.c5));
            AbstractC42639ae aeVar2 = this.f117622e;
            if (aeVar2 == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            aeVar2.mo72837a(getResources().getString(R.string.fga));
            C80494gh.m139518a((RecyclerView) m95387a(R.id.ds2), 6);
            RecyclerView recyclerView = (RecyclerView) m95387a(R.id.ds2);
            C89219l.m154716b(recyclerView, "");
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            RecyclerView recyclerView2 = (RecyclerView) m95387a(R.id.ds2);
            C89219l.m154716b(recyclerView2, "");
            AbstractC42639ae aeVar3 = this.f117622e;
            if (aeVar3 == null) {
                C89219l.m154710a("searchUserAdapter");
            }
            Objects.requireNonNull(aeVar3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            recyclerView2.setAdapter((RecyclerView.AbstractC1350a) aeVar3);
            ((RecyclerView) m95387a(R.id.ds2)).mo4405a(new C50986d(aVar2));
        }
    }
}
