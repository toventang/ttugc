package com.bytedance.android.monitor.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p706d.C11921d;
import com.bytedance.android.monitor.p706d.C11922e;
import com.bytedance.android.monitor.p706d.C11923f;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p713k.C11943a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.p714l.C11955i;
import com.bytedance.android.monitor.webview.p722b.AbstractC12013b;
import com.bytedance.android.monitor.webview.p722b.AbstractC12016e;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c;
import com.bytedance.android.monitor.webview.p723c.p725b.C12030c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1753c.C23558a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.f */
public class C12036f implements AbstractC12032d {

    /* renamed from: b */
    private static volatile C12036f f28835b;

    /* renamed from: a */
    public C12056o f28836a = new C12056o();

    /* renamed from: c */
    private C12052m f28837c = new C12052m();

    /* renamed from: d */
    private Map<WebView, List<C12053n>> f28838d = new WeakHashMap();

    static {
        Covode.recordClassIndex(13764);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final boolean mo19284a(WebView webView) {
        Boolean bool = this.f28836a.f28912h.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19278a(WebView webView, String str) {
        C12056o oVar = this.f28836a;
        if (oVar.f28906b.get(webView) != null) {
            oVar.f28907c.put(webView, true);
        }
        oVar.f28906b.put(webView, Long.valueOf(System.currentTimeMillis()));
        oVar.f28905a.put(webView, str);
        C11937b.m21062a("WebviewCache", "handleLoadUrl: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19283a(final WebView webView, final String str, final boolean z, final int i, final String str2, final int i2) {
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C12036f.RunnableC120371 */

            static {
                Covode.recordClassIndex(13765);
            }

            public final void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                C11950d.m21101a(jSONObject, "event_type", "nativeError");
                C11950d.m21098a(jSONObject, "error_code", i);
                C11950d.m21101a(jSONObject, "error_msg", str2);
                if (z) {
                    str = "main_frame";
                } else {
                    str = "child_resource";
                }
                C11950d.m21101a(jSONObject, "scene", str);
                C11950d.m21101a(jSONObject, "error_url", str);
                C11950d.m21098a(jSONObject, "http_status", i2);
                C12036f.this.mo19310b(webView, "nativeError", jSONObject);
                C11937b.m21062a("MonitorCacheInfoHandler", "handleRequestError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19281a(WebView webView, String str, String str2, String str3) {
        C12053n e = m21319e(webView, str);
        if (e != null && !TextUtils.isEmpty(str2)) {
            e.mo19342a().mo19265b(C11950d.m21097a(str3));
        }
        C11937b.m21062a("MonitorCacheInfoHandler", "cover: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19280a(WebView webView, String str, String str2) {
        String b = C11950d.m21104b(C11950d.m21097a(str2), "url");
        if (TextUtils.isEmpty(b)) {
            C12053n l = mo19311l(webView);
            if (l != null) {
                l.mo19344a(webView, str, C11950d.m21097a(str2));
                l.mo19347a(str);
                return;
            }
            return;
        }
        C12053n e = m21319e(webView, b);
        if (e != null && e.mo19350b(str)) {
            e.mo19344a(webView, str, C11950d.m21097a(str2));
            e.mo19347a(str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19282a(WebView webView, String str, JSONObject jSONObject) {
        AbstractC12024b bVar;
        C12053n l = mo19311l(webView);
        if (l != null && (bVar = l.f28897c.get(str)) != null) {
            bVar.mo19262a(jSONObject);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19279a(WebView webView, String str, Object obj) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            l.f28895a.mo19145a(str, obj);
        }
    }

    private C12036f() {
    }

    /* renamed from: a */
    public static C12036f m21317a() {
        MethodCollector.m26663i(7664);
        if (f28835b == null) {
            synchronized (C12036f.class) {
                try {
                    if (f28835b == null) {
                        f28835b = new C12036f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7664);
                    throw th;
                }
            }
        }
        C12036f fVar = f28835b;
        MethodCollector.m26664o(7664);
        return fVar;
    }

    /* renamed from: n */
    private JSONObject m21322n(WebView webView) {
        return this.f28836a.mo19351a(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: k */
    public final AbstractC12013b mo19297k(final WebView webView) {
        return new AbstractC12013b() {
            /* class com.bytedance.android.monitor.webview.C12036f.C120415 */

            static {
                Covode.recordClassIndex(13769);
            }

            @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12013b
            /* renamed from: a */
            public final String mo19221a() {
                return C12044i.f28863b.mo19306f(webView);
            }

            @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12013b
            /* renamed from: b */
            public final String mo19222b() {
                return C12044i.f28863b.mo19305e(webView);
            }

            @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12013b
            /* renamed from: c */
            public final String mo19223c() {
                C12053n l = C12036f.this.mo19311l(webView);
                if (l != null) {
                    return l.f28895a.f28529a;
                }
                C12056o oVar = C12036f.this.f28836a;
                return oVar.f28905a.get(webView);
            }
        };
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: f */
    public final void mo19292f(WebView webView) {
        this.f28836a.f28911g.put(webView, true);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: h */
    public final boolean mo19294h(WebView webView) {
        if (mo19311l(webView) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: i */
    public final String mo19295i(WebView webView) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            return l.f28895a.f28529a;
        }
        return null;
    }

    /* renamed from: m */
    private synchronized List<C12053n> m21321m(WebView webView) {
        List<C12053n> remove;
        MethodCollector.m26663i(7940);
        remove = this.f28838d.remove(webView);
        MethodCollector.m26664o(7940);
        return remove;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: b */
    public final void mo19285b(WebView webView) {
        this.f28836a.f28908d.put(webView, Long.valueOf(System.currentTimeMillis()));
        C11937b.m21062a("WebviewCache", "handleViewCreate: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: c */
    public final void mo19287c(WebView webView) {
        this.f28836a.f28909e.put(webView, Long.valueOf(System.currentTimeMillis()));
        C11937b.m21062a("WebviewCache", "handleViewAttach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: d */
    public final void mo19289d(WebView webView) {
        this.f28836a.f28910f.put(webView, Long.valueOf(System.currentTimeMillis()));
        C11937b.m21062a("WebviewCache", "handleViewDetach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: g */
    public final boolean mo19293g(WebView webView) {
        Boolean bool = this.f28836a.f28911g.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: j */
    public final void mo19296j(WebView webView) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            l.mo19342a().mo19271n();
        }
        C11937b.m21062a("MonitorCacheInfoHandler", "handlePageExit: ".concat(String.valueOf(webView)));
    }

    /* renamed from: l */
    public final synchronized C12053n mo19311l(WebView webView) {
        MethodCollector.m26663i(7665);
        List<C12053n> list = this.f28838d.get(webView);
        if (list == null || list.size() <= 0) {
            MethodCollector.m26664o(7665);
            return null;
        }
        C12053n nVar = list.get(list.size() - 1);
        MethodCollector.m26664o(7665);
        return nVar;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: e */
    public final void mo19291e(WebView webView) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            C12030c a = l.mo19342a();
            if (a.f28813b == 0) {
                a.f28813b = System.currentTimeMillis();
                a.f28815d = a.f28813b - a.f28812a;
                if (a.f28815d < 0) {
                    a.f28815d = 0;
                }
                if (HybridMonitor.getInstance().isAbTestEnable()) {
                    C12044i.f28862a.mo19236b(a.f28800e.mo19267b().get(), a.f28815d);
                }
            }
        }
        C11937b.m21062a("MonitorCacheInfoHandler", "handlePageFinish: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19273a(WebView webView, long j) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            l.mo19342a().f28816g = j;
        }
    }

    /* renamed from: a */
    private synchronized void m21318a(WebView webView, C12053n nVar) {
        MethodCollector.m26663i(7942);
        List<C12053n> list = this.f28838d.get(webView);
        if (list != null) {
            list.remove(nVar);
        }
        MethodCollector.m26664o(7942);
    }

    /* renamed from: e */
    private synchronized C12053n m21319e(WebView webView, String str) {
        MethodCollector.m26663i(7805);
        List<C12053n> list = this.f28838d.get(webView);
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C12053n nVar = list.get(size);
                if (nVar != null && nVar.f28895a.f28529a.equals(str)) {
                    MethodCollector.m26664o(7805);
                    return nVar;
                }
            }
        }
        MethodCollector.m26664o(7805);
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19272a(WebView webView, int i) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            C12030c a = l.mo19342a();
            if (i == 100 && a.f28814c == 0) {
                a.f28814c = System.currentTimeMillis();
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: c */
    public final void mo19288c(WebView webView, String str) {
        C12053n l = mo19311l(webView);
        if (l != null) {
            C12030c a = l.mo19342a();
            if (a.f28800e.f28808n != 0) {
                a.f28820k = true;
                a.f28819j = Long.parseLong(str) - a.f28800e.f28808n;
                if (a.f28819j < 0) {
                    a.f28819j = 0;
                }
                C11937b.m21062a("WebPerfReportData", " updateMonitorInitTimeData : " + a.f28819j);
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: d */
    public final void mo19290d(WebView webView, String str) {
        C12053n l;
        if ("loc_after_detach".equals(str)) {
            List<C12053n> m = m21321m(webView);
            if (m != null) {
                for (C12053n nVar : m) {
                    nVar.mo19349a(m21322n(webView));
                    nVar.mo19343a(webView);
                    for (AbstractC12024b bVar : nVar.f28897c.values()) {
                        if (bVar.mo19263l() && (bVar instanceof AbstractC12025c)) {
                            C12053n.m21449a(webView, (AbstractC12025c) bVar);
                            bVar.mo19264m();
                        }
                    }
                }
            }
        } else if (("loc_after_tti".equals(str) || "loc_force".equals(str)) && (l = mo19311l(webView)) != null) {
            l.mo19349a(m21322n(webView));
            l.mo19343a(webView);
        }
        this.f28836a.f28912h.put(webView, true);
    }

    /* renamed from: f */
    private C12053n m21320f(WebView webView, String str) {
        String str2;
        C11937b.m21062a("MonitorCacheInfoHandler", "buildNewNavigation cache new url : ".concat(String.valueOf(str)));
        AbstractC12016e eVar = (AbstractC12016e) C12044i.f28863b;
        JSONObject jSONObject = new JSONObject();
        if (((C12044i) C12044i.f28862a).mo19332v(webView) != null) {
            jSONObject = ((C12044i) C12044i.f28862a).mo19332v(webView).f28794z;
        }
        if (eVar.mo19229u(webView)) {
            str2 = "ttweb";
        } else {
            str2 = "web";
        }
        C12053n nVar = new C12053n(webView, "web", str2, str, C11955i.m21114a(), this.f28836a.f28906b.get(webView).longValue(), jSONObject);
        nVar.mo19348a(this.f28836a.f28913i.remove(webView));
        nVar.mo19346a(C11943a.m21078a(webView));
        nVar.mo19342a().f28823n = C11943a.m21080b(webView);
        nVar.f28896b = this.f28836a;
        List<C12053n> list = this.f28838d.get(webView);
        if (list == null) {
            list = new ArrayList<>();
            this.f28838d.put(webView, list);
        }
        list.add(nVar);
        return nVar;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19274a(final WebView webView, final C11921d dVar) {
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C12036f.RunnableC120404 */

            static {
                Covode.recordClassIndex(13768);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                C11950d.m21101a(jSONObject, "event_type", "fetchError");
                C11950d.m21098a(jSONObject, "error_no", dVar.f28498h);
                C11950d.m21101a(jSONObject, "error_msg", dVar.f28497g);
                C11950d.m21101a(jSONObject, "method", dVar.f28491a);
                C11950d.m21101a(jSONObject, "url", dVar.f28492b);
                C11950d.m21098a(jSONObject, "status_code", dVar.f28493c);
                C11950d.m21098a(jSONObject, "request_error_code", dVar.f28494d);
                C11950d.m21101a(jSONObject, "request_error_msg", dVar.f28495e);
                C11950d.m21098a(jSONObject, "jsb_ret", dVar.f28499i);
                C11950d.m21098a(jSONObject, "hit_prefetch", dVar.f28496f);
                C12036f.this.mo19310b(webView, "fetchError", jSONObject);
                C11937b.m21062a("MonitorCacheInfoHandler", "handleFetchError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: b */
    public final void mo19286b(WebView webView, String str) {
        String i = mo19295i(webView);
        if (!TextUtils.isEmpty(i)) {
            mo19296j(webView);
        }
        if (str.equals(i) && mo19311l(webView).f28895a.f28533e == C11955i.m21114a()) {
            C11937b.m21062a("MonitorCacheInfoHandler", "handlePageStart : clickStart is same");
        } else if (!str.equals("about:blank")) {
            m21320f(webView, str);
            C12053n l = mo19311l(webView);
            if (l != null) {
                l.mo19342a().f28817h = System.currentTimeMillis();
                C12030c a = l.mo19342a();
                if (a.f28812a == 0) {
                    a.f28812a = System.currentTimeMillis();
                }
            }
            JSONObject jSONObject = new JSONObject();
            C11950d.m21099a(jSONObject, "invoke_ts", System.currentTimeMillis());
            mo19310b(webView, "navigationStart", jSONObject);
            C11937b.m21062a("MonitorCacheInfoHandler", "handlePv");
            C11937b.m21062a("MonitorCacheInfoHandler", "handlePageStart: " + webView + "   url : " + str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19275a(final WebView webView, final C11922e eVar) {
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C12036f.RunnableC120382 */

            static {
                Covode.recordClassIndex(13766);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                C11950d.m21101a(jSONObject, "event_type", "jsbError");
                C11950d.m21101a(jSONObject, "bridge_name", eVar.f28502c);
                C11950d.m21101a(jSONObject, "error_activity", eVar.f28506g);
                C11950d.m21098a(jSONObject, "error_code", eVar.f28500a);
                C11950d.m21101a(jSONObject, "error_message", eVar.f28501b);
                C11950d.m21101a(jSONObject, "js_type", eVar.f28503d);
                C11950d.m21101a(jSONObject, "error_url", eVar.f28505f);
                C11950d.m21098a(jSONObject, "is_sync", eVar.f28504e);
                C12036f.this.mo19310b(webView, "jsbError", jSONObject);
                C11937b.m21062a("MonitorCacheInfoHandler", "handleJSBError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19276a(final WebView webView, final C11923f fVar) {
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C12036f.RunnableC120393 */

            static {
                Covode.recordClassIndex(13767);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                C11950d.m21101a(jSONObject, "event_type", "jsbPerf");
                C11950d.m21101a(jSONObject, "bridge_name", fVar.f28507a);
                C11950d.m21098a(jSONObject, "status_code", fVar.f28508b);
                C11950d.m21101a(jSONObject, "status_description", fVar.f28509c);
                C11950d.m21101a(jSONObject, "protocol_version", fVar.f28510d);
                C11950d.m21099a(jSONObject, "cost_time", fVar.f28511e);
                C11950d.m21099a(jSONObject, "invoke_ts", fVar.f28512f);
                C11950d.m21099a(jSONObject, "callback_ts", fVar.f28513g);
                C11950d.m21099a(jSONObject, "fireEvent_ts", fVar.f28514h);
                C12036f.this.mo19310b(webView, "jsbPerf", jSONObject);
                C11937b.m21062a("MonitorCacheInfoHandler", "handleJSBInfo: ");
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12032d
    /* renamed from: a */
    public final void mo19277a(WebView webView, C23558a.C23559a aVar) {
        int i;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            C11950d.m21101a(jSONObject, "event_type", "blank");
            boolean z = false;
            if (aVar.f55804a == 1) {
                i = 1;
            } else {
                i = 0;
            }
            C11950d.m21098a(jSONObject, "is_blank", i);
            C11950d.m21098a(jSONObject, "detect_type", 0);
            C11950d.m21099a(jSONObject, "cost_time", aVar.f55806c);
            if (aVar.f55804a == 3) {
                C11950d.m21098a(jSONObject, "error_code", aVar.f55807d);
                C11950d.m21101a(jSONObject, "error_msg", aVar.f55808e);
            }
            C12053n e = m21319e(webView, webView.getUrl());
            if (e == null) {
                e = m21320f(webView, webView.getUrl());
                z = true;
            }
            mo19310b(webView, "blank", jSONObject);
            if (z) {
                m21318a(webView, e);
            }
            C11937b.m21062a("MonitorCacheInfoHandler", "handleBlankDetect: ");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19310b(WebView webView, String str, JSONObject jSONObject) {
        C12053n l = mo19311l(webView);
        if (l != null && l.mo19350b(str)) {
            l.mo19349a(m21322n(webView));
            l.mo19345a(webView, str, null, jSONObject);
            l.mo19347a(str);
        }
    }
}
