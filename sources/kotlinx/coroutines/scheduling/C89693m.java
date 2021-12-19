package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C89527ar;

/* renamed from: kotlinx.coroutines.scheduling.m */
public final class C89693m {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f203462b = AtomicReferenceFieldUpdater.newUpdater(C89693m.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f203463c = AtomicIntegerFieldUpdater.newUpdater(C89693m.class, "producerIndex");

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f203464d = AtomicIntegerFieldUpdater.newUpdater(C89693m.class, "consumerIndex");

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f203465e = AtomicIntegerFieldUpdater.newUpdater(C89693m.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<AbstractRunnableC89688h> f203466a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    static {
        Covode.recordClassIndex(105787);
    }

    /* renamed from: c */
    private int m155712c() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: a */
    public final int mo144253a() {
        if (this.lastScheduledTask != null) {
            return m155712c() + 1;
        }
        return m155712c();
    }

    /* renamed from: b */
    public final AbstractRunnableC89688h mo144258b() {
        AbstractRunnableC89688h hVar = (AbstractRunnableC89688h) f203462b.getAndSet(this, null);
        if (hVar == null) {
            return m155713d();
        }
        return hVar;
    }

    /* renamed from: d */
    private final AbstractRunnableC89688h m155713d() {
        AbstractRunnableC89688h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f203464d.compareAndSet(this, i, i + 1) && (andSet = this.f203466a.getAndSet(i2, null)) != null) {
                m155711b(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: b */
    private final void m155711b(AbstractRunnableC89688h hVar) {
        if (hVar != null && hVar.f203454h.mo144247c() == 1) {
            int decrementAndGet = f203465e.decrementAndGet(this);
            if (C89527ar.f203243a && decrementAndGet < 0) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private final AbstractRunnableC89688h m155709a(AbstractRunnableC89688h hVar) {
        if (hVar.f203454h.mo144247c() == 1) {
            f203465e.incrementAndGet(this);
        }
        if (m155712c() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f203466a.get(i) != null) {
            Thread.yield();
        }
        this.f203466a.lazySet(i, hVar);
        f203463c.incrementAndGet(this);
        return null;
    }

    /* renamed from: b */
    public final long mo144257b(C89693m mVar) {
        if (!C89527ar.f203243a || m155712c() == 0) {
            int i = mVar.producerIndex;
            AtomicReferenceArray<AbstractRunnableC89688h> atomicReferenceArray = mVar.f203466a;
            for (int i2 = mVar.consumerIndex; i2 != i; i2++) {
                int i3 = i2 & 127;
                if (mVar.blockingTasksInBuffer == 0) {
                    break;
                }
                AbstractRunnableC89688h hVar = atomicReferenceArray.get(i3);
                if (hVar != null && hVar.f203454h.mo144247c() == 1 && atomicReferenceArray.compareAndSet(i3, hVar, null)) {
                    f203465e.decrementAndGet(mVar);
                    mo144255a((C89693m) hVar, (AbstractRunnableC89688h) false);
                    return -1;
                }
            }
            return m155708a(mVar, true);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final long mo144254a(C89693m mVar) {
        if (!C89527ar.f203243a || m155712c() == 0) {
            AbstractRunnableC89688h d = mVar.m155713d();
            if (d == null) {
                return m155708a(mVar, false);
            }
            AbstractRunnableC89688h a = mo144255a((C89693m) d, (AbstractRunnableC89688h) false);
            if (!C89527ar.f203243a || a == null) {
                return -1;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo144256a(C89684d dVar) {
        Object andSet = f203462b.getAndSet(this, null);
        if (andSet != null) {
            dVar.mo144197a(andSet);
        }
        while (true) {
            AbstractRunnableC89688h d = m155713d();
            if (d != null) {
                dVar.mo144197a(d);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final AbstractRunnableC89688h mo144255a(AbstractRunnableC89688h hVar, boolean z) {
        if (z) {
            return m155709a(hVar);
        }
        AbstractRunnableC89688h hVar2 = (AbstractRunnableC89688h) f203462b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m155709a(hVar2);
    }

    /* renamed from: a */
    private final long m155708a(C89693m mVar, boolean z) {
        AbstractRunnableC89688h hVar;
        do {
            hVar = (AbstractRunnableC89688h) mVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z && hVar.f203454h.mo144247c() != 1) {
                return -2;
            }
            long a = C89691k.f203461f.mo144250a() - hVar.f203453g;
            if (a < C89691k.f203456a) {
                return C89691k.f203456a - a;
            }
        } while (!f203462b.compareAndSet(mVar, hVar, null));
        mo144255a(hVar, false);
        return -1;
    }
}
