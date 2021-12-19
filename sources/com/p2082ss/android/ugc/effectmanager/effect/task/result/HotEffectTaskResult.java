package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.HotEffectTaskResult */
public class HotEffectTaskResult extends BaseTaskResult {
    private ExceptionResult exception;
    private FetchHotEffectResponse response;

    static {
        Covode.recordClassIndex(95674);
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public FetchHotEffectResponse getResponse() {
        return this.response;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setResponse(FetchHotEffectResponse fetchHotEffectResponse) {
        this.response = fetchHotEffectResponse;
    }

    public HotEffectTaskResult(FetchHotEffectResponse fetchHotEffectResponse, ExceptionResult exceptionResult) {
        this.response = fetchHotEffectResponse;
        this.exception = exceptionResult;
    }
}
