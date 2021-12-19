package p4560f.p4561a.p4568e.p4569a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88425e;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.a.b */
public enum EnumC88441b implements AbstractC88412b {
    DISPOSED;

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        return true;
    }

    public static void reportDisposableSet() {
        C88925a.m154178a(new C88425e("Disposable already set!"));
    }

    static {
        Covode.recordClassIndex(104483);
    }

    public static boolean isDisposed(AbstractC88412b bVar) {
        if (bVar == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean dispose(AtomicReference<AbstractC88412b> atomicReference) {
        AbstractC88412b andSet;
        AbstractC88412b bVar = atomicReference.get();
        EnumC88441b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean replace(AtomicReference<AbstractC88412b> atomicReference, AbstractC88412b bVar) {
        AbstractC88412b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static boolean set(AtomicReference<AbstractC88412b> atomicReference, AbstractC88412b bVar) {
        AbstractC88412b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<AbstractC88412b> atomicReference, AbstractC88412b bVar) {
        C88466b.m153697a((Object) bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<AbstractC88412b> atomicReference, AbstractC88412b bVar) {
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean validate(AbstractC88412b bVar, AbstractC88412b bVar2) {
        if (bVar2 == null) {
            C88925a.m154178a(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }
}
