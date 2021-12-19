package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.C89673o;
import kotlinx.coroutines.internal.C89659v;
import p4600h.p4619j.C89271h;

/* renamed from: kotlinx.coroutines.a.d */
public final class C89470d<E> extends AbstractC89467c<E> implements AbstractC89473f<E> {
    public volatile long _head;
    public volatile int _size;
    public volatile long _tail;

    /* renamed from: b */
    public final int f203184b;

    /* renamed from: c */
    private final ReentrantLock f203185c;

    /* renamed from: d */
    private final Object[] f203186d;

    /* renamed from: e */
    private final List<C89471a<E>> f203187e;

    static {
        Covode.recordClassIndex(105559);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: e */
    public final boolean mo144064e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.a.d$a */
    public static final class C89471a<E> extends AbstractC89459a<E> {
        public volatile long _subHead;

        /* renamed from: b */
        private final ReentrantLock f203188b;

        /* renamed from: c */
        private final C89470d<E> f203189c;

        static {
            Covode.recordClassIndex(105560);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89459a
        /* renamed from: a */
        public final boolean mo144041a() {
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89459a
        /* renamed from: b */
        public final boolean mo144044b() {
            if (this._subHead >= this.f203189c._tail) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89467c
        /* renamed from: e */
        public final boolean mo144064e() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89467c
        /* renamed from: f */
        public final boolean mo144065f() {
            throw new IllegalStateException("Should not be used".toString());
        }

        /* renamed from: l */
        private final Object m155351l() {
            long j = this._subHead;
            C89479k<?> h = this.f203189c.mo144067h();
            if (j < this.f203189c._tail) {
                E a = this.f203189c.mo144075a(j);
                C89479k<?> h2 = mo144067h();
                if (h2 != null) {
                    return h2;
                }
                return a;
            } else if (h != null) {
                return h;
            } else {
                C89479k<?> h3 = mo144067h();
                if (h3 == null) {
                    return C89466b.f203176c;
                }
                return h3;
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89459a
        /* renamed from: c */
        public final Object mo144045c() {
            boolean z;
            Object obj;
            ReentrantLock reentrantLock = this.f203188b;
            reentrantLock.lock();
            try {
                Object l = m155351l();
                boolean z2 = true;
                if ((l instanceof C89479k) || l == C89466b.f203176c) {
                    z = false;
                } else {
                    this._subHead++;
                    z = true;
                }
                reentrantLock.unlock();
                if (!(l instanceof C89479k)) {
                    obj = null;
                } else {
                    obj = l;
                }
                C89479k kVar = (C89479k) obj;
                if (kVar != null) {
                    mo144063b_(kVar.f203199a);
                }
                if (!mo144077k()) {
                    z2 = z;
                }
                if (z2) {
                    C89470d.m155343a(this.f203189c, null, 3);
                }
                return l;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r5.f203188b.unlock();
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo144077k() {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p4636a.C89470d.C89471a.mo144077k():boolean");
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.p4636a.AbstractC89459a
        /* renamed from: a */
        public final void mo144040a(boolean z) {
            if (z) {
                C89470d.m155343a(this.f203189c, this, 1);
                ReentrantLock reentrantLock = this.f203188b;
                reentrantLock.lock();
                try {
                    this._subHead = this.f203189c._tail;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: f */
    public final boolean mo144065f() {
        if (this._size >= this.f203184b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m155341a() {
        boolean z = false;
        boolean z2 = false;
        for (C89471a<E> aVar : this.f203187e) {
            if (aVar.mo144077k()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            m155343a(this, null, 3);
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: j */
    public final String mo144069j() {
        return "(buffer:capacity=" + this.f203186d.length + ",size=" + this._size + ')';
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89467c, kotlinx.coroutines.p4636a.AbstractC89498y
    /* renamed from: b_ */
    public final boolean mo144063b_(Throwable th) {
        if (!super.mo144063b_(th)) {
            return false;
        }
        m155341a();
        return true;
    }

    /* renamed from: a */
    public final E mo144075a(long j) {
        return (E) this.f203186d[(int) (j % ((long) this.f203184b))];
    }

    public C89470d(int i) {
        this.f203184b = i;
        if (i > 0) {
            this.f203185c = new ReentrantLock();
            this.f203186d = new Object[i];
            this._head = 0;
            this._tail = 0;
            this._size = 0;
            this.f203187e = new CopyOnWriteArrayList();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.p4636a.AbstractC89467c
    /* renamed from: a */
    public final Object mo144059a(E e) {
        ReentrantLock reentrantLock = this.f203185c;
        reentrantLock.lock();
        try {
            C89479k<?> g = mo144066g();
            if (g != null) {
                return g;
            }
            int i = this._size;
            if (i >= this.f203184b) {
                Object obj = C89466b.f203175b;
                reentrantLock.unlock();
                return obj;
            }
            long j = this._tail;
            this.f203186d[(int) (j % ((long) this.f203184b))] = e;
            this._size = i + 1;
            this._tail = j + 1;
            reentrantLock.unlock();
            m155341a();
            return C89466b.f203174a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    private final void m155342a(C89471a<E> aVar) {
        boolean z;
        AbstractC89497x i;
        C89659v b;
        C89471a<E> aVar2 = aVar;
        while (true) {
            ReentrantLock reentrantLock = this.f203185c;
            reentrantLock.lock();
            if (aVar2 != null) {
                try {
                    this.f203187e.remove(aVar2);
                    if (this._head != aVar2._subHead) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            long j = Long.MAX_VALUE;
            for (C89471a<E> aVar3 : this.f203187e) {
                j = C89271h.m154770b(j, aVar3._subHead);
            }
            long j2 = this._tail;
            long j3 = this._head;
            long b2 = C89271h.m154770b(j, j2);
            if (b2 <= j3) {
                reentrantLock.unlock();
                return;
            }
            int i2 = this._size;
            while (j3 < b2) {
                Object[] objArr = this.f203186d;
                int i3 = this.f203184b;
                objArr[(int) (j3 % ((long) i3))] = null;
                if (i2 >= i3) {
                    z = true;
                } else {
                    z = false;
                }
                j3++;
                this._head = j3;
                i2--;
                this._size = i2;
                if (z) {
                    do {
                        i = mo144068i();
                        if (i != null) {
                            if (!(i instanceof C89479k)) {
                                b = i.mo144073b();
                            } else {
                                continue;
                            }
                        }
                    } while (b == null);
                    if (!C89527ar.f203243a || b == C89673o.f203425a) {
                        this.f203186d[(int) (j2 % ((long) this.f203184b))] = i.mo144071a();
                        this._size = i2 + 1;
                        this._tail = j2 + 1;
                        reentrantLock.unlock();
                        i.mo144074c();
                        m155341a();
                        aVar2 = null;
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            reentrantLock.unlock();
            return;
        }
    }

    @Override // kotlinx.coroutines.p4636a.AbstractC89473f
    /* renamed from: a */
    public final void mo144076a(CancellationException cancellationException) {
        mo144063b_(cancellationException);
        for (C89471a<E> aVar : this.f203187e) {
            aVar.mo144042a((Throwable) cancellationException);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.a.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m155343a(C89470d dVar, C89471a aVar, int i) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        dVar.m155342a(aVar);
    }
}
