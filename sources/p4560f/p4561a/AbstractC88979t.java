package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88431d;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88435h;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g;
import p4560f.p4561a.p4568e.p4572d.C88482f;
import p4560f.p4561a.p4568e.p4572d.C88491o;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88550k;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88569t;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88638aa;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88641ac;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88642ad;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88644ae;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88645af;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88649ag;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88653ai;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88655aj;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88657ak;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88659al;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88660am;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88663ao;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88665ap;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88667aq;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88669ar;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88686av;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88688aw;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88691ax;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88695ay;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88703bb;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88707bd;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88710be;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88715bg;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88722bj;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88724bk;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88730bl;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88734bn;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88739bp;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88742c;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88755g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88760h;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88762i;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88764j;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88767k;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88768l;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88775n;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88779p;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88781q;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88783r;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88788u;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88791w;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88792x;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88794y;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88797z;
import p4560f.p4561a.p4568e.p4573e.p4578e.CallableC88640ab;
import p4560f.p4561a.p4568e.p4584j.EnumC88900b;
import p4560f.p4561a.p4568e.p4584j.EnumC88905g;
import p4560f.p4561a.p4585f.AbstractC88918a;
import p4560f.p4561a.p4585f.AbstractC88919b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.t */
public abstract class AbstractC88979t<T> implements AbstractC88984x<T> {
    static {
        Covode.recordClassIndex(105021);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17922a(AbstractC88986z<? super T> zVar);

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154305a(AbstractC88984x<? extends T>... xVarArr) {
        return C88925a.m154171a(new C88755g(m154306a((Object[]) xVarArr), C88446a.f200695a, AbstractC88924h.f201932a, EnumC88905g.BOUNDARY));
    }

    /* renamed from: a */
    private static <T> AbstractC88979t<T> m154300a(Iterable<? extends AbstractC88984x<? extends T>> iterable, int i, int i2) {
        return m154309b((Iterable) iterable).m154289a(C88446a.f200695a, i, i2);
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154294a(AbstractC88983w<T> wVar) {
        C88466b.m153697a((Object) wVar, "source is null");
        return C88925a.m154171a(new C88762i(wVar));
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154303a(Callable<? extends AbstractC88984x<? extends T>> callable) {
        C88466b.m153697a((Object) callable, "supplier is null");
        return C88925a.m154171a(new C88767k(callable));
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154302a(Throwable th) {
        C88466b.m153697a((Object) th, "e is null");
        return m154311b((Callable<? extends Throwable>) C88446a.m153690a(th));
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154306a(T... tArr) {
        C88466b.m153697a((Object) tArr, "items is null");
        if (tArr.length == 0) {
            return C88925a.m154171a(C88790v.f201616a);
        }
        if (tArr.length == 1) {
            return m154310b((Object) tArr[0]);
        }
        return C88925a.m154171a(new C88638aa(tArr));
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154304a(Future<? extends T> future) {
        C88466b.m153697a((Object) future, "future is null");
        return C88925a.m154171a(new C88641ac(future));
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154295a(AbstractC88984x<? extends T> xVar, AbstractC88984x<? extends T> xVar2) {
        C88466b.m153697a((Object) xVar, "source1 is null");
        C88466b.m153697a((Object) xVar2, "source2 is null");
        return m154306a((Object[]) new AbstractC88984x[]{xVar, xVar2}).m154292a((AbstractC88434g) C88446a.f200695a, false, 2);
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154297a(AbstractC88984x<? extends T> xVar, AbstractC88984x<? extends T> xVar2, AbstractC88984x<? extends T> xVar3) {
        C88466b.m153697a((Object) xVar, "source1 is null");
        C88466b.m153697a((Object) xVar2, "source2 is null");
        C88466b.m153697a((Object) xVar3, "source3 is null");
        return m154306a((Object[]) new AbstractC88984x[]{xVar, xVar2, xVar3}).m154292a((AbstractC88434g) C88446a.f200695a, false, 3);
    }

    /* renamed from: a */
    public static <T, R> AbstractC88979t<R> m154301a(Iterable<? extends AbstractC88984x<? extends T>> iterable, AbstractC88434g<? super Object[], ? extends R> gVar) {
        C88466b.m153697a((Object) gVar, "zipper is null");
        C88466b.m153697a((Object) iterable, "sources is null");
        return C88925a.m154171a(new C88739bp(null, iterable, gVar, AbstractC88924h.f201932a));
    }

    /* renamed from: a */
    public static <T1, T2, R> AbstractC88979t<R> m154296a(AbstractC88984x<? extends T1> xVar, AbstractC88984x<? extends T2> xVar2, AbstractC88430c<? super T1, ? super T2, ? extends R> cVar) {
        C88466b.m153697a((Object) xVar, "source1 is null");
        C88466b.m153697a((Object) xVar2, "source2 is null");
        return m154290a(C88446a.m153687a((AbstractC88430c) cVar), AbstractC88924h.f201932a, xVar, xVar2);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> AbstractC88979t<R> m154298a(AbstractC88984x<? extends T1> xVar, AbstractC88984x<? extends T2> xVar2, AbstractC88984x<? extends T3> xVar3, AbstractC88435h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        C88466b.m153697a((Object) xVar, "source1 is null");
        C88466b.m153697a((Object) xVar2, "source2 is null");
        C88466b.m153697a((Object) xVar3, "source3 is null");
        return m154290a(C88446a.m153688a((AbstractC88435h) hVar), AbstractC88924h.f201932a, xVar, xVar2, xVar3);
    }

    /* renamed from: a */
    private static <T, R> AbstractC88979t<R> m154290a(AbstractC88434g<? super Object[], ? extends R> gVar, int i, AbstractC88984x<? extends T>... xVarArr) {
        if (xVarArr.length == 0) {
            return C88925a.m154171a(C88790v.f201616a);
        }
        C88466b.m153697a((Object) gVar, "zipper is null");
        C88466b.m153696a(i, "bufferSize");
        return C88925a.m154171a(new C88739bp(xVarArr, null, gVar, i));
    }

    /* renamed from: a */
    public final <R> R mo143274a(AbstractC88981u<T, ? extends R> uVar) {
        return (R) ((AbstractC88981u) C88466b.m153697a((Object) uVar, "converter is null")).mo17946a(this);
    }

    /* renamed from: a */
    public final T mo143273a() {
        C88482f fVar = new C88482f();
        mo143062b((AbstractC88986z) fVar);
        T t = (T) fVar.mo142988a();
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public final <R> AbstractC88979t<R> mo143271a(AbstractC88985y<? super T, ? extends R> yVar) {
        return m154317e(((AbstractC88985y) C88466b.m153697a((Object) yVar, "composer is null")).mo17921a(this));
    }

    /* renamed from: a */
    private <R> AbstractC88979t<R> m154289a(AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, int i, int i2) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        C88466b.m153696a(i, "maxConcurrency");
        C88466b.m153696a(i2, "prefetch");
        return C88925a.m154171a(new C88760h(this, gVar, EnumC88905g.BOUNDARY, i, i2));
    }

    /* renamed from: a */
    public final <K> AbstractC88979t<T> mo143266a(AbstractC88434g<? super T, K> gVar) {
        C88466b.m153697a((Object) gVar, "keySelector is null");
        return C88925a.m154171a(new C88775n(this, gVar, C88466b.f200715a));
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143263a(AbstractC88431d<? super T, ? super T> dVar) {
        C88466b.m153697a((Object) dVar, "comparer is null");
        return C88925a.m154171a(new C88775n(this, C88446a.f200695a, dVar));
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143262a(AbstractC88428a aVar) {
        C88466b.m153697a((Object) aVar, "onFinally is null");
        return C88925a.m154171a(new C88779p(this, aVar));
    }

    /* renamed from: a */
    private AbstractC88979t<T> m154288a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2) {
        C88466b.m153697a((Object) fVar, "onNext is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88466b.m153697a((Object) aVar2, "onAfterTerminate is null");
        return C88925a.m154171a(new C88781q(this, fVar, fVar2, aVar, aVar2));
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143265a(AbstractC88433f<? super AbstractC88412b> fVar, AbstractC88428a aVar) {
        C88466b.m153697a((Object) fVar, "onSubscribe is null");
        C88466b.m153697a((Object) aVar, "onDispose is null");
        return C88925a.m154171a(new C88783r(this, fVar, aVar));
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143268a(AbstractC88438k<? super T> kVar) {
        C88466b.m153697a((Object) kVar, "predicate is null");
        return C88925a.m154171a(new C88792x(this, kVar));
    }

    /* renamed from: a */
    public final <R> AbstractC88979t<R> mo143267a(AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, boolean z) {
        return m154292a(gVar, z, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    private <R> AbstractC88979t<R> m154293a(AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, boolean z, int i, int i2) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        C88466b.m153696a(i, "maxConcurrency");
        C88466b.m153696a(i2, "bufferSize");
        if (!(this instanceof AbstractCallableC88474g)) {
            return C88925a.m154171a(new C88794y(this, gVar, z, i, i2));
        }
        Object call = ((AbstractCallableC88474g) this).call();
        return call == null ? C88925a.m154171a(C88790v.f201616a) : C88695ay.m153918a(call, gVar);
    }

    /* renamed from: b */
    public final <U> AbstractC88979t<U> mo143281b(AbstractC88434g<? super T, ? extends Iterable<? extends U>> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154171a(new C88797z(this, gVar));
    }

    /* renamed from: a */
    private <K, V> AbstractC88979t<AbstractC88919b<K, V>> m154291a(AbstractC88434g<? super T, ? extends K> gVar, AbstractC88434g<? super T, ? extends V> gVar2, int i) {
        C88466b.m153697a((Object) gVar, "keySelector is null");
        C88466b.m153697a((Object) gVar2, "valueSelector is null");
        C88466b.m153696a(i, "bufferSize");
        return C88925a.m154171a(new C88645af(this, gVar, gVar2, i));
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143269a(AbstractC88984x<? extends T> xVar) {
        C88466b.m153697a((Object) xVar, "other is null");
        return m154295a(this, xVar);
    }

    /* renamed from: a */
    public final <U> AbstractC88979t<U> mo143272a(Class<U> cls) {
        C88466b.m153697a((Object) cls, "clazz is null");
        return mo143268a(C88446a.m153689a((Class) cls)).m154308b((Class) cls);
    }

    /* renamed from: b */
    public final AbstractC88979t<T> mo143282b(AbstractC88984x<? extends T> xVar) {
        C88466b.m153697a((Object) xVar, "next is null");
        return mo143296e(C88446a.m153691b(xVar));
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143259a(long j, AbstractC88438k<? super Throwable> kVar) {
        if (j >= 0) {
            C88466b.m153697a((Object) kVar, "predicate is null");
            return C88925a.m154171a(new C88686av(this, j, kVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
    }

    /* renamed from: a */
    public final AbstractC88412b mo143254a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
        return mo143256a(fVar, fVar2, C88446a.f200697c, C88446a.f200698d);
    }

    /* renamed from: a */
    public final AbstractC88412b mo143256a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88433f<? super AbstractC88412b> fVar3) {
        C88466b.m153697a((Object) fVar, "onNext is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88466b.m153697a((Object) fVar3, "onSubscribe is null");
        C88491o oVar = new C88491o(fVar, fVar2, aVar, fVar3);
        mo143062b((AbstractC88986z) oVar);
        return oVar;
    }

    @Override // p4560f.p4561a.AbstractC88984x
    /* renamed from: b */
    public final void mo143062b(AbstractC88986z<? super T> zVar) {
        C88466b.m153697a((Object) zVar, "observer is null");
        try {
            AbstractC88986z<? super T> a = C88925a.m154172a(this, zVar);
            C88466b.m153697a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo17922a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143260a(long j, TimeUnit timeUnit, AbstractC88984x<? extends T> xVar, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "timeUnit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88724bk(this, j, timeUnit, aaVar, xVar));
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo143257a(EnumC88388a aVar) {
        C88550k kVar = new C88550k(this);
        int i = C889801.f202059a[aVar.ordinal()];
        if (i == 1) {
            return kVar.mo143203b();
        }
        if (i == 2) {
            return kVar.mo143206c();
        }
        if (i == 3) {
            return kVar;
        }
        if (i != 4) {
            return kVar.mo143193a();
        }
        return C88925a.m154168a(new C88569t(kVar));
    }

    /* renamed from: a */
    public final <U, R> AbstractC88979t<R> mo143270a(AbstractC88984x<? extends U> xVar, AbstractC88430c<? super T, ? super U, ? extends R> cVar) {
        C88466b.m153697a((Object) xVar, "other is null");
        return m154296a(this, xVar, cVar);
    }

    /* renamed from: a */
    public static <T> AbstractC88979t<T> m154299a(Iterable<? extends AbstractC88984x<? extends T>> iterable) {
        int i = AbstractC88924h.f201932a;
        return m154300a(iterable, i, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.t<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final AbstractC88979t<T> mo143279b(AbstractC88428a aVar) {
        AbstractC88433f<Object> fVar = C88446a.f200698d;
        return m154288a(fVar, fVar, aVar, C88446a.f200697c);
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143264a(AbstractC88433f<? super Throwable> fVar) {
        AbstractC88433f<? super T> fVar2 = C88446a.f200698d;
        AbstractC88428a aVar = C88446a.f200697c;
        return m154288a(fVar2, fVar, aVar, aVar);
    }

    /* renamed from: b */
    public final AbstractC88979t<T> mo143280b(AbstractC88433f<? super T> fVar) {
        AbstractC88433f<? super Throwable> fVar2 = C88446a.f200698d;
        AbstractC88428a aVar = C88446a.f200697c;
        return m154288a(fVar, fVar2, aVar, aVar);
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143261a(AbstractC88398aa aaVar) {
        return m154287a(aaVar, AbstractC88924h.f201932a);
    }

    /* renamed from: a */
    public final AbstractC88979t<T> mo143258a(long j) {
        return mo143259a(j, C88446a.f200702h);
    }

    /* renamed from: a */
    public final AbstractC88412b mo143255a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar) {
        return mo143256a(fVar, fVar2, aVar, C88446a.f200698d);
    }

    /* renamed from: f */
    public final AbstractC88979t<T> mo143297f() {
        return C88925a.m154171a(new C88703bb(this));
    }

    /* renamed from: g */
    public final AbstractC88412b mo143300g() {
        return mo143256a(C88446a.f200698d, C88446a.f200700f, C88446a.f200697c, C88446a.f200698d);
    }

    /* renamed from: h */
    public final AbstractC88403ab<List<T>> mo143303h() {
        C88466b.m153696a(16, "capacityHint");
        return C88925a.m154163a(new C88734bn(this));
    }

    /* renamed from: f.a.t$1 */
    static /* synthetic */ class C889801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f202059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 105022(0x19a3e, float:1.47167E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                f.a.a[] r0 = p4560f.p4561a.EnumC88388a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                p4560f.p4561a.AbstractC88979t.C889801.f202059a = r2
                f.a.a r0 = p4560f.p4561a.EnumC88388a.DROP     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = p4560f.p4561a.AbstractC88979t.C889801.f202059a     // Catch:{ NoSuchFieldError -> 0x0023 }
                f.a.a r0 = p4560f.p4561a.EnumC88388a.LATEST     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = p4560f.p4561a.AbstractC88979t.C889801.f202059a     // Catch:{ NoSuchFieldError -> 0x002e }
                f.a.a r0 = p4560f.p4561a.EnumC88388a.MISSING     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = p4560f.p4561a.AbstractC88979t.C889801.f202059a     // Catch:{ NoSuchFieldError -> 0x0039 }
                f.a.a r0 = p4560f.p4561a.EnumC88388a.ERROR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4560f.p4561a.AbstractC88979t.C889801.<clinit>():void");
        }
    }

    /* renamed from: d */
    public final AbstractC88410b mo143290d() {
        return C88925a.m154165a(new C88653ai(this));
    }

    /* renamed from: c */
    public final AbstractC88979t<T> mo143283c() {
        return C88925a.m154171a(new C88649ag(this));
    }

    /* renamed from: e */
    public final AbstractC88918a<T> mo143294e() {
        AtomicReference atomicReference = new AtomicReference();
        return C88925a.m154167a((AbstractC88918a) new C88669ar(new C88669ar.C88672c(atomicReference), this, atomicReference));
    }

    /* renamed from: b */
    public final AbstractC88403ab<T> mo143275b() {
        return C88925a.m154163a(new C88788u(this));
    }

    /* renamed from: c */
    public final <E extends AbstractC88986z<? super T>> E mo143288c(E e) {
        mo143062b((AbstractC88986z) e);
        return e;
    }

    /* renamed from: c */
    public final AbstractC88979t<T> mo143285c(AbstractC88433f<? super AbstractC88412b> fVar) {
        return mo143265a(fVar, C88446a.f200697c);
    }

    /* renamed from: d */
    public final AbstractC88412b mo143289d(AbstractC88433f<? super T> fVar) {
        return mo143256a(fVar, C88446a.f200700f, C88446a.f200697c, C88446a.f200698d);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: f.a.t<R>, f.a.t<U> */
    /* renamed from: b */
    private <U> AbstractC88979t<U> m154308b(Class<U> cls) {
        C88466b.m153697a((Object) cls, "clazz is null");
        return (AbstractC88979t<R>) mo143292d(new C88446a.C88450d(cls));
    }

    /* renamed from: c */
    public static <T> AbstractC88979t<T> m154313c(Iterable<? extends AbstractC88984x<? extends T>> iterable) {
        return m154309b((Iterable) iterable).mo143267a((AbstractC88434g) C88446a.f200695a, false);
    }

    /* renamed from: b */
    public static <T> AbstractC88979t<T> m154309b(Iterable<? extends T> iterable) {
        C88466b.m153697a((Object) iterable, "source is null");
        return C88925a.m154171a(new C88642ad(iterable));
    }

    /* renamed from: c */
    public static <T> AbstractC88979t<T> m154314c(Callable<? extends T> callable) {
        C88466b.m153697a((Object) callable, "supplier is null");
        return C88925a.m154171a((AbstractC88979t) new CallableC88640ab(callable));
    }

    /* renamed from: e */
    private static <T> AbstractC88979t<T> m154317e(AbstractC88984x<T> xVar) {
        C88466b.m153697a((Object) xVar, "source is null");
        if (xVar instanceof AbstractC88979t) {
            return C88925a.m154171a((AbstractC88979t) xVar);
        }
        return C88925a.m154171a(new C88644ae(xVar));
    }

    /* renamed from: g */
    public final AbstractC88979t<T> mo143302g(AbstractC88434g<? super AbstractC88979t<Throwable>, ? extends AbstractC88984x<?>> gVar) {
        C88466b.m153697a((Object) gVar, "handler is null");
        return C88925a.m154171a(new C88688aw(this, gVar));
    }

    /* renamed from: b */
    public static <T> AbstractC88979t<T> m154310b(T t) {
        C88466b.m153697a((Object) t, "The item is null");
        return C88925a.m154171a((AbstractC88979t) new C88659al(t));
    }

    /* renamed from: f */
    public final AbstractC88979t<T> mo143299f(AbstractC88434g<? super Throwable, ? extends T> gVar) {
        C88466b.m153697a((Object) gVar, "valueSupplier is null");
        return C88925a.m154171a(new C88667aq(this, gVar));
    }

    /* renamed from: b */
    public static <T> AbstractC88979t<T> m154311b(Callable<? extends Throwable> callable) {
        C88466b.m153697a((Object) callable, "errorSupplier is null");
        return C88925a.m154171a(new C88791w(callable));
    }

    /* renamed from: d */
    public final <R> AbstractC88979t<R> mo143292d(AbstractC88434g<? super T, ? extends R> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154171a(new C88660am(this, gVar));
    }

    /* renamed from: e */
    public final AbstractC88979t<T> mo143296e(AbstractC88434g<? super Throwable, ? extends AbstractC88984x<? extends T>> gVar) {
        C88466b.m153697a((Object) gVar, "resumeFunction is null");
        return C88925a.m154171a(new C88665ap(this, gVar, false));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: f.a.t<f.a.f.b<K, V>>, f.a.t<f.a.f.b<K, T>> */
    /* renamed from: c */
    public final <K> AbstractC88979t<AbstractC88919b<K, T>> mo143286c(AbstractC88434g<? super T, ? extends K> gVar) {
        return (AbstractC88979t<AbstractC88919b<K, V>>) m154291a(gVar, C88446a.f200695a, AbstractC88924h.f201932a);
    }

    /* renamed from: d */
    public final AbstractC88979t<T> mo143293d(AbstractC88984x<? extends T> xVar) {
        C88466b.m153697a((Object) xVar, "other is null");
        return C88925a.m154171a(new C88710be(this, xVar));
    }

    /* renamed from: b */
    public final AbstractC88979t<T> mo143276b(long j) {
        if (j >= 0) {
            return C88925a.m154171a(new C88715bg(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j)));
    }

    /* renamed from: c */
    public final AbstractC88979t<T> mo143287c(AbstractC88984x<? extends T> xVar) {
        C88466b.m153697a((Object) xVar, "next is null");
        return C88925a.m154171a(new C88665ap(this, C88446a.m153691b(xVar), true));
    }

    /* renamed from: b */
    public final AbstractC88979t<T> mo143278b(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88707bd(this, aaVar));
    }

    /* renamed from: b */
    public static AbstractC88979t<Long> m154307b(long j, TimeUnit timeUnit) {
        return m154285a(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: e */
    public final AbstractC88979t<T> mo143295e(long j, TimeUnit timeUnit) {
        return m154316e(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: h */
    public final AbstractC88979t<T> mo143304h(long j, TimeUnit timeUnit) {
        return mo143260a(j, timeUnit, (AbstractC88984x) null, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: g */
    public final AbstractC88979t<T> mo143301g(long j, TimeUnit timeUnit) {
        return m154318f(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: f */
    public final AbstractC88979t<T> mo143298f(long j, TimeUnit timeUnit) {
        AbstractC88398aa a = C88925a.m154160a(C88946a.f201990b);
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) a, "scheduler is null");
        return C88925a.m154171a(new C88691ax(this, j, timeUnit, a));
    }

    /* renamed from: d */
    public final AbstractC88979t<T> mo143291d(long j, TimeUnit timeUnit) {
        return m154315d(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m154284a(long j, TimeUnit timeUnit) {
        return m154283a(j, j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: c */
    public final AbstractC88979t<List<T>> mo143284c(long j, TimeUnit timeUnit) {
        return m154312c(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: a */
    private AbstractC88979t<T> m154287a(AbstractC88398aa aaVar, int i) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        C88466b.m153696a(i, "bufferSize");
        return C88925a.m154171a(new C88663ao(this, aaVar, i));
    }

    /* renamed from: a */
    private <R> AbstractC88979t<R> m154292a(AbstractC88434g<? super T, ? extends AbstractC88984x<? extends R>> gVar, boolean z, int i) {
        return m154293a(gVar, z, i, AbstractC88924h.f201932a);
    }

    /* renamed from: b */
    public final AbstractC88979t<T> mo143277b(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        return m154316e(j, timeUnit, aaVar);
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m154282a(long j, long j2, TimeUnit timeUnit) {
        return m154283a(j, j2, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: f.a.t<U extends java.util.Collection<? super T>>, f.a.t<java.util.List<T>> */
    /* renamed from: c */
    private AbstractC88979t<List<T>> m154312c(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        return (AbstractC88979t<U>) m154286a(j, timeUnit, aaVar, EnumC88900b.asCallable());
    }

    /* renamed from: d */
    private AbstractC88979t<T> m154315d(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88764j(this, j, timeUnit, aaVar));
    }

    /* renamed from: e */
    private AbstractC88979t<T> m154316e(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88768l(this, j, timeUnit, aaVar));
    }

    /* renamed from: f */
    private AbstractC88979t<T> m154318f(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88722bj(this, j, timeUnit, aaVar));
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m154285a(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88730bl(Math.max(j, 0L), timeUnit, aaVar));
    }

    /* renamed from: a */
    private static AbstractC88979t<Long> m154283a(long j, long j2, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154171a(new C88655aj(Math.max(0L, j), Math.max(0L, j2), timeUnit, aaVar));
    }

    /* renamed from: a */
    private <U extends Collection<? super T>> AbstractC88979t<U> m154286a(long j, TimeUnit timeUnit, AbstractC88398aa aaVar, Callable<U> callable) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        C88466b.m153697a((Object) callable, "bufferSupplier is null");
        C88466b.m153696a(Integer.MAX_VALUE, "count");
        return C88925a.m154171a(new C88742c(this, j, j, timeUnit, aaVar, callable, Integer.MAX_VALUE));
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m154280a(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return m154281a(j, j2, j3, j4, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: a */
    private static AbstractC88979t<Long> m154281a(long j, long j2, long j3, long j4, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        if (j2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j2)));
        } else if (j2 == 0) {
            return C88925a.m154171a(C88790v.f201616a).mo143277b(j3, timeUnit, aaVar);
        } else {
            long j5 = (j2 - 1) + j;
            if (j <= 0 || j5 >= 0) {
                C88466b.m153697a((Object) timeUnit, "unit is null");
                C88466b.m153697a((Object) aaVar, "scheduler is null");
                return C88925a.m154171a(new C88657ak(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, aaVar));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }
}
