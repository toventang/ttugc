package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4572d.C88484h;
import p4560f.p4561a.p4568e.p4572d.C88488l;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88499b;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88500c;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88503e;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88505g;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88506h;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88508i;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88510j;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88512k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: f.a.b */
public abstract class AbstractC88410b implements AbstractC88917f {
    static {
        Covode.recordClassIndex(104452);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo142942b(AbstractC88427d dVar);

    /* renamed from: a */
    public final AbstractC88410b mo142939a(AbstractC88438k<? super Throwable> kVar) {
        C88466b.m153697a((Object) kVar, "predicate is null");
        return C88925a.m154165a(new C88508i(this, kVar));
    }

    @Override // p4560f.p4561a.AbstractC88917f
    /* renamed from: a */
    public final void mo17931a(AbstractC88427d dVar) {
        C88466b.m153697a((Object) dVar, "s is null");
        try {
            AbstractC88427d a = C88925a.m154166a(this, dVar);
            C88466b.m153697a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo142942b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C88422b.m153670a(th);
            C88925a.m154178a(th);
            throw m153643b(th);
        }
    }

    public final AbstractC88412b cN_() {
        C88488l lVar = new C88488l();
        mo17931a(lVar);
        return lVar;
    }

    /* renamed from: a */
    public static AbstractC88410b m153640a(Throwable th) {
        C88466b.m153697a((Object) th, "error is null");
        return C88925a.m154165a(new C88503e(th));
    }

    /* renamed from: b */
    public static AbstractC88410b m153642b(Callable<?> callable) {
        C88466b.m153697a((Object) callable, "callable is null");
        return C88925a.m154165a(new C88505g(callable));
    }

    /* renamed from: b */
    private static NullPointerException m153643b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: b */
    public final AbstractC88412b mo142940b(AbstractC88428a aVar) {
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88484h hVar = new C88484h(aVar);
        mo17931a(hVar);
        return hVar;
    }

    /* renamed from: a */
    public static AbstractC88410b m153641a(Callable<? extends AbstractC88917f> callable) {
        C88466b.m153697a((Object) callable, "completableSupplier");
        return C88925a.m154165a(new C88499b(callable));
    }

    /* renamed from: b */
    public final AbstractC88410b mo142941b(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154165a(new C88512k(this, aaVar));
    }

    /* renamed from: a */
    public final AbstractC88410b mo142937a(AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154165a(new C88506h(this, aaVar));
    }

    /* renamed from: a */
    public final AbstractC88410b mo142938a(AbstractC88428a aVar) {
        AbstractC88433f<? super AbstractC88412b> fVar = C88446a.f200698d;
        AbstractC88428a aVar2 = C88446a.f200697c;
        return m153639a(fVar, fVar, aVar, aVar2, aVar2, C88446a.f200697c);
    }

    /* renamed from: a */
    public final AbstractC88412b mo142935a(AbstractC88428a aVar, AbstractC88433f<? super Throwable> fVar) {
        C88466b.m153697a((Object) fVar, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88484h hVar = new C88484h(fVar, aVar);
        mo17931a(hVar);
        return hVar;
    }

    /* renamed from: a */
    public final AbstractC88410b mo142936a(long j, TimeUnit timeUnit) {
        return m153638a(j, timeUnit, C88925a.m154160a(C88946a.f201990b));
    }

    /* renamed from: a */
    private AbstractC88410b m153638a(long j, TimeUnit timeUnit, AbstractC88398aa aaVar) {
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) aaVar, "scheduler is null");
        return C88925a.m154165a(new C88500c(this, j, timeUnit, aaVar));
    }

    /* renamed from: a */
    private AbstractC88410b m153639a(AbstractC88433f<? super AbstractC88412b> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar, AbstractC88428a aVar2, AbstractC88428a aVar3, AbstractC88428a aVar4) {
        C88466b.m153697a((Object) fVar, "onSubscribe is null");
        C88466b.m153697a((Object) fVar2, "onError is null");
        C88466b.m153697a((Object) aVar, "onComplete is null");
        C88466b.m153697a((Object) aVar2, "onTerminate is null");
        C88466b.m153697a((Object) aVar3, "onAfterTerminate is null");
        C88466b.m153697a((Object) aVar4, "onDispose is null");
        return C88925a.m154165a(new C88510j(this, fVar, fVar2, aVar, aVar2, aVar3, aVar4));
    }
}
