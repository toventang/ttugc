package com.p2082ss.android.ugc.aweme.kids.discovery.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57562d;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.api.DetailApi */
public final class DetailApi {

    /* renamed from: a */
    public static final DetailApi f131388a = new DetailApi();

    /* renamed from: b */
    private static final RetrofitApi f131389b = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.api.DetailApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67506);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/kids/category/videos/")
        AbstractC88979t<C57562d> getDetailList(@AbstractC22018z(mo35807a = "ch_id") String str, @AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2);
    }

    private DetailApi() {
    }

    static {
        Covode.recordClassIndex(67505);
    }

    /* renamed from: a */
    public static AbstractC88979t<C57562d> m104271a(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        return f131389b.getDetailList(str, i, i2);
    }
}
