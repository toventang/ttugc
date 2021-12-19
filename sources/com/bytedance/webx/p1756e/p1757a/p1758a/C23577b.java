package com.bytedance.webx.p1756e.p1757a.p1758a;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1756e.C23596c;
import com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b;
import com.bytedance.webx.p1762f.AbstractC23606a;
import com.bytedance.webx.p1762f.C23607b;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;

/* renamed from: com.bytedance.webx.e.a.a.b */
public class C23577b extends C23576b {
    static {
        Covode.recordClassIndex(27675);
    }

    /* renamed from: a */
    public final boolean mo38768a(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* renamed from: a */
    public final boolean mo38767a(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    /* renamed from: a */
    public final void mo38764a(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    /* renamed from: a */
    public final boolean mo38765a(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    /* renamed from: a */
    public final boolean mo38766a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    /* renamed from: com.bytedance.webx.e.a.a.b$a */
    public static abstract class AbstractC23578a extends AbstractC23606a<C23577b> {
        static {
            Covode.recordClassIndex(27676);
        }

        /* renamed from: a */
        public boolean mo34976a(WebView webView, WebResourceRequest webResourceRequest) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "shouldOverrideUrlLoading");
            if (a instanceof AbstractC23578a) {
                return ((AbstractC23578a) a).mo34976a(webView, webResourceRequest);
            }
            return ((C23577b) mo39033x()).mo38767a(webView, webResourceRequest);
        }

        /* renamed from: a */
        public void mo34974a(WebView webView, String str, Bitmap bitmap) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onPageStarted");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34974a(webView, str, bitmap);
            } else {
                ((C23577b) mo39033x()).mo38762a(webView, str, bitmap);
            }
        }

        /* renamed from: a */
        public void mo34973a(WebView webView, String str) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onPageFinished");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34973a(webView, str);
            } else {
                ((C23577b) mo39033x()).mo38772b(webView, str);
            }
        }

        /* renamed from: a */
        public void mo34972a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onReceivedHttpError");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34972a(webView, webResourceRequest, webResourceResponse);
            } else {
                ((C23577b) mo39033x()).mo38761a(webView, webResourceRequest, webResourceResponse);
            }
        }

        /* renamed from: a */
        public void mo38781a(WebView webView, String str, boolean z) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "doUpdateVisitedHistory");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo38781a(webView, str, z);
            } else {
                ((C23577b) mo39033x()).mo38764a(webView, str, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38782a(android.webkit.WebView r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "shouldOverrideKeyEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                boolean r0 = r0.mo38765a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38782a(android.webkit.WebView, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38780a(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onReceivedLoginRequest"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38763a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38780a(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* renamed from: a */
        public boolean mo34975a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onRenderProcessGone");
            if (a instanceof AbstractC23578a) {
                return ((AbstractC23578a) a).mo34975a(webView, renderProcessGoneDetail);
            }
            return ((C23577b) mo39033x()).mo38766a(webView, renderProcessGoneDetail);
        }

        /* renamed from: b */
        public WebResourceResponse mo34977b(WebView webView, WebResourceRequest webResourceRequest) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "shouldInterceptRequest");
            if (a instanceof AbstractC23578a) {
                return ((AbstractC23578a) a).mo34977b(webView, webResourceRequest);
            }
            return ((C23577b) mo39033x()).mo38769b(webView, webResourceRequest);
        }

        /* renamed from: c */
        public void mo34979c(WebView webView, String str) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onLoadResource");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34979c(webView, str);
            } else {
                ((C23577b) mo39033x()).mo38773c(webView, str);
            }
        }

        /* renamed from: d */
        public WebResourceResponse mo34980d(WebView webView, String str) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "shouldInterceptRequest");
            if (a instanceof AbstractC23578a) {
                return ((AbstractC23578a) a).mo34980d(webView, str);
            }
            return ((C23577b) mo39033x()).mo38775e(webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38785e(android.webkit.WebView r4, java.lang.String r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onPageCommitVisible"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38774d(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38785e(android.webkit.WebView, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38784b(android.webkit.WebView r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onUnhandledKeyEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38771b(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38784b(android.webkit.WebView, android.view.KeyEvent):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38778a(android.webkit.WebView r4, android.webkit.ClientCertRequest r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onReceivedClientCertRequest"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38756a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38778a(android.webkit.WebView, android.webkit.ClientCertRequest):void");
        }

        /* renamed from: b */
        public boolean mo34978b(WebView webView, String str) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "shouldOverrideUrlLoading");
            if (a instanceof AbstractC23578a) {
                return ((AbstractC23578a) a).mo34978b(webView, str);
            }
            return ((C23577b) mo39033x()).mo38768a(webView, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38776a(android.webkit.WebView r4, float r5, float r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onScaleChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38753a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38776a(android.webkit.WebView, float, float):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38783b(android.webkit.WebView r4, android.os.Message r5, android.os.Message r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onFormResubmission"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38770b(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38783b(android.webkit.WebView, android.os.Message, android.os.Message):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38777a(android.webkit.WebView r4, android.os.Message r5, android.os.Message r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onTooManyRedirects"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38755a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38777a(android.webkit.WebView, android.os.Message, android.os.Message):void");
        }

        /* renamed from: a */
        public void mo34970a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onReceivedSslError");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34970a(webView, sslErrorHandler, sslError);
            } else {
                ((C23577b) mo39033x()).mo38758a(webView, sslErrorHandler, sslError);
            }
        }

        /* renamed from: a */
        public void mo34971a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onReceivedError");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34971a(webView, webResourceRequest, webResourceError);
            } else {
                ((C23577b) mo39033x()).mo38760a(webView, webResourceRequest, webResourceError);
            }
        }

        /* renamed from: a */
        public void mo34968a(WebView webView, int i, String str, String str2) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onReceivedError");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34968a(webView, i, str, str2);
            } else {
                ((C23577b) mo39033x()).mo38754a(webView, i, str, str2);
            }
        }

        /* renamed from: a */
        public void mo34969a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onReceivedHttpAuthRequest");
            if (a instanceof AbstractC23578a) {
                ((AbstractC23578a) a).mo34969a(webView, httpAuthHandler, str, str2);
            } else {
                ((C23577b) mo39033x()).mo38757a(webView, httpAuthHandler, str, str2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38779a(android.webkit.WebView r4, android.webkit.WebResourceRequest r5, int r6, android.webkit.SafeBrowsingResponse r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onSafeBrowsingHit"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.b r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23577b) r0
                r0.mo38759a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23577b.AbstractC23578a.mo38779a(android.webkit.WebView, android.webkit.WebResourceRequest, int, android.webkit.SafeBrowsingResponse):void");
        }
    }

    /* renamed from: c */
    public final void mo38773c(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    /* renamed from: d */
    public final void mo38774d(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
    }

    /* renamed from: b */
    public final WebResourceResponse mo38769b(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* renamed from: e */
    public final WebResourceResponse mo38775e(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    /* renamed from: b */
    public final void mo38771b(WebView webView, KeyEvent keyEvent) {
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    /* renamed from: a */
    public final void mo38756a(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    /* renamed from: b */
    public final void mo38772b(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onLoadResource(WebView webView, String str) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onLoadResource");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34979c(webView, str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onPageCommitVisible(WebView webView, String str) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onPageCommitVisible");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38785e(webView, str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onPageFinished(WebView webView, String str) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onPageFinished");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34973a(webView, str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedClientCertRequest");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38778a(webView, clientCertRequest);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onRenderProcessGone");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34975a(webView, renderProcessGoneDetail);
            C23596c.f55856b.get().mo39029b();
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        return C23833c.m45039a(webView, renderProcessGoneDetail);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onUnhandledKeyEvent");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38784b(webView, keyEvent);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "shouldOverrideKeyEvent");
        if (!(a instanceof AbstractC23578a)) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23578a) a).mo38782a(webView, keyEvent);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "shouldOverrideUrlLoading");
        if (!(a instanceof AbstractC23578a)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23578a) a).mo34976a(webView, webResourceRequest);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
        if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
            return o.f139469b;
        }
        if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
            WebView webView2 = o.f139470c;
            Q q = o.f139468a;
            AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "shouldInterceptRequest");
            if (!(a instanceof AbstractC23578a)) {
                return super.shouldInterceptRequest(webView2, (WebResourceRequest) q);
            }
            C23596c.f55856b.get().mo39028a();
            WebResourceResponse b = ((AbstractC23578a) a).mo34977b(webView2, (WebResourceRequest) q);
            C23596c.f55856b.get().mo39029b();
            return b;
        }
        throw o.f139472e;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "shouldOverrideUrlLoading");
        if (!(a instanceof AbstractC23578a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        C23596c.f55856b.get().mo39028a();
        boolean b = ((AbstractC23578a) a).mo34978b(webView, str);
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C61425e<String, WebResourceResponse> n = C61439n.f139485e.mo68813n(new C61425e<>(str, webView, null, EnumC61424d.CONTINUE));
        if (n.f139473f == EnumC61424d.INTERCEPT && n.f139469b != null) {
            return n.f139469b;
        }
        if (n.f139473f != EnumC61424d.EXCEPTION || n.f139472e == null) {
            WebView webView2 = n.f139470c;
            Q q = n.f139468a;
            AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "shouldInterceptRequest");
            if (!(a instanceof AbstractC23578a)) {
                return super.shouldInterceptRequest(webView2, (String) q);
            }
            C23596c.f55856b.get().mo39028a();
            WebResourceResponse d = ((AbstractC23578a) a).mo34980d(webView2, q);
            C23596c.f55856b.get().mo39029b();
            return d;
        }
        throw n.f139472e;
    }

    /* renamed from: a */
    public final void mo38753a(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
    }

    /* renamed from: b */
    public final void mo38770b(WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    /* renamed from: a */
    public final void mo38755a(WebView webView, Message message, Message message2) {
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "doUpdateVisitedHistory");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38781a(webView, str, z);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onFormResubmission");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38783b(webView, message, message2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onPageStarted");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34974a(webView, str, bitmap);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedHttpError");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34972a(webView, webResourceRequest, webResourceResponse);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedSslError");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34970a(webView, sslErrorHandler, sslError);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onScaleChanged(WebView webView, float f, float f2) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onScaleChanged");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38776a(webView, f, f2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onTooManyRedirects");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38777a(webView, message, message2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    /* renamed from: a */
    public final void mo38758a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedError");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34971a(webView, webResourceRequest, webResourceError);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    /* renamed from: a */
    public final void mo38760a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    /* renamed from: a */
    public final void mo38761a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    /* renamed from: a */
    public final void mo38762a(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    /* renamed from: a */
    public final void mo38754a(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    /* renamed from: a */
    public final void mo38757a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedError");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34968a(webView, i, str, str2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedHttpAuthRequest");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo34969a(webView, httpAuthHandler, str, str2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedLoginRequest");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38780a(webView, str, str2, str3);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23576b
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onSafeBrowsingHit");
        if (a instanceof AbstractC23578a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23578a) a).mo38779a(webView, webResourceRequest, i, safeBrowsingResponse);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    /* renamed from: a */
    public final void mo38759a(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    /* renamed from: a */
    public final void mo38763a(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }
}
