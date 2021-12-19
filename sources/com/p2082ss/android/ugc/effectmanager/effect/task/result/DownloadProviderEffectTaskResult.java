package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.DownloadProviderEffectTaskResult */
public class DownloadProviderEffectTaskResult extends BaseTaskResult {
    private ProviderEffect effect;
    private ExceptionResult exception;
    private int progress;
    private long totalSize;

    static {
        Covode.recordClassIndex(95663);
    }

    public ProviderEffect getEffect() {
        return this.effect;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public int getProgress() {
        return this.progress;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public void setEffect(ProviderEffect providerEffect) {
        this.effect = providerEffect;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public DownloadProviderEffectTaskResult setProgress(int i) {
        this.progress = i;
        return this;
    }

    public DownloadProviderEffectTaskResult setTotalSize(long j) {
        this.totalSize = j;
        return this;
    }

    public DownloadProviderEffectTaskResult(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
        this(providerEffect, exceptionResult, -1, -1);
    }

    public DownloadProviderEffectTaskResult(ProviderEffect providerEffect, ExceptionResult exceptionResult, int i, long j) {
        this.effect = providerEffect;
        this.exception = exceptionResult;
        this.progress = i;
        this.totalSize = j;
    }
}
