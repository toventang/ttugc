package com.bytedance.android.monitorV2.webview.p747a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.C12230n;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.a.a */
public final class C12189a {

    /* renamed from: a */
    private long f29335a;

    static {
        Covode.recordClassIndex(13920);
    }

    /* renamed from: a */
    public final void mo19565a() {
        if (HybridMultiMonitor.getInstance().isAbTestEnable()) {
            this.f29335a = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo19566a(WebView webView, String str) {
        if (HybridMultiMonitor.getInstance().isAbTestEnable()) {
            long j = this.f29335a;
            if (j != 0) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        Uri parse = Uri.parse(str);
                        C12130f.m21652a(jSONObject, "url", parse.toString());
                        C12130f.m21652a(jSONObject, "host", parse.getHost());
                        C12130f.m21652a(jSONObject, "path", parse.getPath());
                        C12130f.m21652a(jSONObject, "hybrid_monitor_switch", "false");
                        C12130f.m21652a(jSONObject, "js_inject_switch", "false");
                        C12130f.m21652a(jSONObject, "container_type", "web");
                        C12130f.m21650a(new JSONObject(), "web_page_cost", currentTimeMillis);
                        C12230n.f29448a.mo19574b(webView, str, "performance_test", jSONObject.toString());
                        C12230n.f29448a.mo19596a(webView);
                        this.f29335a = 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
