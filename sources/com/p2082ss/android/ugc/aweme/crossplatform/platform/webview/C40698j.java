package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.newmedia.C30126c;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.newmedia.p2164b.C30125a;
import com.p2082ss.android.sdk.webview.C30262h;
import com.p2082ss.android.sdk.webview.C30265i;
import com.p2082ss.android.sdk.webview.C30266j;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38635am;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38655av;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.LoadEventBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40596a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40611f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.p2282ad.p2291e.C33197a;
import com.p2082ss.android.ugc.aweme.p2282ad.settings.C33385c;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34306ae;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34350v;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.C81632l;
import com.p2082ss.android.ugc.aweme.web.GeckoXClientManager;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j */
public final class C40698j extends C30266j {

    /* renamed from: k */
    public static final C40699a f95293k = new C40699a((byte) 0);

    /* renamed from: a */
    public final List<AbstractC40691e> f95294a = new ArrayList();

    /* renamed from: b */
    public AbstractC89183m<? super WebView, ? super String, Boolean> f95295b;

    /* renamed from: c */
    public AbstractC40696h f95296c;

    /* renamed from: e */
    public AbstractC40696h f95297e;

    /* renamed from: f */
    public C30262h f95298f;

    /* renamed from: g */
    public C40707m f95299g;

    /* renamed from: h */
    public C34337k f95300h;

    /* renamed from: i */
    boolean f95301i;

    /* renamed from: j */
    public AbstractC40547m f95302j;

    /* renamed from: l */
    private final AbstractC40691e f95303l = new C40703e(this);

    /* renamed from: m */
    private final AbstractC89244h f95304m = C89250i.m154773a((AbstractC89171a) C40702d.f95307a);

    static {
        Covode.recordClassIndex(48544);
    }

    /* renamed from: a */
    public final C30265i mo69880a() {
        return (C30265i) this.f95304m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j$a */
    public static final class C40699a {
        static {
            Covode.recordClassIndex(48545);
        }

        private C40699a() {
        }

        public /* synthetic */ C40699a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j$d */
    static final class C40702d extends AbstractC89220m implements AbstractC89171a<C30265i> {

        /* renamed from: a */
        public static final C40702d f95307a = new C40702d();

        static {
            Covode.recordClassIndex(48548);
        }

        C40702d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C30265i invoke() {
            return C30265i.m61248a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j$b */
    public static final class RunnableC40700b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40698j f95305a;

        static {
            Covode.recordClassIndex(48546);
        }

        RunnableC40700b(C40698j jVar) {
            this.f95305a = jVar;
        }

        public final void run() {
            C30262h hVar = this.f95305a.f95298f;
            if (hVar != null) {
                hVar.mo53718a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final PassBackWebInfoBusiness mo69881b() {
        AbstractC40591g crossPlatformBusiness;
        AbstractC40547m mVar = this.f95302j;
        if (mVar == null || (crossPlatformBusiness = mVar.getCrossPlatformBusiness()) == null) {
            return null;
        }
        return (PassBackWebInfoBusiness) crossPlatformBusiness.mo69748a(PassBackWebInfoBusiness.class);
    }

    public C40698j() {
        GeckoXClientManager.m141361a();
        C81631k kVar = C81631k.f182525a;
        if (kVar != null) {
            C30262h a = new C30262h(kVar.mo53730a()).mo53717a(C81631k.f182526b).mo53716a(C81632l.m141482b());
            a.f72195a = new C40701c(this);
            this.f95298f = a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j$e */
    public static final class C40703e implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ C40698j f95308a;

        static {
            Covode.recordClassIndex(48549);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40703e(C40698j jVar) {
            this.f95308a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: b */
        public final boolean mo65796b(WebView webView, String str) {
            Iterator<T> it = this.f95308a.f95294a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().mo65796b(webView, str)) {
                    z = true;
                }
            }
            return z;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: c */
        public final void mo65797c(WebView webView, String str) {
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo65797c(webView, str);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
            C40596a.m81947a().mo19244e(webView, str);
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo61846a(webView, str);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo65792a(webView, sslErrorHandler, sslError);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C40596a.m81947a().mo19239a(webView, webResourceRequest, webResourceError);
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo65793a(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            C40596a.m81947a().mo19240a(webView, webResourceRequest, webResourceResponse);
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo65794a(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
            C40596a.m81947a().mo19243c(webView, str);
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo65795a(webView, str, bitmap);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            C40596a.m81947a().mo19238a(webView, i, str, str2);
            Iterator<T> it = this.f95308a.f95294a.iterator();
            while (it.hasNext()) {
                it.next().mo65791a(webView, i, str, str2);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m82091a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j$c */
    static final class C40701c implements C30262h.AbstractC30264a {

        /* renamed from: a */
        final /* synthetic */ C40698j f95306a;

        static {
            Covode.recordClassIndex(48547);
        }

        C40701c(C40698j jVar) {
            this.f95306a = jVar;
        }

        @Override // com.p2082ss.android.sdk.webview.C30262h.AbstractC30264a
        /* renamed from: a */
        public final WebResourceResponse mo53719a(String str) {
            return this.f95306a.mo69880a().mo53719a(str);
        }
    }

    /* renamed from: a */
    private static String m82092a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.f95303l.mo65797c(webView, str);
    }

    /* renamed from: b */
    private static void m82100b(WebView webView, String str) {
        MethodCollector.m26663i(4342);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(4342);
    }

    @Override // com.p2082ss.android.sdk.webview.C30266j, android.webkit.WebViewClient, com.bytedance.ies.web.p1285a.C18292c
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(str, "");
        AbstractC40696h hVar = this.f95297e;
        if (hVar != null) {
            hVar.mo69740a(str);
        }
        return m82095a(webView, str);
    }

    @Override // com.p2082ss.android.sdk.webview.C30266j
    public final void onPageFinished(WebView webView, String str) {
        AbstractC40591g crossPlatformBusiness;
        AbstractC40591g crossPlatformBusiness2;
        PlayableBusiness playableBusiness;
        AbstractC40591g crossPlatformBusiness3;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        AbstractC34340m mVar;
        super.onPageFinished(webView, str);
        if (str != null) {
            C40611f.C40612a.m81980a().mo69766a(webView, str, 2);
            C34337k kVar = this.f95300h;
            if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
                mVar.mo60782b(C34306ae.m70189a(str));
            }
        }
        this.f95303l.mo61846a(webView, str);
        AbstractC40547m mVar2 = this.f95302j;
        if (!(mVar2 == null || (crossPlatformBusiness3 = mVar2.getCrossPlatformBusiness()) == null || (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness3.mo69748a(DouPlusMonitorBusiness.class)) == null)) {
            douPlusMonitorBusiness.mo69716b(str);
        }
        AbstractC40547m mVar3 = this.f95302j;
        if (!(mVar3 == null || (crossPlatformBusiness2 = mVar3.getCrossPlatformBusiness()) == null || (playableBusiness = (PlayableBusiness) crossPlatformBusiness2.mo69748a(PlayableBusiness.class)) == null)) {
            playableBusiness.mo69734a(this.f43667d);
        }
        AbstractC40547m mVar4 = this.f95302j;
        if (mVar4 != null) {
            mVar4.getCrossPlatformParams();
        }
        PassBackWebInfoBusiness b = mo69881b();
        if (b != null) {
            b.mo69723a(webView, true);
        }
        AbstractC40547m mVar5 = this.f95302j;
        if (mVar5 != null && (crossPlatformBusiness = mVar5.getCrossPlatformBusiness()) != null) {
            crossPlatformBusiness.mo69748a(LoadEventBusiness.class);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        PassBackWebInfoBusiness b;
        String str;
        C40618a crossPlatformParams;
        C40628b bVar;
        WebResourceResponse a;
        webResourceRequest.getUrl();
        C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
        if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
            return o.f139469b;
        }
        if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
            WebView webView2 = o.f139470c;
            Q q = o.f139468a;
            AbstractC40547m mVar = this.f95302j;
            if (!(mVar == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f95069b) == null || Build.VERSION.SDK_INT < 21 || bVar.f95106a == 0 || q == null)) {
                C89219l.m154716b(bVar, "");
                C89219l.m154721d(q, "");
                C89219l.m154721d(bVar, "");
                if (q.getUrl() != null) {
                    String uri = q.getUrl().toString();
                    C89219l.m154716b(uri, "");
                    if (C89361p.m154908a((CharSequence) uri, (CharSequence) "https://securepubads.g.doubleclick.net/gampad/ads", false) && (a = CWebViewInterceptor.m82034a(uri, q, bVar)) != null) {
                        return a;
                    }
                }
            }
            if (!(Build.VERSION.SDK_INT < 21 || q == null || q.getUrl() == null || q.getRequestHeaders() == null || (b = mo69881b()) == null)) {
                String uri2 = q.getUrl().toString();
                C89219l.m154716b(uri2, "");
                Map<String, String> requestHeaders = q.getRequestHeaders();
                C89219l.m154716b(requestHeaders, "");
                C89219l.m154721d(uri2, "");
                C89219l.m154721d(requestHeaders, "");
                if (b.mo69728d() && b.mo69726b().size() < b.f94943c && !C89361p.m154870a((CharSequence) uri2) && !C89219l.m154714a((Object) "about:blank", (Object) uri2) && !C89361p.m154876c(uri2, ".js", false) && !C89361p.m154876c(uri2, ".css", false) && (str = requestHeaders.get("Accept")) != null && C89361p.m154908a((CharSequence) str, (CharSequence) "html", false)) {
                    Map<String, Map<String, String>> c = b.mo69727c();
                    String a2 = C80408et.m139388a(uri2);
                    C89219l.m154716b(a2, "");
                    c.put(a2, requestHeaders);
                }
            }
            return super.shouldInterceptRequest(webView2, (WebResourceRequest) q);
        }
        throw o.f139472e;
    }

    /* renamed from: a */
    private final boolean m82095a(WebView webView, String str) {
        String str2;
        AbstractC34340m mVar;
        Boolean a;
        AbstractC40696h hVar = this.f95296c;
        String str3 = null;
        if (hVar != null && (a = hVar.mo69740a(str)) != null) {
            return a.booleanValue();
        }
        if (this.f95295b == null) {
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                String scheme = parse.getScheme();
                if (scheme != null) {
                    Locale locale = Locale.getDefault();
                    C89219l.m154716b(locale, "");
                    String lowerCase = scheme.toLowerCase(locale);
                    C89219l.m154716b(lowerCase, "");
                    str3 = lowerCase;
                }
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if ((!C89219l.m154714a((Object) "http", (Object) str3)) && (!C89219l.m154714a((Object) "https", (Object) str3)) && (!C89219l.m154714a((Object) "bytedance", (Object) str3)) && SmartRouter.canOpen(str)) {
                SmartRouter.buildRoute(webView.getContext(), str).open();
                return true;
            } else if (C58939a.C58940a.f134171a.f134170a.enableBoe()) {
                m82100b(webView, str);
                return true;
            } else {
                if (TextUtils.isEmpty(str) || !C89361p.m154929e((CharSequence) str, (CharSequence) "__back_url__")) {
                    str2 = str;
                } else {
                    String encode = Uri.encode("snssdk" + C17867d.f42590n + "://adx");
                    C89219l.m154716b(encode, "");
                    str2 = C89361p.m154868a(str, "__back_url__", encode);
                }
                boolean c = m82101c(webView, str2);
                if (!c) {
                    C40611f.C40612a.m81980a().mo69766a(webView, str, 3);
                    C34337k kVar = this.f95300h;
                    if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
                        mVar.mo60783b(str);
                    }
                }
                return c;
            }
        } else if (super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        } else {
            AbstractC89183m<? super WebView, ? super String, Boolean> mVar2 = this.f95295b;
            if (mVar2 == null) {
                C89219l.m154715b();
            }
            return mVar2.invoke(webView, str).booleanValue();
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        AbstractC34340m mVar;
        AbstractC34340m mVar2;
        WebResourceResponse a;
        AbstractC34340m mVar3;
        WebResourceResponse a2;
        AbstractC34340m mVar4;
        AbstractC34340m mVar5;
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            WebView webView2 = n.f139470c;
            Q q = n.f139468a;
            C34337k kVar = this.f95300h;
            if (!(kVar == null || (mVar5 = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
                mVar5.mo60787f();
            }
            C30262h hVar = this.f95298f;
            if (hVar == null || (a2 = hVar.mo53715a(webView2, q)) == null) {
                C40707m mVar6 = this.f95299g;
                if (mVar6 != null) {
                    String valueOf = String.valueOf(q);
                    C89219l.m154721d(valueOf, "");
                    String str2 = mVar6.f95312a;
                    C89219l.m154721d(str2, "");
                    C89219l.m154721d(valueOf, "");
                    if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(str2) && ((C89361p.m154908a((CharSequence) str2, (CharSequence) "https", false) || C89361p.m154908a((CharSequence) str2, (CharSequence) "http", false)) && ((C89361p.m154908a((CharSequence) valueOf, (CharSequence) "http", false) || C89361p.m154908a((CharSequence) valueOf, (CharSequence) "https", false)) && !C89361p.m154908a((CharSequence) valueOf, (CharSequence) "/v1/list?rdn", false) && !C89361p.m154908a((CharSequence) valueOf, (CharSequence) "google-analytics.com", false) && !C89361p.m154908a((CharSequence) valueOf, (CharSequence) "cdn.polyfill.io", false) && C16048b.m29633a().mo25421a(true, "is_ttnet_intercept_webview", false)))) {
                        if (C16048b.m29633a().mo25421a(true, "is_ttnet_intercept_all", false)) {
                            if (!C89361p.m154908a((CharSequence) str2, (CharSequence) "ttnet_intercept=0", false)) {
                                if (!C34717d.m70908a(C40714q.f95324d)) {
                                    Iterator<String> it = C40714q.f95324d.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        String next = it.next();
                                        C89219l.m154716b(next, "");
                                        if (C89361p.m154908a((CharSequence) str2, (CharSequence) next, false)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else if (!C89361p.m154908a((CharSequence) str2, (CharSequence) "ttnet_intercept=1", false)) {
                            if (!C34717d.m70908a(C40714q.f95323c)) {
                                Iterator<String> it2 = C40714q.f95323c.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String next2 = it2.next();
                                    C89219l.m154716b(next2, "");
                                    if (C89361p.m154908a((CharSequence) str2, (CharSequence) next2, false)) {
                                        break;
                                    }
                                }
                            }
                        }
                        C89219l.m154721d(str2, "");
                        C89219l.m154721d(valueOf, "");
                        if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(str2) && (a = C40705l.m82115a(C40705l.m82116a(str2, valueOf))) != null) {
                            C34337k kVar2 = this.f95300h;
                            if (!(kVar2 == null || (mVar3 = (AbstractC34340m) kVar2.mo60793a(AbstractC34340m.class)) == null)) {
                                mVar3.mo60789h();
                            }
                            return a;
                        }
                    }
                }
                WebResourceResponse a3 = C40689c.m82073a(q);
                if (a3 != null) {
                    return a3;
                }
                C34337k kVar3 = this.f95300h;
                if (!(kVar3 == null || (mVar2 = (AbstractC34340m) kVar3.mo60793a(AbstractC34340m.class)) == null)) {
                    mVar2.mo60790i();
                }
                C34337k kVar4 = this.f95300h;
                if (!(kVar4 == null || (mVar = (AbstractC34340m) kVar4.mo60793a(AbstractC34340m.class)) == null)) {
                    mVar.mo60776a((String) q);
                }
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            C34337k kVar5 = this.f95300h;
            if (!(kVar5 == null || (mVar4 = (AbstractC34340m) kVar5.mo60793a(AbstractC34340m.class)) == null)) {
                mVar4.mo60788g();
            }
            return a2;
        }
        throw n.f139472e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x026a, code lost:
        if (r0.mo65454h().mo67250b(r5) != false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0302, code lost:
        if (r0.mo65454h().mo67250b(r5) != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0337, code lost:
        if (r0.mo65454h().mo67250b(r5) != false) goto L_0x0339;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0189 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0194 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0199 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0108 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0115 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125 A[ADDED_TO_REGION, Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012e A[ADDED_TO_REGION, Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0173 A[Catch:{ Exception -> 0x04ae }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82101c(android.webkit.WebView r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 1200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.C40698j.m82101c(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC34340m mVar;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C34337k kVar = this.f95300h;
        if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60772a(webResourceRequest, webResourceResponse);
        }
        this.f95303l.mo65794a(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC34340m mVar;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C34337k kVar = this.f95300h;
        if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60770a(sslError);
        }
        this.f95303l.mo65792a(webView, sslErrorHandler, sslError);
    }

    /* renamed from: a */
    private final boolean m82099a(String str, String str2, C33197a aVar) {
        String str3;
        List<String> list;
        C40618a crossPlatformParams;
        C40628b bVar;
        AbstractC40547m mVar = this.f95302j;
        if (mVar == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f95069b) == null || (str3 = bVar.f95103Q) == null) {
            str3 = "";
        }
        if (aVar != null) {
            list = aVar.getClickJumpAllowList();
        } else {
            list = null;
        }
        if (C30126c.m60939a(str, str2, list) || C30126c.m60939a(str, str2, C38635am.m78395a(str3))) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.sdk.webview.C30266j
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC40591g crossPlatformBusiness;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        C34337k kVar;
        AbstractC34340m mVar;
        super.onPageStarted(webView, str, bitmap);
        if (!(str == null || (kVar = this.f95300h) == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60769a(C34306ae.m70189a(str));
        }
        this.f95303l.mo65795a(webView, str, bitmap);
        AbstractC40547m mVar2 = this.f95302j;
        if (!(mVar2 == null || (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) == null || (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo69748a(DouPlusMonitorBusiness.class)) == null)) {
            douPlusMonitorBusiness.mo69715a(str);
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.C40581a.m81921a(this.f95302j);
        if (a != null) {
            C18288a aVar = this.f43667d;
            C89219l.m154716b(aVar, "");
            C89219l.m154721d(aVar, "");
            a.f94969a = aVar;
        }
    }

    @Override // com.p2082ss.android.sdk.webview.C30266j
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC40591g crossPlatformBusiness;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        AbstractC34340m mVar;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C34337k kVar = this.f95300h;
        if (!(kVar == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60771a(webResourceRequest, webResourceError);
        }
        this.f95303l.mo65793a(webView, webResourceRequest, webResourceError);
        AbstractC40547m mVar2 = this.f95302j;
        if (mVar2 != null && (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) != null && (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo69748a(DouPlusMonitorBusiness.class)) != null && douPlusMonitorBusiness.f94937a && webResourceRequest != null && webResourceError != null && webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            if (url == null) {
                douPlusMonitorBusiness.mo69714a(webResourceError.getErrorCode(), null, webView);
            } else {
                douPlusMonitorBusiness.mo69714a(webResourceError.getErrorCode(), url.toString(), webView);
            }
        }
    }

    /* renamed from: a */
    private static void m82094a(String str, String str2, C33385c cVar) {
        String shortClassName;
        String packageName;
        String str3;
        String className;
        String str4;
        if (str2 != null && !C89361p.m154870a((CharSequence) str2) && str != null && !C89361p.m154870a((CharSequence) str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scheme", str2);
            jSONObject.put("from", C40698j.class.getSimpleName());
            if (cVar != null) {
                jSONObject.put("pattern", cVar.f79332a);
                jSONObject.put("config_type", cVar.f79333b);
            }
            if (C89219l.m154714a((Object) "intent", (Object) str2)) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (parseUri != null) {
                        String str5 = parseUri.getPackage();
                        if (str5 != null && !C89361p.m154870a((CharSequence) str5)) {
                            jSONObject.put("package", parseUri.getPackage());
                        }
                        if (m82091a(parseUri) != null) {
                            jSONObject.put("extra", String.valueOf(m82091a(parseUri)));
                        }
                        ComponentName component = parseUri.getComponent();
                        String str6 = null;
                        if (!(component == null || (className = component.getClassName()) == null || !(!C89361p.m154870a((CharSequence) className)))) {
                            ComponentName component2 = parseUri.getComponent();
                            if (component2 != null) {
                                str4 = component2.getClassName();
                            } else {
                                str4 = null;
                            }
                            jSONObject.put("className", str4);
                        }
                        ComponentName component3 = parseUri.getComponent();
                        if (!(component3 == null || (packageName = component3.getPackageName()) == null || !(!C89361p.m154870a((CharSequence) packageName)))) {
                            ComponentName component4 = parseUri.getComponent();
                            if (component4 != null) {
                                str3 = component4.getPackageName();
                            } else {
                                str3 = null;
                            }
                            jSONObject.put("packageName", str3);
                        }
                        ComponentName component5 = parseUri.getComponent();
                        if (!(component5 == null || (shortClassName = component5.getShortClassName()) == null || !(!C89361p.m154870a((CharSequence) shortClassName)))) {
                            ComponentName component6 = parseUri.getComponent();
                            if (component6 != null) {
                                str6 = component6.getShortClassName();
                            }
                            jSONObject.put("shortClassName", str6);
                        }
                        String action = parseUri.getAction();
                        if (action != null && !C89361p.m154870a((CharSequence) action)) {
                            jSONObject.put("action", parseUri.getAction());
                        }
                        Set<String> categories = parseUri.getCategories();
                        if (categories != null && !categories.isEmpty()) {
                            jSONObject.put("categories", parseUri.getCategories().toString());
                        }
                        String dataString = parseUri.getDataString();
                        if (dataString != null && !C89361p.m154870a((CharSequence) dataString)) {
                            jSONObject.put("data", parseUri.getDataString());
                        }
                        String type = parseUri.getType();
                        if (type != null && !C89361p.m154870a((CharSequence) type)) {
                            jSONObject.put(StringSet.type, parseUri.getType());
                        }
                        jSONObject.put("flag", parseUri.getFlags());
                    }
                } catch (Exception e) {
                    jSONObject.put("exception_name", e.getClass().getSimpleName());
                    String message = e.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    jSONObject.put("exception_message", message);
                }
            }
            C12290b.m22064a("webview_intent_scheme_log", jSONObject);
        }
    }

    @Override // com.p2082ss.android.sdk.webview.C30266j
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC40591g crossPlatformBusiness;
        DouPlusMonitorBusiness douPlusMonitorBusiness;
        C34337k kVar;
        AbstractC34340m mVar;
        super.onReceivedError(webView, i, str, str2);
        if (!(Build.VERSION.SDK_INT >= 23 || (kVar = this.f95300h) == null || (mVar = (AbstractC34340m) kVar.mo60793a(AbstractC34340m.class)) == null)) {
            mVar.mo60768a(i, str2);
        }
        this.f95303l.mo65791a(webView, i, str, str2);
        AbstractC40547m mVar2 = this.f95302j;
        if (mVar2 != null && (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) != null && (douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo69748a(DouPlusMonitorBusiness.class)) != null) {
            douPlusMonitorBusiness.mo69714a(i, str2, webView);
        }
    }

    /* renamed from: a */
    private final void m82093a(Aweme aweme, Uri uri, String str, WebView webView) {
        String str2;
        AbstractC40547m mVar = this.f95302j;
        if (!(mVar == null || mVar.getCrossPlatformParams() == null)) {
            AbstractC40547m mVar2 = this.f95302j;
            if (mVar2 == null) {
                C89219l.m154715b();
            }
            if (mVar2.getCrossPlatformParams() == null) {
                C89219l.m154715b();
            }
            AbstractC40547m mVar3 = this.f95302j;
            if (mVar3 == null) {
                C89219l.m154715b();
            }
            if (mVar3.getCrossPlatformParams() == null) {
                C89219l.m154715b();
            }
        }
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(awemeRawAd, "");
            if (awemeRawAd.getGroupId() != null) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(awemeRawAd2, "");
                str2 = String.valueOf(awemeRawAd2.getGroupId().longValue());
                ALog.m59865d("commerce_jump", "【filterUrl】 = " + str + " 【market】 special handle");
                C34337k kVar = this.f95300h;
                C89219l.m154721d(webView, "");
                C89219l.m154721d(str2, "");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(268435456);
                C40704k.m82114a(str, kVar);
                C40704k.m82113a(webView.getContext(), intent);
            }
        }
        str2 = "";
        ALog.m59865d("commerce_jump", "【filterUrl】 = " + str + " 【market】 special handle");
        C34337k kVar2 = this.f95300h;
        C89219l.m154721d(webView, "");
        C89219l.m154721d(str2, "");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        intent2.addFlags(268435456);
        C40704k.m82114a(str, kVar2);
        C40704k.m82113a(webView.getContext(), intent2);
    }

    /* renamed from: a */
    private final boolean m82096a(Aweme aweme, Uri uri, String str, boolean z, String str2, WebView webView) {
        Intent intent;
        PackageManager packageManager;
        AbstractC34340m mVar;
        if (uri != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (C89219l.m154714a((Object) "market", (Object) str)) {
                m82093a(aweme, uri, str2, webView);
                return true;
            } else if (C89219l.m154714a((Object) "intent", (Object) str) && z) {
                ALog.m59865d("commerce_jump", "【filterUrl】 = " + str2 + " 【intent】 special handle");
                ICrossPlatformLegacyService f = CrossPlatformLegacyServiceImpl.m65225f();
                String str3 = null;
                try {
                    intent = Intent.parseUri(str2, 1);
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                    intent = null;
                }
                Activity a = C34729o.m70950a(webView.getContext());
                if (a != null) {
                    packageManager = a.getPackageManager();
                } else {
                    packageManager = null;
                }
                if (packageManager == null || intent == null || intent.resolveActivity(packageManager) == null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    C89219l.m154716b(f, "");
                    C34337k kVar = this.f95300h;
                    C89219l.m154721d(f, "");
                    C89219l.m154721d(webView, "");
                    C89219l.m154721d(intent2, "");
                    if (intent != null) {
                        if (f.mo57039a(webView.getContext())) {
                            intent2.setData(Uri.parse("market://details?id=" + intent.getPackage()));
                            if (!(packageManager == null || intent2.resolveActivity(packageManager) == null)) {
                                intent.addFlags(268435456);
                                C40704k.m82114a(str2, kVar);
                                C40704k.m82113a(webView.getContext(), intent2);
                                return true;
                            }
                        }
                        String a2 = m82092a(intent, "browser_fallback_url");
                        if (a2 != null && C30128d.m60946a(a2)) {
                            m82100b(webView, a2);
                            return true;
                        }
                    }
                    C89219l.m154721d(f, "");
                    C89219l.m154721d(webView, "");
                    if (!f.mo57039a(webView.getContext())) {
                        Context context = webView.getContext();
                        if (intent != null) {
                            str3 = intent.getPackage();
                        }
                        return f.mo57041a(context, str3);
                    }
                } else {
                    intent.addFlags(268435456);
                    if (str2 != null) {
                        C40603d.C40604a.m81964a();
                        C34337k kVar2 = this.f95300h;
                        if (kVar2 != null) {
                            mVar = (AbstractC34340m) kVar2.mo60793a(AbstractC34340m.class);
                        } else {
                            mVar = null;
                        }
                        Uri parse = Uri.parse(str2);
                        C89219l.m154716b(parse, "");
                        C40603d.m81957a(mVar, "webview_safe_log", "filter_scheme", new C34350v(parse, "intent_scheme_", null, 4).getFormatData(), null, null);
                    }
                    Context context2 = webView.getContext();
                    C89219l.m154716b(context2, "");
                    String packageName = context2.getPackageName();
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        str3 = component.getPackageName();
                    }
                    if (C89219l.m154714a((Object) packageName, (Object) str3)) {
                        return false;
                    }
                    Context context3 = webView.getContext();
                    C84349a.m145093a(intent, context3);
                    context3.startActivity(intent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82098a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15, boolean r16, java.lang.String r17, android.webkit.WebView r18, com.p2082ss.android.ugc.aweme.p2282ad.p2291e.C33197a r19, boolean r20) {
        /*
            r13 = this;
            r0 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r0 != 0) goto L_0x0010
            r1 = r17
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            return r4
        L_0x0011:
            java.lang.String r0 = "intent"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r15)
            if (r0 == 0) goto L_0x0010
            if (r16 != 0) goto L_0x0010
            r3 = 1
            r2 = 0
            android.content.Intent r1 = android.content.Intent.parseUri(r1, r3)     // Catch:{ URISyntaxException -> 0x0028 }
            if (r1 == 0) goto L_0x002d
            android.net.Uri r7 = r1.getData()
            goto L_0x002e
        L_0x0028:
            r0 = move-exception
            r0.printStackTrace()
            r1 = r2
        L_0x002d:
            r7 = r2
        L_0x002e:
            r12 = 0
            r5 = r13
            r8 = 0
            r9 = r18
            r11 = r20
            r6 = r14
            r10 = r19
            boolean r0 = r5.m82097a(r6, r7, r8, r9, r10, r11, r12)
            if (r0 != 0) goto L_0x005b
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "browser_fallback_url"
            java.lang.String r2 = m82092a(r1, r0)
        L_0x0046:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x005a
            android.net.Uri r7 = android.net.Uri.parse(r2)
            r12 = 1
            r5 = r13
            r8 = 0
            boolean r0 = r5.m82097a(r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x005a
            return r3
        L_0x005a:
            return r4
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.C40698j.m82098a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, java.lang.String, android.webkit.WebView, com.ss.android.ugc.aweme.ad.e.a, boolean):boolean");
    }

    /* renamed from: a */
    private final boolean m82097a(Aweme aweme, Uri uri, boolean z, WebView webView, C33197a aVar, boolean z2, boolean z3) {
        String str;
        String str2 = null;
        if (uri != null) {
            str = uri.toString();
            String scheme = uri.getScheme();
            if (scheme != null) {
                Locale locale = Locale.getDefault();
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                str2 = scheme.toLowerCase(locale);
                C89219l.m154716b(str2, "");
            }
        } else {
            str = null;
        }
        boolean a = m82099a(str, str2, aVar);
        if (aVar == null ? !z2 || a || z : !z2 || !aVar.isJumpControlEnabled() || a || z) {
            if (!C30128d.m60946a(str)) {
                if (C89219l.m154714a((Object) "market", (Object) str2)) {
                    m82093a(aweme, uri, str, webView);
                    return true;
                } else if (!CrossPlatformLegacyServiceImpl.m65225f().mo57048c(webView.getContext(), Uri.parse(str))) {
                    return false;
                } else {
                    C38655av.m78421b();
                    C38655av.m78418a();
                    try {
                        C30125a.m60938b(webView.getContext(), str);
                    } catch (Exception unused) {
                    }
                    ALog.m59865d("commerce_jump", "【filterUrl】 = " + str + " 【open scheme final】");
                    return true;
                }
            }
        }
        if (!z3 || !C30128d.m60946a(str) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str == null) {
            C89219l.m154715b();
        }
        m82100b(webView, str);
        return true;
    }
}
