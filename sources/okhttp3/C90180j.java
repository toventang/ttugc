package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90078d;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4659g.C90160f;

/* renamed from: okhttp3.j */
public final class C90180j {

    /* renamed from: a */
    static final Executor f204789a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C90084c.m156412a("OkHttp ConnectionPool", true));

    /* renamed from: g */
    static final /* synthetic */ boolean f204790g = true;

    /* renamed from: b */
    final int f204791b;

    /* renamed from: c */
    final Runnable f204792c;

    /* renamed from: d */
    final Deque<C90076c> f204793d;

    /* renamed from: e */
    final C90078d f204794e;

    /* renamed from: f */
    boolean f204795f;

    /* renamed from: h */
    private final long f204796h;

    public C90180j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    static {
        Covode.recordClassIndex(106353);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo144996a(long j) {
        MethodCollector.m26663i(5590);
        synchronized (this) {
            try {
                C90076c cVar = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (C90076c cVar2 : this.f204793d) {
                    List<Reference<C90082g>> list = cVar2.f204411k;
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            Reference<C90082g> reference = list.get(i3);
                            if (reference.get() == null) {
                                C90160f.f204720c.mo144947a("A connection to " + cVar2.f204401a.f204137a.f204069a + " was leaked. Did you forget to close a response body?", ((C90082g.C90083a) reference).f204445a);
                                list.remove(i3);
                                cVar2.f204408h = true;
                                if (list.isEmpty()) {
                                    cVar2.f204412l = j - this.f204796h;
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
                    long j3 = j - cVar2.f204412l;
                    if (j3 > j2) {
                        cVar = cVar2;
                        j2 = j3;
                    }
                }
                long j4 = this.f204796h;
                if (j2 >= j4 || i > this.f204791b) {
                    this.f204793d.remove(cVar);
                    C90084c.m156416a(cVar.f204403c);
                    MethodCollector.m26664o(5590);
                    return 0;
                } else if (i > 0) {
                    return j4 - j2;
                } else if (i2 > 0) {
                    MethodCollector.m26664o(5590);
                    return j4;
                } else {
                    this.f204795f = false;
                    MethodCollector.m26664o(5590);
                    return -1;
                }
            } finally {
                MethodCollector.m26664o(5590);
            }
        }
    }

    public C90180j(int i, long j, TimeUnit timeUnit) {
        this.f204792c = new Runnable() {
            /* class okhttp3.C90180j.RunnableC901811 */

            static {
                Covode.recordClassIndex(106354);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8319);
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
                    r7 = 8319(0x207f, float:1.1657E-41)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r7)
                L_0x0005:
                    okhttp3.j r2 = okhttp3.C90180j.this
                    long r0 = java.lang.System.nanoTime()
                    long r5 = r2.mo144996a(r0)
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
                    okhttp3.j r2 = okhttp3.C90180j.this
                    monitor-enter(r2)
                    okhttp3.j r1 = okhttp3.C90180j.this     // Catch:{ InterruptedException -> 0x002f }
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
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.C90180j.RunnableC901811.run():void");
            }
        };
        this.f204793d = new ArrayDeque();
        this.f204794e = new C90078d();
        this.f204791b = i;
        this.f204796h = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: ".concat(String.valueOf(j)));
        }
    }
}
