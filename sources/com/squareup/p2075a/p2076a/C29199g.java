package com.squareup.p2075a.p2076a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.a.a.g */
public final class C29199g<T> {

    /* renamed from: a */
    private final Class<?> f69155a;

    /* renamed from: b */
    private final String f69156b;

    /* renamed from: c */
    private final Class[] f69157c;

    static {
        Covode.recordClassIndex(35548);
    }

    /* renamed from: a */
    private static Object m58402a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_squareup_okhttp_internal_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    private Method m58403a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f69156b;
        if (str == null) {
            return null;
        }
        Method a = m58404a(cls, str, this.f69157c);
        if (a == null || (cls2 = this.f69155a) == null || cls2.isAssignableFrom(a.getReturnType())) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo50930a(T t) {
        if (m58403a(t.getClass()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private Object m58405c(T t, Object... objArr) {
        Method a = m58403a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return m58402a(a, t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Object mo50931b(T t, Object... objArr) {
        try {
            return m58406d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: d */
    private Object m58406d(T t, Object... objArr) {
        Method a = m58403a(t.getClass());
        if (a != null) {
            try {
                return m58402a(a, t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(a)));
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f69156b + " not supported for object " + ((Object) t));
        }
    }

    /* renamed from: a */
    public final Object mo50929a(T t, Object... objArr) {
        try {
            return m58405c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public C29199g(Class<?> cls, String str, Class... clsArr) {
        this.f69155a = cls;
        this.f69156b = str;
        this.f69157c = clsArr;
    }

    /* renamed from: a */
    private static Method m58404a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}
