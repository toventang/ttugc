package com.bytedance.apm.p789q;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.C21454c;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.apm.q.p */
public final class C12596p {

    /* renamed from: a */
    public static final CharSequence f30646a = "amigo";

    /* renamed from: b */
    public static final CharSequence f30647b = "funtouch";

    /* renamed from: c */
    public static boolean f30648c;

    /* renamed from: d */
    public static boolean f30649d;

    /* renamed from: e */
    public static String f30650e;

    /* renamed from: f */
    private static final CharSequence f30651f = "sony";

    /* renamed from: g */
    private static Method f30652g;

    /* renamed from: d */
    public static boolean m22717d() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f30648c = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f30648c;
    }

    static {
        Covode.recordClassIndex(14413);
    }

    /* renamed from: a */
    public static boolean m22713a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: c */
    public static String m22716c() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m22715b() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("hua"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m22712a(String str) {
        String b = m22714b(str);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                C21454c.m40295a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C21454c.m40295a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C21454c.m40295a(bufferedReader);
            return str2;
        }
    }

    /* renamed from: b */
    private static String m22714b(String str) {
        try {
            if (f30652g == null) {
                f30652g = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            return (String) f30652g.invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
