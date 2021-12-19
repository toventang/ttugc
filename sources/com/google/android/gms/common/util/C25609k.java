package com.google.android.gms.common.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.k */
public final class C25609k {
    static {
        Covode.recordClassIndex(31019);
    }

    /* renamed from: a */
    public static boolean m49419a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public static boolean m49420b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m49421c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m49422d() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m49423e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m49424f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
