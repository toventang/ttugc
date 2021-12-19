package com.p2082ss.android.ugc.aweme.sticker.types.lock;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.lock.a */
public interface AbstractC76085a {
    static {
        Covode.recordClassIndex(89031);
    }

    boolean isLockStickerEnable();

    boolean reallyLockedSticker(Effect effect);
}
