package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.account.experiment.service.NonPersonalizationService;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.C33620c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.api.FeedApi;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.ugc.aweme.proto.aweme_v2_feed_response;

/* renamed from: com.ss.android.ugc.aweme.feed.api.i */
public final class C48335i implements FeedApi.RetrofitApi {

    /* renamed from: a */
    private final FeedApi.RetrofitApi f112007a;

    static {
        Covode.recordClassIndex(57107);
    }

    /* renamed from: a */
    private static void m91800a() {
        if (C58945a.C58947b.f134185a.f134176c) {
            C58945a.C58947b.f134185a.mo96429b("feed_compose_params", false);
            C58945a.C58947b.f134185a.mo96424a("feed_api_to_net_api", System.currentTimeMillis(), false);
        }
    }

    /* renamed from: b */
    private static void m91801b() {
        if (C58945a.C58947b.f134185a.f134176c) {
            C58945a.C58947b.f134185a.mo96429b("feed_net_api_to_feed_api", false);
            C58945a.C58947b.f134185a.mo96425a("feed_api_to_ui_response", false);
        }
    }

    C48335i(FeedApi.RetrofitApi retrofitApi) {
        if (retrofitApi != null) {
            this.f112007a = retrofitApi;
            return;
        }
        throw new IllegalArgumentException("retrofitApi should not be null");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedItemList> fetchRoamingFeed(int i, String str) {
        return this.f112007a.fetchRoamingFeed(i, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedTimeLineItemList> fetchTimelineFeed(int i, long j, long j2, int i2, String str, String str2, String str3, int i3) {
        return this.f112007a.fetchTimelineFeed(i, j, j2, i2, str, str2, str3, i3);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedItemList> fetchNearbyFeed(long j, long j2, int i, Integer num, String str, int i2, int i3, String str2, String str3) {
        return this.f112007a.fetchNearbyFeed(j, j2, i, num, str, i2, i3, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedItemList> fetchFollowFeed(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, String str10, String str11) {
        m91800a();
        AbstractFutureC27655q<FeedItemList> fetchFollowFeed = this.f112007a.fetchFollowFeed(j, j2, i, num, str, d, i2, str2, str3, str4, str5, str6, i3, num2, num3, str7, l, str8, str9, obj, num4, str10, str11);
        m91801b();
        return fetchFollowFeed;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedItemList> fetchFollowFeedImmediate(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, Integer num2, Integer num3, String str8, Long l, String str9, String str10, Object obj, Integer num4, String str11, String str12) {
        m91800a();
        AbstractFutureC27655q<FeedItemList> fetchFollowFeedImmediate = this.f112007a.fetchFollowFeedImmediate(j, j2, i, num, str, d, i2, str2, str3, str4, str5, str6, i3, str7, num2, num3, str8, l, str9, str10, obj, num4, str11, str12);
        m91801b();
        return fetchFollowFeedImmediate;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, int i5, String str5, Long l, String str6, String str7, Object obj, Integer num2, String str8, Integer num3, String str9, String str10, String str11, boolean z, String str12, int i6) {
        m91800a();
        AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2 = this.f112007a.fetchRecommendFeedV2(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, i5, str5, l, str6, str7, obj, num2, str8, num3, str9, str10, str11, z, str12, i6);
        m91801b();
        return fetchRecommendFeedV2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedItemList> fetchRecommendFeed(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, String str5, String str6, int i5, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, Long l2, String str10, Integer num5, Integer num6, String str11, String str12, boolean z) {
        m91800a();
        AbstractFutureC27655q<FeedItemList> fetchRecommendFeed = this.f112007a.fetchRecommendFeed(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, str5, str6, i5, num2, num3, str7, l, str8, str9, obj, num4, l2, str10, num5, num6, str11, str12, z);
        m91801b();
        return fetchRecommendFeed;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<FeedItemList> fetchRecommendFeedImmediate(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, String str5, String str6, int i5, String str7, Integer num2, Integer num3, String str8, Long l, String str9, String str10, String str11, Object obj, Integer num4, Long l2, String str12, Integer num5, Integer num6, String str13, String str14) {
        m91800a();
        AbstractFutureC27655q<FeedItemList> fetchRecommendFeedImmediate = this.f112007a.fetchRecommendFeedImmediate(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, str5, str6, i5, str7, num2, num3, str8, l, str9, str10, str11, obj, num4, l2, str12, num5, num6, str13, str14);
        m91801b();
        return fetchRecommendFeedImmediate;
    }

    /* renamed from: a */
    public final AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> mo80460a(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, Long l2, String str10, Integer num5, Integer num6, String str11, String str12, String str13, String str14, int i5, Object obj2, String str15) {
        return fetchRecommendFeedV2(C84116g.m144637f(), i, j, j2, i2, num, str, d, i3, str2, str3, str4, str5, str6, i4, num2, num3, str7, l, str8, str9, obj, num4, l2, str10, num5, num6, str11, str12, str13, NonPersonalizationService.m65980c().mo57227a(), str14, i5, obj2, str15);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.api.FeedApi.RetrofitApi
    public final AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(int i, int i2, long j, long j2, int i3, Integer num, String str, double d, int i4, String str2, String str3, String str4, String str5, String str6, int i5, Integer num2, Integer num3, String str7, Long l, String str8, String str9, Object obj, Integer num4, Long l2, String str10, Integer num5, Integer num6, String str11, String str12, String str13, boolean z, String str14, int i6, Object obj2, String str15) {
        AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2;
        m91800a();
        if (!C39223a.m79597k().mo68722f()) {
            fetchRecommendFeedV2 = fetchRecommendFeedV2(i, i2, j, j2, i3, num, str, d, i4, str2, str4, str5, i5, str7, l, str8, str9, obj, num4, str10, num5, str11, str12, str13, z, str14, i6);
        } else {
            fetchRecommendFeedV2 = this.f112007a.fetchRecommendFeedV2(i, i2, j, j2, i3, num, str, d, i4, str2, str3, str4, str5, str6, i5, num2, num3, str7, l, str8, str9, obj, num4, l2, str10, num5, num6, str11, str12, str13, z, str14, i6, obj2, str15);
        }
        m91801b();
        return fetchRecommendFeedV2;
    }
}
