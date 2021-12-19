package com.google.android.gms.common.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.h */
public final class C25606h {

    /* renamed from: a */
    public static Boolean f60717a;

    /* renamed from: b */
    private static Boolean f60718b;

    /* renamed from: c */
    private static Boolean f60719c;

    static {
        Covode.recordClassIndex(31016);
    }

    /* renamed from: b */
    public static boolean m49415b(Context context) {
        if (!m49414a(context)) {
            return false;
        }
        if (!C25609k.m49422d()) {
            return true;
        }
        if (!m49416c(context) || C25609k.m49423e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m49414a(Context context) {
        boolean z;
        if (f60718b == null) {
            if (!C25609k.m49420b() || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                z = false;
            } else {
                z = true;
            }
            f60718b = Boolean.valueOf(z);
        }
        return f60718b.booleanValue();
    }

    /* renamed from: c */
    private static boolean m49416c(Context context) {
        boolean z;
        if (f60719c == null) {
            if (!C25609k.m49421c() || !context.getPackageManager().hasSystemFeature("cn.google")) {
                z = false;
            } else {
                z = true;
            }
            f60719c = Boolean.valueOf(z);
        }
        return f60719c.booleanValue();
    }
}
