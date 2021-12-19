package com.p2082ss.ttvideoengine.p4430s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.s.a */
public final class C86630a {
    static {
        Covode.recordClassIndex(101858);
    }

    /* renamed from: a */
    public static JSONObject m150043a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("url");
            if (!TextUtils.isEmpty(optString)) {
                String host = new URL(optString).getHost();
                if (!TextUtils.isEmpty(host)) {
                    jSONObject.put("host", host);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
