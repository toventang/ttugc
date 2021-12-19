package com.bytedance.apm.battery.p762d.p763a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.d.a.a */
public final class C12334a extends AbstractC12335b {

    /* renamed from: a */
    public int f29720a;

    /* renamed from: b */
    public long f29721b;

    /* renamed from: c */
    public String f29722c;

    static {
        Covode.recordClassIndex(14139);
    }

    /* renamed from: a */
    public final JSONObject mo20073a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.f29723d);
            jSONObject.put("end_time", this.f29724e);
            jSONObject.put("thread_name", this.f29725f);
            jSONObject.put("thread_stack", mo20075b());
            jSONObject.put("interval", this.f29721b);
            jSONObject.put(StringSet.type, this.f29720a);
            jSONObject.put("intent_info", this.f29722c);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return "AlarmInfo{type=" + this.f29720a + ", interval=" + this.f29721b + ", intentInfo=" + this.f29722c + ", startTime=" + this.f29723d + ", endTime=" + this.f29724e + ", threadName=" + this.f29725f + ", threadStack=" + mo20075b() + '}';
    }
}
