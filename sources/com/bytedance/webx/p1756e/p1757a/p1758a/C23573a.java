package com.bytedance.webx.p1756e.p1757a.p1758a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.webx.p1756e.C23596c;
import com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a;
import com.bytedance.webx.p1762f.AbstractC23606a;
import com.bytedance.webx.p1762f.C23607b;

/* renamed from: com.bytedance.webx.e.a.a.a */
public class C23573a extends C23575a {
    static {
        Covode.recordClassIndex(27671);
    }

    /* renamed from: a */
    public final void mo38649a() {
        super.onHideCustomView();
    }

    /* renamed from: b */
    public final void mo38668b() {
        super.onGeolocationPermissionsHidePrompt();
    }

    /* renamed from: a */
    public final boolean mo38667a(WebView webView, boolean z, boolean z2, Message message) {
        return super.onCreateWindow(webView, z, z2, message);
    }

    /* renamed from: a */
    public final boolean mo38665a(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    /* renamed from: a */
    public final boolean mo38666a(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    /* renamed from: a */
    public final void mo38662a(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    /* renamed from: a */
    public final void mo38661a(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    /* renamed from: a */
    public final void mo38660a(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
    }

    /* renamed from: a */
    public final boolean mo38663a(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    /* renamed from: a */
    public final boolean mo38664a(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    /* renamed from: com.bytedance.webx.e.a.a.a$a */
    public static abstract class AbstractC23574a extends AbstractC23606a<C23573a> {
        static {
            Covode.recordClassIndex(27672);
        }

        /* renamed from: a */
        public void mo25379a(WebView webView, String str) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onReceivedTitle");
            if (a instanceof AbstractC23574a) {
                ((AbstractC23574a) a).mo25379a(webView, str);
            } else {
                ((C23573a) mo39033x()).mo38658a(webView, str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38710a(android.webkit.WebView r4, java.lang.String r5, boolean r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onReceivedTouchIconUrl"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38659a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38710a(android.webkit.WebView, java.lang.String, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38718a(android.webkit.WebView r4, boolean r5, boolean r6, android.os.Message r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onCreateWindow"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38667a(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38718a(android.webkit.WebView, boolean, boolean, android.os.Message):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38716a(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, android.webkit.JsResult r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onJsAlert"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38665a(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38716a(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38717a(android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.webkit.JsPromptResult r11) {
            /*
                r6 = this;
                r2 = r6
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onJsPrompt"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r4 = r10
                r5 = r11
                r1 = r7
                r2 = r8
                r3 = r9
                boolean r0 = r0.mo38666a(r1, r2, r3, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38717a(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38713a(java.lang.String r11, java.lang.String r12, long r13, long r15, long r17, android.webkit.WebStorage.QuotaUpdater r19) {
            /*
                r10 = this;
                r2 = r10
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onExceededDatabaseQuota"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r5 = r15
                r3 = r13
                r9 = r19
                r7 = r17
                r2 = r12
                r1 = r11
                r0.mo38662a(r1, r2, r3, r5, r7, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38713a(java.lang.String, java.lang.String, long, long, long, android.webkit.WebStorage$QuotaUpdater):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38712a(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onGeolocationPermissionsShowPrompt"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38661a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38712a(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38711a(java.lang.String r4, int r5, java.lang.String r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onConsoleMessage"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38660a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38711a(java.lang.String, int, java.lang.String):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38714a(android.webkit.ConsoleMessage r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onConsoleMessage"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38663a(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38714a(android.webkit.ConsoleMessage):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38715a(android.webkit.WebView r4, android.webkit.ValueCallback<android.net.Uri[]> r5, android.webkit.WebChromeClient.FileChooserParams r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onShowFileChooser"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38664a(r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38715a(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38719b() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onHideCustomView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38649a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38719b():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38723c() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onGeolocationPermissionsHidePrompt"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38668b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38723c():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38725d() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onJsTimeout"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38672c()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38725d():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap mo38726e() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getDefaultVideoPoster"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                android.graphics.Bitmap r0 = r0.mo38674d()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38726e():android.graphics.Bitmap");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View mo38727f() {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getVideoLoadingProgressView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                android.view.View r0 = r0.mo38675e()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38727f():android.view.View");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38720b(android.webkit.PermissionRequest r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onPermissionRequestCanceled"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38669b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38720b(android.webkit.PermissionRequest):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38721b(android.webkit.WebView r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onCloseWindow"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38670b(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38721b(android.webkit.WebView):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38706a(android.webkit.PermissionRequest r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onPermissionRequest"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38653a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38706a(android.webkit.PermissionRequest):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38707a(android.webkit.ValueCallback<java.lang.String[]> r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "getVisitedHistory"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38654a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38707a(android.webkit.ValueCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38708a(android.webkit.WebView r4) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onRequestFocus"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38655a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38708a(android.webkit.WebView):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38705a(android.view.View r4, android.webkit.WebChromeClient.CustomViewCallback r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onShowCustomView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38652a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38705a(android.view.View, android.webkit.WebChromeClient$CustomViewCallback):void");
        }

        /* renamed from: a */
        public void mo34967a(WebView webView, int i) {
            AbstractC23606a a = C23607b.m44641a(mo39034y(), this, "onProgressChanged");
            if (a instanceof AbstractC23574a) {
                ((AbstractC23574a) a).mo34967a(webView, i);
            } else {
                ((C23573a) mo39033x()).mo38656a(webView, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38709a(android.webkit.WebView r4, android.graphics.Bitmap r5) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onReceivedIcon"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38657a(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38709a(android.webkit.WebView, android.graphics.Bitmap):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38703a(long r7, long r9, android.webkit.WebStorage.QuotaUpdater r11) {
            /*
                r6 = this;
                r2 = r6
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onReachedMaxAppCacheSize"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r1 = r7
                r3 = r9
                r5 = r11
                r0.mo38650a(r1, r3, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38703a(long, long, android.webkit.WebStorage$QuotaUpdater):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo38704a(android.view.View r4, int r5, android.webkit.WebChromeClient.CustomViewCallback r6) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onShowCustomView"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                r0.mo38651a(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38704a(android.view.View, int, android.webkit.WebChromeClient$CustomViewCallback):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38724c(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, android.webkit.JsResult r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onJsBeforeUnload"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38673c(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38724c(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.webx.f.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo38722b(android.webkit.WebView r4, java.lang.String r5, java.lang.String r6, android.webkit.JsResult r7) {
            /*
                r3 = this;
                r2 = r3
            L_0x0001:
                com.bytedance.webx.d.b r1 = r2.mo39034y()
                java.lang.String r0 = "onJsConfirm"
                com.bytedance.webx.f.a r1 = com.bytedance.webx.p1762f.C23607b.m44641a(r1, r2, r0)
                boolean r0 = r1 instanceof com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a
                if (r0 == 0) goto L_0x0011
                r2 = r1
                goto L_0x0001
            L_0x0011:
                com.bytedance.webx.d.c r0 = r2.mo39033x()
                com.bytedance.webx.e.a.a.a r0 = (com.bytedance.webx.p1756e.p1757a.p1758a.C23573a) r0
                boolean r0 = r0.mo38671b(r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.p1756e.p1757a.p1758a.C23573a.AbstractC23574a.mo38722b(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }
    }

    /* renamed from: c */
    public final boolean mo38672c() {
        return super.onJsTimeout();
    }

    /* renamed from: d */
    public final Bitmap mo38674d() {
        return super.getDefaultVideoPoster();
    }

    /* renamed from: e */
    public final View mo38675e() {
        return super.getVideoLoadingProgressView();
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public Bitmap getDefaultVideoPoster() {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getDefaultVideoPoster");
        if (!(a instanceof AbstractC23574a)) {
            return super.getDefaultVideoPoster();
        }
        C23596c.f55856b.get().mo39028a();
        Bitmap e = ((AbstractC23574a) a).mo38726e();
        C23596c.f55856b.get().mo39029b();
        return e;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public View getVideoLoadingProgressView() {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getVideoLoadingProgressView");
        if (!(a instanceof AbstractC23574a)) {
            return super.getVideoLoadingProgressView();
        }
        C23596c.f55856b.get().mo39028a();
        View f = ((AbstractC23574a) a).mo38727f();
        C23596c.f55856b.get().mo39029b();
        return f;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onGeolocationPermissionsHidePrompt() {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onGeolocationPermissionsHidePrompt");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38723c();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onHideCustomView() {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onHideCustomView");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38719b();
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onHideCustomView();
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onJsTimeout() {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onJsTimeout");
        if (!(a instanceof AbstractC23574a)) {
            return super.onJsTimeout();
        }
        C23596c.f55856b.get().mo39028a();
        boolean d = ((AbstractC23574a) a).mo38725d();
        C23596c.f55856b.get().mo39029b();
        return d;
    }

    /* renamed from: b */
    public final void mo38669b(PermissionRequest permissionRequest) {
        super.onPermissionRequestCanceled(permissionRequest);
    }

    /* renamed from: b */
    public final void mo38670b(WebView webView) {
        super.onCloseWindow(webView);
    }

    /* renamed from: a */
    public final void mo38653a(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a, android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "getVisitedHistory");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38707a(valueCallback);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onCloseWindow(WebView webView) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onCloseWindow");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38721b(webView);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onCloseWindow(webView);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onPermissionRequest");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38706a(permissionRequest);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onPermissionRequest(permissionRequest);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onPermissionRequestCanceled");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38720b(permissionRequest);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onRequestFocus(WebView webView) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onRequestFocus");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38708a(webView);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onRequestFocus(webView);
    }

    /* renamed from: a */
    public final void mo38654a(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onConsoleMessage");
        if (!(a instanceof AbstractC23574a)) {
            return super.onConsoleMessage(consoleMessage);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23574a) a).mo38714a(consoleMessage);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    /* renamed from: a */
    public final void mo38655a(WebView webView) {
        super.onRequestFocus(webView);
    }

    /* renamed from: a */
    public final void mo38652a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onProgressChanged(WebView webView, int i) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onProgressChanged");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo34967a(webView, i);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onProgressChanged(webView, i);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedIcon");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38709a(webView, bitmap);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onReceivedTitle(WebView webView, String str) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedTitle");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo25379a(webView, str);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) C15346a.m28238a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            C15346a.m28243a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onGeolocationPermissionsShowPrompt");
            if (a instanceof AbstractC23574a) {
                C23596c.f55856b.get().mo39028a();
                ((AbstractC23574a) a).mo38712a(str, callback);
                C23596c.f55856b.get().mo39029b();
                return;
            }
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onShowCustomView");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38705a(view, customViewCallback);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onShowCustomView(view, customViewCallback);
    }

    /* renamed from: a */
    public final void mo38656a(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    /* renamed from: a */
    public final void mo38657a(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
    }

    /* renamed from: a */
    public final void mo38658a(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    /* renamed from: a */
    public final void mo38650a(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        super.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
    }

    /* renamed from: a */
    public final void mo38651a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onConsoleMessage(String str, int i, String str2) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onConsoleMessage");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38711a(str, i, str2);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReachedMaxAppCacheSize");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38703a(j, j2, quotaUpdater);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onReceivedTouchIconUrl");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38710a(webView, str, z);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onShowCustomView");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38704a(view, i, customViewCallback);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onShowCustomView(view, i, customViewCallback);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a, android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onShowFileChooser");
        if (!(a instanceof AbstractC23574a)) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23574a) a).mo38715a(webView, valueCallback, fileChooserParams);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    /* renamed from: a */
    public final void mo38659a(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    /* renamed from: c */
    public final boolean mo38673c(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    /* renamed from: b */
    public final boolean mo38671b(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onCreateWindow");
        if (!(a instanceof AbstractC23574a)) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23574a) a).mo38718a(webView, z, z2, message);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onJsAlert");
        if (!(a instanceof AbstractC23574a)) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23574a) a).mo38716a(webView, str, str2, jsResult);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onJsBeforeUnload");
        if (!(a instanceof AbstractC23574a)) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        C23596c.f55856b.get().mo39028a();
        boolean c = ((AbstractC23574a) a).mo38724c(webView, str, str2, jsResult);
        C23596c.f55856b.get().mo39029b();
        return c;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onJsConfirm");
        if (!(a instanceof AbstractC23574a)) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        C23596c.f55856b.get().mo39028a();
        boolean b = ((AbstractC23574a) a).mo38722b(webView, str, str2, jsResult);
        C23596c.f55856b.get().mo39029b();
        return b;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onJsPrompt");
        if (!(a instanceof AbstractC23574a)) {
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        C23596c.f55856b.get().mo39028a();
        boolean a2 = ((AbstractC23574a) a).mo38717a(webView, str, str2, str3, jsPromptResult);
        C23596c.f55856b.get().mo39029b();
        return a2;
    }

    @Override // com.bytedance.webx.p1756e.p1757a.p1758a.p1759a.C23575a
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC23606a a = C23607b.m44642a(getExtendableContext(), "onExceededDatabaseQuota");
        if (a instanceof AbstractC23574a) {
            C23596c.f55856b.get().mo39028a();
            ((AbstractC23574a) a).mo38713a(str, str2, j, j2, j3, quotaUpdater);
            C23596c.f55856b.get().mo39029b();
            return;
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }
}
