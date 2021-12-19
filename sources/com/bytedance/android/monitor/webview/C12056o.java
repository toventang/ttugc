package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.o */
public final class C12056o {

    /* renamed from: a */
    Map<WebView, String> f28905a = new WeakHashMap();

    /* renamed from: b */
    public Map<WebView, Long> f28906b = new WeakHashMap();

    /* renamed from: c */
    Map<WebView, Boolean> f28907c = new WeakHashMap();

    /* renamed from: d */
    Map<WebView, Long> f28908d = new WeakHashMap();

    /* renamed from: e */
    Map<WebView, Long> f28909e = new WeakHashMap();

    /* renamed from: f */
    Map<WebView, Long> f28910f = new WeakHashMap();

    /* renamed from: g */
    Map<WebView, Boolean> f28911g = new WeakHashMap();

    /* renamed from: h */
    Map<WebView, Boolean> f28912h = new WeakHashMap();

    /* renamed from: i */
    Map<WebView, Map<String, Integer>> f28913i = new WeakHashMap();

    /* renamed from: j */
    public Map<WebView, List<Object>> f28914j = new WeakHashMap();

    static {
        Covode.recordClassIndex(13784);
    }

    /* renamed from: b */
    private boolean m21464b(WebView webView) {
        Boolean bool = this.f28907c.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo19351a(WebView webView) {
        JSONObject jSONObject = new JSONObject();
        C11950d.m21100a(jSONObject, "attach_ts", this.f28909e.get(webView));
        C11950d.m21100a(jSONObject, "detach_ts", this.f28910f.get(webView));
        C11950d.m21100a(jSONObject, "container_init_ts", this.f28908d.get(webView));
        C11950d.m21100a(jSONObject, "container_reuse", (Object) Boolean.valueOf(m21464b(webView)));
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo19352a(final WebView webView, final AbstractC12025c cVar) {
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C12056o.RunnableC120571 */

            static {
                Covode.recordClassIndex(13785);
            }

            public final void run() {
                List<Object> list = C12056o.this.f28914j.get(webView);
                if (list != null) {
                    Iterator<Object> it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        });
    }
}
