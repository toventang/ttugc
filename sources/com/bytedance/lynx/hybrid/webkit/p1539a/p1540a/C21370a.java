package com.bytedance.lynx.hybrid.webkit.p1539a.p1540a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.C12230n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21152f;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.service.AbstractC21365f;
import com.bytedance.lynx.hybrid.webkit.C21394d;
import com.bytedance.lynx.hybrid.webkit.C21395e;
import com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21385f;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.AbstractC23568e;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23573a;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23577b;
import com.bytedance.webx.p1756e.p1757a.p1761c.C23588a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a */
public final class C21370a extends AbstractC23547a<C23586c> implements AbstractC23568e.AbstractC23569a {

    /* renamed from: a */
    public static final C21371a f50719a = new C21371a((byte) 0);

    /* renamed from: b */
    private final C21374c f50720b = new C21374c();

    /* renamed from: j */
    private final C21372b f50721j = new C21372b();

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$b */
    public final class C21372b extends AbstractC23547a<C23573a> {

        /* renamed from: b */
        private C21373a f50723b = new C21373a(this);

        static {
            Covode.recordClassIndex(24992);
        }

        /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$b$a */
        public static final class C21373a extends C23573a.AbstractC23574a {

            /* renamed from: a */
            final /* synthetic */ C21372b f50724a;

            static {
                Covode.recordClassIndex(24993);
            }

            @Override // com.bytedance.webx.p1762f.AbstractC23606a
            /* renamed from: a */
            public final AbstractC23547a<?> mo34966a() {
                return this.f50724a;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C21373a(C21372b bVar) {
                this.f50724a = bVar;
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
            /* renamed from: a */
            public final void mo34967a(WebView webView, int i) {
                super.mo34967a(webView, i);
                C12230n.m21942a().mo19578a(webView, i);
            }
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final boolean mo34965a() {
            return C21370a.this.mo34965a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C21372b() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            mo38630a("onProgressChanged", this.f50723b, 8000);
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$c */
    public final class C21374c extends AbstractC23547a<C23577b> {

        /* renamed from: b */
        private C21375a f50726b = new C21375a(this);

        static {
            Covode.recordClassIndex(24994);
        }

        /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$c$a */
        public static final class C21375a extends C23577b.AbstractC23578a {

            /* renamed from: a */
            public boolean f50727a;

            /* renamed from: b */
            final /* synthetic */ C21374c f50728b;

            static {
                Covode.recordClassIndex(24995);
            }

            @Override // com.bytedance.webx.p1762f.AbstractC23606a
            /* renamed from: a */
            public final AbstractC23547a<?> mo34966a() {
                return this.f50728b;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C21375a(C21374c cVar) {
                this.f50728b = cVar;
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final boolean mo34976a(WebView webView, WebResourceRequest webResourceRequest) {
                return super.mo34976a(webView, webResourceRequest);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final boolean mo34975a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if ((webView instanceof C21395e) && webView != null) {
                    C21210c.m39925a("onRenderProcessGone", (EnumC21209b) null, (String) null, 6);
                }
                return super.mo34975a(webView, renderProcessGoneDetail);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: c */
            public final void mo34979c(WebView webView, String str) {
                AbstractC21365f bridgeService$hybrid_web_release;
                super.mo34979c(webView, str);
                if (!(webView instanceof C21395e)) {
                    webView = null;
                }
                C21395e eVar = (C21395e) webView;
                if (eVar != null && str != null && (bridgeService$hybrid_web_release = eVar.getBridgeService$hybrid_web_release()) != null) {
                    bridgeService$hybrid_web_release.mo34712c(str);
                }
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: b */
            public final boolean mo34978b(WebView webView, String str) {
                WebView webView2;
                AbstractC21365f bridgeService$hybrid_web_release;
                if (!(webView instanceof C21395e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    C21210c.m39925a("shouldOverrideUrlLoading, url:".concat(String.valueOf(str)), (EnumC21209b) null, (String) null, 6);
                    if (!(str == null || (bridgeService$hybrid_web_release = eVar.getBridgeService$hybrid_web_release()) == null || !bridgeService$hybrid_web_release.mo34711b(str))) {
                        C21210c.m39925a("shouldOverrideUrlLoading, intercept by js bridge", (EnumC21209b) null, (String) null, 6);
                        return true;
                    }
                }
                return super.mo34978b(webView, str);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: b */
            public final WebResourceResponse mo34977b(WebView webView, WebResourceRequest webResourceRequest) {
                C21394d initParams$hybrid_web_release;
                Map<String, String> map;
                Map<String, String> requestHeaders;
                Object obj = null;
                C21395e eVar = (C21395e) (!(webView instanceof C21395e) ? null : webView);
                if (!(eVar == null || (initParams$hybrid_web_release = eVar.getInitParams$hybrid_web_release()) == null || (map = initParams$hybrid_web_release.f50756g) == null)) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        arrayList.add((webResourceRequest == null || (requestHeaders = webResourceRequest.getRequestHeaders()) == null) ? null : requestHeaders.put(entry.getKey(), entry.getValue()));
                    }
                }
                C89219l.m154719c("WEB_RESOURCE_REQUEST", "");
                try {
                    Map map2 = (Map) C21385f.f50740a.get();
                    if (map2 != null) {
                        Object obj2 = map2.get("WEB_RESOURCE_REQUEST");
                        if (obj2 == null) {
                            obj2 = new Stack();
                            map2.put("WEB_RESOURCE_REQUEST", obj2);
                        }
                        obj = ((Stack) obj2).push(webResourceRequest);
                    }
                    C89379q.m157068constructorimpl(obj);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                WebResourceResponse b = super.mo34977b(webView, webResourceRequest);
                C21385f.C21386a.m40155a("WEB_RESOURCE_REQUEST");
                return b;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
                if (r2 != null) goto L_0x00d4;
             */
            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final android.webkit.WebResourceResponse mo34980d(android.webkit.WebView r13, java.lang.String r14) {
                /*
                // Method dump skipped, instructions count: 232
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21370a.C21374c.C21375a.mo34980d(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34973a(WebView webView, String str) {
                WebView webView2;
                super.mo34973a(webView, str);
                C12230n.m21942a().mo19583e(webView, str);
                boolean z = webView instanceof C21395e;
                if (!z) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    AbstractC21152f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release != null) {
                        webKitLifeCycle$hybrid_web_release.mo25381a(eVar);
                    }
                    C21210c.m39925a("onPageFinished, url:".concat(String.valueOf(str)), (EnumC21209b) null, (String) null, 6);
                }
                if (!z) {
                    webView = null;
                }
                C21395e eVar2 = (C21395e) webView;
                if (eVar2 != null) {
                    eVar2.loadUrl("javascript:(function () {    window.reactId = '" + eVar2.getHybridContext().f50280f + "';})();");
                }
                if (!this.f50727a && str != null) {
                    Uri.parse(str);
                }
                this.f50727a = false;
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34970a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                WebView webView2;
                String str;
                String str2;
                this.f50727a = true;
                if (!(webView instanceof C21395e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    AbstractC21152f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release != null) {
                        String webUrl$hybrid_web_release = eVar.getWebUrl$hybrid_web_release();
                        if (webUrl$hybrid_web_release == null) {
                            webUrl$hybrid_web_release = "";
                        }
                        StringBuilder sb = new StringBuilder("onReceivedSslError, error:");
                        if (sslError != null) {
                            str2 = sslError.toString();
                        } else {
                            str2 = null;
                        }
                        webKitLifeCycle$hybrid_web_release.mo34719a(eVar, webUrl$hybrid_web_release, sb.append(str2).toString());
                    }
                    StringBuilder sb2 = new StringBuilder("onReceivedSslError, error:");
                    if (sslError != null) {
                        str = sslError.toString();
                    } else {
                        str = null;
                    }
                    C21210c.m39925a(sb2.append(str).toString(), (EnumC21209b) null, (String) null, 6);
                }
                super.mo34970a(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34971a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                WebView webView2;
                Integer num;
                CharSequence charSequence;
                Uri uri;
                Boolean bool;
                AbstractC21152f webKitLifeCycle$hybrid_web_release;
                Integer num2;
                CharSequence charSequence2;
                if (!(webView instanceof C21395e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    if (!(webResourceRequest == null || !webResourceRequest.isForMainFrame() || (webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release()) == null)) {
                        String webUrl$hybrid_web_release = eVar.getWebUrl$hybrid_web_release();
                        if (webUrl$hybrid_web_release == null) {
                            webUrl$hybrid_web_release = "";
                        }
                        StringBuilder sb = new StringBuilder("errorCode:");
                        if (webResourceError != null) {
                            num2 = Integer.valueOf(webResourceError.getErrorCode());
                        } else {
                            num2 = null;
                        }
                        StringBuilder append = sb.append(num2).append(", description:");
                        if (webResourceError != null) {
                            charSequence2 = webResourceError.getDescription();
                        } else {
                            charSequence2 = null;
                        }
                        webKitLifeCycle$hybrid_web_release.mo34719a(eVar, webUrl$hybrid_web_release, append.append(charSequence2).append(", ").toString());
                    }
                    StringBuilder sb2 = new StringBuilder("onReceivedError, errorCode:");
                    if (webResourceError != null) {
                        num = Integer.valueOf(webResourceError.getErrorCode());
                    } else {
                        num = null;
                    }
                    StringBuilder append2 = sb2.append(num).append(", description:");
                    if (webResourceError != null) {
                        charSequence = webResourceError.getDescription();
                    } else {
                        charSequence = null;
                    }
                    StringBuilder append3 = append2.append(charSequence).append(", failingUrl:");
                    if (webResourceRequest != null) {
                        uri = webResourceRequest.getUrl();
                    } else {
                        uri = null;
                    }
                    StringBuilder append4 = append3.append(uri).append(", isForMainFrame:");
                    if (webResourceRequest != null) {
                        bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
                    } else {
                        bool = null;
                    }
                    C21210c.m39925a(append4.append(bool).toString(), (EnumC21209b) null, (String) null, 6);
                }
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    this.f50727a = true;
                }
                super.mo34971a(webView, webResourceRequest, webResourceError);
                C12230n.m21942a().mo19580a(webView, webResourceRequest, webResourceError);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34972a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                WebView webView2;
                Integer num;
                String str;
                Uri uri;
                Boolean bool;
                String str2;
                if (!(webView instanceof C21395e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        this.f50727a = true;
                        AbstractC21152f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                        if (webKitLifeCycle$hybrid_web_release != null) {
                            String uri2 = webResourceRequest.getUrl().toString();
                            C89219l.m154709a((Object) uri2, "");
                            if (webResourceResponse != null) {
                                str2 = webResourceResponse.getReasonPhrase();
                            } else {
                                str2 = null;
                            }
                            webKitLifeCycle$hybrid_web_release.mo34719a(eVar, uri2, str2);
                        }
                    }
                    StringBuilder sb = new StringBuilder("onReceivedError, errorCode:");
                    if (webResourceResponse != null) {
                        num = Integer.valueOf(webResourceResponse.getStatusCode());
                    } else {
                        num = null;
                    }
                    StringBuilder append = sb.append(num).append(", reason:");
                    if (webResourceResponse != null) {
                        str = webResourceResponse.getReasonPhrase();
                    } else {
                        str = null;
                    }
                    StringBuilder append2 = append.append(str).append(", failingUrl:");
                    if (webResourceRequest != null) {
                        uri = webResourceRequest.getUrl();
                    } else {
                        uri = null;
                    }
                    StringBuilder append3 = append2.append(uri).append(", isForMainFrame:");
                    if (webResourceRequest != null) {
                        bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
                    } else {
                        bool = null;
                    }
                    C21210c.m39925a(append3.append(bool).toString(), (EnumC21209b) null, (String) null, 6);
                }
                super.mo34972a(webView, webResourceRequest, webResourceResponse);
                C12230n.m21942a().mo19581a(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34974a(WebView webView, String str, Bitmap bitmap) {
                WebView webView2;
                AbstractC21365f bridgeService$hybrid_web_release;
                if (!(webView instanceof C21395e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    if (!(str == null || (bridgeService$hybrid_web_release = eVar.getBridgeService$hybrid_web_release()) == null)) {
                        bridgeService$hybrid_web_release.mo34709a(str);
                    }
                    C21210c.m39925a("onPageStarted, url:".concat(String.valueOf(str)), (EnumC21209b) null, (String) null, 6);
                }
                super.mo34974a(webView, str, bitmap);
                C12230n.m21942a().mo19582c(webView, str);
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34969a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                super.mo34969a(webView, httpAuthHandler, str, str2);
                if ((webView instanceof C21395e) && webView != null) {
                    C21210c.m39925a("onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2, (EnumC21209b) null, (String) null, 6);
                }
            }

            @Override // com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
            /* renamed from: a */
            public final void mo34968a(WebView webView, int i, String str, String str2) {
                WebView webView2;
                this.f50727a = true;
                if (!(webView instanceof C21395e)) {
                    webView2 = null;
                } else {
                    webView2 = webView;
                }
                C21395e eVar = (C21395e) webView2;
                if (eVar != null) {
                    String str3 = "onReceivedError, errorCode:" + i + ", description:" + str + ", failingUrl:" + str2;
                    AbstractC21152f webKitLifeCycle$hybrid_web_release = eVar.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release != null) {
                        String webUrl$hybrid_web_release = eVar.getWebUrl$hybrid_web_release();
                        if (webUrl$hybrid_web_release == null) {
                            webUrl$hybrid_web_release = "";
                        }
                        webKitLifeCycle$hybrid_web_release.mo34719a(eVar, webUrl$hybrid_web_release, str3);
                    }
                    C21210c.m39925a(str3, (EnumC21209b) null, (String) null, 6);
                }
                super.mo34968a(webView, i, str, str2);
                C12230n.m21942a().mo19579a(webView, i, str, str2);
            }
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final boolean mo34965a() {
            return C21370a.this.mo34965a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C21374c() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            mo38630a("onPageFinished", this.f50726b, 8000);
            mo38630a("onReceivedError", this.f50726b, 8000);
            mo38630a("onReceivedHttpError", this.f50726b, 8000);
            mo38630a("onReceivedHttpAuthRequest", this.f50726b, 8000);
            mo38630a("onReceivedSslError", this.f50726b, 8000);
            mo38630a("onPageStarted", this.f50726b, 8000);
            mo38630a("shouldOverrideUrlLoading", this.f50726b, 8000);
            mo38630a("onLoadResource", this.f50726b, 8000);
            mo38630a("shouldInterceptRequest", this.f50726b, 8000);
            mo38630a("onRenderProcessGone", this.f50726b, 8000);
        }
    }

    static {
        Covode.recordClassIndex(24990);
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.a$a */
    public static final class C21371a {
        static {
            Covode.recordClassIndex(24991);
        }

        private C21371a() {
        }

        public /* synthetic */ C21371a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.webx.AbstractC23547a
    /* renamed from: a */
    public final void mo34964a(AbstractC23547a.C23548a aVar) {
        this.f55780g = "basic";
        if (aVar == null) {
            C89219l.m154707a();
        }
        C23588a aVar2 = (C23588a) mo38631b();
        C89219l.m154709a((Object) aVar2, "");
        AbstractC23547a.C23548a.m44294a(aVar2.getExtendableWebViewClient(), this.f50720b);
        C23588a aVar3 = (C23588a) mo38631b();
        C89219l.m154709a((Object) aVar3, "");
        AbstractC23547a.C23548a.m44294a(aVar3.getExtendableWebChromeClient(), this.f50721j);
    }
}
