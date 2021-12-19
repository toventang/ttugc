package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.j */
final class C27068j<ResultT> implements AbstractC27069k<ResultT> {

    /* renamed from: a */
    final Object f64049a = new Object();

    /* renamed from: b */
    final AbstractC27060b<? super ResultT> f64050b;

    /* renamed from: c */
    private final Executor f64051c;

    static {
        Covode.recordClassIndex(32548);
    }

    public C27068j(Executor executor, AbstractC27060b<? super ResultT> bVar) {
        this.f64051c = executor;
        this.f64050b = bVar;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27069k
    /* renamed from: a */
    public final void mo44778a(AbstractC27062d<ResultT> dVar) {
        AbstractC27060b<? super ResultT> bVar;
        MethodCollector.m26663i(11586);
        if (dVar.mo44774b()) {
            synchronized (this.f64049a) {
                try {
                    bVar = this.f64050b;
                } catch (Throwable th) {
                    MethodCollector.m26664o(11586);
                    throw th;
                }
            }
            if (bVar == null) {
                MethodCollector.m26664o(11586);
                return;
            }
            this.f64051c.execute(new RunnableC27067i(this, dVar));
            MethodCollector.m26664o(11586);
            return;
        }
        MethodCollector.m26664o(11586);
    }
}
