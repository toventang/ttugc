package com.bytedance.ugc.glue;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public class UGCTools {
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());

    public static float getPxFByDp(float f) {
        return f * 2.0f;
    }

    public static float getPxFBySp(float f) {
        return f * 2.0f;
    }

    public static boolean isTest() {
        return false;
    }

    public static int round(double d) {
        return (int) (d + 0.5d);
    }

    static {
        Covode.recordClassIndex(27514);
    }

    /* renamed from: com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m44217x2199b409(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getColor(int i) {
        return getColor(null, i);
    }

    public static Drawable getDrawable(int i) {
        return getDrawable(null, i);
    }

    public static float getPixelByDp(float f) {
        return getPxFByDp(f);
    }

    public static float getPixelBySp(float f) {
        return getPxFBySp(f);
    }

    public static double parseDouble(String str) {
        return parseDouble(str, 0.0d);
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str) {
        return parseLong(str, 0);
    }

    public static byte[] getBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getPixelByDp(int i) {
        return (int) (getPixelByDp((float) i) + 0.5f);
    }

    public static int getPixelBySp(int i) {
        return (int) (getPixelBySp((float) i) + 0.5f);
    }

    public static int getPxByDp(float f) {
        return round((double) getPxFByDp(f));
    }

    public static int getPxBySp(float f) {
        return round((double) getPxFBySp(f));
    }

    public static boolean isEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static int mergeFlag(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return i;
    }

    public static boolean notEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return false;
        }
        return true;
    }

    public static String firstNotEmptyString(String... strArr) {
        for (String str : strArr) {
            if (notEmpty(str)) {
                return str;
            }
        }
        return null;
    }

    public static boolean parseBoolean(String str) {
        if ("1".equals(str) || "true".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static <T> T getDefaultValue(Class<T> cls) {
        if (cls == null || cls.isAssignableFrom(String.class)) {
            return "";
        }
        return (cls.isAssignableFrom(Integer.class) || cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Short.class) || cls.isAssignableFrom(Short.TYPE)) ? (T) 0 : (cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Long.TYPE)) ? (T) 0L : (cls.isAssignableFrom(Float.class) || cls.isAssignableFrom(Float.TYPE)) ? (T) Float.valueOf(0.0f) : (cls.isAssignableFrom(Double.class) || cls.isAssignableFrom(Double.TYPE)) ? (T) Double.valueOf(0.0d) : cls.isAssignableFrom(Boolean.class) ? (T) false : "";
    }

    /* renamed from: com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m44216x41b4f606(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static String getString(int i, Object... objArr) {
        return getString(null, i, objArr);
    }

    public static int getColor(Context context, int i) {
        if (context != null) {
            return context.getResources().getColor(i);
        }
        return 0;
    }

    public static Drawable getDrawable(Context context, int i) {
        if (context != null) {
            return context.getResources().getDrawable(i);
        }
        return null;
    }

    public static double parseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d;
        }
    }

    public static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return round(parseDouble(str, (double) i));
        }
    }

    public static long parseLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return (long) round(parseDouble(str, (double) j));
        }
    }

    public static boolean equal(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) && isEmpty(charSequence2)) {
            return true;
        }
        if (charSequence == null || !charSequence.equals(charSequence2)) {
            return false;
        }
        return true;
    }

    public static <T> T get(Activity activity, String str, Class<T> cls) {
        return (T) get(activity, str, getDefaultValue(cls));
    }

    public static String getString(Context context, int i, Object... objArr) {
        if (context != null) {
            return context.getString(i, objArr);
        }
        return "";
    }

    public static <T> T get(Activity activity, String str, T t) {
        return activity == null ? t : (T) get(activity.getIntent(), str, (Object) t);
    }

    public static <T> T get(Intent intent, String str, Class<T> cls) {
        return (T) get(intent, str, getDefaultValue(cls));
    }

    public static <T> T get(Intent intent, String str, T t) {
        return intent == null ? t : (T) get(m44217x2199b409(intent), str, (Object) t);
    }

    public static <T> T get(Bundle bundle, String str, Class<T> cls) {
        return (T) get(bundle, str, getDefaultValue(cls));
    }

    public static <T> T get(Bundle bundle, String str, T t) {
        Object com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        if (bundle == null || (com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m44216x41b4f606(bundle, str)) == null) {
            return t;
        }
        T t2 = (T) String.valueOf(com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
        if (!(t instanceof String)) {
            return t instanceof Integer ? (T) Integer.valueOf(parseInt(t2, t.intValue())) : t instanceof Short ? (T) Integer.valueOf(parseInt(t2, t.shortValue())) : t instanceof Long ? (T) Long.valueOf(parseLong(t2, t.longValue())) : t instanceof Double ? (T) Double.valueOf(parseDouble(t2, t.doubleValue())) : t instanceof Float ? (T) Double.valueOf(parseDouble(t2, (double) t.floatValue())) : t2;
        }
        return t2;
    }
}
