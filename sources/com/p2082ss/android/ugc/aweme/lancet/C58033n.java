package com.p2082ss.android.ugc.aweme.lancet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.utils.C80286c;

/* renamed from: com.ss.android.ugc.aweme.lancet.n */
public final class C58033n {

    /* renamed from: a */
    private static Boolean f132265a;

    /* renamed from: b */
    private static int f132266b = -1;

    static {
        Covode.recordClassIndex(68068);
    }

    /* renamed from: b */
    public static boolean m104856b() {
        if (f132266b == -1) {
            if (SettingsManager.m29616a().mo25400a("benchmark_poor_perf_device", false)) {
                f132266b = 1;
            } else {
                f132266b = 0;
            }
        }
        if (f132266b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104855a() {
        if (!C80286c.f179804a) {
            return C16048b.m29633a().mo25421a(true, "enable_benchmark_performance", false);
        }
        if (f132265a == null) {
            f132265a = Boolean.valueOf(C16048b.m29633a().mo25421a(true, "enable_benchmark_performance", false));
        }
        return f132265a.booleanValue();
    }
}
