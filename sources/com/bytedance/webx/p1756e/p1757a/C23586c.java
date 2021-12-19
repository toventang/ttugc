package com.bytedance.webx.p1756e.p1757a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.C23557c;
import com.bytedance.webx.p1756e.C23596c;
import com.bytedance.webx.p1756e.p1757a.C23590d;
import com.bytedance.webx.p1756e.p1757a.p1761c.C23588a;
import com.bytedance.webx.p1762f.AbstractC23606a;
import com.bytedance.webx.p1762f.C23607b;
import com.example.p1811a.C23833c;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.webx.e.a.c */
public class C23586c extends C23588a {
    static {
        Covode.recordClassIndex(27684);
    }

    /* renamed from: d */
    public final void mo38849d() {
        super.destroy();
    }

    /* renamed from: e */
    public final void mo38857e() {
        super.stopLoading();
    }

    /* renamed from: f */
    public final void mo38860f() {
        super.reload();
    }

    /* renamed from: h */
    public final void mo38871h() {
        super.goBack();
    }

    /* renamed from: j */
    public final void mo38873j() {
        super.goForward();
    }

    /* renamed from: k */
    public final void mo38874k() {
        super.onPause();
    }

    /* renamed from: l */
    public final void mo38875l() {
        super.onResume();
    }

    /* renamed from: u */
    public final void mo38922u() {
        super.onAttachedToWindow();
    }

    /* renamed from: v */
    public final void mo38923v() {
        super.onStartTemporaryDetach();
    }

    /* renamed from: w */
    public final void mo38924w() {
        super.onFinishTemporaryDetach();
    }

    /* renamed from: a */
    public final void mo38798a(SslCertificate sslCertificate) {
        super.setCertificate(sslCertificate);
    }

    /* renamed from: a */
    public final void mo38811a(String str, String str2, String str3) {
        super.savePassword(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo38812a(String str, String str2, String str3, String str4) {
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final String[] mo38830a(String str, String str2) {
        return super.getHttpAuthUsernamePassword(str, str2);
    }

    /* renamed from: a */
    public final void mo38815a(String str, Map<String, String> map, C23557c... cVarArr) {
        C23596c.f55855a.get().mo39031a(cVarArr);
        loadUrl(str, map);
        C23596c.f55855a.get().mo39030a();
    }

    /* renamed from: a */
    public final void mo38814a(String str, Map<String, String> map) {
        m44442a(this, str, map);
    }

    /* renamed from: a */
    public final void mo38818a(String str, C23557c... cVarArr) {
        C23596c.f55855a.get().mo39031a(cVarArr);
        loadUrl(str);
        C23596c.f55855a.get().mo39030a();
    }

    /* renamed from: a */
    public final void mo38817a(String str, byte[] bArr) {
        super.postUrl(str, bArr);
    }

    /* renamed from: a */
    public final void mo38813a(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    /* renamed from: a */
    public final void mo38810a(String str, ValueCallback<String> valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: a */
    public final void mo38816a(String str, boolean z, ValueCallback<String> valueCallback) {
        super.saveWebArchive(str, z, valueCallback);
    }

    /* renamed from: a */
    public final boolean mo38821a(int i) {
        return super.canGoBackOrForward(i);
    }

    /* renamed from: a */
    public final boolean mo38829a(boolean z) {
        return super.pageUp(z);
    }

    /* renamed from: a */
    public final void mo38806a(WebView.FindListener findListener) {
        super.setFindListener(findListener);
    }

    /* renamed from: a */
    public final void mo38799a(Message message) {
        super.documentHasImages(message);
    }

    /* renamed from: a */
    public final void mo38807a(WebViewClient webViewClient) {
        m44440a((C23588a) this, webViewClient);
    }

    /* renamed from: a */
    public final void mo38819a(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    /* renamed from: a */
    public final void mo38808a(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    /* renamed from: a */
    public final void mo38803a(DownloadListener downloadListener) {
        super.setDownloadListener(downloadListener);
    }

    /* renamed from: a */
    public final void mo38804a(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    /* renamed from: a */
    public final void mo38809a(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    /* renamed from: a */
    public final void mo38805a(WebMessage webMessage, Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    /* renamed from: a */
    public final boolean mo38828a(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo38825a(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public final boolean mo38823a(int i, int i2, KeyEvent keyEvent) {
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    /* renamed from: a */
    public final void mo38801a(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    /* renamed from: a */
    public final void mo38802a(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    /* renamed from: a */
    public final void mo38797a(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public final boolean mo38826a(DragEvent dragEvent) {
        return super.onDragEvent(dragEvent);
    }

    /* renamed from: a */
    public final void mo38800a(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    /* renamed from: a */
    public final void mo38820a(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    /* renamed from: a */
    public final boolean mo38827a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: a */
    public final boolean mo38824a(int i, Rect rect) {
        return super.requestFocus(i, rect);
    }

    /* renamed from: a */
    public final boolean mo38822a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    /* renamed from: com.bytedance.webx.e.a.c$a */
    public static abstract class AbstractC23587a extends AbstractC23606a<C23586c> implements AbstractC23572a {
        static {
            Covode.recordClassIndex(27685);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38937a(android.net.http.SslCertificate r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setCertificate"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38798a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38937a(android.net.http.SslCertificate):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38950a(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "savePassword"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38811a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38950a(java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38951a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setHttpAuthUsernamePassword"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38812a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38951a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String[] mo38966a(java.lang.String r4, java.lang.String r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getHttpAuthUsernamePassword"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                java.lang.String[] r0 = r0.mo38830a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38966a(java.lang.String, java.lang.String):java.lang.String[]");
        }

        /* renamed from: a */
        public void mo38789a(String str, Map<String, String> map) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "loadUrl");
            if (a instanceof AbstractC23587a) {
                ((AbstractC23587a) a).mo38789a(str, map);
            } else {
                ((C23586c) mo39033x()).mo38814a(str, map);
            }
        }

        /* renamed from: a */
        public void mo38788a(String str) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "loadUrl");
            if (a instanceof AbstractC23587a) {
                ((AbstractC23587a) a).mo38788a(str);
            } else {
                ((C23586c) mo39033x()).mo38837b(str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38954a(java.lang.String r4, byte[] r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "postUrl"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38817a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38954a(java.lang.String, byte[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38974b(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "loadData"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38838b(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38974b(java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38952a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            /*
                r6 = this;
                r2 = r6
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "loadDataWithBaseURL"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r4 = r10
                r5 = r11
                r1 = r7
                r2 = r8
                r3 = r9
                r0.mo38813a(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38952a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38949a(java.lang.String r4, android.webkit.ValueCallback<java.lang.String> r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "evaluateJavascript"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38810a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38949a(java.lang.String, android.webkit.ValueCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38953a(java.lang.String r4, boolean r5, android.webkit.ValueCallback<java.lang.String> r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "saveWebArchive"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38816a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38953a(java.lang.String, boolean, android.webkit.ValueCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38957a(int r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "canGoBackOrForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38821a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38957a(int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38965a(boolean r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "pageUp"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38829a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38965a(boolean):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38977b(boolean r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "pageDown"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38841b(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38977b(boolean):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38945a(android.webkit.WebView.FindListener r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setFindListener"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38806a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38945a(android.webkit.WebView$FindListener):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38938a(android.os.Message r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "documentHasImages"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38799a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38938a(android.os.Message):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38946a(android.webkit.WebViewClient r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setWebViewClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0015
                r2 = r1
                android.webkit.WebViewClient r4 = com.example.p1811a.C23833c.m45038a(r4)
                goto L_0x0001
            L_0x0015:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38807a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38946a(android.webkit.WebViewClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38955a(java.util.concurrent.Executor r4, android.webkit.WebViewRenderProcessClient r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setWebViewRenderProcessClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38819a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38955a(java.util.concurrent.Executor, android.webkit.WebViewRenderProcessClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38947a(android.webkit.WebViewRenderProcessClient r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setWebViewRenderProcessClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38808a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38947a(android.webkit.WebViewRenderProcessClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38942a(android.webkit.DownloadListener r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setDownloadListener"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38803a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38942a(android.webkit.DownloadListener):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38943a(android.webkit.WebChromeClient r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "setWebChromeClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38804a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38943a(android.webkit.WebChromeClient):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38948a(java.lang.Object r4, java.lang.String r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "addJavascriptInterface"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38809a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38948a(java.lang.Object, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38944a(android.webkit.WebMessage r4, android.net.Uri r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "postWebMessage"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38805a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38944a(android.webkit.WebMessage, android.net.Uri):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38964a(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onHoverEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38828a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38964a(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38976b(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onTouchEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38840b(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38976b(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38961a(int r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onKeyDown"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38825a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38961a(int, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38975b(int r4, android.view.KeyEvent r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onKeyUp"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38839b(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38975b(int, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38959a(int r4, int r5, android.view.KeyEvent r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onKeyMultiple"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38823a(r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38959a(int, int, android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38940a(android.view.ViewStructure r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onProvideVirtualStructure"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38801a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38940a(android.view.ViewStructure):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38941a(android.view.ViewStructure r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onProvideAutofillVirtualStructure"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38802a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38941a(android.view.ViewStructure, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38936a(android.graphics.Canvas r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onDraw"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38797a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38936a(android.graphics.Canvas):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38962a(android.view.DragEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onDragEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38826a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38962a(android.view.DragEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38939a(android.view.View r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onVisibilityChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38800a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38939a(android.view.View, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38956a(boolean r4, int r5, android.graphics.Rect r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onFocusChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38820a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38956a(boolean, int, android.graphics.Rect):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38963a(android.view.KeyEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "dispatchKeyEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38827a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38963a(android.view.KeyEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38960a(int r4, android.graphics.Rect r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "requestFocus"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38824a(r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38960a(int, android.graphics.Rect):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38958a(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, boolean r19) {
            /*
                r10 = this;
                r2 = r10
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "overScrollBy"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r4 = r14
                r3 = r13
                r2 = r12
                r1 = r11
                r5 = r15
                r9 = r19
                r8 = r18
                r7 = r17
                r6 = r16
                boolean r0 = r0.mo38822a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38958a(int, int, int, int, int, int, int, int, boolean):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.net.http.SslCertificate mo38967b() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getCertificate"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.net.http.SslCertificate r0 = r0.mo38842c()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38967b():android.net.http.SslCertificate");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38978c() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "destroy"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38849d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38978c():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38984d() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "stopLoading"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38857e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38984d():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38986e() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "reload"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38860f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38986e():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38988f() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "canGoBack"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38863g()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38988f():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38990g() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "goBack"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38871h()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38990g():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38991h() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "canGoForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38872i()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38991h():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38992i() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "goForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38873j()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38992i():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38993j() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onPause"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38874k()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38993j():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38994k() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onResume"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38875l()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38994k():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebViewClient mo38995l() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getWebViewClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebViewClient r0 = r0.mo38876m()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38995l():android.webkit.WebViewClient");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebViewRenderProcess mo38996m() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getWebViewRenderProcess"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebViewRenderProcess r0 = r0.mo38877n()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38996m():android.webkit.WebViewRenderProcess");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebViewRenderProcessClient mo38997n() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getWebViewRenderProcessClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebViewRenderProcessClient r0 = r0.mo38878o()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38997n():android.webkit.WebViewRenderProcessClient");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebChromeClient mo38998o() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getWebChromeClient"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebChromeClient r0 = r0.mo38902p()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38998o():android.webkit.WebChromeClient");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebMessagePort[] mo38999p() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "createWebMessageChannel"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebMessagePort[] r0 = r0.mo38906q()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38999p():android.webkit.WebMessagePort[]");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebSettings mo39000q() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getSettings"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebSettings r0 = r0.mo38907r()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39000q():android.webkit.WebSettings");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo39001r() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "zoomIn"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38911s()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39001r():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo39002s() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "zoomOut"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38921t()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39002s():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39003t() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onAttachedToWindow"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38922u()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39003t():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: u */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39004u() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onStartTemporaryDetach"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38923v()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39004u():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39005v() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onFinishTemporaryDetach"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38924w()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39005v():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: w */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo39006w() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onCheckIsTextEditor"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38925x()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo39006w():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.inputmethod.InputConnection mo38929a(android.view.inputmethod.EditorInfo r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onCreateInputConnection"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.view.inputmethod.InputConnection r0 = r0.mo38790a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38929a(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebBackForwardList mo38930a(android.os.Bundle r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "saveState"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebBackForwardList r0 = r0.mo38791a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38930a(android.os.Bundle):android.webkit.WebBackForwardList");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebBackForwardList mo38968b(android.os.Bundle r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "restoreState"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                android.webkit.WebBackForwardList r0 = r0.mo38832b(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38968b(android.os.Bundle):android.webkit.WebBackForwardList");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38979c(int r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onWindowVisibilityChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38843c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38979c(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38985d(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onTrackballEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38851d(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38985d(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38987e(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "dispatchTouchEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38858e(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38987e(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38989f(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onInterceptTouchEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38861f(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38989f(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38931a(float r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "zoomBy"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38792a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38931a(float):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38969b(int r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "goBackOrForward"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38833b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38969b(int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38980c(android.graphics.Canvas r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "draw"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38844c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38980c(android.graphics.Canvas):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38981c(java.lang.String r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "removeJavascriptInterface"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38850d(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38981c(java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38982c(boolean r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onWindowFocusChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38846c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38982c(boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38972b(android.graphics.Canvas r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "dispatchDraw"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38836b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38972b(android.graphics.Canvas):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38983c(android.view.MotionEvent r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onGenericMotionEvent"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                boolean r0 = r0.mo38847c(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38983c(android.view.MotionEvent):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38935a(android.content.res.Configuration r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onConfigurationChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38796a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38935a(android.content.res.Configuration):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38973b(java.lang.String r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "saveWebArchive"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38845c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38973b(java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38932a(int r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "flingScroll"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38793a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38932a(int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38970b(int r4, int r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onMeasure"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38834b(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38970b(int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38933a(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onSizeChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38794a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38933a(int, int, int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38971b(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onScrollChanged"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38835b(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38971b(int, int, int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38934a(int r4, int r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onOverScrolled"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.c r0 = (com.bytedance.webx.p1756e.p1757a.C23586c) r0
                r0.mo38795a(r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.C23586c.AbstractC23587a.mo38934a(int, int, boolean, boolean):void");
        }
    }

    /* renamed from: c */
    public final SslCertificate mo38842c() {
        return super.getCertificate();
    }

    /* renamed from: g */
    public final boolean mo38863g() {
        return super.canGoBack();
    }

    /* renamed from: i */
    public final boolean mo38872i() {
        return super.canGoForward();
    }

    /* renamed from: m */
    public final WebViewClient mo38876m() {
        return super.getWebViewClient();
    }

    /* renamed from: n */
    public final WebViewRenderProcess mo38877n() {
        return super.getWebViewRenderProcess();
    }

    /* renamed from: o */
    public final WebViewRenderProcessClient mo38878o() {
        return super.getWebViewRenderProcessClient();
    }

    /* renamed from: p */
    public final WebChromeClient mo38902p() {
        return super.getWebChromeClient();
    }

    /* renamed from: q */
    public final WebMessagePort[] mo38906q() {
        return super.createWebMessageChannel();
    }

    /* renamed from: r */
    public final WebSettings mo38907r() {
        return super.getSettings();
    }

    /* renamed from: s */
    public final boolean mo38911s() {
        return super.zoomIn();
    }

    /* renamed from: t */
    public final boolean mo38921t() {
        return super.zoomOut();
    }

    /* renamed from: x */
    public final boolean mo38925x() {
        return super.onCheckIsTextEditor();
    }

    public boolean canGoBack() {
        if (!C23590d.C23592b.f55854a) {
            return super.canGoBack();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "canGoBack");
        if (!(a instanceof AbstractC23587a)) {
            return super.canGoBack();
        }
        C23596c.f55856b.get().mo39028a();
        boolean f = ((AbstractC23587a) a).mo38988f();
        C23596c.f55856b.get().mo39029b();
        return f;
    }

    public boolean canGoForward() {
        if (!C23590d.C23592b.f55854a) {
            return super.canGoForward();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "canGoForward");
        if (!(a instanceof AbstractC23587a)) {
            return super.canGoForward();
        }
        C23596c.f55856b.get().mo39028a();
        boolean h = ((AbstractC23587a) a).mo38991h();
        C23596c.f55856b.get().mo39029b();
        return h;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public WebMessagePort[] createWebMessageChannel() {
        if (!C23590d.C23592b.f55854a) {
            return super.createWebMessageChannel();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "createWebMessageChannel");
        if (!(a instanceof AbstractC23587a)) {
            return super.createWebMessageChannel();
        }
        C23596c.f55856b.get().mo39028a();
        WebMessagePort[] p = ((AbstractC23587a) a).mo38999p();
        C23596c.f55856b.get().mo39029b();
        return p;
    }

    public void destroy() {
        if (!C23590d.C23592b.f55854a) {
            super.destroy();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "destroy");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38978c();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.destroy();
    }

    public SslCertificate getCertificate() {
        if (!C23590d.C23592b.f55854a) {
            return super.getCertificate();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getCertificate");
        if (!(a instanceof AbstractC23587a)) {
            return super.getCertificate();
        }
        C23596c.f55856b.get().mo39028a();
        SslCertificate b = ((AbstractC23587a) a).mo38967b();
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    public WebSettings getSettings() {
        if (!C23590d.C23592b.f55854a) {
            return super.getSettings();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getSettings");
        if (!(a instanceof AbstractC23587a)) {
            return super.getSettings();
        }
        C23596c.f55856b.get().mo39028a();
        WebSettings q = ((AbstractC23587a) a).mo39000q();
        C23596c.f55856b.get().mo39029b();
        return q;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public WebChromeClient getWebChromeClient() {
        if (!C23590d.C23592b.f55854a) {
            return super.getWebChromeClient();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getWebChromeClient");
        if (!(a instanceof AbstractC23587a)) {
            return super.getWebChromeClient();
        }
        C23596c.f55856b.get().mo39028a();
        WebChromeClient o = ((AbstractC23587a) a).mo38998o();
        C23596c.f55856b.get().mo39029b();
        return o;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public WebViewClient getWebViewClient() {
        if (!C23590d.C23592b.f55854a) {
            return super.getWebViewClient();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getWebViewClient");
        if (!(a instanceof AbstractC23587a)) {
            return super.getWebViewClient();
        }
        C23596c.f55856b.get().mo39028a();
        WebViewClient l = ((AbstractC23587a) a).mo38995l();
        C23596c.f55856b.get().mo39029b();
        return l;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public WebViewRenderProcess getWebViewRenderProcess() {
        if (!C23590d.C23592b.f55854a) {
            return super.getWebViewRenderProcess();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getWebViewRenderProcess");
        if (!(a instanceof AbstractC23587a)) {
            return super.getWebViewRenderProcess();
        }
        C23596c.f55856b.get().mo39028a();
        WebViewRenderProcess m = ((AbstractC23587a) a).mo38996m();
        C23596c.f55856b.get().mo39029b();
        return m;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        if (!C23590d.C23592b.f55854a) {
            return super.getWebViewRenderProcessClient();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getWebViewRenderProcessClient");
        if (!(a instanceof AbstractC23587a)) {
            return super.getWebViewRenderProcessClient();
        }
        C23596c.f55856b.get().mo39028a();
        WebViewRenderProcessClient n = ((AbstractC23587a) a).mo38997n();
        C23596c.f55856b.get().mo39029b();
        return n;
    }

    public void goBack() {
        if (!C23590d.C23592b.f55854a) {
            super.goBack();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "goBack");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38990g();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.goBack();
    }

    public void goForward() {
        if (!C23590d.C23592b.f55854a) {
            super.goForward();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "goForward");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38992i();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.goForward();
    }

    public void onAttachedToWindow() {
        if (!C23590d.C23592b.f55854a) {
            super.onAttachedToWindow();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onAttachedToWindow");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo39003t();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onAttachedToWindow();
    }

    public boolean onCheckIsTextEditor() {
        if (!C23590d.C23592b.f55854a) {
            return super.onCheckIsTextEditor();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onCheckIsTextEditor");
        if (!(a instanceof AbstractC23587a)) {
            return super.onCheckIsTextEditor();
        }
        C23596c.f55856b.get().mo39028a();
        boolean w = ((AbstractC23587a) a).mo39006w();
        C23596c.f55856b.get().mo39029b();
        return w;
    }

    public void onFinishTemporaryDetach() {
        if (!C23590d.C23592b.f55854a) {
            super.onFinishTemporaryDetach();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onFinishTemporaryDetach");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo39005v();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onFinishTemporaryDetach();
    }

    public void onPause() {
        if (!C23590d.C23592b.f55854a) {
            super.onPause();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onPause");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38993j();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (!C23590d.C23592b.f55854a) {
            super.onResume();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onResume");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38994k();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onResume();
    }

    public void onStartTemporaryDetach() {
        if (!C23590d.C23592b.f55854a) {
            super.onStartTemporaryDetach();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onStartTemporaryDetach");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo39004u();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onStartTemporaryDetach();
    }

    public void reload() {
        if (!C23590d.C23592b.f55854a) {
            super.reload();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "reload");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38986e();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.reload();
    }

    public void stopLoading() {
        if (!C23590d.C23592b.f55854a) {
            super.stopLoading();
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "stopLoading");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38984d();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.stopLoading();
    }

    public boolean zoomIn() {
        if (!C23590d.C23592b.f55854a) {
            return super.zoomIn();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "zoomIn");
        if (!(a instanceof AbstractC23587a)) {
            return super.zoomIn();
        }
        C23596c.f55856b.get().mo39028a();
        boolean r = ((AbstractC23587a) a).mo39001r();
        C23596c.f55856b.get().mo39029b();
        return r;
    }

    public boolean zoomOut() {
        if (!C23590d.C23592b.f55854a) {
            return super.zoomOut();
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "zoomOut");
        if (!(a instanceof AbstractC23587a)) {
            return super.zoomOut();
        }
        C23596c.f55856b.get().mo39028a();
        boolean s = ((AbstractC23587a) a).mo39002s();
        C23596c.f55856b.get().mo39029b();
        return s;
    }

    public C23586c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38792a(float f) {
        super.zoomBy(f);
    }

    /* renamed from: b */
    public final void mo38833b(int i) {
        super.goBackOrForward(i);
    }

    /* renamed from: c */
    public final void mo38843c(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: a */
    public final InputConnection mo38790a(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    /* renamed from: b */
    public final WebBackForwardList mo38832b(Bundle bundle) {
        return super.restoreState(bundle);
    }

    /* renamed from: d */
    public final void mo38850d(String str) {
        super.removeJavascriptInterface(str);
    }

    /* renamed from: e */
    public final boolean mo38858e(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public final boolean mo38861f(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final WebBackForwardList mo38791a(Bundle bundle) {
        return super.saveState(bundle);
    }

    /* renamed from: c */
    public final void mo38844c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public final boolean mo38851d(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    /* renamed from: c */
    public final void mo38845c(String str) {
        super.saveWebArchive(str);
    }

    /* renamed from: b */
    public final void mo38836b(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* renamed from: c */
    public final void mo38846c(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public boolean canGoBackOrForward(int i) {
        if (!C23590d.C23592b.f55854a) {
            return super.canGoBackOrForward(i);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "canGoBackOrForward");
        if (!(a instanceof AbstractC23587a)) {
            return super.canGoBackOrForward(i);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38957a(i);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!C23590d.C23592b.f55854a) {
            super.dispatchDraw(canvas);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "dispatchDraw");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38972b(canvas);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "dispatchKeyEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38963a(keyEvent);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "dispatchTouchEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean e = ((AbstractC23587a) a).mo38987e(motionEvent);
        C23596c.f55856b.get().mo39029b();
        return e;
    }

    public void documentHasImages(Message message) {
        if (!C23590d.C23592b.f55854a) {
            super.documentHasImages(message);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "documentHasImages");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38938a(message);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.documentHasImages(message);
    }

    public void draw(Canvas canvas) {
        if (!C23590d.C23592b.f55854a) {
            super.draw(canvas);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "draw");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38980c(canvas);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.draw(canvas);
    }

    public void goBackOrForward(int i) {
        if (!C23590d.C23592b.f55854a) {
            super.goBackOrForward(i);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "goBackOrForward");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38969b(i);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.goBackOrForward(i);
    }

    public void loadUrl(String str) {
        if (!C23590d.C23592b.f55854a) {
            m44441a((C23588a) this, str);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "loadUrl");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38788a(str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        m44441a((C23588a) this, str);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        if (!C23590d.C23592b.f55854a) {
            super.onConfigurationChanged(configuration);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onConfigurationChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38935a(configuration);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!C23590d.C23592b.f55854a) {
            return super.onCreateInputConnection(editorInfo);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onCreateInputConnection");
        if (!(a instanceof AbstractC23587a)) {
            return super.onCreateInputConnection(editorInfo);
        }
        C23596c.f55856b.get().mo39028a();
        InputConnection a2 = ((AbstractC23587a) a).mo38929a(editorInfo);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onDragEvent(dragEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onDragEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.onDragEvent(dragEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38962a(dragEvent);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!C23590d.C23592b.f55854a) {
            super.onDraw(canvas);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onDraw");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38936a(canvas);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onDraw(canvas);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onGenericMotionEvent(motionEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onGenericMotionEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.onGenericMotionEvent(motionEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean c = ((AbstractC23587a) a).mo38983c(motionEvent);
        C23596c.f55856b.get().mo39029b();
        return c;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onHoverEvent(motionEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onHoverEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.onHoverEvent(motionEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38964a(motionEvent);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onInterceptTouchEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean f = ((AbstractC23587a) a).mo38989f(motionEvent);
        C23596c.f55856b.get().mo39029b();
        return f;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        if (!C23590d.C23592b.f55854a) {
            super.onProvideVirtualStructure(viewStructure);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onProvideVirtualStructure");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38940a(viewStructure);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onProvideVirtualStructure(viewStructure);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onTouchEvent(motionEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onTouchEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.onTouchEvent(motionEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean b = ((AbstractC23587a) a).mo38976b(motionEvent);
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onTrackballEvent(motionEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onTrackballEvent");
        if (!(a instanceof AbstractC23587a)) {
            return super.onTrackballEvent(motionEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean d = ((AbstractC23587a) a).mo38985d(motionEvent);
        C23596c.f55856b.get().mo39029b();
        return d;
    }

    public void onWindowFocusChanged(boolean z) {
        if (!C23590d.C23592b.f55854a) {
            super.onWindowFocusChanged(z);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onWindowFocusChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38982c(z);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (!C23590d.C23592b.f55854a) {
            super.onWindowVisibilityChanged(i);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onWindowVisibilityChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38979c(i);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onWindowVisibilityChanged(i);
    }

    public boolean pageDown(boolean z) {
        if (!C23590d.C23592b.f55854a) {
            return super.pageDown(z);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "pageDown");
        if (!(a instanceof AbstractC23587a)) {
            return super.pageDown(z);
        }
        C23596c.f55856b.get().mo39028a();
        boolean b = ((AbstractC23587a) a).mo38977b(z);
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    public boolean pageUp(boolean z) {
        if (!C23590d.C23592b.f55854a) {
            return super.pageUp(z);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "pageUp");
        if (!(a instanceof AbstractC23587a)) {
            return super.pageUp(z);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38965a(z);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public void removeJavascriptInterface(String str) {
        if (!C23590d.C23592b.f55854a) {
            super.removeJavascriptInterface(str);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "removeJavascriptInterface");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38981c(str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.removeJavascriptInterface(str);
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        if (!C23590d.C23592b.f55854a) {
            return super.restoreState(bundle);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "restoreState");
        if (!(a instanceof AbstractC23587a)) {
            return super.restoreState(bundle);
        }
        C23596c.f55856b.get().mo39028a();
        WebBackForwardList b = ((AbstractC23587a) a).mo38968b(bundle);
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        if (!C23590d.C23592b.f55854a) {
            return super.saveState(bundle);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "saveState");
        if (!(a instanceof AbstractC23587a)) {
            return super.saveState(bundle);
        }
        C23596c.f55856b.get().mo39028a();
        WebBackForwardList a2 = ((AbstractC23587a) a).mo38930a(bundle);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public void saveWebArchive(String str) {
        if (!C23590d.C23592b.f55854a) {
            super.saveWebArchive(str);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "saveWebArchive");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38973b(str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.saveWebArchive(str);
    }

    public void setCertificate(SslCertificate sslCertificate) {
        if (!C23590d.C23592b.f55854a) {
            super.setCertificate(sslCertificate);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setCertificate");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38937a(sslCertificate);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setCertificate(sslCertificate);
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        if (!C23590d.C23592b.f55854a) {
            super.setDownloadListener(downloadListener);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setDownloadListener");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38942a(downloadListener);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setDownloadListener(downloadListener);
    }

    public void setFindListener(WebView.FindListener findListener) {
        if (!C23590d.C23592b.f55854a) {
            super.setFindListener(findListener);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setFindListener");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38945a(findListener);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setFindListener(findListener);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (!C23590d.C23592b.f55854a) {
            super.setWebChromeClient(webChromeClient);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setWebChromeClient");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38943a(webChromeClient);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setWebChromeClient(webChromeClient);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void setWebViewClient(WebViewClient webViewClient) {
        if (!C23590d.C23592b.f55854a) {
            m44440a((C23588a) this, webViewClient);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setWebViewClient");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38946a(C23833c.m45038a(webViewClient));
            C23596c.f55856b.get().mo39029b();
            return;
        }
        m44440a((C23588a) this, webViewClient);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        if (!C23590d.C23592b.f55854a) {
            super.setWebViewRenderProcessClient(webViewRenderProcessClient);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setWebViewRenderProcessClient");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38947a(webViewRenderProcessClient);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void zoomBy(float f) {
        if (!C23590d.C23592b.f55854a) {
            super.zoomBy(f);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "zoomBy");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38931a(f);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.zoomBy(f);
    }

    /* renamed from: b */
    public final void mo38837b(String str) {
        m44441a((C23588a) this, str);
    }

    /* renamed from: c */
    public final boolean mo38847c(MotionEvent motionEvent) {
        return super.onGenericMotionEvent(motionEvent);
    }

    /* renamed from: b */
    public final boolean mo38840b(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo38796a(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: b */
    public final boolean mo38841b(boolean z) {
        return super.pageDown(z);
    }

    /* renamed from: b */
    public final void mo38834b(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private static void m44441a(C23588a aVar, String str) {
        String a = C84357h.f188595a.mo129370a(aVar, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        super.loadUrl(str);
    }

    /* renamed from: a */
    private static void m44440a(C23588a aVar, WebViewClient webViewClient) {
        if (C84367b.m145126a() && webViewClient != null) {
            WebSettings settings = aVar.getSettings();
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
        super.setWebViewClient(webViewClient);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (!C23590d.C23592b.f55854a) {
            super.addJavascriptInterface(obj, str);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "addJavascriptInterface");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38948a(obj, str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.addJavascriptInterface(obj, str);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!C23590d.C23592b.f55854a) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "evaluateJavascript");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38949a(str, valueCallback);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    public void flingScroll(int i, int i2) {
        if (!C23590d.C23592b.f55854a) {
            super.flingScroll(i, i2);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "flingScroll");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38932a(i, i2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.flingScroll(i, i2);
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        if (!C23590d.C23592b.f55854a) {
            return super.getHttpAuthUsernamePassword(str, str2);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getHttpAuthUsernamePassword");
        if (!(a instanceof AbstractC23587a)) {
            return super.getHttpAuthUsernamePassword(str, str2);
        }
        C23596c.f55856b.get().mo39028a();
        String[] a2 = ((AbstractC23587a) a).mo38966a(str, str2);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onKeyDown(i, keyEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onKeyDown");
        if (!(a instanceof AbstractC23587a)) {
            return super.onKeyDown(i, keyEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38961a(i, keyEvent);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onKeyUp(i, keyEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onKeyUp");
        if (!(a instanceof AbstractC23587a)) {
            return super.onKeyUp(i, keyEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean b = ((AbstractC23587a) a).mo38975b(i, keyEvent);
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!C23590d.C23592b.f55854a) {
            super.onMeasure(i, i2);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onMeasure");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38970b(i, i2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!C23590d.C23592b.f55854a) {
            super.onProvideAutofillVirtualStructure(viewStructure, i);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onProvideAutofillVirtualStructure");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38941a(viewStructure, i);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (!C23590d.C23592b.f55854a) {
            super.onVisibilityChanged(view, i);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onVisibilityChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38939a(view, i);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onVisibilityChanged(view, i);
    }

    public void postUrl(String str, byte[] bArr) {
        if (!C23590d.C23592b.f55854a) {
            super.postUrl(str, bArr);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "postUrl");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38954a(str, bArr);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.postUrl(str, bArr);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void postWebMessage(WebMessage webMessage, Uri uri) {
        if (!C23590d.C23592b.f55854a) {
            super.postWebMessage(webMessage, uri);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "postWebMessage");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38944a(webMessage, uri);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.postWebMessage(webMessage, uri);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (!C23590d.C23592b.f55854a) {
            return super.requestFocus(i, rect);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "requestFocus");
        if (!(a instanceof AbstractC23587a)) {
            return super.requestFocus(i, rect);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38960a(i, rect);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!C23590d.C23592b.f55854a) {
            m44442a(this, str, map);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "loadUrl");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38789a(str, map);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        m44442a(this, str, map);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1761c.C23588a
    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        if (!C23590d.C23592b.f55854a) {
            super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setWebViewRenderProcessClient");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38955a(executor, webViewRenderProcessClient);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    /* renamed from: a */
    public final void mo38793a(int i, int i2) {
        super.flingScroll(i, i2);
    }

    /* renamed from: b */
    public final boolean mo38839b(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public C23586c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void loadData(String str, String str2, String str3) {
        if (!C23590d.C23592b.f55854a) {
            super.loadData(str, str2, str3);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "loadData");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38974b(str, str2, str3);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.loadData(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (!C23590d.C23592b.f55854a) {
            super.onFocusChanged(z, i, rect);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onFocusChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38956a(z, i, rect);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        if (!C23590d.C23592b.f55854a) {
            return super.onKeyMultiple(i, i2, keyEvent);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onKeyMultiple");
        if (!(a instanceof AbstractC23587a)) {
            return super.onKeyMultiple(i, i2, keyEvent);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38959a(i, i2, keyEvent);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    public void savePassword(String str, String str2, String str3) {
        if (!C23590d.C23592b.f55854a) {
            super.savePassword(str, str2, str3);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "savePassword");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38950a(str, str2, str3);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.savePassword(str, str2, str3);
    }

    /* renamed from: a */
    private static void m44442a(C23588a aVar, String str, Map map) {
        String a = C84357h.f188595a.mo129370a(aVar, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        if (!C23590d.C23592b.f55854a) {
            super.saveWebArchive(str, z, valueCallback);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "saveWebArchive");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38953a(str, z, valueCallback);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.saveWebArchive(str, z, valueCallback);
    }

    /* renamed from: b */
    public final void mo38838b(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    /* renamed from: b */
    public final void mo38835b(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (!C23590d.C23592b.f55854a) {
            super.onOverScrolled(i, i2, z, z2);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onOverScrolled");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38934a(i, i2, z, z2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!C23590d.C23592b.f55854a) {
            super.onScrollChanged(i, i2, i3, i4);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onScrollChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38971b(i, i2, i3, i4);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!C23590d.C23592b.f55854a) {
            super.onSizeChanged(i, i2, i3, i4);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onSizeChanged");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38933a(i, i2, i3, i4);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (!C23590d.C23592b.f55854a) {
            super.setHttpAuthUsernamePassword(str, str2, str3, str4);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "setHttpAuthUsernamePassword");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38951a(str, str2, str3, str4);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo38794a(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo38795a(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!C23590d.C23592b.f55854a) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "loadDataWithBaseURL");
        if (a instanceof AbstractC23587a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23587a) a).mo38952a(str, str2, str3, str4, str5);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (!C23590d.C23592b.f55854a) {
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "overScrollBy");
        if (!(a instanceof AbstractC23587a)) {
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23587a) a).mo38958a(i, i2, i3, i4, i5, i6, i7, i8, z);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }
}
