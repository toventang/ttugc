package com.p2082ss.android.ugc.aweme.detail.operators;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42122a;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.p */
public final class C41298p implements AbstractC41262aa {

    /* renamed from: a */
    public boolean f96400a;

    /* renamed from: b */
    public final SearchJediViewModel f96401b;

    /* renamed from: c */
    private AbstractC20527q f96402c;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$a */
    public static final class C41299a extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {
        public static final C41299a INSTANCE = new C41299a();

        static {
            Covode.recordClassIndex(49187);
        }

        public C41299a() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(AbstractC20477i iVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$b */
    public static final class C41300b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {
        public static final C41300b INSTANCE = new C41300b();

        static {
            Covode.recordClassIndex(49188);
        }

        public C41300b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            invoke(iVar, th);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154719c(th, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e */
    public static final class C41303e implements AbstractC20427a<C42411h> {
        static {
            Covode.recordClassIndex(49191);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
        /* renamed from: a */
        public final void mo33763a(List<? extends C42411h> list, AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(list, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e$a */
        public static final class C41304a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {
            static {
                Covode.recordClassIndex(49192);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final int getItemCount() {
                return 0;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C89219l.m154721d(viewHolder, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return m83171a(viewGroup, i);
            }

            C41304a() {
            }

            /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e$a$a */
            public static final class C41305a extends RecyclerView.ViewHolder {

                /* renamed from: a */
                final /* synthetic */ ViewGroup f96415a;

                static {
                    Covode.recordClassIndex(49193);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C41305a(ViewGroup viewGroup, View view) {
                    super(view);
                    this.f96415a = viewGroup;
                }
            }

            /* renamed from: a */
            private static RecyclerView.ViewHolder m83171a(ViewGroup viewGroup, int i) {
                boolean a;
                MethodCollector.m26663i(7993);
                C89219l.m154721d(viewGroup, "");
                C41305a aVar = new C41305a(viewGroup, new View(viewGroup.getContext()));
                try {
                    if (aVar.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(aVar.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = aVar.getClass().getName();
                MethodCollector.m26664o(7993);
                return aVar;
            }
        }

        C41303e() {
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
        /* renamed from: a */
        public final C20431b<C42411h> mo33761a() {
            return new C20431b<>(new C41304a(), new C42122a(), (byte) 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C42411h mo33762a(int i) {
            return AbstractC20427a.C20428a.m38638a((AbstractC20427a) this, i, false);
        }
    }

    static {
        Covode.recordClassIndex(49186);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$c */
    public static final class C41301c implements AbstractC20443c<C42411h, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f96403a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f96404b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f96405c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f96406d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f96407e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C42411h>, C89391z> f96408f;

        static {
            Covode.recordClassIndex(49189);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f96406d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f96407e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C42411h>, C89391z> mo33775c() {
            return this.f96408f;
        }

        public C41301c(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f96403a = bVar;
            this.f96404b = mVar;
            this.f96405c = mVar2;
            this.f96406d = bVar;
            this.f96407e = mVar;
            this.f96408f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$d */
    public static final class C41302d implements AbstractC20443c<C42411h, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f96409a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f96410b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f96411c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f96412d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f96413e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C42411h>, C89391z> f96414f;

        static {
            Covode.recordClassIndex(49190);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f96412d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f96413e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C42411h>, C89391z> mo33775c() {
            return this.f96414f;
        }

        public C41302d(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f96409a = bVar;
            this.f96410b = mVar;
            this.f96411c = mVar2;
            this.f96412d = bVar;
            this.f96413e = mVar;
            this.f96414f = mVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return this.f96401b;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f96400a;
    }

    public C41298p(SearchJediViewModel searchJediViewModel) {
        this.f96401b = searchJediViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$g */
    static final class C41308g extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41298p f96419a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96420b;

        static {
            Covode.recordClassIndex(49196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41308g(C41298p pVar, AbstractC39102c cVar) {
            super(1);
            this.f96419a = pVar;
            this.f96420b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f96420b.aW_();
            this.f96419a.f96400a = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f96401b == null) {
            return false;
        }
        this.f96402c = new DetailJediWidget();
        View view = fragment.getView();
        if (view == null) {
            C89219l.m154715b();
        }
        C23669c a = C23669c.C23671a.m44763a(fragment, view);
        AbstractC20527q qVar = this.f96402c;
        if (qVar == null) {
            C89219l.m154710a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a.mo39102a((Widget) qVar);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        SearchJediViewModel searchJediViewModel = this.f96401b;
        if (searchJediViewModel == null) {
            C89219l.m154715b();
        }
        AbstractC20527q qVar = this.f96402c;
        if (qVar == null) {
            C89219l.m154710a("jediView");
        }
        C41303e eVar = new C41303e();
        C41301c cVar = new C41301c(C41299a.INSTANCE, C41300b.INSTANCE, new C41306f(this, adVar));
        C41302d dVar = new C41302d(new C41308g(this, adVar), new C41311i(this, adVar), new C41309h(this, adVar));
        C89219l.m154721d(searchJediViewModel, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(eVar, "");
        ListMiddleware.m38615a(searchJediViewModel.f98261c, qVar, eVar, qVar.getUniqueOnlyGlobal(), cVar, dVar, null, null, 896);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$f */
    static final class C41306f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C42411h>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41298p f96416a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96417b;

        static {
            Covode.recordClassIndex(49194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41306f(C41298p pVar, AbstractC39102c cVar) {
            super(2);
            this.f96416a = pVar;
            this.f96417b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C42411h> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f96416a.f96401b, new AbstractC89172b<SearchState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.operators.C41298p.C41306f.C413071 */

                /* renamed from: a */
                final /* synthetic */ C41306f f96418a;

                static {
                    Covode.recordClassIndex(49195);
                }

                {
                    this.f96418a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SearchState searchState) {
                    SearchState searchState2 = searchState;
                    C89219l.m154721d(searchState2, "");
                    C20442b bVar = searchState2.getListState().getPayload().f48406a;
                    List<C42411h> list = searchState2.getListState().getList();
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t.getFeedType() == 65280) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61496a> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                    for (AbstractC61496a aVar : arrayList2) {
                        arrayList3.add(aVar.getAweme());
                    }
                    this.f96418a.f96417b.mo59512a(arrayList3, bVar.f48382a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$i */
    static final class C41311i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41298p f96424a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96425b;

        static {
            Covode.recordClassIndex(49199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41311i(C41298p pVar, AbstractC39102c cVar) {
            super(2);
            this.f96424a = pVar;
            this.f96425b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            this.f96425b.mo59522c(new Exception(th2));
            this.f96424a.f96400a = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$h */
    static final class C41309h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C42411h>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41298p f96421a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96422b;

        static {
            Covode.recordClassIndex(49197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41309h(C41298p pVar, AbstractC39102c cVar) {
            super(2);
            this.f96421a = pVar;
            this.f96422b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C42411h> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            SearchJediViewModel searchJediViewModel = this.f96421a.f96401b;
            if (searchJediViewModel == null) {
                C89219l.m154715b();
            }
            iVar2.withState(searchJediViewModel, new AbstractC89172b<SearchState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.operators.C41298p.C41309h.C413101 */

                /* renamed from: a */
                final /* synthetic */ C41309h f96423a;

                static {
                    Covode.recordClassIndex(49198);
                }

                {
                    this.f96423a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SearchState searchState) {
                    SearchState searchState2 = searchState;
                    C89219l.m154721d(searchState2, "");
                    C20442b bVar = searchState2.getListState().getPayload().f48406a;
                    List<C42411h> list = searchState2.getListState().getList();
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t.getFeedType() == 65280) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61496a> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                    for (AbstractC61496a aVar : arrayList2) {
                        arrayList3.add(aVar.getAweme());
                    }
                    this.f96423a.f96422b.mo59517b(arrayList3, bVar.f48382a);
                    return C89391z.f203057a;
                }
            });
            this.f96421a.f96400a = false;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        if (i == 1) {
            SearchJediViewModel searchJediViewModel = this.f96401b;
            if (searchJediViewModel == null) {
                C89219l.m154715b();
            }
            if (searchJediViewModel.f98259a != null) {
                AbstractC88412b bVar2 = searchJediViewModel.f98259a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                searchJediViewModel.mo33689c(SearchJediViewModel.C42155b.f98265a);
            }
            searchJediViewModel.f98261c.refresh();
        } else if (i == 4) {
            SearchJediViewModel searchJediViewModel2 = this.f96401b;
            if (searchJediViewModel2 == null) {
                C89219l.m154715b();
            }
            if (searchJediViewModel2.f98260b != null) {
                AbstractC88412b bVar3 = searchJediViewModel2.f98260b;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                searchJediViewModel2.mo33689c(SearchJediViewModel.C42154a.f98264a);
            }
            searchJediViewModel2.f98261c.loadMore();
        }
    }
}
