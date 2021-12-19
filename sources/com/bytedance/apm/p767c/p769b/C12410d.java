package com.bytedance.apm.p767c.p769b;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b.d */
public final class C12410d implements AbstractC12406b {

    /* renamed from: a */
    public JSONObject f30002a;

    /* renamed from: b */
    public boolean f30003b;

    /* renamed from: c */
    public long f30004c;

    /* renamed from: d */
    public boolean f30005d;

    /* renamed from: e */
    private String f30006e;

    static {
        Covode.recordClassIndex(14217);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return true;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return this.f30006e;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return this.f30006e;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        JSONObject jSONObject = this.f30002a;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("timestamp", this.f30004c);
            this.f30002a.put("crash_time", this.f30004c);
            this.f30002a.put("is_main_process", C12397c.m22285b());
            this.f30002a.put("process_name", C12397c.m22278a());
            this.f30002a.put("log_type", this.f30006e);
            if (C12397c.f29941k > C12397c.m22287d() || C12397c.f29941k == 0) {
                this.f30002a.put("app_launch_start_time", C12397c.m22287d());
            } else {
                this.f30002a.put("app_launch_start_time", C12397c.f29941k);
            }
        } catch (JSONException unused) {
        }
        return this.f30002a;
    }

    public final String toString() {
        return "ExceptionLogData{eventType='" + this.f30006e + '\'' + ", logJson=" + this.f30002a + ", forceSampled=" + this.f30003b + ", time=" + this.f30004c + '}';
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        if (this.f30003b || C12556c.m22590e(this.f30006e)) {
            return true;
        }
        return false;
    }

    public C12410d(String str, JSONObject jSONObject) {
        this(str, jSONObject, System.currentTimeMillis());
    }

    public C12410d(String str, JSONObject jSONObject, long j) {
        this.f30006e = str;
        this.f30002a = jSONObject;
        this.f30004c = j;
    }
}
