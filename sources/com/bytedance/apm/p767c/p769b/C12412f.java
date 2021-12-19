package com.bytedance.apm.p767c.p769b;

import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.apm.p789q.C12584g;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.f */
public final class C12412f implements AbstractC12406b {

    /* renamed from: a */
    public String f30010a;

    /* renamed from: b */
    public String f30011b;

    /* renamed from: c */
    public boolean f30012c;

    /* renamed from: d */
    public JSONObject f30013d;

    /* renamed from: e */
    public JSONObject f30014e;

    /* renamed from: f */
    public JSONObject f30015f;

    /* renamed from: g */
    public JSONObject f30016g;

    static {
        Covode.recordClassIndex(14219);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return "performance_monitor";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return true;
    }

    public C12412f() {
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return this.f30010a;
    }

    /* renamed from: e */
    public final boolean mo20194e() {
        return TextUtils.equals(this.f30010a, "memory");
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        try {
            if (this.f30016g == null) {
                this.f30016g = new JSONObject();
            }
            this.f30016g.put("log_type", "performance_monitor");
            this.f30016g.put("service", this.f30010a);
            if (!C12584g.m22676b(this.f30013d)) {
                this.f30016g.put("extra_values", this.f30013d);
            }
            if (TextUtils.equals("start", this.f30010a) && TextUtils.equals("from", this.f30016g.optString("monitor-plugin"))) {
                if (this.f30014e == null) {
                    this.f30014e = new JSONObject();
                }
                this.f30014e.put("start_mode", C12397c.f29939i);
            }
            if (!C12584g.m22676b(this.f30014e)) {
                this.f30016g.put("extra_status", this.f30014e);
            }
            if (!C12584g.m22676b(this.f30015f)) {
                this.f30016g.put("filters", this.f30015f);
            }
            return this.f30016g;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject;
        if ("fps".equals(this.f30010a) || "fps_drop".equals(this.f30010a)) {
            z = C12556c.m22586a(this.f30010a, this.f30011b);
        } else if ("temperature".equals(this.f30010a)) {
            z = C12556c.m22590e(this.f30010a);
        } else {
            if (!"battery".equals(this.f30010a)) {
                if ("start".equals(this.f30010a)) {
                    if (!C12556c.m22589d(this.f30010a) && !C12556c.m22588c(this.f30011b)) {
                        z = false;
                    }
                } else if ("start_trace".equals(this.f30010a)) {
                    if (jSONObject != null) {
                        if (!C12556c.m22590e("enable_perf_data_collect")) {
                            jSONObject.remove("perf_data");
                        }
                        if (!C12556c.m22589d(this.f30010a) && (optJSONObject = jSONObject.optJSONObject("trace")) != null) {
                            optJSONObject.remove("spans");
                        }
                    }
                    z = C12556c.m22589d(this.f30010a);
                } else {
                    z = C12556c.m22589d(this.f30010a);
                }
            }
            z = true;
        }
        if (this.f30012c || z) {
            return true;
        }
        return false;
    }

    public C12412f(String str, JSONObject jSONObject) {
        this(str, "", null, null, jSONObject);
    }

    public C12412f(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f30010a = str;
        this.f30011b = str2;
        this.f30012c = false;
        this.f30013d = jSONObject;
        this.f30014e = jSONObject2;
        this.f30016g = jSONObject3;
    }

    public C12412f(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, byte b) {
        this(str, str2, jSONObject, jSONObject2, jSONObject3);
    }
}
