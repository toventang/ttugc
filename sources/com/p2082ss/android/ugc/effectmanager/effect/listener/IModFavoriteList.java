package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList */
public interface IModFavoriteList extends IEffectPlatformBaseListener<List<String>> {
    static {
        Covode.recordClassIndex(95562);
    }

    void onFail(ExceptionResult exceptionResult);
}
