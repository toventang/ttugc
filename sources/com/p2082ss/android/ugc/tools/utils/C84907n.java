package com.p2082ss.android.ugc.tools.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.tools.utils.n */
public final class C84907n {
    static {
        Covode.recordClassIndex(98901);
    }

    /* renamed from: a */
    public static void m145913a() {
        if (TextUtils.equals(Build.BRAND, "Xiaomi") && !m145915a("android.content.res.MiuiResourcesImpl", "sMiuiThemeEnabled")) {
            m145915a("android.content.res.MiuiResources", "sMiuiThemeEnabled");
        }
    }

    /* renamed from: a */
    private static boolean m145915a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, false);
            return true;
        } catch (NoSuchFieldException e) {
            e.getMessage();
            return false;
        } catch (ClassNotFoundException e2) {
            e2.getMessage();
            return false;
        } catch (IllegalAccessException e3) {
            e3.getMessage();
            return false;
        }
    }

    /* renamed from: a */
    public static void m145914a(Context context, int[] iArr, String str) {
        m145913a();
        for (int i : iArr) {
            C84915u.m145941a(context, i, str);
        }
    }
}
