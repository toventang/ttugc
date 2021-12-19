package com.p2082ss.android.ugc.aweme.services.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService */
public interface IEffectModelLoggerService {
    static {
        Covode.recordClassIndex(79779);
    }

    void endDownloadEffectModelAlog(Effect effect, Object obj, long j, int i, Exception exc, String str);

    void reportModelListAlog(boolean z, String str, long j, String str2);

    void startDownloadEffectModelAlog(Effect effect, Object obj, String str);
}
