package com.p2082ss.android.ugc.aweme.p2282ad.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.ad.network.VoteApi */
public interface VoteApi {

    /* renamed from: a */
    public static final C33357a f79284a = C33357a.f79285a;

    static {
        Covode.recordClassIndex(40200);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/ad/experience/vote/")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> sendVoteOption(@AbstractC21997e(mo35786a = "item_id") String str, @AbstractC21997e(mo35786a = "creative_id") String str2, @AbstractC21997e(mo35786a = "ad_id") String str3, @AbstractC21997e(mo35786a = "vote_result") int i);

    /* renamed from: com.ss.android.ugc.aweme.ad.network.VoteApi$a */
    public static final class C33357a {

        /* renamed from: a */
        static final /* synthetic */ C33357a f79285a = new C33357a();

        private C33357a() {
        }

        static {
            Covode.recordClassIndex(40201);
        }
    }
}
