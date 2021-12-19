package p4560f.p4561a.p4568e.p4573e.p4575b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4583i.C88895d;
import p4560f.p4561a.p4568e.p4583i.EnumC88894c;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.b.y */
public final class C88581y {
    static {
        Covode.recordClassIndex(104623);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.e.b.y$a */
    public static final class C88582a<T, R> extends AbstractC88924h<R> {

        /* renamed from: b */
        final T f200990b;

        /* renamed from: c */
        final AbstractC88434g<? super T, ? extends AbstractC90213b<? extends R>> f200991c;

        static {
            Covode.recordClassIndex(104624);
        }

        @Override // p4560f.p4561a.AbstractC88924h
        /* renamed from: a */
        public final void mo17954a(AbstractC90214c<? super R> cVar) {
            try {
                AbstractC90213b bVar = (AbstractC90213b) C88466b.m153697a(this.f200991c.apply(this.f200990b), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            EnumC88894c.complete(cVar);
                        } else {
                            cVar.onSubscribe(new C88895d(cVar, call));
                        }
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        EnumC88894c.error(th, cVar);
                    }
                } else {
                    bVar.mo57509a_(cVar);
                }
            } catch (Throwable th2) {
                EnumC88894c.error(th2, cVar);
            }
        }

        C88582a(T t, AbstractC88434g<? super T, ? extends AbstractC90213b<? extends R>> gVar) {
            this.f200990b = t;
            this.f200991c = gVar;
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC88924h<U> m153820a(T t, AbstractC88434g<? super T, ? extends AbstractC90213b<? extends U>> gVar) {
        return C88925a.m154168a(new C88582a(t, gVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m153821a(AbstractC90213b<T> bVar, AbstractC90214c<? super R> cVar, AbstractC88434g<? super T, ? extends AbstractC90213b<? extends R>> gVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) bVar).call();
            if (obj == 0) {
                EnumC88894c.complete(cVar);
                return true;
            }
            try {
                AbstractC90213b bVar2 = (AbstractC90213b) C88466b.m153697a(gVar.apply(obj), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar2).call();
                        if (call == null) {
                            EnumC88894c.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new C88895d(cVar, call));
                    } catch (Throwable th) {
                        C88422b.m153670a(th);
                        EnumC88894c.error(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.mo57509a_(cVar);
                }
                return true;
            } catch (Throwable th2) {
                C88422b.m153670a(th2);
                EnumC88894c.error(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            C88422b.m153670a(th3);
            EnumC88894c.error(th3, cVar);
            return true;
        }
    }
}
