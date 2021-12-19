package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.FetchResourceListTaskResult */
public class FetchResourceListTaskResult extends BaseTaskResult {
    private ExceptionResult mException;
    private ResourceListModel result;

    static {
        Covode.recordClassIndex(95673);
    }

    public ExceptionResult getException() {
        return this.mException;
    }

    public ResourceListModel getResult() {
        return this.result;
    }

    public void setResult(ResourceListModel resourceListModel) {
        this.result = resourceListModel;
    }

    public FetchResourceListTaskResult(ExceptionResult exceptionResult) {
        this.mException = exceptionResult;
    }

    public FetchResourceListTaskResult(ResourceListModel resourceListModel) {
        this.result = resourceListModel;
    }
}
