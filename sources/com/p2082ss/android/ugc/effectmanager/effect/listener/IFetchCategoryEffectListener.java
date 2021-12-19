package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener */
public interface IFetchCategoryEffectListener extends IEffectPlatformBaseListener<CategoryPageModel> {
    static {
        Covode.recordClassIndex(95550);
    }

    void onFail(ExceptionResult exceptionResult);
}
