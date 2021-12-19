package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.d.k */
public final class C25635k {

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.d.k$b */
    public interface AbstractC25637b extends AbstractC25625b, AbstractC25627d, AbstractC25628e<Object> {
        static {
            Covode.recordClassIndex(31048);
        }
    }

    static {
        Covode.recordClassIndex(31046);
    }

    /* renamed from: a */
    public static <TResult> AbstractC25631h<TResult> m49512a(TResult tresult) {
        C25622ac acVar = new C25622ac();
        acVar.mo41879a((Object) tresult);
        return acVar;
    }

    /* renamed from: com.google.android.gms.d.k$a */
    public static final class C25636a implements AbstractC25637b {

        /* renamed from: a */
        public final CountDownLatch f60757a;

        static {
            Covode.recordClassIndex(31047);
        }

        private C25636a() {
            this.f60757a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.p1940d.AbstractC25628e
        /* renamed from: a */
        public final void mo34354a(Object obj) {
            this.f60757a.countDown();
        }

        @Override // com.google.android.gms.p1940d.AbstractC25627d
        /* renamed from: a */
        public final void mo34353a(Exception exc) {
            this.f60757a.countDown();
        }

        @Override // com.google.android.gms.p1940d.AbstractC25625b
        /* renamed from: a */
        public final void mo41891a() {
            this.f60757a.countDown();
        }

        public /* synthetic */ C25636a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static <TResult> AbstractC25631h<TResult> m49511a(Exception exc) {
        C25622ac acVar = new C25622ac();
        acVar.mo41878a(exc);
        return acVar;
    }

    /* renamed from: a */
    public static <TResult> AbstractC25631h<TResult> m49513a(Executor executor, Callable<TResult> callable) {
        C25565r.m49315a(executor, "Executor must not be null");
        C25565r.m49315a(callable, "Callback must not be null");
        C25622ac acVar = new C25622ac();
        executor.execute(new RunnableC25624ad(acVar, callable));
        return acVar;
    }

    /* renamed from: a */
    public static <TResult> TResult m49514a(AbstractC25631h<TResult> hVar) {
        if (hVar.mo41882b()) {
            return hVar.mo41886d();
        }
        if (hVar.mo41885c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.mo41887e());
    }

    /* renamed from: a */
    public static void m49516a(AbstractC25631h<?> hVar, AbstractC25637b bVar) {
        hVar.mo41875a(C25633j.f60755b, (AbstractC25628e<? super Object>) bVar);
        hVar.mo41874a(C25633j.f60755b, (AbstractC25627d) bVar);
        hVar.mo41872a(C25633j.f60755b, (AbstractC25625b) bVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m49515a(AbstractC25631h<TResult> hVar, long j, TimeUnit timeUnit) {
        C25565r.m49326c("Must not be called on the main application thread");
        C25565r.m49315a(hVar, "Task must not be null");
        C25565r.m49315a(timeUnit, "TimeUnit must not be null");
        if (hVar.mo41880a()) {
            return (TResult) m49514a((AbstractC25631h) hVar);
        }
        C25636a aVar = new C25636a((byte) 0);
        m49516a((AbstractC25631h<?>) hVar, (AbstractC25637b) aVar);
        if (aVar.f60757a.await(j, timeUnit)) {
            return (TResult) m49514a((AbstractC25631h) hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
