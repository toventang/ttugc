package com.p2082ss.android.ugc.aweme.kids.commonfeed.reportstats;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import java.util.Map;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.reportstats.KidsAwemeStatsApi */
public final class KidsAwemeStatsApi {

    /* renamed from: a */
    public static final RetrofitApi f131052a = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(RetrofitApi.class));

    /* renamed from: b */
    public static final KidsAwemeStatsApi f131053b = new KidsAwemeStatsApi();

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.reportstats.KidsAwemeStatsApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67405);
        }

        @AbstractC22012t(mo35799a = "/tiktok/v1/kids/video/stats/")
        @AbstractC21999g
        C1731i<BaseResponse> reportAwemeStats(@AbstractC21998f Map<String, String> map);
    }

    private KidsAwemeStatsApi() {
    }

    static {
        Covode.recordClassIndex(67404);
    }
}
