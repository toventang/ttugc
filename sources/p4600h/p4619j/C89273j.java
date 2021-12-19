package p4600h.p4619j;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4619j.C89266e;

/* renamed from: h.j.j */
public class C89273j extends C89272i {
    static {
        Covode.recordClassIndex(105357);
    }

    /* renamed from: a */
    public static final long m154764a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: b */
    public static final float m154768b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: b */
    public static final int m154769b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static final long m154770b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static final float m154771c(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: c */
    public static final int m154772c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C89269g m154766a(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C89269g.f202934e;
        }
        return new C89269g(i, i2 - 1);
    }

    /* renamed from: a */
    public static final C89266e m154765a(C89266e eVar, int i) {
        boolean z;
        C89219l.m154721d(eVar, "");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C89271h.m154761a(z, Integer.valueOf(i));
        int i2 = eVar.f202927a;
        int i3 = eVar.f202928b;
        if (eVar.f202929c <= 0) {
            i = -i;
        }
        return C89266e.C89267a.m154754a(i2, i3, i);
    }

    /* renamed from: a */
    public static final int m154763a(C89269g gVar, AbstractC89255c cVar) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(cVar, "");
        try {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(gVar, "");
            if (gVar.mo143680a()) {
                throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(gVar)));
            } else if (gVar.f202928b < Integer.MAX_VALUE) {
                return cVar.nextInt(gVar.f202927a, gVar.f202928b + 1);
            } else {
                if (gVar.f202927a > Integer.MIN_VALUE) {
                    return cVar.nextInt(gVar.f202927a - 1, gVar.f202928b) + 1;
                }
                return cVar.nextInt();
            }
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m154767a(AbstractC89265d<Double> dVar, float f) {
        C89219l.m154721d(dVar, "");
        return dVar.mo143673a(Double.valueOf((double) f));
    }

    /* renamed from: a */
    public static final int m154762a(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }
}
