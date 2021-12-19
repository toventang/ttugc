package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.s */
final class C89383s<T> implements AbstractC89244h<T>, Serializable {

    /* renamed from: a */
    public static final C89384a f203045a = new C89384a((byte) 0);

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater<C89383s<?>, Object> f203046e = AtomicReferenceFieldUpdater.newUpdater(C89383s.class, Object.class, "c");

    /* renamed from: b */
    private volatile AbstractC89171a<? extends T> f203047b;

    /* renamed from: c */
    private volatile Object f203048c = C89389x.f203056a;

    /* renamed from: d */
    private final Object f203049d = C89389x.f203056a;

    /* renamed from: h.s$a */
    public static final class C89384a {
        static {
            Covode.recordClassIndex(105468);
        }

        private C89384a() {
        }

        public /* synthetic */ C89384a(byte b) {
            this();
        }
    }

    private final Object writeReplace() {
        return new C89136d(getValue());
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        if (this.f203048c != C89389x.f203056a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(105467);
    }

    @Override // p4600h.AbstractC89244h
    public final T getValue() {
        T t = (T) this.f203048c;
        if (t != C89389x.f203056a) {
            return t;
        }
        AbstractC89171a<? extends T> aVar = this.f203047b;
        if (aVar != null) {
            T t2 = (T) aVar.invoke();
            if (f203046e.compareAndSet(this, C89389x.f203056a, t2)) {
                this.f203047b = null;
                return t2;
            }
        }
        return (T) this.f203048c;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public C89383s(AbstractC89171a<? extends T> aVar) {
        C89219l.m154721d(aVar, "");
        this.f203047b = aVar;
    }
}
