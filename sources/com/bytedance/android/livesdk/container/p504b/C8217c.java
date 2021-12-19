package com.bytedance.android.livesdk.container.p504b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.browser.C7015f;
import com.bytedance.android.livesdk.browser.p460a.C6938a;
import com.bytedance.android.livesdk.browser.p462c.C6966g;
import com.bytedance.android.livesdk.browser.p464e.C7013b;
import com.bytedance.android.livesdk.browser.p464e.C7014c;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.container.p505c.C8232c;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.container.b.c */
public final class C8217c extends C6938a {

    /* renamed from: c */
    public static final C8218a f20405c = new C8218a((byte) 0);

    /* renamed from: a */
    public Map<String, Boolean> f20406a = new LinkedHashMap();

    /* renamed from: b */
    public final C8232c f20407b;

    /* renamed from: e */
    private Map<String, Object> f20408e = new LinkedHashMap();

    /* renamed from: f */
    private long f20409f;

    /* renamed from: g */
    private final long f20410g;

    /* renamed from: h */
    private long f20411h;

    /* renamed from: i */
    private final long f20412i;

    /* renamed from: j */
    private long f20413j;

    /* renamed from: k */
    private boolean f20414k;

    /* renamed from: l */
    private String f20415l = "";

    /* renamed from: m */
    private boolean f20416m = true;

    static {
        Covode.recordClassIndex(9042);
    }

    /* renamed from: com.bytedance.android.livesdk.container.b.c$a */
    public static final class C8218a {
        static {
            Covode.recordClassIndex(9043);
        }

        private C8218a() {
        }

        public /* synthetic */ C8218a(byte b) {
            this();
        }
    }

    public C8217c(C8232c cVar) {
        C89219l.m154721d(cVar, "");
        this.f20407b = cVar;
    }

    /* renamed from: com.bytedance.android.livesdk.container.b.c$b */
    public static final class C8219b extends AbstractC24156b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ WebView f20417a;

        /* renamed from: b */
        final /* synthetic */ String f20418b;

        static {
            Covode.recordClassIndex(9044);
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<Boolean> cVar) {
            C89219l.m154721d(cVar, "");
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onNewResultImpl(AbstractC24157c<Boolean> cVar) {
            C89219l.m154721d(cVar, "");
            if (cVar.mo39745b() && cVar.mo39747d() != null) {
                Boolean d = cVar.mo39747d();
                if (d == null) {
                    C89219l.m154715b();
                }
                d.booleanValue();
            }
        }

        C8219b(WebView webView, String str) {
            this.f20417a = webView;
            this.f20418b = str;
        }
    }

    /* renamed from: a */
    private static boolean m16336a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            C89219l.m154716b(path, "");
            if (C89361p.m154876c(path, ".htm", false) || C89361p.m154876c(path, ".html", false) || C89361p.m154876c(path, ".css", false)) {
                return true;
            }
            if (C89361p.m154876c(path, ".js", false)) {
                return true;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.bytedance.ies.web.p1285a.C18292c
    public final void onLoadResource(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(str, "");
        if (Logger.debug() && !C6935a.m14806b(str)) {
            C3854a.m9453a(3, "MyWebViewClient", "onLoadResource ".concat(String.valueOf(str)));
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6940c, com.bytedance.android.livesdk.browser.p460a.C6938a
    public final void onPageFinished(WebView webView, String str) {
        WebView webView2;
        MethodCollector.m26663i(7816);
        this.f20409f = System.currentTimeMillis();
        if (Logger.debug()) {
            C3854a.m9453a(2, "MyWebViewClient", "onPageFinished " + str + ", time " + this.f20409f);
        }
        AbstractC8249a aVar = this.f20407b.f20423e;
        if (aVar != null) {
            aVar.mo14598d();
        }
        if (this.f20416m) {
            if (webView == null) {
                C89219l.m154715b();
            }
            webView.clearHistory();
            this.f20416m = false;
        }
        super.onPageFinished(webView, str);
        if (!(!this.f20414k || this.f20407b.f20443f == null || (webView2 = this.f20407b.f20443f) == null)) {
            String str2 = "about:blank";
            String a = C84357h.f188595a.mo129370a(webView2, str2);
            if (!TextUtils.isEmpty(a)) {
                str2 = a;
            }
            webView2.loadUrl(str2);
        }
        this.f20406a.clear();
        MethodCollector.m26664o(7816);
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ies.web.p1285a.C18292c
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(str, "");
        if (Logger.debug()) {
            C3854a.m9453a(3, "MyWebViewClient", "shouldOverrideUrlLoading ".concat(String.valueOf(str)));
        }
        if (C6966g.m14875b().mo13256a(str) || super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            String scheme = parse.getScheme();
            if (scheme == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(scheme, "");
            if (scheme != null) {
                String lowerCase = scheme.toLowerCase();
                C89219l.m154716b(lowerCase, "");
                if (!TextUtils.isEmpty(lowerCase) && !C89219l.m154714a((Object) "about", (Object) lowerCase) && (!C89219l.m154714a((Object) "http", (Object) lowerCase)) && (!C89219l.m154714a((Object) "https", (Object) lowerCase))) {
                    return ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.f20407b.f20420b, parse);
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            C3854a.m9453a(5, "TAG", "view url " + str + " exception: " + e);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            WebView webView2 = n.f139470c;
            Q q = n.f139468a;
            String str2 = "";
            C89219l.m154721d(webView2, str2);
            C89219l.m154721d(q, str2);
            C7014c.f17612a = System.currentTimeMillis();
            if (!TextUtils.isEmpty(q)) {
                WebResourceResponse a = C7019d.m14971a().mo13327a(q, webView2);
                if (a != null) {
                    if (TextUtils.equals("text/html", a.getMimeType())) {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f20413j = currentTimeMillis;
                        this.f20408e.put("intercept_delay", Long.valueOf((currentTimeMillis - this.f20412i) / 1000));
                    }
                    if (m16336a(q)) {
                        C7014c.m14963a(this.f20415l, (String) q, 0);
                    }
                    this.f20406a.put(q, true);
                    C7013b.m14959a(webView2, q, true);
                    Uri parse = Uri.parse(q);
                    C89219l.m154716b(parse, str2);
                    if (parse.getPath() != null) {
                        String path = parse.getPath();
                        if (path == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(path, str2);
                        str2 = path;
                    }
                    if (C89361p.m154876c(str2, "jpg", false) || C89361p.m154876c(str2, "jpeg", false) || C89361p.m154876c(str2, "png", false) || C89361p.m154876c(str2, "gif", false) || C89361p.m154876c(str2, "ico", false)) {
                        Uri parse2 = Uri.parse(q);
                        C24413h e = C24428k.m46551a().mo40247e();
                        if (!e.mo40231b(parse2)) {
                            e.mo40235d(parse2).mo39739a(new C8219b(webView2, q), AsyncTask.THREAD_POOL_EXECUTOR);
                        }
                    }
                    return a;
                }
                if (m16336a(q)) {
                    C7014c.m14963a(this.f20415l, (String) q, 1);
                }
                this.f20406a.put(q, false);
                C7013b.m14959a(webView2, q, true);
            }
            return super.shouldInterceptRequest(webView2, (String) q);
        }
        throw n.f139472e;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(str, "");
        if (Logger.debug()) {
            C3854a.m9453a(2, "MyWebViewClient", "doUpdateVisitedHistory " + webView.getUrl() + " " + str + " " + z);
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6940c, com.bytedance.android.livesdk.browser.p460a.C6938a
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String originUri;
        super.onPageStarted(webView, str, bitmap);
        this.f20411h = System.currentTimeMillis();
        if (webView != null) {
            int i = Build.VERSION.SDK_INT;
            if (LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && C6935a.m14805a(str)) {
                boolean a = C89219l.m154714a(Boolean.TRUE, this.f20406a.get(str));
                Context context = webView.getContext();
                if (TextUtils.isEmpty(this.f20407b.f20421c.getOriginUri())) {
                    originUri = str;
                } else {
                    originUri = this.f20407b.f20421c.getOriginUri();
                }
                String a2 = C1764a.m5928a("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", Arrays.copyOf(new Object[]{C7015f.m14967a(context, originUri, this.f20407b.f20422d, a)}, 1));
                C89219l.m154716b(a2, "");
                webView.evaluateJavascript(a2, null);
            }
        }
        this.f20414k = false;
        if (Logger.debug()) {
            C3854a.m9453a(2, "MyWebViewClient", "onPageStarted " + str + ", time " + this.f20411h);
        }
        this.f20408e.put("constrution_duration", Long.valueOf((this.f20411h - this.f20410g) / 1000));
        AbstractC8249a aVar = this.f20407b.f20423e;
        if (aVar != null) {
            aVar.mo14597a(str);
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p460a.C6940c, com.bytedance.android.livesdk.browser.p460a.C6938a
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.f20409f = System.currentTimeMillis();
        if (Logger.debug()) {
            C3854a.m9453a(2, "MyWebViewClient", "onReceivedError " + str2 + ", time " + this.f20409f);
        }
        this.f20414k = true;
        AbstractC8249a aVar = this.f20407b.f20423e;
        if (aVar != null) {
            aVar.mo14599e();
        }
        if (!TextUtils.isEmpty(null)) {
            C3868c.m9491a((String) null, 1, this.f20408e);
            this.f20408e.clear();
        }
    }
}
