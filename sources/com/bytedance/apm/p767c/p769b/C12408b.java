package com.bytedance.apm.p767c.p769b;

import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.b */
public final class C12408b implements AbstractC12406b {

    /* renamed from: a */
    public String f29992a;

    /* renamed from: b */
    public JSONObject f29993b;

    /* renamed from: c */
    public boolean f29994c;

    static {
        Covode.recordClassIndex(14215);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return "common_log";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return true;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return this.f29992a;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        JSONObject jSONObject = this.f29993b;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("log_type", this.f29992a);
        } catch (JSONException unused) {
        }
        return this.f29993b;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        return C12556c.m22585a(this.f29992a);
    }

    public C12408b(String str, JSONObject jSONObject, boolean z) {
        this.f29992a = str;
        this.f29993b = jSONObject;
        this.f29994c = z;
    }
}
