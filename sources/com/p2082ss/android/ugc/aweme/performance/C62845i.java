package com.p2082ss.android.ugc.aweme.performance;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58033n;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.performance.i */
public final class C62845i {

    /* renamed from: a */
    private static final List<String> f142513a = Arrays.asList("REDMI 6A", "VIVO 1812", "MRD-LX1F", "VIVO 1908", "MRD-LX1", "AMN-LX9", "TECNO ID3K", "TECNO KB2", "TECNO KB3", "KSA-LX9", "INFINIX X627V");

    /* renamed from: b */
    private static volatile int f142514b = 0;

    /* renamed from: a */
    public static boolean m113257a() {
        if (C58033n.m104855a()) {
            return C58033n.m104856b();
        }
        if (f142514b == -1 || f142514b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m113259b() {
        if (C58033n.m104855a()) {
            return C58033n.m104856b();
        }
        if (f142514b == -1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(73671);
    }

    /* renamed from: a */
    public static void m113256a(AbstractC62844h hVar) {
        if (!m113257a()) {
            hVar.mo85806a();
        }
    }

    /* renamed from: a */
    public static void m113255a(Context context) {
        if (context != null) {
            SharedPreferences a = C34822d.m71158a(context, "performance_sp", 0);
            if (a.getInt("update_version", -1) != 2) {
                f142514b = ((Integer) m113258b(context).first).intValue();
                a.edit().putInt("update_version", 2).putInt("performance_poor_score", f142514b).apply();
            } else if (a.contains("performance_poor_score")) {
                f142514b = a.getInt("performance_poor_score", 0);
            } else if (a.getBoolean("is_performance_poor", false)) {
                f142514b = 1;
            }
        }
    }

    /* renamed from: b */
    private static Pair<Integer, String> m113258b(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return new Pair<>(-1, "Android 6.0 and below");
        }
        long a = C62842g.m113250a(context);
        if (a <= 1287651328) {
            return new Pair<>(-1, "1.2G RAM and below");
        }
        if (a <= 1610612736) {
            return new Pair<>(1, "1.5G RAM and below");
        }
        int a2 = C62842g.m113247a();
        int b = C62842g.m113253b();
        if (a2 <= 4 && b <= 2048000) {
            return new Pair<>(1, "4 core and below && The main frequency is lower than 2GHZ");
        }
        if (a <= 2147483648L && Build.VERSION.SDK_INT < 24) {
            return new Pair<>(1, "2G RAM and below && Android7.0 and below");
        }
        if (b > 0 && b <= 1620000) {
            return new Pair<>(1, "The main frequency is lower than 1.6GHZ");
        }
        String str = Build.MODEL;
        for (String str2 : f142513a) {
            if (str2.equalsIgnoreCase(str)) {
                return new Pair<>(1, "The filtering model is a low-end machine： ".concat(String.valueOf(str)));
            }
        }
        return new Pair<>(0, "");
    }
}
