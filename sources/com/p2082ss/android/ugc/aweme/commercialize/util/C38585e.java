package com.p2082ss.android.ugc.aweme.commercialize.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.e */
public final class C38585e {
    static {
        Covode.recordClassIndex(46117);
    }

    /* renamed from: a */
    private static long m78290a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    private static String m78293b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: a */
    public static void m78291a(String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        JSONObject jSONObject2;
        String str3 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            if (TextUtils.equals(str3, "background_ad")) {
                str3 = "background_ads";
            } else {
                str3 = "topic_ads";
            }
        }
        if (TextUtils.equals("click", str2)) {
            C38594h.m78309a(awemeRawAd);
        }
        if (C37699a.m76282b(awemeRawAd)) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = new JSONObject(optString);
                }
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m78292a(str3, str2, jSONObject, m78293b(awemeRawAd), m78290a(awemeRawAd));
    }

    /* renamed from: a */
    private static void m78292a(String str, String str2, JSONObject jSONObject, String str3, long j) {
        C38187i.m77455a(str, str2, jSONObject, str3, j);
    }
}
