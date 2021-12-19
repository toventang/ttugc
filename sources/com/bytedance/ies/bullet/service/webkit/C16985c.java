package com.bytedance.ies.bullet.service.webkit;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16674b;
import com.bytedance.ies.bullet.service.base.web.AbstractC16678e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16682i;
import com.bytedance.ies.bullet.service.base.web.C16695p;
import com.bytedance.ies.bullet.service.base.web.C16696q;
import com.bytedance.ies.bullet.service.base.web.WebChromeClientDispatcher;
import com.bytedance.webx.C23609g;
import com.bytedance.webx.p1756e.p1757a.C23593e;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.webkit.c */
public final class C16985c implements AbstractC16682i {

    /* renamed from: a */
    public final C16983b f40444a;

    /* renamed from: b */
    public final C16696q f40445b;

    /* renamed from: c */
    private WebView f40446c;

    /* renamed from: d */
    private final C16695p f40447d = new C16695p();

    /* renamed from: e */
    private final WebChromeClientDispatcher f40448e = new WebChromeClientDispatcher();

    /* renamed from: f */
    private final AbstractC89244h f40449f = C89250i.m154773a((AbstractC89171a) new C16986a(this));

    static {
        Covode.recordClassIndex(19430);
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16682i
    /* renamed from: b */
    public final C16695p mo26499b() {
        return this.f40447d;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16682i
    /* renamed from: c */
    public final WebChromeClientDispatcher mo26500c() {
        return this.f40448e;
    }

    /* renamed from: com.bytedance.ies.bullet.service.webkit.c$a */
    static final class C16986a extends AbstractC89220m implements AbstractC89171a<C16982a> {

        /* renamed from: a */
        final /* synthetic */ C16985c f40450a;

        static {
            Covode.recordClassIndex(19431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16986a(C16985c cVar) {
            super(0);
            this.f40450a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16982a invoke() {
            return new C16982a(this.f40450a.f40444a);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16682i
    /* renamed from: d */
    public final AbstractC16674b mo26501d() {
        return (C16982a) this.f40449f.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16682i
    /* renamed from: e */
    public final void mo26502e() {
        this.f40447d.f39872a.clear();
        this.f40448e.f39859a.clear();
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16682i
    /* renamed from: a */
    public final WebView mo26497a() {
        WebView webView = this.f40446c;
        if (webView != null) {
            return webView;
        }
        throw new IllegalStateException("You must call 'createWebView' or 'setWebView' first.".toString());
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16682i
    /* renamed from: a */
    public final AbstractC16682i mo26498a(Context context) {
        WebView webView;
        MethodCollector.m26663i(7746);
        C89219l.m154719c(context, "");
        AbstractC16678e eVar = (AbstractC16678e) C16622e.C16623a.m30858a().mo26346a(AbstractC16678e.class);
        WebView webView2 = null;
        if (eVar != null) {
            webView2 = eVar.mo26489a(context, (String) null);
        }
        this.f40446c = webView2;
        if (webView2 == null) {
            try {
                webView = ((C23593e) C23609g.m44643a("webx_webkit", C23593e.class)).mo39014a(context);
            } catch (Throwable unused) {
                webView = new WebView(context);
            }
            this.f40446c = webView;
        }
        WebView webView3 = this.f40446c;
        if (webView3 != null) {
            C16695p pVar = this.f40447d;
            if (C84367b.m145126a() && pVar != null) {
                WebSettings settings = webView3.getSettings();
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
            webView3.setWebViewClient(C23833c.m45038a(pVar));
            webView3.setWebChromeClient(this.f40448e);
        }
        MethodCollector.m26664o(7746);
        return this;
    }

    public C16985c(C16983b bVar, C16696q qVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(qVar, "");
        this.f40444a = bVar;
        this.f40445b = qVar;
    }
}
