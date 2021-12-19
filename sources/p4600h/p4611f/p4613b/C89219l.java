package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.C89169f;
import p4600h.C89390y;

/* renamed from: h.f.b.l */
public class C89219l {
    static {
        Covode.recordClassIndex(105303);
    }

    /* renamed from: a */
    public static int m154703a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private C89219l() {
    }

    /* renamed from: a */
    public static boolean m154714a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static boolean m154713a(Float f, Float f2) {
        return f == null ? f2 == null : f2 != null && f.floatValue() == f2.floatValue();
    }

    /* renamed from: a */
    public static boolean m154712a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* renamed from: c */
    public static void m154718c() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: b */
    public static void m154715b() {
        throw m154705a((Throwable) new NullPointerException());
    }

    /* renamed from: a */
    public static void m154707a() {
        throw m154705a((Throwable) new C89169f());
    }

    /* renamed from: a */
    public static void m154708a(Object obj) {
        if (obj == null) {
            m154715b();
        }
    }

    /* renamed from: d */
    private static void m154722d(String str) {
        throw m154705a((Throwable) new NullPointerException(m154723e(str)));
    }

    /* renamed from: c */
    private static void m154720c(String str) {
        throw m154705a((Throwable) new IllegalArgumentException(m154723e(str)));
    }

    /* renamed from: a */
    private static <T extends Throwable> T m154705a(T t) {
        return (T) m154706a((Throwable) t, C89219l.class.getName());
    }

    /* renamed from: b */
    private static void m154717b(String str) {
        throw m154705a((Throwable) new C89390y(str));
    }

    /* renamed from: e */
    private static String m154723e(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        return "Parameter specified as non-null is null: method " + className + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: a */
    public static void m154710a(String str) {
        m154717b("lateinit property " + str + " has not been initialized");
    }

    /* renamed from: d */
    public static void m154721d(Object obj, String str) {
        if (obj == null) {
            m154722d(str);
        }
    }

    /* renamed from: c */
    public static void m154719c(Object obj, String str) {
        if (obj == null) {
            m154720c(str);
        }
    }

    /* renamed from: a */
    public static String m154704a(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: b */
    public static void m154716b(Object obj, String str) {
        if (obj == null) {
            throw m154705a((Throwable) new NullPointerException(str + " must not be null"));
        }
    }

    /* renamed from: a */
    static <T extends Throwable> T m154706a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: a */
    public static void m154709a(Object obj, String str) {
        if (obj == null) {
            throw m154705a((Throwable) new IllegalStateException(str + " must not be null"));
        }
    }

    /* renamed from: a */
    public static boolean m154711a(float f, Float f2) {
        if (f2 == null || f != f2.floatValue()) {
            return false;
        }
        return true;
    }
}
