package com.p2082ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService */
public interface IStickerUtilsService {
    static {
        Covode.recordClassIndex(79968);
    }

    boolean hasUnlocked(Effect effect);

    boolean idUnlocked(String str);

    boolean isLockSticker(Effect effect);

    boolean isScanUnLockType(String str);

    boolean isStickerPreviewable(Effect effect);
}
