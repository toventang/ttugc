package kotlinx.coroutines.flow.p4639a;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.flow.AbstractC89615a;
import kotlinx.coroutines.p4636a.AbstractC89498y;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;

/* renamed from: kotlinx.coroutines.flow.a.b */
public final class C89619b<T> implements AbstractC89615a<T> {

    /* renamed from: a */
    private final AbstractC89498y<T> f203350a;

    static {
        Covode.recordClassIndex(105711);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.a.y<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89619b(AbstractC89498y<? super T> yVar) {
        this.f203350a = yVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractC89615a
    /* renamed from: a */
    public final Object mo144161a(T t, AbstractC89124d<? super C89391z> dVar) {
        Object a = this.f203350a.mo144060a(t, dVar);
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            return a;
        }
        return C89391z.f203057a;
    }
}
