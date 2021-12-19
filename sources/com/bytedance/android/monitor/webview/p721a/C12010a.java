package com.bytedance.android.monitor.webview.p721a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.a.a */
public final class C12010a {

    /* renamed from: a */
    private long f28768a;

    static {
        Covode.recordClassIndex(13738);
    }

    /* renamed from: a */
    public final void mo19218a() {
        if (HybridMonitor.getInstance().isAbTestEnable()) {
            this.f28768a = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo19219a(WebView webView, String str) {
        if (HybridMonitor.getInstance().isAbTestEnable()) {
            long j = this.f28768a;
            if (j != 0) {
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        Uri parse = Uri.parse(str);
                        C11950d.m21101a(jSONObject, "url", parse.toString());
                        C11950d.m21101a(jSONObject, "host", parse.getHost());
                        C11950d.m21101a(jSONObject, "path", parse.getPath());
                        C11950d.m21101a(jSONObject, "hybrid_monitor_switch", "false");
                        C11950d.m21101a(jSONObject, "js_inject_switch", "false");
                        C11950d.m21101a(jSONObject, "container_type", "web");
                        JSONObject jSONObject2 = new JSONObject();
                        C11950d.m21099a(jSONObject2, "web_page_cost", currentTimeMillis);
                        C12044i.f28862a.mo19231a(webView, str, "performance_test", jSONObject.toString(), jSONObject2.toString(), null);
                        C12044i.f28862a.mo19251a(webView);
                        this.f28768a = 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
