package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.AbstractC16498g;
import com.bytedance.ies.bullet.kit.web.p1159a.C16478b;
import com.bytedance.ies.bullet.kit.web.p1159a.C16480d;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.bytedance.ies.bullet.service.base.web.AbstractC16673a;
import com.bytedance.ies.bullet.service.base.web.AbstractC16675c;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import com.p2082ss.android.newmedia.p2164b.C30125a;
import com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.e */
public final class C35278e extends C16478b {

    /* renamed from: a */
    private final C16248b f83289a;

    static {
        Covode.recordClassIndex(42443);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.e$a */
    public static final class C35279a extends C16480d {

        /* renamed from: a */
        final /* synthetic */ C16480d f83290a;

        static {
            Covode.recordClassIndex(42444);
        }

        public final void onHideCustomView() {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                dVar.onHideCustomView();
            }
        }

        public final void onGeolocationPermissionsHidePrompt() {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.onGeolocationPermissionsHidePrompt();
                    return;
                } catch (C16614as unused) {
                }
            }
            super.onGeolocationPermissionsHidePrompt();
        }

        C35279a(C16480d dVar) {
            this.f83290a = dVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16480d
        /* renamed from: a */
        public final void mo26185a(AbstractC16494c cVar) {
            C89219l.m154721d(cVar, "");
            super.mo26185a(cVar);
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                dVar.mo26185a(cVar);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        /* renamed from: a */
        public final void mo26504a(ValueCallback<Uri> valueCallback) {
            C89219l.m154721d(valueCallback, "");
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.mo26504a(valueCallback);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.mo26504a(valueCallback);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        /* renamed from: a */
        public final void mo26507a(AbstractC16675c cVar) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.mo26507a(cVar);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.mo26507a(cVar);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                dVar.onReceivedTitle(webView, str);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                dVar.onShowCustomView(view, customViewCallback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.onProgressChanged(webView, i);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.onProgressChanged(webView, i);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        /* renamed from: a */
        public final void mo26505a(ValueCallback<Uri> valueCallback, String str) {
            C89219l.m154721d(valueCallback, "");
            C89219l.m154721d(str, "");
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.mo26505a(valueCallback, str);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.mo26505a(valueCallback, str);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (!((Boolean) C15346a.m28238a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
                C15346a.m28243a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
                C16480d dVar = this.f83290a;
                if (dVar != null) {
                    try {
                        dVar.onGeolocationPermissionsShowPrompt(str, callback);
                        return;
                    } catch (C16614as unused) {
                    }
                }
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.onConsoleMessage(str, i, str2);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.onConsoleMessage(str, i, str2);
        }

        public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.onShowCustomView(view, i, customViewCallback);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.onShowCustomView(view, i, customViewCallback);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        /* renamed from: a */
        public final void mo26506a(ValueCallback<Uri> valueCallback, String str, String str2) {
            C89219l.m154721d(valueCallback, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    dVar.mo26506a(valueCallback, str, str2);
                    return;
                } catch (C16614as unused) {
                }
            }
            super.mo26506a(valueCallback, str, str2);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        /* renamed from: a */
        public final boolean mo26508a(WebView webView, ValueCallback<Uri[]> valueCallback, AbstractC16673a aVar) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    return dVar.mo26508a(webView, valueCallback, aVar);
                } catch (C16614as unused) {
                }
            }
            return super.mo26508a(webView, valueCallback, aVar);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    return dVar.onJsBeforeUnload(webView, str, str2, jsResult);
                } catch (C16614as unused) {
                }
            }
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    return dVar.onJsConfirm(webView, str, str2, jsResult);
                } catch (C16614as unused) {
                }
            }
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C16480d dVar = this.f83290a;
            if (dVar != null) {
                try {
                    return dVar.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                } catch (C16614as unused) {
                }
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16478b, com.bytedance.ies.bullet.kit.web.AbstractC16495d
    /* renamed from: a */
    public final C16481e mo26177a() {
        Object c = this.f83289a.mo25832c(AbstractC17019c.class);
        C16481e eVar = null;
        if (!(c instanceof AbstractC34964a)) {
            c = null;
        }
        AbstractC34964a aVar = (AbstractC34964a) c;
        if (aVar != null) {
            eVar = aVar.mo61863d();
        }
        return new C35280b(eVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16478b, com.bytedance.ies.bullet.kit.web.AbstractC16495d
    /* renamed from: b */
    public final C16480d mo26178b() {
        Object c = this.f83289a.mo25832c(AbstractC17019c.class);
        C16480d dVar = null;
        if (!(c instanceof AbstractC34964a)) {
            c = null;
        }
        AbstractC34964a aVar = (AbstractC34964a) c;
        if (aVar != null) {
            dVar = aVar.mo61862c();
        }
        return new C35279a(dVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16478b, com.bytedance.ies.bullet.kit.web.AbstractC16495d
    /* renamed from: d */
    public final AbstractC16498g mo26180d() {
        if (!C58939a.C58940a.f134171a.f134170a.enableBoe()) {
            LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
            C89219l.m154716b(localTestApi, "");
            if (!localTestApi.isPPEEnable()) {
                return new C35284g();
            }
        }
        LocalTestApi localTestApi2 = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi2, "");
        return localTestApi2.getWebViewLoadUrlInterceptorDelegate();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.e$b */
    public static final class C35280b extends C16481e {

        /* renamed from: a */
        final /* synthetic */ C16481e f83291a;

        static {
            Covode.recordClassIndex(42445);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: a */
        public final boolean mo26518a() {
            return true;
        }

        C35280b(C16481e eVar) {
            this.f83291a = eVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.p1159a.C16481e
        /* renamed from: a */
        public final void mo26186a(AbstractC16494c cVar) {
            C89219l.m154721d(cVar, "");
            super.mo26186a(cVar);
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.mo26186a(cVar);
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.onPageFinished(webView, str);
            }
        }

        /* renamed from: a */
        private WebResourceResponse m72204a(WebView webView, String str) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                try {
                    return eVar.shouldInterceptRequest(webView, str);
                } catch (C16614as unused) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: b */
        public final WebResourceResponse mo26520b(WebView webView, AbstractC16681h hVar) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                try {
                    return eVar.mo26520b(webView, hVar);
                } catch (C16614as unused) {
                }
            }
            return super.mo26520b(webView, hVar);
        }

        public final void onLoadResource(WebView webView, String str) {
            C58007a.m104833b(str);
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
            if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
                return n.f139469b;
            }
            if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
                return m72204a(n.f139470c, (String) n.f139468a);
            }
            throw n.f139472e;
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: a */
        public final boolean mo26519a(WebView webView, AbstractC16681h hVar) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                try {
                    return eVar.mo26519a(webView, hVar);
                } catch (C16614as unused) {
                }
            }
            return super.mo26519a(webView, hVar);
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            String str3;
            WebView n;
            String str4;
            Context context;
            WebView n2;
            WebView n3;
            AbstractC16485a m;
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                try {
                    return eVar.shouldOverrideUrlLoading(webView, str);
                } catch (C16614as unused) {
                }
            }
            if (str != null) {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                String scheme = parse.getScheme();
                Context context2 = null;
                if (scheme != null) {
                    Locale locale = Locale.getDefault();
                    C89219l.m154716b(locale, "");
                    Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                    str2 = scheme.toLowerCase(locale);
                    C89219l.m154716b(str2, "");
                } else {
                    str2 = null;
                }
                if (!(!C89219l.m154714a((Object) "http", (Object) str2)) || !(!C89219l.m154714a((Object) "https", (Object) str2))) {
                    Uri parse2 = Uri.parse(str);
                    C89219l.m154716b(parse2, "");
                    String host = parse2.getHost();
                    if (host != null) {
                        Objects.requireNonNull(host, "null cannot be cast to non-null type java.lang.String");
                        str3 = host.toLowerCase(Locale.ROOT);
                        C89219l.m154716b(str3, "");
                    } else {
                        str3 = null;
                    }
                    List c = C89361p.m154921c("m.tngdigital.com.my", new String[]{","});
                    if ((C89219l.m154714a((Object) "http", (Object) str2) || C89219l.m154714a((Object) "https", (Object) str2)) && C89070n.m154556a((Iterable) c, (Object) str3)) {
                        AbstractC16494c cVar = this.f39535d;
                        if (!(cVar == null || (n = cVar.mo26210n()) == null)) {
                            context2 = n.getContext();
                        }
                        if (C30125a.m60937a(context2, str)) {
                            return true;
                        }
                    }
                } else {
                    AbstractC16494c cVar2 = this.f39535d;
                    C58007a.m104833b(str);
                    if (cVar2 != null && (m = cVar2.mo26209m()) != null && m.mo26192a(str)) {
                        return true;
                    }
                    if (C89219l.m154714a((Object) "sslocal", (Object) str2) || C89219l.m154714a((Object) "localsdk", (Object) str2)) {
                        str = C30125a.m60935a(str);
                        C89219l.m154716b(str, "");
                    }
                    try {
                        Uri parse3 = Uri.parse(str);
                        String queryParameter = parse3.getQueryParameter("url");
                        if (queryParameter != null) {
                            str4 = C35301c.m72249b(queryParameter);
                        } else {
                            str4 = null;
                        }
                        String valueOf = String.valueOf(C35301c.m72245a(parse3, "url", str4));
                        AbstractC16494c cVar3 = this.f39535d;
                        if (cVar3 == null || (n3 = cVar3.mo26210n()) == null) {
                            context = null;
                        } else {
                            context = n3.getContext();
                        }
                        if (!C30125a.m60938b(context, valueOf) && C89219l.m154714a((Object) "intent", (Object) str2)) {
                            AbstractC16494c cVar4 = this.f39535d;
                            if (!(cVar4 == null || (n2 = cVar4.mo26210n()) == null)) {
                                context2 = n2.getContext();
                            }
                            C30125a.m60937a(context2, valueOf);
                        }
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: a */
        public final void mo26516a(WebView webView, AbstractC16681h hVar, WebResourceResponse webResourceResponse) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.mo26516a(webView, hVar, webResourceResponse);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.onPageStarted(webView, str, bitmap);
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: a */
        public final void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.mo26517a(webView, hVar, gVar);
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.onReceivedError(webView, i, str, str2);
            }
        }

        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C16481e eVar = this.f83291a;
            if (eVar != null) {
                eVar.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }
    }

    public C35278e(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        this.f83289a = bVar;
    }
}
