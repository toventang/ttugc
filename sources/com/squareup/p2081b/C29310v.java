package com.squareup.p2081b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29262ae;
import com.squareup.p2081b.C29299t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.v */
public final class C29310v extends ThreadPoolExecutor {
    static {
        Covode.recordClassIndex(35659);
    }

    C29310v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C29262ae.ThreadFactoryC29265b());
    }

    /* renamed from: com.squareup.b.v$a */
    static final class C29311a extends FutureTask<RunnableC29267c> implements Comparable<C29311a> {

        /* renamed from: a */
        private final RunnableC29267c f69557a;

        static {
            Covode.recordClassIndex(35660);
        }

        public C29311a(RunnableC29267c cVar) {
            super(cVar, null);
            this.f69557a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(C29311a aVar) {
            C29311a aVar2 = aVar;
            C29299t.EnumC29306e eVar = this.f69557a.f69447s;
            C29299t.EnumC29306e eVar2 = aVar2.f69557a.f69447s;
            if (eVar == eVar2) {
                return this.f69557a.f69429a - aVar2.f69557a.f69429a;
            }
            return eVar2.ordinal() - eVar.ordinal();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51121a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        C29311a aVar = new C29311a((RunnableC29267c) runnable);
        execute(aVar);
        return aVar;
    }
}
