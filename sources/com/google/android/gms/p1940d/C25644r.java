package com.google.android.gms.p1940d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.d.r */
public final class C25644r<TResult> implements AbstractC25652z<TResult> {

    /* renamed from: a */
    final Object f60772a = new Object();

    /* renamed from: b */
    AbstractC25626c<TResult> f60773b;

    /* renamed from: c */
    private final Executor f60774c;

    static {
        Covode.recordClassIndex(31055);
    }

    public C25644r(Executor executor, AbstractC25626c<TResult> cVar) {
        this.f60774c = executor;
        this.f60773b = cVar;
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: a */
    public final void mo41899a(AbstractC25631h<TResult> hVar) {
        MethodCollector.m26663i(3522);
        synchronized (this.f60772a) {
            try {
                if (this.f60773b != null) {
                    this.f60774c.execute(new RunnableC25645s(this, hVar));
                    MethodCollector.m26664o(3522);
                }
            } finally {
                MethodCollector.m26664o(3522);
            }
        }
    }

    @Override // com.google.android.gms.p1940d.AbstractC25652z
    /* renamed from: N_ */
    public final void mo41898N_() {
        MethodCollector.m26663i(3523);
        synchronized (this.f60772a) {
            try {
                this.f60773b = null;
            } finally {
                MethodCollector.m26664o(3523);
            }
        }
    }
}
