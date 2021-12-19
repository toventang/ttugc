package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: com.google.c.b.o */
public abstract class AbstractC27342o extends Number {

    /* renamed from: a */
    static final ThreadLocal<int[]> f64607a = new ThreadLocal<>();

    /* renamed from: b */
    static final Random f64608b = new Random();

    /* renamed from: c */
    static final int f64609c = Runtime.getRuntime().availableProcessors();

    /* renamed from: g */
    private static final Unsafe f64610g;

    /* renamed from: h */
    private static final long f64611h;

    /* renamed from: i */
    private static final long f64612i;

    /* renamed from: d */
    volatile transient C27344a[] f64613d;

    /* renamed from: e */
    volatile transient long f64614e;

    /* renamed from: f */
    volatile transient int f64615f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract long mo45511a(long j, long j2);

    AbstractC27342o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo45520b() {
        return f64610g.compareAndSwapInt(this, f64612i, 0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.p1998c.p2000b.AbstractC27342o.C273431());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m54618c() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.c.b.o$1 r0 = new com.google.c.b.o$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.Throwable r1 = r0.getCause()
            java.lang.String r0 = "Could not initialize intrinsics"
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2000b.AbstractC27342o.m54618c():sun.misc.Unsafe");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.b.o$a */
    public static final class C27344a {

        /* renamed from: b */
        private static final Unsafe f64616b;

        /* renamed from: c */
        private static final long f64617c;

        /* renamed from: a */
        volatile long f64618a;

        static {
            Covode.recordClassIndex(32924);
            try {
                Unsafe c = AbstractC27342o.m54618c();
                f64616b = c;
                f64617c = c.objectFieldOffset(C27344a.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        C27344a(long j) {
            this.f64618a = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo45523a(long j, long j2) {
            return f64616b.compareAndSwapLong(this, f64617c, j, j2);
        }
    }

    static {
        Covode.recordClassIndex(32922);
        try {
            Unsafe c = m54618c();
            f64610g = c;
            f64611h = c.objectFieldOffset(AbstractC27342o.class.getDeclaredField("base"));
            f64612i = c.objectFieldOffset(AbstractC27342o.class.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo45521b(long j, long j2) {
        return f64610g.compareAndSwapLong(this, f64611h, j, j2);
    }
}
