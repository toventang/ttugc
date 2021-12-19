package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88515aa;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88519ac;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88524b;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88536d;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88541f;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88543h;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88546i;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88553m;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88555n;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88557o;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88558p;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88561q;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88565r;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88567s;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88571u;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88577w;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88581y;
import p4560f.p4561a.p4568e.p4573e.p4575b.CallableC88549j;
import p4560f.p4561a.p4568e.p4582h.C88890c;
import p4560f.p4561a.p4568e.p4582h.C88891d;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.h */
public abstract class AbstractC88924h<T> implements AbstractC90213b<T> {

    /* renamed from: a */
    public static final int f201932a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17954a(AbstractC90214c<? super T> cVar);

    /* renamed from: a */
    public final <R> R mo143200a(AbstractC88926i<T, ? extends R> iVar) {
        return (R) ((AbstractC88926i) C88466b.m153697a((Object) iVar, "converter is null")).mo17945a(this);
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo143197a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2) {
        C88466b.m153697a((Object) fVar, "onNext is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88466b.m153697a((Object) aVar2, "onAfterTerminate is null");
        return C88925a.m154168a(new C88536d(this, fVar, fVar2, aVar, aVar2));
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo143199a(AbstractC88438k<? super T> kVar) {
        C88466b.m153697a((Object) kVar, "predicate is null");
        return C88925a.m154168a(new C88543h(this, kVar));
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo143194a(long j, AbstractC88438k<? super Throwable> kVar) {
        if (j >= 0) {
            C88466b.m153697a((Object) kVar, "predicate is null");
            return C88925a.m154168a(new C88577w(this, j, kVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
    }

    /* renamed from: a */
    public final AbstractC88412b mo143190a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
        return mo143192a(fVar, fVar2, C88446a.f200697c, C88553m.EnumC88554a.INSTANCE);
    }

    /* renamed from: a */
    public final AbstractC88412b mo143192a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88433f<? super AbstractC90215d> fVar3) {
        C88466b.m153697a((Object) fVar, "onNext is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88466b.m153697a((Object) fVar3, "onSubscribe is null");
        C88890c cVar = new C88890c(fVar, fVar2, aVar, fVar3);
        mo143201a((AbstractC88955l) cVar);
        return cVar;
    }

    /* renamed from: a */
    public final void mo143201a(AbstractC88955l<? super T> lVar) {
        C88466b.m153697a((Object) lVar, "s is null");
        try {
            AbstractC90214c<? super T> a = C88925a.m154176a(this, lVar);
            C88466b.m153697a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo17954a((AbstractC90214c) a);
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
    public final AbstractC88924h<T> mo143196a(AbstractC88433f<? super T> fVar) {
        AbstractC88433f<? super Throwable> fVar2 = C88446a.f200698d;
        AbstractC88428a aVar = C88446a.f200697c;
        return mo143197a(fVar, fVar2, aVar, aVar);
    }

    /* renamed from: a */
    public final <R> AbstractC88924h<R> mo143198a(AbstractC88434g<? super T, ? extends AbstractC90213b<? extends R>> gVar) {
        int i = f201932a;
        return m154133a(gVar, i, i);
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo143195a(AbstractC88398aa aaVar) {
        return m154131a(aaVar, f201932a);
    }

    /* renamed from: a */
    public final AbstractC88924h<T> mo143193a() {
        int i = f201932a;
        C88466b.m153696a(i, "bufferSize");
        return C88925a.m154168a(new C88565r(this, i, C88446a.f200697c));
    }

    /* renamed from: c */
    public final AbstractC88924h<T> mo143206c() {
        return C88925a.m154168a(new C88571u(this));
    }

    /* renamed from: d */
    public final AbstractC88924h<T> mo143207d() {
        return mo143194a(1, C88446a.f200702h);
    }

    /* renamed from: e */
    public final AbstractC88973n<T> mo143208e() {
        return C88925a.m154169a(new C88515aa(this));
    }

    static {
        Covode.recordClassIndex(104966);
    }

    /* renamed from: b */
    public final AbstractC88924h<T> mo143203b() {
        return C88925a.m154168a((AbstractC88924h) new C88567s(this));
    }

    /* renamed from: b */
    public final AbstractC88412b mo143202b(AbstractC88433f<? super T> fVar) {
        return mo143192a(fVar, C88446a.f200700f, C88446a.f200697c, C88553m.EnumC88554a.INSTANCE);
    }

    @Override // org.p4663a.AbstractC90213b
    /* renamed from: a_ */
    public final void mo57509a_(AbstractC90214c<? super T> cVar) {
        if (cVar instanceof AbstractC88955l) {
            mo143201a((AbstractC88955l) ((AbstractC88955l) cVar));
            return;
        }
        C88466b.m153697a((Object) cVar, "s is null");
        mo143201a((AbstractC88955l) new C88891d(cVar));
    }

    /* renamed from: b */
    public final AbstractC88924h<T> mo143204b(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return m154132a(aaVar, !(this instanceof C88524b));
    }

    /* renamed from: b */
    public final <R> AbstractC88924h<R> mo143205b(AbstractC88434g<? super T, ? extends R> gVar) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        return C88925a.m154168a(new C88558p(this, gVar));
    }

    /* renamed from: a */
    public static <T> AbstractC88924h<T> m154135a(T t) {
        C88466b.m153697a((Object) t, "item is null");
        return C88925a.m154168a((AbstractC88924h) new C88557o(t));
    }

    /* renamed from: a */
    public static <T> AbstractC88924h<T> m154136a(Callable<? extends T> callable) {
        C88466b.m153697a((Object) callable, "supplier is null");
        return C88925a.m154168a((AbstractC88924h) new CallableC88549j(callable));
    }

    /* renamed from: a */
    public static AbstractC88924h<Long> m154137a(TimeUnit timeUnit) {
        return m154138a(timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: a */
    private AbstractC88924h<T> m154132a(AbstractC88398aa aaVar, boolean z) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154168a(new C88519ac(this, aaVar, z));
    }

    /* renamed from: a */
    private AbstractC88924h<T> m154131a(AbstractC88398aa aaVar, int i) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        C88466b.m153696a(i, "bufferSize");
        return C88925a.m154168a(new C88561q(this, aaVar, i));
    }

    /* renamed from: a */
    public static <T> AbstractC88924h<T> m154134a(AbstractC88945k<T> kVar, EnumC88388a aVar) {
        C88466b.m153697a((Object) kVar, "source is null");
        C88466b.m153697a((Object) aVar, "mode is null");
        return C88925a.m154168a(new C88524b(kVar, aVar));
    }

    /* renamed from: a */
    private static AbstractC88924h<Long> m154138a(TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154168a(new C88555n(Math.max(0L, 40L), Math.max(0L, 40L), timeUnit, aaVar));
    }

    /* renamed from: a */
    public final AbstractC88412b mo143191a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar) {
        return mo143192a(fVar, fVar2, aVar, C88553m.EnumC88554a.INSTANCE);
    }

    /* renamed from: a */
    private <R> AbstractC88924h<R> m154133a(AbstractC88434g<? super T, ? extends AbstractC90213b<? extends R>> gVar, int i, int i2) {
        C88466b.m153697a((Object) gVar, "mapper is null");
        C88466b.m153696a(i, "maxConcurrency");
        C88466b.m153696a(i2, "bufferSize");
        if (!(this instanceof AbstractCallableC88474g)) {
            return C88925a.m154168a(new C88546i(this, gVar, i, i2));
        }
        Object call = ((AbstractCallableC88474g) this).call();
        if (call == null) {
            return C88925a.m154168a(C88541f.f200871b);
        }
        return C88581y.m153820a(call, gVar);
    }
}
