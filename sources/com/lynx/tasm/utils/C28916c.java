package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.utils.c */
public class C28916c {
    static {
        Covode.recordClassIndex(35044);
    }

    /* renamed from: a */
    public static float m57918a(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        LLog.m56856a(5, "lynx", "Invalid float property value: ".concat(String.valueOf(f)));
        return 0.0f;
    }

    /* renamed from: a */
    public static float m57919a(String str) {
        if (str == null) {
            return Float.NaN;
        }
        String trim = str.trim();
        if (!trim.endsWith("%")) {
            try {
                return Float.parseFloat(trim);
            } catch (Exception unused) {
                return Float.NaN;
            }
        } else if (trim.length() < 2) {
            return Float.NaN;
        } else {
            try {
                return Float.parseFloat(trim.substring(0, trim.length() - 1)) / 100.0f;
            } catch (Exception unused2) {
                return Float.NaN;
            }
        }
    }

    /* renamed from: a */
    public static boolean m57920a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
            return true;
        } else if (Math.abs(f2 - f) < 1.0E-5f) {
            return true;
        } else {
            return false;
        }
    }
}
