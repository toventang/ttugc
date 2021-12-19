package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC89534ax;
import kotlinx.coroutines.internal.AbstractC89627ab;
import kotlinx.coroutines.internal.C89626aa;
import kotlinx.coroutines.internal.C89649n;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

public abstract class EventLoopImplBase extends AbstractC89553bm implements AbstractC89534ax {
    private static final AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed");
    private static final AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue");
    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;

    static {
        Covode.recordClassIndex(105537);
    }

    /* renamed from: kotlinx.coroutines.EventLoopImplBase$c */
    public static abstract class AbstractRunnableC89453c implements Comparable<AbstractRunnableC89453c>, Runnable, AbstractC89548bh, AbstractC89627ab {

        /* renamed from: a */
        private Object f203150a;

        /* renamed from: b */
        public long f203151b;

        /* renamed from: c */
        private int f203152c = -1;

        static {
            Covode.recordClassIndex(105540);
        }

        @Override // kotlinx.coroutines.internal.AbstractC89627ab
        /* renamed from: c */
        public final int mo143979c() {
            return this.f203152c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC89627ab
        /* renamed from: b */
        public final C89626aa<?> mo143978b() {
            Object obj = this.f203150a;
            if (!(obj instanceof C89626aa)) {
                obj = null;
            }
            return (C89626aa) obj;
        }

        @Override // kotlinx.coroutines.AbstractC89548bh
        public final synchronized void cQ_() {
            Object obj = this.f203150a;
            if (obj != C89555bo.f203274a) {
                if (!(obj instanceof C89454d)) {
                    obj = null;
                }
                C89454d dVar = (C89454d) obj;
                if (dVar != null) {
                    dVar.mo144168a(this);
                }
                this.f203150a = C89555bo.f203274a;
            }
        }

        public String toString() {
            return "Delayed[nanos=" + this.f203151b + ']';
        }

        @Override // kotlinx.coroutines.internal.AbstractC89627ab
        /* renamed from: a */
        public final void mo143976a(int i) {
            this.f203152c = i;
        }

        public AbstractRunnableC89453c(long j) {
            this.f203151b = j;
        }

        @Override // kotlinx.coroutines.internal.AbstractC89627ab
        /* renamed from: a */
        public final void mo143977a(C89626aa<?> aaVar) {
            if (this.f203150a != C89555bo.f203274a) {
                this.f203150a = aaVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(AbstractRunnableC89453c cVar) {
            long j = this.f203151b - cVar.f203151b;
            if (j > 0) {
                return 1;
            }
            if (j < 0) {
                return -1;
            }
            return 0;
        }

        /* renamed from: a */
        public final synchronized int mo143975a(long j, C89454d dVar, EventLoopImplBase eventLoopImplBase) {
            if (this.f203150a == C89555bo.f203274a) {
                return 2;
            }
            synchronized (dVar) {
                AbstractRunnableC89453c cVar = (AbstractRunnableC89453c) dVar.mo144172d();
                if (eventLoopImplBase.isCompleted()) {
                    return 1;
                }
                if (cVar == null) {
                    dVar.f203153a = j;
                } else {
                    long j2 = cVar.f203151b;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.f203153a > 0) {
                        dVar.f203153a = j;
                    }
                }
                if (this.f203151b - dVar.f203153a < 0) {
                    this.f203151b = dVar.f203153a;
                }
                if (!C89527ar.f203243a || mo143978b() == null) {
                    mo143977a(dVar);
                    T[] tArr = dVar.f203361b;
                    if (tArr == null) {
                        tArr = (T[]) new AbstractC89627ab[4];
                        dVar.f203361b = tArr;
                    } else if (dVar._size >= tArr.length) {
                        Object[] copyOf = Arrays.copyOf(tArr, dVar._size * 2);
                        C89219l.m154709a((Object) copyOf, "");
                        dVar.f203361b = (T[]) ((AbstractC89627ab[]) copyOf);
                        tArr = (T[]) ((AbstractC89627ab[]) copyOf);
                    }
                    int i = dVar._size;
                    dVar._size = i + 1;
                    tArr[i] = this;
                    mo143976a(i);
                    dVar.mo144170b(i);
                    return 0;
                }
                throw new AssertionError();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isCompleted() {
        /*
            r1 = this;
            int r0 = r1._isCompleted
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.EventLoopImplBase.isCompleted():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.EventLoopImplBase$b */
    public static final class C89452b extends AbstractRunnableC89453c {

        /* renamed from: a */
        private final Runnable f203149a;

        static {
            Covode.recordClassIndex(105539);
        }

        public final void run() {
            this.f203149a.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.AbstractRunnableC89453c
        public final String toString() {
            return super.toString() + this.f203149a.toString();
        }

        public C89452b(long j, Runnable runnable) {
            super(j);
            this.f203149a = runnable;
        }
    }

    /* access modifiers changed from: protected */
    public final void resetAll() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: kotlinx.coroutines.EventLoopImplBase$a */
    final class C89451a extends AbstractRunnableC89453c {

        /* renamed from: c */
        private final AbstractC89671m<C89391z> f203148c;

        static {
            Covode.recordClassIndex(105538);
        }

        public final void run() {
            this.f203148c.mo144212a(EventLoopImplBase.this, C89391z.f203057a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.AbstractRunnableC89453c
        public final String toString() {
            return super.toString() + this.f203148c.toString();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.m<? super h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C89451a(long j, AbstractC89671m<? super C89391z> mVar) {
            super(j);
            this.f203148c = mVar;
        }
    }

    private final void rescheduleAllDelayed() {
        long j;
        AbstractRunnableC89453c cVar;
        AbstractC89602cx cxVar = C89603cy.f203330a;
        if (cxVar != null) {
            j = cxVar.mo144151a();
        } else {
            j = System.nanoTime();
        }
        while (true) {
            C89626aa aaVar = (C89626aa) this._delayed;
            if (aaVar != null && (cVar = (AbstractRunnableC89453c) aaVar.mo144171c()) != null) {
                reschedule(j, cVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC89552bl
    public void shutdown() {
        C89601cw.f203328a.set(null);
        setCompleted(true);
        closeQueue();
        do {
        } while (processNextEvent() <= 0);
        rescheduleAllDelayed();
    }

    private final Runnable dequeue() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C89649n) {
                C89649n nVar = (C89649n) obj;
                Object c = nVar.mo144203c();
                if (c != C89649n.f203390a) {
                    return (Runnable) c;
                }
                _queue$FU.compareAndSet(this, obj, nVar.mo144204d());
            } else if (obj == C89555bo.f203275b) {
                return null;
            } else {
                if (_queue$FU.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC89552bl
    public boolean isEmpty() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        C89626aa aaVar = (C89626aa) this._delayed;
        if (aaVar != null && !aaVar.mo144167a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C89649n) {
            return ((C89649n) obj).mo144201a();
        }
        if (obj == C89555bo.f203275b) {
            return true;
        }
        return false;
    }

    private final void closeQueue() {
        if (!C89527ar.f203243a || isCompleted()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (_queue$FU.compareAndSet(this, null, C89555bo.f203275b)) {
                        return;
                    }
                } else if (obj instanceof C89649n) {
                    ((C89649n) obj).mo144202b();
                    return;
                } else if (obj != C89555bo.f203275b) {
                    C89649n nVar = new C89649n(8, true);
                    nVar.mo144200a(obj);
                    if (_queue$FU.compareAndSet(this, obj, nVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC89552bl
    public long getNextTime() {
        AbstractRunnableC89453c cVar;
        long nanoTime;
        if (super.getNextTime() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C89649n) {
                if (!((C89649n) obj).mo144201a()) {
                    return 0;
                }
            } else if (obj == C89555bo.f203275b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C89626aa aaVar = (C89626aa) this._delayed;
        if (aaVar == null || (cVar = (AbstractRunnableC89453c) aaVar.mo144169b()) == null) {
            return Long.MAX_VALUE;
        }
        long j = cVar.f203151b;
        AbstractC89602cx cxVar = C89603cy.f203330a;
        if (cxVar != null) {
            nanoTime = cxVar.mo144151a();
        } else {
            nanoTime = System.nanoTime();
        }
        return C89271h.m154764a(j - nanoTime, 0L);
    }

    @Override // kotlinx.coroutines.AbstractC89552bl
    public long processNextEvent() {
        long j;
        if (processUnconfinedEvent()) {
            return getNextTime();
        }
        C89454d dVar = (C89454d) this._delayed;
        if (dVar != null && !dVar.mo144167a()) {
            AbstractC89602cx cxVar = C89603cy.f203330a;
            if (cxVar != null) {
                j = cxVar.mo144151a();
            } else {
                j = System.nanoTime();
            }
            while (true) {
                synchronized (dVar) {
                    AbstractC89627ab d = dVar.mo144172d();
                    AbstractC89627ab abVar = null;
                    if (d != null) {
                        AbstractRunnableC89453c cVar = (AbstractRunnableC89453c) d;
                        if (j - cVar.f203151b >= 0 && enqueueImpl(cVar)) {
                            abVar = dVar.mo144166a(0);
                        }
                        if (abVar == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Runnable dequeue = dequeue();
        if (dequeue != null) {
            dequeue.run();
        }
        return getNextTime();
    }

    public final void setCompleted(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: kotlinx.coroutines.EventLoopImplBase$d */
    public static final class C89454d extends C89626aa<AbstractRunnableC89453c> {

        /* renamed from: a */
        public long f203153a;

        static {
            Covode.recordClassIndex(105541);
        }

        public C89454d(long j) {
            this.f203153a = j;
        }
    }

    public final void enqueue(Runnable runnable) {
        EventLoopImplBase eventLoopImplBase = this;
        while (!eventLoopImplBase.enqueueImpl(runnable)) {
            eventLoopImplBase = RunnableC89529at.f203247a;
        }
        eventLoopImplBase.unpark();
    }

    private final boolean shouldUnpark(AbstractRunnableC89453c cVar) {
        AbstractC89627ab abVar;
        C89626aa aaVar = (C89626aa) this._delayed;
        if (aaVar != null) {
            abVar = aaVar.mo144169b();
        } else {
            abVar = null;
        }
        if (abVar == cVar) {
            return true;
        }
        return false;
    }

    private final boolean enqueueImpl(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (_queue$FU.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C89649n) {
                C89649n nVar = (C89649n) obj;
                int a = nVar.mo144200a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    _queue$FU.compareAndSet(this, obj, nVar.mo144204d());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C89555bo.f203275b) {
                return false;
            } else {
                C89649n nVar2 = new C89649n(8, true);
                nVar2.mo144200a(obj);
                nVar2.mo144200a(runnable);
                if (_queue$FU.compareAndSet(this, obj, nVar2)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC89507ah
    public final void dispatch(AbstractC89127f fVar, Runnable runnable) {
        enqueue(runnable);
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public AbstractC89548bh invokeOnTimeout(long j, Runnable runnable) {
        return AbstractC89534ax.C89535a.m155463a(j, runnable);
    }

    private final int scheduleImpl(long j, AbstractRunnableC89453c cVar) {
        if (isCompleted()) {
            return 1;
        }
        C89454d dVar = (C89454d) this._delayed;
        if (dVar == null) {
            _delayed$FU.compareAndSet(this, null, new C89454d(j));
            Object obj = this._delayed;
            if (obj == null) {
                C89219l.m154707a();
            }
            dVar = (C89454d) obj;
        }
        return cVar.mo143975a(j, dVar, this);
    }

    public Object delay(long j, AbstractC89124d<? super C89391z> dVar) {
        if (j <= 0) {
            return C89391z.f203057a;
        }
        C89672n nVar = new C89672n(C89099b.m154605a(dVar), 1);
        scheduleResumeAfterDelay(j, nVar);
        Object e = nVar.mo144218e();
        if (e == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return e;
    }

    public final void schedule(long j, AbstractRunnableC89453c cVar) {
        int scheduleImpl = scheduleImpl(j, cVar);
        if (scheduleImpl != 0) {
            if (scheduleImpl == 1) {
                reschedule(j, cVar);
            } else if (scheduleImpl != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (shouldUnpark(cVar)) {
            unpark();
        }
    }

    /* access modifiers changed from: protected */
    public final AbstractC89548bh scheduleInvokeOnTimeout(long j, Runnable runnable) {
        long nanoTime;
        long a = C89555bo.m155490a(j);
        if (a >= 4611686018427387903L) {
            return C89589ck.f203322a;
        }
        AbstractC89602cx cxVar = C89603cy.f203330a;
        if (cxVar != null) {
            nanoTime = cxVar.mo144151a();
        } else {
            nanoTime = System.nanoTime();
        }
        C89452b bVar = new C89452b(a + nanoTime, runnable);
        schedule(nanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.AbstractC89534ax
    public void scheduleResumeAfterDelay(long j, AbstractC89671m<? super C89391z> mVar) {
        long nanoTime;
        long a = C89555bo.m155490a(j);
        if (a < 4611686018427387903L) {
            AbstractC89602cx cxVar = C89603cy.f203330a;
            if (cxVar != null) {
                nanoTime = cxVar.mo144151a();
            } else {
                nanoTime = System.nanoTime();
            }
            C89451a aVar = new C89451a(a + nanoTime, mVar);
            C89674p.m155682a(mVar, aVar);
            schedule(nanoTime, aVar);
        }
    }
}
