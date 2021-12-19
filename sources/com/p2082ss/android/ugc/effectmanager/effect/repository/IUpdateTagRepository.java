package com.p2082ss.android.ugc.effectmanager.effect.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;

/* renamed from: com.ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository */
public interface IUpdateTagRepository {
    static {
        Covode.recordClassIndex(95644);
    }

    String isTagUpdated(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    String updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener);
}
