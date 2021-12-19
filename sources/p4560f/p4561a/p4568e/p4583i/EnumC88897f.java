package p4560f.p4561a.p4568e.p4583i;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4566c.C88425e;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4584j.C88902d;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.i.f */
public enum EnumC88897f implements AbstractC90215d {
    CANCELLED;

    @Override // org.p4663a.AbstractC90215d
    public final void cancel() {
    }

    @Override // org.p4663a.AbstractC90215d
    public final void request(long j) {
    }

    public static void reportSubscriptionSet() {
        C88925a.m154178a(new C88425e("Subscription already set!"));
    }

    static {
        Covode.recordClassIndex(104939);
    }

    public static boolean cancel(AtomicReference<AbstractC90215d> atomicReference) {
        AbstractC90215d andSet;
        AbstractC90215d dVar = atomicReference.get();
        EnumC88897f fVar = CANCELLED;
        if (dVar == fVar || (andSet = atomicReference.getAndSet(fVar)) == fVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void reportMoreProduced(long j) {
        C88925a.m154178a(new C88425e("More produced than requested: ".concat(String.valueOf(j))));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        C88925a.m154178a(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
        return false;
    }

    public static boolean replace(AtomicReference<AbstractC90215d> atomicReference, AbstractC90215d dVar) {
        AbstractC90215d dVar2;
        do {
            dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        return true;
    }

    public static boolean set(AtomicReference<AbstractC90215d> atomicReference, AbstractC90215d dVar) {
        AbstractC90215d dVar2;
        do {
            dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar == null) {
                    return false;
                }
                dVar.cancel();
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        if (dVar2 == null) {
            return true;
        }
        dVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<AbstractC90215d> atomicReference, AbstractC90215d dVar) {
        C88466b.m153697a((Object) dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(AbstractC90215d dVar, AbstractC90215d dVar2) {
        if (dVar2 == null) {
            C88925a.m154178a(new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static boolean setOnce(AtomicReference<AbstractC90215d> atomicReference, AbstractC90215d dVar, long j) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j);
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<AbstractC90215d> atomicReference, AtomicLong atomicLong, AbstractC90215d dVar) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        dVar.request(andSet);
        return true;
    }

    public static void deferredRequest(AtomicReference<AbstractC90215d> atomicReference, AtomicLong atomicLong, long j) {
        AbstractC90215d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
        } else if (validate(j)) {
            C88902d.m154098a(atomicLong, j);
            AbstractC90215d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }
}
