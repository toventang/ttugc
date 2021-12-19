package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C89527ar;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class AbstractC89630c<T> extends AbstractC89655r {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f203367a = AtomicReferenceFieldUpdater.newUpdater(AbstractC89630c.class, Object.class, "_consensus");
    volatile Object _consensus = C89629b.f203365a;

    static {
        Covode.recordClassIndex(105723);
    }

    /* renamed from: a */
    public abstract Object mo144031a();

    /* renamed from: a */
    public abstract void mo144174a(T t, Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC89655r
    /* renamed from: a */
    public final Object mo144173a(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C89629b.f203365a) {
            obj2 = mo144031a();
            if (!C89527ar.f203243a || obj2 != C89629b.f203365a) {
                Object obj3 = this._consensus;
                if (obj3 != C89629b.f203365a) {
                    obj2 = obj3;
                } else if (!f203367a.compareAndSet(this, C89629b.f203365a, obj2)) {
                    obj2 = this._consensus;
                }
            } else {
                throw new AssertionError();
            }
        }
        mo144174a(obj, obj2);
        return obj2;
    }
}
