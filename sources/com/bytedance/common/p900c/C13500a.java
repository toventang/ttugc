package com.bytedance.common.p900c;

import android.os.Build;
import android.util.Pair;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.common.c.a */
public final class C13500a {

    /* renamed from: a */
    public static Method f32884a;

    /* renamed from: b */
    public static Method f32885b;

    /* renamed from: c */
    static boolean f32886c;

    static {
        Covode.recordClassIndex(15508);
    }

    /* renamed from: a */
    public static Object m24280a(Method method, Object obj) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, null}, 110000, "java.lang.Object", true, "com_bytedance_common_util_HoneyCombV11Compat_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, null);
        C15346a.m28242a(invoke, method, new Object[]{obj, null}, "com_bytedance_common_util_HoneyCombV11Compat_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static void m24281a() {
        if (!f32886c) {
            f32886c = true;
            try {
                f32884a = WebView.class.getMethod("onPause", null);
                f32885b = WebView.class.getMethod("onResume", null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m24282a(WebSettings webSettings) {
        int i = Build.VERSION.SDK_INT;
        webSettings.setDisplayZoomControls(false);
    }
}
