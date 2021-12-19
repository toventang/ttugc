package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42173e;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState */
public final class SearchMusicListState implements AbstractC20368af {
    private final ListState<SearchMusic, C42173e> listState;
    private final C42174f searchParam;

    static {
        Covode.recordClassIndex(51138);
    }

    public SearchMusicListState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMusicListState copy$default(SearchMusicListState searchMusicListState, ListState listState2, C42174f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            listState2 = searchMusicListState.listState;
        }
        if ((i & 2) != 0) {
            fVar = searchMusicListState.searchParam;
        }
        return searchMusicListState.copy(listState2, fVar);
    }

    public final ListState<SearchMusic, C42173e> component1() {
        return this.listState;
    }

    public final C42174f component2() {
        return this.searchParam;
    }

    public final SearchMusicListState copy(ListState<SearchMusic, C42173e> listState2, C42174f fVar) {
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(fVar, "");
        return new SearchMusicListState(listState2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMusicListState)) {
            return false;
        }
        SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
        return C89219l.m154714a(this.listState, searchMusicListState.listState) && C89219l.m154714a(this.searchParam, searchMusicListState.searchParam);
    }

    public final int hashCode() {
        ListState<SearchMusic, C42173e> listState2 = this.listState;
        int i = 0;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        C42174f fVar = this.searchParam;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchMusicListState(listState=" + this.listState + ", searchParam=" + this.searchParam + ")";
    }

    public final ListState<SearchMusic, C42173e> getListState() {
        return this.listState;
    }

    public final C42174f getSearchParam() {
        return this.searchParam;
    }

    public SearchMusicListState(ListState<SearchMusic, C42173e> listState2, C42174f fVar) {
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(fVar, "");
        this.listState = listState2;
        this.searchParam = fVar;
    }

    public /* synthetic */ SearchMusicListState(ListState listState2, C42174f fVar, int i, C89214g gVar) {
        SearchMusicListState searchMusicListState;
        C42174f fVar2 = fVar;
        ListState listState3 = (i & 1) != 0 ? new ListState(new C42173e(), null, null, null, null, 30, null) : listState2;
        if ((i & 2) != 0) {
            fVar2 = new C42174f("", 0, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, null, null, 1048574);
            searchMusicListState = this;
        } else {
            searchMusicListState = this;
        }
        new SearchMusicListState(listState3, fVar2);
    }
}
