package com.bytedance.android.monitorV2.webview;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.a */
public final class C12188a implements AbstractC12190b {
    static {
        Covode.recordClassIndex(13919);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12190b
    /* renamed from: a */
    public final void mo19564a(String str, JSONObject jSONObject) {
        try {
            C12290b.m22066a(str, (JSONObject) null, (JSONObject) null, jSONObject);
            C12115b.m21583b("WebViewMonitorDefault", "apm upload: ".concat(String.valueOf(str)));
        } catch (Throwable unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }
}
