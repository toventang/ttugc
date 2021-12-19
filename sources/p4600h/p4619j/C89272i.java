package p4600h.p4619j;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.j.i */
public class C89272i {
    static {
        Covode.recordClassIndex(105356);
    }

    /* renamed from: a */
    public static final AbstractC89264c<Double> m154759a(double d, double d2) {
        return new C89262a(d, d2);
    }

    /* renamed from: a */
    public static final AbstractC89264c<Float> m154760a(float f, float f2) {
        return new C89263b(f, f2);
    }

    /* renamed from: a */
    public static final void m154761a(boolean z, Number number) {
        C89219l.m154721d(number, "");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
