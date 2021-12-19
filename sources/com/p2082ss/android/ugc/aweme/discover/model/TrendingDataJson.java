package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingDataJson */
public final class TrendingDataJson {
    @AbstractC27891c(mo46611a = "trendingBillboardData")
    public TrendingData trendingData;

    static {
        Covode.recordClassIndex(50533);
    }

    public static /* synthetic */ TrendingDataJson copy$default(TrendingDataJson trendingDataJson, TrendingData trendingData2, int i, Object obj) {
        if ((i & 1) != 0) {
            trendingData2 = trendingDataJson.trendingData;
        }
        return trendingDataJson.copy(trendingData2);
    }

    public final TrendingDataJson copy(TrendingData trendingData2) {
        return new TrendingDataJson(trendingData2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TrendingDataJson) && C89219l.m154714a(this.trendingData, ((TrendingDataJson) obj).trendingData);
        }
        return true;
    }

    public final int hashCode() {
        TrendingData trendingData2 = this.trendingData;
        if (trendingData2 != null) {
            return trendingData2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TrendingDataJson(trendingData=" + this.trendingData + ")";
    }

    public TrendingDataJson(TrendingData trendingData2) {
        this.trendingData = trendingData2;
    }
}
