package com.p2082ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState */
public final class TrendingMainState implements ICommonListState<Aweme> {
    private final C67590l curTrending;
    private final ArrayList<Aweme> initAwemeList;
    private final C67590l loadingTrending;
    private final boolean showTrendExpiredToast;
    private final ListState<Aweme, C20465o> substate;
    private final String trendingIdList;
    private final ArrayList<C67590l> trendingList;

    static {
        Covode.recordClassIndex(92316);
    }

    public TrendingMainState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingMainState copy$default(TrendingMainState trendingMainState, ListState listState, C67590l lVar, C67590l lVar2, ArrayList arrayList, ArrayList arrayList2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            listState = trendingMainState.getSubstate();
        }
        if ((i & 2) != 0) {
            lVar = trendingMainState.curTrending;
        }
        if ((i & 4) != 0) {
            lVar2 = trendingMainState.loadingTrending;
        }
        if ((i & 8) != 0) {
            arrayList = trendingMainState.initAwemeList;
        }
        if ((i & 16) != 0) {
            arrayList2 = trendingMainState.trendingList;
        }
        if ((i & 32) != 0) {
            str = trendingMainState.trendingIdList;
        }
        if ((i & 64) != 0) {
            z = trendingMainState.showTrendExpiredToast;
        }
        return trendingMainState.copy(listState, lVar, lVar2, arrayList, arrayList2, str, z);
    }

    public final ListState<Aweme, C20465o> component1() {
        return getSubstate();
    }

    public final C67590l component2() {
        return this.curTrending;
    }

    public final C67590l component3() {
        return this.loadingTrending;
    }

    public final ArrayList<Aweme> component4() {
        return this.initAwemeList;
    }

    public final ArrayList<C67590l> component5() {
        return this.trendingList;
    }

    public final String component6() {
        return this.trendingIdList;
    }

    public final boolean component7() {
        return this.showTrendExpiredToast;
    }

    public final TrendingMainState copy(ListState<Aweme, C20465o> listState, C67590l lVar, C67590l lVar2, ArrayList<Aweme> arrayList, ArrayList<C67590l> arrayList2, String str, boolean z) {
        C89219l.m154721d(listState, "");
        C89219l.m154721d(arrayList, "");
        return new TrendingMainState(listState, lVar, lVar2, arrayList, arrayList2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingMainState)) {
            return false;
        }
        TrendingMainState trendingMainState = (TrendingMainState) obj;
        return C89219l.m154714a(getSubstate(), trendingMainState.getSubstate()) && C89219l.m154714a(this.curTrending, trendingMainState.curTrending) && C89219l.m154714a(this.loadingTrending, trendingMainState.loadingTrending) && C89219l.m154714a(this.initAwemeList, trendingMainState.initAwemeList) && C89219l.m154714a(this.trendingList, trendingMainState.trendingList) && C89219l.m154714a(this.trendingIdList, trendingMainState.trendingIdList) && this.showTrendExpiredToast == trendingMainState.showTrendExpiredToast;
    }

    public final int hashCode() {
        ListState<Aweme, C20465o> substate2 = getSubstate();
        int i = 0;
        int hashCode = (substate2 != null ? substate2.hashCode() : 0) * 31;
        C67590l lVar = this.curTrending;
        int hashCode2 = (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        C67590l lVar2 = this.loadingTrending;
        int hashCode3 = (hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        ArrayList<Aweme> arrayList = this.initAwemeList;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<C67590l> arrayList2 = this.trendingList;
        int hashCode5 = (hashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        String str = this.trendingIdList;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.showTrendExpiredToast;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "TrendingMainState(substate=" + getSubstate() + ", curTrending=" + this.curTrending + ", loadingTrending=" + this.loadingTrending + ", initAwemeList=" + this.initAwemeList + ", trendingList=" + this.trendingList + ", trendingIdList=" + this.trendingIdList + ", showTrendExpiredToast=" + this.showTrendExpiredToast + ")";
    }

    public final C67590l getCurTrending() {
        return this.curTrending;
    }

    public final ArrayList<Aweme> getInitAwemeList() {
        return this.initAwemeList;
    }

    public final C67590l getLoadingTrending() {
        return this.loadingTrending;
    }

    public final boolean getShowTrendExpiredToast() {
        return this.showTrendExpiredToast;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<Aweme, C20465o> getSubstate() {
        return this.substate;
    }

    public final String getTrendingIdList() {
        return this.trendingIdList;
    }

    public final ArrayList<C67590l> getTrendingList() {
        return this.trendingList;
    }

    public final NestedState<ListState<Aweme, C20465o>> newSubstate(ListState<Aweme, C20465o> listState) {
        C89219l.m154721d(listState, "");
        return copy$default(this, listState, null, null, null, null, null, false, 126, null);
    }

    public TrendingMainState(ListState<Aweme, C20465o> listState, C67590l lVar, C67590l lVar2, ArrayList<Aweme> arrayList, ArrayList<C67590l> arrayList2, String str, boolean z) {
        C89219l.m154721d(listState, "");
        C89219l.m154721d(arrayList, "");
        this.substate = listState;
        this.curTrending = lVar;
        this.loadingTrending = lVar2;
        this.initAwemeList = arrayList;
        this.trendingList = arrayList2;
        this.trendingIdList = str;
        this.showTrendExpiredToast = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingMainState(ListState listState, C67590l lVar, C67590l lVar2, ArrayList arrayList, ArrayList arrayList2, String str, boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ListState(new C20465o(false, 2, (byte) 0), null, null, null, null, 30, null) : listState, (i & 2) != 0 ? null : lVar, (i & 4) != 0 ? null : lVar2, (i & 8) != 0 ? new ArrayList() : arrayList, (i & 16) == 0 ? arrayList2 : null, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? z : false);
    }
}
