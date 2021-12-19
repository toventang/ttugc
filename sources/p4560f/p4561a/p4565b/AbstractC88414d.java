package p4560f.p4561a.p4565b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4568e.p4570b.C88466b;

/* renamed from: f.a.b.d */
public abstract class AbstractC88414d<T> extends AtomicReference<T> implements AbstractC88412b {
    private static final long serialVersionUID = 6537757548749041217L;

    static {
        Covode.recordClassIndex(104456);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo142948a(T t);

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.b.d<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            mo142948a(andSet);
        }
    }

    AbstractC88414d(T t) {
        super(C88466b.m153697a((Object) t, "value is null"));
    }
}
