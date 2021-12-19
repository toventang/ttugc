package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.aa */
public final class C89087aa<T> implements AbstractC89244h<T>, Serializable {

    /* renamed from: a */
    private AbstractC89171a<? extends T> f202800a;

    /* renamed from: b */
    private Object f202801b = C89389x.f203056a;

    static {
        Covode.recordClassIndex(105171);
    }

    private final Object writeReplace() {
        return new C89136d(getValue());
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f202801b != C89389x.f203056a) {
            return true;
        }
        return false;
    }

    @Override // p4600h.AbstractC89244h
    public final T getValue() {
        if (this.f202801b == C89389x.f203056a) {
            AbstractC89171a<? extends T> aVar = this.f202800a;
            if (aVar == null) {
                C89219l.m154715b();
            }
            this.f202801b = aVar.invoke();
            this.f202800a = null;
        }
        return (T) this.f202801b;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public C89087aa(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        this.f202800a = aVar;
    }
}
