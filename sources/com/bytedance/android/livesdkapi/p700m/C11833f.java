package com.bytedance.android.livesdkapi.p700m;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.android.livesdkapi.m.f */
public final class C11833f {
    static {
        Covode.recordClassIndex(13531);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdkapi.m.f$a */
    public static class C11834a<T> implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<T> f28191a;

        static {
            Covode.recordClassIndex(13532);
        }

        C11834a(T t) {
            this.f28191a = new WeakReference<>(t);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            T t = this.f28191a.get();
            if (t == null) {
                return null;
            }
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{t, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_livesdkapi_util_WeakReferenceWrapper$WeakInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(t, objArr);
            C15346a.m28242a(invoke, method, new Object[]{t, objArr}, "com_bytedance_android_livesdkapi_util_WeakReferenceWrapper$WeakInvocationHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }
    }

    /* renamed from: a */
    public static <T> T m20836a(T t) {
        try {
            Class<?> cls = t.getClass();
            Class<?>[] interfaces = cls.getInterfaces();
            return (interfaces == null || interfaces.length <= 0) ? t : (T) Proxy.newProxyInstance(cls.getClassLoader(), interfaces, new C11834a(t));
        } catch (Throwable unused) {
            return t;
        }
    }
}
