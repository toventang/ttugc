package com.p2082ss.android.ugc.effectmanager.effect.bridge;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.SyncTask;
import com.p2082ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;

/* renamed from: com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher */
public interface EffectFetcher {
    static {
        Covode.recordClassIndex(95542);
    }

    SyncTask<EffectTaskResult> fetchEffect(EffectFetcherArguments effectFetcherArguments);
}
