package com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20550y;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding */
public final class SearchMusicViewModel_MiddlewareBinding implements AbstractC20550y<SearchMusicListState, SearchMusicViewModel> {
    static {
        Covode.recordClassIndex(50105);
    }

    private final void bind_0(SearchMusicViewModel searchMusicViewModel) {
        ListMiddleware<SearchMusicListState, SearchMusic, C42173e> listMiddleware = searchMusicViewModel.f100257a;
        listMiddleware.mo33809a(C42171c.f98281a, C42168a.f98278a);
        searchMusicViewModel.mo33684a(listMiddleware);
    }

    public final void binding(SearchMusicViewModel searchMusicViewModel) {
        C89219l.m154721d(searchMusicViewModel, "");
        bind_0(searchMusicViewModel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding$a */
    public static final class C42168a extends AbstractC89220m implements AbstractC89183m<SearchMusicListState, ListState<SearchMusic, C42173e>, SearchMusicListState> {

        /* renamed from: a */
        public static final C42168a f98278a = new C42168a();

        static {
            Covode.recordClassIndex(50106);
        }

        C42168a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ SearchMusicListState invoke(SearchMusicListState searchMusicListState, ListState<SearchMusic, C42173e> listState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            ListState<SearchMusic, C42173e> listState2 = listState;
            C89219l.m154721d(searchMusicListState2, "");
            C89219l.m154721d(listState2, "");
            return SearchMusicListState.copy$default(searchMusicListState2, listState2, null, 2, null);
        }
    }
}
