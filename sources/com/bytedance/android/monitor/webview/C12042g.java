package com.bytedance.android.monitor.webview;

import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.g */
public final class C12042g {

    /* renamed from: a */
    private JSONObject f28857a;

    /* renamed from: b */
    private JSONObject f28858b;

    /* renamed from: c */
    private JSONObject f28859c;

    /* renamed from: d */
    private JSONObject f28860d;

    /* renamed from: e */
    private JSONObject f28861e;

    static {
        Covode.recordClassIndex(13770);
    }

    /* renamed from: a */
    public final String mo19316a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C11950d.m21100a(jSONObject, "monitors", jSONObject2);
        C11950d.m21100a(jSONObject, "sendCommonParams", this.f28861e);
        m21354a(jSONObject2, this.f28857a);
        m21354a(jSONObject2, this.f28858b);
        m21354a(jSONObject2, this.f28859c);
        m21354a(jSONObject2, this.f28860d);
        return "SlardarHybrid('config', " + jSONObject.toString() + ")";
    }

    public C12042g(String str) {
        JSONObject a = C11950d.m21097a(str);
        this.f28857a = C11950d.m21105c(a, "apmReportConfig");
        this.f28858b = C11950d.m21105c(a, "performanceReportConfig");
        this.f28859c = C11950d.m21105c(a, "errorMsgReportConfig");
        this.f28860d = C11950d.m21105c(a, "resourceTimingReportConfig");
        this.f28861e = C11950d.m21105c(a, "commonReportConfig");
    }

    /* renamed from: a */
    private static void m21354a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C11950d.m21100a(jSONObject, next, C11950d.m21106d(jSONObject2, next));
            }
        }
    }
}
