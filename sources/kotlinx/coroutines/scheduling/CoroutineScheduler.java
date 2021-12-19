package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.internal.C89659v;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4619j.C89271h;

public final class CoroutineScheduler implements Closeable, Executor {
    public static final C89678a Companion = new C89678a((byte) 0);
    public static final C89659v NOT_IN_STACK = new C89659v("NOT_IN_STACK");
    private static final AtomicIntegerFieldUpdater _isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    static final AtomicLongFieldUpdater controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    private static final AtomicLongFieldUpdater parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    private volatile int _isTerminated;
    volatile long controlState;
    public final int corePoolSize;
    public final C89684d globalBlockingQueue;
    public final C89684d globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack;
    public final String schedulerName;
    public final AtomicReferenceArray<C89679b> workers;

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    public enum EnumC89680c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        static {
            Covode.recordClassIndex(105774);
        }
    }

    private final int blockingTasks(long j) {
        return (int) ((j & 4398044413952L) >> 21);
    }

    public final int availableCpuPermits(long j) {
        return (int) ((j & 9223367638808264704L) >> 42);
    }

    public final int createdWorkers(long j) {
        return (int) (j & 2097151);
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public static final class C89678a {
        static {
            Covode.recordClassIndex(105772);
        }

        private C89678a() {
        }

        public /* synthetic */ C89678a(byte b) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isTerminated() {
        /*
            r1 = this;
            int r0 = r1._isTerminated
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.isTerminated():boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown(10000);
    }

    public final int getCreatedWorkers() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public final class C89679b extends Thread {

        /* renamed from: c */
        static final AtomicIntegerFieldUpdater f203428c = AtomicIntegerFieldUpdater.newUpdater(C89679b.class, "workerCtl");

        /* renamed from: a */
        public final C89693m f203429a;

        /* renamed from: b */
        public EnumC89680c f203430b;

        /* renamed from: d */
        public boolean f203431d;

        /* renamed from: f */
        private long f203433f;

        /* renamed from: g */
        private long f203434g;

        /* renamed from: h */
        private int f203435h;
        public volatile int indexInArray;
        public volatile Object nextParkedWorker;
        volatile int workerCtl;

        static {
            Covode.recordClassIndex(105773);
        }

        /* renamed from: c */
        private final boolean m155692c() {
            if (this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private final AbstractRunnableC89688h m155693d() {
            if (m155688b(2) == 0) {
                AbstractRunnableC89688h hVar = (AbstractRunnableC89688h) CoroutineScheduler.this.globalCpuQueue.mo144199c();
                if (hVar != null) {
                    return hVar;
                }
                return (AbstractRunnableC89688h) CoroutineScheduler.this.globalBlockingQueue.mo144199c();
            }
            AbstractRunnableC89688h hVar2 = (AbstractRunnableC89688h) CoroutineScheduler.this.globalBlockingQueue.mo144199c();
            if (hVar2 != null) {
                return hVar2;
            }
            return (AbstractRunnableC89688h) CoroutineScheduler.this.globalCpuQueue.mo144199c();
        }

        /* renamed from: a */
        private final boolean m155687a() {
            long j;
            if (this.f203430b == EnumC89680c.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            do {
                j = coroutineScheduler.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.f203430b = EnumC89680c.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: b */
        private final void m155690b() {
            if (!m155692c()) {
                CoroutineScheduler.this.parkedWorkersStackPush$kotlinx_coroutines_core(this);
            } else if (!C89527ar.f203243a || this.f203429a.mo144253a() == 0) {
                this.workerCtl = -1;
                while (m155692c() && !CoroutineScheduler.this.isTerminated() && this.f203430b != EnumC89680c.TERMINATED) {
                    mo144242a(EnumC89680c.PARKING);
                    Thread.interrupted();
                    if (this.f203433f == 0) {
                        this.f203433f = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
                    }
                    LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
                    if (System.nanoTime() - this.f203433f >= 0) {
                        this.f203433f = 0;
                        synchronized (CoroutineScheduler.this.workers) {
                            if (!CoroutineScheduler.this.isTerminated()) {
                                if (CoroutineScheduler.this.getCreatedWorkers() > CoroutineScheduler.this.corePoolSize) {
                                    if (f203428c.compareAndSet(this, -1, 1)) {
                                        int i = this.indexInArray;
                                        m155686a(0);
                                        CoroutineScheduler.this.parkedWorkersStackTopUpdate$kotlinx_coroutines_core(this, i, 0);
                                        int andDecrement = (int) (CoroutineScheduler.controlState$FU.getAndDecrement(CoroutineScheduler.this) & 2097151);
                                        if (andDecrement != i) {
                                            C89679b bVar = CoroutineScheduler.this.workers.get(andDecrement);
                                            if (bVar == null) {
                                                C89219l.m154707a();
                                            }
                                            C89679b bVar2 = bVar;
                                            CoroutineScheduler.this.workers.set(i, bVar2);
                                            bVar2.m155686a(i);
                                            CoroutineScheduler.this.parkedWorkersStackTopUpdate$kotlinx_coroutines_core(bVar2, andDecrement, i);
                                        }
                                        CoroutineScheduler.this.workers.set(andDecrement, null);
                                        this.f203430b = EnumC89680c.TERMINATED;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        public final void run() {
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f203430b != EnumC89680c.TERMINATED) {
                    AbstractRunnableC89688h a = mo144241a(this.f203431d);
                    if (a != null) {
                        this.f203434g = 0;
                        int c = a.f203454h.mo144247c();
                        this.f203433f = 0;
                        if (this.f203430b == EnumC89680c.PARKING) {
                            if (!C89527ar.f203243a || c == 1) {
                                this.f203430b = EnumC89680c.BLOCKING;
                            } else {
                                throw new AssertionError();
                            }
                        }
                        if (c != 0 && mo144242a(EnumC89680c.BLOCKING)) {
                            CoroutineScheduler.this.signalCpuWork$kotlinx_coroutines_core();
                        }
                        CoroutineScheduler.this.runSafely(a);
                        if (c != 0) {
                            CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, -2097152);
                            EnumC89680c cVar = this.f203430b;
                            if (cVar == EnumC89680c.TERMINATED) {
                                continue;
                            } else if (!C89527ar.f203243a || cVar == EnumC89680c.BLOCKING) {
                                this.f203430b = EnumC89680c.DORMANT;
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        this.f203431d = false;
                        if (this.f203434g == 0) {
                            m155690b();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo144242a(EnumC89680c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f203434g);
                            this.f203434g = 0;
                        }
                    }
                }
            }
            mo144242a(EnumC89680c.TERMINATED);
        }

        /* renamed from: b */
        private int m155688b(int i) {
            int i2 = this.f203435h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f203435h = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        public final boolean mo144242a(EnumC89680c cVar) {
            boolean z;
            EnumC89680c cVar2 = this.f203430b;
            if (cVar2 == EnumC89680c.CPU_ACQUIRED) {
                z = true;
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, 4398046511104L);
            } else {
                z = false;
            }
            if (cVar2 != cVar) {
                this.f203430b = cVar;
            }
            return z;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        private C89679b() {
            setDaemon(true);
            this.f203429a = new C89693m();
            this.f203430b = EnumC89680c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            this.f203435h = AbstractC89255c.Default.nextInt();
        }

        /* renamed from: a */
        private void m155686a(int i) {
            String valueOf;
            StringBuilder append = new StringBuilder().append(CoroutineScheduler.this.schedulerName).append("-worker-");
            if (i == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i);
            }
            setName(append.append(valueOf).toString());
            this.indexInArray = i;
        }

        /* renamed from: b */
        private final AbstractRunnableC89688h m155689b(boolean z) {
            boolean z2;
            AbstractRunnableC89688h d;
            if (z) {
                if (m155688b(CoroutineScheduler.this.corePoolSize * 2) == 0) {
                    z2 = true;
                    AbstractRunnableC89688h d2 = m155693d();
                    if (d2 != null) {
                        return d2;
                    }
                } else {
                    z2 = false;
                }
                AbstractRunnableC89688h b = this.f203429a.mo144258b();
                if (b != null) {
                    return b;
                }
                if (!z2 && (d = m155693d()) != null) {
                    return d;
                }
            } else {
                AbstractRunnableC89688h d3 = m155693d();
                if (d3 != null) {
                    return d3;
                }
            }
            return m155691c(false);
        }

        /* renamed from: c */
        private final AbstractRunnableC89688h m155691c(boolean z) {
            long a;
            if (!C89527ar.f203243a || this.f203429a.mo144253a() == 0) {
                int createdWorkers = CoroutineScheduler.this.getCreatedWorkers();
                if (createdWorkers < 2) {
                    return null;
                }
                int b = m155688b(createdWorkers);
                long j = Long.MAX_VALUE;
                for (int i = 0; i < createdWorkers; i++) {
                    b++;
                    if (b > createdWorkers) {
                        b = 1;
                    }
                    C89679b bVar = CoroutineScheduler.this.workers.get(b);
                    if (!(bVar == null || bVar == this)) {
                        if (!C89527ar.f203243a || this.f203429a.mo144253a() == 0) {
                            if (z) {
                                a = this.f203429a.mo144257b(bVar.f203429a);
                            } else {
                                a = this.f203429a.mo144254a(bVar.f203429a);
                            }
                            if (a == -1) {
                                return this.f203429a.mo144258b();
                            }
                            if (a > 0) {
                                j = Math.min(j, a);
                            }
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                if (j == Long.MAX_VALUE) {
                    j = 0;
                }
                this.f203434g = j;
                return null;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public final AbstractRunnableC89688h mo144241a(boolean z) {
            AbstractRunnableC89688h b;
            if (m155687a()) {
                return m155689b(z);
            }
            if (z && (b = this.f203429a.mo144258b()) != null) {
                return b;
            }
            AbstractRunnableC89688h hVar = (AbstractRunnableC89688h) CoroutineScheduler.this.globalBlockingQueue.mo144199c();
            if (hVar == null) {
                return m155691c(true);
            }
            return hVar;
        }

        public C89679b(CoroutineScheduler coroutineScheduler, int i) {
            this();
            m155686a(i);
        }
    }

    private final int getAvailableCpuPermits() {
        return (int) ((this.controlState & 9223367638808264704L) >> 42);
    }

    private final long incrementBlockingTasks() {
        return controlState$FU.addAndGet(this, 2097152);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$FU.incrementAndGet(this) & 2097151);
    }

    public final void decrementBlockingTasks() {
        controlState$FU.addAndGet(this, -2097152);
    }

    public final int decrementCreatedWorkers() {
        return (int) (controlState$FU.getAndDecrement(this) & 2097151);
    }

    public final long releaseCpuPermit() {
        return controlState$FU.addAndGet(this, 4398046511104L);
    }

    private final C89679b currentWorker() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C89679b)) {
            currentThread = null;
        }
        C89679b bVar = (C89679b) currentThread;
        if (bVar == null || !C89219l.m154714a(CoroutineScheduler.this, this)) {
            return null;
        }
        return bVar;
    }

    private final boolean tryUnpark() {
        C89679b parkedWorkersStackPop;
        do {
            parkedWorkersStackPop = parkedWorkersStackPop();
            if (parkedWorkersStackPop == null) {
                return false;
            }
        } while (!C89679b.f203428c.compareAndSet(parkedWorkersStackPop, -1, 0));
        LockSupport.unpark(parkedWorkersStackPop);
        return true;
    }

    public final void signalCpuWork$kotlinx_coroutines_core() {
        if (!tryUnpark() && !tryCreateWorker$default(this, 0, 1, null)) {
            tryUnpark();
        }
    }

    static {
        Covode.recordClassIndex(105771);
    }

    private final C89679b parkedWorkersStackPop() {
        while (true) {
            long j = this.parkedWorkersStack;
            C89679b bVar = this.workers.get((int) (2097151 & j));
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int parkedWorkersStackNextIndex = parkedWorkersStackNextIndex(bVar);
            if (parkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, ((long) parkedWorkersStackNextIndex) | j2)) {
                bVar.nextParkedWorker = NOT_IN_STACK;
                return bVar;
            }
        }
    }

    public final boolean tryAcquireCpuPermit() {
        long j;
        do {
            j = this.controlState;
            if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                return false;
            }
        } while (!controlState$FU.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int b = C89271h.m154769b(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (b >= this.corePoolSize) {
                return 0;
            }
            if (i >= this.maxPoolSize) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 <= 0 || this.workers.get(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            C89679b bVar = new C89679b(this, i2);
            this.workers.set(i2, bVar);
            if (i2 == ((int) (2097151 & controlState$FU.incrementAndGet(this)))) {
                bVar.start();
                return b + 1;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.workers.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C89679b bVar = this.workers.get(i6);
            if (bVar != null) {
                int a = bVar.f203429a.mo144253a();
                int i7 = C89681a.f203437a[bVar.f203430b.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    arrayList.add(String.valueOf(a) + "b");
                } else if (i7 == 3) {
                    i++;
                    arrayList.add(String.valueOf(a) + "c");
                } else if (i7 == 4) {
                    i4++;
                    if (a > 0) {
                        arrayList.add(String.valueOf(a) + "d");
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.schedulerName + '@' + Integer.toHexString(System.identityHashCode(this)) + '[' + "Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.mo144196a() + ", global blocking queue size = " + this.globalBlockingQueue.mo144196a() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void execute(Runnable runnable) {
        dispatch$default(this, runnable, null, false, 6, null);
    }

    private final boolean addToGlobalQueue(AbstractRunnableC89688h hVar) {
        if (hVar.f203454h.mo144247c() == 1) {
            return this.globalBlockingQueue.mo144197a(hVar);
        }
        return this.globalCpuQueue.mo144197a(hVar);
    }

    private final int parkedWorkersStackNextIndex(C89679b bVar) {
        Object obj = bVar.nextParkedWorker;
        while (obj != NOT_IN_STACK) {
            if (obj == null) {
                return 0;
            }
            C89679b bVar2 = (C89679b) obj;
            int i = bVar2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = bVar2.nextParkedWorker;
        }
        return -1;
    }

    private final void signalBlockingWork(boolean z) {
        long addAndGet = controlState$FU.addAndGet(this, 2097152);
        if (!z && !tryUnpark() && !tryCreateWorker(addAndGet)) {
            tryUnpark();
        }
    }

    public final void runSafely(AbstractRunnableC89688h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private final boolean tryCreateWorker(long j) {
        if (C89271h.m154769b(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int createNewWorker = createNewWorker();
            if (createNewWorker == 1) {
                if (this.corePoolSize > 1) {
                    createNewWorker();
                }
            } else if (createNewWorker > 0) {
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean parkedWorkersStackPush$kotlinx_coroutines_core(C89679b bVar) {
        long j;
        long j2;
        int i;
        if (bVar.nextParkedWorker != NOT_IN_STACK) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            i = bVar.indexInArray;
            if (!C89527ar.f203243a || i != 0) {
                bVar.nextParkedWorker = this.workers.get(i2);
            } else {
                throw new AssertionError();
            }
        } while (!parkedWorkersStack$FU.compareAndSet(this, j, ((long) i) | j2));
        return true;
    }

    public final void shutdown(long j) {
        int i;
        AbstractRunnableC89688h hVar;
        if (_isTerminated$FU.compareAndSet(this, 0, 1)) {
            C89679b currentWorker = currentWorker();
            synchronized (this.workers) {
                i = (int) (this.controlState & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    C89679b bVar = this.workers.get(i2);
                    if (bVar == null) {
                        C89219l.m154707a();
                    }
                    C89679b bVar2 = bVar;
                    if (bVar2 != currentWorker) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(j);
                        }
                        EnumC89680c cVar = bVar2.f203430b;
                        if (!C89527ar.f203243a || cVar == EnumC89680c.TERMINATED) {
                            bVar2.f203429a.mo144256a(this.globalBlockingQueue);
                        } else {
                            throw new AssertionError();
                        }
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.globalBlockingQueue.mo144198b();
            this.globalCpuQueue.mo144198b();
            while (true) {
                if (currentWorker != null) {
                    hVar = currentWorker.mo144241a(true);
                    if (hVar != null) {
                        continue;
                        runSafely(hVar);
                    }
                }
                hVar = (AbstractRunnableC89688h) this.globalCpuQueue.mo144199c();
                if (hVar == null && (hVar = (AbstractRunnableC89688h) this.globalBlockingQueue.mo144199c()) == null) {
                    break;
                }
                runSafely(hVar);
            }
            if (currentWorker != null) {
                currentWorker.mo144242a(EnumC89680c.TERMINATED);
            }
            if (!C89527ar.f203243a || ((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.corePoolSize) {
                this.parkedWorkersStack = 0;
                this.controlState = 0;
                return;
            }
            throw new AssertionError();
        }
    }

    public final AbstractRunnableC89688h createTask$kotlinx_coroutines_core(Runnable runnable, AbstractC89689i iVar) {
        long a = C89691k.f203461f.mo144250a();
        if (!(runnable instanceof AbstractRunnableC89688h)) {
            return new C89690j(runnable, a, iVar);
        }
        AbstractRunnableC89688h hVar = (AbstractRunnableC89688h) runnable;
        hVar.f203453g = a;
        hVar.f203454h = iVar;
        return hVar;
    }

    private final AbstractRunnableC89688h submitToLocalQueue(C89679b bVar, AbstractRunnableC89688h hVar, boolean z) {
        if (bVar == null || bVar.f203430b == EnumC89680c.TERMINATED) {
            return hVar;
        }
        if (hVar.f203454h.mo144247c() == 0 && bVar.f203430b == EnumC89680c.BLOCKING) {
            return hVar;
        }
        bVar.f203431d = true;
        return bVar.f203429a.mo144255a(hVar, z);
    }

    public final void parkedWorkersStackTopUpdate$kotlinx_coroutines_core(C89679b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = parkedWorkersStackNextIndex(bVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && parkedWorkersStack$FU.compareAndSet(this, j, j2 | ((long) i3))) {
                return;
            }
        }
    }

    public final void dispatch(Runnable runnable, AbstractC89689i iVar, boolean z) {
        boolean z2;
        AbstractRunnableC89688h createTask$kotlinx_coroutines_core = createTask$kotlinx_coroutines_core(runnable, iVar);
        C89679b currentWorker = currentWorker();
        AbstractRunnableC89688h submitToLocalQueue = submitToLocalQueue(currentWorker, createTask$kotlinx_coroutines_core, z);
        if (submitToLocalQueue == null || addToGlobalQueue(submitToLocalQueue)) {
            if (!z || currentWorker == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (createTask$kotlinx_coroutines_core.f203454h.mo144247c() != 0) {
                signalBlockingWork(z2);
            } else if (!z2) {
                signalCpuWork$kotlinx_coroutines_core();
            }
        } else {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
    }

    static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coroutineScheduler.controlState;
        }
        return coroutineScheduler.tryCreateWorker(j);
    }

    public CoroutineScheduler(int i, int i2, long j, String str) {
        boolean z;
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i > 0) {
            if (i2 >= i) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
            } else if (i2 > 2097150) {
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            } else if (j > 0) {
                this.globalCpuQueue = new C89684d();
                this.globalBlockingQueue = new C89684d();
                this.parkedWorkersStack = 0;
                this.workers = new AtomicReferenceArray<>(i2 + 1);
                this.controlState = ((long) i) << 42;
                this._isTerminated = 0;
            } else {
                throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
            }
        } else {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, AbstractC89689i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C89687g.f203451a;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.dispatch(runnable, iVar, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, String str, int i3, C89214g gVar) {
        this(i, i2, (i3 & 4) != 0 ? C89691k.f203460e : j, (i3 & 8) != 0 ? "DefaultDispatcher" : str);
    }
}
