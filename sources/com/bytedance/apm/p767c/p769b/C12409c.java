package com.bytedance.apm.p767c.p769b;

import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.c */
public final class C12409c implements AbstractC12406b {

    /* renamed from: a */
    public String f29995a;

    /* renamed from: b */
    public int f29996b;

    /* renamed from: c */
    public JSONObject f29997c;

    /* renamed from: d */
    public JSONObject f29998d;

    /* renamed from: e */
    public JSONObject f29999e;

    /* renamed from: f */
    public JSONObject f30000f;

    /* renamed from: g */
    public boolean f30001g;

    static {
        Covode.recordClassIndex(14216);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return true;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        if (this.f30000f == null) {
            this.f30000f = new JSONObject();
        }
        try {
            this.f30000f.put("log_type", "service_monitor");
            this.f30000f.put("service", this.f29995a);
            this.f30000f.put("status", this.f29996b);
            JSONObject jSONObject = this.f29997c;
            if (jSONObject != null) {
                this.f30000f.put("value", jSONObject);
            }
            JSONObject jSONObject2 = this.f29998d;
            if (jSONObject2 != null) {
                this.f30000f.put("category", jSONObject2);
            }
            JSONObject jSONObject3 = this.f29999e;
            if (jSONObject3 != null) {
                this.f30000f.put("metric", jSONObject3);
            }
            return this.f30000f;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        return C12556c.m22587b(this.f29995a);
    }

    public C12409c(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f29995a = str;
        this.f29996b = i;
        this.f29997c = jSONObject;
        this.f29998d = jSONObject2;
        this.f29999e = jSONObject3;
        this.f30000f = jSONObject4;
    }

    public C12409c(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z) {
        this.f29995a = str;
        this.f29996b = i;
        this.f29997c = null;
        this.f29998d = jSONObject;
        this.f29999e = jSONObject2;
        this.f30000f = jSONObject3;
        this.f30001g = z;
    }
}
