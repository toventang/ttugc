package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.base.task.k */
final class ExecutorC87490k implements Executor {

    /* renamed from: a */
    final ArrayDeque<Runnable> f198448a = new ArrayDeque<>();

    /* renamed from: b */
    Runnable f198449b;

    static {
        Covode.recordClassIndex(103436);
    }

    ExecutorC87490k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo141558a() {
        MethodCollector.m26663i(5026);
        Runnable poll = this.f198448a.poll();
        this.f198449b = poll;
        if (poll != null) {
            AbstractC87475a.f198422a.execute(this.f198449b);
        }
        MethodCollector.m26664o(5026);
    }

    public final synchronized void execute(final Runnable runnable) {
        MethodCollector.m26663i(5023);
        this.f198448a.offer(new Runnable() {
            /* class com.ttnet.org.chromium.base.task.ExecutorC87490k.RunnableC874911 */

            static {
                Covode.recordClassIndex(103437);
            }

            public final void run() {
                try {
                    runnable.run();
                } finally {
                    ExecutorC87490k.this.mo141558a();
                }
            }
        });
        if (this.f198449b == null) {
            mo141558a();
        }
        MethodCollector.m26664o(5023);
    }
}
