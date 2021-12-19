package com.p2082ss.android.ugc.aweme.trending;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.search.C67647m;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.trending.TrendingDetailApi */
public interface TrendingDetailApi {

    /* renamed from: a */
    public static final C79039a f177660a = C79039a.f177662b;

    static {
        Covode.recordClassIndex(92215);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/trending/search/inflow/")
    AbstractC88979t<C67647m> getTrendingDetailDataSearch(@AbstractC22018z(mo35807a = "event_id") String str, @AbstractC22018z(mo35807a = "offset") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "item_id") String str2, @AbstractC22018z(mo35807a = "billboard_type") int i3, @AbstractC22018z(mo35807a = "event_list") String str3);

    @AbstractC22000h(mo35789a = "tiktok/trends/inflow/video/v1/")
    AbstractC88979t<C67647m> getTrendingDetailFYP(@AbstractC22018z(mo35807a = "event_id") String str, @AbstractC22018z(mo35807a = "offset") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "item_id") String str2, @AbstractC22018z(mo35807a = "billboard_type") int i3, @AbstractC22018z(mo35807a = "event_list") String str3);

    /* renamed from: com.ss.android.ugc.aweme.trending.TrendingDetailApi$a */
    public static final class C79039a {

        /* renamed from: a */
        public static final TrendingDetailApi f177661a = ((TrendingDetailApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(TrendingDetailApi.class));

        /* renamed from: b */
        static final /* synthetic */ C79039a f177662b = new C79039a();

        private C79039a() {
        }

        static {
            Covode.recordClassIndex(92216);
        }
    }
}
