package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89458a;
import kotlinx.coroutines.C89500aa;
import kotlinx.coroutines.C89541ba;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;

/* renamed from: kotlinx.coroutines.internal.t */
public class C89657t<T> extends AbstractC89458a<T> implements AbstractC89111e {

    /* renamed from: e */
    public final AbstractC89124d<T> f203406e;

    static {
        Covode.recordClassIndex(105750);
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: i */
    public final boolean mo144006i() {
        return true;
    }

    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89111e
    public final AbstractC89111e getCallerFrame() {
        return (AbstractC89111e) this.f203406e;
    }

    @Override // kotlinx.coroutines.AbstractC89458a
    /* renamed from: b */
    public void mo144034b(Object obj) {
        AbstractC89124d<T> dVar = this.f203406e;
        dVar.resumeWith(C89500aa.m155438a(obj, dVar));
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: c */
    public void mo143995c(Object obj) {
        C89541ba.m155472a(C89099b.m154605a(this.f203406e), C89500aa.m155438a(obj, this.f203406e));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89657t(AbstractC89127f fVar, AbstractC89124d<? super T> dVar) {
        super(fVar, true);
        this.f203406e = dVar;
    }
}
