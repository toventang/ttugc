package com.bytedance.webx.p1756e.p1757a.p1761c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewStructure;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1751b.p1752a.C23556a;
import com.bytedance.webx.p1755d.AbstractC23567c;
import com.bytedance.webx.p1755d.C23565a;
import com.bytedance.webx.p1756e.AbstractC23595b;
import com.bytedance.webx.p1756e.C23571a;
import com.bytedance.webx.p1756e.p1757a.AbstractC23572a;
import com.bytedance.webx.p1756e.p1757a.C23590d;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23573a;
import com.bytedance.webx.p1756e.p1757a.p1758a.C23577b;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.webx.e.a.c.a */
public class C23588a extends WebView implements AbstractC23567c, AbstractC23572a, AbstractC23595b {

    /* renamed from: a */
    private C23612h f55847a;

    /* renamed from: b */
    private C23571a f55848b = new C23571a();

    /* renamed from: c */
    private C23577b f55849c;

    /* renamed from: d */
    private C23573a f55850d;

    static {
        Covode.recordClassIndex(27686);
    }

    public C23573a getExtendableWebChromeClient() {
        return this.f55850d;
    }

    public C23577b getExtendableWebViewClient() {
        return this.f55849c;
    }

    public WebMessagePort[] createWebMessageChannel() {
        return super.createWebMessageChannel();
    }

    public WebChromeClient getWebChromeClientCompat() {
        return this.f55850d.f55828a;
    }

    public WebViewClient getWebViewClientCompat() {
        return this.f55849c.f55831a;
    }

    public WebViewRenderProcess getWebViewRenderProcess() {
        return super.getWebViewRenderProcess();
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return super.getWebViewRenderProcessClient();
    }

    @Override // com.bytedance.webx.p1756e.AbstractC23595b
    public C23565a getExtendableContext() {
        C23571a aVar = this.f55848b;
        if (aVar == null) {
            return null;
        }
        return aVar.f55827a;
    }

    public WebChromeClient getWebChromeClient() {
        if (!C23590d.C23592b.f55854a) {
            return super.getWebChromeClient();
        }
        if (this.f55847a == null) {
            return super.getWebChromeClient();
        }
        return this.f55850d;
    }

    public WebViewClient getWebViewClient() {
        if (!C23590d.C23592b.f55854a) {
            return super.getWebViewClient();
        }
        if (this.f55847a == null) {
            return super.getWebViewClient();
        }
        return this.f55849c;
    }

    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    public void zoomBy(float f) {
        super.zoomBy(f);
    }

    /* access modifiers changed from: protected */
    public void setExtendableWebViewClient(C23573a aVar) {
        this.f55850d = aVar;
        super.setWebChromeClient(aVar);
    }

    /* access modifiers changed from: protected */
    public void setExtendableWebViewClient(C23577b bVar) {
        this.f55849c = bVar;
        m44605a(this, bVar);
    }

    public C23588a(Context context) {
        super(context);
        MethodCollector.m26663i(9927);
        MethodCollector.m26664o(9927);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (!C23590d.C23592b.f55854a) {
            super.setWebChromeClient(webChromeClient);
        } else if (this.f55847a == null) {
            super.setWebChromeClient(webChromeClient);
        } else {
            this.f55850d.f55828a = webChromeClient;
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (!C23590d.C23592b.f55854a) {
            m44605a(this, webViewClient);
        } else if (this.f55847a == null) {
            m44605a(this, webViewClient);
        } else {
            this.f55849c.f55831a = webViewClient;
        }
    }

    @Override // com.bytedance.webx.p1756e.AbstractC23595b
    /* renamed from: a */
    public final void mo38728a(C23612h hVar) {
        if (C23612h.f55874a.f55890a) {
            hashCode();
            getClass().getCanonicalName();
            new Throwable();
            C23556a.m44304a("WebX");
        }
        if (C23590d.C23592b.f55854a) {
            this.f55847a = hVar;
            this.f55848b.f55827a = new C23565a(this.f55847a, this);
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    public void postWebMessage(WebMessage webMessage, Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    /* renamed from: a */
    private static void m44605a(WebView webView, WebViewClient webViewClient) {
        if (C84367b.m145126a() && webViewClient != null) {
            WebSettings settings = webView.getSettings();
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

    public C23588a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(10091);
        MethodCollector.m26664o(10091);
    }
}
