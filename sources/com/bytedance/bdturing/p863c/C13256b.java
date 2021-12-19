package com.bytedance.bdturing.p863c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bdturing.C13285g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.b */
public final class C13256b {

    /* renamed from: a */
    public WebView f32421a;

    /* renamed from: b */
    public Handler f32422b;

    static {
        Covode.recordClassIndex(15218);
    }

    /* renamed from: com.bytedance.bdturing.c.b$a */
    class C13259a {

        /* renamed from: a */
        public AbstractC13255a f32428a;

        static {
            Covode.recordClassIndex(15221);
        }

        @JavascriptInterface
        public final void offMethodParams(String str) {
            C13285g.m23905d("JS called method ======= offMethodParams(" + str + ")");
        }

        @JavascriptInterface
        public final void callMethodParams(final String str) {
            C13285g.m23905d("JS called method ======= callMethodParams(" + str + ")");
            if (C13256b.this.f32422b == null) {
                C13285g.m23901a("uihandler is null");
            } else {
                C13256b.this.f32422b.post(new Runnable() {
                    /* class com.bytedance.bdturing.p863c.C13256b.C13259a.RunnableC132601 */

                    static {
                        Covode.recordClassIndex(15222);
                    }

                    public final void run() {
                        C13259a.this.f32428a.mo21422b(new C13261c(C13256b.this, str));
                    }
                });
            }
        }

        @JavascriptInterface
        public final void onMethodParams(String str) {
            C13285g.m23905d("JS called method ======= onMethodParams(" + str + ")");
            try {
                new JSONObject(str).getString("__callback_id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public C13259a(AbstractC13255a aVar) {
            this.f32428a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo21423a(final String str) {
        Handler handler;
        if (str != null && this.f32421a != null && (handler = this.f32422b) != null) {
            handler.post(new Runnable() {
                /* class com.bytedance.bdturing.p863c.C13256b.RunnableC132571 */

                /* renamed from: a */
                WebView f32423a;

                static {
                    Covode.recordClassIndex(15219);
                }

                public final void run() {
                    MethodCollector.m26663i(7);
                    int i = Build.VERSION.SDK_INT;
                    this.f32423a.evaluateJavascript("javascript:window.Native2JSBridge._handleMessageFromApp(" + str + ")", null);
                    C13285g.m23903b("callJsCode ====== " + str);
                    MethodCollector.m26664o(7);
                }

                {
                    this.f32423a = C13256b.this.f32421a;
                }
            });
            C13285g.m23905d("callJsCode ====== ".concat(String.valueOf(str)));
        }
    }

    public C13256b(AbstractC13255a aVar, WebView webView) {
        this.f32421a = webView;
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            this.f32421a.addJavascriptInterface(new C13259a(aVar), "androidJsBridge");
            this.f32422b = new Handler(Looper.getMainLooper());
        }
    }
}
