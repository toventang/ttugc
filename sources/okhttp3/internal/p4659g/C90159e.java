package okhttp3.internal.p4659g;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: okhttp3.internal.g.e */
public final class C90159e<T> {

    /* renamed from: a */
    private final Class<?> f204716a;

    /* renamed from: b */
    private final String f204717b;

    /* renamed from: c */
    private final Class[] f204718c;

    static {
        Covode.recordClassIndex(106331);
    }

    /* renamed from: a */
    private static Object m156667a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_OptionalMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    private Method m156668a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f204717b;
        if (str == null) {
            return null;
        }
        Method a = m156669a(cls, str, this.f204718c);
        if (a == null || (cls2 = this.f204716a) == null || cls2.isAssignableFrom(a.getReturnType())) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo144965a(T t) {
        if (m156668a(t.getClass()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private Object m156670c(T t, Object... objArr) {
        Method a = m156668a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return m156667a(a, t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Object mo144966b(T t, Object... objArr) {
        try {
            return m156671d(t, objArr);
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
    private Object m156671d(T t, Object... objArr) {
        Method a = m156668a(t.getClass());
        if (a != null) {
            try {
                return m156667a(a, t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(a)));
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f204717b + " not supported for object " + ((Object) t));
        }
    }

    /* renamed from: a */
    public final Object mo144964a(T t, Object... objArr) {
        try {
            return m156670c(t, objArr);
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

    C90159e(Class<?> cls, String str, Class... clsArr) {
        this.f204716a = cls;
        this.f204717b = str;
        this.f204718c = clsArr;
    }

    /* renamed from: a */
    private static Method m156669a(Class<?> cls, String str, Class[] clsArr) {
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
