package com.p2082ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* renamed from: com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener */
public interface ICheckChannelListener {
    static {
        Covode.recordClassIndex(95544);
    }

    void checkChannelFailed(ExceptionResult exceptionResult);

    void checkChannelSuccess(boolean z);
}
