package com.p2082ss.android.ugc.aweme.inbox;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.C1428g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.inbox.C56465k;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56566f;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56579h;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.p2082ss.android.ugc.aweme.notification.utils.C62278q;
import com.p2082ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment */
public final class InboxFollowerFragment extends AbstractC34586a implements SwipeRefreshLayout.AbstractC1559b, AbstractC39063h.AbstractC39067a, AbstractC39102c<FollowPageData> {

    /* renamed from: a */
    public final C1213t<InboxAdapterWidget.EnumC56518b> f128366a = new C1213t<>();

    /* renamed from: b */
    C56566f.EnumC56571e f128367b = C56566f.EnumC56571e.UNKNOWN;

    /* renamed from: c */
    boolean f128368c;

    /* renamed from: d */
    private final AbstractC89244h f128369d = C89250i.m154773a((AbstractC89171a) C56279h.f128385a);

    /* renamed from: e */
    private final AbstractC89244h f128370e = C89250i.m154773a((AbstractC89171a) C56278g.f128384a);

    /* renamed from: j */
    private final AbstractC89244h f128371j = C89250i.m154773a((AbstractC89171a) new C56277f(this));

    /* renamed from: k */
    private final AbstractC89244h f128372k = C89250i.m154773a((AbstractC89171a) new C56280i(this));

    /* renamed from: l */
    private List<FollowPageData> f128373l;

    /* renamed from: m */
    private boolean f128374m;

    /* renamed from: n */
    private boolean f128375n;

    /* renamed from: o */
    private LinearLayoutManager f128376o;

    /* renamed from: p */
    private final AbstractC89244h f128377p = C89250i.m154773a((AbstractC89171a) new C56276e(this));

    /* renamed from: q */
    private SparseArray f128378q;

    static {
        Covode.recordClassIndex(66086);
    }

    /* renamed from: c */
    private final C39101b<C56579h> m102241c() {
        return (C39101b) this.f128369d.getValue();
    }

    /* renamed from: d */
    private final InboxAdapterWidget m102242d() {
        return (InboxAdapterWidget) this.f128372k.getValue();
    }

    /* renamed from: h */
    private final C1428g m102243h() {
        return (C1428g) this.f128377p.getValue();
    }

    /* renamed from: a */
    public final View mo93306a(int i) {
        if (this.f128378q == null) {
            this.f128378q = new SparseArray();
        }
        View view = (View) this.f128378q.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f128378q.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C56566f mo93307a() {
        return (C56566f) this.f128371j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<FollowPageData> list, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$c */
    public static final class C56274c extends RecyclerView.AbstractC1361h {
        static {
            Covode.recordClassIndex(66089);
        }

        C56274c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            int a;
            C89219l.m154721d(rect, "");
            C89219l.m154721d(recyclerView, "");
            if (i == 0) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                a = C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                a = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
            }
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            rect.set(0, a, 0, C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system3.getDisplayMetrics())));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        m102245j();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$a */
    public static final class C56272a implements C1175ad.AbstractC1177b {

        /* renamed from: a */
        public final boolean f128379a;

        static {
            Covode.recordClassIndex(66087);
        }

        private /* synthetic */ C56272a() {
            this(false);
        }

        public C56272a(boolean z) {
            this.f128379a = z;
        }

        @Override // androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            C89219l.m154721d(cls, "");
            return cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(this.f128379a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$f */
    static final class C56277f extends AbstractC89220m implements AbstractC89171a<C56566f> {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128383a;

        static {
            Covode.recordClassIndex(66092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56277f(InboxFollowerFragment inboxFollowerFragment) {
            super(0);
            this.f128383a = inboxFollowerFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56566f invoke() {
            return new C56566f(this.f128383a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$g */
    static final class C56278g extends AbstractC89220m implements AbstractC89171a<C56579h> {

        /* renamed from: a */
        public static final C56278g f128384a = new C56278g();

        static {
            Covode.recordClassIndex(66093);
        }

        C56278g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56579h invoke() {
            return new C56579h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$h */
    static final class C56279h extends AbstractC89220m implements AbstractC89171a<C39101b<C56579h>> {

        /* renamed from: a */
        public static final C56279h f128385a = new C56279h();

        static {
            Covode.recordClassIndex(66094);
        }

        C56279h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39101b<C56579h> invoke() {
            return new C39101b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        mo93307a().ao_();
    }

    /* renamed from: i */
    private static boolean m102244i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m102246k() {
        if (this.f128367b != C56566f.EnumC56571e.UNKNOWN) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final boolean m102247m() {
        if (this.f128367b == C56566f.EnumC56571e.EMPTY) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final void m102248n() {
        m102243h().mo4915a((RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>) m102242d().mo87493g());
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$i */
    static final class C56280i extends AbstractC89220m implements AbstractC89171a<InboxAdapterWidget> {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128386a;

        static {
            Covode.recordClassIndex(66095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56280i(InboxFollowerFragment inboxFollowerFragment) {
            super(0);
            this.f128386a = inboxFollowerFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InboxAdapterWidget invoke() {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            InboxFollowerFragment inboxFollowerFragment = this.f128386a;
            InboxAdapterWidget a = b.mo105666a(inboxFollowerFragment, inboxFollowerFragment.f128366a);
            a.mo93313a(new C56272a(true));
            a.f128855d.put("position", "new_followers");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        if (!m102241c().mo67842j()) {
            m102241c().mo57616a(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        m102241c().mo67840h();
        m102241c().ck_();
        SparseArray sparseArray = this.f128378q;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$e */
    static final class C56276e extends AbstractC89220m implements AbstractC89171a<C1428g> {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128382a;

        static {
            Covode.recordClassIndex(66091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56276e(InboxFollowerFragment inboxFollowerFragment) {
            super(0);
            this.f128382a = inboxFollowerFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1428g invoke() {
            C1428g.C1429a.C1430a aVar = new C1428g.C1429a.C1430a();
            aVar.f4697a = true;
            aVar.f4698b = C1428g.C1429a.EnumC1431b.NO_STABLE_IDS;
            C1428g.C1429a a = aVar.mo4916a();
            C89219l.m154716b(a, "");
            return new C1428g(a, C89070n.m154516a(this.f128382a.mo93307a()));
        }
    }

    /* renamed from: j */
    private final void m102245j() {
        ((DmtStatusView) mo93306a(R.id.e77)).mo27382d();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo93306a(R.id.b75);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        this.f128368c = true;
        if (m102246k()) {
            mo93308a(true);
        } else if (this.f128373l != null) {
            mo93307a().mo93499a(this.f128373l, this.f128374m, this.f128367b);
        }
    }

    public InboxFollowerFragment() {
        C1731i.m5640b(C56465k.CallableC56468c.f128767a, C1731i.f5562a);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
    public final void onRefresh() {
        int i;
        getActivity();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m102244i();
        }
        if (C58029j.f132253e) {
            if (m102243h().getItemCount() == 0) {
                ((DmtStatusView) mo93306a(R.id.e77)).mo27384f();
            }
            this.f128373l = null;
            this.f128374m = false;
            this.f128375n = false;
            this.f128368c = false;
            m102241c().mo57616a(1);
            this.f128367b = C56566f.EnumC56571e.UNKNOWN;
            m102242d().mo87494h();
            if (C56323c.m102322i()) {
                i = 534;
            } else {
                i = 7;
            }
            C61542b.m111461a(EnumC61551c.Normal, i);
            AbstractC81915c.m141874a(new C61561m(6, C61542b.m111458a(6)));
            return;
        }
        if (m102243h().getItemCount() <= 0) {
            C1731i.m5631a(100).mo5534a(new C56282k(this), C1731i.f5564c, null);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo93306a(R.id.b75);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setRefreshing(false);
        new C23144b(this).mo37640e(R.string.dcq).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        this.f128375n = true;
        m102245j();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        mo93307a().mo67824j();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$b */
    static final class View$OnClickListenerC56273b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128380a;

        static {
            Covode.recordClassIndex(66088);
        }

        View$OnClickListenerC56273b(InboxFollowerFragment inboxFollowerFragment) {
            this.f128380a = inboxFollowerFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f128380a.requireActivity().finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$d */
    static final class View$OnClickListenerC56275d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128381a;

        static {
            Covode.recordClassIndex(66090);
        }

        View$OnClickListenerC56275d(InboxFollowerFragment inboxFollowerFragment) {
            this.f128381a = inboxFollowerFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f128381a.onRefresh();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$k */
    public static final class C56282k<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128388a;

        static {
            Covode.recordClassIndex(66097);
        }

        C56282k(InboxFollowerFragment inboxFollowerFragment) {
            this.f128388a = inboxFollowerFragment;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!this.f128388a.f43439h) {
                ((DmtStatusView) this.f128388a.mo93306a(R.id.e77)).mo27387h();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.InboxFollowerFragment$j */
    static final class C56281j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ InboxFollowerFragment f128387a;

        static {
            Covode.recordClassIndex(66096);
        }

        C56281j(InboxFollowerFragment inboxFollowerFragment) {
            this.f128387a = inboxFollowerFragment;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C56566f.EnumC56571e eVar;
            if (InboxAdapterWidget.f128851g.contains(obj)) {
                InboxFollowerFragment inboxFollowerFragment = this.f128387a;
                C89219l.m154716b(obj, "");
                if (inboxFollowerFragment.f128367b == C56566f.EnumC56571e.UNKNOWN) {
                    if (obj == InboxAdapterWidget.EnumC56518b.SUCCESS) {
                        eVar = C56566f.EnumC56571e.SOME;
                    } else {
                        eVar = C56566f.EnumC56571e.EMPTY;
                    }
                    inboxFollowerFragment.f128367b = eVar;
                    if (inboxFollowerFragment.f128368c) {
                        inboxFollowerFragment.mo93308a(false);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m102242d().mo87492f().observe(this, new C56281j(this));
        m102242d().mo87493g().setHasStableIds(false);
        m102242d().bw_().postValue(true);
        getLifecycle().mo4012a(m102242d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo93308a(boolean z) {
        if (!this.f128375n) {
            List<FollowPageData> list = this.f128373l;
            if ((list == null || list.isEmpty()) && m102247m()) {
                ((DmtStatusView) mo93306a(R.id.e77)).mo27385g();
                return;
            }
            List<FollowPageData> list2 = this.f128373l;
            if (list2 == null || list2.isEmpty()) {
                mo93307a().mo93502l();
                m102248n();
                return;
            }
            m102248n();
            if (z) {
                mo93307a().mo93499a(this.f128373l, this.f128374m, this.f128367b);
                m102242d().mo87494h();
                return;
            }
            mo93307a().mo93498a(this.f128367b);
        } else if (mo93307a().getItemCount() == 0) {
            ((DmtStatusView) mo93306a(R.id.e77)).mo27387h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<FollowPageData> list, boolean z) {
        this.f128373l = C56408a.C56413e.m102390a(list);
        this.f128374m = z;
        m102245j();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<FollowPageData> list, boolean z) {
        mo93307a().aq_();
        mo93307a().mo62376b(C56408a.C56413e.m102390a(list));
        mo93307a().mo67829d(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(2652);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C23073a.C23074a.m43506a(this).mo37494a(R.color.a2j).mo37495a(true).f54627a.mo33415d();
        m102241c().mo67838a((AbstractC39085b) ((C56579h) this.f128370e.getValue()));
        m102241c().mo67839a_(this);
        ((TuxIconView) mo93306a(R.id.ph)).setOnClickListener(new View$OnClickListenerC56273b(this));
        getContext();
        this.f128376o = new FixedLinearlayoutManager();
        RecyclerView recyclerView = (RecyclerView) mo93306a(R.id.b74);
        C89219l.m154716b(recyclerView, "");
        LinearLayoutManager linearLayoutManager = this.f128376o;
        if (linearLayoutManager == null) {
            C89219l.m154710a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo93306a(R.id.b74);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(m102243h());
        ((RecyclerView) mo93306a(R.id.b74)).mo4405a(new C51425a(getContext()));
        C62278q.m112666a((RecyclerView) mo93306a(R.id.b74), (SwipeRefreshLayout) mo93306a(R.id.b75));
        ((RecyclerView) mo93306a(R.id.b74)).mo4405a(new C51425a(getContext()));
        ((RecyclerView) mo93306a(R.id.b74)).mo4402a(new C56274c());
        ((SwipeRefreshLayout) mo93306a(R.id.b75)).setOnRefreshListener(this);
        mo93307a().mo67829d(false);
        mo93307a().mo67813a((AbstractC39063h.AbstractC39067a) this);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.k6, (ViewGroup) null);
        TuxIconView tuxIconView = (TuxIconView) inflate.findViewById(R.id.er5);
        C89219l.m154716b(tuxIconView, "");
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            marginLayoutParams2.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 162.0f, system.getDisplayMetrics()));
        }
        ((DmtStatusView) mo93306a(R.id.e77)).setBuilder(DmtStatusView.C17269a.m31905a(getActivity()).mo27397a().mo27406b(inflate).mo27400a(2131233181, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC56275d(this)));
        onRefresh();
        MethodCollector.m26664o(2652);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.k3, viewGroup, false);
    }
}
