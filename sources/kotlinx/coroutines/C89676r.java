package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.r */
public final class C89676r extends AbstractC89580cb<AbstractC89568bz> {

    /* renamed from: a */
    public final C89672n<?> f203427a;

    static {
        Covode.recordClassIndex(105769);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "ChildContinuation[" + this.f203427a + ']';
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* synthetic */ C89391z invoke(Throwable th) {
        mo144029a(th);
        return C89391z.f203057a;
    }

    @Override // kotlinx.coroutines.AbstractC89503ad
    /* renamed from: a */
    public final void mo144029a(Throwable th) {
        C89672n<?> nVar = this.f203427a;
        Throwable a = nVar.mo144027a(this.f203312c);
        if (nVar.f203264f == 0) {
            AbstractC89124d<T> dVar = nVar.f203423a;
            if (!(dVar instanceof C89537az)) {
                dVar = null;
            }
            C89537az azVar = (C89537az) dVar;
            if (azVar != null) {
                while (true) {
                    Object obj = azVar._reusableCancellableContinuation;
                    if (C89219l.m154714a(obj, C89541ba.f203262b)) {
                        if (C89537az.f203254c.compareAndSet(azVar, C89541ba.f203262b, a)) {
                            return;
                        }
                    } else if (!(obj instanceof Throwable)) {
                        if (C89537az.f203254c.compareAndSet(azVar, obj, null)) {
                            break;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        nVar.mo144216b(a);
        nVar.mo144219f();
    }

    public C89676r(AbstractC89568bz bzVar, C89672n<?> nVar) {
        super(bzVar);
        this.f203427a = nVar;
    }
}
