package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingData */
public final class TrendingData extends BaseResponse {
    @AbstractC27891c(mo46611a = "billboard_info")
    public ArrayList<C67590l> billboardInfo;
    @AbstractC27891c(mo46611a = "billboard_type")
    public int billboardType;
    @AbstractC27891c(mo46611a = "item_related_event_id")
    public String trendingId;

    static {
        Covode.recordClassIndex(50532);
    }

    public TrendingData() {
        this(null, null, 0, 7, null);
    }

    public final void setTrendingId(String str) {
        C89219l.m154721d(str, "");
        this.trendingId = str;
    }

    public TrendingData(ArrayList<C67590l> arrayList, String str, int i) {
        C89219l.m154721d(str, "");
        this.billboardInfo = arrayList;
        this.trendingId = str;
        this.billboardType = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingData(ArrayList arrayList, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : arrayList, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
