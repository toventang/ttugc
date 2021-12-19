package com.p2082ss.android.ugc.aweme.services.stitch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.stitch.IStitchService */
public interface IStitchService {
    static {
        Covode.recordClassIndex(79973);
    }

    boolean canUseEffectInStitch(Effect effect);
}
