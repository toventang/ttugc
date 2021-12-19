package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C89657t;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.bb */
public final class C89542bb<T> extends C89657t<T> {

    /* renamed from: b */
    static final AtomicIntegerFieldUpdater f203263b = AtomicIntegerFieldUpdater.newUpdater(C89542bb.class, "_decision");
    volatile int _decision;

    static {
        Covode.recordClassIndex(105633);
    }

    /* renamed from: j */
    private final boolean m155473j() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f203263b.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C89657t, kotlinx.coroutines.JobSupport
    /* renamed from: c */
    public final void mo143995c(Object obj) {
        mo144034b(obj);
    }

    @Override // kotlinx.coroutines.internal.C89657t, kotlinx.coroutines.AbstractC89458a
    /* renamed from: b */
    public final void mo144034b(Object obj) {
        if (!m155473j()) {
            C89541ba.m155472a(C89099b.m154605a(this.f203406e), C89500aa.m155438a(obj, this.f203406e));
        }
    }

    public C89542bb(AbstractC89127f fVar, AbstractC89124d<? super T> dVar) {
        super(fVar, dVar);
    }
}
