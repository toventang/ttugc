package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import java.lang.Throwable;
import java.util.concurrent.Future;

/* renamed from: com.google.c.h.a.a */
abstract class AbstractRunnableC27618a<V, X extends Throwable, F, T> extends AbstractC27620b.AbstractC27629h<V> implements Runnable {

    /* renamed from: a */
    AbstractFutureC27655q<? extends V> f64999a;

    /* renamed from: b */
    Class<X> f65000b;

    /* renamed from: c */
    F f65001c;

    static {
        Covode.recordClassIndex(33198);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo46219a(F f, X x);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo46221a(T t);

    /* access modifiers changed from: protected */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
    /* renamed from: b */
    public final void mo46222b() {
        mo46224a((Future<?>) this.f64999a);
        this.f64999a = null;
        this.f65000b = null;
        this.f65001c = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
    /* renamed from: a */
    public final String mo46220a() {
        String str;
        AbstractFutureC27655q<? extends V> qVar = this.f64999a;
        Class<X> cls = this.f65000b;
        F f = this.f65001c;
        String a = super.mo46220a();
        if (qVar != null) {
            str = "inputFuture=[" + qVar + "], ";
        } else {
            str = "";
        }
        if (cls != null && f != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + ((Object) f) + "]";
        }
        if (a != null) {
            return str + a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.c.h.a.a<V, X extends java.lang.Throwable, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.c.h.a.q<? extends V> r5 = r6.f64999a
            java.lang.Class<X extends java.lang.Throwable> r4 = r6.f65000b
            F r3 = r6.f65001c
            r2 = 1
            r0 = 0
            if (r5 != 0) goto L_0x001e
            r1 = 1
        L_0x000b:
            if (r4 != 0) goto L_0x001c
            r0 = 1
        L_0x000e:
            r1 = r1 | r0
            if (r3 != 0) goto L_0x001a
        L_0x0011:
            r2 = r2 | r1
            boolean r0 = r6.isCancelled()
            r2 = r2 | r0
            if (r2 == 0) goto L_0x0020
            return
        L_0x001a:
            r2 = 0
            goto L_0x0011
        L_0x001c:
            r0 = 0
            goto L_0x000e
        L_0x001e:
            r1 = 0
            goto L_0x000b
        L_0x0020:
            r2 = 0
            r6.f64999a = r2
            java.lang.Object r0 = com.google.p1998c.p2006h.p2007a.C27646l.m55297a(r5)     // Catch:{ ExecutionException -> 0x0028, all -> 0x003a }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Object r1 = com.google.p1998c.p1999a.C27245k.m54229a(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0 = r2
            if (r1 != 0) goto L_0x003b
        L_0x0036:
            r6.mo46227b(r0)
            return
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            boolean r0 = r4.isInstance(r1)
            if (r0 != 0) goto L_0x0045
            r6.mo46226a(r1)
            return
        L_0x0045:
            java.lang.Object r0 = r6.mo46219a(r3, r1)     // Catch:{ all -> 0x0051 }
            r6.f65000b = r2
            r6.f65001c = r2
            r6.mo46221a(r0)
            return
        L_0x0051:
            r0 = move-exception
            r6.mo46226a(r0)     // Catch:{ all -> 0x005a }
            r6.f65000b = r2
            r6.f65001c = r2
            return
        L_0x005a:
            r0 = move-exception
            r6.f65000b = r2
            r6.f65001c = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2006h.p2007a.AbstractRunnableC27618a.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.a$a */
    public static final class C27619a<V, X extends Throwable> extends AbstractRunnableC27618a<V, X, AbstractC27637e<? super X, ? extends V>, AbstractFutureC27655q<? extends V>> {
        static {
            Covode.recordClassIndex(33199);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27618a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo46221a(Object obj) {
            mo46225a((AbstractFutureC27655q) ((AbstractFutureC27655q) obj));
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractRunnableC27618a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo46219a(Object obj, Throwable th) {
            AbstractFutureC27655q a = ((AbstractC27637e) obj).mo46254a(th);
            C27245k.m54230a(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a;
        }

        C27619a(AbstractFutureC27655q<? extends V> qVar, Class<X> cls, AbstractC27637e<? super X, ? extends V> eVar) {
            super(qVar, cls, eVar);
        }
    }

    AbstractRunnableC27618a(AbstractFutureC27655q<? extends V> qVar, Class<X> cls, F f) {
        this.f64999a = (AbstractFutureC27655q) C27245k.m54229a(qVar);
        this.f65000b = (Class) C27245k.m54229a(cls);
        this.f65001c = (F) C27245k.m54229a(f);
    }
}
