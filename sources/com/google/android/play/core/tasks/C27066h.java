package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.h */
final class C27066h<ResultT> implements AbstractC27069k<ResultT> {

    /* renamed from: a */
    final Object f64044a = new Object();

    /* renamed from: b */
    final AbstractC27059a f64045b;

    /* renamed from: c */
    private final Executor f64046c;

    static {
        Covode.recordClassIndex(32546);
    }

    public C27066h(Executor executor, AbstractC27059a aVar) {
        this.f64046c = executor;
        this.f64045b = aVar;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27069k
    /* renamed from: a */
    public final void mo44778a(AbstractC27062d<ResultT> dVar) {
        AbstractC27059a aVar;
        MethodCollector.m26663i(12900);
        if (!dVar.mo44774b()) {
            synchronized (this.f64044a) {
                try {
                    aVar = this.f64045b;
                } catch (Throwable th) {
                    MethodCollector.m26664o(12900);
                    throw th;
                }
            }
            if (aVar == null) {
                MethodCollector.m26664o(12900);
                return;
            }
            this.f64046c.execute(new RunnableC27065g(this, dVar));
            MethodCollector.m26664o(12900);
            return;
        }
        MethodCollector.m26664o(12900);
    }
}
