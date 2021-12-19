package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult */
public class FetchCategoryEffectTaskResult extends BaseTaskResult {
    private CategoryPageModel categoryEffectModel;
    private ExceptionResult exception;

    static {
        Covode.recordClassIndex(95669);
    }

    public CategoryPageModel getEffectChannels() {
        return this.categoryEffectModel;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectChannels(CategoryPageModel categoryPageModel) {
        this.categoryEffectModel = categoryPageModel;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public FetchCategoryEffectTaskResult(CategoryPageModel categoryPageModel, ExceptionResult exceptionResult) {
        this.categoryEffectModel = categoryPageModel;
        this.exception = exceptionResult;
    }
}
