package com.p2082ss.android.ugc.aweme.kids.recommendfeed.fetchlist;

import beancopy.ConvertHelp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22017y;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;
import tiktok.kids.proto.tiktok_v1_kids_feed_response;

/* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist.FeedApi */
public final class FeedApi {

    /* renamed from: a */
    public static final FeedApi f131818a = new FeedApi();

    /* renamed from: b */
    private static final RetrofitApi f131819b = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a(C57345a.f130717a).mo28858a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist.FeedApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(67783);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/kids/feed/")
        @AbstractC22017y(mo35806a = 2)
        AbstractC88979t<tiktok_v1_kids_feed_response> fetchRecommendFeed(@AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "pull_type") int i2, @AbstractC22018z(mo35807a = "volume") double d, @AbstractC22018z(mo35807a = "cached_item_num") Integer num);
    }

    private FeedApi() {
    }

    static {
        Covode.recordClassIndex(67782);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist.FeedApi$a */
    public static final class C57790a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C57790a f131820a = new C57790a();

        static {
            Covode.recordClassIndex(67784);
        }

        C57790a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            return m104500a((tiktok_v1_kids_feed_response) obj);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList, java.lang.String] */
        /* renamed from: a */
        private static KFeedItemList m104500a(tiktok_v1_kids_feed_response tiktok_v1_kids_feed_response) {
            th = 0;
            try {
                KFeedItemList tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList = ConvertHelp.m5866xaed84a0c(tiktok_v1_kids_feed_response, th);
                if (tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList != null) {
                    return tiktok$kids$proto$tiktok_v1_kids_feed_response$$com$ss$android$ugc$aweme$kids$recommendfeed$model$KFeedItemList;
                }
                String str = "Pb2Model: model is null";
                throw new C57791a(str, th);
            } finally {
                C57791a aVar = new C57791a(th, th);
            }
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<KFeedItemList> m104499a(int i) {
        if (C58945a.C58947b.f134185a.f134176c) {
            C58945a.C58947b.f134185a.mo96429b("feed_request_to_feed_api", false);
            C58945a.C58947b.f134185a.mo96425a("feed_compose_params", false);
        }
        if (C58945a.C58947b.f134185a.f134176c) {
            C58945a.C58947b.f134185a.mo96429b("feed_compose_params", false);
            C58945a.C58947b.f134185a.mo96424a("feed_api_to_net_api", System.currentTimeMillis(), false);
        }
        AbstractC88979t<R> d = f131819b.fetchRecommendFeed(8, i, C58975a.m108341a(2), 0).mo143292d(C57790a.f131820a);
        if (C58945a.C58947b.f134185a.f134176c) {
            C58945a.C58947b.f134185a.mo96429b("feed_net_api_to_feed_api", false);
            C58945a.C58947b.f134185a.mo96425a("feed_api_to_ui_response", false);
        }
        C89219l.m154716b(d, "");
        return d;
    }
}
