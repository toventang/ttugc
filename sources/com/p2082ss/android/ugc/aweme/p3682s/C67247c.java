package com.p2082ss.android.ugc.aweme.p3682s;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.s.c */
public final class C67247c {

    /* renamed from: a */
    private static SharedPreferences f150704a;

    static {
        Covode.recordClassIndex(78866);
    }

    /* renamed from: a */
    public static SharedPreferences m119170a(Context context) {
        MethodCollector.m26663i(11906);
        if (f150704a == null) {
            f150704a = context.getSharedPreferences("cold_boot_sp", 0);
        }
        SharedPreferences sharedPreferences = f150704a;
        MethodCollector.m26664o(11906);
        return sharedPreferences;
    }

    /* renamed from: a */
    public static boolean m119172a(Context context, String str) {
        return m119170a(context).getBoolean(str, true);
    }

    /* renamed from: a */
    public static void m119171a(Context context, String str, boolean z) {
        m119170a(context).edit().putBoolean(str, z).apply();
    }
}
