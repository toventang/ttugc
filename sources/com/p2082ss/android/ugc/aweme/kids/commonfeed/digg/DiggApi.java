package com.p2082ss.android.ugc.aweme.kids.commonfeed.digg;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.digg.DiggApi */
public final class DiggApi {

    /* renamed from: a */
    public static final DiggApi f130859a = new DiggApi();

    /* renamed from: b */
    private static final RetrofitApi f130860b = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.digg.DiggApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67328);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/kids/commit/item/digg/")
        AbstractC88979t<BaseResponse> diggAweme(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "type") int i);
    }

    private DiggApi() {
    }

    static {
        Covode.recordClassIndex(67327);
    }

    /* renamed from: a */
    public static AbstractC88979t<BaseResponse> m104027a(String str, int i) {
        return f130860b.diggAweme(str, i);
    }
}
