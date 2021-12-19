package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.ad */
public final class C86305ad implements AbstractC86306ae {

    /* renamed from: a */
    public final int f192797a;

    /* renamed from: b */
    public final String f192798b;

    /* renamed from: c */
    public final String f192799c;

    /* renamed from: d */
    public final int f192800d;

    /* renamed from: e */
    public final String f192801e;

    /* renamed from: f */
    public final int f192802f;

    /* renamed from: g */
    public final long f192803g;

    static {
        Covode.recordClassIndex(101533);
    }

    @Override // com.p2082ss.ttvideoengine.AbstractC86306ae
    /* renamed from: a */
    public final JSONObject mo137123a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f192798b);
            jSONObject.put("language_id", this.f192797a);
            jSONObject.put("format", this.f192799c);
            jSONObject.put("language", this.f192801e);
            jSONObject.put("id", this.f192802f);
            jSONObject.put("expire", this.f192803g);
            jSONObject.put("sub_id", this.f192800d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C86305ad(JSONObject jSONObject) {
        this.f192798b = jSONObject.optString("url");
        this.f192797a = jSONObject.optInt("language_id");
        this.f192799c = jSONObject.optString("format");
        this.f192801e = jSONObject.optString("language");
        this.f192802f = jSONObject.optInt("id");
        this.f192803g = jSONObject.optLong("expire");
        this.f192800d = jSONObject.optInt("sub_id");
    }
}
