package beancopy;

import com.bytedance.covode.number.Covode;

/* renamed from: beancopy.a */
public final class C1746a {
    static {
        Covode.recordClassIndex(1916);
    }

    /* renamed from: a */
    public static boolean m5877a(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    /* renamed from: a */
    public static String m5876a(Long l, String str) {
        return l == null ? str : String.valueOf(l.longValue());
    }

    /* renamed from: a */
    public static boolean m5878a(Integer num, boolean z) {
        if (num == null) {
            return z;
        }
        return num.intValue() != 0;
    }

    /* renamed from: a */
    public static long m5874a(Long l) {
        return m5875a(l, 0);
    }

    /* renamed from: a */
    public static double m5867a(Double d, double d2) {
        if (d == null) {
            return d2;
        }
        return d.doubleValue();
    }

    /* renamed from: a */
    public static float m5868a(Double d, float f) {
        if (d == null) {
            return f;
        }
        return d.floatValue();
    }

    /* renamed from: a */
    public static int m5869a(Boolean bool, int i) {
        if (bool == null) {
            return i;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m5870a(Double d, int i) {
        if (d == null) {
            return i;
        }
        return d.intValue();
    }

    /* renamed from: a */
    public static int m5871a(Integer num, int i) {
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static long m5872a(Double d, long j) {
        if (d == null) {
            return j;
        }
        return d.longValue();
    }

    /* renamed from: a */
    public static long m5873a(Integer num, long j) {
        if (num == null) {
            return j;
        }
        return num.longValue();
    }

    /* renamed from: a */
    public static long m5875a(Long l, long j) {
        if (l == null) {
            return j;
        }
        return l.longValue();
    }
}
