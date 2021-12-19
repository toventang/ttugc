package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNExecutorService */
public final class KNExecutorService implements AbstractExecutorC87997b {
    private final ExecutorService iExecutor;

    static {
        Covode.recordClassIndex(95723);
    }

    @Override // p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b
    public final void shutdown() {
        this.iExecutor.shutdown();
    }

    public KNExecutorService(ExecutorService executorService) {
        C89219l.m154719c(executorService, "");
        this.iExecutor = executorService;
    }

    public final void execute(Runnable runnable) {
        this.iExecutor.execute(new KNExecutorService$execute$1(runnable));
    }
}
