package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.p2076a.AbstractC29190d;
import com.squareup.p2075a.p2076a.C29205i;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2078b.C29185s;
import com.squareup.p2075a.p2076a.p2079c.C29189b;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.a.j */
public final class C29226j {

    /* renamed from: a */
    static final C29226j f69250a;

    /* renamed from: g */
    static final /* synthetic */ boolean f69251g = true;

    /* renamed from: b */
    final Executor f69252b;

    /* renamed from: c */
    final int f69253c;

    /* renamed from: d */
    public Runnable f69254d;

    /* renamed from: e */
    final Deque<C29189b> f69255e;

    /* renamed from: f */
    final C29205i f69256f;

    /* renamed from: h */
    private final long f69257h;

    static {
        long j;
        Covode.recordClassIndex(35575);
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        if (property2 != null) {
            j = Long.parseLong(property2);
        } else {
            j = 300000;
        }
        if (property != null && !Boolean.parseBoolean(property)) {
            f69250a = new C29226j(0, j);
        } else if (property3 != null) {
            f69250a = new C29226j(Integer.parseInt(property3), j);
        } else {
            f69250a = new C29226j(5, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo50960a(long j) {
        MethodCollector.m26663i(3041);
        synchronized (this) {
            try {
                C29189b bVar = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (C29189b bVar2 : this.f69255e) {
                    List<Reference<C29185s>> list = bVar2.f69134h;
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            if (list.get(i3).get() == null) {
                                AbstractC29190d.f69139a.warning("A connection to " + bVar2.f69127a.f69371a.f68782a + " was leaked. Did you forget to close a response body?");
                                list.remove(i3);
                                bVar2.f69135i = true;
                                if (list.isEmpty()) {
                                    bVar2.f69136j = j - this.f69257h;
                                    break;
                                }
                            } else {
                                i3++;
                            }
                        } else if (list.size() > 0) {
                            i2++;
                        }
                    }
                    i++;
                    long j3 = j - bVar2.f69136j;
                    if (j3 > j2) {
                        bVar = bVar2;
                        j2 = j3;
                    }
                }
                long j4 = this.f69257h;
                if (j2 >= j4 || i > this.f69253c) {
                    this.f69255e.remove(bVar);
                    C29206j.m58439a(bVar.f69128b);
                    MethodCollector.m26664o(3041);
                    return 0;
                } else if (i > 0) {
                    return j4 - j2;
                } else if (i2 > 0) {
                    MethodCollector.m26664o(3041);
                    return j4;
                } else {
                    MethodCollector.m26664o(3041);
                    return -1;
                }
            } finally {
                MethodCollector.m26664o(3041);
            }
        }
    }

    private C29226j(int i, long j) {
        this(i, j, TimeUnit.MILLISECONDS);
    }

    private C29226j(int i, long j, TimeUnit timeUnit) {
        this.f69252b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C29206j.m58446b("OkHttp ConnectionPool"));
        this.f69254d = new Runnable() {
            /* class com.squareup.p2075a.C29226j.RunnableC292271 */

            static {
                Covode.recordClassIndex(35576);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2299);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
                throw r0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    r7 = 2299(0x8fb, float:3.222E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r7)
                L_0x0005:
                    com.squareup.a.j r2 = com.squareup.p2075a.C29226j.this
                    long r0 = java.lang.System.nanoTime()
                    long r5 = r2.mo50960a(r0)
                    r1 = -1
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 != 0) goto L_0x0019
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                    return
                L_0x0019:
                    r1 = 0
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0005
                    r0 = 1000000(0xf4240, double:4.940656E-318)
                    long r3 = r5 / r0
                    long r0 = r0 * r3
                    long r5 = r5 - r0
                    com.squareup.a.j r2 = com.squareup.p2075a.C29226j.this
                    monitor-enter(r2)
                    com.squareup.a.j r1 = com.squareup.p2075a.C29226j.this     // Catch:{ InterruptedException -> 0x002f }
                    int r0 = (int) r5     // Catch:{ InterruptedException -> 0x002f }
                    r1.wait(r3, r0)     // Catch:{ InterruptedException -> 0x002f }
                L_0x002f:
                    monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                    goto L_0x0005
                L_0x0031:
                    r0 = move-exception
                    monitor-exit(r2)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29226j.RunnableC292271.run():void");
            }
        };
        this.f69255e = new ArrayDeque();
        this.f69256f = new C29205i();
        this.f69253c = i;
        this.f69257h = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: ".concat(String.valueOf(j)));
        }
    }
}
