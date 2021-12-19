package com.bytedance.lottie;

import androidx.core.p033d.C0654g;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.lottie.e */
public final class C21044e {

    /* renamed from: a */
    private static final Set<String> f49930a = new HashSet();

    /* renamed from: b */
    private static boolean f49931b = false;

    /* renamed from: c */
    private static String[] f49932c;

    /* renamed from: d */
    private static long[] f49933d;

    /* renamed from: e */
    private static int f49934e = 0;

    /* renamed from: f */
    private static int f49935f = 0;

    static {
        Covode.recordClassIndex(24660);
    }

    /* renamed from: a */
    public static void m39620a(String str) {
        Set<String> set = f49930a;
        if (!set.contains(str)) {
            set.add(str);
        }
    }

    /* renamed from: b */
    public static void m39621b(String str) {
        if (f49931b) {
            int i = f49934e;
            if (i == 20) {
                f49935f++;
                return;
            }
            f49932c[i] = str;
            f49933d[i] = System.nanoTime();
            C0654g.m2391a(str);
            f49934e++;
        }
    }

    /* renamed from: c */
    public static float m39622c(String str) {
        int i = f49935f;
        if (i > 0) {
            f49935f = i - 1;
            return 0.0f;
        } else if (!f49931b) {
            return 0.0f;
        } else {
            int i2 = f49934e - 1;
            f49934e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f49932c[i2])) {
                C0654g.m2390a();
                return ((float) (System.nanoTime() - f49933d[f49934e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f49932c[f49934e] + ".");
            }
        }
    }
}
