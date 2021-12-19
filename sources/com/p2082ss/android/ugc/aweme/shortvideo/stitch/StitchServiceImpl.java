package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p2082ss.android.ugc.aweme.services.stitch.IStitchService;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchServiceImpl */
public final class StitchServiceImpl implements IStitchService {
    static {
        Covode.recordClassIndex(85830);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.stitch.IStitchService
    public final boolean canUseEffectInStitch(Effect effect) {
        if (effect == null) {
            return false;
        }
        IStickerUtilsService stickerInfo = AVExternalServiceImpl.m113114a().infoService().stickerInfo();
        if (C75466g.m132347a("voice_recognization", effect) || C72847c.m128638d(effect) || C72847c.m128639e(effect) || C75466g.m132354f(effect) || C72847c.m128641g(effect) || C75466g.m132357i(effect) || C72847c.m128640f(effect) || (stickerInfo.isLockSticker(effect) && !stickerInfo.hasUnlocked(effect))) {
            return false;
        }
        return true;
    }
}
