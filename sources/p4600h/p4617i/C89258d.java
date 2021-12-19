package p4600h.p4617i;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.i.d */
public final class C89258d {
    static {
        Covode.recordClassIndex(105342);
    }

    /* renamed from: a */
    public static final int m154744a(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    /* renamed from: a */
    public static final AbstractC89255c m154745a(long j) {
        return new C89259e((int) j, (int) (j >> 32));
    }

    /* renamed from: a */
    public static final String m154746a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }
}
