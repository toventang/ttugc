package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.EffectListTaskResult */
public class EffectListTaskResult extends BaseTaskResult {
    private List<Effect> effectList;
    private ExceptionResult exception;

    static {
        Covode.recordClassIndex(95666);
    }

    public List<Effect> getEffectList() {
        return this.effectList;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectList(List<Effect> list) {
        this.effectList = list;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public EffectListTaskResult(List<Effect> list, ExceptionResult exceptionResult) {
        this.effectList = list;
        this.exception = exceptionResult;
    }
}
