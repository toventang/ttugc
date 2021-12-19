package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList */
public interface IFetchFavoriteList extends IEffectPlatformBaseListener<FetchFavoriteListResponse> {
    static {
        Covode.recordClassIndex(95556);
    }

    void onFailed(ExceptionResult exceptionResult);
}
