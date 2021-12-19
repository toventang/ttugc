package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.utils.bo */
public final class C80257bo {

    /* renamed from: com.ss.android.ugc.aweme.utils.bo$a */
    public static final class C80258a {

        /* renamed from: a */
        public long f179737a;

        /* renamed from: b */
        public long f179738b;

        static {
            Covode.recordClassIndex(93526);
        }
    }

    static {
        Covode.recordClassIndex(93525);
    }

    /* renamed from: a */
    private static C80258a m139106a() {
        C80258a c = m139110c();
        c.f179737a -= 86400000;
        c.f179738b -= 86400000;
        return c;
    }

    /* renamed from: b */
    private static C80258a m139108b() {
        C80258a c = m139110c();
        c.f179737a += 86400000;
        c.f179738b += 86400000;
        return c;
    }

    /* renamed from: c */
    private static C80258a m139110c() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        C80258a aVar = new C80258a();
        aVar.f179737a = time;
        aVar.f179738b = time2;
        return aVar;
    }

    /* renamed from: d */
    public static long m139112d(long j) {
        return j + ((long) TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: c */
    public static boolean m139111c(long j) {
        C80258a b = m139108b();
        if (j <= b.f179737a || j >= b.f179738b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m139107a(long j) {
        C80258a c = m139110c();
        if (j <= c.f179737a || j >= c.f179738b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m139109b(long j) {
        C80258a a = m139106a();
        if (j <= a.f179737a || j >= a.f179738b) {
            return false;
        }
        return true;
    }
}
