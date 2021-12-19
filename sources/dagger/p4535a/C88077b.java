package dagger.p4535a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.AbstractC88075a;
import javax.p4631a.AbstractC89405a;

/* renamed from: dagger.a.b */
public final class C88077b<T> implements AbstractC88075a<T>, AbstractC89405a<T> {

    /* renamed from: a */
    static final /* synthetic */ boolean f199986a = true;

    /* renamed from: b */
    private static final Object f199987b = new Object();

    /* renamed from: c */
    private volatile AbstractC89405a<T> f199988c;

    /* renamed from: d */
    private volatile Object f199989d = f199987b;

    static {
        Covode.recordClassIndex(104103);
    }

    @Override // javax.p4631a.AbstractC89405a, dagger.AbstractC88075a
    public final T get() {
        MethodCollector.m26663i(10341);
        T t = (T) this.f199989d;
        Object obj = f199987b;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f199989d;
                    if (t == obj) {
                        t = this.f199988c.get();
                        this.f199989d = m153148a(this.f199989d, t);
                        this.f199988c = null;
                    }
                } finally {
                    MethodCollector.m26664o(10341);
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends AbstractC89405a<T>, T> AbstractC89405a<T> m153149a(P p) {
        C88081f.m153152a(p);
        if (p instanceof C88077b) {
            return p;
        }
        return new C88077b(p);
    }

    private C88077b(AbstractC89405a<T> aVar) {
        if (f199986a || aVar != null) {
            this.f199988c = aVar;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static <P extends AbstractC89405a<T>, T> AbstractC88075a<T> m153150b(P p) {
        if (p instanceof AbstractC88075a) {
            return (AbstractC88075a) p;
        }
        return new C88077b((AbstractC89405a) C88081f.m153152a(p));
    }

    /* renamed from: a */
    public static Object m153148a(Object obj, Object obj2) {
        if (obj == f199987b || (obj instanceof C88080e) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }
}
