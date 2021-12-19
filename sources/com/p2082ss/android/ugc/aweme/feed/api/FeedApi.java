package com.p2082ss.android.ugc.aweme.feed.api;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import beancopy.ConvertHelp;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22017y;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.account.experiment.service.NonPersonalizationService;
import com.p2082ss.android.ugc.aweme.app.C33856v;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33621d;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.C33620c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.C37992c;
import com.p2082ss.android.ugc.aweme.commercialize.service.C38488a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C46803ct;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C48313ah;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.cache.AbstractC49331j;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.interceptor.AwemeSplashParamsCronetInterceptor;
import com.p2082ss.android.ugc.aweme.net.interceptor.EnsureMainActivityCronetInterceptor;
import com.p2082ss.android.ugc.aweme.net.interceptor.EnsureTTTokenCronetInterceptor;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2404bs.C34934d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import p4519d.p4520a.p4534g.C88066a;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedApi */
public final class FeedApi {

    /* renamed from: a */
    private static final String f111984a = ("pb_convert_flag" + C17867d.m33087h());

    /* renamed from: b */
    private static volatile int f111985b = 0;

    /* renamed from: c */
    private static volatile C48335i f111986c;

    /* renamed from: d */
    private static volatile C48335i f111987d;

    /* renamed from: e */
    private static final Object f111988e = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(57079);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/follow/feed/")
        @AbstractC22017y(mo35806a = 2)
        AbstractFutureC27655q<FeedItemList> fetchFollowFeed(@AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "volume") double d, @AbstractC89736t(mo144292a = "pull_type") int i2, @AbstractC89736t(mo144292a = "req_from") String str2, @AbstractC89736t(mo144292a = "gaid") String str3, @AbstractC89736t(mo144292a = "aweme_ids") String str4, @AbstractC89736t(mo144292a = "push_params") String str5, @AbstractC89736t(mo144292a = "ad_user_agent") String str6, @AbstractC89736t(mo144292a = "filter_warn") int i3, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "address_book_access") Integer num3, @AbstractC89736t(mo144292a = "top_view_cid") String str7, @AbstractC89736t(mo144292a = "top_view_aid") Long l, @AbstractC89736t(mo144292a = "local_cache") String str8, @AbstractC89736t(mo144292a = "interest_list") String str9, @AbstractC21996d Object obj, @AbstractC89736t(mo144292a = "sound_output_device") Integer num4, @AbstractC89736t(mo144292a = "cmpl_enc") String str10, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str11);

        @AbstractC89722f(mo144276a = "/aweme/v1/follow/feed/")
        @AbstractC22017y(mo35806a = 3)
        AbstractFutureC27655q<FeedItemList> fetchFollowFeedImmediate(@AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "volume") double d, @AbstractC89736t(mo144292a = "pull_type") int i2, @AbstractC89736t(mo144292a = "req_from") String str2, @AbstractC89736t(mo144292a = "gaid") String str3, @AbstractC89736t(mo144292a = "aweme_ids") String str4, @AbstractC89736t(mo144292a = "push_params") String str5, @AbstractC89736t(mo144292a = "ad_user_agent") String str6, @AbstractC89736t(mo144292a = "filter_warn") int i3, @AbstractC89736t(mo144292a = "bid_ad_params") String str7, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "address_book_access") Integer num3, @AbstractC89736t(mo144292a = "top_view_cid") String str8, @AbstractC89736t(mo144292a = "top_view_aid") Long l, @AbstractC89736t(mo144292a = "local_cache") String str9, @AbstractC89736t(mo144292a = "interest_list") String str10, @AbstractC21996d Object obj, @AbstractC89736t(mo144292a = "sound_output_device") Integer num4, @AbstractC89736t(mo144292a = "cmpl_enc") String str11, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str12);

        @AbstractC89722f(mo144276a = "/aweme/v1/nearby/feed/")
        AbstractFutureC27655q<FeedItemList> fetchNearbyFeed(@AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "poi_class_code") int i2, @AbstractC89736t(mo144292a = "filter_warn") int i3, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str2, @AbstractC89736t(mo144292a = "video_cover_shrink") String str3);

        @AbstractC89722f(mo144276a = "/aweme/v1/feed/")
        @AbstractC22017y(mo35806a = 2)
        AbstractFutureC27655q<FeedItemList> fetchRecommendFeed(@AbstractC89736t(mo144292a = "sp") int i, @AbstractC89736t(mo144292a = "type") int i2, @AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i3, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "volume") double d, @AbstractC89736t(mo144292a = "pull_type") int i4, @AbstractC89736t(mo144292a = "req_from") String str2, @AbstractC89736t(mo144292a = "gaid") String str3, @AbstractC89736t(mo144292a = "aweme_ids") String str4, @AbstractC89736t(mo144292a = "push_params") String str5, @AbstractC89736t(mo144292a = "ad_user_agent") String str6, @AbstractC89736t(mo144292a = "filter_warn") int i5, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "address_book_access") Integer num3, @AbstractC89736t(mo144292a = "top_view_cid") String str7, @AbstractC89736t(mo144292a = "top_view_aid") Long l, @AbstractC89736t(mo144292a = "local_cache") String str8, @AbstractC89736t(mo144292a = "interest_list") String str9, @AbstractC21996d Object obj, @AbstractC89736t(mo144292a = "cached_item_num") Integer num4, @AbstractC89736t(mo144292a = "last_ad_show_interval") Long l2, @AbstractC89736t(mo144292a = "real_time_actions") String str10, @AbstractC89736t(mo144292a = "vpa_content_choice") Integer num5, @AbstractC89736t(mo144292a = "sound_output_device") Integer num6, @AbstractC89736t(mo144292a = "cmpl_enc") String str11, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str12, @AbstractC89736t(mo144292a = "disable_personalization") boolean z);

        @AbstractC89722f(mo144276a = "/aweme/v1/feed/")
        @AbstractC22017y(mo35806a = 3)
        AbstractFutureC27655q<FeedItemList> fetchRecommendFeedImmediate(@AbstractC89736t(mo144292a = "sp") int i, @AbstractC89736t(mo144292a = "type") int i2, @AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i3, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "volume") double d, @AbstractC89736t(mo144292a = "pull_type") int i4, @AbstractC89736t(mo144292a = "req_from") String str2, @AbstractC89736t(mo144292a = "gaid") String str3, @AbstractC89736t(mo144292a = "aweme_ids") String str4, @AbstractC89736t(mo144292a = "push_params") String str5, @AbstractC89736t(mo144292a = "ad_user_agent") String str6, @AbstractC89736t(mo144292a = "filter_warn") int i5, @AbstractC89736t(mo144292a = "bid_ad_params") String str7, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "address_book_access") Integer num3, @AbstractC89736t(mo144292a = "top_view_cid") String str8, @AbstractC89736t(mo144292a = "top_view_aid") Long l, @AbstractC89736t(mo144292a = "local_cache") String str9, @AbstractC89736t(mo144292a = "preload_aweme_ids") String str10, @AbstractC89736t(mo144292a = "interest_list") String str11, @AbstractC21996d Object obj, @AbstractC89736t(mo144292a = "cached_item_num") Integer num4, @AbstractC89736t(mo144292a = "last_ad_show_interval") Long l2, @AbstractC89736t(mo144292a = "real_time_actions") String str12, @AbstractC89736t(mo144292a = "vpa_content_choice") Integer num5, @AbstractC89736t(mo144292a = "sound_output_device") Integer num6, @AbstractC89736t(mo144292a = "cmpl_enc") String str13, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str14);

        @AbstractC89722f(mo144276a = "/aweme/v2/feed/")
        @AbstractC22017y(mo35806a = 2)
        AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@AbstractC89736t(mo144292a = "sp") int i, @AbstractC89736t(mo144292a = "type") int i2, @AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i3, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "volume") double d, @AbstractC89736t(mo144292a = "pull_type") int i4, @AbstractC89736t(mo144292a = "req_from") String str2, @AbstractC89736t(mo144292a = "aweme_ids") String str3, @AbstractC89736t(mo144292a = "push_params") String str4, @AbstractC89736t(mo144292a = "filter_warn") int i5, @AbstractC89736t(mo144292a = "top_view_cid") String str5, @AbstractC89736t(mo144292a = "top_view_aid") Long l, @AbstractC89736t(mo144292a = "local_cache") String str6, @AbstractC89736t(mo144292a = "interest_list") String str7, @AbstractC21996d Object obj, @AbstractC89736t(mo144292a = "cached_item_num") Integer num2, @AbstractC89736t(mo144292a = "real_time_actions") String str8, @AbstractC89736t(mo144292a = "vpa_content_choice") Integer num3, @AbstractC89736t(mo144292a = "cmpl_enc") String str9, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str10, @AbstractC89736t(mo144292a = "is_audio_mode") String str11, @AbstractC89736t(mo144292a = "disable_personalization") boolean z, @AbstractC89736t(mo144292a = "showtime_gap_req_info") String str12, @AbstractC89736t(mo144292a = "client_cache_request_count") int i6);

        @AbstractC89722f(mo144276a = "/aweme/v2/feed/")
        @AbstractC22017y(mo35806a = 2)
        AbstractFutureC27655q<C33620c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@AbstractC89736t(mo144292a = "sp") int i, @AbstractC89736t(mo144292a = "type") int i2, @AbstractC89736t(mo144292a = "max_cursor") long j, @AbstractC89736t(mo144292a = "min_cursor") long j2, @AbstractC89736t(mo144292a = "count") int i3, @AbstractC89736t(mo144292a = "feed_style") Integer num, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "volume") double d, @AbstractC89736t(mo144292a = "pull_type") int i4, @AbstractC89736t(mo144292a = "req_from") String str2, @AbstractC89736t(mo144292a = "gaid") String str3, @AbstractC89736t(mo144292a = "aweme_ids") String str4, @AbstractC89736t(mo144292a = "push_params") String str5, @AbstractC89736t(mo144292a = "ad_user_agent") String str6, @AbstractC89736t(mo144292a = "filter_warn") int i5, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "address_book_access") Integer num3, @AbstractC89736t(mo144292a = "top_view_cid") String str7, @AbstractC89736t(mo144292a = "top_view_aid") Long l, @AbstractC89736t(mo144292a = "local_cache") String str8, @AbstractC89736t(mo144292a = "interest_list") String str9, @AbstractC21996d Object obj, @AbstractC89736t(mo144292a = "cached_item_num") Integer num4, @AbstractC89736t(mo144292a = "last_ad_show_interval") Long l2, @AbstractC89736t(mo144292a = "real_time_actions") String str10, @AbstractC89736t(mo144292a = "vpa_content_choice") Integer num5, @AbstractC89736t(mo144292a = "sound_output_device") Integer num6, @AbstractC89736t(mo144292a = "cmpl_enc") String str11, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str12, @AbstractC89736t(mo144292a = "is_audio_mode") String str13, @AbstractC89736t(mo144292a = "disable_personalization") boolean z, @AbstractC89736t(mo144292a = "showtime_gap_req_info") String str14, @AbstractC89736t(mo144292a = "client_cache_request_count") int i6, @AbstractC21996d Object obj2, @AbstractC89725i(mo144281a = "Cookie") String str15);

        @AbstractC89722f(mo144276a = "/aweme/v1/roaming/feed/")
        AbstractFutureC27655q<FeedItemList> fetchRoamingFeed(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "roaming_code") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/fresh/feed/")
        AbstractFutureC27655q<FeedTimeLineItemList> fetchTimelineFeed(@AbstractC89736t(mo144292a = "type") int i, @AbstractC89736t(mo144292a = "max_time") long j, @AbstractC89736t(mo144292a = "min_time") long j2, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "aweme_ids") String str2, @AbstractC89736t(mo144292a = "push_params") String str3, @AbstractC89736t(mo144292a = "filter_warn") int i3);
    }

    /* renamed from: c */
    private static C22944d m91776c() {
        C22944d dVar = new C22944d();
        dVar.f35414q = true;
        return dVar;
    }

    static {
        Covode.recordClassIndex(57077);
    }

    /* renamed from: a */
    private static C48335i m91768a() {
        MethodCollector.m26663i(6042);
        if (f111986c == null) {
            synchronized (f111988e) {
                try {
                    if (f111986c == null) {
                        List<AbstractC22021a> a = C48332f.m91792a();
                        if (C46807cw.m90144a()) {
                            a.add(new EnsureMainActivityCronetInterceptor());
                            a.add(new AwemeSplashParamsCronetInterceptor());
                            a.add(new EnsureTTTokenCronetInterceptor());
                        }
                        f111986c = new C48335i((RetrofitApi) C18097a.m33699b(C29736b.f70924e).mo28828a(a).mo28826a((AbstractC33621d) new AbstractC33621d() {
                            /* class com.p2082ss.android.ugc.aweme.feed.api.FeedApi.C483231 */

                            static {
                                Covode.recordClassIndex(57078);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33621d
                            /* renamed from: a */
                            public final void mo59952a(String str) {
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject.put("error_code", 0);
                                    jSONObject.put("error_desc", str);
                                    jSONObject.put(StringSet.type, "error");
                                    jSONObject2.put(StringSet.type, "error");
                                } catch (Exception e) {
                                    C51423a.m95790a((Throwable) e);
                                }
                                C12290b.m22066a("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33621d
                            /* renamed from: a */
                            public final void mo59951a(long j, Object obj, Object obj2, boolean z) {
                                FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
                                if (z) {
                                    if (obj instanceof FeedItemList) {
                                        com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = (FeedItemList) obj;
                                    } else {
                                        return;
                                    }
                                } else if (obj2 instanceof aweme_v2_feed_response) {
                                    com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelp.m5852x2ccced6e((aweme_v2_feed_response) obj2, null);
                                } else {
                                    return;
                                }
                                if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject.put("duration", j);
                                        jSONObject.put("logid", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.logPb.getImprId());
                                        jSONObject.put("content_type", "json");
                                        if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_code != 0 || com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size() == 0) {
                                            if (com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size() == 0) {
                                                jSONObject.put("count", 0);
                                                jSONObject.put(StringSet.type, "server_empty");
                                                jSONObject2.put(StringSet.type, "server_empty");
                                            } else {
                                                jSONObject.put("error_code", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_code);
                                                jSONObject.put("error_desc", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.status_msg);
                                                jSONObject.put(StringSet.type, "error");
                                                jSONObject2.put(StringSet.type, "error");
                                            }
                                            if (C46807cw.m90144a() && C46807cw.f109052d) {
                                                C58945a.C58947b.f134185a.mo96425a("feed_preload_parsing_end", false);
                                                C58945a.C58947b.f134185a.mo96429b("feed_preload_parsing_end", false);
                                            }
                                            C12290b.m22066a("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
                                        }
                                        jSONObject.put("count", com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.getItems().size());
                                        jSONObject.put(StringSet.type, "normal");
                                        jSONObject2.put(StringSet.type, "normal");
                                        C58945a.C58947b.f134185a.mo96425a("feed_preload_parsing_end", false);
                                        C58945a.C58947b.f134185a.mo96429b("feed_preload_parsing_end", false);
                                        C12290b.m22066a("foru_data_parse_monitor", jSONObject2, jSONObject3, jSONObject);
                                    } catch (Exception e) {
                                        C51423a.m95790a((Throwable) e);
                                    }
                                }
                            }
                        }).mo28832d().mo28858a(RetrofitApi.class));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6042);
                    throw th;
                }
            }
        }
        C48335i iVar = f111986c;
        MethodCollector.m26664o(6042);
        return iVar;
    }

    /* renamed from: b */
    private static C48335i m91775b() {
        MethodCollector.m26663i(6044);
        if (f111987d == null) {
            synchronized (f111988e) {
                try {
                    if (f111987d == null) {
                        f111987d = new C48335i((RetrofitApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28828a(C48332f.m91792a()).mo28830b().mo28832d().mo28858a(RetrofitApi.class));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6044);
                    throw th;
                }
            }
        }
        C48335i iVar = f111987d;
        MethodCollector.m26664o(6044);
        return iVar;
    }

    /* renamed from: a */
    private static C48335i m91769a(boolean z) {
        if (z) {
            return m91775b();
        }
        return m91768a();
    }

    /* renamed from: a */
    private static String m91773a(AbstractC49331j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.mo80920a();
    }

    /* renamed from: a */
    private static FeedItemList m91771a(C48341o oVar) {
        FeedItemList feedItemList;
        C46803ct.f109040a = true;
        try {
            feedItemList = m91772a(oVar, true);
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            feedItemList = null;
        }
        if ((feedItemList == null || C88066a.m153139a(feedItemList.getItems())) && (feedItemList = m91772a(oVar, false)) != null) {
            C40780g.m82241a().execute(RunnableC48328b.f112000a);
        }
        return feedItemList;
    }

    /* renamed from: a */
    private static void m91774a(FeedItemList feedItemList) {
        List<Aweme> items;
        if (!(feedItemList == null || (items = feedItemList.getItems()) == null || items.size() <= 1)) {
            FeedItemList feedItemList2 = new FeedItemList();
            feedItemList2.setRequestId(feedItemList.getRequestId());
            ArrayList arrayList = new ArrayList();
            for (int size = items.size() - 1; size >= 0; size--) {
                Aweme aweme = items.get(size);
                if (aweme != null && !TextUtils.isEmpty(aweme.getAid()) && aweme.isClientCache()) {
                    arrayList.add(aweme);
                    items.remove(size);
                    arrayList.size();
                    items.size();
                    aweme.getAid();
                }
            }
            if (arrayList.size() > 0) {
                feedItemList2.items = arrayList;
                C89219l.m154721d(feedItemList2, "");
                C49301e.f113314b = feedItemList2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.p2082ss.android.ugc.aweme.feed.model.FeedItemList m91772a(com.p2082ss.android.ugc.aweme.feed.api.C48341o r51, boolean r52) {
        /*
        // Method dump skipped, instructions count: 459
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.api.FeedApi.m91772a(com.ss.android.ugc.aweme.feed.api.o, boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: a */
    public static FeedItemList m91770a(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, AbstractC49331j jVar, Boolean bool) {
        String str5;
        String str6;
        FeedItemList feedItemList;
        ISplashAdService i5;
        boolean z;
        String str7;
        C48331e.f112004b = AppLog.getServerDeviceId();
        int[] a = C80397em.m139369a(101);
        boolean z2 = true;
        if (a == null) {
            str5 = "";
        } else {
            str5 = a[0] + "_" + a[1];
        }
        int[] a2 = C80397em.m139369a(201);
        if (a2 == null) {
            str6 = "";
        } else {
            str6 = a2[0] + "_" + a2[1];
        }
        if (i == 2) {
            try {
                feedItemList = m91768a().fetchTimelineFeed(i, j, j2, i2, str, str3, str4, C39223a.m79601o().mo68705b()).get();
            } catch (ExecutionException e) {
                throw AbstractC34479a.getCompatibleException(e);
            }
        } else if (i == 7) {
            try {
                feedItemList = m91768a().fetchNearbyFeed(j, j2, i2, num, str, i4, C39223a.m79601o().mo68705b(), str5, str6).get();
            } catch (ExecutionException e2) {
                throw AbstractC34479a.getCompatibleException(e2);
            }
        } else if (i == 12) {
            try {
                feedItemList = m91768a().fetchRoamingFeed(i2, str2).get();
            } catch (ExecutionException e3) {
                throw AbstractC34479a.getCompatibleException(e3);
            }
        } else if (i != 0) {
            try {
                FeedItemList feedItemList2 = m91768a().fetchRecommendFeed(C84116g.m144637f(), i, j, j2, i2, num, str, C58975a.m108341a(2), i3, "", "", str3, str4, "", C39223a.m79601o().mo68705b(), Integer.valueOf(C39223a.m79593g().mo68663b()), Integer.valueOf(C80619d.m139776a()), null, null, null, null, new C22944d(), null, null, null, Integer.valueOf(C39223a.m79591e().mo68728c()), C48313ah.m91745a(C17867d.m33078a()), C39223a.m79590d().mo68621f(), str5, NonPersonalizationService.m65980c().mo57227a()).get();
                if (feedItemList2 != null) {
                    C48027ac.C48028a.f111257a.mo80056a(feedItemList2.getRequestId(), feedItemList2.logPb);
                }
                return feedItemList2;
            } catch (ExecutionException e4) {
                throw AbstractC34479a.getCompatibleException(e4);
            }
        } else {
            try {
                int i6 = f111985b + 1;
                f111985b = i6;
                if (i6 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer valueOf = Integer.valueOf(i);
                Long valueOf2 = Long.valueOf(j);
                Long valueOf3 = Long.valueOf(j2);
                Integer valueOf4 = Integer.valueOf(i2);
                Integer valueOf5 = Integer.valueOf(i3);
                Boolean valueOf6 = Boolean.valueOf(z);
                boolean booleanValue = bool.booleanValue();
                if (i3 == 8) {
                    str7 = null;
                } else {
                    str7 = AdShowTimeGapManager.f89791r.mo66230b();
                }
                C48341o oVar = new C48341o(valueOf, valueOf2, valueOf3, valueOf4, num, str, valueOf5, str3, str4, jVar, valueOf6, booleanValue, str7);
                if (C46803ct.f109040a || !C46803ct.m90142a()) {
                    z2 = false;
                }
                if (z2) {
                    feedItemList = m91771a(oVar);
                } else {
                    feedItemList = m91772a(oVar, false);
                }
                if (i3 == 4 || i3 == 0) {
                    C89219l.m154721d("high", "");
                    long uptimeMillis = SystemClock.uptimeMillis() - C34934d.f82420a;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("first_feed_duration", uptimeMillis);
                        jSONObject.put("is_ab_test", "high");
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                    C34611o.m70671b("first_feed_duration", "", jSONObject);
                }
                C46803ct.m90142a();
                System.currentTimeMillis();
                try {
                    List<Aweme> items = feedItemList.getItems();
                    String requestId = feedItemList.getRequestId();
                    if (C49710k.m93129e()) {
                        if (C13603b.m24435a((Collection) items)) {
                            C49710k.m93122a("Aweme_Items_is_null", requestId);
                        } else {
                            Aweme aweme = items.get(0);
                            if (aweme == null) {
                                C49710k.m93122a("Aweme_is_null", requestId);
                            } else if (aweme.getVideo() == null) {
                                C49710k.m93122a("video_is_null", requestId);
                            } else if (aweme.getVideo().getPlayAddr() == null) {
                                C49710k.m93122a("playAddr_is_null", requestId);
                            } else if (C13603b.m24435a((Collection) aweme.getVideo().getPlayAddr().getUrlList())) {
                                C49710k.m93122a("UrlList_is_null", requestId);
                            } else if (TextUtils.isEmpty(aweme.getVideo().getPlayAddr().getUrlList().get(0))) {
                                C49710k.m93122a("first_video_url_is_null", requestId);
                            }
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                C33856v.C33858a.f80147a.mo60115a(feedItemList);
            } catch (ExecutionException e7) {
                throw AbstractC34479a.getCompatibleException(e7);
            }
        }
        if (feedItemList != null) {
            List<Aweme> list = feedItemList.preloadAds;
            if (!C84892d.m145850a(list) && (i5 = SplashAdServiceImpl.m33397i()) != null) {
                C58221f.m105153e().mo95704a(i5.mo28708a(list)).mo95706a();
            }
        }
        if (feedItemList != null) {
            C48027ac.C48028a.f111257a.mo80056a(feedItemList.getRequestId(), feedItemList.logPb);
        }
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            f.mo59376a().mo59412a(feedItemList.getItems());
        }
        C38488a.f90908a.mo67045a().mo66460a(feedItemList.getItems());
        if (i3 != 8) {
            C37992c cVar = feedItemList.showTimeGapResponse;
            if (!AdShowTimeGapManager.f89788o) {
                AdShowTimeGapManager.f89787n = cVar;
            }
        }
        return feedItemList;
    }
}
