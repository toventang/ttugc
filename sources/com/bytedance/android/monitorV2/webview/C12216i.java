package com.bytedance.android.monitorV2.webview;

import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.monitorV2.webview.i */
public final class C12216i implements InvocationHandler {

    /* renamed from: a */
    Class<?> f29401a;

    /* renamed from: b */
    Object f29402b;

    static {
        Covode.recordClassIndex(13947);
    }

    /* renamed from: a */
    private static Object m21858a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_monitorV2_webview_TTWebViewDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_monitorV2_webview_TTWebViewDelegateHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((C12230n) C12230n.f29448a).mo19674c()) {
            return m21858a(method, this.f29402b, objArr);
        }
        if ("init".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19678k((WebView) objArr[0]);
            return m21858a(method, this.f29402b, objArr);
        } else if ("loadUrl".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19677h((WebView) objArr[0], (String) objArr[1]);
            return m21858a(method, this.f29402b, objArr);
        } else if ("goBack".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19681q((WebView) objArr[0]);
            return m21858a(method, this.f29402b, objArr);
        } else if ("reload".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19680o((WebView) objArr[0]);
            return m21858a(method, this.f29402b, objArr);
        } else if ("destroy".equals(method.getName())) {
            ((C12230n) C12230n.f29448a).mo19679m((WebView) objArr[0]);
            return m21858a(method, this.f29402b, objArr);
        } else if (!"onAttachedToWindow".equals(method.getName())) {
            return m21858a(method, this.f29402b, objArr);
        } else {
            ((C12230n) C12230n.f29448a).mo19683u((WebView) objArr[0]);
            return m21858a(method, this.f29402b, objArr);
        }
    }
}
