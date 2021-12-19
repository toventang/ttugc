package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.base.task.c */
final /* synthetic */ class ExecutorC87480c implements Executor {

    /* renamed from: a */
    static final Executor f198434a = new ExecutorC87480c();

    static {
        Covode.recordClassIndex(103426);
    }

    private ExecutorC87480c() {
    }

    public final void execute(Runnable runnable) {
        MethodCollector.m26663i(3352);
        C87496p pVar = C87496p.f198454b;
        synchronized (PostTask.f198405a) {
            try {
                if (PostTask.f198406b != null || pVar.f198471r) {
                    PostTask.f198407c[pVar.f198469p].mo141556a(pVar, runnable);
                } else {
                    PostTask.nativePostDelayedTask(pVar.f198465l, pVar.f198466m, pVar.f198467n, pVar.f198468o, pVar.f198469p, pVar.f198470q, runnable, 0);
                }
            } finally {
                MethodCollector.m26664o(3352);
            }
        }
    }
}
