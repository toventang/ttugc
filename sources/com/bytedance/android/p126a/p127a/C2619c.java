package com.bytedance.android.p126a.p127a;

import com.bytedance.android.p126a.p127a.p132e.AbstractC2629a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.c */
public class C2619c extends AbstractC2629a {

    /* renamed from: a */
    private static volatile C2619c f7869a;

    static {
        Covode.recordClassIndex(3007);
    }

    private C2619c() {
    }

    /* renamed from: a */
    public static C2619c m7582a() {
        MethodCollector.m26663i(3447);
        if (f7869a == null) {
            synchronized (C2619c.class) {
                try {
                    if (f7869a == null) {
                        f7869a = new C2619c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3447);
                    throw th;
                }
            }
        }
        C2619c cVar = f7869a;
        MethodCollector.m26664o(3447);
        return cVar;
    }

    /* renamed from: a */
    public final void mo7127a(long j) {
        mo7150a("host_dispatch_track_wait", j, (JSONObject) null);
    }

    /* renamed from: a */
    private static JSONObject m7583a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sp", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo7129b(String str, long j) {
        mo7150a("host_sp_cost_edit", j, m7583a(str));
    }

    /* renamed from: a */
    public final void mo7128a(String str, long j) {
        mo7150a("host_sp_cost_init", j, m7583a(str));
    }
}
