package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.experiment.aw */
public final class C46720aw {

    /* renamed from: a */
    public static final C46720aw f108891a = new C46720aw();

    /* renamed from: b */
    private static int f108892b = Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("cold_boot_mainfragment_opt", 2);

    private C46720aw() {
    }

    /* renamed from: a */
    public static boolean m90102a() {
        if (f108892b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m90103b() {
        if (f108892b == 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(55321);
    }
}
