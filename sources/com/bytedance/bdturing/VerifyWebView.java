package com.bytedance.bdturing;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.C13252c;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;

public class VerifyWebView extends WebView {

    /* renamed from: a */
    public AbstractC13304n f32342a;

    /* renamed from: b */
    public boolean f32343b;

    /* renamed from: c */
    protected boolean f32344c;

    /* renamed from: d */
    public Activity f32345d;

    /* renamed from: e */
    private C13287i f32346e;

    /* renamed from: f */
    private WebChromeClient f32347f = new WebChromeClient() {
        /* class com.bytedance.bdturing.VerifyWebView.C132393 */

        static {
            Covode.recordClassIndex(15201);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }
    };

    /* renamed from: g */
    private WebViewClient f32348g = new WebViewClient() {
        /* class com.bytedance.bdturing.VerifyWebView.C132404 */

        static {
            Covode.recordClassIndex(15202);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        /* renamed from: a */
        private WebResourceResponse m23796a(WebView webView, String str) {
            if (str.toLowerCase().contains("/favicon.ico")) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            C13285g.m23901a("onPageFinished ");
            if (!VerifyWebView.this.f32343b && !VerifyWebView.this.f32344c) {
                VerifyWebView.this.f32344c = true;
                VerifyWebView.this.f32342a.mo21467a();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
            if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
                return n.f139469b;
            }
            if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
                return m23796a(n.f139470c, n.f139468a);
            }
            throw n.f139472e;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C13285g.m23901a("onPageStarted ");
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (C13285g.m23902a()) {
                VerifyWebView.this.getContext();
            }
            if (VerifyWebView.this.f32345d != null && (VerifyWebView.this.f32345d instanceof TwiceVerifyWebActivity)) {
                int i = 0;
                try {
                    i = webResourceResponse.getStatusCode();
                } catch (Throwable unused) {
                }
                ((TwiceVerifyWebActivity) VerifyWebView.this.f32345d).mo21482a(i);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            try {
                webResourceRequest.getUrl().toString().toLowerCase().contains("/favicon.ico");
            } catch (Exception e) {
                C13285g.m23900a(e);
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (C13285g.m23902a()) {
                Toast makeText = Toast.makeText(VerifyWebView.this.getContext(), "onReceivedSslError : ".concat(String.valueOf(sslError)), 1);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            }
            if (VerifyWebView.this.f32345d != null && (VerifyWebView.this.f32345d instanceof TwiceVerifyWebActivity)) {
                int i = 0;
                try {
                    i = sslError.getPrimaryError();
                } catch (Throwable unused) {
                }
                ((TwiceVerifyWebActivity) VerifyWebView.this.f32345d).mo21482a(i);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            VerifyWebView.this.f32343b = true;
            C13285g.m23901a(i + " onReceivedError " + str);
            VerifyWebView.this.f32342a.mo21468a(i, str + "|" + str2);
            if (VerifyWebView.this.f32345d != null && (VerifyWebView.this.f32345d instanceof TwiceVerifyWebActivity)) {
                ((TwiceVerifyWebActivity) VerifyWebView.this.f32345d).mo21482a(i);
            }
            super.onReceivedError(webView, i, str, str2);
        }
    };

    static {
        Covode.recordClassIndex(15198);
    }

    public void setOnTouchListener(C13287i iVar) {
        this.f32346e = iVar;
    }

    public void setParentActivity(Activity activity) {
        this.f32345d = activity;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C13287i iVar = this.f32346e;
        if (iVar != null) {
            iVar.mo21455a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo21379a(AbstractC13304n nVar) {
        this.f32342a = nVar;
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setTextZoom(100);
        if (C13241a.C13243a.f32360a.f32353a.f32374a == C13252c.EnumC13254b.REGION_BOE && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        try {
            setOverScrollMode(2);
        } catch (Throwable unused) {
        }
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (C13285g.m23902a()) {
            setWebChromeClient(this.f32347f);
        }
        m23794a(this, this.f32348g);
    }

    public VerifyWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(538);
        MethodCollector.m26664o(538);
    }

    /* renamed from: a */
    private static void m23794a(VerifyWebView verifyWebView, WebViewClient webViewClient) {
        if (C84367b.m145126a() && webViewClient != null) {
            WebSettings settings = verifyWebView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        verifyWebView.setWebViewClient(C23833c.m45038a(webViewClient));
    }
}
