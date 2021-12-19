package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.internal.C89658u;
import kotlinx.coroutines.internal.C89663z;
import kotlinx.coroutines.scheduling.AbstractC89689i;
import kotlinx.coroutines.scheduling.AbstractRunnableC89688h;
import p4600h.C89032a;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.bc */
public abstract class AbstractC89543bc<T> extends AbstractRunnableC89688h {

    /* renamed from: f */
    public int f203264f;

    static {
        Covode.recordClassIndex(105634);
    }

    /* renamed from: a */
    public void mo144112a(Object obj, Throwable th) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public <T> T mo144114c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public abstract Object mo144108d();

    /* renamed from: i */
    public abstract AbstractC89124d<T> mo144109i();

    public final void run() {
        Object obj;
        AbstractC89568bz bzVar;
        Object obj2;
        AbstractC89689i iVar = this.f203454h;
        try {
            AbstractC89124d<T> i = mo144109i();
            if (i != null) {
                C89537az azVar = (C89537az) i;
                AbstractC89124d<T> dVar = azVar.f203258e;
                AbstractC89127f context = dVar.getContext();
                Object d = mo144108d();
                Object a = C89663z.m155642a(context, azVar.f203256b);
                try {
                    Throwable d2 = m155476d(d);
                    if (C89544bd.m155485a(this.f203264f)) {
                        bzVar = (AbstractC89568bz) context.get(AbstractC89568bz.f203287c);
                    } else {
                        bzVar = null;
                    }
                    if (d2 != null) {
                        dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(d2)));
                    } else if (bzVar == null || bzVar.mo143993b()) {
                        dVar.resumeWith(C89379q.m157068constructorimpl(mo144114c(d)));
                    } else {
                        Throwable m = bzVar.mo144009m();
                        mo144112a(d, m);
                        if (C89527ar.f203245c && (dVar instanceof AbstractC89111e)) {
                            m = C89658u.m155628a(m, (AbstractC89111e) dVar);
                        }
                        dVar.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(m)));
                    }
                    try {
                        iVar.mo144246b();
                        obj2 = C89379q.m157068constructorimpl(C89391z.f203057a);
                    } catch (Throwable th) {
                        obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    }
                    mo144113a((Throwable) null, C89379q.m157071exceptionOrNullimpl(obj2));
                    return;
                } finally {
                    C89663z.m155643b(context, a);
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } catch (Throwable th2) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
        mo144113a(th, C89379q.m157071exceptionOrNullimpl(obj));
    }

    public AbstractC89543bc(int i) {
        this.f203264f = i;
    }

    /* renamed from: d */
    public static Throwable m155476d(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo144113a(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            C89032a.m154603a(th, th2);
        }
        String str = "Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
        if (th == null) {
            C89219l.m154707a();
        }
        C89511aj.m155443a(mo144109i().getContext(), new C89526aq(str, th));
    }
}
