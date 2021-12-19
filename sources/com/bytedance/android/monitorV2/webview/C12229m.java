package com.bytedance.android.monitorV2.webview;

import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.m */
public final class C12229m {

    /* renamed from: a */
    private JSONObject f29443a;

    /* renamed from: b */
    private JSONObject f29444b;

    /* renamed from: c */
    private JSONObject f29445c;

    /* renamed from: d */
    private JSONObject f29446d;

    /* renamed from: e */
    private JSONObject f29447e;

    static {
        Covode.recordClassIndex(13960);
    }

    /* renamed from: a */
    public final String mo19667a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C12130f.m21651a(jSONObject, "monitors", jSONObject2);
        C12130f.m21651a(jSONObject, "sendCommonParams", this.f29447e);
        m21930a(jSONObject2, this.f29443a);
        m21930a(jSONObject2, this.f29444b);
        m21930a(jSONObject2, this.f29445c);
        m21930a(jSONObject2, this.f29446d);
        return "SlardarHybrid('config', " + jSONObject.toString() + ")";
    }

    public C12229m(String str) {
        JSONObject a = C12130f.m21648a(str);
        this.f29443a = C12130f.m21658d(a, "apmReportConfig");
        this.f29444b = C12130f.m21658d(a, "performanceReportConfig");
        this.f29445c = C12130f.m21658d(a, "errorMsgReportConfig");
        this.f29446d = C12130f.m21658d(a, "resourceTimingReportConfig");
        this.f29447e = C12130f.m21658d(a, "commonReportConfig");
    }

    /* renamed from: a */
    private static void m21930a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C12130f.m21651a(jSONObject, next, C12130f.m21659e(jSONObject2, next));
            }
        }
    }
}
