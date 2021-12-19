package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: kotlinx.coroutines.p */
public final class C89674p {
    static {
        Covode.recordClassIndex(105767);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.concurrent.atomic.AtomicReferenceFieldUpdater */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> C89672n<T> m155681a(AbstractC89124d<? super T> dVar) {
        if (!(dVar instanceof C89537az)) {
            return new C89672n<>(dVar, 0);
        }
        C89537az azVar = (C89537az) dVar;
        while (true) {
            Object obj = azVar._reusableCancellableContinuation;
            if (obj == null) {
                azVar._reusableCancellableContinuation = C89541ba.f203262b;
                break;
            } else if (!(obj instanceof C89672n)) {
                throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
            } else if (C89537az.f203254c.compareAndSet(azVar, obj, C89541ba.f203262b)) {
                C89672n<T> nVar = (C89672n) obj;
                if (nVar != null) {
                    if (!C89527ar.f203243a || nVar._parentHandle != C89589ck.f203322a) {
                        Object obj2 = nVar._state;
                        if (C89527ar.f203243a && !(!(obj2 instanceof AbstractC89590cl))) {
                            throw new AssertionError();
                        } else if (obj2 instanceof C89501ab) {
                            nVar.mo144220g();
                        } else {
                            nVar._decision = 0;
                            nVar._state = C89538b.f203260a;
                            return nVar;
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
        return new C89672n<>(dVar, 0);
    }

    /* renamed from: a */
    public static final void m155682a(AbstractC89671m<?> mVar, AbstractC89548bh bhVar) {
        mVar.mo144211a((AbstractC89172b<? super Throwable, C89391z>) new C89549bi(bhVar));
    }
}
