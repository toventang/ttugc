package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.m */
public class C89648m<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f203389a = AtomicReferenceFieldUpdater.newUpdater(C89648m.class, Object.class, "_cur");
    private volatile Object _cur = new C89649n(8, false);

    static {
        Covode.recordClassIndex(105741);
    }

    /* renamed from: a */
    public final int mo144196a() {
        long j = ((C89649n) this._cur)._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: b */
    public final void mo144198b() {
        while (true) {
            C89649n nVar = (C89649n) this._cur;
            if (!nVar.mo144202b()) {
                f203389a.compareAndSet(this, nVar, nVar.mo144204d());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final E mo144199c() {
        while (true) {
            C89649n nVar = (C89649n) this._cur;
            E e = (E) nVar.mo144203c();
            if (e != C89649n.f203390a) {
                return e;
            }
            f203389a.compareAndSet(this, nVar, nVar.mo144204d());
        }
    }

    /* renamed from: a */
    public final boolean mo144197a(E e) {
        while (true) {
            C89649n nVar = (C89649n) this._cur;
            int a = nVar.mo144200a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f203389a.compareAndSet(this, nVar, nVar.mo144204d());
            } else if (a == 2) {
                return false;
            }
        }
    }
}
