package com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20550y;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModelMiddlewareBinding */
public final class SearchJediViewModelMiddlewareBinding implements AbstractC20550y<SearchState, SearchJediViewModel> {
    static {
        Covode.recordClassIndex(50103);
    }

    private final void bind0(SearchJediViewModel searchJediViewModel) {
        ListMiddleware<SearchState, C42411h, C42173e> listMiddleware = searchJediViewModel.f98261c;
        listMiddleware.mo33809a(C42170b.f98280a, C42167a.f98277a);
        searchJediViewModel.mo33684a(listMiddleware);
    }

    public final void binding(SearchJediViewModel searchJediViewModel) {
        C89219l.m154721d(searchJediViewModel, "");
        bind0(searchJediViewModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModelMiddlewareBinding$a */
    public static final class C42167a extends AbstractC89220m implements AbstractC89183m<SearchState, ListState<C42411h, C42173e>, SearchState> {

        /* renamed from: a */
        public static final C42167a f98277a = new C42167a();

        static {
            Covode.recordClassIndex(50104);
        }

        C42167a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ SearchState invoke(SearchState searchState, ListState<C42411h, C42173e> listState) {
            SearchState searchState2 = searchState;
            ListState<C42411h, C42173e> listState2 = listState;
            C89219l.m154721d(searchState2, "");
            C89219l.m154721d(listState2, "");
            return SearchState.copy$default(searchState2, listState2, null, 2, null);
        }
    }
}
