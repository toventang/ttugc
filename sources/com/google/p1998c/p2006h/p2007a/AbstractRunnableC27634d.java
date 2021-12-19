package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.c.h.a.d */
public abstract class AbstractRunnableC27634d<I, O, F, T> extends AbstractC27620b.AbstractC27629h<O> implements Runnable {

    /* renamed from: a */
    AbstractFutureC27655q<? extends I> f65035a;

    /* renamed from: b */
    F f65036b;

    static {
        Covode.recordClassIndex(33214);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo46252a(F f, I i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo46221a(T t);

    /* access modifiers changed from: protected */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
    /* renamed from: b */
    public final void mo46222b() {
        mo46224a((Future<?>) this.f65035a);
        this.f65035a = null;
        this.f65036b = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
    /* renamed from: a */
    public final String mo46220a() {
        String str;
        AbstractFutureC27655q<? extends I> qVar = this.f65035a;
        F f = this.f65036b;
        String a = super.mo46220a();
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        } else {
            str = "";
        }
        if (f != null) {
            return str + "function=[" + ((Object) f) + "]";
        }
        if (a != null) {
            return str + a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.c.h.a.d<I, O, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        boolean z;
        AbstractFutureC27655q<? extends I> qVar = this.f65035a;
        F f = this.f65036b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (qVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f != null) {
            z2 = false;
        }
        if (!z3 && !z2) {
            this.f65035a = null;
            try {
                try {
                    Object a = mo46252a(f, C27646l.m55297a((Future) qVar));
                    this.f65036b = null;
                    mo46221a(a);
                } catch (UndeclaredThrowableException e) {
                    mo46226a(e.getCause());
                    this.f65036b = null;
                } catch (Throwable th) {
                    this.f65036b = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                mo46226a(e2.getCause());
            } catch (RuntimeException e3) {
                mo46226a((Throwable) e3);
            } catch (Error e4) {
                mo46226a((Throwable) e4);
            }
        }
    }

    /* renamed from: com.google.c.h.a.d$b */
    public static final class C27636b<I, O> extends AbstractRunnableC27634d<I, O, AbstractC27235f<? super I, ? extends O>, O> {
        static {
            Covode.recordClassIndex(33216);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27634d
        /* renamed from: a */
        public final void mo46221a(O o) {
            mo46227b((Object) o);
        }

        public C27636b(AbstractFutureC27655q<? extends I> qVar, AbstractC27235f<? super I, ? extends O> fVar) {
            super(qVar, fVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27634d
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo46252a(Object obj, Object obj2) {
            return ((AbstractC27235f) obj).mo45319a(obj2);
        }
    }

    /* renamed from: com.google.c.h.a.d$a */
    public static final class C27635a<I, O> extends AbstractRunnableC27634d<I, O, AbstractC27637e<? super I, ? extends O>, AbstractFutureC27655q<? extends O>> {
        static {
            Covode.recordClassIndex(33215);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27634d
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo46221a(Object obj) {
            mo46225a((AbstractFutureC27655q) ((AbstractFutureC27655q) obj));
        }

        public C27635a(AbstractFutureC27655q<? extends I> qVar, AbstractC27637e<? super I, ? extends O> eVar) {
            super(qVar, eVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27634d
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo46252a(Object obj, Object obj2) {
            AbstractFutureC27655q<O> a = ((AbstractC27637e) obj).mo46254a(obj2);
            C27245k.m54230a(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a;
        }
    }

    AbstractRunnableC27634d(AbstractFutureC27655q<? extends I> qVar, F f) {
        this.f65035a = (AbstractFutureC27655q) C27245k.m54229a(qVar);
        this.f65036b = (F) C27245k.m54229a(f);
    }
}
