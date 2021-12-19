package com.bytedance.android.monitorV2.webview;

import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitorV2.webview.g */
public final class C12214g implements InvocationHandler {

    /* renamed from: a */
    Class<?> f29397a;

    /* renamed from: b */
    Object f29398b;

    static {
        Covode.recordClassIndex(13945);
    }

    /* renamed from: a */
    private static Object m21856a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_webview_TTWebChromeClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitorV2_webview_TTWebChromeClientDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((C12230n) C12230n.f29448a).mo19674c()) {
            return m21856a(method, this.f29398b, objArr);
        }
        if ("onProgressChanged".equals(method.getName()) && objArr.length == 2) {
            ((C12230n) C12230n.f29448a).mo19669b((WebView) objArr[0], ((Integer) objArr[1]).intValue());
        }
        return m21856a(method, this.f29398b, objArr);
    }
}
