package com.bytedance.p802b.p813c.p816c.p817a;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p779k.C12545i;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p813c.p816c.C13023i;
import com.bytedance.p802b.p830h.AbstractC13094b;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.c.c.a.b */
public final class C13005b implements AbstractC13094b {

    /* renamed from: a */
    private double f31683a;

    /* renamed from: b */
    private double f31684b;

    /* renamed from: c */
    private String f31685c;

    /* renamed from: d */
    private boolean f31686d;

    /* renamed from: e */
    private List<C13023i> f31687e;

    static {
        Covode.recordClassIndex(14841);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: a */
    public final String mo20770a() {
        return "cpu_exception_trace";
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        List<C13023i> list = this.f31687e;
        if (list == null || list.isEmpty() || this.f31683a <= 0.0d || this.f31684b <= 0.0d) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: c */
    public final JSONObject mo20772c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", "cpu_exception_trace");
            jSONObject.put("log_type", "cpu_exception_trace");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_time", System.currentTimeMillis());
            jSONObject.put("is_main_process", C12397c.m22285b());
            jSONObject.put("process_name", C12397c.m22278a());
            if (this.f31686d) {
                jSONObject.put("data_type", "back");
            } else {
                jSONObject.put("data_type", "front");
            }
            jSONObject.put("scene", this.f31685c);
            jSONObject.put("report_scene", this.f31685c);
            if (C12397c.f29941k > C12397c.m22287d() || C12397c.f29941k == 0) {
                jSONObject.put("app_launch_start_time", C12397c.m22287d());
            } else {
                jSONObject.put("app_launch_start_time", C12397c.f29941k);
            }
            jSONObject.put("process_speed_avg", this.f31683a);
            jSONObject.put("process_speed_max", this.f31684b);
            jSONObject.put("battery_temperature", (double) C12545i.C12547a.f30513a.f30507a);
            jSONObject.put("battery_recharge_state", C12545i.C12547a.f30513a.f30508b);
            JSONArray jSONArray = new JSONArray();
            for (C13023i iVar : this.f31687e) {
                if (iVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nice", iVar.f31737h);
                    jSONObject2.put("weight", Double.valueOf(iVar.f31734e));
                    jSONObject2.put("cpu_usage", iVar.f31733d);
                    jSONObject2.put("thread_name", iVar.f31731b);
                    jSONObject2.put("thread_back_trace", iVar.f31735f);
                    jSONObject2.put("thread_id", iVar.f31730a);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("threads_info", jSONArray);
        } catch (Throwable th) {
            C13118b.m23587a("APM-CPU", "cpu_exception_data_assemble", th);
        }
        return jSONObject;
    }

    public C13005b(double d, double d2, List<C13023i> list, String str, boolean z) {
        this.f31683a = d;
        this.f31684b = d2;
        this.f31685c = str;
        this.f31686d = z;
        this.f31687e = new ArrayList(list);
    }
}
