package com.bytedance.p802b.p831i.p832a.p833a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p830h.AbstractC13094b;
import com.bytedance.p802b.p841k.C13129e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.i.a.a.a */
public abstract class AbstractC13097a implements AbstractC13094b {

    /* renamed from: a */
    private JSONObject f31930a;

    /* renamed from: o */
    protected final String f31931o = "log_type";

    /* renamed from: p */
    protected final String f31932p = "extra_status";

    /* renamed from: q */
    protected final String f31933q = "extra_values";

    /* renamed from: r */
    protected final String f31934r = "filters";

    /* renamed from: s */
    protected final String f31935s = "service";

    /* renamed from: t */
    protected final String f31936t = "scene";

    static {
        Covode.recordClassIndex(14933);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: a */
    public final String mo20770a() {
        return "performance_monitor";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo20846d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract JSONObject mo20847e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract JSONObject mo20848f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract JSONObject mo20849g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public JSONObject mo20889h() {
        return new JSONObject();
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: c */
    public final JSONObject mo20772c() {
        try {
            if (this.f31930a == null) {
                this.f31930a = mo20889h();
            }
            this.f31930a.put("log_type", "performance_monitor");
            this.f31930a.put("service", mo20846d());
            JSONObject e = mo20847e();
            if (!C13129e.m23602a(e)) {
                this.f31930a.put("extra_values", e);
            }
            JSONObject f = mo20848f();
            if (!C13129e.m23602a(f)) {
                this.f31930a.put("extra_status", f);
            }
            JSONObject g = mo20849g();
            if (!C13129e.m23602a(g)) {
                this.f31930a.put("filters", g);
            }
            return this.f31930a;
        } catch (JSONException unused) {
            return null;
        }
    }
}
