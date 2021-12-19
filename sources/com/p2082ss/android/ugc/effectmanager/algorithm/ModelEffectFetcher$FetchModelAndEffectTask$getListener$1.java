package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.SyncTask;
import com.p2082ss.android.ugc.effectmanager.common.task.SyncTaskListener;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelEffectFetcher$FetchModelAndEffectTask$getListener$1 */
public final class ModelEffectFetcher$FetchModelAndEffectTask$getListener$1 implements SyncTaskListener<EffectTaskResult> {
    final /* synthetic */ ModelEffectFetcher.FetchModelAndEffectTask this$0;

    static {
        Covode.recordClassIndex(95402);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onStart(SyncTask<EffectTaskResult> syncTask) {
        C89219l.m154719c(syncTask, "");
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ModelEffectFetcher$FetchModelAndEffectTask$getListener$1(ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask) {
        this.this$0 = fetchModelAndEffectTask;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onFinally(SyncTask<EffectTaskResult> syncTask) {
        C89219l.m154719c(syncTask, "");
        ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = this.this$0;
        fetchModelAndEffectTask.onFinally(fetchModelAndEffectTask);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult exceptionResult) {
        C89219l.m154719c(syncTask, "");
        C89219l.m154719c(exceptionResult, "");
        ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = this.this$0;
        fetchModelAndEffectTask.onFailed(fetchModelAndEffectTask, exceptionResult);
    }

    public final void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult effectTaskResult) {
        C89219l.m154719c(syncTask, "");
        C89219l.m154719c(effectTaskResult, "");
        ModelEffectFetcher.FetchModelAndEffectTask fetchModelAndEffectTask = this.this$0;
        fetchModelAndEffectTask.onResponse(fetchModelAndEffectTask, effectTaskResult);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.task.SyncTaskListener
    public final void onProgress(SyncTask<EffectTaskResult> syncTask, int i, long j) {
        C89219l.m154719c(syncTask, "");
        this.this$0.onProgress(syncTask, i, j);
    }
}
