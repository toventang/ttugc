package com.p2082ss.android.ugc.aweme.logger;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.C58221f;

/* renamed from: com.ss.android.ugc.aweme.logger.c */
public final class C58949c {

    /* renamed from: a */
    public static boolean f134187a;

    /* renamed from: b */
    public static long f134188b;

    /* renamed from: c */
    public static int f134189c = -999;

    /* renamed from: com.ss.android.ugc.aweme.logger.c$a */
    public static class C58950a {

        /* renamed from: a */
        public static boolean f134190a = true;

        /* renamed from: b */
        public static boolean f134191b;

        /* renamed from: c */
        public static boolean f134192c;

        static {
            Covode.recordClassIndex(69274);
        }

        /* renamed from: a */
        public static void m108307a(int i) {
            C58221f.m105153e().mo95704a(new WarmBootLogger$BootTypeLogger$1(i)).mo95706a();
        }
    }

    static {
        Covode.recordClassIndex(69273);
    }

    /* renamed from: a */
    public static void m108306a() {
        if (f134187a && f134188b > 0) {
            f134187a = false;
            C58221f.m105153e().mo95704a(new WarmBootLogger$1(SystemClock.uptimeMillis() - f134188b)).mo95706a();
        }
    }
}
