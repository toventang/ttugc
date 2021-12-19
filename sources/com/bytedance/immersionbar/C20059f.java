package com.bytedance.immersionbar;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.immersionbar.f */
public final class C20059f {

    /* renamed from: a */
    public static int f47697a = Build.VERSION.SDK_INT;

    static {
        Covode.recordClassIndex(23564);
    }

    /* renamed from: b */
    public static boolean m37990b() {
        if (m37994f() || m37993e()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m37994f() {
        if (m37992d().contains("EmotionUI_3.0")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m37992d() {
        if (!TextUtils.isEmpty(m37988a("ro.build.version.emui", ""))) {
            return m37988a("ro.build.version.emui", "");
        }
        return "";
    }

    /* renamed from: e */
    private static boolean m37993e() {
        String d = m37992d();
        if ("EmotionUI 3".equals(d) || d.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m37989a() {
        String str = "";
        if (!TextUtils.isEmpty(m37988a("ro.miui.ui.version.name", str))) {
            str = m37988a("ro.miui.ui.version.name", str);
        }
        if (!str.isEmpty()) {
            try {
                if (Integer.valueOf(str.substring(1)).intValue() >= 6) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m37991c() {
        int i;
        String str = "";
        if (m37988a("ro.build.display.id", str).toLowerCase().contains("flyme")) {
            str = m37988a("ro.build.display.id", str);
        }
        if (!str.isEmpty()) {
            try {
                if (str.toLowerCase().contains("os")) {
                    i = Integer.valueOf(str.substring(9, 10)).intValue();
                } else {
                    i = Integer.valueOf(str.substring(6, 7)).intValue();
                }
                if (i >= 4) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static String m37988a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }
}
