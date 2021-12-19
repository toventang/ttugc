package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.HashMap;
import java.util.Map;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89737u;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.metrics.ChallengeUtilApi */
public final class ChallengeUtilApi {

    /* renamed from: a */
    public static final String f134740a;

    /* renamed from: b */
    private static final String f134741b = (Api.f79771d + "/aweme/v1/challenge/detail/");

    /* renamed from: c */
    private static final String f134742c = (Api.f79771d + "/aweme/v1/commerce/challenge/detail/");

    /* renamed from: d */
    private static final RealApi f134743d;

    /* renamed from: com.ss.android.ugc.aweme.metrics.ChallengeUtilApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(69565);
        }

        @AbstractC89722f
        AbstractFutureC27655q<ChallengeDetail> getChallengeDetail(@AbstractC89740x String str, @AbstractC89737u Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(69564);
        String str = Api.f79771d;
        f134740a = str;
        f134743d = (RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(RealApi.class);
    }

    /* renamed from: a */
    public static String m108746a(String str) {
        if (CommerceChallengeServiceImpl.m75741e().mo65393b(str)) {
            C80580in.m139687c();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ch_id", str);
        hashMap.put("query_type", "0");
        hashMap.put("click_reason", "0");
        return null;
    }
}
