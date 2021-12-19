package com.bytedance.android.monitor.webview;

import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitor.webview.j */
public final class C12049j implements InvocationHandler {

    /* renamed from: a */
    Class<?> f28888a;

    /* renamed from: b */
    Object f28889b;

    static {
        Covode.recordClassIndex(13777);
    }

    /* renamed from: a */
    private static Object m21446a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitor_webview_TTWebChromeClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitor_webview_TTWebChromeClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((C12044i) C12044i.f28862a).mo19323c()) {
            return m21446a(method, this.f28889b, objArr);
        }
        if ("onProgressChanged".equals(method.getName()) && objArr.length == 2) {
            ((C12044i) C12044i.f28862a).mo19318b((WebView) objArr[0], ((Integer) objArr[1]).intValue());
        }
        return m21446a(method, this.f28889b, objArr);
    }
}
