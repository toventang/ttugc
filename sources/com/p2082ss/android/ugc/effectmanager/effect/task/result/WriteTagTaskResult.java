package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.WriteTagTaskResult */
public class WriteTagTaskResult extends BaseTaskResult {
    private ExceptionResult mException;
    private String mId;

    static {
        Covode.recordClassIndex(95680);
    }

    public ExceptionResult getException() {
        return this.mException;
    }

    public String getId() {
        return this.mId;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.mException = exceptionResult;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public WriteTagTaskResult(String str, ExceptionResult exceptionResult) {
        this.mId = str;
        this.mException = exceptionResult;
    }
}
