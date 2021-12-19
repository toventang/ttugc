package p4600h.p4615g;

import com.bytedance.covode.number.Covode;

/* renamed from: h.g.c */
public class C89243c extends C89242b {
    static {
        Covode.recordClassIndex(105327);
    }

    /* renamed from: a */
    public static final int m154730a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: b */
    public static final long m154731b(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: a */
    public static final int m154729a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }
}
