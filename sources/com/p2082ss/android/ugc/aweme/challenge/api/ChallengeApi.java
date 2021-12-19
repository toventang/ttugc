package com.p2082ss.android.ugc.aweme.challenge.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeCreateResponse;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p2082ss.android.ugc.aweme.challenge.model.LiveChallengeRecommendResponse;
import com.p2082ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p2082ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.HashMap;
import java.util.Map;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;
import p4640l.p4644b.AbstractC89737u;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeApi */
public final class ChallengeApi {

    /* renamed from: a */
    public static final String f83696a;

    /* renamed from: b */
    public static final String f83697b = (Api.f79771d + "/aweme/v1/challenge/aweme/");

    /* renamed from: c */
    public static final String f83698c = (Api.f79771d + "/aweme/v1/challenge/fresh/aweme/");

    /* renamed from: d */
    public static final String f83699d = (Api.f79771d + "/aweme/v1/commerce/challenge/detail/");

    /* renamed from: e */
    public static final String f83700e = (Api.f79771d + "/aweme/v1/commerce/challenge/aweme/");

    /* renamed from: f */
    public static final String f83701f = (Api.f79771d + "/aweme/v1/commerce/challenge/fresh/aweme/");

    /* renamed from: g */
    public static final RealApi f83702g;

    /* renamed from: h */
    private static final String f83703h = (Api.f79771d + "/aweme/v1/commit/challenge/");

    /* renamed from: i */
    private static final String f83704i = (Api.f79771d + "/aweme/v1/challenge/detail/");

    /* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(42678);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/create/")
        AbstractFutureC27655q<ChallengeCreateResponse> createChallenge(@AbstractC89736t(mo144292a = "source_type") int i, @AbstractC89736t(mo144292a = "challenge_name") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/detail/")
        C1731i<ChallengeDetail> fetchChallengeDetail(@AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "hashtag_name") String str2, @AbstractC89736t(mo144292a = "query_type") int i, @AbstractC89736t(mo144292a = "click_reason") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/challenge/detail/")
        C1731i<ChallengeDetail> fetchCommerceChallengeDetail(@AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "hashtag_name") String str2, @AbstractC89736t(mo144292a = "query_type") int i, @AbstractC89736t(mo144292a = "click_reason") int i2);

        @AbstractC89722f
        AbstractFutureC27655q<ChallengeAwemeList> getChallengeAwemeList(@AbstractC89740x String str, @AbstractC89737u Map<String, String> map);

        @AbstractC89722f
        AbstractFutureC27655q<ChallengeDetail> getChallengeDetail(@AbstractC89740x String str, @AbstractC89737u Map<String, String> map);

        @AbstractC89722f(mo144276a = "/aweme/v1/recommend/challenge/")
        AbstractFutureC27655q<ChallengeList> getChallengeList(@AbstractC89737u Map<String, String> map);

        @AbstractC89722f(mo144276a = "/aweme/v1/live/challenge/recommend/")
        AbstractFutureC27655q<LiveChallengeRecommendResponse> getRecommendLiveChallenge(@AbstractC89736t(mo144292a = "room_id") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/aweme/single/")
        C1731i<Object> loadChallengeMixFeedList(@AbstractC89736t(mo144292a = "pull_type") int i, @AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "hashtag_name") String str2, @AbstractC89736t(mo144292a = "query_type") int i3);

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/fresh/aweme/single/")
        C1731i<Object> loadFreshChallengeMixFeedList(@AbstractC89736t(mo144292a = "pull_type") int i, @AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "hashtag_name") String str2, @AbstractC89736t(mo144292a = "query_type") int i3);

        @AbstractC89731o(mo144285a = "/aweme/v1/challenge/search/")
        @AbstractC89721e
        AbstractFutureC27655q<SearchChallengeList> searchChallenge(@AbstractC89720d Map<String, String> map);

        @AbstractC89722f(mo144276a = "/aweme/v1/search/challengesug/")
        AbstractFutureC27655q<SearchSugChallengeList> searchSugChallenge(@AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "source") String str2);
    }

    static {
        Covode.recordClassIndex(42677);
        String str = Api.f79771d;
        f83696a = str;
        f83702g = (RealApi) RetrofitFactory.m33635a().mo28816a(str).mo28858a(RealApi.class);
    }

    /* renamed from: a */
    public static C1731i<ChallengeDetail> m72575a(String str, String str2) {
        return f83702g.fetchCommerceChallengeDetail(str, str2, 0, 0);
    }

    /* renamed from: a */
    public static ChallengeDetail m72576a(String str, int i, boolean z, String str2) {
        String str3;
        if (!CommerceChallengeServiceImpl.m75741e().mo65393b(str) || C80580in.m139687c()) {
            str3 = f83704i;
        } else {
            str3 = f83699d;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("click_reason", String.valueOf(i));
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("preview_token", str2);
        }
        return f83702g.getChallengeDetail(str3, hashMap).get();
    }
}
