package com.bytedance.android.monitor.webview;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.h */
public final class C12043h implements AbstractC12009a {
    static {
        Covode.recordClassIndex(13771);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12009a
    /* renamed from: a */
    public final void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            C12290b.m22066a(str, (JSONObject) null, (JSONObject) null, jSONObject2);
            C11937b.m21063b("WebViewMonitorDefault", "apm upload: ".concat(String.valueOf(str)));
        } catch (Throwable unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }
}
