package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88469b;
import p4560f.p4561a.p4568e.p4571c.AbstractC88470c;
import p4560f.p4561a.p4568e.p4572d.C88480d;
import p4560f.p4561a.p4568e.p4572d.C88485i;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88517ab;
import p4560f.p4561a.p4568e.p4573e.p4577d.C88635a;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88701ba;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88799a;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88803c;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88805d;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88807e;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88809f;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88811g;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88813h;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88815i;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88816j;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88819k;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88820l;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88821m;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88823n;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88824o;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88827q;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88829r;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88831s;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88833t;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88835u;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88840w;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88842x;
import p4560f.p4561a.p4568e.p4573e.p4579f.C88844y;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.ab */
public abstract class AbstractC88403ab<T> implements AbstractC88408ag<T> {
    static {
        Covode.recordClassIndex(104445);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17955a(AbstractC88406ae<? super T> aeVar);

    /* renamed from: a */
    public static <T> AbstractC88403ab<T> m153604a(Callable<? extends T> callable) {
        C88466b.m153697a((Object) callable, "callable is null");
        return C88925a.m154163a(new C88819k(callable));
    }

    /* renamed from: a */
    public final <R> R mo142916a(AbstractC88404ac<T, ? extends R> acVar) {
        return (R) ((AbstractC88404ac) C88466b.m153697a((Object) acVar, "converter is null")).mo17944a(this);
    }

    /* renamed from: a */
    public final <R> AbstractC88403ab<R> mo142910a(AbstractC88409ah<? super T, ? extends R> ahVar) {
        return m153597a(((AbstractC88409ah) C88466b.m153697a((Object) ahVar, "transformer is null")).mo17919a(this));
    }

    /* renamed from: a */
    public final AbstractC88403ab<T> mo142911a(AbstractC88428a aVar) {
        C88466b.m153697a((Object) aVar, "onFinally is null");
        return C88925a.m154163a(new C88803c(this, aVar));
    }

    /* renamed from: a */
    public final AbstractC88403ab<T> mo142913a(AbstractC88433f<? super AbstractC88412b> fVar) {
        C88466b.m153697a((Object) fVar, "onSubscribe is null");
        return C88925a.m154163a(new C88811g(this, fVar));
    }

    /* renamed from: a */
    public final AbstractC88403ab<T> mo142912a(AbstractC88429b<? super T, ? super Throwable> bVar) {
        C88466b.m153697a((Object) bVar, "onEvent is null");
        return C88925a.m154163a(new C88809f(this, bVar));
    }

    /* renamed from: a */
    public final <R> AbstractC88403ab<R> mo142914a(AbstractC88434g<? super T, ? extends AbstractC88408ag<? extends R>> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154163a(new C88816j(this, gVar));
    }

    /* renamed from: a */
    public final AbstractC88403ab<T> mo142909a(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154163a(new C88827q(this, aaVar));
    }

    /* renamed from: a */
    public final AbstractC88412b mo142915a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
        C88466b.m153697a((Object) fVar, "onSuccess is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88485i iVar = new C88485i(fVar, fVar2);
        mo116431a_(iVar);
        return iVar;
    }

    /* renamed from: a */
    public final AbstractC88403ab<T> mo142908a(long j, TimeUnit timeUnit, AbstractC88398aa aaVar, AbstractC88408ag<? extends T> agVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154163a(new C88835u(this, j, timeUnit, aaVar, agVar));
    }

    /* renamed from: a */
    public final AbstractC88403ab<T> mo142907a(long j, TimeUnit timeUnit) {
        return mo142908a(j, timeUnit, C88925a.m154160a(C88946a.f201990b), null);
    }

    public final AbstractC88403ab<T> cM_() {
        return C88925a.m154163a(new C88821m(this));
    }

    /* renamed from: e */
    private AbstractC88924h<T> m153606e() {
        if (this instanceof AbstractC88469b) {
            return ((AbstractC88469b) this).mo142982a();
        }
        return C88925a.m154168a(new C88840w(this));
    }

    /* renamed from: b */
    public final AbstractC88403ab<T> mo142917b() {
        return m153600a((AbstractC88924h) m153606e().mo143207d());
    }

    /* renamed from: d */
    public final AbstractC88979t<T> mo142930d() {
        if (this instanceof AbstractC88470c) {
            return ((AbstractC88470c) this).mo142983a();
        }
        return C88925a.m154171a(new C88842x(this));
    }

    /* renamed from: c */
    public final AbstractC88412b mo142926c() {
        return mo142915a(C88446a.f200698d, C88446a.f200700f);
    }

    /* renamed from: d */
    public final AbstractC88412b mo142929d(AbstractC88433f<? super T> fVar) {
        return mo142915a(fVar, C88446a.f200700f);
    }

    /* renamed from: a */
    public static <T> AbstractC88403ab<T> m153596a(AbstractC88407af<T> afVar) {
        C88466b.m153697a((Object) afVar, "source is null");
        return C88925a.m154163a(new C88799a(afVar));
    }

    /* renamed from: b */
    private static <T> AbstractC88403ab<T> m153605b(Callable<? extends Throwable> callable) {
        C88466b.m153697a((Object) callable, "errorSupplier is null");
        return C88925a.m154163a(new C88815i(callable));
    }

    /* renamed from: c */
    public final AbstractC88403ab<T> mo142924c(AbstractC88433f<? super Throwable> fVar) {
        C88466b.m153697a((Object) fVar, "onError is null");
        return C88925a.m154163a(new C88807e(this, fVar));
    }

    /* renamed from: d */
    public final AbstractC88403ab<T> mo142928d(AbstractC88434g<? super Throwable, ? extends AbstractC88408ag<? extends T>> gVar) {
        C88466b.m153697a((Object) gVar, "resumeFunctionInCaseOfError is null");
        return C88925a.m154163a(new C88831s(this, gVar));
    }

    /* renamed from: a */
    private static <T> AbstractC88403ab<T> m153597a(AbstractC88408ag<T> agVar) {
        C88466b.m153697a((Object) agVar, "source is null");
        if (agVar instanceof AbstractC88403ab) {
            return C88925a.m154163a((AbstractC88403ab) agVar);
        }
        return C88925a.m154163a(new C88820l(agVar));
    }

    /* renamed from: c */
    public final <R> AbstractC88403ab<R> mo142925c(AbstractC88434g<? super T, ? extends R> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154163a(new C88824o(this, gVar));
    }

    @Override // p4560f.p4561a.AbstractC88408ag
    /* renamed from: a_ */
    public final void mo116431a_(AbstractC88406ae<? super T> aeVar) {
        C88466b.m153697a((Object) aeVar, "subscriber is null");
        AbstractC88406ae<? super T> a = C88925a.m154164a(this, aeVar);
        C88466b.m153697a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo17955a((AbstractC88406ae) a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C88422b.m153670a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final AbstractC88403ab<T> mo142918b(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154163a(new C88833t(this, aaVar));
    }

    /* renamed from: b */
    public final AbstractC88403ab<T> mo142919b(AbstractC88428a aVar) {
        C88466b.m153697a((Object) aVar, "onDispose is null");
        return C88925a.m154163a(new C88805d(this, aVar));
    }

    /* renamed from: a */
    private static <T> AbstractC88403ab<T> m153600a(AbstractC88924h<T> hVar) {
        return C88925a.m154163a(new C88517ab(hVar));
    }

    /* renamed from: b */
    public final AbstractC88403ab<T> mo142920b(AbstractC88433f<? super T> fVar) {
        C88466b.m153697a((Object) fVar, "onSuccess is null");
        return C88925a.m154163a(new C88813h(this, fVar));
    }

    /* renamed from: a */
    public static <T> AbstractC88403ab<T> m153601a(AbstractC88984x<? extends T> xVar) {
        C88466b.m153697a((Object) xVar, "observableSource is null");
        return C88925a.m154163a(new C88701ba(xVar));
    }

    /* renamed from: b */
    public final AbstractC88403ab<T> mo142921b(T t) {
        C88466b.m153697a((Object) t, "value is null");
        return C88925a.m154163a(new C88829r(this, t));
    }

    /* renamed from: a */
    public static <T> AbstractC88403ab<T> m153602a(T t) {
        C88466b.m153697a((Object) t, "value is null");
        return C88925a.m154163a(new C88823n(t));
    }

    /* renamed from: b */
    public final AbstractC88412b mo142922b(AbstractC88429b<? super T, ? super Throwable> bVar) {
        C88466b.m153697a((Object) bVar, "onCallback is null");
        C88480d dVar = new C88480d(bVar);
        mo116431a_(dVar);
        return dVar;
    }

    /* renamed from: a */
    public static <T> AbstractC88403ab<T> m153603a(Throwable th) {
        C88466b.m153697a((Object) th, "error is null");
        return m153605b((Callable<? extends Throwable>) C88446a.m153690a(th));
    }

    /* renamed from: b */
    public final <R> AbstractC88979t<R> mo142923b(AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154171a(new C88635a(this, gVar));
    }

    /* renamed from: a */
    private static <T, R> AbstractC88403ab<R> m153599a(AbstractC88434g<? super Object[], ? extends R> gVar, AbstractC88408ag<? extends T>... agVarArr) {
        C88466b.m153697a((Object) gVar, "zipper is null");
        C88466b.m153697a((Object) agVarArr, "sources is null");
        return C88925a.m154163a(new C88844y(agVarArr, gVar));
    }

    /* renamed from: a */
    public static <T1, T2, R> AbstractC88403ab<R> m153598a(AbstractC88408ag<? extends T1> agVar, AbstractC88408ag<? extends T2> agVar2, AbstractC88430c<? super T1, ? super T2, ? extends R> cVar) {
        C88466b.m153697a((Object) agVar, "source1 is null");
        C88466b.m153697a((Object) agVar2, "source2 is null");
        return m153599a(C88446a.m153687a((AbstractC88430c) cVar), agVar, agVar2);
    }
}
