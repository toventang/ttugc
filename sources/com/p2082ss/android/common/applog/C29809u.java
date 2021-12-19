package com.p2082ss.android.common.applog;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.u */
public final class C29809u {
    static {
        Covode.recordClassIndex(36214);
    }

    /* renamed from: a */
    public static long m60049a(JSONObject jSONObject, String str) {
        try {
            return Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
