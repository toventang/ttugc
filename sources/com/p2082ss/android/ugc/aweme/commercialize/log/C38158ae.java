package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ae */
public final class C38158ae {

    /* renamed from: a */
    public static final C38158ae f90131a = new C38158ae();

    private C38158ae() {
    }

    static {
        Covode.recordClassIndex(45637);
    }

    /* renamed from: a */
    public static final long m77358a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(aweme, "");
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return C38000g.m77050a().mo65872a(awemeRawAd);
        }
        return 0;
    }

    /* renamed from: a */
    public static final JSONObject m77359a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            C38000g.m77050a().mo65873a(context, jSONObject, str);
        } catch (JSONException e) {
            C51423a.m95786a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final JSONObject m77360a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("ad_extra_data");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put("poll_click_area", str);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException e) {
            C51423a.m95786a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final void m77361a(Context context, String str, String str2, JSONObject jSONObject, String str3, String str4, long j) {
        String str5 = str;
        if (TextUtils.equals(str3, "challenge") || TextUtils.equals(str3, "challenge_fresh")) {
            if (TextUtils.equals(str5, "background_ad")) {
                str5 = "background_ads";
            } else {
                str5 = "topic_ads";
            }
        }
        C38000g.m77050a().mo65883a(context, str5, str2, jSONObject, str4, j);
    }
}
