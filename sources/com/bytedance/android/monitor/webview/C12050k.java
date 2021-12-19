package com.bytedance.android.monitor.webview;

import android.util.Pair;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitor.webview.k */
public final class C12050k implements InvocationHandler {

    /* renamed from: a */
    Class<?> f28890a;

    /* renamed from: b */
    Object f28891b;

    static {
        Covode.recordClassIndex(13778);
    }

    /* renamed from: a */
    private static Object m21447a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitor_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitor_webview_TTWebViewClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((C12044i) C12044i.f28862a).mo19323c()) {
            return m21447a(method, this.f28891b, objArr);
        }
        if ("onPageStarted".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19324d((WebView) objArr[0], (String) objArr[1]);
            return m21447a(method, this.f28891b, objArr);
        } else if ("onPageFinished".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19325f((WebView) objArr[0], (String) objArr[1]);
            return m21447a(method, this.f28891b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 3) {
            ((C12044i) C12044i.f28862a).mo19320b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceError) objArr[2]);
            return m21447a(method, this.f28891b, objArr);
        } else if ("onReceivedError".equals(method.getName()) && objArr.length == 4) {
            ((C12044i) C12044i.f28862a).mo19319b((WebView) objArr[0], ((Integer) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
            return m21447a(method, this.f28891b, objArr);
        } else if (!"onReceivedHttpError".equals(method.getName()) || objArr.length != 3) {
            return m21447a(method, this.f28891b, objArr);
        } else {
            ((C12044i) C12044i.f28862a).mo19321b((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
            return m21447a(method, this.f28891b, objArr);
        }
    }
}
