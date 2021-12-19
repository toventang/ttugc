package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener */
public interface IFetchPanelInfoListener extends IEffectPlatformBaseListener<PanelInfoModel> {
    static {
        Covode.recordClassIndex(95558);
    }

    void onFail(ExceptionResult exceptionResult);
}
