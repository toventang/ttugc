package com.bytedance.android.monitor.webview;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    public Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(13728);
    }

    @JavascriptInterface
    public String getVersion() {
        return "1.2.5";
    }

    @JavascriptInterface
    public void injectJS() {
        C11937b.m21063b("WebViewMonitorJsBridge", "inject js");
        final long currentTimeMillis = System.currentTimeMillis();
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120087 */

            static {
                Covode.recordClassIndex(13736);
            }

            public final void run() {
                if (C12044i.f28863b.mo19307g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    C12044i.f28863b.mo19299a(WebViewMonitorJsBridge.this.mWebViewRef.get(), currentTimeMillis);
                }
            }
        });
    }

    @JavascriptInterface
    public void reportPageLatestData(final String str) {
        C11937b.m21063b("WebViewMonitorJsBridge", "report latest page data");
        C11929a.m21042a(new Runnable() {
            /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120066 */

            static {
                Covode.recordClassIndex(13734);
            }

            public final void run() {
                if (C12044i.f28863b.mo19307g(WebViewMonitorJsBridge.this.mWebViewRef.get())) {
                    final JSONObject a = C11950d.m21097a(str);
                    String b = C11950d.m21104b(a, "performance");
                    String b2 = C11950d.m21104b(C11950d.m21097a(b), "serviceType");
                    String b3 = C11950d.m21104b(a, "resource");
                    String b4 = C11950d.m21104b(C11950d.m21097a(b3), "serviceType");
                    final String b5 = C11950d.m21104b(a, "url");
                    C12044i.f28863b.mo19302a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b5, b2, b);
                    C12044i.f28863b.mo19301a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b4, b3);
                    WebViewMonitorJsBridge.this.mainHandler.post(new Runnable() {
                        /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120066.RunnableC120071 */

                        static {
                            Covode.recordClassIndex(13735);
                        }

                        public final void run() {
                            try {
                                C11937b.m21062a("TTLiveWebViewMonitorJsBridge", "reportPageLatestData : " + b5);
                                String b = C11950d.m21104b(a, "needReport");
                                if (!TextUtils.isEmpty(b) && b.equals("true")) {
                                    C12044i.f28862a.mo19252b(WebViewMonitorJsBridge.this.mWebViewRef.get());
                                }
                            } catch (Throwable unused) {
                                HybridMonitor.getInstance().getExceptionHandler();
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
        C11937b.m21063b("WebViewMonitorJsBridge", "batch");
        if (C12044i.f28863b.mo19307g(this.mWebViewRef.get())) {
            C11929a.m21042a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120033 */

                static {
                    Covode.recordClassIndex(13731);
                }

                public final void run() {
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String jSONObject2 = jSONObject.toString();
                            String b = C11950d.m21104b(jSONObject, "serviceType");
                            if (b.equals("")) {
                                JSONObject a = C11950d.m21097a(C11950d.m21104b(jSONObject, "category"));
                                JSONObject a2 = C11950d.m21097a(C11950d.m21104b(jSONObject, "metrics"));
                                JSONObject a3 = C11950d.m21097a(C11950d.m21104b(jSONObject, "timing"));
                                JSONObject a4 = C11950d.m21097a(C11950d.m21104b(jSONObject, "extra"));
                                C11919c.C11920a aVar = new C11919c.C11920a(C11950d.m21104b(jSONObject, "eventName"));
                                aVar.f28482c = a;
                                aVar.f28484e = a4;
                                aVar.f28485f = a3;
                                aVar.f28483d = a2;
                                aVar.f28487h = C11950d.m21103a(jSONObject, "canSample", (Boolean) true);
                                C12044i.f28862a.mo19230a(WebViewMonitorJsBridge.this.mWebViewRef.get(), aVar.mo19133a());
                            } else if (b.equals("perf")) {
                                C12044i.f28863b.mo19302a(WebViewMonitorJsBridge.this.mWebViewRef.get(), C11950d.m21104b(jSONObject, "url"), b, jSONObject2);
                            } else {
                                C12044i.f28863b.mo19301a(WebViewMonitorJsBridge.this.mWebViewRef.get(), b, jSONObject2);
                            }
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
        C11937b.m21063b("WebViewMonitorJsBridge", "sendInitTimeInfo: ");
        if (C12044i.f28863b.mo19307g(this.mWebViewRef.get())) {
            C11929a.m21042a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120055 */

                static {
                    Covode.recordClassIndex(13733);
                }

                public final void run() {
                    C12044i.f28863b.mo19300a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str);
                }
            });
        }
    }

    @JavascriptInterface
    public void cover(final String str, final String str2) {
        C11937b.m21063b("WebViewMonitorJsBridge", "cover: eventType: ".concat(String.valueOf(str2)));
        if (C12044i.f28863b.mo19307g(this.mWebViewRef.get())) {
            C11929a.m21042a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120011 */

                static {
                    Covode.recordClassIndex(13729);
                }

                public final void run() {
                    try {
                        C12044i.f28863b.mo19302a(WebViewMonitorJsBridge.this.mWebViewRef.get(), C11950d.m21104b(C11950d.m21097a(str), "url"), str2, str);
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void reportDirectly(final String str, final String str2) {
        C11937b.m21063b("WebViewMonitorJsBridge", "reportDirectly: eventType: ".concat(String.valueOf(str2)));
        if (C12044i.f28863b.mo19307g(this.mWebViewRef.get())) {
            C11929a.m21042a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120022 */

                static {
                    Covode.recordClassIndex(13730);
                }

                public final void run() {
                    try {
                        C12044i.f28863b.mo19301a(WebViewMonitorJsBridge.this.mWebViewRef.get(), str2, str);
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void customReport(final String str, final String str2, final String str3, final boolean z, final String str4, final String str5) {
        C11937b.m21063b("WebViewMonitorJsBridge", "customReport: event: ".concat(String.valueOf(str)));
        if (C12044i.f28863b.mo19307g(this.mWebViewRef.get()) && !TextUtils.isEmpty(str)) {
            C11929a.m21042a(new Runnable() {
                /* class com.bytedance.android.monitor.webview.WebViewMonitorJsBridge.RunnableC120044 */

                static {
                    Covode.recordClassIndex(13732);
                }

                public final void run() {
                    try {
                        JSONObject a = C11950d.m21097a(str3);
                        JSONObject a2 = C11950d.m21097a(str2);
                        JSONObject a3 = C11950d.m21097a(str4);
                        JSONObject a4 = C11950d.m21097a(str5);
                        C11919c.C11920a aVar = new C11919c.C11920a(str);
                        aVar.f28482c = a;
                        aVar.f28483d = a2;
                        aVar.f28484e = a3;
                        aVar.f28485f = a4;
                        aVar.f28487h = z;
                        C12044i.f28862a.mo19230a(WebViewMonitorJsBridge.this.mWebViewRef.get(), aVar.mo19133a());
                    } catch (Throwable unused) {
                        HybridMonitor.getInstance().getExceptionHandler();
                    }
                }
            });
        }
    }
}
