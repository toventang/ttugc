package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p4600h.p4619j.C89271h;

/* renamed from: kotlinx.coroutines.at */
public final class RunnableC89529at extends EventLoopImplBase implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: a */
    public static final RunnableC89529at f203247a;

    /* renamed from: c */
    private static final long f203248c;
    private static volatile int debugStatus;

    private RunnableC89529at() {
    }

    /* renamed from: a */
    private static boolean m155454a() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC89553bm
    public final Thread getThread() {
        Thread thread = _thread;
        if (thread == null) {
            return m155455b();
        }
        return thread;
    }

    /* renamed from: b */
    private final synchronized Thread m155455b() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: c */
    private final synchronized boolean m155456c() {
        if (m155454a()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: d */
    private final synchronized void m155457d() {
        if (m155454a()) {
            debugStatus = 3;
            resetAll();
            notifyAll();
        }
    }

    static {
        Long l;
        Covode.recordClassIndex(105620);
        RunnableC89529at atVar = new RunnableC89529at();
        f203247a = atVar;
        AbstractC89552bl.incrementUseCount$default(atVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f203248c = timeUnit.toNanos(l.longValue());
    }

    public final void run() {
        long j;
        C89601cw.f203328a.set(this);
        try {
            if (m155456c()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long processNextEvent = processNextEvent();
                    if (processNextEvent == Long.MAX_VALUE) {
                        if (j2 == Long.MAX_VALUE) {
                            AbstractC89602cx cxVar = C89603cy.f203330a;
                            if (cxVar != null) {
                                j = cxVar.mo144151a();
                            } else {
                                j = System.nanoTime();
                            }
                            if (j2 == Long.MAX_VALUE) {
                                j2 = f203248c + j;
                            }
                            long j3 = j2 - j;
                            if (j3 <= 0) {
                                _thread = null;
                                m155457d();
                                if (!isEmpty()) {
                                    getThread();
                                    return;
                                }
                                return;
                            }
                            processNextEvent = C89271h.m154770b(processNextEvent, j3);
                        } else {
                            processNextEvent = C89271h.m154770b(processNextEvent, f203248c);
                        }
                    }
                    if (processNextEvent > 0) {
                        if (m155454a()) {
                            _thread = null;
                            m155457d();
                            if (!isEmpty()) {
                                getThread();
                                return;
                            }
                            return;
                        } else if (C89603cy.f203330a == null) {
                            LockSupport.parkNanos(this, processNextEvent);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m155457d();
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC89534ax, kotlinx.coroutines.EventLoopImplBase
    public final AbstractC89548bh invokeOnTimeout(long j, Runnable runnable) {
        return scheduleInvokeOnTimeout(j, runnable);
    }
}
