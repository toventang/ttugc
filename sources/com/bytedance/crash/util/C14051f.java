package com.bytedance.crash.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.p932j.C13907f;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.util.f */
public final class C14051f {

    /* renamed from: a */
    private static boolean f34227a;

    /* renamed from: b */
    private static int f34228b = -1;

    /* renamed from: c */
    private static final Pattern f34229c = Pattern.compile("^0-([\\d]+)$");

    static {
        Covode.recordClassIndex(16118);
    }

    /* renamed from: b */
    public static boolean m25537b() {
        if (!f34227a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    C13907f.f33882a = true;
                    f34227a = true;
                    return C13907f.f33882a;
                }
            } catch (Exception unused) {
            }
            f34227a = true;
        }
        return C13907f.f33882a;
    }

    /* renamed from: c */
    public static boolean m25538c() {
        if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m25536a() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("hua"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
