package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.FetchEffectListByIdTaskResult */
public class FetchEffectListByIdTaskResult extends BaseTaskResult {
    private ExceptionResult exception;
    private EffectListResponse response;

    static {
        Covode.recordClassIndex(95670);
    }

    public EffectListResponse getEffectResponse() {
        return this.response;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectResponse(EffectListResponse effectListResponse) {
        this.response = effectListResponse;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public FetchEffectListByIdTaskResult(EffectListResponse effectListResponse, ExceptionResult exceptionResult) {
        this.response = effectListResponse;
        this.exception = exceptionResult;
    }
}
