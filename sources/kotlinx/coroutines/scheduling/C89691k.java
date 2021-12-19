package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C89660w;
import kotlinx.coroutines.internal.C89661x;
import p4600h.p4619j.C89271h;

/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C89691k {

    /* renamed from: a */
    public static final long f203456a = C89660w.m155637a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b */
    public static final int f203457b = C89660w.m155635a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);

    /* renamed from: c */
    public static final int f203458c;

    /* renamed from: d */
    public static final int f203459d;

    /* renamed from: e */
    public static final long f203460e = TimeUnit.SECONDS.toNanos(C89660w.m155637a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f */
    public static AbstractC89692l f203461f = C89686f.f203450a;

    static {
        Covode.recordClassIndex(105785);
        int a = C89660w.m155635a("kotlinx.coroutines.scheduler.core.pool.size", C89271h.m154769b(C89661x.f203410a, 2), 1, 0, 8);
        f203458c = a;
        f203459d = C89660w.m155635a("kotlinx.coroutines.scheduler.max.pool.size", C89271h.m154762a(C89661x.f203410a * 128, a, 2097150), 0, 2097150, 4);
    }
}
