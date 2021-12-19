package com.p2082ss.android.p2092ad.splash.core.p2100e;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.i */
public final class C29465i {

    /* renamed from: a */
    public String f70089a;

    /* renamed from: b */
    public int f70090b;

    /* renamed from: c */
    public long f70091c;

    static {
        Covode.recordClassIndex(35859);
    }

    /* renamed from: a */
    static C29465i m59053a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("promotion_icon")) == null) {
            return null;
        }
        return new C29465i(optJSONObject.optString("promotion_icon_url"), optJSONObject.optInt("promotion_style", 0), optJSONObject.optLong("promotion_show_time", -1));
    }

    private C29465i(String str, int i, long j) {
        this.f70089a = str;
        this.f70090b = i;
        this.f70091c = j;
    }
}
