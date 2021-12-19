package p4560f.p4561a.p4562a.p4563a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4584j.C88906h;

/* renamed from: f.a.a.a.a */
public final class C88391a {

    /* renamed from: a */
    public static volatile AbstractC88434g<Callable<AbstractC88398aa>, AbstractC88398aa> f200658a;

    /* renamed from: b */
    private static volatile AbstractC88434g<AbstractC88398aa, AbstractC88398aa> f200659b;

    static {
        Covode.recordClassIndex(104433);
    }

    /* renamed from: a */
    public static AbstractC88398aa m153580a(AbstractC88398aa aaVar) {
        Objects.requireNonNull(aaVar, "scheduler == null");
        AbstractC88434g<AbstractC88398aa, AbstractC88398aa> gVar = f200659b;
        if (gVar == null) {
            return aaVar;
        }
        return (AbstractC88398aa) m153582a(gVar, aaVar);
    }

    /* renamed from: a */
    public static AbstractC88398aa m153581a(Callable<AbstractC88398aa> callable) {
        try {
            AbstractC88398aa call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }

    /* renamed from: a */
    public static <T, R> R m153582a(AbstractC88434g<T, R> gVar, T t) {
        try {
            return gVar.apply(t);
        } catch (Throwable th) {
            throw C88906h.m154104a(th);
        }
    }
}
