package com.bytedance.android.monitorV2.webview;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.o */
public final class C12234o {

    /* renamed from: a */
    Map<WebView, String> f29471a = new WeakHashMap();

    /* renamed from: b */
    public Map<WebView, Long> f29472b = new WeakHashMap();

    /* renamed from: c */
    Map<WebView, Boolean> f29473c = new WeakHashMap();

    /* renamed from: d */
    Map<WebView, Long> f29474d = new WeakHashMap();

    /* renamed from: e */
    Map<WebView, Long> f29475e = new WeakHashMap();

    /* renamed from: f */
    Map<WebView, Long> f29476f = new WeakHashMap();

    /* renamed from: g */
    Map<WebView, Boolean> f29477g = new WeakHashMap();

    /* renamed from: h */
    Map<WebView, Boolean> f29478h = new WeakHashMap();

    /* renamed from: i */
    Map<String, String> f29479i = new WeakHashMap();

    /* renamed from: j */
    Map<WebView, List<String>> f29480j = new WeakHashMap();

    /* renamed from: k */
    Map<WebView, Map<String, Integer>> f29481k = new WeakHashMap();

    /* renamed from: l */
    public Map<WebView, List<Object>> f29482l = new WeakHashMap();

    /* renamed from: m */
    Map<String, JSONObject> f29483m = new WeakHashMap();

    static {
        Covode.recordClassIndex(13965);
    }

    /* renamed from: a */
    private boolean m22017a(WebView webView) {
        Boolean bool = this.f29473c.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo19690a(WebView webView, C12097a.C12098a aVar, String str) {
        JSONObject jSONObject = new JSONObject();
        C12130f.m21651a(jSONObject, "attach_ts", this.f29475e.get(webView));
        C12130f.m21651a(jSONObject, "detach_ts", this.f29476f.get(webView));
        C12130f.m21651a(jSONObject, "container_init_ts", this.f29474d.get(webView));
        JSONObject jSONObject2 = new JSONObject();
        C12130f.m21652a(jSONObject2, "bid", str);
        C12130f.m21652a(jSONObject2, "setting_bid", aVar.f29047a);
        C12130f.m21650a(jSONObject2, "hit_sample", aVar.f29048b);
        C12130f.m21650a(jSONObject2, "setting_id", aVar.f29049c);
        C12130f.m21651a(jSONObject, "bid_info", jSONObject2);
        C12130f.m21651a(jSONObject, "container_reuse", Boolean.valueOf(m22017a(webView)));
        return jSONObject;
    }
}
