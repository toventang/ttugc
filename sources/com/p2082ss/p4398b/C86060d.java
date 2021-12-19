package com.p2082ss.p4398b;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.b.d */
public final class C86060d {

    /* renamed from: a */
    private static int f192008a = 3;

    /* renamed from: b */
    private static int f192009b = 3;

    /* renamed from: c */
    private static int f192010c = 3;

    static {
        Covode.recordClassIndex(100768);
    }

    /* renamed from: a */
    public static boolean m147824a() {
        int i;
        int i2 = f192008a;
        if (i2 == 3) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("oppo")) {
                i = 2;
            } else {
                i = 1;
            }
            f192008a = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m147825b() {
        int i;
        int i2 = f192009b;
        if (i2 == 3) {
            String str = Build.HARDWARE;
            if (TextUtils.isEmpty(str) || (!str.toLowerCase().contains("hi") && !str.toLowerCase().contains("kirin"))) {
                i = 2;
            } else {
                i = 1;
            }
            f192009b = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m147826c() {
        int i;
        int i2 = f192010c;
        if (i2 == 3) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("samsung")) {
                i = 2;
            } else {
                i = 1;
            }
            f192010c = i;
            if (i == 1) {
                return true;
            }
            return false;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
