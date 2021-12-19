package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51749t;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66625h;
import com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUserListState;
import com.p2082ss.android.ugc.aweme.utils.C80494gh;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.following.ui.z */
public final class C51398z extends AbstractC51143a {

    /* renamed from: l */
    public FollowListAdapter f118459l;

    /* renamed from: m */
    private final lifecycleAwareLazy f118460m;

    /* renamed from: n */
    private SparseArray f118461n;

    static {
        Covode.recordClassIndex(60614);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f118461n == null) {
            this.f118461n = new SparseArray();
        }
        View view = (View) this.f118461n.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118461n.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f118461n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final RecommendListViewModel mo86791b() {
        return (RecommendListViewModel) this.f118460m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: g */
    public final int mo86590g() {
        return R.layout.a1o;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: j */
    public final String mo86593j() {
        return "suggested_list";
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: q */
    public final int mo86599q() {
        return R.string.evt;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: r */
    public final int mo86600r() {
        return R.string.g8f;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean z = this.f117990d;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$a */
    public static final class C51399a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f118462a;

        static {
            Covode.recordClassIndex(60615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51399a(AbstractC89277c cVar) {
            super(0);
            this.f118462a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f118462a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$c */
    static final class C51402c implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C51398z f118468a;

        static {
            Covode.recordClassIndex(60618);
        }

        C51402c(C51398z zVar) {
            this.f118468a = zVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C51398z zVar = this.f118468a;
            zVar.withState(zVar.mo86791b(), new AbstractC89172b<RecommendUserListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51398z.C51402c.C514031 */

                /* renamed from: a */
                final /* synthetic */ C51402c f118469a;

                static {
                    Covode.recordClassIndex(60619);
                }

                {
                    this.f118469a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(RecommendUserListState recommendUserListState) {
                    C89219l.m154721d(recommendUserListState, "");
                    C51398z zVar = this.f118469a.f118468a;
                    if (!zVar.f117990d) {
                        FollowListAdapter followListAdapter = zVar.f118459l;
                        if (followListAdapter == null) {
                            C89219l.m154710a("mSuggestListAdapter");
                        }
                        followListAdapter.ao_();
                        zVar.mo86791b().mo33758l();
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C61504e.C61505a.f139616a.mo99162c();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: p */
    public final void mo86598p() {
        ((DmtStatusView) mo60929a(R.id.e7i)).mo27384f();
        mo86791b().mo33757k();
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$b */
    public static final class C51400b extends AbstractC89220m implements AbstractC89171a<RecommendListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118463a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f118464b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118465c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f118466d;

        static {
            Covode.recordClassIndex(60616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51400b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f118463a = fragment;
            this.f118464b = aVar;
            this.f118465c = cVar;
            this.f118466d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.recommend.RecommendListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f118463a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f118464b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f118465c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m95757xfec09fa4(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.recommend.RecommendListViewModel> r0 = com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.z$b$1 r0 = new com.ss.android.ugc.aweme.following.ui.z$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.C51398z.C51400b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_SuggestRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95757xfec09fa4(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C51398z() {
        C51413l lVar = new C51413l(this);
        AbstractC89277c a = C89204ab.m154669a(RecommendListViewModel.class);
        C51399a aVar = new C51399a(a);
        this.f118460m = new lifecycleAwareLazy(this, aVar, new C51400b(this, aVar, a, lVar));
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m95748a(C51398z zVar) {
        FollowListAdapter followListAdapter = zVar.f118459l;
        if (followListAdapter == null) {
            C89219l.m154710a("mSuggestListAdapter");
        }
        return followListAdapter;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$f */
    static final class C51406f extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118472a;

        static {
            Covode.recordClassIndex(60622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51406f(C51398z zVar) {
            super(1);
            this.f118472a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f118472a.mo60929a(R.id.e7i)).mo27384f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$j */
    static final class C51411j extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118478a;

        static {
            Covode.recordClassIndex(60627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51411j(C51398z zVar) {
            super(1);
            this.f118478a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            C51398z.m95748a(this.f118478a).ao_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$d */
    static final class C51404d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        public static final C51404d f118470a = new C51404d();

        static {
            Covode.recordClassIndex(60620);
        }

        C51404d() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list, "");
            C61504e.C61505a.f139616a.mo99161b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$g */
    static final class C51407g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118473a;

        static {
            Covode.recordClassIndex(60623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51407g(C51398z zVar) {
            super(2);
            this.f118473a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            ((DmtStatusView) this.f118473a.mo60929a(R.id.e7i)).mo27387h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$k */
    static final class C51412k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118479a;

        static {
            Covode.recordClassIndex(60628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51412k(C51398z zVar) {
            super(2);
            this.f118479a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C51398z.m95748a(this.f118479a).mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$h */
    static final class C51408h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118474a;

        static {
            Covode.recordClassIndex(60624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51408h(C51398z zVar) {
            super(2);
            this.f118474a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            ((DmtStatusView) this.f118474a.mo60929a(R.id.e7i)).mo27382d();
            if (list2.isEmpty()) {
                ((DmtStatusView) this.f118474a.mo60929a(R.id.e7i)).mo27385g();
            }
            C61504e eVar = C61504e.C61505a.f139616a;
            C89219l.m154716b(eVar, "");
            if (!TextUtils.isEmpty(eVar.mo99159a())) {
                C61504e.C61505a.f139616a.mo99161b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$l */
    static final class C51413l extends AbstractC89220m implements AbstractC89183m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118480a;

        static {
            Covode.recordClassIndex(60629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51413l(C51398z zVar) {
            super(2);
            this.f118480a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState, Bundle bundle) {
            String secUid;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            String str = "";
            C89219l.m154721d(recommendUserListState2, str);
            String str2 = ((AbstractC51143a) this.f118480a).f117988b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.f118480a.f117989c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return RecommendUserListState.copy$default(recommendUserListState2, str2, str, this.f118480a.mo86591h(), 21, null, new C66625h("suggested_list", this.f118480a.mo86594k(), "empty"), null, 80, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$i */
    static final class C51409i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118475a;

        static {
            Covode.recordClassIndex(60625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51409i(C51398z zVar) {
            super(2);
            this.f118475a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            final ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (T t : list2) {
                int i3 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (t2 instanceof RecommendContact) {
                    arrayList.add(t2);
                } else {
                    String requestId = t2.getRequestId();
                    C89219l.m154716b(requestId, "");
                    arrayList.add(new C51108g(13, t2, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            RecyclerView recyclerView = (RecyclerView) this.f118475a.mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView, "");
            if (!recyclerView.mo4484l()) {
                ((RecyclerView) this.f118475a.mo60929a(R.id.dof)).post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51398z.C51409i.RunnableC514101 */

                    /* renamed from: a */
                    final /* synthetic */ C51409i f118476a;

                    static {
                        Covode.recordClassIndex(60626);
                    }

                    {
                        this.f118476a = r1;
                    }

                    public final void run() {
                        C51398z.m95748a(this.f118476a.f118475a).mo60931a(arrayList);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60929a(R.id.e5w);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo60929a(R.id.e7i);
        C89219l.m154716b(dmtStatusView, "");
        mo86585a(dmtStatusView);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setItemAnimator(new C51749t());
        C80494gh.m139518a((RecyclerView) mo60929a(R.id.dof), 8);
        FollowListAdapter followListAdapter = new FollowListAdapter(this, "suggest_user", mo86591h());
        this.f118459l = followListAdapter;
        RecyclerView recyclerView3 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView3, "");
        followListAdapter.mo67820g(C0643b.m2378c(recyclerView3.getContext(), R.color.nc));
        RecyclerView recyclerView4 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView4, "");
        FollowListAdapter followListAdapter2 = this.f118459l;
        if (followListAdapter2 == null) {
            C89219l.m154710a("mSuggestListAdapter");
        }
        recyclerView4.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f118459l;
        if (followListAdapter3 == null) {
            C89219l.m154710a("mSuggestListAdapter");
        }
        followListAdapter3.mo67813a(new C51402c(this));
        AbstractC20468h.C20469a.m38667a(this, mo86791b(), C51146aa.f117995a, (C20370ah) null, new C51407g(this), new C51406f(this), new C51408h(this), 2);
        AbstractC88412b unused = selectSubscribe(mo86791b(), C51149ad.f117998a, new C20370ah(), new C51409i(this));
        AbstractC20468h.C20469a.m38667a(this, mo86791b(), C51193ae.f118086a, (C20370ah) null, new C51412k(this), new C51411j(this), C51404d.f118470a, 2);
        AbstractC88412b unused2 = selectSubscribe(mo86791b(), C51147ab.f117996a, C51148ac.f117997a, new C20370ah(), new C51405e(this));
        if (!this.f117990d) {
            mo86791b().mo33757k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.z$e */
    static final class C51405e extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, List<? extends User>, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51398z f118471a;

        static {
            Covode.recordClassIndex(60621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51405e(C51398z zVar) {
            super(3);
            this.f118471a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list, C20442b bVar) {
            List<? extends User> list2 = list;
            C20442b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(bVar2, "");
            if (bVar2.f48382a) {
                C51398z.m95748a(this.f118471a).aq_();
            } else if (!list2.isEmpty()) {
                C51398z.m95748a(this.f118471a).ap_();
            }
            return C89391z.f203057a;
        }
    }
}
