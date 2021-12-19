package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41605ae;
import com.p2082ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42172d;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ai */
public final class C42643ai extends AbstractC34586a implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: d */
    public static final C42644a f99454d = new C42644a((byte) 0);

    /* renamed from: a */
    C41605ae f99455a;

    /* renamed from: b */
    public final C34499i f99456b = new C34499i();

    /* renamed from: c */
    public SearchMusicViewModel f99457c;

    /* renamed from: e */
    private String f99458e;

    /* renamed from: j */
    private int f99459j;

    /* renamed from: k */
    private MusicPlayHelper f99460k;

    /* renamed from: l */
    private final AbstractC89244h f99461l = C89250i.m154773a((AbstractC89171a) new C42649f(this));

    /* renamed from: m */
    private SparseArray f99462m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$p */
    public final /* synthetic */ class RunnableC42661p implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f99488a;

        static {
            Covode.recordClassIndex(50765);
        }

        RunnableC42661p(AbstractC89171a aVar) {
            this.f99488a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f99488a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(50747);
    }

    /* renamed from: e */
    private final AbstractC57066a.AbstractC57067a m85170e() {
        return (AbstractC57066a.AbstractC57067a) this.f99461l.getValue();
    }

    /* renamed from: a */
    public final View mo72850a(int i) {
        if (this.f99462m == null) {
            this.f99462m = new SparseArray();
        }
        View view = (View) this.f99462m.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f99462m.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$a */
    public static final class C42644a {
        static {
            Covode.recordClassIndex(50748);
        }

        private C42644a() {
        }

        public /* synthetic */ C42644a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$g */
    public static final class C42650g implements AbstractC20443c<SearchMusic, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f99468a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f99469b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f99470c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f99471d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f99472e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends SearchMusic>, C89391z> f99473f;

        static {
            Covode.recordClassIndex(50754);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f99471d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f99472e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends SearchMusic>, C89391z> mo33775c() {
            return this.f99473f;
        }

        public C42650g(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f99468a = bVar;
            this.f99469b = mVar;
            this.f99470c = mVar2;
            this.f99471d = bVar;
            this.f99472e = mVar;
            this.f99473f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$h */
    public static final class C42651h implements AbstractC20443c<SearchMusic, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f99474a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f99475b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f99476c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f99477d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f99478e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends SearchMusic>, C89391z> f99479f;

        static {
            Covode.recordClassIndex(50755);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f99477d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f99478e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends SearchMusic>, C89391z> mo33775c() {
            return this.f99479f;
        }

        public C42651h(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f99474a = bVar;
            this.f99475b = mVar;
            this.f99476c = mVar2;
            this.f99477d = bVar;
            this.f99478e = mVar;
            this.f99479f = mVar2;
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f99456b;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$e */
    static final class C42648e implements SwipeRefreshLayout.AbstractC34634b {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99466a;

        static {
            Covode.recordClassIndex(50752);
        }

        C42648e(C42643ai aiVar) {
            this.f99466a = aiVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
        /* renamed from: a */
        public final void mo59551a() {
            this.f99466a.mo72851a();
        }
    }

    /* renamed from: g */
    private static boolean m85171g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f99462m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$d */
    static final class C42647d implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99465a;

        static {
            Covode.recordClassIndex(50751);
        }

        C42647d(C42643ai aiVar) {
            this.f99465a = aiVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            SearchMusicViewModel searchMusicViewModel = this.f99465a.f99457c;
            if (searchMusicViewModel == null) {
                C89219l.m154710a("viewModel");
            }
            C89219l.m154721d(searchMusicViewModel, "");
            searchMusicViewModel.f100257a.loadMore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$f */
    static final class C42649f extends AbstractC89220m implements AbstractC89171a<SearchKeywordPresenter> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99467a;

        static {
            Covode.recordClassIndex(50753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42649f(C42643ai aiVar) {
            super(0);
            this.f99467a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchKeywordPresenter invoke() {
            ActivityC0945e activity = this.f99467a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return new SearchKeywordPresenter(activity);
        }
    }

    /* renamed from: h */
    private static boolean m85172h() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean g = m85171g();
        C58029j.f132256h = g;
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72852b() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo72850a(R.id.dh_);
        if (af_() && swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* renamed from: c */
    public final void mo72853c() {
        if (af_()) {
            mo72852b();
            C41605ae aeVar = this.f99455a;
            if (aeVar == null) {
                C89219l.m154710a("adapter");
            }
            aeVar.mo67829d(false);
            C41605ae aeVar2 = this.f99455a;
            if (aeVar2 == null) {
                C89219l.m154710a("adapter");
            }
            aeVar2.mo62377b_(null);
            ((DmtStatusView) mo72850a(R.id.e77)).mo27385g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$o */
    public static final /* synthetic */ class C42660o extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(50764);
        }

        C42660o(C42643ai aiVar) {
            super(0, aiVar, C42643ai.class, "showNetworkError", "showNetworkError()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C42643ai aiVar = (C42643ai) this.receiver;
            if (aiVar.af_()) {
                aiVar.mo72852b();
                C41605ae aeVar = aiVar.f99455a;
                if (aeVar == null) {
                    C89219l.m154710a("adapter");
                }
                aeVar.mo67829d(false);
                C41605ae aeVar2 = aiVar.f99455a;
                if (aeVar2 == null) {
                    C89219l.m154710a("adapter");
                }
                aeVar2.mo62377b_(null);
                ((DmtStatusView) aiVar.mo72850a(R.id.e77)).mo27387h();
                new C79459a(aiVar.getContext()).mo123050a(R.string.dcq).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo72851a() {
        getContext();
        if (!m85172h()) {
            C29339a.m58753a(new RunnableC42661p(new C42660o(this)), 100);
            return;
        }
        SearchMusicViewModel searchMusicViewModel = this.f99457c;
        if (searchMusicViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        String str = this.f99458e;
        if (str == null) {
            C89219l.m154710a("musicAuthor");
        }
        searchMusicViewModel.mo73194a(new C42174f(str, 1, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, null, null, 1048540));
        SearchMusicViewModel searchMusicViewModel2 = this.f99457c;
        if (searchMusicViewModel2 == null) {
            C89219l.m154710a("viewModel");
        }
        C42172d.m84429a(searchMusicViewModel2);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$b */
    static final class View$OnClickListenerC42645b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99463a;

        static {
            Covode.recordClassIndex(50749);
        }

        View$OnClickListenerC42645b(C42643ai aiVar) {
            this.f99463a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f99463a.mo72851a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$c */
    static final class View$OnClickListenerC42646c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99464a;

        static {
            Covode.recordClassIndex(50750);
        }

        View$OnClickListenerC42646c(C42643ai aiVar) {
            this.f99464a = aiVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f99464a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchMusicViewModel m85169a(C42643ai aiVar) {
        SearchMusicViewModel searchMusicViewModel = aiVar.f99457c;
        if (searchMusicViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return searchMusicViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$m */
    static final class C42658m extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99486a;

        static {
            Covode.recordClassIndex(50762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42658m(C42643ai aiVar) {
            super(1);
            this.f99486a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            C41605ae aeVar = this.f99486a.f99455a;
            if (aeVar == null) {
                C89219l.m154710a("adapter");
            }
            aeVar.ao_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$j */
    static final class C42654j extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99482a;

        static {
            Covode.recordClassIndex(50758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42654j(C42643ai aiVar) {
            super(1);
            this.f99482a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            C42643ai aiVar = this.f99482a;
            NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) aiVar.mo72850a(R.id.dgn);
            C89219l.m154716b(nestedScrollingRecyclerView, "");
            if (nestedScrollingRecyclerView.getChildCount() > 0) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) aiVar.mo72850a(R.id.dh_);
                C89219l.m154716b(swipeRefreshLayout, "");
                swipeRefreshLayout.setRefreshing(true);
            } else {
                ((DmtStatusView) aiVar.mo72850a(R.id.e77)).mo27384f();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("param_music_author")) == null) {
            str = "";
        }
        this.f99458e = str;
        AbstractC57066a.AbstractC57067a e = m85170e();
        String str2 = this.f99458e;
        if (str2 == null) {
            C89219l.m154710a("musicAuthor");
        }
        e.mo94219a(new C57071b(str2, null, 2));
        Bundle arguments2 = getArguments();
        int i = 0;
        if (arguments2 != null) {
            i = arguments2.getInt("param_holder_postion", 0);
        }
        this.f99459j = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$k */
    static final class C42655k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99483a;

        static {
            Covode.recordClassIndex(50759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42655k(C42643ai aiVar) {
            super(2);
            this.f99483a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f99483a.mo72853c();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$i */
    static final class C42652i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends SearchMusic>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99480a;

        static {
            Covode.recordClassIndex(50756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42652i(C42643ai aiVar) {
            super(2);
            this.f99480a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends SearchMusic> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(C42643ai.m85169a(this.f99480a), new AbstractC89172b<SearchMusicListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42643ai.C42652i.C426531 */

                /* renamed from: a */
                final /* synthetic */ C42652i f99481a;

                static {
                    Covode.recordClassIndex(50757);
                }

                {
                    this.f99481a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SearchMusicListState searchMusicListState) {
                    SearchMusicListState searchMusicListState2 = searchMusicListState;
                    C89219l.m154721d(searchMusicListState2, "");
                    C42643ai aiVar = this.f99481a.f99480a;
                    List<SearchMusic> list = searchMusicListState2.getListState().getList();
                    boolean z = searchMusicListState2.getListState().getPayload().f48406a.f48382a;
                    if (aiVar.af_()) {
                        if (list == null || list.isEmpty()) {
                            aiVar.mo72853c();
                        } else {
                            aiVar.mo72852b();
                            C41605ae aeVar = aiVar.f99455a;
                            if (aeVar == null) {
                                C89219l.m154710a("adapter");
                            }
                            aeVar.mo67829d(true);
                            if (z) {
                                aeVar.aq_();
                            } else {
                                aeVar.ap_();
                            }
                            ((DmtStatusView) aiVar.mo72850a(R.id.e77)).mo27382d();
                            C41605ae aeVar2 = aiVar.f99455a;
                            if (aeVar2 == null) {
                                C89219l.m154710a("adapter");
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(list);
                            aeVar2.mo62377b_(arrayList);
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$l */
    static final class C42656l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends SearchMusic>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99484a;

        static {
            Covode.recordClassIndex(50760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42656l(C42643ai aiVar) {
            super(2);
            this.f99484a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends SearchMusic> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(C42643ai.m85169a(this.f99484a), new AbstractC89172b<SearchMusicListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42643ai.C42656l.C426571 */

                /* renamed from: a */
                final /* synthetic */ C42656l f99485a;

                static {
                    Covode.recordClassIndex(50761);
                }

                {
                    this.f99485a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SearchMusicListState searchMusicListState) {
                    SearchMusicListState searchMusicListState2 = searchMusicListState;
                    C89219l.m154721d(searchMusicListState2, "");
                    C42643ai aiVar = this.f99485a.f99484a;
                    List<SearchMusic> list = searchMusicListState2.getListState().getList();
                    boolean z = searchMusicListState2.getListState().getPayload().f48406a.f48382a;
                    if (aiVar.af_()) {
                        aiVar.mo72852b();
                        C41605ae aeVar = aiVar.f99455a;
                        if (aeVar == null) {
                            C89219l.m154710a("adapter");
                        }
                        if (z) {
                            aeVar.aq_();
                        } else {
                            aeVar.ap_();
                        }
                        aeVar.mo62376b(list);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ai$n */
    static final class C42659n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42643ai f99487a;

        static {
            Covode.recordClassIndex(50763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42659n(C42643ai aiVar) {
            super(2);
            this.f99487a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C42643ai aiVar = this.f99487a;
            if (aiVar.af_()) {
                aiVar.mo72852b();
                C41605ae aeVar = aiVar.f99455a;
                if (aeVar == null) {
                    C89219l.m154710a("adapter");
                }
                aeVar.mo67823i();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC1174ac a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C89219l.m154721d(this, "");
        C1175ad a2 = C1181ae.m3879a(this, new SearchMusicViewModel.C43002a.C43003a());
        String name = SearchMusicViewModel.class.getName();
        if (SearchMusicViewModel.class.equals(ScopeViewModel.class)) {
            a = a2.mo3984a(name, SearchMusicViewModel.class);
        } else {
            a = a2.mo3984a(name, SearchMusicViewModel.class);
            C1171ab.m3870a(a, a2);
        }
        C89219l.m154716b(a, "");
        SearchMusicViewModel searchMusicViewModel = (SearchMusicViewModel) a;
        searchMusicViewModel.mo33686a_(SearchMusicViewModel.C43002a.C43004b.f100258a);
        this.f99457c = searchMusicViewModel;
        AbstractC17250a aVar = (AbstractC17250a) mo72850a(R.id.eim);
        C89219l.m154716b(aVar, "");
        DmtTextView titleView = aVar.getTitleView();
        C89219l.m154716b(titleView, "");
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        Object[] objArr = new Object[1];
        String str = this.f99458e;
        if (str == null) {
            C89219l.m154710a("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(R.string.dar, objArr);
        C89219l.m154716b(string, "");
        String a3 = C1764a.m5928a(string, Arrays.copyOf(new Object[0], 0));
        C89219l.m154716b(a3, "");
        titleView.setText(a3);
        NormalTitleBar normalTitleBar = (NormalTitleBar) mo72850a(R.id.eim);
        C89219l.m154716b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setOnClickListener(new View$OnClickListenerC42646c(this));
        ((AbstractC17250a) mo72850a(R.id.eim)).mo27298a(true);
        C41605ae aeVar = new C41605ae(new C67678d(), m85170e());
        this.f99455a = aeVar;
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) mo72850a(R.id.dgn);
        C89219l.m154716b(nestedScrollingRecyclerView, "");
        aeVar.mo67820g(C0643b.m2378c(nestedScrollingRecyclerView.getContext(), R.color.l));
        C41605ae aeVar2 = this.f99455a;
        if (aeVar2 == null) {
            C89219l.m154710a("adapter");
        }
        aeVar2.mo67813a((AbstractC39063h.AbstractC39067a) new C42647d(this));
        ((SwipeRefreshLayout) mo72850a(R.id.dh_)).setOnRefreshListener(new C42648e(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo72850a(R.id.dh_);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) mo72850a(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(1));
        RecyclerView recyclerView2 = (RecyclerView) mo72850a(R.id.dgn);
        C89219l.m154716b(recyclerView2, "");
        C41605ae aeVar3 = this.f99455a;
        if (aeVar3 == null) {
            C89219l.m154710a("adapter");
        }
        recyclerView2.setAdapter(aeVar3);
        MtEmptyView a4 = MtEmptyView.m31926a(getContext());
        a4.setStatus(new C17273d.C17274a(a4.getContext()).mo27457a(2131232652).mo27462b(R.string.gzz).mo27464c(R.string.h00).f41365a);
        ((DmtStatusView) mo72850a(R.id.e77)).setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27401a(R.string.gzs, new View$OnClickListenerC42645b(this)).mo27406b(a4));
        SearchMusicViewModel searchMusicViewModel2 = this.f99457c;
        if (searchMusicViewModel2 == null) {
            C89219l.m154710a("viewModel");
        }
        C41605ae aeVar4 = this.f99455a;
        if (aeVar4 == null) {
            C89219l.m154710a("adapter");
        }
        C42650g gVar = new C42650g(new C42654j(this), new C42655k(this), new C42652i(this));
        C42651h hVar = new C42651h(new C42658m(this), new C42659n(this), new C42656l(this));
        C89219l.m154721d(searchMusicViewModel2, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d(aeVar4, "");
        ListMiddleware.m38615a(searchMusicViewModel2.f100257a, this, aeVar4, getUniqueOnlyGlobal(), gVar, hVar, null, null, 896);
        mo72851a();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f99460k = (MusicPlayHelper) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(MusicPlayHelper.class);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.au2, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
