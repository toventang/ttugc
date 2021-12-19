package com.bytedance.android.monitorV2.webview;

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
import com.bytedance.android.monitorV2.C12079d;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p728a.AbstractC12070e;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p731d.C12086e;
import com.bytedance.android.monitorV2.p731d.C12087f;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p735h.p736a.C12103e;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.C12119b;
import com.bytedance.android.monitorV2.p739k.C12121d;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.AbstractC12208d;
import com.bytedance.android.monitorV2.webview.p747a.C12189a;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12191a;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12194d;
import com.bytedance.android.monitorV2.webview.p752d.AbstractC12210a;
import com.bytedance.android.monitorV2.webview.p753e.C12212a;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1753c.C23558a;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.n */
public final class C12230n implements AbstractC12208d, AbstractC12213f {

    /* renamed from: a */
    public static AbstractC12208d f29448a;

    /* renamed from: b */
    public static AbstractC12213f f29449b;

    /* renamed from: d */
    private static String f29450d = "[?&]bd_hybrid_monitor_bid=([^&#]+)";

    /* renamed from: e */
    private static String f29451e = "webview_tag";

    /* renamed from: f */
    private static String f29452f = "webview_last_url_tag";

    /* renamed from: g */
    private static String f29453g = "webview_auto_report_tag";

    /* renamed from: k */
    private static Map<String, String> f29454k = new HashMap();

    /* renamed from: c */
    public AbstractC12210a f29455c;

    /* renamed from: h */
    private Map<String, AbstractC12208d.C12209a> f29456h = new HashMap();

    /* renamed from: i */
    private Map<String, AbstractC12208d.C12209a> f29457i = new HashMap();

    /* renamed from: j */
    private Set<String> f29458j = new HashSet();

    /* renamed from: l */
    private View$OnAttachStateChangeListenerC12233b f29459l = new View$OnAttachStateChangeListenerC12233b((byte) 0);

    /* renamed from: m */
    private C12189a f29460m = new C12189a();

    /* renamed from: n */
    private boolean f29461n = false;

    /* renamed from: o */
    private boolean f29462o = true;

    /* renamed from: p */
    private boolean f29463p = false;

    /* renamed from: q */
    private boolean f29464q = false;

    /* renamed from: r */
    private Handler f29465r = new Handler(Looper.getMainLooper());

    /* renamed from: s */
    private boolean f29466s = false;

    @Override // com.bytedance.android.monitorV2.p739k.AbstractC12120c
    /* renamed from: a */
    public final void mo19495a(String str, Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.webview.n$b */
    public static class View$OnAttachStateChangeListenerC12233b implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(13964);
        }

        private View$OnAttachStateChangeListenerC12233b() {
        }

        /* synthetic */ View$OnAttachStateChangeListenerC12233b(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo19687a(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
                webView.addOnAttachStateChangeListener(this);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            if (view instanceof WebView) {
                C12230n.f29449b.mo19631c((WebView) view);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                C12230n.f29449b.mo19632d(webView);
                if (C12230n.f29449b.mo19636h(webView)) {
                    C12230n.f29448a.mo19596a(webView);
                }
            }
        }
    }

    /* renamed from: a */
    public static AbstractC12208d m21942a() {
        return f29448a;
    }

    /* renamed from: b */
    public final boolean mo19673b() {
        boolean z = this.f29462o && m21952e().mo19467a() && m21952e().mo19468b();
        if (this.f29464q != z) {
            C12115b.m21583b("WebViewMonitorHelper", "monitor enabled: ".concat(String.valueOf(z)));
            this.f29464q = z;
        }
        return z;
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: a */
    public final void mo19580a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C12115b.m21583b("WebViewMonitorHelper", "handleRequestError: " + C12115b.m21579a(webView) + ", error: " + webResourceError);
        if (!mo19674c()) {
            mo19671b(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: a */
    public final void mo19581a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C12115b.m21583b("WebViewMonitorHelper", "handleRequestHttpError: " + C12115b.m21579a(webView) + ", request: " + webResourceRequest);
        if (!mo19674c()) {
            mo19672b(webView, webResourceRequest, webResourceResponse);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19672b(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        try {
            if (mo19673b() && webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (mo19635g(webView) && m21961x(webView) && (w = mo19684w(webView)) != null) {
                        if (m21945a(w.f29377j)) {
                            if (mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                                eVar.mo19612a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), 0, webResourceResponse.getReasonPhrase(), webResourceResponse.getStatusCode());
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12196f
    /* renamed from: a */
    public final void mo19575a(WebView webView, C12086e eVar) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar2;
        C12115b.m21583b("WebViewMonitorHelper", "handleJSBError: " + C12115b.m21579a(webView));
        try {
            if (mo19673b() && webView != null && mo19635g(webView) && m21961x(webView) && m21952e().mo19470d() && (w = mo19684w(webView)) != null && mo19682s(webView) != null && (eVar2 = w.f29369b) != null) {
                eVar2.mo19606a(webView, eVar);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12196f
    /* renamed from: a */
    public final void mo19576a(WebView webView, C12087f fVar) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        C12115b.m21583b("WebViewMonitorHelper", "handleJSBInfo: " + C12115b.m21579a(webView));
        try {
            if (mo19673b() && webView != null && mo19635g(webView) && m21961x(webView) && m21952e().mo19470d() && (w = mo19684w(webView)) != null && mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                eVar.mo19607a(webView, fVar);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    public final void mo19668a(WebView webView, boolean z) {
        if (mo19684w(webView) != null && mo19635g(webView)) {
            C12221l.m21879a().mo19661m(webView);
            if (m21952e().mo19476j()) {
                String a = C1764a.m5928a(" javascript: (function () {\n    var target = {}\n    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n    var performacess = SlardarHybrid('getLatestPerformance');\n    var resourcess = SlardarHybrid('getLatestResource');\n    var cacheData = SlardarHybrid('flushCacheData');\n    target.performance = performacess;\n    target.resource = resourcess;\n    target.cacheData = cacheData;\n    target.needReport = %s;\n    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n })()", new Object[]{z ? "true" : "false"});
                if (webView != null) {
                    int i = Build.VERSION.SDK_INT;
                    webView.evaluateJavascript(a, null);
                }
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12195e
    /* renamed from: a */
    public final void mo19573a(WebView webView, C12084d dVar) {
        JSONObject jSONObject;
        if (webView != null) {
            AbstractC12191a y = m21962y(webView);
            if (y != null) {
                if (TextUtils.isEmpty(dVar.f28951b)) {
                    dVar.f28951b = y.mo19568b();
                }
                if (TextUtils.isEmpty(dVar.f28950a)) {
                    dVar.f28950a = y.mo19569c();
                }
                if (TextUtils.isEmpty(dVar.f28962m)) {
                    dVar.f28962m = y.mo19567a();
                }
            }
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (!(w == null || w.f29375h == null)) {
                dVar.f28964o = w.f29375h;
            }
            if (TextUtils.isEmpty(dVar.f28951b)) {
                dVar.f28951b = mo19633e(webView);
            }
        }
        C12218k l = C12221l.m21879a().mo19660l(webView);
        JSONObject jSONObject2 = null;
        if (l != null) {
            jSONObject = l.f29406a != null ? l.f29406a.mo19416a() : null;
            if (l.f29409d != null) {
                jSONObject2 = l.f29409d.mo19416a();
            }
        } else {
            jSONObject = null;
        }
        dVar.f28960k = jSONObject2;
        dVar.f28959j = jSONObject;
        C12097a.C12098a a = m21941a(dVar.f28951b);
        JSONObject jSONObject3 = new JSONObject();
        C12130f.m21652a(jSONObject3, "bid", dVar.f28951b);
        C12130f.m21652a(jSONObject3, "setting_bid", a.f29047a);
        C12130f.m21650a(jSONObject3, "hit_sample", a.f29048b);
        C12130f.m21650a(jSONObject3, "setting_id", a.f29049c);
        C12130f.m21649a(jSONObject3, "can_sample", dVar.f28963n);
        dVar.f28956g = jSONObject3;
        C12130f.m21649a(dVar.f28958i, "platform", 0);
        HybridMultiMonitor.getInstance().customReportInner(dVar);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: a */
    public final void mo19630a(WebView webView, String str, String str2, String str3) {
        AbstractC12211e eVar;
        C12115b.m21583b("WebViewMonitorHelper", "cover: url: " + str + ", service: " + str2);
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19611a(webView, str, str2, str3);
                m21955j(webView, "loc_after_tti");
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: a */
    public final void mo19629a(WebView webView, String str, String str2) {
        AbstractC12211e eVar;
        C12115b.m21583b("WebViewMonitorHelper", "report direct: eventType: ".concat(String.valueOf(str)));
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                eVar.mo19610a(webView, str, str2);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: a */
    public final void mo19628a(WebView webView, String str) {
        AbstractC12211e eVar;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19617c(webView, str);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: a */
    public final void mo19627a(WebView webView, long j) {
        AbstractC12211e eVar;
        C12115b.m21583b("WebViewMonitorHelper", "injectJS: " + C12115b.m21579a(webView));
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19604a(webView, j);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12192b
    /* renamed from: a */
    public final void mo19570a(AbstractC12208d.C12209a aVar) {
        AbstractC12211e a;
        String[] c;
        boolean optBoolean;
        String a2;
        try {
            AbstractC12208d.C12209a aVar2 = new AbstractC12208d.C12209a();
            aVar.f29386s = aVar.f29386s;
            if (aVar.f29369b != null) {
                a = aVar.f29369b;
            } else {
                a = C12221l.m21879a();
            }
            aVar2.f29369b = a;
            aVar2.f29368a = aVar.f29368a;
            aVar2.f29375h = aVar.f29375h;
            aVar2.f29374g = aVar.f29374g;
            aVar2.f29379l = aVar.f29379l;
            aVar2.f29380m = aVar.f29380m;
            aVar2.f29383p = m21953f();
            aVar2.f29378k = aVar.f29378k;
            aVar2.f29373f = aVar.f29373f;
            aVar2.f29372e = aVar.f29372e;
            aVar2.f29370c = aVar.f29370c;
            aVar2.f29386s = aVar.f29386s;
            aVar2.f29371d = aVar.f29371d;
            aVar2.f29382o = TextUtils.isEmpty(aVar.f29382o) ? "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});" : aVar.f29382o;
            aVar2.f29384q = aVar.f29384q;
            aVar2.f29377j = aVar.f29377j;
            aVar2.f29387t = aVar.f29387t;
            if (!TextUtils.isEmpty(aVar.f29376i)) {
                JSONObject a3 = C12130f.m21648a(aVar.f29376i);
                if (C12130f.m21659e(a3, "webview_classes") == null) {
                    c = aVar2.f29372e;
                } else {
                    c = m21950c(aVar.f29376i);
                }
                aVar2.f29372e = c;
                if (C12130f.m21659e(a3, "webview_is_need_monitor") == null) {
                    optBoolean = aVar2.f29378k;
                } else {
                    Boolean bool = false;
                    optBoolean = C12130f.m21648a(aVar.f29376i).optBoolean("webview_is_need_monitor", bool.booleanValue());
                }
                aVar2.f29378k = optBoolean;
                if (TextUtils.isEmpty(aVar.f29376i)) {
                    a2 = aVar2.f29382o;
                } else {
                    a2 = new C12229m(aVar.f29376i).mo19667a();
                }
                aVar2.f29382o = a2;
            }
            String[] strArr = aVar2.f29373f;
            if (!(strArr == null || strArr.length == 0)) {
                for (String str : strArr) {
                    this.f29457i.put(str, aVar2);
                }
            }
            String[] strArr2 = aVar2.f29372e;
            if (!(strArr2 == null || strArr2.length == 0)) {
                for (String str2 : strArr2) {
                    this.f29456h.put(str2, aVar2);
                }
            }
            this.f29458j.clear();
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12195e
    /* renamed from: b */
    public final void mo19574b(WebView webView, String str, String str2, String str3) {
        String str4;
        JSONObject jSONObject;
        JSONObject a = C12130f.m21648a(str);
        JSONObject a2 = C12130f.m21648a(str2);
        JSONObject a3 = C12130f.m21648a(str3);
        if (mo19684w(webView) != null && mo19682s(webView) != null) {
            AbstractC12190b bVar = null;
            C12115b.m21583b("WebViewMonitorHelper", "customReportInner: url: " + ((String) null) + ", eventName: " + ((String) null));
            if (webView != null) {
                String str5 = "";
                try {
                    AbstractC12191a y = m21962y(webView);
                    if (y != null) {
                        jSONObject = new JSONObject();
                        C12130f.m21652a(jSONObject, "virtual_aid", y.mo19567a());
                        str5 = y.mo19568b();
                        str4 = TextUtils.isEmpty(null) ? y.mo19569c() : null;
                    } else {
                        str4 = null;
                        jSONObject = null;
                    }
                    AbstractC12208d.C12209a w = mo19684w(webView);
                    if (w != null) {
                        bVar = w.f29375h;
                    }
                    m21943a(webView, bVar, str5, str4, null, a, a2, a3, jSONObject, 0);
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            } else {
                m21943a(null, null, "", null, null, a, a2, a3, null, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.webview.n$a */
    class RunnableC12232a implements Runnable {

        /* renamed from: b */
        private WebView f29470b;

        static {
            Covode.recordClassIndex(13963);
        }

        public final void run() {
            C12230n.this.mo19597b(this.f29470b);
        }

        private RunnableC12232a(WebView webView) {
            this.f29470b = webView;
        }

        /* synthetic */ RunnableC12232a(C12230n nVar, WebView webView, byte b) {
            this(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12192b
    /* renamed from: d */
    public final AbstractC12208d.C12209a mo19571d() {
        return new AbstractC12208d.C12209a();
    }

    /* renamed from: e */
    private static C12103e m21952e() {
        return HybridMultiMonitor.getInstance().getHybridSettingManager().mo19480c();
    }

    /* renamed from: c */
    public final boolean mo19674c() {
        if (!this.f29463p || !this.f29461n) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(13961);
        C12230n nVar = new C12230n();
        f29448a = nVar;
        f29449b = nVar;
    }

    /* renamed from: f */
    private String m21953f() {
        if (this.f29455c == null) {
            return null;
        }
        try {
            File file = new File(this.f29455c.mo19602a() + "/slardar.js");
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    private C12230n() {
        C12121d.m21609a("web", this);
        try {
            Class<?> cls = Class.forName("com.bytedance.lynx.webview.TTWebSdk");
            Class<?> cls2 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            Class<?> cls3 = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            Class<?> cls4 = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            Method declaredMethod = cls.getDeclaredMethod("registerGlobalWebViewDelegate", cls2);
            C12216i iVar = new C12216i();
            iVar.f29401a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewDelegate");
            iVar.f29402b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewDelegate").newInstance();
            declaredMethod.invoke(null, Proxy.newProxyInstance(iVar.f29401a.getClassLoader(), new Class[]{iVar.f29401a}, iVar));
            Method declaredMethod2 = cls.getDeclaredMethod("registerGlobalWebViewClientDelegate", cls3);
            C12215h hVar = new C12215h();
            hVar.f29399a = Class.forName("com.bytedance.lynx.webview.monitors.IWebViewClientDelegate");
            hVar.f29400b = Class.forName("com.bytedance.lynx.webview.monitors.WebViewClientDelegate").newInstance();
            declaredMethod2.invoke(null, Proxy.newProxyInstance(hVar.f29399a.getClassLoader(), new Class[]{hVar.f29399a}, hVar));
            Method declaredMethod3 = cls.getDeclaredMethod("registerGlobalWebChromeClientDelegate", cls4);
            C12214g gVar = new C12214g();
            gVar.f29397a = Class.forName("com.bytedance.lynx.webview.monitors.IWebChromeClientDelegate");
            gVar.f29398b = Class.forName("com.bytedance.lynx.webview.monitors.WebChromeClientDelegate").newInstance();
            declaredMethod3.invoke(null, Proxy.newProxyInstance(gVar.f29397a.getClassLoader(), new Class[]{gVar.f29397a}, gVar));
            this.f29461n = true;
        } catch (Exception unused) {
            this.f29461n = false;
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: H */
    private void m21939H(WebView webView) {
        View$OnAttachStateChangeListenerC12233b bVar = this.f29459l;
        if (bVar != null) {
            bVar.mo19687a(webView);
        }
    }

    /* renamed from: a */
    static boolean m21945a(boolean z) {
        if (HybridMultiMonitor.isDebuggable() || z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Class<?> m21946b(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: f */
    public final String mo19634f(WebView webView) {
        AbstractC12208d.C12209a w = mo19684w(webView);
        if (w != null) {
            return w.f29368a;
        }
        return "";
    }

    /* renamed from: s */
    public final C12097a.C12098a mo19682s(WebView webView) {
        if (webView == null) {
            return null;
        }
        return m21941a(mo19633e(webView));
    }

    /* renamed from: C */
    private void m21934C(WebView webView) {
        AbstractC12211e eVar;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19621f(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: D */
    private boolean m21935D(WebView webView) {
        AbstractC12211e eVar;
        AbstractC12208d.C12209a w = mo19684w(webView);
        if (w == null || (eVar = w.f29369b) == null) {
            return false;
        }
        return eVar.mo19622g(webView);
    }

    /* renamed from: E */
    private AbstractC12194d m21936E(WebView webView) {
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w == null) {
                return null;
            }
            return w.f29371d;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* renamed from: F */
    private void m21937F(WebView webView) {
        AbstractC12211e eVar;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19620e(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: a */
    private static C12097a.C12098a m21941a(String str) {
        return HybridMultiMonitor.getInstance().getHybridSettingManager().mo19479b().mo19449a(str);
    }

    /* renamed from: r */
    public static JSONObject m21960r(WebView webView) {
        return C12221l.m21879a().mo19655a(C12221l.m21879a().mo19624i(webView));
    }

    /* renamed from: x */
    private boolean m21961x(WebView webView) {
        AbstractC12211e eVar;
        AbstractC12208d.C12209a w = mo19684w(webView);
        if (w == null || (eVar = w.f29369b) == null) {
            return false;
        }
        return eVar.mo19623h(webView);
    }

    /* renamed from: z */
    private static String m21963z(WebView webView) {
        if (webView == null) {
            return "";
        }
        return new StringBuilder().append(webView.hashCode()).toString();
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: c */
    public final void mo19631c(WebView webView) {
        AbstractC12211e eVar;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19616c(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: d */
    public final void mo19632d(WebView webView) {
        AbstractC12211e eVar;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && (eVar = w.f29369b) != null) {
                eVar.mo19618d(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: i */
    public final AbstractC12070e mo19637i(WebView webView) {
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w == null) {
                return null;
            }
            return w.f29374g;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo19680o(WebView webView) {
        try {
            if (mo19673b() && mo19635g(webView)) {
                m21959n(webView, f29452f);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo19681q(WebView webView) {
        try {
            if (mo19673b() && mo19635g(webView)) {
                mo19668a(webView, false);
                m21936E(webView);
                m21933B(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo19683u(WebView webView) {
        try {
            if (mo19673b() && mo19635g(webView)) {
                mo19631c(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: A */
    private boolean m21932A(WebView webView) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        if (webView == null) {
            return false;
        }
        try {
            if (!mo19635g(webView) || (w = mo19684w(webView)) == null || (eVar = w.f29369b) == null) {
                return false;
            }
            return eVar.mo19613a(webView);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    /* renamed from: G */
    private void m21938G(WebView webView) {
        int i = Build.VERSION.SDK_INT;
        if (mo19635g(webView)) {
            String str = f29451e;
            if (!str.equals(m21958m(webView, str))) {
                WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(webView);
                if (!webView.getSettings().getJavaScriptEnabled()) {
                    webView.getSettings().setJavaScriptEnabled(true);
                }
                webView.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
                String str2 = f29451e;
                m21948b(webView, str2, str2);
            }
        }
    }

    /* renamed from: y */
    private AbstractC12191a m21962y(WebView webView) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        try {
            if (mo19673b() && mo19635g(webView) && (w = mo19684w(webView)) != null && (eVar = w.f29369b) != null) {
                return eVar.mo19626k(webView);
            }
            return null;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
        return null;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: g */
    public final boolean mo19635g(WebView webView) {
        boolean z = false;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null) {
                z = w.f29378k;
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
        if (this.f29466s != z) {
            C12115b.m21583b("WebViewMonitorHelper", "isNeedMonitor: ".concat(String.valueOf(z)));
            this.f29466s = z;
        }
        return z;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: h */
    public final boolean mo19636h(WebView webView) {
        try {
            if (mo19684w(webView) != null) {
                C12103e e = m21952e();
                C12115b.m21584c("HybridMonitor", C1764a.m5928a("switch webEnableAutoReport: %b", new Object[]{Boolean.valueOf(e.f29112l)}));
                if (e.f29112l) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo19678k(WebView webView) {
        AbstractC12211e eVar;
        try {
            if (!mo19673b() || webView == null) {
                return;
            }
            if (mo19635g(webView)) {
                AbstractC12208d.C12209a w = mo19684w(webView);
                if (w != null && mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                    eVar.mo19614b(webView);
                    return;
                }
                return;
            }
            C12221l a = C12221l.m21879a();
            if (a != null) {
                a.mo19614b(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: l */
    public final void mo19586l(WebView webView) {
        C12115b.m21583b("WebViewMonitorHelper", "destroy: " + C12115b.m21579a(webView));
        if (!mo19674c()) {
            mo19679m(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: n */
    public final void mo19587n(WebView webView) {
        C12115b.m21583b("WebViewMonitorHelper", "reload: " + C12115b.m21579a(webView));
        if (!mo19674c()) {
            mo19680o(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: p */
    public final void mo19588p(WebView webView) {
        C12115b.m21583b("WebViewMonitorHelper", "goBack: " + C12115b.m21579a(webView));
        if (!mo19674c()) {
            mo19681q(webView);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12193c
    /* renamed from: v */
    public final boolean mo19572v(WebView webView) {
        try {
            return ((Boolean) Class.forName("com.bytedance.lynx.webview.TTWebSdk").getDeclaredMethod("isTTWebView", WebView.class).invoke(null, webView)).booleanValue();
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return false;
        }
    }

    /* renamed from: B */
    private void m21933B(WebView webView) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        C12115b.m21583b("WebViewMonitorHelper", "handleBlankDetect: " + C12115b.m21579a(webView));
        try {
            if (!m21935D(webView) && webView != null && webView.getUrl() != null) {
                if (!webView.getUrl().equals("about:blank")) {
                    if (mo19635g(webView) && (w = mo19684w(webView)) != null && m21952e().mo19469c() && mo19682s(webView) != null && mo19682s(webView) != null && (eVar = w.f29369b) != null && !m21935D(webView)) {
                        eVar.mo19608a(webView, C23558a.m44305a(webView));
                    }
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: I */
    private void m21940I(WebView webView) {
        String str;
        String str2;
        try {
            int i = Build.VERSION.SDK_INT;
            String url = webView.getUrl();
            if (url == null || !url.equals("about:blank")) {
                String m = m21958m(webView, f29452f);
                if (!TextUtils.isEmpty(url) && !url.equals(m)) {
                    AbstractC12208d.C12209a w = mo19684w(webView);
                    if (w == null) {
                        str = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
                        str2 = "";
                    } else {
                        str = w.f29382o;
                        str2 = w.f29383p;
                    }
                    boolean a = m21945a(m21952e().mo19471e());
                    if (a && m21952e().mo19471e()) {
                        webView.evaluateJavascript(C12212a.m21843a(webView.getContext(), str2, str, a), null);
                    }
                    m21948b(webView, f29452f, url);
                    C12115b.m21581a("WebViewMonitorHelper", "injectJsScript : ".concat(String.valueOf(url)));
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: c */
    private static String[] m21950c(String str) {
        JSONArray optJSONArray;
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str) || (optJSONArray = C12130f.m21648a(str).optJSONArray("webview_classes")) == null) {
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

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12208d
    /* renamed from: b */
    public final void mo19597b(WebView webView) {
        try {
            if (!m21932A(webView)) {
                try {
                    AbstractC12208d.C12209a w = mo19684w(webView);
                    if (w != null) {
                        AbstractC12211e eVar = w.f29369b;
                        if (eVar != null) {
                            eVar.mo19625j(webView);
                        }
                    }
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
                m21936E(webView);
                m21933B(webView);
                m21955j(webView, "loc_after_detach");
                m21959n(webView, f29452f);
                m21959n(webView, f29453g);
                m21959n(webView, f29451e);
                this.f29457i.remove(m21963z(webView));
                View$OnAttachStateChangeListenerC12233b bVar = this.f29459l;
                if (bVar != null && webView != null) {
                    webView.removeOnAttachStateChangeListener(bVar);
                }
            }
        } catch (Exception unused2) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12213f
    /* renamed from: e */
    public final String mo19633e(WebView webView) {
        String str;
        AbstractC12208d.C12209a w = mo19684w(webView);
        String i = C12221l.m21879a().mo19624i(webView);
        C12234o oVar = C12221l.m21879a().f29417a;
        if (oVar.f29479i.containsKey(i)) {
            str = oVar.f29479i.get(i);
        } else {
            str = "";
        }
        C12115b.m21581a("WebViewMonitorHelper", "getBid: " + i + ", match " + str);
        if (!str.isEmpty()) {
            return str;
        }
        if (w != null) {
            return w.f29386s;
        }
        return "";
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: j */
    public final void mo19585j(WebView webView) {
        C12115b.m21583b("WebViewMonitorHelper", "handleViewCreate: " + C12115b.m21579a(webView));
        if (!mo19674c()) {
            mo19678k(webView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo19679m(WebView webView) {
        try {
            if (mo19673b() && mo19635g(webView)) {
                mo19668a(webView, false);
                m21936E(webView);
                m21933B(webView);
                m21934C(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: t */
    public final void mo19589t(WebView webView) {
        C12115b.m21583b("WebViewMonitorHelper", webView.getClass().getSimpleName() + " attachToWindow, container: " + webView.getContext().getClass().getName() + ", isTTWebEnable: " + mo19674c());
        if (!mo19674c()) {
            mo19683u(webView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final AbstractC12208d.C12209a mo19684w(WebView webView) {
        AbstractC12208d.C12209a aVar;
        if (webView == null) {
            return null;
        }
        AbstractC12208d.C12209a aVar2 = this.f29457i.get(m21963z(webView));
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        AbstractC12208d.C12209a aVar3 = this.f29456h.get(name);
        if (aVar3 != null) {
            return aVar3;
        }
        if (this.f29458j.contains(name)) {
            return null;
        }
        for (String str : new HashSet(this.f29456h.keySet())) {
            if (m21944a(name, str) && (aVar = this.f29456h.get(str)) != null) {
                this.f29456h.put(name, aVar);
                return aVar;
            }
        }
        this.f29458j.add(name);
        return null;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12208d
    /* renamed from: a */
    public final void mo19596a(final WebView webView) {
        if (webView == null) {
            try {
                mo19597b((WebView) null);
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        } else {
            RunnableC12232a aVar = new RunnableC12232a(this, webView, (byte) 0);
            if (m21935D(webView)) {
                this.f29465r.post(aVar);
                return;
            }
            this.f29465r.post(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.C12230n.RunnableC122311 */

                static {
                    Covode.recordClassIndex(13962);
                }

                public final void run() {
                    try {
                        C12230n.this.mo19668a(webView, true);
                    } catch (Exception unused) {
                    }
                }
            });
            this.f29465r.postDelayed(aVar, 500);
        }
    }

    /* renamed from: b */
    static void m21947b(WebView webView, String str) {
        C12221l.m21879a().mo19659a(C12221l.m21879a().mo19624i(webView), str);
    }

    /* renamed from: k */
    private void m21956k(WebView webView, String str) {
        if (mo19635g(webView)) {
            String str2 = f29453g;
            if (!str2.equals(m21958m(webView, str2))) {
                m21939H(webView);
                String str3 = f29453g;
                m21948b(webView, str3, str3);
            }
            m21957l(webView, str);
        }
    }

    /* renamed from: l */
    private void m21957l(WebView webView, String str) {
        AbstractC12211e eVar;
        try {
            AbstractC12208d.C12209a w = mo19684w(webView);
            if (w != null && mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                eVar.mo19615b(webView, str);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* renamed from: n */
    private static void m21959n(WebView webView, String str) {
        f29454k.remove(str + m21963z(webView));
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: e */
    public final void mo19583e(WebView webView, String str) {
        C12115b.m21583b("WebViewMonitorHelper", "onPageFinished: ".concat(String.valueOf(str)));
        if (!mo19674c()) {
            mo19676f(webView, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo19676f(WebView webView, String str) {
        try {
            if (!mo19673b()) {
                this.f29460m.mo19566a(webView, str);
            } else if (mo19635g(webView)) {
                m21937F(webView);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: g */
    public final void mo19584g(WebView webView, String str) {
        C12115b.m21583b("WebViewMonitorHelper", "onLoadUrl: ".concat(String.valueOf(str)));
        if (!mo19674c()) {
            mo19677h(webView, str);
        }
    }

    /* renamed from: a */
    private static boolean m21944a(String str, String str2) {
        Class<?> b = m21946b(str);
        Class<?> b2 = m21946b(str2);
        if (b == null || b2 == null) {
            return false;
        }
        return b2.isAssignableFrom(b);
    }

    /* renamed from: c */
    private void m21949c(WebView webView, int i) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        if (webView != null) {
            try {
                if (mo19635g(webView) && m21961x(webView) && (w = mo19684w(webView)) != null && (eVar = w.f29369b) != null) {
                    eVar.mo19603a(webView, i);
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    /* renamed from: d */
    private void m21951d(WebView webView, int i) {
        if (mo19635g(webView) && i >= 15 && webView != null) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            m21940I(webView);
        }
    }

    /* renamed from: i */
    private boolean m21954i(WebView webView, String str) {
        AbstractC12208d.C12209a w;
        AbstractC12211e eVar;
        if ((!TextUtils.isEmpty(str) && !"about:blank".equals(str)) || (w = mo19684w(webView)) == null || (eVar = w.f29369b) == null) {
            return false;
        }
        String i = eVar.mo19624i(webView);
        if (TextUtils.isEmpty(i) || i.equals("about:blank")) {
            return false;
        }
        return true;
        return false;
    }

    /* renamed from: j */
    private void m21955j(WebView webView, String str) {
        AbstractC12211e eVar;
        AbstractC12208d.C12209a w = mo19684w(webView);
        if (w != null && w.f29380m != null && mo19682s(webView) != null && (eVar = w.f29369b) != null) {
            if ("loc_force".equals(str) || "loc_after_detach".equals(str) || w.f29380m.equals(str)) {
                eVar.mo19619d(webView, str);
            }
        }
    }

    /* renamed from: m */
    private static String m21958m(WebView webView, String str) {
        String z = m21963z(webView);
        String str2 = f29454k.get(str + z);
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(z, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo19675d(WebView webView, String str) {
        String str2 = null;
        try {
            Matcher matcher = Pattern.compile(f29450d).matcher(webView.getUrl());
            if (matcher.find()) {
                str2 = matcher.group(1).trim();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = C12079d.m21505a(str, HybridMultiMonitor.getInstance().getHybridSettingManager().mo19481d());
                C12115b.m21583b("WebViewMonitorHelper", "regexMatcher: ".concat(String.valueOf(str2)));
            }
            if (!TextUtils.isEmpty(str2)) {
                C12221l.m21879a().mo19659a(str, str2);
            }
            if (!mo19673b()) {
                this.f29460m.mo19565a();
            } else {
                m21956k(webView, str);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo19677h(WebView webView, String str) {
        AbstractC12211e eVar;
        try {
            if (mo19673b() && mo19635g(webView) && !str.contains("javascript:")) {
                m21959n(webView, f29452f);
                C12115b.m21581a("WebViewMonitorHelper", "onLoadUrl : ".concat(String.valueOf(str)));
                if (m21954i(webView, str)) {
                    mo19668a(webView, false);
                    mo19684w(webView);
                    m21933B(webView);
                }
                m21938G(webView);
                AbstractC12208d.C12209a w = mo19684w(webView);
                if (w != null && (eVar = w.f29369b) != null) {
                    eVar.mo19609a(webView, str);
                    m21947b(webView, w.f29386s);
                }
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo19669b(WebView webView, int i) {
        try {
            if (mo19673b()) {
                m21951d(webView, i);
                m21949c(webView, i);
            }
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: c */
    public final void mo19582c(WebView webView, String str) {
        C12115b.m21583b("WebViewMonitorHelper", "onPageStarted:".concat(String.valueOf(str)));
        if (!mo19674c()) {
            mo19675d(webView, str);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
    /* renamed from: a */
    public final void mo19578a(WebView webView, int i) {
        if (!mo19674c()) {
            mo19669b(webView, i);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12196f
    /* renamed from: b */
    public final void mo19577b(WebView webView, long j) {
        String str;
        if (j > 0 && webView != null) {
            JSONObject jSONObject = new JSONObject();
            Uri parse = Uri.parse(webView.getUrl());
            C12130f.m21652a(jSONObject, "url", parse.toString());
            C12130f.m21652a(jSONObject, "host", parse.getHost());
            C12130f.m21652a(jSONObject, "path", parse.getPath());
            String str2 = "true";
            if (!mo19673b() || !mo19635g(webView)) {
                str = "false";
            } else {
                str = str2;
            }
            C12130f.m21652a(jSONObject, "hybrid_monitor_switch", str);
            if (!mo19673b() || !m21952e().mo19471e()) {
                str2 = "false";
            }
            C12130f.m21652a(jSONObject, "js_inject_switch", str2);
            C12130f.m21652a(jSONObject, "container_type", "web");
            C12130f.m21650a(new JSONObject(), "web_page_cost", j);
            mo19574b(webView, webView.getUrl(), "performance_test", jSONObject.toString());
        }
    }

    /* renamed from: b */
    private static void m21948b(WebView webView, String str, String str2) {
        f29454k.put(str + m21963z(webView), str2);
    }

    @Override // com.bytedance.android.monitorV2.p739k.AbstractC12120c
    /* renamed from: a */
    public final void mo19494a(View view, C12081a aVar, C12119b bVar) {
        try {
            if (mo19673b()) {
                C12093a.m21524a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: INVOKE  
                      (wrap: com.bytedance.android.monitorV2.webview.l$4 : 0x000e: CONSTRUCTOR  (r0v2 com.bytedance.android.monitorV2.webview.l$4) = 
                      (wrap: com.bytedance.android.monitorV2.webview.l : 0x0007: INVOKE  (r2v0 com.bytedance.android.monitorV2.webview.l) =  type: STATIC call: com.bytedance.android.monitorV2.webview.l.a():com.bytedance.android.monitorV2.webview.l)
                      (null android.webkit.WebView)
                      (r6v0 'bVar' com.bytedance.android.monitorV2.k.b)
                      (r5v0 'aVar' com.bytedance.android.monitorV2.d.a)
                     call: com.bytedance.android.monitorV2.webview.l.4.<init>(com.bytedance.android.monitorV2.webview.l, android.webkit.WebView, com.bytedance.android.monitorV2.k.b, com.bytedance.android.monitorV2.d.a):void type: CONSTRUCTOR)
                     type: STATIC call: com.bytedance.android.monitorV2.f.a.a(java.lang.Runnable):void in method: com.bytedance.android.monitorV2.webview.n.a(android.view.View, com.bytedance.android.monitorV2.d.a, com.bytedance.android.monitorV2.k.b):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r0v2 com.bytedance.android.monitorV2.webview.l$4) = 
                      (wrap: com.bytedance.android.monitorV2.webview.l : 0x0007: INVOKE  (r2v0 com.bytedance.android.monitorV2.webview.l) =  type: STATIC call: com.bytedance.android.monitorV2.webview.l.a():com.bytedance.android.monitorV2.webview.l)
                      (null android.webkit.WebView)
                      (r6v0 'bVar' com.bytedance.android.monitorV2.k.b)
                      (r5v0 'aVar' com.bytedance.android.monitorV2.d.a)
                     call: com.bytedance.android.monitorV2.webview.l.4.<init>(com.bytedance.android.monitorV2.webview.l, android.webkit.WebView, com.bytedance.android.monitorV2.k.b, com.bytedance.android.monitorV2.d.a):void type: CONSTRUCTOR in method: com.bytedance.android.monitorV2.webview.n.a(android.view.View, com.bytedance.android.monitorV2.d.a, com.bytedance.android.monitorV2.k.b):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.monitorV2.webview.l, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                    this = this;
                    boolean r0 = r3.mo19673b()     // Catch:{ Exception -> 0x0015 }
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    com.bytedance.android.monitorV2.webview.l r2 = com.bytedance.android.monitorV2.webview.C12221l.m21879a()     // Catch:{ Exception -> 0x0015 }
                    r1 = 0
                    com.bytedance.android.monitorV2.webview.l$4 r0 = new com.bytedance.android.monitorV2.webview.l$4     // Catch:{ Exception -> 0x0015 }
                    r0.<init>(r1, r6, r5)     // Catch:{ Exception -> 0x0015 }
                    com.bytedance.android.monitorV2.p733f.C12093a.m21524a(r0)     // Catch:{ Exception -> 0x0015 }
                    return
                L_0x0015:
                    com.bytedance.android.monitorV2.HybridMultiMonitor r0 = com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance()
                    r0.getExceptionHandler()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.C12230n.mo19494a(android.view.View, com.bytedance.android.monitorV2.d.a, com.bytedance.android.monitorV2.k.b):void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public final void mo19671b(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                AbstractC12208d.C12209a w;
                AbstractC12211e eVar;
                try {
                    if (mo19673b() && webView != null && webResourceRequest != null && webResourceError != null) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            if (mo19635g(webView) && m21961x(webView) && (w = mo19684w(webView)) != null) {
                                if (m21945a(w.f29377j)) {
                                    if (mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                                        eVar.mo19612a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), webResourceError.getErrorCode(), webResourceError.getDescription().toString(), 0);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public final void mo19670b(WebView webView, int i, String str, String str2) {
                AbstractC12208d.C12209a w;
                AbstractC12211e eVar;
                try {
                    if (mo19673b() && webView != null && str != null && str2 != null) {
                        if (Build.VERSION.SDK_INT < 23) {
                            if (mo19635g(webView) && m21961x(webView) && (w = mo19684w(webView)) != null) {
                                if (m21945a(w.f29377j)) {
                                    if (mo19682s(webView) != null && (eVar = w.f29369b) != null) {
                                        eVar.mo19612a(webView, str2, true, i, str, 0);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                }
            }

            @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12197g
            /* renamed from: a */
            public final void mo19579a(WebView webView, int i, String str, String str2) {
                C12115b.m21583b("WebViewMonitorHelper", "handleRequestError: " + C12115b.m21579a(webView) + ", errorCode: " + i);
                if (!mo19674c()) {
                    mo19670b(webView, i, str, str2);
                }
            }

            /* renamed from: a */
            private void m21943a(WebView webView, AbstractC12190b bVar, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
                JSONObject jSONObject5;
                JSONObject jSONObject6;
                JSONObject jSONObject7 = jSONObject4;
                C12115b.m21583b("WebViewMonitorHelper", "custom final: bid: " + str + ", url: " + str2 + ", eventName: " + ((String) null));
                if (jSONObject7 == null) {
                    jSONObject7 = new JSONObject();
                }
                if (TextUtils.isEmpty(str) && webView != null) {
                    str = mo19633e(webView);
                }
                C12218k l = C12221l.m21879a().mo19660l(webView);
                if (l != null) {
                    if (l.f29406a != null) {
                        jSONObject6 = l.f29406a.mo19416a();
                    } else {
                        jSONObject6 = null;
                    }
                    if (l.f29409d != null) {
                        jSONObject5 = l.f29409d.mo19416a();
                    } else {
                        jSONObject5 = null;
                    }
                } else {
                    jSONObject5 = null;
                    jSONObject6 = null;
                }
                C12097a.C12098a a = m21941a(str);
                JSONObject jSONObject8 = new JSONObject();
                C12130f.m21652a(jSONObject8, "bid", str);
                C12130f.m21652a(jSONObject8, "setting_bid", a.f29047a);
                C12130f.m21650a(jSONObject8, "hit_sample", a.f29048b);
                C12130f.m21650a(jSONObject8, "setting_id", a.f29049c);
                C12130f.m21649a(jSONObject8, "can_sample", 0);
                C12130f.m21649a(jSONObject7, "platform", 0);
                C12084d.C12085a aVar = new C12084d.C12085a(null);
                aVar.f28966b = str;
                aVar.f28970f = jSONObject8;
                aVar.f28965a = str2;
                aVar.f28967c = jSONObject;
                aVar.f28968d = jSONObject2;
                aVar.f28969e = jSONObject3;
                aVar.f28972h = jSONObject7;
                C12084d.C12085a a2 = aVar.mo19432a(0);
                a2.f28976l = bVar;
                a2.f28973i = jSONObject6;
                a2.f28974j = jSONObject5;
                HybridMultiMonitor.getInstance().customReportInner(a2.mo19435a());
            }
        }
