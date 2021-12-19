package com.p2082ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;

/* renamed from: com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult */
public final class FetchSingleAlgorithmModelTaskResult extends BaseTaskResult {
    private final ExceptionResult exceptionResult;
    private final SingleAlgorithmModelResponse response;

    static {
        Covode.recordClassIndex(95772);
    }

    public final ExceptionResult getExceptionResult() {
        return this.exceptionResult;
    }

    public final SingleAlgorithmModelResponse getResponse() {
        return this.response;
    }

    public FetchSingleAlgorithmModelTaskResult(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ExceptionResult exceptionResult2) {
        this.response = singleAlgorithmModelResponse;
        this.exceptionResult = exceptionResult2;
    }
}
