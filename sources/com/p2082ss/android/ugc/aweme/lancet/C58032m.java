package com.p2082ss.android.ugc.aweme.lancet;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.logger.C58945a;

/* renamed from: com.ss.android.ugc.aweme.lancet.m */
public final class C58032m {
    static {
        Covode.recordClassIndex(68067);
    }

    /* renamed from: b */
    private static boolean m104854b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m104853a() {
        if (!m104854b() || !C58945a.C58947b.f134185a.f134176c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m104851a(String str) {
        return "load_so_".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public static void m104852a(long j, String str) {
        if (m104853a()) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            C58945a.C58947b.f134185a.mo96423a(m104851a(str), uptimeMillis);
            C58945a.C58947b.f134185a.mo96427b("load_so_total", uptimeMillis);
        }
    }
}
