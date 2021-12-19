package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class RankResponse {
    @AbstractC27891c(mo46611a = "pages")
    private final List<RankPage> pages;
    @AbstractC27891c(mo46611a = "show_index")
    private final int showIndex;

    static {
        Covode.recordClassIndex(11936);
    }

    public RankResponse() {
        this(null, 0, 3, null);
    }

    /* renamed from: com_bytedance_android_livesdk_rank_impl_api_model_RankResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18863xd42e1cbf(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.rank.impl.api.model.RankResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankResponse copy$default(RankResponse rankResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = rankResponse.pages;
        }
        if ((i2 & 2) != 0) {
            i = rankResponse.showIndex;
        }
        return rankResponse.copy(list, i);
    }

    public final List<RankPage> component1() {
        return this.pages;
    }

    public final int component2() {
        return this.showIndex;
    }

    public final RankResponse copy(List<RankPage> list, int i) {
        C89219l.m154721d(list, "");
        return new RankResponse(list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankResponse)) {
            return false;
        }
        RankResponse rankResponse = (RankResponse) obj;
        return C89219l.m154714a(this.pages, rankResponse.pages) && this.showIndex == rankResponse.showIndex;
    }

    public final int hashCode() {
        List<RankPage> list = this.pages;
        return ((list != null ? list.hashCode() : 0) * 31) + m18863xd42e1cbf(this.showIndex);
    }

    public final String toString() {
        return "RankResponse(pages=" + this.pages + ", showIndex=" + this.showIndex + ")";
    }

    public final List<RankPage> getPages() {
        return this.pages;
    }

    public final int getShowIndex() {
        return this.showIndex;
    }

    public RankResponse(List<RankPage> list, int i) {
        C89219l.m154721d(list, "");
        this.pages = list;
        this.showIndex = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RankResponse(List list, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
