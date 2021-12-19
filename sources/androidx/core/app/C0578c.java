package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.c */
public final class C0578c {
    static {
        Covode.recordClassIndex(656);
    }

    /* renamed from: a */
    public static IBinder m2196a(Bundle bundle, String str) {
        int i = Build.VERSION.SDK_INT;
        return bundle.getBinder(str);
    }

    /* renamed from: androidx.core.app.c$a */
    static class C0579a {

        /* renamed from: a */
        private static Method f2455a;

        /* renamed from: b */
        private static boolean f2456b;

        /* renamed from: c */
        private static Method f2457c;

        /* renamed from: d */
        private static boolean f2458d;

        static {
            Covode.recordClassIndex(657);
        }

        /* renamed from: a */
        public static IBinder m2198a(Bundle bundle, String str) {
            if (!f2456b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f2455a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2456b = true;
            }
            Method method2 = f2455a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2455a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m2199a(Bundle bundle, String str, IBinder iBinder) {
            if (!f2458d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f2457c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2458d = true;
            }
            Method method2 = f2457c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2457c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2197a(Bundle bundle, String str, IBinder iBinder) {
        int i = Build.VERSION.SDK_INT;
        bundle.putBinder(str, iBinder);
    }
}
