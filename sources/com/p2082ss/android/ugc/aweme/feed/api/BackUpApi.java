package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;

/* renamed from: com.ss.android.ugc.aweme.feed.api.BackUpApi */
public final class BackUpApi {

    /* renamed from: a */
    public static final IBackUpApi f111977a = ((IBackUpApi) C18097a.m33698a(C29736b.f70924e, IBackUpApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.BackUpApi$IBackUpApi */
    public interface IBackUpApi {
        static {
            Covode.recordClassIndex(57067);
        }

        @AbstractC22000h(mo35789a = "aweme/v1/aweme/statistics/")
        AbstractFutureC27655q<AwemeStatisticsResponse> queryAwemeStatistics(@AbstractC22018z(mo35807a = "aweme_ids") String str, @AbstractC22018z(mo35807a = "type") int i);
    }

    static {
        Covode.recordClassIndex(57066);
    }
}
