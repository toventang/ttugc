package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.api.AwemeStatsApi */
public final class AwemeStatsApi {

    /* renamed from: a */
    public static final AwemeStatsService f111976a = ((AwemeStatsService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(AwemeStatsService.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.AwemeStatsApi$AwemeStatsService */
    public interface AwemeStatsService {
        static {
            Covode.recordClassIndex(57065);
        }

        @AbstractC22012t(mo35799a = "/aweme/v1/familiar/video/stats/")
        @AbstractC21999g
        AbstractFutureC27655q<BaseResponse> awemeFamiliarStatsReport(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "author_id") String str2, @AbstractC21997e(mo35786a = "follow_status") int i, @AbstractC21997e(mo35786a = "follower_status") int i2);

        @AbstractC22012t(mo35799a = "/aweme/v1/fast/stats/")
        @AbstractC21999g
        AbstractFutureC27655q<BaseResponse> awemeFastStatsReport(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "tab_type") int i, @AbstractC21997e(mo35786a = "aweme_type") int i2, @AbstractC21997e(mo35786a = "origin_item_id") String str2);

        @AbstractC22012t(mo35799a = "/aweme/v1/aweme/stats/")
        @AbstractC21999g
        AbstractFutureC27655q<BaseResponse> awemeStatsReport(@AbstractC21998f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(57064);
    }
}
