package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.arch.ext.list.C20465o;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ListState<T, P extends C20465o> implements AbstractC20368af {
    private final C20442b isEmpty;
    private final List<T> list;
    private final AbstractC20362a<List<T>> loadMore;
    private final P payload;
    private final AbstractC20362a<List<T>> refresh;

    static {
        Covode.recordClassIndex(23933);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.jedi.arch.ext.list.ListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListState copy$default(ListState listState, C20465o oVar, List list2, AbstractC20362a aVar, AbstractC20362a aVar2, C20442b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            oVar = listState.payload;
        }
        if ((i & 2) != 0) {
            list2 = listState.list;
        }
        if ((i & 4) != 0) {
            aVar = listState.refresh;
        }
        if ((i & 8) != 0) {
            aVar2 = listState.loadMore;
        }
        if ((i & 16) != 0) {
            bVar = listState.isEmpty;
        }
        return listState.copy(oVar, list2, aVar, aVar2, bVar);
    }

    public final P component1() {
        return this.payload;
    }

    public final List<T> component2() {
        return this.list;
    }

    public final AbstractC20362a<List<T>> component3() {
        return this.refresh;
    }

    public final AbstractC20362a<List<T>> component4() {
        return this.loadMore;
    }

    public final C20442b component5() {
        return this.isEmpty;
    }

    public final ListState<T, P> copy(P p, List<? extends T> list2, AbstractC20362a<? extends List<? extends T>> aVar, AbstractC20362a<? extends List<? extends T>> aVar2, C20442b bVar) {
        C89219l.m154719c(p, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(bVar, "");
        return new ListState<>(p, list2, aVar, aVar2, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListState)) {
            return false;
        }
        ListState listState = (ListState) obj;
        return C89219l.m154714a(this.payload, listState.payload) && C89219l.m154714a(this.list, listState.list) && C89219l.m154714a(this.refresh, listState.refresh) && C89219l.m154714a(this.loadMore, listState.loadMore) && C89219l.m154714a(this.isEmpty, listState.isEmpty);
    }

    public final int hashCode() {
        P p = this.payload;
        int i = 0;
        int hashCode = (p != null ? p.hashCode() : 0) * 31;
        List<T> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        AbstractC20362a<List<T>> aVar = this.refresh;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC20362a<List<T>> aVar2 = this.loadMore;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C20442b bVar = this.isEmpty;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ListState(payload=" + this.payload + ", list=" + this.list + ", refresh=" + this.refresh + ", loadMore=" + this.loadMore + ", isEmpty=" + this.isEmpty + ")";
    }

    public final List<T> getList() {
        return this.list;
    }

    public final AbstractC20362a<List<T>> getLoadMore() {
        return this.loadMore;
    }

    public final P getPayload() {
        return this.payload;
    }

    public final AbstractC20362a<List<T>> getRefresh() {
        return this.refresh;
    }

    public final C20442b isEmpty() {
        return this.isEmpty;
    }

    public final C20442b getHasMore() {
        return this.payload.f48406a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.jedi.arch.a<? extends java.util.List<? extends T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.a<? extends java.util.List<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public ListState(P p, List<? extends T> list2, AbstractC20362a<? extends List<? extends T>> aVar, AbstractC20362a<? extends List<? extends T>> aVar2, C20442b bVar) {
        C89219l.m154719c(p, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(bVar, "");
        this.payload = p;
        this.list = list2;
        this.refresh = aVar;
        this.loadMore = aVar2;
        this.isEmpty = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListState(C20465o oVar, List list2, AbstractC20362a aVar, AbstractC20362a aVar2, C20442b bVar, int i, C89214g gVar) {
        this(oVar, (i & 2) != 0 ? C89086z.INSTANCE : list2, (i & 4) != 0 ? C20379aq.f48273a : aVar, (i & 8) != 0 ? C20379aq.f48273a : aVar2, (i & 16) != 0 ? new C20442b(false) : bVar);
    }
}
