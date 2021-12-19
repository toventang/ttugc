package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.EffectCheckUpdateResult */
public class EffectCheckUpdateResult extends BaseTaskResult {
    private ExceptionResult exception;
    private boolean isUpdate;

    static {
        Covode.recordClassIndex(95665);
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public EffectCheckUpdateResult(boolean z, ExceptionResult exceptionResult) {
        this.isUpdate = z;
        this.exception = exceptionResult;
    }
}
