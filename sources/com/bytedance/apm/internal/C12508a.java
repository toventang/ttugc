package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.internal.a */
public final class C12508a {

    /* renamed from: a */
    static volatile boolean f30373a;

    /* renamed from: b */
    static SharedPreferences f30374b;

    /* renamed from: c */
    static int f30375c;

    /* renamed from: d */
    static int f30376d;

    /* renamed from: e */
    public static long f30377e = 16408;

    static {
        Covode.recordClassIndex(14324);
    }

    /* renamed from: a */
    public static void m22476a() {
        SharedPreferences sharedPreferences = f30374b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("monitor_switch_config_first_flag", f30376d).putLong("monitor_switch_config_atrace_flag", f30377e).apply();
        }
    }

    /* renamed from: a */
    public static void m22477a(int i) {
        f30376d = (i & -536870912) + (f30376d & 536870911);
    }

    /* renamed from: b */
    public static boolean m22479b(int i) {
        if ((i & f30375c) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m22478a(int i, boolean z) {
        if (z) {
            f30376d = i | f30376d;
            return;
        }
        f30376d = (i ^ -1) & f30376d;
    }
}
