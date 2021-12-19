package com.p2082ss.android.ugc.aweme.relation.recommend;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67103e;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.n */
public final class C66995n extends AbstractC34488b {

    /* renamed from: d */
    public static final C67000d f150312d = new C67000d((byte) 0);

    /* renamed from: b */
    public C66994m f150313b;

    /* renamed from: c */
    public C66991l f150314c;

    /* renamed from: e */
    private final lifecycleAwareLazy f150315e;

    /* renamed from: j */
    private final AbstractC89244h f150316j = C89250i.m154773a((AbstractC89171a) C67011m.f150340a);

    /* renamed from: k */
    private SparseArray f150317k;

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$b */
    public static final class C66997b extends AbstractC89220m implements AbstractC89183m<SocialRecRequestState, Bundle, SocialRecRequestState> {
        public static final C66997b INSTANCE = new C66997b();

        static {
            Covode.recordClassIndex(78574);
        }

        public C66997b() {
            super(2);
        }

        public final SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState, Bundle bundle) {
            C89219l.m154719c(socialRecRequestState, "");
            return socialRecRequestState;
        }
    }

    static {
        Covode.recordClassIndex(78572);
    }

    /* renamed from: c */
    private final SocialRecRequestViewModel m118699c() {
        return (SocialRecRequestViewModel) this.f150315e.getValue();
    }

    /* renamed from: e */
    private final String m118700e() {
        return (String) this.f150316j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f150317k == null) {
            this.f150317k = new SparseArray();
        }
        View view = (View) this.f150317k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f150317k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f150317k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$d */
    public static final class C67000d {
        static {
            Covode.recordClassIndex(78577);
        }

        private C67000d() {
        }

        public /* synthetic */ C67000d(byte b) {
            this();
        }

        /* renamed from: a */
        public static C66995n m118705a(C66994m mVar) {
            C89219l.m154721d(mVar, "");
            C66995n nVar = new C66995n();
            Bundle bundle = new Bundle();
            bundle.putSerializable("recommendFriendsConfig", mVar);
            nVar.setArguments(bundle);
            return nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$a */
    public static final class C66996a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f150318a;

        static {
            Covode.recordClassIndex(78573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66996a(AbstractC89277c cVar) {
            super(0);
            this.f150318a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f150318a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$m */
    static final class C67011m extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C67011m f150340a = new C67011m();

        static {
            Covode.recordClassIndex(78588);
        }

        C67011m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return g.getCurUserId();
        }
    }

    /* renamed from: b */
    public final void mo105879b() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            ((SocialRecFlowModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150412b.postValue(new Bundle());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$c */
    public static final class C66998c extends AbstractC89220m implements AbstractC89171a<SocialRecRequestViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150319a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f150320b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f150321c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f150322d;

        static {
            Covode.recordClassIndex(78575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66998c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f150319a = fragment;
            this.f150320b = aVar;
            this.f150321c = cVar;
            this.f150322d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f150319a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f150320b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f150321c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m118704x60af60c0(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel> r0 = com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.relation.recommend.n$c$1 r0 = new com.ss.android.ugc.aweme.relation.recommend.n$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.recommend.C66995n.C66998c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_relation_recommend_SocialRecommendFriendsFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m118704x60af60c0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$j */
    static final class RunnableC67008j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C66995n f150334a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f150335b;

        static {
            Covode.recordClassIndex(78585);
        }

        RunnableC67008j(C66995n nVar, AbstractC89171a aVar) {
            this.f150334a = nVar;
            this.f150335b = aVar;
        }

        public final void run() {
            if (this.f150334a.af_()) {
                RecyclerView recyclerView = (RecyclerView) this.f150334a.mo60929a(R.id.doh);
                C89219l.m154716b(recyclerView, "");
                if (recyclerView.getAdapter() != null) {
                    this.f150335b.invoke();
                }
            }
        }
    }

    public C66995n() {
        AbstractC89277c a = C89204ab.m154669a(SocialRecRequestViewModel.class);
        C66996a aVar = new C66996a(a);
        this.f150315e = new lifecycleAwareLazy(this, aVar, new C66998c(this, aVar, a, C66997b.INSTANCE));
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$l */
    static final class C67010l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66995n f150338a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f150339b;

        static {
            Covode.recordClassIndex(78587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67010l(C66995n nVar, C89233z.C89236c cVar) {
            super(0);
            this.f150338a = nVar;
            this.f150339b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C89233z.C89236c cVar = this.f150339b;
            RecyclerView recyclerView = (RecyclerView) this.f150338a.mo60929a(R.id.doh);
            C89219l.m154716b(recyclerView, "");
            RecyclerView recyclerView2 = (RecyclerView) this.f150338a.mo60929a(R.id.doh);
            C89219l.m154716b(recyclerView2, "");
            RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.recommend.SocialRecommendFriendsAdapter");
            RecyclerView recyclerView3 = (RecyclerView) this.f150338a.mo60929a(R.id.doh);
            C89219l.m154716b(recyclerView3, "");
            RecyclerView.AbstractC1362i layoutManager = recyclerView3.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            cVar.element = C66995n.m118697a(recyclerView, (C66991l) adapter, (LinearLayoutManager) layoutManager);
            int i = this.f150339b.element;
            RecyclerView recyclerView4 = (RecyclerView) this.f150338a.mo60929a(R.id.doh);
            C89219l.m154716b(recyclerView4, "");
            if (i > recyclerView4.getHeight()) {
                View a = this.f150338a.mo60929a(R.id.dq6);
                C89219l.m154716b(a, "");
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                RecyclerView recyclerView5 = (RecyclerView) this.f150338a.mo60929a(R.id.doh);
                C89219l.m154716b(recyclerView5, "");
                float height = (float) recyclerView5.getHeight();
                RecyclerView recyclerView6 = (RecyclerView) this.f150338a.mo60929a(R.id.doh);
                C89219l.m154716b(recyclerView6, "");
                TextTitleBar textTitleBar = (TextTitleBar) this.f150338a.mo60929a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                layoutParams.height = ((int) ((height * (((float) recyclerView6.getHeight()) + 0.0f)) / ((float) this.f150339b.element))) - textTitleBar.getHeight();
                View a2 = this.f150338a.mo60929a(R.id.dq6);
                C89219l.m154716b(a2, "");
                View a3 = this.f150338a.mo60929a(R.id.dq6);
                C89219l.m154716b(a3, "");
                a2.setLayoutParams(a3.getLayoutParams());
                View a4 = this.f150338a.mo60929a(R.id.dq6);
                C89219l.m154716b(a4, "");
                a4.setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$h */
    public static final class C67006h extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public int f150329a;

        /* renamed from: b */
        final /* synthetic */ C66995n f150330b;

        static {
            Covode.recordClassIndex(78583);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67006h(C66995n nVar) {
            this.f150330b = nVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f150329a += i2;
            if (this.f150330b.af_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f150330b.mo60929a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f150330b.mo60929a(R.id.eiz);
                    C89219l.m154716b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f150330b.mo60929a(R.id.eiz);
                    C89219l.m154716b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f150329a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C66994m m118698a(C66995n nVar) {
        C66994m mVar = nVar.f150313b;
        if (mVar == null) {
            C89219l.m154710a("config");
        }
        return mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$k */
    static final class View$OnClickListenerC67009k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66995n f150336a;

        /* renamed from: b */
        final /* synthetic */ long f150337b;

        static {
            Covode.recordClassIndex(78586);
        }

        View$OnClickListenerC67009k(C66995n nVar, long j) {
            this.f150336a = nVar;
            this.f150337b = j;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                long currentTimeMillis = System.currentTimeMillis() - this.f150337b;
                int socialRecType = C66995n.m118698a(this.f150336a).getSocialRecType();
                C89219l.m154721d("next", "");
                C33744d dVar = new C33744d();
                if (socialRecType == 2) {
                    str = "facebook";
                } else {
                    str = "contact";
                }
                C39162r.m79460a("confirm_rec_page", dVar.mo59983a("platform", str).mo59983a("result", "next").mo59981a("duration", currentTimeMillis).f79943a);
                C66870b.m118588b(C66995n.m118698a(this.f150336a).getSocialRecType(), EnumC66892b.RECOMMEND.getValue());
                this.f150336a.mo105879b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$g */
    static final class C67005g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, FriendList<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66995n f150328a;

        static {
            Covode.recordClassIndex(78582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67005g(C66995n nVar) {
            super(2);
            this.f150328a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, FriendList<? extends User> friendList) {
            FriendList<? extends User> friendList2 = friendList;
            C89219l.m154721d(iVar, "");
            if (friendList2 != null) {
                ((TuxDualBallView) this.f150328a.mo60929a(R.id.cff)).mo37885c();
                C66991l lVar = this.f150328a.f150314c;
                if (lVar != null) {
                    List<? extends User> friends = friendList2.getFriends();
                    C89219l.m154716b(friends, "");
                    C89219l.m154721d(friends, "");
                    lVar.f150300a.clear();
                    lVar.f150300a.add(new C66931b(lVar.f150303d.getFirst(), lVar.f150303d.getSecond()));
                    List<C66990k> list = lVar.f150300a;
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) friends, 10));
                    Iterator<T> it = friends.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C66930a(it.next()));
                    }
                    list.addAll(arrayList);
                    lVar.notifyDataSetChanged();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C67103e eVar;
        List<? extends User> list;
        String str;
        List<? extends User> friends;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        String e = m118700e();
        if (e == null || e.length() == 0) {
            mo105879b();
            return;
        }
        Bundle arguments = getArguments();
        FriendList<? extends User> friendList = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("recommendFriendsConfig");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C66994m)) {
            serializable = null;
        }
        C66994m mVar = (C66994m) serializable;
        if (mVar == null) {
            mo105879b();
            return;
        }
        this.f150313b = mVar;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            eVar = ((SocialRecFlowModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150411a.getValue();
        } else {
            eVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.doh);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.doh);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        C17235c.m31810a(mo60929a(R.id.u3), 0.75f);
        ((RecyclerView) mo60929a(R.id.doh)).mo4405a(new C67006h(this));
        if (eVar != null) {
            friendList = eVar.f150487b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = -1;
        C89233z.C89236c cVar2 = new C89233z.C89236c();
        cVar2.element = 0;
        ((RecyclerView) mo60929a(R.id.doh)).mo4405a(new C67007i(this, cVar2, cVar));
        ((RecyclerView) mo60929a(R.id.doh)).post(new RunnableC67008j(this, new C67010l(this, cVar)));
        RecyclerView recyclerView3 = (RecyclerView) mo60929a(R.id.doh);
        C89219l.m154716b(recyclerView3, "");
        getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        C66994m mVar2 = this.f150313b;
        if (mVar2 == null) {
            C89219l.m154710a("config");
        }
        String title = mVar2.getTitle();
        C66994m mVar3 = this.f150313b;
        if (mVar3 == null) {
            C89219l.m154710a("config");
        }
        String subTitle = mVar3.getSubTitle();
        C66994m mVar4 = this.f150313b;
        if (mVar4 == null) {
            C89219l.m154710a("config");
        }
        int socialRecType = mVar4.getSocialRecType();
        C89378p pVar = new C89378p(title, subTitle);
        if (friendList == null || (list = friendList.getFriends()) == null) {
            list = C89086z.INSTANCE;
        }
        this.f150314c = new C66991l(socialRecType, pVar, list);
        RecyclerView recyclerView4 = (RecyclerView) mo60929a(R.id.doh);
        C89219l.m154716b(recyclerView4, "");
        recyclerView4.setAdapter(this.f150314c);
        ((AbstractC17250a) mo60929a(R.id.eiz)).setTitle(title);
        TuxButton tuxButton = (TuxButton) mo60929a(R.id.u3);
        C89219l.m154716b(tuxButton, "");
        C66994m mVar5 = this.f150313b;
        if (mVar5 == null) {
            C89219l.m154710a("config");
        }
        tuxButton.setText(mVar5.getButtonText());
        ((TuxButton) mo60929a(R.id.u3)).setOnClickListener(new View$OnClickListenerC67009k(this, currentTimeMillis));
        if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
            AbstractC88412b unused = selectSubscribe(m118699c(), C67012o.f150341a, C67013p.f150342a, new C20370ah(), new C67001e(this));
            AbstractC88412b unused2 = selectSubscribe(m118699c(), C67014q.f150343a, C67015r.f150344a, new C20370ah(), new C67003f(this));
            AbstractC88412b unused3 = selectSubscribe(m118699c(), C67016s.f150345a, new C20370ah(), new C67005g(this));
            TuxDualBallView tuxDualBallView = (TuxDualBallView) mo60929a(R.id.cff);
            tuxDualBallView.setVisibility(0);
            tuxDualBallView.mo37884b();
            SocialRecRequestViewModel c = m118699c();
            String e2 = m118700e();
            C89219l.m154716b(e2, "");
            C66994m mVar6 = this.f150313b;
            if (mVar6 == null) {
                C89219l.m154710a("config");
            }
            c.mo105921a(e2, mVar6.getSocialRecType(), EnumC66892b.CONSENT.getValue(), "auto");
        }
        C66994m mVar7 = this.f150313b;
        if (mVar7 == null) {
            C89219l.m154710a("config");
        }
        int socialRecType2 = mVar7.getSocialRecType();
        C33744d dVar = new C33744d();
        if (socialRecType2 == 2) {
            str = "facebook";
        } else {
            str = "contact";
        }
        C39162r.m79460a("show_rec_page", dVar.mo59983a("platform", str).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$i */
    public static final class C67007i extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C66995n f150331a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f150332b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f150333c;

        static {
            Covode.recordClassIndex(78584);
        }

        C67007i(C66995n nVar, C89233z.C89236c cVar, C89233z.C89236c cVar2) {
            this.f150331a = nVar;
            this.f150332b = cVar;
            this.f150333c = cVar2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f150332b.element += i2;
            if (i2 != 0 && this.f150331a.af_() && this.f150333c.element != -1) {
                int i3 = this.f150333c.element;
                RecyclerView recyclerView2 = (RecyclerView) this.f150331a.mo60929a(R.id.doh);
                C89219l.m154716b(recyclerView2, "");
                int height = i3 - recyclerView2.getHeight();
                RecyclerView recyclerView3 = (RecyclerView) this.f150331a.mo60929a(R.id.doh);
                C89219l.m154716b(recyclerView3, "");
                int height2 = recyclerView3.getHeight();
                View a = this.f150331a.mo60929a(R.id.dq6);
                C89219l.m154716b(a, "");
                int height3 = height2 - a.getHeight();
                View a2 = this.f150331a.mo60929a(R.id.dq6);
                C89219l.m154716b(a2, "");
                float f = ((((float) this.f150332b.element) * 1.0f) / ((float) height)) * ((float) height3);
                TextTitleBar textTitleBar = (TextTitleBar) this.f150331a.mo60929a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                a2.setY(f + ((float) textTitleBar.getHeight()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a27, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$e */
    static final class C67001e extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Boolean, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66995n f150324a;

        static {
            Covode.recordClassIndex(78578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67001e(C66995n nVar) {
            super(3);
            this.f150324a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue && booleanValue2) {
                new C23144b(this.f150324a).mo37640e(R.string.bfr).mo37637b();
                C34727m.m70945a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66995n.C67001e.RunnableC670021 */

                    /* renamed from: a */
                    final /* synthetic */ C67001e f150325a;

                    static {
                        Covode.recordClassIndex(78579);
                    }

                    {
                        this.f150325a = r1;
                    }

                    public final void run() {
                        this.f150325a.f150324a.mo105879b();
                    }
                }, 1000);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.n$f */
    static final class C67003f extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Boolean, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66995n f150326a;

        static {
            Covode.recordClassIndex(78580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67003f(C66995n nVar) {
            super(3);
            this.f150326a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue && booleanValue2) {
                new C23144b(this.f150326a).mo37635a(C66995n.m118698a(this.f150326a).getToast()).mo37637b();
                C34727m.m70945a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66995n.C67003f.RunnableC670041 */

                    /* renamed from: a */
                    final /* synthetic */ C67003f f150327a;

                    static {
                        Covode.recordClassIndex(78581);
                    }

                    {
                        this.f150327a = r1;
                    }

                    public final void run() {
                        this.f150327a.f150326a.mo105879b();
                    }
                }, 1000);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static int m118697a(RecyclerView recyclerView, RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder> aVar, LinearLayoutManager linearLayoutManager) {
        int n = linearLayoutManager.mo4374n();
        View g = linearLayoutManager.mo4717g(n);
        View g2 = linearLayoutManager.mo4717g(0);
        if (g == null || g2 == null || n <= 0 || !(recyclerView.mo4393a(g2) instanceof C66932c)) {
            return -1;
        }
        return (int) ((((((float) (aVar.getItemCount() - 1)) * 1.0f) / ((float) n)) * ((float) (g.getBottom() - g2.getBottom()))) + ((float) g2.getHeight()));
    }
}
