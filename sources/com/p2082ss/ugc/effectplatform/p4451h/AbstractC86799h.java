package com.p2082ss.ugc.effectplatform.p4451h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;

/* renamed from: com.ss.ugc.effectplatform.h.h */
public interface AbstractC86799h {
    static {
        Covode.recordClassIndex(102498);
    }

    void onFetchModelList(boolean z, String str, long j, String str2);

    void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc);

    void onModelDownloadStart(Effect effect, ModelInfo modelInfo);

    void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j);

    void onModelNotFound(Effect effect, Exception exc);
}
