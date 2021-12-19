package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.QueryVideoUsedStickerTaskResult */
public class QueryVideoUsedStickerTaskResult extends BaseTaskResult {
    private ExceptionResult exception;
    private EffectListResponse response;

    static {
        Covode.recordClassIndex(95676);
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public EffectListResponse getResponse() {
        return this.response;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setResponse(EffectListResponse effectListResponse) {
        this.response = effectListResponse;
    }

    public QueryVideoUsedStickerTaskResult(EffectListResponse effectListResponse, ExceptionResult exceptionResult) {
        this.response = effectListResponse;
        this.exception = exceptionResult;
    }
}
