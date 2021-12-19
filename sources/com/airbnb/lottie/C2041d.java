package com.airbnb.lottie;

import androidx.core.p033d.C0654g;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.d */
public final class C2041d {

    /* renamed from: a */
    private static final Set<String> f6120a = new HashSet();

    /* renamed from: b */
    private static boolean f6121b = false;

    /* renamed from: c */
    private static String[] f6122c;

    /* renamed from: d */
    private static long[] f6123d;

    /* renamed from: e */
    private static int f6124e = 0;

    /* renamed from: f */
    private static int f6125f = 0;

    static {
        Covode.recordClassIndex(2236);
    }

    /* renamed from: a */
    public static void m6461a(String str) {
        Set<String> set = f6120a;
        if (!set.contains(str)) {
            set.add(str);
        }
    }

    /* renamed from: b */
    public static void m6462b(String str) {
        if (f6121b) {
            int i = f6124e;
            if (i == 20) {
                f6125f++;
                return;
            }
            f6122c[i] = str;
            f6123d[i] = System.nanoTime();
            C0654g.m2391a(str);
            f6124e++;
        }
    }

    /* renamed from: c */
    public static float m6463c(String str) {
        int i = f6125f;
        if (i > 0) {
            f6125f = i - 1;
            return 0.0f;
        } else if (!f6121b) {
            return 0.0f;
        } else {
            int i2 = f6124e - 1;
            f6124e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f6122c[i2])) {
                C0654g.m2390a();
                return ((float) (System.nanoTime() - f6123d[f6124e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f6122c[f6124e] + ".");
            }
        }
    }
}
