package com.bytedance.p802b.p841k;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: com.bytedance.b.k.h */
public final class C13132h {

    /* renamed from: a */
    public static final CharSequence f31975a = "amigo";

    /* renamed from: b */
    public static final CharSequence f31976b = "funtouch";

    /* renamed from: c */
    public static boolean f31977c;

    /* renamed from: d */
    public static boolean f31978d;

    /* renamed from: e */
    public static String f31979e;

    /* renamed from: f */
    private static final CharSequence f31980f = "sony";

    /* renamed from: g */
    private static Method f31981g;

    /* renamed from: c */
    public static boolean m23617c() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f31977c = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f31977c;
    }

    static {
        Covode.recordClassIndex(14968);
    }

    /* renamed from: a */
    public static boolean m23614a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: b */
    public static String m23615b() {
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

    /* renamed from: a */
    public static String m23613a(String str) {
        String b = m23616b(str);
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
                C13122d.m23595a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C13122d.m23595a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C13122d.m23595a(bufferedReader);
            return str2;
        }
    }

    /* renamed from: b */
    private static String m23616b(String str) {
        try {
            if (f31981g == null) {
                f31981g = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            return (String) f31981g.invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
