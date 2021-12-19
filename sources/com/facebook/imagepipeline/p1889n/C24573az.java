package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.az */
public final class C24573az {

    /* renamed from: a */
    private boolean f58387a;

    /* renamed from: b */
    private final Deque<Runnable> f58388b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f58389c;

    static {
        Covode.recordClassIndex(28717);
    }

    /* renamed from: c */
    public final synchronized boolean mo40431c() {
        boolean z;
        MethodCollector.m26663i(4922);
        z = this.f58387a;
        MethodCollector.m26664o(4922);
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo40427a() {
        MethodCollector.m26663i(4918);
        this.f58387a = true;
        MethodCollector.m26664o(4918);
    }

    /* renamed from: b */
    public final synchronized void mo40429b() {
        MethodCollector.m26663i(4919);
        this.f58387a = false;
        while (!this.f58388b.isEmpty()) {
            this.f58389c.execute(this.f58388b.pop());
        }
        this.f58388b.clear();
        MethodCollector.m26664o(4919);
    }

    public C24573az(Executor executor) {
        this.f58389c = (Executor) C24091i.m45617a(executor);
    }

    /* renamed from: b */
    public final synchronized void mo40430b(Runnable runnable) {
        MethodCollector.m26663i(4921);
        this.f58388b.remove(runnable);
        MethodCollector.m26664o(4921);
    }

    /* renamed from: a */
    public final synchronized void mo40428a(Runnable runnable) {
        MethodCollector.m26663i(4914);
        if (this.f58387a) {
            this.f58388b.add(runnable);
            MethodCollector.m26664o(4914);
            return;
        }
        this.f58389c.execute(runnable);
        MethodCollector.m26664o(4914);
    }
}
