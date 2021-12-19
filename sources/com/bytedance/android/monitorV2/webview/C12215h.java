package com.bytedance.android.monitorV2.webview;

import android.util.Pair;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.webview.AbstractC12208d;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitorV2.webview.h */
public final class C12215h implements InvocationHandler {

    /* renamed from: a */
    Class<?> f29399a;

    /* renamed from: b */
    Object f29400b;

    static {
        Covode.recordClassIndex(13946);
    }

    /* renamed from: a */
    private static Object m21857a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitorV2_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC12208d.C12209a w;
        if (!((C12230n) C12230n.f29448a).mo19674c()) {
            return m21857a(method, this.f29400b, objArr);
        }
        if ("onPageStarted".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19675d((WebView) objArr[0], (String) objArr[1]);
            return m21857a(method, this.f29400b, objArr);
        } else if ("onPageFinished".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19676f((WebView) objArr[0], (String) objArr[1]);
            return m21857a(method, this.f29400b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 3) {
            ((C12230n) C12230n.f29448a).mo19671b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
            return m21857a(method, this.f29400b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 4) {
            ((C12230n) C12230n.f29448a).mo19670b((WebView) objArr[0], ((Integer) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
            return m21857a(method, this.f29400b, objArr);
        } else if ("onReceivedHttpError".equals(method.getName()) && objArr.length == 3) {
            ((C12230n) C12230n.f29448a).mo19672b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
            return m21857a(method, this.f29400b, objArr);
        } else if (!"onRenderProcessGone".equals(method.getName()) || objArr.length != 2) {
            return m21857a(method, this.f29400b, objArr);
        } else {
            C12230n nVar = (C12230n) C12230n.f29448a;
            WebView webView = (WebView) objArr[0];
            RenderProcessGoneDetail renderProcessGoneDetail = (RenderProcessGoneDetail) objArr[1];
            try {
                if (nVar.mo19673b()) {
                    if (webView != null) {
                        if (renderProcessGoneDetail != null) {
                            if (nVar.mo19635g(webView) && (w = nVar.mo19684w(webView)) != null) {
                                if (C12230n.m21945a(w.f29377j)) {
                                    if (nVar.mo19682s(webView) != null) {
                                        AbstractC12211e eVar = w.f29369b;
                                        if (eVar != null) {
                                            eVar.mo19605a(webView, renderProcessGoneDetail);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
            return m21857a(method, this.f29400b, objArr);
        }
    }
}
