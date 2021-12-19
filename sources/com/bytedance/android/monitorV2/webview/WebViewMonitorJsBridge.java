package com.bytedance.android.monitorV2.webview;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12128e;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    public Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(13909);
    }

    @JavascriptInterface
    public String getVersion() {
        return "1.2.0-alpha.4";
    }

    @JavascriptInterface
    public void injectJS() {
        C12115b.m21583b("WebViewMonitorJsBridge", "inject js");
        final long currentTimeMillis = System.currentTimeMillis();
        C12093a.m21524a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121867 */

            static {
                Covode.recordClassIndex(13917);
            }

            public final void run() {
                if (C12230n.f29449b.mo19635g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C12230n.f29449b.mo19627a(WebViewMonitorJsBridge.this.mWebViewRef.get(), currentTimeMillis);
                }
            }
        });
    }

    @JavascriptInterface
    public void reportPageLatestData(final String str) {
        C12115b.m21583b("WebViewMonitorJsBridge", "report latest page data");
        C12093a.m21524a(new Runnable() {
            /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121846 */

            static {
                Covode.recordClassIndex(13915);
            }

            public final void run() {
                if (C12230n.f29449b.mo19635g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    final JSONObject a = C12130f.m21648a(str);
                    String c = C12130f.m21657c(a, "performance");
                    String c2 = C12130f.m21657c(C12130f.m21648a(c), "serviceType");
                    String c3 = C12130f.m21657c(a, "resource");
                    String c4 = C12130f.m21657c(C12130f.m21648a(c3), "serviceType");
                    final String c5 = C12130f.m21657c(a, "url");
                    C12230n.f29449b.mo19630a(WebViewMonitorJsBridge.this.mWebViewRef.get(), c5, c2, c);
                    C12230n.f29449b.mo19629a(WebViewMonitorJsBridge.this.mWebViewRef.get(), c4, c3);
                    String c6 = C12130f.m21657c(a, "cacheData");
                    C12230n.f29449b.mo19629a(WebViewMonitorJsBridge.this.mWebViewRef.get(), C12130f.m21657c(C12130f.m21648a(c6), "serviceType"), c6);
                    WebViewMonitorJsBridge.this.mainHandler.post(new Runnable() {
                        /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121846.RunnableC121851 */

                        static {
                            Covode.recordClassIndex(13916);
                        }

                        public final void run() {
                            try {
                                C12115b.m21581a("WebViewMonitorJsBridge", "reportPageLatestData : " + c5);
                                String c = C12130f.m21657c(a, "needReport");
                                if (!TextUtils.isEmpty(c) && c.equals("true")) {
                                    C12230n.f29448a.mo19597b(WebViewMonitorJsBridge.this.mWebViewRef.get());
                                }
                            } catch (Throwable unused) {
                                HybridMultiMonitor.getInstance().getExceptionHandler();
                            }
                        }
                    });
                }
            }
        });
    }

    public WebViewMonitorJsBridge(WebView webView) {
        this.mWebViewRef = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void batch(final String str) {
        C12115b.m21583b("WebViewMonitorJsBridge", "batch");
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get())) {
            C12093a.m21524a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121813 */

                static {
                    Covode.recordClassIndex(13912);
                }

                public final void run() {
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            C12221l.m21879a().mo19658a(WebViewMonitorJsBridge.this.mWebViewRef.get(), jSONArray.getJSONObject(i));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void sendInitTimeInfo(final String str) {
        C12115b.m21583b("WebViewMonitorJsBridge", "sendInitTimeInfo: ");
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get())) {
            C12093a.m21524a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121835 */

                static {
                    Covode.recordClassIndex(13914);
                }

                public final void run() {
                    C12230n.f29449b.mo19628a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str);
                }
            });
        }
    }

    @JavascriptInterface
    public void terminatedPreCollect(String str) {
        C12115b.m21583b("WebViewMonitorJsBridge", "terminatedPreCollect: ".concat(String.valueOf(str)));
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get())) {
            final WebView webView = this.mWebViewRef.get();
            C12093a.m21524a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121878 */

                static {
                    Covode.recordClassIndex(13918);
                }

                public final void run() {
                    if (webView != null) {
                        C12221l.m21879a().mo19661m(WebViewMonitorJsBridge.this.mWebViewRef.get());
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void config(String str) {
        C12115b.m21583b("WebViewMonitorJsBridge", "config: ".concat(String.valueOf(str)));
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get())) {
            JSONObject a = C12130f.m21648a(str);
            String c = C12130f.m21657c(a, "bid");
            WebView webView = this.mWebViewRef.get();
            if (webView != null) {
                C12230n.m21947b(webView, c);
                JSONObject a2 = C12128e.C12129a.m21646a(a);
                String i = C12221l.m21879a().mo19624i(webView);
                C12234o oVar = C12221l.m21879a().f29417a;
                if (i != null && !i.isEmpty()) {
                    if (oVar.f29483m.containsKey(i)) {
                        oVar.f29483m.put(i, C12130f.m21656b(oVar.f29483m.get(i), a2));
                        return;
                    }
                    oVar.f29483m.put(i, a2);
                }
            }
        }
    }

    @JavascriptInterface
    public void cover(final String str, final String str2) {
        C12115b.m21583b("WebViewMonitorJsBridge", "cover: eventType: ".concat(String.valueOf(str2)));
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get())) {
            C12093a.m21524a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121791 */

                static {
                    Covode.recordClassIndex(13910);
                }

                public final void run() {
                    try {
                        C12230n.f29449b.mo19630a(WebViewMonitorJsBridge.this.mWebViewRef.get(), C12130f.m21657c(C12130f.m21648a(str), "url"), str2, str);
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void reportDirectly(final String str, final String str2) {
        C12115b.m21583b("WebViewMonitorJsBridge", "reportDirectly: eventType: ".concat(String.valueOf(str2)));
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get())) {
            C12093a.m21524a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121802 */

                static {
                    Covode.recordClassIndex(13911);
                }

                public final void run() {
                    try {
                        C12230n.f29449b.mo19629a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void customReport(final String str, final String str2, final String str3, boolean z, String str4, final String str5, final String str6) {
        final int parseInt;
        C12115b.m21583b("WebViewMonitorJsBridge", "customReport: event: ".concat(String.valueOf(str)));
        if (C12230n.f29449b.mo19635g(this.mWebViewRef.get()) && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str4)) {
                parseInt = Integer.parseInt(str4);
            } else if (z) {
                parseInt = 1;
            } else {
                parseInt = 2;
            }
            C12093a.m21524a(new Runnable() {
                /* class com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge.RunnableC121824 */

                static {
                    Covode.recordClassIndex(13913);
                }

                public final void run() {
                    try {
                        JSONObject a = C12130f.m21648a(str3);
                        JSONObject a2 = C12130f.m21648a(str2);
                        JSONObject a3 = C12130f.m21648a(str5);
                        JSONObject a4 = C12130f.m21648a(str6);
                        C12084d.C12085a aVar = new C12084d.C12085a(str);
                        aVar.f28967c = a;
                        aVar.f28968d = a2;
                        aVar.f28969e = a3;
                        aVar.f28971g = a4;
                        C12230n.f29448a.mo19573a(WebViewMonitorJsBridge.this.mWebViewRef.get(), aVar.mo19432a(parseInt).mo19435a());
                    } catch (Throwable unused) {
                        HybridMultiMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }
}
