package com.bytedance.apm.p767c.p769b;

import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.g */
public final class C12413g implements AbstractC12406b {

    /* renamed from: a */
    public String f30017a;

    /* renamed from: b */
    public String f30018b;

    /* renamed from: c */
    public JSONObject f30019c;

    /* renamed from: d */
    public JSONObject f30020d = null;

    static {
        Covode.recordClassIndex(14220);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return true;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        try {
            if (this.f30020d == null) {
                this.f30020d = new JSONObject();
            }
            this.f30020d.put("log_type", "ui_action");
            this.f30020d.put("action", this.f30017a);
            this.f30020d.put("page", this.f30018b);
            this.f30020d.put("context", this.f30019c);
            return this.f30020d;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        return C12556c.m22589d("ui");
    }

    public C12413g(String str, String str2, JSONObject jSONObject) {
        this.f30017a = str;
        this.f30018b = str2;
        this.f30019c = jSONObject;
    }
}
