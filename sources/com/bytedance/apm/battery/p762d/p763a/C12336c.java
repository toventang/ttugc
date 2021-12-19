package com.bytedance.apm.battery.p762d.p763a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.d.a.c */
public final class C12336c extends AbstractC12335b {

    /* renamed from: a */
    public int f29727a;

    /* renamed from: b */
    public String f29728b;

    static {
        Covode.recordClassIndex(14141);
    }

    /* renamed from: a */
    public final JSONObject mo20076a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flags", this.f29727a);
            jSONObject.put("tag", this.f29728b);
            jSONObject.put("start_time", this.f29723d);
            jSONObject.put("end_time", this.f29724e);
            jSONObject.put("thread_name", this.f29725f);
            jSONObject.put("thread_stack", mo20075b());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String toString() {
        return "WakeLockInfo{flags=" + this.f29727a + ", tag=" + this.f29728b + ", startTime=" + this.f29723d + ", endTime=" + this.f29724e + ", threadName=" + this.f29725f + ", threadStack=" + mo20075b() + '}';
    }
}
