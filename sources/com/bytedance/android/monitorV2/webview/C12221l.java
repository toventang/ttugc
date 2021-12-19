package com.bytedance.android.monitorV2.webview;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p731d.C12086e;
import com.bytedance.android.monitorV2.p731d.C12087f;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p734g.C12095a;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.C12118a;
import com.bytedance.android.monitorV2.p740l.C12125b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.p740l.C12134j;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12191a;
import com.bytedance.android.monitorV2.webview.p748b.AbstractC12193c;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12200b;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c;
import com.bytedance.android.monitorV2.webview.p749c.p751b.C12204b;
import com.bytedance.android.monitorV2.webview.p749c.p751b.C12206c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1753c.C23558a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.l */
public class C12221l implements AbstractC12211e {

    /* renamed from: c */
    private static volatile C12221l f29416c;

    /* renamed from: a */
    public C12234o f29417a = new C12234o();

    /* renamed from: b */
    private final String f29418b = "terminated_pre_collect";

    /* renamed from: d */
    private C12217j f29419d = new C12217j();

    /* renamed from: e */
    private Map<WebView, List<C12218k>> f29420e = new WeakHashMap();

    /* renamed from: f */
    private C12095a f29421f = new C12095a();

    static {
        Covode.recordClassIndex(13952);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final boolean mo19613a(WebView webView) {
        Boolean bool = this.f29417a.f29478h.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19609a(WebView webView, String str) {
        C12234o oVar = this.f29417a;
        if (oVar.f29472b.get(webView) != null) {
            oVar.f29473c.put(webView, true);
        }
        oVar.f29472b.put(webView, Long.valueOf(System.currentTimeMillis()));
        oVar.f29471a.put(webView, str);
        C12115b.m21581a("WebviewCache", "handleLoadUrl: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19612a(final WebView webView, final String str, final boolean z, final int i, final String str2, final int i2) {
        C12093a.m21524a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.C12221l.RunnableC122221 */

            static {
                Covode.recordClassIndex(13953);
            }

            public final void run() {
                String str;
                JSONObject jSONObject = new JSONObject();
                C12130f.m21652a(jSONObject, "event_type", "nativeError");
                C12130f.m21649a(jSONObject, "error_code", i);
                C12130f.m21652a(jSONObject, "error_msg", str2);
                if (z) {
                    str = "main_frame";
                } else {
                    str = "child_resource";
                }
                C12130f.m21652a(jSONObject, "scene", str);
                C12130f.m21652a(jSONObject, "error_url", str);
                C12130f.m21649a(jSONObject, "http_status", i2);
                C12221l.this.mo19656a(webView, "nativeError", jSONObject);
                C12115b.m21581a("MonitorCacheInfoHandler", "handleRequestError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19608a(WebView webView, C23558a.C23559a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            C12130f.m21652a(jSONObject, "event_type", "blank");
            boolean z = false;
            C12130f.m21649a(jSONObject, "is_blank", aVar.f55804a == 1 ? 1 : 0);
            C12130f.m21649a(jSONObject, "detect_type", 0);
            C12130f.m21650a(jSONObject, "cost_time", aVar.f55806c);
            if (aVar.f55804a == 3) {
                C12130f.m21649a(jSONObject, "error_code", aVar.f55807d);
                C12130f.m21652a(jSONObject, "error_msg", aVar.f55808e);
            }
            C12218k e = m21884e(webView, webView.getUrl());
            if (e == null) {
                e = m21885f(webView, webView.getUrl());
                z = true;
            }
            C12130f.m21650a(jSONObject, "enter_page_time", e.mo19645a().f29353a);
            C12130f.m21650a(jSONObject, "detect_start_time", System.currentTimeMillis() - aVar.f55806c);
            mo19656a(webView, "blank", jSONObject);
            if (z) {
                m21881a(webView, e);
            }
            C12115b.m21581a("MonitorCacheInfoHandler", "handleBlankDetect: ");
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19611a(WebView webView, String str, String str2, String str3) {
        C12218k e = m21884e(webView, str);
        if (e != null && !TextUtils.isEmpty(str2)) {
            e.mo19645a().mo19593a(C12130f.m21648a(str3));
        }
        C12115b.m21581a("MonitorCacheInfoHandler", "cover: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19610a(WebView webView, String str, String str2) {
        String c = C12130f.m21657c(C12130f.m21648a(str2), "url");
        C12097a.C12098a s = ((C12230n) C12230n.f29449b).mo19682s(webView);
        String e = C12230n.f29449b.mo19633e(webView);
        if (TextUtils.isEmpty(c)) {
            C12218k l = mo19660l(webView);
            if (l != null && m21886g(webView, str)) {
                l.mo19652a(m21880a(webView, s, e));
                l.mo19647a(webView, str, C12130f.m21648a(str2));
                l.mo19650a(str);
                return;
            }
            return;
        }
        C12218k e2 = m21884e(webView, c);
        if (e2 != null && e2.mo19654b(str) && m21886g(webView, str)) {
            e2.mo19652a(m21880a(webView, s, e));
            e2.mo19647a(webView, str, C12130f.m21648a(str2));
            e2.mo19650a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19658a(WebView webView, JSONObject jSONObject) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            String str = l.f29406a.f29010b;
            if (!m21883b(str, "terminated_pre_collect")) {
                this.f29419d.mo19643a(str, jSONObject);
                return;
            }
            List<JSONObject> a = this.f29419d.mo19641a(str);
            if (a == null || a.size() <= 0) {
                m21882b(webView, jSONObject);
                return;
            }
            for (JSONObject jSONObject2 : a) {
                m21882b(webView, jSONObject2);
            }
        }
    }

    /* renamed from: a */
    public final void mo19656a(WebView webView, String str, JSONObject jSONObject) {
        mo19657a(webView, str, jSONObject, (C12082b) null);
    }

    /* renamed from: a */
    public final void mo19657a(WebView webView, String str, JSONObject jSONObject, C12082b bVar) {
        C12218k l = mo19660l(webView);
        C12097a.C12098a s = ((C12230n) C12230n.f29449b).mo19682s(webView);
        String e = C12230n.f29449b.mo19633e(webView);
        if (l != null) {
            String str2 = l.f29406a.f29010b;
            if (!m21883b(str2, "terminated_pre_collect")) {
                this.f29419d.mo19642a(str2, str, jSONObject);
                return;
            }
            Map<String, JSONObject> b = this.f29419d.mo19644b(str2);
            if (b != null && b.size() > 0) {
                for (Map.Entry<String, JSONObject> entry : b.entrySet()) {
                    if (l.mo19654b(str) && m21886g(webView, entry.getKey())) {
                        l.mo19652a(m21880a(webView, s, e));
                        l.mo19648a(webView, entry.getKey(), null, entry.getValue(), bVar);
                        l.mo19650a(str);
                    }
                }
            } else if (l.mo19654b(str) && m21886g(webView, str)) {
                l.mo19652a(m21880a(webView, s, e));
                l.mo19648a(webView, str, null, jSONObject, bVar);
                l.mo19650a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo19659a(String str, String str2) {
        C12234o oVar = this.f29417a;
        if (str != null && !str.isEmpty() && str2 != null) {
            oVar.f29479i.put(str, str2);
        }
    }

    private C12221l() {
    }

    /* renamed from: a */
    public static C12221l m21879a() {
        MethodCollector.m26663i(11435);
        if (f29416c == null) {
            synchronized (C12221l.class) {
                try {
                    if (f29416c == null) {
                        f29416c = new C12221l();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11435);
                    throw th;
                }
            }
        }
        C12221l lVar = f29416c;
        MethodCollector.m26664o(11435);
        return lVar;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: k */
    public final AbstractC12191a mo19626k(final WebView webView) {
        return new AbstractC12191a() {
            /* class com.bytedance.android.monitorV2.webview.C12221l.C122285 */

            static {
                Covode.recordClassIndex(13959);
            }

            @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12191a
            /* renamed from: a */
            public final String mo19567a() {
                return C12230n.f29449b.mo19634f(webView);
            }

            @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12191a
            /* renamed from: b */
            public final String mo19568b() {
                return C12230n.f29449b.mo19633e(webView);
            }

            @Override // com.bytedance.android.monitorV2.webview.p748b.AbstractC12191a
            /* renamed from: c */
            public final String mo19569c() {
                C12218k l = C12221l.this.mo19660l(webView);
                if (l != null) {
                    return l.f29406a.f29009a;
                }
                C12234o oVar = C12221l.this.f29417a;
                return oVar.f29471a.get(webView);
            }
        };
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: f */
    public final void mo19621f(WebView webView) {
        this.f29417a.f29477g.put(webView, true);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: h */
    public final boolean mo19623h(WebView webView) {
        if (mo19660l(webView) != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: i */
    public final String mo19624i(WebView webView) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            return l.f29406a.f29009a;
        }
        return null;
    }

    /* renamed from: n */
    private synchronized List<C12218k> m21887n(WebView webView) {
        List<C12218k> remove;
        MethodCollector.m26663i(11609);
        remove = this.f29420e.remove(webView);
        MethodCollector.m26664o(11609);
        return remove;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: b */
    public final void mo19614b(WebView webView) {
        this.f29417a.f29474d.put(webView, Long.valueOf(System.currentTimeMillis()));
        C12115b.m21581a("WebviewCache", "handleViewCreate: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: c */
    public final void mo19616c(WebView webView) {
        this.f29417a.f29475e.put(webView, Long.valueOf(System.currentTimeMillis()));
        C12115b.m21581a("WebviewCache", "handleViewAttach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: d */
    public final void mo19618d(WebView webView) {
        this.f29417a.f29476f.put(webView, Long.valueOf(System.currentTimeMillis()));
        C12115b.m21581a("WebviewCache", "handleViewDetach: ".concat(String.valueOf(webView)));
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: g */
    public final boolean mo19622g(WebView webView) {
        Boolean bool = this.f29417a.f29477g.get(webView);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: j */
    public final void mo19625j(WebView webView) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            l.mo19653b();
        }
        C12115b.m21581a("MonitorCacheInfoHandler", "handlePageExit: ".concat(String.valueOf(webView)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo19661m(WebView webView) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            this.f29421f.mo19445a(l.f29406a.f29010b, "terminated_pre_collect");
            mo19658a(webView, (JSONObject) null);
            mo19656a(webView, "", (JSONObject) null);
        }
    }

    /* renamed from: l */
    public final synchronized C12218k mo19660l(WebView webView) {
        MethodCollector.m26663i(11607);
        List<C12218k> list = this.f29420e.get(webView);
        if (list == null || list.size() <= 0) {
            MethodCollector.m26664o(11607);
            return null;
        }
        C12218k kVar = list.get(list.size() - 1);
        MethodCollector.m26664o(11607);
        return kVar;
    }

    /* renamed from: a */
    public final JSONObject mo19655a(String str) {
        C12234o oVar = this.f29417a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return oVar.f29483m.get(str);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: e */
    public final void mo19620e(WebView webView) {
        SoftReference<WebView> softReference;
        C12218k l = mo19660l(webView);
        if (l != null) {
            C12206c a = l.mo19645a();
            if (a.f29354b == 0) {
                a.f29354b = System.currentTimeMillis();
                a.f29356d = a.f29354b - a.f29353a;
                if (a.f29356d < 0) {
                    a.f29356d = 0;
                }
                if (HybridMultiMonitor.getInstance().isAbTestEnable()) {
                    AbstractC12208d dVar = C12230n.f29448a;
                    C12204b bVar = a.f29341e;
                    if (bVar.f29346k != null) {
                        softReference = bVar.f29346k;
                    } else {
                        softReference = new SoftReference<>(null);
                    }
                    dVar.mo19577b(softReference.get(), a.f29356d);
                }
            }
        }
        C12115b.m21581a("MonitorCacheInfoHandler", "handlePageFinish: ".concat(String.valueOf(webView)));
    }

    /* renamed from: b */
    private boolean m21883b(String str, String str2) {
        return this.f29421f.mo19446b(str, str2);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19604a(WebView webView, long j) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            l.mo19645a().f29357g = j;
        }
    }

    /* renamed from: a */
    private synchronized void m21881a(WebView webView, C12218k kVar) {
        MethodCollector.m26663i(11611);
        List<C12218k> list = this.f29420e.get(webView);
        if (list != null) {
            list.remove(kVar);
        }
        MethodCollector.m26664o(11611);
    }

    /* renamed from: e */
    private synchronized C12218k m21884e(WebView webView, String str) {
        MethodCollector.m26663i(11608);
        List<C12218k> list = this.f29420e.get(webView);
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C12218k kVar = list.get(size);
                if (kVar != null && kVar.f29406a.f29009a.equals(str)) {
                    MethodCollector.m26664o(11608);
                    return kVar;
                }
            }
        }
        MethodCollector.m26664o(11608);
        return null;
    }

    /* renamed from: g */
    private static boolean m21886g(WebView webView, String str) {
        String str2;
        C12097a.C12098a s = ((C12230n) C12230n.f29449b).mo19682s(webView);
        if (s == null || !C12125b.m21634b(str, s)) {
            StringBuilder append = new StringBuilder().append(str).append("_web not hit,  use bid: ");
            if (s != null) {
                str2 = s.f29047a;
            } else {
                str2 = "null";
            }
            C12115b.m21583b("MonitorCacheInfoHandler", append.append(str2).toString());
            return false;
        }
        C12115b.m21583b("MonitorCacheInfoHandler", str + "_web hit, use bid: " + s.f29047a);
        return true;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: c */
    public final void mo19617c(WebView webView, String str) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            C12206c a = l.mo19645a();
            if (a.f29341e.f29348m != 0) {
                a.f29361k = true;
                a.f29360j = Long.parseLong(str) - a.f29341e.f29348m;
                if (a.f29360j < 0) {
                    a.f29360j = 0;
                }
                C12115b.m21581a("WebPerfReportData", " updateMonitorInitTimeData : " + a.f29360j);
            }
        }
    }

    /* renamed from: b */
    private static void m21882b(WebView webView, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject != null) {
            String jSONObject4 = jSONObject.toString();
            String c = C12130f.m21657c(jSONObject, "serviceType");
            if (c.equals("")) {
                JSONObject a = C12130f.m21648a(C12130f.m21657c(jSONObject, "category"));
                JSONObject a2 = C12130f.m21648a(C12130f.m21657c(jSONObject, "metrics"));
                JSONObject a3 = C12130f.m21648a(C12130f.m21657c(jSONObject, "timing"));
                JSONObject a4 = C12130f.m21648a(C12130f.m21657c(jSONObject, "extra"));
                C12218k l = m21879a().mo19660l(webView);
                JSONObject r = C12230n.m21960r(webView);
                JSONObject jSONObject5 = null;
                if (l != null) {
                    if (l.f29406a != null) {
                        jSONObject3 = l.f29406a.mo19416a();
                    } else {
                        jSONObject3 = null;
                    }
                    if (l.f29409d != null) {
                        jSONObject5 = l.f29409d.mo19416a();
                    }
                    jSONObject2 = jSONObject5;
                    jSONObject5 = jSONObject3;
                } else {
                    jSONObject2 = null;
                }
                C12084d.C12085a aVar = new C12084d.C12085a(C12130f.m21657c(jSONObject, "eventName"));
                aVar.f28967c = a;
                aVar.f28969e = a4;
                aVar.f28971g = a3;
                aVar.f28968d = a2;
                aVar.f28973i = jSONObject5;
                aVar.f28975k = r;
                aVar.f28974j = jSONObject2;
                C12230n.f29448a.mo19573a(webView, aVar.mo19432a(C12130f.m21647a(jSONObject, "level")).mo19435a());
            } else if (c.equals("perf")) {
                C12230n.f29449b.mo19630a(webView, C12130f.m21657c(jSONObject, "url"), c, jSONObject4);
            } else {
                C12230n.f29449b.mo19629a(webView, c, jSONObject4);
            }
        }
    }

    /* renamed from: f */
    private C12218k m21885f(WebView webView, String str) {
        String str2;
        C12115b.m21581a("MonitorCacheInfoHandler", "buildNewNavigation cache new url : ".concat(String.valueOf(str)));
        if (((AbstractC12193c) C12230n.f29449b).mo19572v(webView)) {
            str2 = "ttweb";
        } else {
            str2 = "web";
        }
        JSONObject jSONObject = new JSONObject();
        if (((C12230n) C12230n.f29448a).mo19684w(webView) != null) {
            jSONObject = ((C12230n) C12230n.f29448a).mo19684w(webView).f29387t;
        }
        C12218k kVar = new C12218k(webView, "web", str2, str, C12134j.m21666a(), this.f29417a.f29472b.get(webView).longValue(), jSONObject);
        kVar.mo19651a(this.f29417a.f29481k.remove(webView));
        kVar.mo19649a(C12118a.m21594a(webView));
        kVar.mo19645a().f29365o = C12118a.m21597b(webView);
        kVar.f29407b = this.f29417a;
        List<C12218k> list = this.f29420e.get(webView);
        if (list == null) {
            list = new ArrayList<>();
            this.f29420e.put(webView, list);
        }
        list.add(kVar);
        return kVar;
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19603a(WebView webView, int i) {
        C12218k l = mo19660l(webView);
        if (l != null) {
            C12206c a = l.mo19645a();
            if (i == 100 && a.f29355c == 0) {
                a.f29355c = System.currentTimeMillis();
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: d */
    public final void mo19619d(WebView webView, String str) {
        C12218k l;
        C12097a.C12098a s = ((C12230n) C12230n.f29449b).mo19682s(webView);
        String e = C12230n.f29449b.mo19633e(webView);
        if ("loc_after_detach".equals(str)) {
            List<C12218k> list = this.f29420e.get(webView);
            if (list != null && m21886g(webView, "perf")) {
                for (C12218k kVar : list) {
                    kVar.mo19652a(m21880a(webView, s, e));
                    kVar.mo19646a(webView);
                    for (AbstractC12200b bVar : kVar.f29408c.values()) {
                        if (bVar.mo19591k() && (bVar instanceof AbstractC12201c)) {
                            C12218k.m21863a(webView, (AbstractC12201c) bVar);
                            bVar.mo19592l();
                        }
                    }
                }
            }
            m21887n(webView);
        } else if (("loc_after_tti".equals(str) || "loc_force".equals(str)) && (l = mo19660l(webView)) != null && m21886g(webView, "perf")) {
            l.mo19652a(m21880a(webView, s, e));
            l.mo19646a(webView);
        }
        this.f29417a.f29478h.put(webView, true);
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19605a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        String url = webView.getUrl();
        if (!TextUtils.isEmpty(url)) {
            String str2 = null;
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb = new StringBuilder("cause by ");
                if (renderProcessGoneDetail.didCrash()) {
                    str = "crash";
                } else {
                    str = "system";
                }
                str2 = sb.append(str).toString();
            }
            JSONObject jSONObject = new JSONObject();
            C12130f.m21652a(jSONObject, "event_type", "nativeError");
            C12130f.m21649a(jSONObject, "error_code", -10000);
            C12130f.m21652a(jSONObject, "error_msg", str2);
            C12130f.m21652a(jSONObject, "scene", "web_process_terminate");
            C12130f.m21652a(jSONObject, "error_url", url);
            C12218k e = m21884e(webView, webView.getUrl());
            boolean z = false;
            if (e == null) {
                e = m21885f(webView, webView.getUrl());
                z = true;
            }
            mo19656a(webView, "nativeError", jSONObject);
            if (z) {
                m21881a(webView, e);
            }
            C12115b.m21581a("MonitorCacheInfoHandler", "handleRenderProcessGone: ");
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: b */
    public final void mo19615b(WebView webView, String str) {
        Boolean bool;
        String i = mo19624i(webView);
        if (!TextUtils.isEmpty(i)) {
            mo19625j(webView);
        }
        if (str.equals(i) && mo19660l(webView).f29406a.f29012d == C12134j.m21666a()) {
            C12115b.m21581a("MonitorCacheInfoHandler", "handlePageStart : clickStart is same");
        } else if (!str.equals("about:blank")) {
            m21885f(webView, str);
            C12234o oVar = this.f29417a;
            List<String> list = oVar.f29480j.get(webView);
            if (list == null) {
                list = new ArrayList<>();
                oVar.f29480j.put(webView, list);
            }
            list.add(str);
            C12234o oVar2 = this.f29417a;
            boolean z = true;
            if (oVar2.f29480j.get(webView) != null) {
                if (oVar2.f29480j.get(webView).size() > 1) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = true;
            }
            boolean booleanValue = bool.booleanValue();
            C12218k l = mo19660l(webView);
            if (l != null) {
                l.mo19645a().f29358h = System.currentTimeMillis();
                C12206c a = l.mo19645a();
                if (a.f29353a == 0) {
                    a.f29353a = System.currentTimeMillis();
                }
                a.f29362l = booleanValue;
            }
            JSONObject jSONObject = new JSONObject();
            C12130f.m21650a(jSONObject, "invoke_ts", System.currentTimeMillis());
            mo19656a(webView, "navigationStart", jSONObject);
            C12115b.m21581a("MonitorCacheInfoHandler", "handlePv");
            C12115b.m21581a("MonitorCacheInfoHandler", "handlePageStart: " + webView + "   url : " + str);
        }
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19606a(final WebView webView, final C12086e eVar) {
        C12093a.m21524a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.C12221l.RunnableC122232 */

            static {
                Covode.recordClassIndex(13954);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                C12130f.m21652a(jSONObject, "event_type", "jsbError");
                C12130f.m21652a(jSONObject, "bridge_name", eVar.f28982c);
                C12130f.m21652a(jSONObject, "error_activity", eVar.f28986g);
                C12130f.m21649a(jSONObject, "error_code", eVar.f28980a);
                C12130f.m21652a(jSONObject, "error_message", eVar.f28981b);
                C12130f.m21652a(jSONObject, "js_type", eVar.f28983d);
                C12130f.m21652a(jSONObject, "error_url", eVar.f28985f);
                C12130f.m21649a(jSONObject, "is_sync", eVar.f28984e);
                C12221l.this.mo19656a(webView, "jsbError", jSONObject);
                C12115b.m21581a("MonitorCacheInfoHandler", "handleJSBError: ");
            }
        });
    }

    @Override // com.bytedance.android.monitorV2.webview.AbstractC12211e
    /* renamed from: a */
    public final void mo19607a(final WebView webView, final C12087f fVar) {
        C12093a.m21524a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.C12221l.RunnableC122243 */

            static {
                Covode.recordClassIndex(13955);
            }

            public final void run() {
                JSONObject jSONObject = new JSONObject();
                C12130f.m21652a(jSONObject, "event_type", "jsbPerf");
                C12130f.m21652a(jSONObject, "bridge_name", fVar.f28987a);
                C12130f.m21649a(jSONObject, "status_code", fVar.f28988b);
                C12130f.m21652a(jSONObject, "status_description", fVar.f28989c);
                C12130f.m21652a(jSONObject, "protocol_version", fVar.f28990d);
                C12130f.m21650a(jSONObject, "cost_time", fVar.f28991e);
                C12130f.m21650a(jSONObject, "invoke_ts", fVar.f28992f);
                C12130f.m21650a(jSONObject, "callback_ts", fVar.f28993g);
                C12130f.m21650a(jSONObject, "fireEvent_ts", fVar.f28994h);
                C12221l.this.mo19656a(webView, "jsbPerf", jSONObject);
                C12115b.m21581a("MonitorCacheInfoHandler", "handleJSBInfo: ");
            }
        });
    }

    /* renamed from: a */
    private JSONObject m21880a(WebView webView, C12097a.C12098a aVar, String str) {
        return this.f29417a.mo19690a(webView, aVar, str);
    }
}
