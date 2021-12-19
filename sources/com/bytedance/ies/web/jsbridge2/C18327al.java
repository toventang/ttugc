package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.ies.web.jsbridge2.al */
public class C18327al extends AbstractC18329b {

    /* renamed from: b */
    static final /* synthetic */ boolean f43835b = true;

    /* renamed from: a */
    public WebView f43836a;

    /* renamed from: c */
    private String f43837c;

    /* renamed from: d */
    private boolean f43838d;

    /* renamed from: n */
    private boolean f43839n;

    C18327al() {
    }

    static {
        Covode.recordClassIndex(20999);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: c */
    public final void mo29330c() {
        super.mo29330c();
        this.f43836a.removeJavascriptInterface(this.f43837c);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final String mo16233a() {
        WebView webView = this.f43836a;
        if (webView instanceof AbstractC18359s) {
            String safeUrl = ((AbstractC18359s) webView).getSafeUrl();
            if (TextUtils.isEmpty(safeUrl)) {
                return this.f43836a.getUrl();
            }
            return safeUrl;
        }
        C18345k.m34126a(this.f43838d, this.f43839n, webView);
        return this.f43836a.getUrl();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: b */
    public final Context mo16239b(C18345k kVar) {
        if (kVar.f43890f != null) {
            return kVar.f43890f;
        }
        if (kVar.f43885a != null) {
            return kVar.f43885a.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    /* renamed from: b */
    private void m34073b(final String str) {
        if (!this.f43848j && !TextUtils.isEmpty(str)) {
            RunnableC183281 r2 = new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.C18327al.RunnableC183281 */

                static {
                    Covode.recordClassIndex(21000);
                }

                public final void run() {
                    MethodCollector.m26663i(8521);
                    if (C18327al.this.f43848j) {
                        MethodCollector.m26664o(8521);
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    C18327al.this.f43836a.evaluateJavascript(str, null);
                    MethodCollector.m26664o(8521);
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f43846h.post(r2);
            } else {
                r2.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16235a(C18345k kVar) {
        this.f43838d = kVar.f43891g;
        this.f43839n = kVar.f43904t;
        this.f43836a = kVar.f43885a;
        this.f43837c = kVar.f43888d;
        int i = Build.VERSION.SDK_INT;
        if (kVar.f43899o) {
            return;
        }
        if (f43835b || this.f43836a != null) {
            this.f43836a.addJavascriptInterface(this, this.f43837c);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16236a(String str) {
        m34073b("javascript:" + this.f43837c + "._handleMessageFromToutiao(" + str + ")");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18329b
    /* renamed from: a */
    public final void mo16237a(String str, C18362v vVar) {
        if (vVar == null || TextUtils.isEmpty(vVar.f43919h)) {
            super.mo16237a(str, vVar);
            return;
        }
        String str2 = vVar.f43919h;
        m34073b(C1764a.m5928a("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(C1764a.m5928a("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
    }
}
