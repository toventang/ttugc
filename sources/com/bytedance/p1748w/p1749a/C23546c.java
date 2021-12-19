package com.bytedance.p1748w.p1749a;

import com.bytedance.apm.p767c.AbstractC12406b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.w.a.c */
public final class C23546c implements AbstractC12406b {

    /* renamed from: a */
    public final String f55772a;

    /* renamed from: b */
    private final JSONObject f55773b;

    /* renamed from: c */
    private final String f55774c = null;

    /* renamed from: d */
    private final boolean f55775d = false;

    static {
        Covode.recordClassIndex(27644);
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: b */
    public final String mo20190b() {
        return "tracing";
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: d */
    public final boolean mo20192d() {
        return false;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final JSONObject mo20188a() {
        return this.f55773b;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: c */
    public final String mo20191c() {
        return this.f55772a;
    }

    @Override // com.bytedance.apm.p767c.AbstractC12406b
    /* renamed from: a */
    public final boolean mo20189a(JSONObject jSONObject) {
        int i;
        if ("app_launch_trace".equals(this.f55774c)) {
            return C12556c.m22589d("start_trace");
        }
        C23545b a = C23545b.m44281a();
        boolean z = this.f55775d;
        String str = this.f55774c;
        if (a.f55768a) {
            if (!z || (a.f55770c != null && a.f55770c.optDouble(str, -1.0d) <= 0.0d)) {
                i = 0;
            } else {
                i = 16;
            }
            if (a.f55769b != null && a.f55769b.optDouble(str, -1.0d) > 0.0d) {
                i |= 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public C23546c(JSONObject jSONObject, String str) {
        this.f55773b = jSONObject;
        this.f55772a = str;
    }
}
