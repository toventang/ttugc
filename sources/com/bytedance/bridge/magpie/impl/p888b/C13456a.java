package com.bytedance.bridge.magpie.impl.p888b;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.bridge.magpie.p885d.AbstractC13447f;
import com.bytedance.bridge.magpie.p885d.AbstractC13448g;
import com.bytedance.bridge.magpie.p886e.C13449a;
import com.bytedance.bridge.magpie.p886e.C13452d;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.impl.b.a */
public final class C13456a implements AbstractC13447f {

    /* renamed from: a */
    private WebView f32783a;

    /* renamed from: b */
    private LynxView f32784b;

    /* renamed from: c */
    private String f32785c = "";

    /* renamed from: d */
    private final String f32786d = "WebViewImpl";

    /* renamed from: e */
    private final ArrayList<AbstractC13448g> f32787e = new ArrayList<>();

    static {
        Covode.recordClassIndex(15456);
    }

    /* renamed from: com.bytedance.bridge.magpie.impl.b.a$a */
    static final class RunnableC13457a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C13456a f32788a;

        /* renamed from: b */
        final /* synthetic */ String f32789b;

        /* renamed from: c */
        final /* synthetic */ ValueCallback f32790c;

        static {
            Covode.recordClassIndex(15457);
        }

        RunnableC13457a(C13456a aVar, String str, ValueCallback valueCallback) {
            this.f32788a = aVar;
            this.f32789b = str;
            this.f32790c = valueCallback;
        }

        public final void run() {
            this.f32788a.mo21684b(this.f32789b, this.f32790c);
        }
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13448g
    /* renamed from: b */
    public final void mo21677b() {
        Iterator<AbstractC13448g> it = this.f32787e.iterator();
        while (it.hasNext()) {
            it.next().mo21677b();
        }
        this.f32787e.clear();
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13447f
    /* renamed from: a */
    public final String mo21673a() {
        if (TextUtils.isEmpty(this.f32785c)) {
            C13453e.m24177a(this.f32786d, "can not get currentUrl,forget register IWebViewStatusListener?");
        }
        return this.f32785c;
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13448g
    /* renamed from: c */
    public final void mo21679c(String str) {
        C89219l.m154719c(str, "");
        Iterator<AbstractC13448g> it = this.f32787e.iterator();
        if (it.hasNext()) {
            it.next().mo21679c(str);
        }
    }

    public C13456a(View view) {
        C89219l.m154719c(view, "");
        if (view instanceof WebView) {
            this.f32783a = (WebView) view;
        } else if (view instanceof LynxView) {
            this.f32784b = (LynxView) view;
        }
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13448g
    /* renamed from: a */
    public final void mo21676a(String str) {
        C89219l.m154719c(str, "");
        Iterator<AbstractC13448g> it = this.f32787e.iterator();
        while (it.hasNext()) {
            it.next().mo21676a(str);
        }
        this.f32785c = str;
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13448g
    /* renamed from: b */
    public final boolean mo21678b(String str) {
        Iterator<AbstractC13448g> it = this.f32787e.iterator();
        while (it.hasNext()) {
            if (it.next().mo21678b(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13447f
    /* renamed from: a */
    public final void mo21674a(Object obj, String str) {
        C89219l.m154719c(obj, "");
        C89219l.m154719c(str, "");
        WebView webView = this.f32783a;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
    }

    /* renamed from: a */
    private static void m24182a(WebView webView, String str) {
        MethodCollector.m26663i(11588);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(11588);
    }

    /* renamed from: b */
    public final void mo21684b(String str, ValueCallback<String> valueCallback) {
        C89219l.m154719c(str, "");
        int i = Build.VERSION.SDK_INT;
        WebView webView = this.f32783a;
        if (webView != null) {
            webView.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13447f
    /* renamed from: a */
    public final void mo21675a(String str, ValueCallback<String> valueCallback) {
        C89219l.m154719c(str, "");
        if (C13449a.f32772a) {
            throw new C13452d("call evaluateJavaScript in wrong thread!!!");
        } else if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            mo21684b(str, null);
        } else {
            WebView webView = this.f32783a;
            if (webView != null) {
                webView.post(new RunnableC13457a(this, str, null));
            }
        }
    }
}
