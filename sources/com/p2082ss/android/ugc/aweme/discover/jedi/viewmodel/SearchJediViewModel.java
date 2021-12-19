package com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel */
public final class SearchJediViewModel extends JediViewModel<SearchState> {

    /* renamed from: a */
    public AbstractC88412b f98259a;

    /* renamed from: b */
    public AbstractC88412b f98260b;

    /* renamed from: c */
    public final ListMiddleware<SearchState, C42411h, C42173e> f98261c = new ListMiddleware<>(new C42161d(this), new C42156c(this), null, C42166e.f98276a, 4);

    /* renamed from: d */
    public List<C42411h> f98262d;

    /* renamed from: e */
    public boolean f98263e;

    static {
        Covode.recordClassIndex(50089);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ SearchState mo23027d() {
        return new SearchState(null, null, 3, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        new SearchJediViewModelMiddlewareBinding().binding(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$a */
    public static final class C42154a extends AbstractC89220m implements AbstractC89172b<SearchState, SearchState> {

        /* renamed from: a */
        public static final C42154a f98264a = new C42154a();

        static {
            Covode.recordClassIndex(50090);
        }

        C42154a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SearchState invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            C89219l.m154721d(searchState2, "");
            return SearchState.copy$default(searchState2, ListState.copy$default(searchState2.getListState(), null, null, null, new C20466f(new CancellationException()), null, 23, null), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$b */
    public static final class C42155b extends AbstractC89220m implements AbstractC89172b<SearchState, SearchState> {

        /* renamed from: a */
        public static final C42155b f98265a = new C42155b();

        static {
            Covode.recordClassIndex(50091);
        }

        C42155b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SearchState invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            C89219l.m154721d(searchState2, "");
            return SearchState.copy$default(searchState2, ListState.copy$default(searchState2.getListState(), null, null, new C20466f(new CancellationException()), null, null, 27, null), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$d */
    static final class C42161d extends AbstractC89220m implements AbstractC89172b<SearchState, AbstractC88979t<C89378p<? extends List<? extends C42411h>, ? extends C42173e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchJediViewModel f98271a;

        static {
            Covode.recordClassIndex(50097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42161d(SearchJediViewModel searchJediViewModel) {
            super(1);
            this.f98271a = searchJediViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends C42411h>, ? extends C42173e>> invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            C89219l.m154721d(searchState2, "");
            AbstractC88979t<R> d = SearchApiNew.m83827a(searchState2.getSearchParam(), 0, C42169a.f98279a, null).mo143285c(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42161d.C421621 */

                /* renamed from: a */
                final /* synthetic */ C42161d f98272a;

                static {
                    Covode.recordClassIndex(50098);
                }

                {
                    this.f98272a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f98272a.f98271a.f98259a = (AbstractC88412b) obj;
                }
            }).mo143279b(new AbstractC88428a(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42161d.C421632 */

                /* renamed from: a */
                final /* synthetic */ C42161d f98273a;

                static {
                    Covode.recordClassIndex(50099);
                }

                {
                    this.f98273a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88428a
                /* renamed from: a */
                public final void mo8579a() {
                    this.f98273a.f98271a.f98259a = null;
                }
            }).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42161d.C421643 */

                /* renamed from: a */
                final /* synthetic */ C42161d f98274a;

                static {
                    Covode.recordClassIndex(50100);
                }

                {
                    this.f98274a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    C42426m mVar = (C42426m) obj;
                    C89219l.m154721d(mVar, "");
                    SearchJediViewModel searchJediViewModel = this.f98274a.f98271a;
                    searchJediViewModel.f98262d = null;
                    searchJediViewModel.f98263e = false;
                    SearchJediViewModel.m84424b(mVar.f98850c);
                    this.f98274a.f98271a.mo71361a(mVar.f98850c);
                    return mVar;
                }
            }).mo143292d(C421654.f98275a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: a */
    static boolean m84423a(C42411h hVar) {
        Integer valueOf;
        if (hVar == null || (valueOf = Integer.valueOf(hVar.getFeedType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 65280 || valueOf.intValue() == 1048336) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m84424b(List<C42411h> list) {
        if (list != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C42411h hVar : list) {
                if (hVar.getFeedType() == 65515 && hVar.f98792b.size() < 3) {
                    arrayList.add(hVar);
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$c */
    static final class C42156c extends AbstractC89220m implements AbstractC89172b<SearchState, AbstractC88979t<C89378p<? extends List<? extends C42411h>, ? extends C42173e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchJediViewModel f98266a;

        static {
            Covode.recordClassIndex(50092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42156c(SearchJediViewModel searchJediViewModel) {
            super(1);
            this.f98266a = searchJediViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends C42411h>, ? extends C42173e>> invoke(SearchState searchState) {
            SearchState searchState2 = searchState;
            C89219l.m154721d(searchState2, "");
            final C42174f searchParam = searchState2.getSearchParam();
            String str = searchState2.getListState().getPayload().f98282c;
            C89219l.m154721d(str, "");
            searchParam.f98290g = str;
            int i = searchState2.getListState().getPayload().f48407b;
            SearchApiResult searchApiResult = searchState2.getListState().getPayload().f98283d;
            Objects.requireNonNull(searchApiResult, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
            AbstractC88979t<R> d = SearchApiNew.m83827a(searchParam, i, 10, (C42426m) searchApiResult).mo143285c(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42156c.C421571 */

                /* renamed from: a */
                final /* synthetic */ C42156c f98267a;

                static {
                    Covode.recordClassIndex(50093);
                }

                {
                    this.f98267a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f98267a.f98266a.f98260b = (AbstractC88412b) obj;
                }
            }).mo143279b(new AbstractC88428a(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42156c.C421582 */

                /* renamed from: a */
                final /* synthetic */ C42156c f98268a;

                static {
                    Covode.recordClassIndex(50094);
                }

                {
                    this.f98268a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88428a
                /* renamed from: a */
                public final void mo8579a() {
                    this.f98268a.f98266a.f98260b = null;
                }
            }).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42156c.C421593 */

                /* renamed from: a */
                final /* synthetic */ C42156c f98269a;

                static {
                    Covode.recordClassIndex(50095);
                }

                {
                    this.f98269a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    C42426m mVar = (C42426m) obj;
                    C89219l.m154721d(mVar, "");
                    SearchJediViewModel searchJediViewModel = this.f98269a.f98266a;
                    List<C42411h> list = mVar.f98850c;
                    if (searchJediViewModel.f98262d != null) {
                        if (list != null) {
                            Iterator<C42411h> it = list.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!SearchJediViewModel.m84423a(it.next())) {
                                    i++;
                                } else if (i >= 0 && i < list.size()) {
                                    searchJediViewModel.f98263e = true;
                                    list.add(0, list.remove(i));
                                    List<C42411h> list2 = searchJediViewModel.f98262d;
                                    if (list2 == null) {
                                        C89219l.m154715b();
                                    }
                                    list.addAll(1, list2);
                                }
                            }
                        }
                        searchJediViewModel.f98262d = null;
                    }
                    SearchJediViewModel.m84424b(mVar.f98850c);
                    this.f98269a.f98266a.mo71361a(mVar.f98850c);
                    return mVar;
                }
            }).mo143292d(new AbstractC88434g() {
                /* class com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel.C42156c.C421604 */

                static {
                    Covode.recordClassIndex(50096);
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    C42426m mVar = (C42426m) obj;
                    String str = "";
                    C89219l.m154721d(mVar, str);
                    List<C42411h> list = mVar.f98850c;
                    String str2 = searchParam.f98290g;
                    if (str2 != null) {
                        str = str2;
                    }
                    return C89387v.m154943a(list, new C42173e(str, mVar.f98849b, mVar.f98848a, mVar));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: a */
    public final void mo71361a(List<C42411h> list) {
        int i;
        if (list != null && (!list.isEmpty())) {
            int i2 = 0;
            if (this.f98263e) {
                this.f98263e = false;
                i = 1;
            } else {
                i = 0;
            }
            Iterator<T> it = list.iterator();
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (!it.hasNext()) {
                    i2 = i;
                    break;
                }
                if (m84423a((C42411h) it.next())) {
                    i++;
                } else {
                    i4 = i3;
                }
                if (i4 != -1) {
                    if (i % 2 == 0) {
                        i = 0;
                        i4 = -1;
                    } else if (!(i4 == -1 || i % 2 == 0)) {
                        int i5 = i3 + 1;
                        if (i5 < list.size()) {
                            Iterator<C42411h> it2 = list.subList(i5, list.size()).iterator();
                            int i6 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (!m84423a(it2.next())) {
                                    i6++;
                                } else if (i6 != -1) {
                                    list.add(i4, list.remove(i5 + i6));
                                    int i7 = i4 + 2;
                                    if (i7 < list.size()) {
                                        mo71361a(list.subList(i7, list.size()));
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        this.f98262d = arrayList;
                        arrayList.addAll(list.subList(i4, list.size()));
                        List<C42411h> list2 = this.f98262d;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        list.removeAll(list2);
                    }
                }
                i3++;
            }
            if (i2 % 2 != 0) {
                this.f98262d = new ArrayList();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel$e */
    static final class C42166e extends AbstractC89220m implements AbstractC89183m<List<? extends C42411h>, List<? extends C42411h>, List<? extends C42411h>> {

        /* renamed from: a */
        public static final C42166e f98276a = new C42166e();

        static {
            Covode.recordClassIndex(50102);
        }

        C42166e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends C42411h> invoke(List<? extends C42411h> list, List<? extends C42411h> list2) {
            List<? extends C42411h> list3 = list;
            List<? extends C42411h> list4 = list2;
            C89219l.m154721d(list3, "");
            C89219l.m154721d(list4, "");
            return C89070n.m154594n(C89070n.m154572d((Collection) list3, (Iterable) list4));
        }
    }
}
