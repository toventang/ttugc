package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.t */
final class C89385t<T> implements AbstractC89244h<T>, Serializable {

    /* renamed from: a */
    private AbstractC89171a<? extends T> f203050a;

    /* renamed from: b */
    private volatile Object f203051b;

    /* renamed from: c */
    private final Object f203052c;

    static {
        Covode.recordClassIndex(105469);
    }

    private final Object writeReplace() {
        return new C89136d(getValue());
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f203051b != C89389x.f203056a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    @Override // p4600h.AbstractC89244h
    public final T getValue() {
        T t;
        T t2 = (T) this.f203051b;
        if (t2 != C89389x.f203056a) {
            return t2;
        }
        synchronized (this.f203052c) {
            t = (T) this.f203051b;
            if (t == C89389x.f203056a) {
                AbstractC89171a<? extends T> aVar = this.f203050a;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                t = (T) aVar.invoke();
                this.f203051b = t;
                this.f203050a = null;
            }
        }
        return t;
    }

    private C89385t(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        this.f203050a = aVar;
        this.f203051b = C89389x.f203056a;
        this.f203052c = this;
    }

    public /* synthetic */ C89385t(AbstractC89171a aVar, byte b) {
        this(aVar);
    }
}
