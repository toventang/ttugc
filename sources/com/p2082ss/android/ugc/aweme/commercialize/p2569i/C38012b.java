package com.p2082ss.android.ugc.aweme.commercialize.p2569i;

import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.example.p1811a.C23833c;
import com.p2082ss.android.sdk.webview.C30262h;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.i.b */
public final class C38012b {

    /* renamed from: a */
    public static final AtomicInteger f89823a = new AtomicInteger(0);

    /* renamed from: b */
    static WebView f89824b;

    /* renamed from: c */
    static C38013a f89825c;

    /* renamed from: d */
    public static long f89826d = -1;

    /* renamed from: e */
    public static long f89827e = -1;

    /* renamed from: f */
    public static final C38012b f89828f = new C38012b();

    private C38012b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.b$e */
    public static final class CallableC38017e<V> implements Callable {

        /* renamed from: a */
        public static final CallableC38017e f89837a = new CallableC38017e();

        static {
            Covode.recordClassIndex(45478);
        }

        CallableC38017e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C38012b.m77079a();
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(45473);
    }

    /* renamed from: a */
    public static void m77079a() {
        f89823a.incrementAndGet();
        if (!C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            C1731i.m5640b(CallableC38017e.f89837a, C1731i.f5564c);
            return;
        }
        f89826d = -1;
        WebView webView = f89824b;
        if (webView != null) {
            webView.stopLoading();
        }
        C38013a aVar = f89825c;
        if (aVar != null) {
            aVar.f89829a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.b$b */
    public static final class C38014b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ int f89830a;

        /* renamed from: b */
        final /* synthetic */ String f89831b;

        static {
            Covode.recordClassIndex(45475);
        }

        public C38014b(int i, String str) {
            this.f89830a = i;
            this.f89831b = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (C38012b.f89823a.get() != this.f89830a) {
                return null;
            }
            File file = new File(this.f89831b);
            if (!file.exists() || !file.isFile()) {
                return null;
            }
            return C89159j.m154648c(file);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.b$d */
    static final class C38016d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ int f89836a;

        static {
            Covode.recordClassIndex(45477);
        }

        C38016d(int i) {
            this.f89836a = i;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (this.f89836a == C38012b.f89823a.get() && C38012b.f89824b != null) {
                C38013a aVar = C38012b.f89825c;
                if (aVar != null) {
                    aVar.f89829a = null;
                }
                C38012b.f89825c = null;
                WebView webView = C38012b.f89824b;
                if (webView != null) {
                    C38012b.f89824b = null;
                    webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                    webView.clearFormData();
                    webView.clearHistory();
                    webView.destroy();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.b$c */
    public static final class C38015c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ int f89832a;

        /* renamed from: b */
        final /* synthetic */ long f89833b;

        /* renamed from: c */
        final /* synthetic */ String f89834c;

        /* renamed from: d */
        final /* synthetic */ C30262h.AbstractC30264a f89835d;

        static {
            Covode.recordClassIndex(45476);
        }

        public C38015c(int i, long j, String str, C30262h.AbstractC30264a aVar) {
            this.f89832a = i;
            this.f89833b = j;
            this.f89834c = str;
            this.f89835d = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            boolean z;
            Object obj;
            MethodCollector.m26663i(4985);
            if (C38012b.f89823a.get() == this.f89832a) {
                C89219l.m154716b(iVar, "");
                String str = (String) iVar.mo5545d();
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    long j = this.f89833b;
                    String str2 = this.f89834c;
                    C30262h.AbstractC30264a aVar = this.f89835d;
                    if (C38012b.f89824b == null && C38012b.f89824b == null) {
                        WebView webView = new WebView(C17867d.m33078a());
                        webView.setNetworkAvailable(false);
                        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                        C89219l.m154716b(iESSettingsProxy, "");
                        WebSettings settings = webView.getSettings();
                        C89219l.m154716b(settings, "");
                        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
                        C89219l.m154716b(adLandingPageConfig, "");
                        settings.setJavaScriptEnabled(adLandingPageConfig.isPrememCacheJsEnable());
                        WebSettings settings2 = webView.getSettings();
                        C89219l.m154716b(settings2, "");
                        settings2.setCacheMode(3);
                        WebSettings settings3 = webView.getSettings();
                        C89219l.m154716b(settings3, "");
                        settings3.setDatabaseEnabled(false);
                        WebSettings settings4 = webView.getSettings();
                        C89219l.m154716b(settings4, "");
                        settings4.setAllowContentAccess(false);
                        WebSettings settings5 = webView.getSettings();
                        C89219l.m154716b(settings5, "");
                        settings5.setAllowFileAccess(false);
                        webView.getSettings().setGeolocationEnabled(false);
                        WebSettings settings6 = webView.getSettings();
                        C89219l.m154716b(settings6, "");
                        settings6.setSaveFormData(false);
                        WebSettings settings7 = webView.getSettings();
                        C89219l.m154716b(settings7, "");
                        settings7.setSavePassword(false);
                        C38012b.f89824b = webView;
                        C38013a aVar2 = new C38013a();
                        WebView webView2 = C38012b.f89824b;
                        if (webView2 != null) {
                            if (C84367b.m145126a()) {
                                WebSettings settings8 = webView2.getSettings();
                                String userAgentString = settings8.getUserAgentString();
                                if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                                    StringBuilder sb = new StringBuilder(userAgentString);
                                    if (!TextUtils.isEmpty(sb)) {
                                        sb.append(" ");
                                    }
                                    sb.append("BytedanceWebview/d8a21c6");
                                    settings8.setUserAgentString(sb.toString());
                                }
                            }
                            webView2.setWebViewClient(C23833c.m45038a(aVar2));
                        }
                        C38012b.f89825c = aVar2;
                    }
                    if (C38012b.f89824b != null) {
                        C38012b.f89826d = j;
                        C38013a aVar3 = C38012b.f89825c;
                        if (aVar3 != null) {
                            aVar3.f89829a = aVar;
                        }
                        try {
                            Uri parse = Uri.parse(str2);
                            Uri.Builder builder = new Uri.Builder();
                            C89219l.m154716b(parse, "");
                            obj = C89379q.m157068constructorimpl(builder.scheme(parse.getScheme()).authority(parse.getAuthority()).build().toString());
                        } catch (Throwable th) {
                            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                        }
                        if (C89379q.m157073isFailureimpl(obj)) {
                            obj = null;
                        }
                        String str3 = (String) obj;
                        WebView webView3 = C38012b.f89824b;
                        if (webView3 != null) {
                            webView3.loadDataWithBaseURL(str3, str, "text/html", "utf-8", str2);
                        }
                        C1731i.m5631a(60000).mo5534a(new C38016d(C38012b.f89823a.incrementAndGet()), C1731i.f5564c, null);
                    }
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(4985);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.b$a */
    public static final class C38013a extends WebViewClient {

        /* renamed from: a */
        public C30262h.AbstractC30264a f89829a = null;

        static {
            Covode.recordClassIndex(45474);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C38012b.f89827e = System.currentTimeMillis();
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            String str;
            String str2;
            C30262h.AbstractC30264a aVar;
            WebResourceResponse a;
            webResourceRequest.getUrl();
            C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
            if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
                return o.f139469b;
            }
            if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
                Q q = o.f139468a;
                if (Build.VERSION.SDK_INT < 21) {
                    return null;
                }
                if (q != null) {
                    str = q.getMethod();
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) str, (Object) "GET")) {
                    return null;
                }
                Uri url = q.getUrl();
                if (url != null) {
                    str2 = url.toString();
                } else {
                    str2 = null;
                }
                if ((!URLUtil.isHttpUrl(str2) && !URLUtil.isHttpsUrl(str2)) || (aVar = this.f89829a) == null || (a = aVar.mo53719a(str2)) == null) {
                    return null;
                }
                return a;
            }
            throw o.f139472e;
        }
    }
}
