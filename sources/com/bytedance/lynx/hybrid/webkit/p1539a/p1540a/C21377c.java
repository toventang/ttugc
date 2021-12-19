package com.bytedance.lynx.hybrid.webkit.p1539a.p1540a;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.AbstractC23568e;
import com.bytedance.webx.p1756e.p1757a.C23586c;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23573a;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23577b;
import com.bytedance.webx.p1756e.p1757a.p1761c.C23588a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c */
public final class C21377c extends AbstractC23547a<C23586c> implements AbstractC23568e.AbstractC23569a {

    /* renamed from: b */
    public static final C21378a f50730b = new C21378a((byte) 0);

    /* renamed from: a */
    public AbstractC21379b f50731a = new C21382e();

    /* renamed from: j */
    private final C21381d f50732j = new C21381d();

    /* renamed from: k */
    private final C21380c f50733k = new C21380c();

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c$b */
    public interface AbstractC21379b {
        static {
            Covode.recordClassIndex(24999);
        }

        /* renamed from: a */
        C21384e mo34739a();

        /* renamed from: b */
        C21383d mo34740b();
    }

    static {
        Covode.recordClassIndex(24997);
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c$a */
    public static final class C21378a {
        static {
            Covode.recordClassIndex(24998);
        }

        private C21378a() {
        }

        public /* synthetic */ C21378a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c$e */
    public static final class C21382e implements AbstractC21379b {

        /* renamed from: a */
        private final C21384e f50736a = new C21384e();

        /* renamed from: b */
        private final C21383d f50737b = new C21383d();

        static {
            Covode.recordClassIndex(25002);
        }

        @Override // com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21377c.AbstractC21379b
        /* renamed from: a */
        public final C21384e mo34739a() {
            return this.f50736a;
        }

        @Override // com.bytedance.lynx.hybrid.webkit.p1539a.p1540a.C21377c.AbstractC21379b
        /* renamed from: b */
        public final C21383d mo34740b() {
            return this.f50737b;
        }

        C21382e() {
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c$c */
    public final class C21380c extends AbstractC23547a<C23573a> {
        static {
            Covode.recordClassIndex(25000);
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final boolean mo34965a() {
            return C21377c.this.mo34965a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C21380c() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            for (String str : C89070n.m154522b("onProgressChanged", "onReceivedTitle", "onReceivedIcon", "onReceivedTouchIconUrl", "onShowCustomView", "onHideCustomView", "onCreateWindow", "onRequestFocus", "onCloseWindow", "onJsAlert", "onJsConfirm", "onJsPrompt", "onJsBeforeUnload", "onExceededDatabaseQuota", "onReachedMaxAppCacheSize", "onGeolocationPermissionsShowPrompt", "onGeolocationPermissionsHidePrompt", "onPermissionRequest", "onPermissionRequestCanceled", "onJsTimeout", "onConsoleMessage", "getDefaultVideoPoster", "getVideoLoadingProgressView", "getVisitedHistory", "onShowFileChooser")) {
                C21383d b = C21377c.this.f50731a.mo34740b();
                C89219l.m154719c(this, "");
                b.f50738d = this;
                mo38630a(str, b, 9000);
            }
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a.a.c$d */
    public final class C21381d extends AbstractC23547a<C23577b> {
        static {
            Covode.recordClassIndex(25001);
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final boolean mo34965a() {
            return C21377c.this.mo34965a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C21381d() {
        }

        @Override // com.bytedance.webx.AbstractC23547a
        /* renamed from: a */
        public final void mo34964a(AbstractC23547a.C23548a aVar) {
            for (String str : C89070n.m154522b("shouldOverrideUrlLoading", "onPageStarted", "onPageFinished", "onLoadResource", "onPageCommitVisible", "shouldInterceptRequest", "onTooManyRedirects", "onReceivedError", "onReceivedHttpError", "onFormResubmission", "doUpdateVisitedHistory", "onReceivedSslError", "onReceivedClientCertRequest", "onReceivedHttpAuthRequest", "shouldOverrideKeyEvent", "onUnhandledKeyEvent", "onScaleChanged", "onReceivedLoginRequest", "onRenderProcessGone", "onSafeBrowsingHit")) {
                C21384e a = C21377c.this.f50731a.mo34739a();
                C89219l.m154719c(this, "");
                a.f50739a = this;
                mo38630a(str, a, 9000);
            }
        }
    }

    @Override // com.bytedance.webx.AbstractC23547a
    /* renamed from: a */
    public final void mo34964a(AbstractC23547a.C23548a aVar) {
        this.f55780g = "CustomClientExtension";
        if (aVar == null) {
            C89219l.m154707a();
        }
        C23588a aVar2 = (C23588a) mo38631b();
        C89219l.m154709a((Object) aVar2, "");
        AbstractC23547a.C23548a.m44294a(aVar2.getExtendableWebViewClient(), this.f50732j);
        C23588a aVar3 = (C23588a) mo38631b();
        C89219l.m154709a((Object) aVar3, "");
        AbstractC23547a.C23548a.m44294a(aVar3.getExtendableWebChromeClient(), this.f50733k);
    }
}
