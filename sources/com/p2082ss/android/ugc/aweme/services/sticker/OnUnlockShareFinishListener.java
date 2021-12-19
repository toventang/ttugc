package com.p2082ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener */
public interface OnUnlockShareFinishListener {
    static {
        Covode.recordClassIndex(79969);
    }

    void onShareAppFailed();

    void onShareAppSucceed(Effect effect);

    void onVKShareSucceed(Effect effect);
}
