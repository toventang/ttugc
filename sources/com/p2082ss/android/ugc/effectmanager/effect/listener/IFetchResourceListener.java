package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener */
public interface IFetchResourceListener extends IEffectPlatformBaseListener<ResourceListModel> {
    static {
        Covode.recordClassIndex(95560);
    }

    void onFail(ExceptionResult exceptionResult);
}
