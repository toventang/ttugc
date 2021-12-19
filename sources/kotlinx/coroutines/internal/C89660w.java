package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import p4600h.p4622m.C89361p;

/* renamed from: kotlinx.coroutines.internal.w */
public final class C89660w {
    static {
        Covode.recordClassIndex(105753);
    }

    /* renamed from: a */
    public static /* synthetic */ int m155635a(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C89662y.m155639a(str, i, i2, i3);
    }

    /* renamed from: a */
    public static final long m155637a(String str, long j, long j2, long j3) {
        String a = C89661x.m155638a(str);
        if (a == null) {
            return j;
        }
        Long g = C89361p.m154865g(a);
        if (g != null) {
            long longValue = g.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + a + '\'').toString());
    }
}
