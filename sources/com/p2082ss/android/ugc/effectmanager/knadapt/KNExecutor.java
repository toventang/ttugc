package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNExecutor */
public final class KNExecutor implements AbstractExecutorC87997b {
    private final Executor iExecutor;

    static {
        Covode.recordClassIndex(95721);
    }

    @Override // p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b
    public final void shutdown() {
    }

    public KNExecutor(Executor executor) {
        C89219l.m154719c(executor, "");
        this.iExecutor = executor;
    }

    public final void execute(Runnable runnable) {
        this.iExecutor.execute(new KNExecutor$execute$1(runnable));
    }
}
