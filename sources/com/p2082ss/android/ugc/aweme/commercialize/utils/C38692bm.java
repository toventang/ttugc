package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bm */
public final class C38692bm {
    static {
        Covode.recordClassIndex(46233);
    }

    /* renamed from: a */
    public static void m78502a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_id", str);
        } catch (JSONException unused) {
        }
        C12290b.m22060a("aweme_screen_ad_open_media_error_rate", 0, jSONObject);
    }
}
