package com.p2082ss.android.ugc.aweme.kids.liked.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.api.FavoriteApi */
public interface FavoriteApi {

    /* renamed from: a */
    public static final C57733a f131722a = C57733a.f131723a;

    static {
        Covode.recordClassIndex(67710);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/kids/aweme/favorite/")
    AbstractC88979t<KidFeedItemList> getFavoriteList(@AbstractC22018z(mo35807a = "max_cursor") long j, @AbstractC22018z(mo35807a = "min_cursor") long j2, @AbstractC22018z(mo35807a = "count") int i);

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.api.FavoriteApi$a */
    public static final class C57733a {

        /* renamed from: a */
        static final /* synthetic */ C57733a f131723a = new C57733a();

        private C57733a() {
        }

        static {
            Covode.recordClassIndex(67711);
        }

        /* renamed from: a */
        public static FavoriteApi m104449a() {
            Object a = RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(FavoriteApi.class);
            C89219l.m154716b(a, "");
            return (FavoriteApi) a;
        }
    }
}
