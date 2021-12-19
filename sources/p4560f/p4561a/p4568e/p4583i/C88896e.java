package p4560f.p4561a.p4568e.p4583i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.C88902d;

/* renamed from: f.a.e.i.e */
public class C88896e extends AtomicInteger implements AbstractC90215d {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: d */
    AbstractC90215d f201898d;

    /* renamed from: e */
    long f201899e;

    /* renamed from: f */
    final AtomicReference<AbstractC90215d> f201900f = new AtomicReference<>();

    /* renamed from: g */
    final AtomicLong f201901g = new AtomicLong();

    /* renamed from: h */
    final AtomicLong f201902h = new AtomicLong();

    /* renamed from: i */
    final boolean f201903i;

    /* renamed from: j */
    volatile boolean f201904j;

    /* renamed from: k */
    protected boolean f201905k;

    static {
        Covode.recordClassIndex(104938);
    }

    public final boolean isCancelled() {
        return this.f201904j;
    }

    public final boolean isUnbounded() {
        return this.f201905k;
    }

    /* renamed from: a */
    private void m154090a() {
        if (getAndIncrement() == 0) {
            m154091b();
        }
    }

    @Override // org.p4663a.AbstractC90215d
    public void cancel() {
        if (!this.f201904j) {
            this.f201904j = true;
            m154090a();
        }
    }

    /* renamed from: b */
    private void m154091b() {
        int i = 1;
        AbstractC90215d dVar = null;
        long j = 0;
        do {
            AbstractC90215d dVar2 = this.f201900f.get();
            if (dVar2 != null) {
                dVar2 = this.f201900f.getAndSet(null);
            }
            long j2 = this.f201901g.get();
            if (j2 != 0) {
                j2 = this.f201901g.getAndSet(0);
            }
            long j3 = this.f201902h.get();
            if (j3 != 0) {
                j3 = this.f201902h.getAndSet(0);
            }
            AbstractC90215d dVar3 = this.f201898d;
            if (this.f201904j) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.f201898d = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j4 = this.f201899e;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C88902d.m154096a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            EnumC88897f.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.f201899e = j4;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.f201903i) {
                        dVar3.cancel();
                    }
                    this.f201898d = dVar2;
                    if (j4 != 0) {
                        j = C88902d.m154096a(j, j4);
                        dVar = dVar2;
                    }
                } else if (!(dVar3 == null || j2 == 0)) {
                    j = C88902d.m154096a(j, j2);
                    dVar = dVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            dVar.request(j);
        }
    }

    public C88896e(boolean z) {
        this.f201903i = z;
    }

    public final void produced(long j) {
        if (!this.f201905k) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C88902d.m154098a(this.f201902h, j);
                m154090a();
                return;
            }
            long j2 = this.f201899e;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    EnumC88897f.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.f201899e = j3;
            }
            if (decrementAndGet() != 0) {
                m154091b();
            }
        }
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
        if (EnumC88897f.validate(j) && !this.f201905k) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C88902d.m154098a(this.f201901g, j);
                m154090a();
                return;
            }
            long j2 = this.f201899e;
            if (j2 != Long.MAX_VALUE) {
                long a = C88902d.m154096a(j2, j);
                this.f201899e = a;
                if (a == Long.MAX_VALUE) {
                    this.f201905k = true;
                }
            }
            AbstractC90215d dVar = this.f201898d;
            if (decrementAndGet() != 0) {
                m154091b();
            }
            if (dVar != null) {
                dVar.request(j);
            }
        }
    }

    public final void setSubscription(AbstractC90215d dVar) {
        if (this.f201904j) {
            dVar.cancel();
            return;
        }
        C88466b.m153697a((Object) dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC90215d andSet = this.f201900f.getAndSet(dVar);
            if (andSet != null && this.f201903i) {
                andSet.cancel();
            }
            m154090a();
            return;
        }
        AbstractC90215d dVar2 = this.f201898d;
        if (dVar2 != null && this.f201903i) {
            dVar2.cancel();
        }
        this.f201898d = dVar;
        long j = this.f201899e;
        if (decrementAndGet() != 0) {
            m154091b();
        }
        if (j != 0) {
            dVar.request(j);
        }
    }
}
