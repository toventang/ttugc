package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.experiment.ay */
public final class C46722ay {

    /* renamed from: a */
    public static final int f108894a;

    /* renamed from: b */
    public static final boolean f108895b;

    /* renamed from: c */
    public static final boolean f108896c;

    /* renamed from: d */
    private static boolean f108897d;

    /* renamed from: e */
    private static final boolean f108898e;

    /* renamed from: a */
    public static boolean m90105a() {
        if (f108895b || f108898e) {
            return true;
        }
        return false;
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(55323);
        boolean z4 = true;
        int i = Keva.getRepo("ab_repo_cold_boot").getInt("cold_boot_measure_opt", 1);
        f108894a = i;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        f108897d = z;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        f108895b = z2;
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        f108898e = z3;
        if (i != 6) {
            z4 = false;
        }
        f108896c = z4;
    }

    /* renamed from: a */
    public static void m90104a(int i) {
        Keva.getRepo("ab_repo_cold_boot").storeInt("cold_boot_measure_opt", i);
    }
}
