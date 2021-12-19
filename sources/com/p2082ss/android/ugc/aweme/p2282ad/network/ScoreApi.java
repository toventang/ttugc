package com.p2082ss.android.ugc.aweme.p2282ad.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.ad.network.ScoreApi */
public interface ScoreApi {

    /* renamed from: a */
    public static final C33356a f79282a = C33356a.f79283a;

    static {
        Covode.recordClassIndex(40198);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/ad/experience/ad/history/rating/")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> sendScoreOption(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "advertiser_id") String str2, @AbstractC21997e(mo35786a = "ad_id") String str3, @AbstractC21997e(mo35786a = "creative_id") String str4, @AbstractC21997e(mo35786a = "rating") int i);

    /* renamed from: com.ss.android.ugc.aweme.ad.network.ScoreApi$a */
    public static final class C33356a {

        /* renamed from: a */
        static final /* synthetic */ C33356a f79283a = new C33356a();

        private C33356a() {
        }

        static {
            Covode.recordClassIndex(40199);
        }
    }
}
