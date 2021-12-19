package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.j.d */
public final class C88902d {
    static {
        Covode.recordClassIndex(104944);
    }

    /* renamed from: a */
    public static long m154096a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    public static long m154097a(AtomicLong atomicLong) {
        long j;
        long j2;
        do {
            j = atomicLong.get();
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j2 = j - 1;
            if (j2 < 0) {
                C88925a.m154178a(new IllegalStateException("More produced than requested: ".concat(String.valueOf(j2))));
                j2 = 0;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        return j2;
    }

    /* renamed from: a */
    public static long m154098a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m154096a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m154099b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C88925a.m154178a(new IllegalStateException("More produced than requested: ".concat(String.valueOf(j3))));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
