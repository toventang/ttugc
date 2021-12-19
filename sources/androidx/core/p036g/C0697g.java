package androidx.core.p036g;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: androidx.core.g.g */
public final class C0697g {
    static {
        Covode.recordClassIndex(776);
    }

    /* renamed from: a */
    public static <T> T m2452a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static int m2450a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static int m2451a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static <T> T m2453a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m2454a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m2455a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
