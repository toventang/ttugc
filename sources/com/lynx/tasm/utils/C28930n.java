package com.lynx.tasm.utils;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.utils.n */
public class C28930n {
    static {
        Covode.recordClassIndex(35058);
    }

    /* renamed from: a */
    public static float m57952a(String str) {
        return m57958b(str, 0.0f);
    }

    /* renamed from: a */
    public static float m57953a(String str, float f) {
        return m57958b(str, f);
    }

    /* renamed from: b */
    public static float m57958b(String str, float f) {
        return m57955a(str, 0.0f, 0.0f, 0.0f, 0.0f, f, DisplayMetricsHolder.m57911a());
    }

    /* renamed from: a */
    public static float m57957a(String str, DisplayMetrics displayMetrics) {
        int length;
        if (TextUtils.isEmpty(str)) {
            length = 0;
        } else {
            length = str.length();
        }
        if (length > 1) {
            try {
                if (str.endsWith("%")) {
                    return (Float.parseFloat(str.substring(0, length - 1)) * 0.0f) / 100.0f;
                }
            } catch (Throwable unused) {
                LLog.m56861c("lynx", "Number parse error from value = " + str + " to px!");
                return 0.0f;
            }
        }
        return m57955a(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics);
    }

    /* renamed from: a */
    public static float m57954a(String str, float f, float f2) {
        return m57955a(str, f, f2, 0.0f, 0.0f, 0.0f, DisplayMetricsHolder.m57911a());
    }

    /* renamed from: a */
    public static float m57956a(String str, float f, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        return m57955a(str, f, f2, f3, f4, 0.0f, displayMetrics);
    }

    /* renamed from: a */
    public static float m57955a(String str, float f, float f2, float f3, float f4, float f5, DisplayMetrics displayMetrics) {
        if (TextUtils.isEmpty(str)) {
            return f5;
        }
        int length = str.length();
        if (length > 3) {
            try {
                if (str.endsWith("rpx")) {
                    return (((float) displayMetrics.widthPixels) * Float.parseFloat(str.substring(0, length - 3))) / 750.0f;
                }
            } catch (Throwable unused) {
                LLog.m56861c("lynx", "Number parse error from value = " + str + " to px!");
                return f5;
            }
        }
        if (length > 3 && str.endsWith("ppx")) {
            return Float.parseFloat(str.substring(0, length - 3));
        }
        if (length > 2 && str.endsWith("px")) {
            return C28926j.m57938a(Float.parseFloat(str.substring(0, length - 2)));
        }
        if (length > 1 && str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, length - 1)) / 100.0f;
        }
        if (length > 3 && str.endsWith("rem")) {
            return Float.parseFloat(str.substring(0, length - 3)) * f;
        }
        if (length > 2 && str.endsWith("em")) {
            return Float.parseFloat(str.substring(0, length - 2)) * f2;
        }
        if (length > 2 && str.endsWith("vw")) {
            return (f3 * Float.parseFloat(str.substring(0, length - 2))) / 100.0f;
        }
        if (length > 2 && str.endsWith("vh")) {
            return (f4 * Float.parseFloat(str.substring(0, length - 2))) / 100.0f;
        }
        if (length > 0) {
            return Float.parseFloat(str);
        }
        return f5;
    }
}
