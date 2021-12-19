package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.c.h.a.j */
public abstract class AbstractC27643j<V> extends AbstractFutureC27642i<V> implements AbstractFutureC27655q<V> {
    static {
        Covode.recordClassIndex(33223);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractFutureC27655q<? extends V> mo45371c();

    /* renamed from: com.google.c.h.a.j$a */
    public static abstract class AbstractC27644a<V> extends AbstractC27643j<V> {

        /* renamed from: a */
        private final AbstractFutureC27655q<V> f65043a;

        static {
            Covode.recordClassIndex(33224);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27642i, com.google.p1998c.p2006h.p2007a.AbstractC27643j
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Future mo46256a() {
            return this.f65043a;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27643j
        /* renamed from: b */
        public final AbstractFutureC27655q<V> mo46262b() {
            return this.f65043a;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27533u, com.google.p1998c.p2006h.p2007a.AbstractFutureC27642i, com.google.p1998c.p2006h.p2007a.AbstractC27643j
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo45371c() {
            return this.f65043a;
        }

        protected AbstractC27644a(AbstractFutureC27655q<V> qVar) {
            this.f65043a = (AbstractFutureC27655q) C27245k.m54229a(qVar);
        }
    }

    protected AbstractC27643j() {
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q
    /* renamed from: a */
    public final void mo5481a(Runnable runnable, Executor executor) {
        mo45371c().mo5481a(runnable, executor);
    }
}
