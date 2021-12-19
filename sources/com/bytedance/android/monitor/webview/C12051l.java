package com.bytedance.android.monitor.webview;

import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitor.webview.l */
public final class C12051l implements InvocationHandler {

    /* renamed from: a */
    Class<?> f28892a;

    /* renamed from: b */
    Object f28893b;

    static {
        Covode.recordClassIndex(13779);
    }

    /* renamed from: a */
    private static Object m21448a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitor_webview_TTWebViewDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitor_webview_TTWebViewDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((C12044i) C12044i.f28862a).mo19323c()) {
            return m21448a(method, this.f28893b, objArr);
        }
        if ("init".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19327k((WebView) objArr[0]);
            return m21448a(method, this.f28893b, objArr);
        } else if ("loadUrl".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19326h((WebView) objArr[0], (String) objArr[1]);
            return m21448a(method, this.f28893b, objArr);
        } else if ("goBack".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19330q((WebView) objArr[0]);
            return m21448a(method, this.f28893b, objArr);
        } else if ("reload".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19329o((WebView) objArr[0]);
            return m21448a(method, this.f28893b, objArr);
        } else if ("destroy".equals(method.getName())) {
            ((C12044i) C12044i.f28862a).mo19328m((WebView) objArr[0]);
            return m21448a(method, this.f28893b, objArr);
        } else if (!"onAttachedToWindow".equals(method.getName())) {
            return m21448a(method, this.f28893b, objArr);
        } else {
            ((C12044i) C12044i.f28862a).mo19331s((WebView) objArr[0]);
            return m21448a(method, this.f28893b, objArr);
        }
    }
}
