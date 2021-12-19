package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.a */
public final class C38150a {
    static {
        Covode.recordClassIndex(45629);
    }

    /* renamed from: a */
    public static void m77331a(Aweme aweme, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_id", aweme.getAid());
            jSONObject.put("error_type", String.valueOf(i));
            jSONObject.put("ad_id", aweme.getAwemeRawAd().getAdId());
            jSONObject.put("status", String.valueOf(i2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C12290b.m22060a("aweme_adx_video_error_log", i2, jSONObject);
    }
}
