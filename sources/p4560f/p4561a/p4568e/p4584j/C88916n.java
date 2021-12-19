package p4560f.p4561a.p4568e.p4584j;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88475h;
import p4560f.p4561a.p4568e.p4571c.AbstractC88476i;

/* renamed from: f.a.e.j.n */
public final class C88916n {
    static {
        Covode.recordClassIndex(104958);
    }

    /* renamed from: a */
    public static <T, U> void m154121a(AbstractC88475h<T> hVar, AbstractC88986z<? super U> zVar, AbstractC88412b bVar, AbstractC88913k<T, U> kVar) {
        boolean z;
        int i = 1;
        while (!m154122a(kVar.mo143012b(), hVar.isEmpty(), zVar, false, hVar, bVar, kVar)) {
            while (true) {
                boolean b = kVar.mo143012b();
                T poll = hVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!m154122a(b, z, zVar, false, hVar, bVar, kVar)) {
                    if (!z) {
                        kVar.mo143008a(zVar, poll);
                    } else {
                        i = kVar.mo143007a(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static <T, U> boolean m154122a(boolean z, boolean z2, AbstractC88986z<?> zVar, boolean z3, AbstractC88476i<?> iVar, AbstractC88412b bVar, AbstractC88913k<T, U> kVar) {
        if (kVar.mo143010a()) {
            iVar.clear();
            bVar.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable d = kVar.mo143014d();
            if (d != null) {
                iVar.clear();
                if (bVar != null) {
                    bVar.dispose();
                }
                zVar.onError(d);
                return true;
            } else if (!z2) {
                return false;
            } else {
                if (bVar != null) {
                    bVar.dispose();
                }
                zVar.onComplete();
                return true;
            }
        }
    }
}
