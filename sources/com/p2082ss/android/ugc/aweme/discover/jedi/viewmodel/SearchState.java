package com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState */
public final class SearchState implements AbstractC20368af {
    private final ListState<C42411h, C42173e> listState;
    private final C42174f searchParam;

    static {
        Covode.recordClassIndex(50107);
    }

    public SearchState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchState copy$default(SearchState searchState, ListState listState2, C42174f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            listState2 = searchState.listState;
        }
        if ((i & 2) != 0) {
            fVar = searchState.searchParam;
        }
        return searchState.copy(listState2, fVar);
    }

    public final ListState<C42411h, C42173e> component1() {
        return this.listState;
    }

    public final C42174f component2() {
        return this.searchParam;
    }

    public final SearchState copy(ListState<C42411h, C42173e> listState2, C42174f fVar) {
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(fVar, "");
        return new SearchState(listState2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) obj;
        return C89219l.m154714a(this.listState, searchState.listState) && C89219l.m154714a(this.searchParam, searchState.searchParam);
    }

    public final int hashCode() {
        ListState<C42411h, C42173e> listState2 = this.listState;
        int i = 0;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        C42174f fVar = this.searchParam;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchState(listState=" + this.listState + ", searchParam=" + this.searchParam + ")";
    }

    public final ListState<C42411h, C42173e> getListState() {
        return this.listState;
    }

    public final C42174f getSearchParam() {
        return this.searchParam;
    }

    public SearchState(ListState<C42411h, C42173e> listState2, C42174f fVar) {
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(fVar, "");
        this.listState = listState2;
        this.searchParam = fVar;
    }

    public /* synthetic */ SearchState(ListState listState2, C42174f fVar, int i, C89214g gVar) {
        SearchState searchState;
        C42174f fVar2 = fVar;
        ListState listState3 = (i & 1) != 0 ? new ListState(new C42173e(), null, null, null, null, 30, null) : listState2;
        if ((i & 2) != 0) {
            fVar2 = new C42174f("", 0, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, 0, null, null, 1048574);
            searchState = this;
        } else {
            searchState = this;
        }
        new SearchState(listState3, fVar2);
    }
}
