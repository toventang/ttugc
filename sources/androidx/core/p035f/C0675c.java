package androidx.core.p035f;

import android.icu.util.ULocale;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.f.c */
public final class C0675c {

    /* renamed from: a */
    private static Method f2719a;

    /* renamed from: b */
    private static Method f2720b;

    static {
        Covode.recordClassIndex(754);
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2719a = cls.getMethod("getScript", String.class);
                    f2720b = cls.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception unused) {
                f2719a = null;
                f2720b = null;
            }
        } else if (Build.VERSION.SDK_INT < 24) {
            try {
                f2720b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    private static String m2428a(String str) {
        try {
            Method method = f2719a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static String m2430b(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f2720b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    /* renamed from: a */
    public static String m2429a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f2720b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String b = m2430b(locale);
            if (b != null) {
                return m2428a(b);
            }
            return null;
        }
    }
}
