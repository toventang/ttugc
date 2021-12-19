package com.p2082ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.task.result.FavoriteTaskResult */
public class FavoriteTaskResult extends BaseTaskResult {
    private List<String> mEffectIds;
    private ExceptionResult mException;
    private boolean mIsSuccess;

    static {
        Covode.recordClassIndex(95668);
    }

    public List<String> getEffectIds() {
        return this.mEffectIds;
    }

    public ExceptionResult getException() {
        return this.mException;
    }

    public boolean isSuccess() {
        return this.mIsSuccess;
    }

    public FavoriteTaskResult(boolean z, List<String> list, ExceptionResult exceptionResult) {
        ArrayList arrayList = new ArrayList();
        this.mEffectIds = arrayList;
        this.mIsSuccess = z;
        arrayList.clear();
        this.mEffectIds.addAll(list);
        this.mException = exceptionResult;
    }
}
