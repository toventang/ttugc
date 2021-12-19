package com.bytedance.android.monitor.webview;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.C1764a;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p704b.AbstractC11911e;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p706d.C11921d;
import com.bytedance.android.monitor.p706d.C11922e;
import com.bytedance.android.monitor.p706d.C11923f;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p712j.C11942d;
import com.bytedance.android.monitor.p713k.C11945c;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.p721a.C12010a;
import com.bytedance.android.monitor.webview.p722b.AbstractC12013b;
import com.bytedance.android.monitor.webview.p722b.AbstractC12017f;
import com.bytedance.android.monitor.webview.p726d.AbstractC12033a;
import com.bytedance.android.monitor.webview.p727e.C12035a;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1753c.C23558a;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.i */
public final class C12044i implements AbstractC12021c, AbstractC12034e {

    /* renamed from: a */
    public static AbstractC12021c f28862a;

    /* renamed from: b */
    public static AbstractC12034e f28863b;

    /* renamed from: d */
    private static String f28864d = "ttlive_web_view_tag";

    /* renamed from: e */
    private static String f28865e = "ttlive_web_view_last_url_tag";

    /* renamed from: f */
    private static String f28866f = "ttlive_web_view_auto_report_tag";

    /* renamed from: j */
    private static Map<String, String> f28867j = new HashMap();

    /* renamed from: c */
    public AbstractC12033a f28868c;

    /* renamed from: g */
    private Map<String, AbstractC12021c.C12022a> f28869g = new HashMap();

    /* renamed from: h */
    private Map<String, AbstractC12021c.C12022a> f28870h = new HashMap();

    /* renamed from: i */
    private Set<String> f28871i = new HashSet();

    /* renamed from: k */
    private View$OnAttachStateChangeListenerC12048b f28872k = new View$OnAttachStateChangeListenerC12048b((byte) 0);

    /* renamed from: l */
    private C12010a f28873l = new C12010a();

    /* renamed from: m */
    private boolean f28874m = false;

    /* renamed from: n */
    private boolean f28875n = true;

    /* renamed from: o */
    private boolean f28876o = false;

    /* renamed from: p */
    private boolean f28877p = false;

    /* renamed from: q */
    private Handler f28878q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    private boolean f28879r = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitor.webview.i$b */
    public static class View$OnAttachStateChangeListenerC12048b implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(13776);
        }

        private View$OnAttachStateChangeListenerC12048b() {
        }

        /* synthetic */ View$OnAttachStateChangeListenerC12048b(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo19336a(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
                webView.addOnAttachStateChangeListener(this);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            if (view instanceof WebView) {
                C12044i.f28863b.mo19303c((WebView) view);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                C12044i.f28863b.mo19304d(webView);
                if (C12044i.f28863b.mo19308h(webView)) {
                    C12044i.f28862a.mo19251a(webView);
                }
            }
        }
    }

    /* renamed from: a */
    public static AbstractC12021c m21365a() {
        return f28862a;
    }

    /* renamed from: b */
    public final boolean mo19322b() {
        boolean z = this.f28875n && m21376e().f28567a;
        if (this.f28879r != z) {
            C11937b.m21063b("TTLiveWebViewMonitorHelper", "monitor enabled: ".concat(String.valueOf(z)));
            this.f28879r = z;
        }
        return z;
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: a */
    public final void mo19241a(WebView webView, C11921d dVar) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar2;
        try {
            if (!mo19322b() || webView == null || !mo19307g(webView) || !m21384w(webView) || (v = mo19332v(webView)) == null) {
                return;
            }
            if (m21369a(v.f28782n)) {
                if (m21376e().f28569c && (dVar2 = v.f28770b) != null) {
                    dVar2.mo19274a(webView, dVar);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: a */
    public final void mo19240a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleRequestHttpError: " + C11937b.m21060a(webView) + ", request: " + webResourceRequest);
        if (!mo19323c()) {
            mo19321b(webView, webResourceRequest, webResourceResponse);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19321b(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC12021c.C12022a v;
        try {
            if (mo19322b() && webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (mo19307g(webView) && m21384w(webView) && (v = mo19332v(webView)) != null) {
                        if (m21369a(v.f28780l)) {
                            AbstractC12032d dVar = v.f28770b;
                            if (dVar != null) {
                                dVar.mo19283a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), 0, webResourceResponse.getReasonPhrase(), webResourceResponse.getStatusCode());
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12019h
    /* renamed from: a */
    public final void mo19233a(WebView webView, C11922e eVar) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleJSBError: " + C11937b.m21060a(webView));
        try {
            if (!mo19322b() || webView == null || !mo19307g(webView) || !m21384w(webView) || (v = mo19332v(webView)) == null) {
                return;
            }
            if (m21369a(v.f28781m)) {
                if (m21376e().f28570d && (dVar = v.f28770b) != null) {
                    dVar.mo19275a(webView, eVar);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12019h
    /* renamed from: a */
    public final void mo19234a(WebView webView, C11923f fVar) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleJSBInfo: " + C11937b.m21060a(webView));
        try {
            if (!mo19322b() || webView == null || !mo19307g(webView) || !m21384w(webView) || (v = mo19332v(webView)) == null) {
                return;
            }
            if (m21369a(v.f28781m)) {
                if (m21376e().f28570d && (dVar = v.f28770b) != null) {
                    dVar.mo19276a(webView, fVar);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public final void mo19317a(WebView webView, boolean z) {
        AbstractC12021c.C12022a v = mo19332v(webView);
        if (v != null && mo19307g(webView) && m21369a(v.f28783o) && !m21359C(webView)) {
            String a = C1764a.m5928a(" javascript: (function () {\n    var target = {}\n    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n    var performacess = SlardarHybrid('getLatestPerformance');\n    var resourcess = SlardarHybrid('getLatestResource');\n    target.performance = performacess;\n    target.resource = resourcess;\n    target.needReport = %s;\n    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n })()", new Object[]{z ? "true" : "false"});
            if (webView != null) {
                int i = Build.VERSION.SDK_INT;
                webView.evaluateJavascript(a, null);
            }
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12014c
    /* renamed from: b */
    public final void mo19225b(AbstractC12021c.C12022a aVar) {
        try {
            mo19227a(aVar);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: b */
    public final void mo19242b(WebView webView, String str) {
        try {
            mo19243c(webView, str);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12018g
    /* renamed from: a */
    public final void mo19231a(WebView webView, String str, String str2, String str3, String str4, String str5) {
        mo19232a(webView, str, str2, C11950d.m21097a(str3), C11950d.m21097a(str4), C11950d.m21097a(str5), (JSONObject) null, true);
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12018g
    /* renamed from: a */
    public final void mo19232a(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        m21372b(webView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12018g
    /* renamed from: a */
    public final void mo19230a(WebView webView, C11919c cVar) {
        AbstractC12013b x;
        if (!(webView == null || (x = m21385x(webView)) == null)) {
            if (TextUtils.isEmpty(cVar.f28470b)) {
                cVar.f28470b = x.mo19222b();
            }
            if (TextUtils.isEmpty(cVar.f28469a)) {
                cVar.f28469a = x.mo19223c();
            }
            if (TextUtils.isEmpty(cVar.f28477i)) {
                cVar.f28477i = x.mo19221a();
            }
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (!(v == null || v.f28777i == null)) {
                cVar.f28479k = v.f28777i;
            }
        }
        C11950d.m21098a(cVar.f28476h, "platform", 0);
        HybridMonitor.getInstance().customReport(cVar);
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12014c
    /* renamed from: a */
    public final void mo19224a(String str) {
        try {
            Map<String, AbstractC12021c.C12022a> map = this.f28870h;
            if (map != null) {
                map.remove(str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12019h
    /* renamed from: a */
    public final void mo19235a(WebView webView, String str, JSONObject jSONObject) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        try {
            if (mo19322b() && mo19307g(webView) && (v = mo19332v(webView)) != null && (dVar = v.f28770b) != null) {
                dVar.mo19282a(webView, str, jSONObject);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12012a
    /* renamed from: a */
    public final void mo19220a(final WebView webView, final String str, Object obj) {
        final String valueOf = String.valueOf(obj);
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.C12044i.RunnableC120451 */

            static {
                Covode.recordClassIndex(13773);
            }

            public final void run() {
                AbstractC12021c.C12022a v;
                AbstractC12032d dVar;
                try {
                    if (C12044i.this.mo19322b() && C12044i.this.mo19307g(webView) && (v = C12044i.this.mo19332v(webView)) != null && (dVar = v.f28770b) != null) {
                        dVar.mo19279a(webView, str, (Object) valueOf);
                    }
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
            }
        });
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: a */
    public final void mo19302a(WebView webView, String str, String str2, String str3) {
        AbstractC12032d dVar;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "cover: url: " + str + ", service: " + str2);
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19281a(webView, str, str2, str3);
                m21379j(webView, "loc_after_tti");
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: a */
    public final void mo19301a(WebView webView, String str, String str2) {
        AbstractC12032d dVar;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "report direct: eventType: ".concat(String.valueOf(str)));
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19280a(webView, str, str2);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: a */
    public final void mo19300a(WebView webView, String str) {
        AbstractC12032d dVar;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19288c(webView, str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12015d
    /* renamed from: a */
    public final void mo19227a(AbstractC12021c.C12022a aVar) {
        AbstractC12032d a;
        String[] c;
        boolean a2;
        boolean a3;
        try {
            AbstractC12021c.C12022a aVar2 = new AbstractC12021c.C12022a();
            aVar.f28793y = aVar.f28793y;
            if (aVar.f28770b != null) {
                a = aVar.f28770b;
            } else {
                a = C12036f.m21317a();
            }
            aVar2.f28770b = a;
            aVar2.f28775g = aVar.f28775g != null ? aVar.f28775g : "WebViewMonitor";
            aVar2.f28769a = aVar.f28769a;
            aVar2.f28777i = aVar.f28777i;
            aVar2.f28776h = aVar.f28776h;
            aVar2.f28785q = aVar.f28785q;
            aVar2.f28786r = aVar.f28786r;
            aVar2.f28787s = aVar.f28787s;
            aVar2.f28790v = m21377f();
            aVar2.f28784p = aVar.f28784p;
            aVar2.f28788t = aVar.f28788t;
            aVar2.f28774f = aVar.f28774f;
            aVar2.f28773e = aVar.f28773e;
            aVar2.f28771c = aVar.f28771c;
            aVar2.f28772d = aVar.f28772d;
            aVar2.f28793y = aVar.f28793y;
            aVar2.f28789u = TextUtils.isEmpty(aVar.f28789u) ? "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});" : aVar.f28789u;
            aVar2.f28791w = aVar.f28791w;
            aVar2.f28779k = aVar.f28779k;
            aVar2.f28780l = aVar.f28780l;
            aVar2.f28782n = aVar.f28782n;
            aVar2.f28781m = aVar.f28781m;
            aVar2.f28783o = aVar.f28783o;
            aVar2.f28794z = aVar.f28794z;
            if (!TextUtils.isEmpty(aVar.f28778j)) {
                JSONObject a4 = C11950d.m21097a(aVar.f28778j);
                if (C11950d.m21106d(a4, "webview_classes") == null) {
                    c = aVar2.f28773e;
                } else {
                    c = m21374c(aVar.f28778j);
                }
                aVar2.f28773e = c;
                if (C11950d.m21106d(a4, "webview_is_need_monitor") == null) {
                    a2 = aVar2.f28784p;
                } else {
                    a2 = C11950d.m21103a(C11950d.m21097a(aVar.f28778j), "webview_is_need_monitor", (Boolean) false);
                }
                aVar2.f28784p = a2;
                aVar2.f28789u = TextUtils.isEmpty(aVar.f28778j) ? aVar2.f28789u : new C12042g(aVar.f28778j).mo19316a();
                aVar2.f28779k = C11950d.m21106d(a4, "webview_is_open_blankdetect") == null ? aVar2.f28779k : C11950d.m21103a(a4, "webview_is_open_blankdetect", (Boolean) false);
                aVar2.f28781m = C11950d.m21106d(a4, "webview_is_open_jsb") == null ? aVar2.f28781m : C11950d.m21103a(a4, "webview_is_open_jsb", (Boolean) false);
                aVar2.f28782n = C11950d.m21106d(a4, "webview_is_open_fetch") == null ? aVar2.f28782n : C11950d.m21103a(a4, "webview_is_open_fetch", (Boolean) false);
                aVar2.f28788t = C11950d.m21106d(a4, "webview_is_inject_js") == null ? aVar2.f28788t : C11950d.m21103a(a4, "webview_is_inject_js", (Boolean) false);
                if (C11950d.m21106d(a4, "webview_is_update_page_data") == null) {
                    a3 = aVar2.f28783o;
                } else {
                    a3 = C11950d.m21103a(a4, "webview_is_update_page_data", (Boolean) false);
                }
                aVar2.f28783o = a3;
            }
            String[] strArr = aVar2.f28774f;
            if (!(strArr == null || strArr.length == 0)) {
                for (String str : strArr) {
                    this.f28870h.put(str, aVar2);
                }
            }
            String[] strArr2 = aVar2.f28773e;
            if (!(strArr2 == null || strArr2.length == 0)) {
                for (String str2 : strArr2) {
                    this.f28869g.put(str2, aVar2);
                }
            }
            this.f28871i.clear();
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: com.bytedance.android.monitor.webview.i$a */
    class RunnableC12047a implements Runnable {

        /* renamed from: b */
        private WebView f28887b;

        static {
            Covode.recordClassIndex(13775);
        }

        public final void run() {
            C12044i.this.mo19252b(this.f28887b);
        }

        private RunnableC12047a(WebView webView) {
            this.f28887b = webView;
        }

        /* synthetic */ RunnableC12047a(C12044i iVar, WebView webView, byte b) {
            this(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12015d
    /* renamed from: d */
    public final AbstractC12021c.C12022a mo19228d() {
        return new AbstractC12021c.C12022a();
    }

    /* renamed from: e */
    private static C11942d m21376e() {
        return HybridMonitor.getInstance().getSettingManager().mo19154b();
    }

    /* renamed from: c */
    public final boolean mo19323c() {
        if (!this.f28876o || !this.f28874m) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(13772);
        C12044i iVar = new C12044i();
        f28862a = iVar;
        f28863b = iVar;
    }

    /* renamed from: f */
    private String m21377f() {
        if (this.f28868c == null) {
            return null;
        }
        try {
            File file = new File(this.f28868c.mo19298a() + "/slardar.js");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    private C12044i() {
        C11945c.m21083a("web", this);
        try {
            Class<?> cls = Class.forName("com.bytedance.lynx.webview.TTWebSdk");
            Class<?> cls2 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            Class<?> cls3 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            Class<?> cls4 = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            Method declaredMethod = cls.getDeclaredMethod("registerGlobalWebViewDelegate", cls2);
            C12051l lVar = new C12051l();
            lVar.f28892a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            lVar.f28893b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewDelegate").newInstance();
            declaredMethod.invoke(null, Proxy.newProxyInstance(lVar.f28892a.getClassLoader(), new Class[]{lVar.f28892a}, lVar));
            Method declaredMethod2 = cls.getDeclaredMethod("registerGlobalWebViewClientDelegate", cls3);
            C12050k kVar = new C12050k();
            kVar.f28890a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            kVar.f28891b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewClientDelegate").newInstance();
            declaredMethod2.invoke(null, Proxy.newProxyInstance(kVar.f28890a.getClassLoader(), new Class[]{kVar.f28890a}, kVar));
            Method declaredMethod3 = cls.getDeclaredMethod("registerGlobalWebChromeClientDelegate", cls4);
            C12049j jVar = new C12049j();
            jVar.f28888a = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            jVar.f28889b = Class.forName("com.bytedance.lynx.webview.monitors.WebChromeClientDelegate").newInstance();
            declaredMethod3.invoke(null, Proxy.newProxyInstance(jVar.f28888a.getClassLoader(), new Class[]{jVar.f28888a}, jVar));
            this.f28874m = true;
        } catch (Exception unused) {
            this.f28874m = false;
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: G */
    private void m21363G(WebView webView) {
        View$OnAttachStateChangeListenerC12048b bVar = this.f28872k;
        if (bVar != null) {
            bVar.mo19336a(webView);
        }
    }

    /* renamed from: a */
    private static boolean m21369a(boolean z) {
        if (HybridMonitor.isDebuggable() || z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Class<?> m21370b(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: f */
    public final String mo19306f(WebView webView) {
        AbstractC12021c.C12022a v = mo19332v(webView);
        if (v != null) {
            return v.f28769a;
        }
        return "";
    }

    /* renamed from: A */
    private void m21357A(WebView webView) {
        AbstractC12032d dVar;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19292f(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: B */
    private boolean m21358B(WebView webView) {
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v == null) {
                return false;
            }
            return v.f28788t;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    /* renamed from: C */
    private boolean m21359C(WebView webView) {
        AbstractC12032d dVar;
        AbstractC12021c.C12022a v = mo19332v(webView);
        if (v == null || (dVar = v.f28770b) == null) {
            return false;
        }
        return dVar.mo19293g(webView);
    }

    /* renamed from: D */
    private AbstractC12017f m21360D(WebView webView) {
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v == null) {
                return null;
            }
            return v.f28772d;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* renamed from: E */
    private void m21361E(WebView webView) {
        AbstractC12032d dVar;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19291e(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: w */
    private boolean m21384w(WebView webView) {
        AbstractC12032d dVar;
        AbstractC12021c.C12022a v = mo19332v(webView);
        if (v == null || (dVar = v.f28770b) == null) {
            return false;
        }
        return dVar.mo19294h(webView);
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: c */
    public final void mo19303c(WebView webView) {
        AbstractC12032d dVar;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19287c(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: d */
    public final void mo19304d(WebView webView) {
        AbstractC12032d dVar;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19289d(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: e */
    public final String mo19305e(WebView webView) {
        AbstractC12021c.C12022a v = mo19332v(webView);
        if (v != null) {
            return v.f28793y;
        }
        return "";
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: h */
    public final boolean mo19308h(WebView webView) {
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v == null || !v.f28785q) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: i */
    public final AbstractC11911e mo19309i(WebView webView) {
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v == null) {
                return null;
            }
            return v.f28776h;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo19329o(WebView webView) {
        try {
            if (mo19322b() && mo19307g(webView)) {
                m21383n(webView, f28865e);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo19330q(WebView webView) {
        try {
            if (mo19322b() && mo19307g(webView)) {
                mo19317a(webView, false);
                m21360D(webView);
                m21387z(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo19331s(WebView webView) {
        try {
            if (mo19322b() && mo19307g(webView)) {
                mo19303c(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12014c
    /* renamed from: t */
    public final String mo19226t(WebView webView) {
        if (webView == null) {
            return "";
        }
        return new StringBuilder().append(webView.hashCode()).toString();
    }

    /* renamed from: F */
    private void m21362F(WebView webView) {
        int i = Build.VERSION.SDK_INT;
        if (mo19307g(webView)) {
            String str = f28864d;
            if (!str.equals(m21382m(webView, str))) {
                WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(webView);
                if (!webView.getSettings().getJavaScriptEnabled()) {
                    webView.getSettings().setJavaScriptEnabled(true);
                }
                webView.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
                String str2 = f28864d;
                m21371b(webView, str2, str2);
            }
        }
    }

    /* renamed from: x */
    private AbstractC12013b m21385x(WebView webView) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        try {
            if (mo19322b() && mo19307g(webView) && (v = mo19332v(webView)) != null && (dVar = v.f28770b) != null) {
                return dVar.mo19297k(webView);
            }
            return null;
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
        return null;
    }

    /* renamed from: y */
    private boolean m21386y(WebView webView) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        if (webView == null) {
            return false;
        }
        try {
            if (!mo19307g(webView) || (v = mo19332v(webView)) == null || (dVar = v.f28770b) == null) {
                return false;
            }
            return dVar.mo19284a(webView);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12021c
    /* renamed from: a */
    public final void mo19251a(final WebView webView) {
        if (webView == null) {
            try {
                mo19252b((WebView) null);
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        } else {
            RunnableC12047a aVar = new RunnableC12047a(this, webView, (byte) 0);
            if (m21359C(webView)) {
                this.f28878q.post(aVar);
                return;
            }
            this.f28878q.post(new Runnable() {
                /* class com.bytedance.android.monitor.webview.C12044i.RunnableC120462 */

                static {
                    Covode.recordClassIndex(13774);
                }

                public final void run() {
                    try {
                        C12044i.this.mo19317a(webView, true);
                    } catch (Exception unused) {
                    }
                }
            });
            this.f28878q.postDelayed(aVar, 500);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: g */
    public final boolean mo19307g(WebView webView) {
        boolean z = false;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null) {
                z = v.f28784p;
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
        if (this.f28879r != z) {
            C11937b.m21063b("TTLiveWebViewMonitorHelper", "isNeedMonitor: ".concat(String.valueOf(z)));
            this.f28879r = z;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo19327k(WebView webView) {
        AbstractC12032d dVar;
        try {
            if (!mo19322b() || webView == null) {
                return;
            }
            if (mo19307g(webView)) {
                AbstractC12021c.C12022a v = mo19332v(webView);
                if (v != null && (dVar = v.f28770b) != null) {
                    dVar.mo19285b(webView);
                    return;
                }
                return;
            }
            C12036f a = C12036f.m21317a();
            if (a != null) {
                a.mo19285b(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: l */
    public final void mo19247l(WebView webView) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "destroy: " + C11937b.m21060a(webView));
        if (!mo19323c()) {
            mo19328m(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: n */
    public final void mo19248n(WebView webView) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "reload: " + C11937b.m21060a(webView));
        if (!mo19323c()) {
            mo19329o(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: p */
    public final void mo19249p(WebView webView) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "goBack: " + C11937b.m21060a(webView));
        if (!mo19323c()) {
            mo19330q(webView);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12016e
    /* renamed from: u */
    public final boolean mo19229u(WebView webView) {
        try {
            return ((Boolean) Class.forName("com.bytedance.lynx.webview.TTWebSdk").getDeclaredMethod("isTTWebView", WebView.class).invoke(null, webView)).booleanValue();
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    /* renamed from: H */
    private void m21364H(WebView webView) {
        String str;
        String str2;
        try {
            int i = Build.VERSION.SDK_INT;
            String url = webView.getUrl();
            if (url == null || !url.equals("about:blank")) {
                String m = m21382m(webView, f28865e);
                if (!TextUtils.isEmpty(url) && !url.equals(m)) {
                    AbstractC12021c.C12022a v = mo19332v(webView);
                    if (v == null) {
                        str = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
                        str2 = "";
                    } else {
                        str = v.f28789u;
                        str2 = v.f28790v;
                        if (m21369a(v.f28788t)) {
                        }
                        m21371b(webView, f28865e, url);
                        C11937b.m21062a("WebViewMonitorHelper", "injectJsScript : ".concat(String.valueOf(url)));
                    }
                    if (m21376e().f28571e) {
                        webView.evaluateJavascript(C12035a.m21315a(webView.getContext(), str2, str), null);
                    }
                    m21371b(webView, f28865e, url);
                    C11937b.m21062a("WebViewMonitorHelper", "injectJsScript : ".concat(String.valueOf(url)));
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: c */
    private static String[] m21374c(String str) {
        JSONArray optJSONArray;
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str) || (optJSONArray = C11950d.m21097a(str).optJSONArray("webview_classes")) == null) {
            return strArr;
        }
        String[] strArr2 = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                strArr2[i] = optJSONArray.getString(i);
            } catch (JSONException unused) {
            }
        }
        return strArr2;
    }

    /* renamed from: z */
    private void m21387z(WebView webView) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleBlankDetect: " + C11937b.m21060a(webView));
        try {
            if (!m21359C(webView) && webView != null && webView.getUrl() != null) {
                if (!webView.getUrl().equals("about:blank")) {
                    if (mo19307g(webView) && (v = mo19332v(webView)) != null && m21369a(v.f28779k) && m21376e().f28568b && (dVar = v.f28770b) != null && !m21359C(webView)) {
                        dVar.mo19277a(webView, C23558a.m44305a(webView));
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: j */
    public final void mo19246j(WebView webView) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleViewCreate: " + C11937b.m21060a(webView));
        if (!mo19323c()) {
            mo19327k(webView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo19328m(WebView webView) {
        try {
            if (mo19322b() && mo19307g(webView)) {
                mo19317a(webView, false);
                m21360D(webView);
                m21387z(webView);
                m21357A(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: r */
    public final void mo19250r(WebView webView) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", webView.getClass().getSimpleName() + " attachToWindow, container: " + webView.getContext().getClass().getName() + ", isTTWebEnable: " + mo19323c());
        if (!mo19323c()) {
            mo19331s(webView);
        }
    }

    /* renamed from: v */
    public final AbstractC12021c.C12022a mo19332v(WebView webView) {
        AbstractC12021c.C12022a aVar;
        if (webView == null) {
            return null;
        }
        AbstractC12021c.C12022a aVar2 = this.f28870h.get(mo19226t(webView));
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        AbstractC12021c.C12022a aVar3 = this.f28869g.get(name);
        if (aVar3 != null) {
            return aVar3;
        }
        if (this.f28871i.contains(name)) {
            return null;
        }
        for (String str : new HashSet(this.f28869g.keySet())) {
            if (m21368a(name, str) && (aVar = this.f28869g.get(str)) != null) {
                this.f28869g.put(name, aVar);
                return aVar;
            }
        }
        this.f28871i.add(name);
        return null;
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12021c
    /* renamed from: b */
    public final void mo19252b(WebView webView) {
        try {
            if (!m21386y(webView)) {
                try {
                    AbstractC12021c.C12022a v = mo19332v(webView);
                    if (v != null) {
                        AbstractC12032d dVar = v.f28770b;
                        if (dVar != null) {
                            dVar.mo19296j(webView);
                        }
                    }
                } catch (Exception unused) {
                    HybridMonitor.getInstance().getExceptionHandler();
                }
                m21360D(webView);
                m21387z(webView);
                m21379j(webView, "loc_after_detach");
                m21383n(webView, f28865e);
                m21383n(webView, f28866f);
                m21383n(webView, f28864d);
                this.f28870h.remove(mo19226t(webView));
                View$OnAttachStateChangeListenerC12048b bVar = this.f28872k;
                if (bVar != null && webView != null) {
                    webView.removeOnAttachStateChangeListener(bVar);
                }
            }
        } catch (Exception unused2) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    private static boolean m21368a(String str, String str2) {
        Class<?> b = m21370b(str);
        Class<?> b2 = m21370b(str2);
        if (b == null || b2 == null) {
            return false;
        }
        return b2.isAssignableFrom(b);
    }

    /* renamed from: k */
    private void m21380k(WebView webView, String str) {
        if (mo19307g(webView)) {
            String str2 = f28866f;
            if (!str2.equals(m21382m(webView, str2))) {
                m21363G(webView);
                String str3 = f28866f;
                m21371b(webView, str3, str3);
            }
            m21381l(webView, str);
        }
    }

    /* renamed from: l */
    private void m21381l(WebView webView, String str) {
        AbstractC12032d dVar;
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19286b(webView, str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: n */
    private void m21383n(WebView webView, String str) {
        f28867j.remove(str + mo19226t(webView));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo19325f(WebView webView, String str) {
        try {
            if (!mo19322b()) {
                this.f28873l.mo19219a(webView, str);
            } else if (mo19307g(webView)) {
                m21361E(webView);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: g */
    public final void mo19245g(WebView webView, String str) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "onLoadUrl: ".concat(String.valueOf(str)));
        if (!mo19323c()) {
            mo19326h(webView, str);
        }
    }

    /* renamed from: c */
    private void m21373c(WebView webView, int i) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        if (webView != null) {
            try {
                if (mo19307g(webView) && m21384w(webView) && (v = mo19332v(webView)) != null && (dVar = v.f28770b) != null) {
                    dVar.mo19272a(webView, i);
                }
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    /* renamed from: d */
    private void m21375d(WebView webView, int i) {
        if (mo19307g(webView) && i >= 15 && webView != null) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            m21364H(webView);
        }
    }

    /* renamed from: i */
    private boolean m21378i(WebView webView, String str) {
        AbstractC12021c.C12022a v;
        AbstractC12032d dVar;
        if ((!TextUtils.isEmpty(str) && !"about:blank".equals(str)) || (v = mo19332v(webView)) == null || (dVar = v.f28770b) == null) {
            return false;
        }
        String i = dVar.mo19295i(webView);
        if (TextUtils.isEmpty(i) || i.equals("about:blank")) {
            return false;
        }
        return true;
        return false;
    }

    /* renamed from: j */
    private void m21379j(WebView webView, String str) {
        AbstractC12032d dVar;
        AbstractC12021c.C12022a v = mo19332v(webView);
        if (v != null && v.f28787s != null && (dVar = v.f28770b) != null) {
            if ("loc_force".equals(str) || "loc_after_detach".equals(str) || v.f28787s.equals(str)) {
                dVar.mo19290d(webView, str);
            }
        }
    }

    /* renamed from: m */
    private String m21382m(WebView webView, String str) {
        String t = mo19226t(webView);
        String str2 = f28867j.get(str + t);
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(t, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19318b(WebView webView, int i) {
        try {
            if (mo19322b()) {
                m21375d(webView, i);
                m21373c(webView, i);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: e */
    public final void mo19244e(WebView webView, String str) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "onPageFinished: ".concat(String.valueOf(str)));
        if (!mo19323c()) {
            mo19325f(webView, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo19324d(WebView webView, String str) {
        try {
            if (!mo19322b()) {
                this.f28873l.mo19218a();
            } else {
                m21380k(webView, str);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo19326h(WebView webView, String str) {
        AbstractC12032d dVar;
        try {
            if (mo19322b() && mo19307g(webView) && !str.contains("javascript:")) {
                m21383n(webView, f28865e);
                C11937b.m21062a("TTLiveWebViewMonitorHelper", "onLoadUrl : ".concat(String.valueOf(str)));
                if (m21378i(webView, str)) {
                    mo19317a(webView, false);
                    mo19332v(webView);
                    m21387z(webView);
                }
                m21362F(webView);
                AbstractC12021c.C12022a v = mo19332v(webView);
                if (v != null && (dVar = v.f28770b) != null) {
                    dVar.mo19278a(webView, str);
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: a */
    public final void mo19237a(WebView webView, int i) {
        if (!mo19323c()) {
            mo19318b(webView, i);
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: c */
    public final void mo19243c(WebView webView, String str) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "onPageStarted:".concat(String.valueOf(str)));
        if (!mo19323c()) {
            mo19324d(webView, str);
        }
    }

    @Override // com.bytedance.android.monitor.webview.AbstractC12034e
    /* renamed from: a */
    public final void mo19299a(WebView webView, long j) {
        AbstractC12032d dVar;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "injectJS: " + C11937b.m21060a(webView));
        try {
            AbstractC12021c.C12022a v = mo19332v(webView);
            if (v != null && (dVar = v.f28770b) != null) {
                dVar.mo19273a(webView, j);
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12019h
    /* renamed from: b */
    public final void mo19236b(WebView webView, long j) {
        String str;
        if (j > 0 && webView != null) {
            JSONObject jSONObject = new JSONObject();
            Uri parse = Uri.parse(webView.getUrl());
            C11950d.m21101a(jSONObject, "url", parse.toString());
            C11950d.m21101a(jSONObject, "host", parse.getHost());
            C11950d.m21101a(jSONObject, "path", parse.getPath());
            String str2 = "true";
            if (!mo19322b() || !mo19307g(webView)) {
                str = "false";
            } else {
                str = str2;
            }
            C11950d.m21101a(jSONObject, "hybrid_monitor_switch", str);
            if (!mo19322b() || !m21358B(webView)) {
                str2 = "false";
            }
            C11950d.m21101a(jSONObject, "js_inject_switch", str2);
            C11950d.m21101a(jSONObject, "container_type", "web");
            JSONObject jSONObject2 = new JSONObject();
            C11950d.m21099a(jSONObject2, "web_page_cost", j);
            mo19231a(webView, webView.getUrl(), "performance_test", jSONObject.toString(), jSONObject2.toString(), null);
        }
    }

    /* renamed from: b */
    private void m21371b(WebView webView, String str, String str2) {
        f28867j.put(str + mo19226t(webView), str2);
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: a */
    public final void mo19239a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleRequestError: " + C11937b.m21060a(webView) + ", error: " + webResourceError);
        if (!mo19323c()) {
            mo19320b(webView, webResourceRequest, webResourceError);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19320b(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC12021c.C12022a v;
        try {
            if (mo19322b() && webView != null && webResourceRequest != null && webResourceError != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (mo19307g(webView) && m21384w(webView) && (v = mo19332v(webView)) != null) {
                        if (m21369a(v.f28780l)) {
                            AbstractC12032d dVar = v.f28770b;
                            if (dVar != null) {
                                dVar.mo19283a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), webResourceError.getErrorCode(), webResourceError.getDescription().toString(), 0);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitor.webview.p722b.AbstractC12020i
    /* renamed from: a */
    public final void mo19238a(WebView webView, int i, String str, String str2) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "handleRequestError: " + C11937b.m21060a(webView) + ", errorCode: " + i);
        if (!mo19323c()) {
            mo19319b(webView, i, str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19319b(WebView webView, int i, String str, String str2) {
        AbstractC12021c.C12022a v;
        try {
            if (mo19322b() && webView != null && str != null && str2 != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    if (mo19307g(webView) && m21384w(webView) && (v = mo19332v(webView)) != null) {
                        if (m21369a(v.f28780l)) {
                            AbstractC12032d dVar = v.f28770b;
                            if (dVar != null) {
                                dVar.mo19283a(webView, str2, true, i, str, 0);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    private static void m21367a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        m21366a(null, str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, z);
    }

    /* renamed from: b */
    private void m21372b(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        JSONObject jSONObject5 = jSONObject4;
        String str3 = str;
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "customReportInner: url: " + str3 + ", eventName: " + str2);
        if (webView != null) {
            String str4 = "";
            try {
                AbstractC12013b x = m21385x(webView);
                if (x != null) {
                    if (jSONObject5 == null) {
                        jSONObject5 = new JSONObject();
                    }
                    C11950d.m21101a(jSONObject5, "virtual_aid", x.mo19221a());
                    str4 = x.mo19222b();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = x.mo19223c();
                    }
                }
                AbstractC12009a aVar = null;
                AbstractC12021c.C12022a v = mo19332v(webView);
                if (v != null) {
                    aVar = v.f28777i;
                }
                m21366a(aVar, str4, str3, str2, jSONObject, jSONObject2, jSONObject3, jSONObject5, z);
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        } else {
            m21367a("", str3, str2, jSONObject, jSONObject2, jSONObject3, jSONObject5, z);
        }
    }

    /* renamed from: a */
    private static void m21366a(AbstractC12009a aVar, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        C11937b.m21063b("TTLiveWebViewMonitorHelper", "custom final: biz: " + str + ", url: " + str2 + ", eventName: " + str3);
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        C11950d.m21098a(jSONObject4, "platform", 0);
        C11919c.C11920a aVar2 = new C11919c.C11920a(str3);
        aVar2.f28481b = str;
        aVar2.f28480a = str2;
        aVar2.f28482c = jSONObject;
        aVar2.f28483d = jSONObject2;
        aVar2.f28484e = jSONObject3;
        aVar2.f28486g = jSONObject4;
        aVar2.f28487h = z;
        aVar2.f28488i = aVar;
        HybridMonitor.getInstance().customReport(aVar2.mo19133a());
    }
}
