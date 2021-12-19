package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88469b;
import p4560f.p4561a.p4568e.p4572d.C88483g;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88586b;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88587c;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88589d;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88591e;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88594g;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88598i;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88600j;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88604l;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88606m;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88607n;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88609o;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88611p;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88613q;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88615r;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88617s;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88626v;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88630w;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88632x;
import p4560f.p4561a.p4568e.p4573e.p4576c.CallableC88603k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.n */
public abstract class AbstractC88973n<T> implements AbstractC88977r<T> {
    static {
        Covode.recordClassIndex(105015);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo143019b(AbstractC88975p<? super T> pVar);

    /* renamed from: a */
    public final AbstractC88973n<T> mo143236a(AbstractC88433f<? super T> fVar) {
        C88466b.m153697a((Object) fVar, "doAfterSuccess is null");
        return C88925a.m154169a(new C88589d(this, fVar));
    }

    /* renamed from: a */
    public final AbstractC88973n<T> mo143235a(AbstractC88428a aVar) {
        C88466b.m153697a((Object) aVar, "onFinally is null");
        return C88925a.m154169a(new C88591e(this, aVar));
    }

    /* renamed from: a */
    public final AbstractC88973n<T> mo143238a(AbstractC88438k<? super T> kVar) {
        C88466b.m153697a((Object) kVar, "predicate is null");
        return C88925a.m154169a(new C88594g(this, kVar));
    }

    /* renamed from: a */
    public final <R> AbstractC88973n<R> mo143237a(AbstractC88434g<? super T, ? extends AbstractC88977r<? extends R>> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154169a(new C88600j(this, gVar));
    }

    @Override // p4560f.p4561a.AbstractC88977r
    /* renamed from: a */
    public final void mo143239a(AbstractC88975p<? super T> pVar) {
        C88466b.m153697a((Object) pVar, "observer is null");
        AbstractC88975p<? super T> a = C88925a.m154170a(this, pVar);
        C88466b.m153697a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo143019b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C88422b.m153670a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final AbstractC88412b mo143246c() {
        return mo143232a(C88446a.f200698d, C88446a.f200700f, C88446a.f200697c);
    }

    public final T cL_() {
        C88483g gVar = new C88483g();
        mo143239a((AbstractC88975p) gVar);
        return (T) gVar.mo142989a();
    }

    /* renamed from: d */
    private AbstractC88924h<T> m154249d() {
        if (this instanceof AbstractC88469b) {
            return ((AbstractC88469b) this).mo142982a();
        }
        return C88925a.m154168a(new C88632x(this));
    }

    /* renamed from: b */
    public final AbstractC88410b mo143240b() {
        return C88925a.m154165a(new C88604l(this));
    }

    /* renamed from: c */
    private <E extends AbstractC88975p<? super T>> E m154248c(E e) {
        mo143239a((AbstractC88975p) e);
        return e;
    }

    /* renamed from: a */
    public static <T> AbstractC88973n<T> m154243a(AbstractC88976q<T> qVar) {
        C88466b.m153697a((Object) qVar, "onSubscribe is null");
        return C88925a.m154169a(new C88587c(qVar));
    }

    /* renamed from: d */
    public final AbstractC88973n<T> mo143252d(AbstractC88434g<? super Throwable, ? extends T> gVar) {
        C88466b.m153697a((Object) gVar, "valueSupplier is null");
        return C88925a.m154169a(new C88613q(this, gVar));
    }

    /* renamed from: e */
    public final AbstractC88412b mo143253e(AbstractC88433f<? super T> fVar) {
        return mo143232a(fVar, C88446a.f200700f, C88446a.f200697c);
    }

    /* renamed from: c */
    public final AbstractC88973n<T> mo143247c(AbstractC88433f<? super AbstractC88412b> fVar) {
        AbstractC88433f<Object> fVar2 = C88446a.f200698d;
        AbstractC88428a aVar = C88446a.f200697c;
        return C88925a.m154169a(new C88615r(this, (AbstractC88433f) C88466b.m153697a((Object) fVar, "onSubscribe is null"), fVar2, fVar2, aVar, aVar, C88446a.f200697c));
    }

    /* renamed from: a */
    private <U> AbstractC88973n<T> m154244a(AbstractC88977r<U> rVar) {
        C88466b.m153697a((Object) rVar, "timeoutIndicator is null");
        return C88925a.m154169a(new C88626v(this, rVar));
    }

    /* renamed from: b */
    public final AbstractC88410b mo143241b(AbstractC88434g<? super T, ? extends AbstractC88917f> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154165a(new C88598i(this, gVar));
    }

    /* renamed from: c */
    public final <R> AbstractC88973n<R> mo143248c(AbstractC88434g<? super T, ? extends R> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154169a(new C88607n(this, gVar));
    }

    /* renamed from: d */
    public final AbstractC88973n<T> mo143251d(AbstractC88433f<? super T> fVar) {
        AbstractC88433f<Object> fVar2 = C88446a.f200698d;
        AbstractC88428a aVar = C88446a.f200697c;
        return C88925a.m154169a(new C88615r(this, C88446a.f200698d, (AbstractC88433f) C88466b.m153697a((Object) fVar, "onSubscribe is null"), fVar2, aVar, aVar, C88446a.f200697c));
    }

    /* renamed from: a */
    public static <T> AbstractC88973n<T> m154245a(T t) {
        C88466b.m153697a((Object) t, "item is null");
        return C88925a.m154169a((AbstractC88973n) new C88606m(t));
    }

    /* renamed from: b */
    public final AbstractC88973n<T> mo143242b(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154169a(new C88617s(this, aaVar));
    }

    /* renamed from: c */
    public AbstractC88973n<T> mo143249c(AbstractC88438k<? super Throwable> kVar) {
        return m154249d().mo143194a(2, kVar).mo143208e();
    }

    /* renamed from: a */
    public static <T> AbstractC88973n<T> m154246a(Callable<? extends T> callable) {
        C88466b.m153697a((Object) callable, "callable is null");
        return C88925a.m154169a((AbstractC88973n) new CallableC88603k(callable));
    }

    /* renamed from: b */
    public final AbstractC88973n<T> mo143243b(AbstractC88428a aVar) {
        AbstractC88433f<Object> fVar = C88446a.f200698d;
        AbstractC88428a aVar2 = C88446a.f200697c;
        return C88925a.m154169a(new C88615r(this, fVar, fVar, C88446a.f200698d, (AbstractC88428a) C88466b.m153697a((Object) aVar, "onComplete is null"), aVar2, aVar2));
    }

    /* renamed from: b */
    public final AbstractC88973n<T> mo143244b(AbstractC88433f<? super Throwable> fVar) {
        AbstractC88433f<Object> fVar2 = C88446a.f200698d;
        AbstractC88428a aVar = C88446a.f200697c;
        return C88925a.m154169a(new C88615r(this, fVar2, fVar2, (AbstractC88433f) C88466b.m153697a((Object) fVar, "onError is null"), aVar, aVar, C88446a.f200697c));
    }

    /* renamed from: b */
    public final AbstractC88973n<T> mo143245b(AbstractC88438k<? super Throwable> kVar) {
        C88466b.m153697a((Object) kVar, "predicate is null");
        return C88925a.m154169a(new C88611p(this, kVar));
    }

    /* renamed from: a */
    public final AbstractC88973n<T> mo143234a(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154169a(new C88609o(this, aaVar));
    }

    /* renamed from: a */
    public final AbstractC88412b mo143231a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
        return mo143232a(fVar, fVar2, C88446a.f200697c);
    }

    /* renamed from: a */
    public final AbstractC88973n<T> mo143233a(long j, TimeUnit timeUnit) {
        return m154247b(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: b */
    private AbstractC88973n<T> m154247b(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        return m154244a((AbstractC88977r) m154242a(j, timeUnit, aaVar));
    }

    /* renamed from: a */
    private static AbstractC88973n<Long> m154242a(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154169a(new C88630w(Math.max(0L, j), timeUnit, aaVar));
    }

    /* renamed from: a */
    public final AbstractC88412b mo143232a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar) {
        C88466b.m153697a((Object) fVar, "onSuccess is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        return (AbstractC88412b) m154248c(new C88586b(fVar, fVar2, aVar));
    }
}
