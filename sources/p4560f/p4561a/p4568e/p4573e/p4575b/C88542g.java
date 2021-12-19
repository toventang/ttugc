package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4583i.EnumC88894c;

/* renamed from: f.a.e.e.b.g */
public final class C88542g<T> extends AbstractC88924h<T> {

    /* renamed from: b */
    final Callable<? extends Throwable> f200872b;

    static {
        Covode.recordClassIndex(104584);
    }

    public C88542g(Callable<? extends Throwable> callable) {
        this.f200872b = callable;
    }

    @Override // p4560f.p4561a.AbstractC88924h
    /* renamed from: a */
    public final void mo17954a(AbstractC90214c<? super T> cVar) {
        Throwable th;
        try {
            th = (Throwable) C88466b.m153697a(this.f200872b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C88422b.m153670a(th);
        }
        EnumC88894c.error(th, cVar);
    }
}
