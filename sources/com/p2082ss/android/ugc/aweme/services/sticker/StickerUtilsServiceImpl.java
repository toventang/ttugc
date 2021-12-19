package com.p2082ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76086b;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76090e;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl */
public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    static {
        Covode.recordClassIndex(79970);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean isLockSticker(Effect effect) {
        return C72847c.m128632b(effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean hasUnlocked(Effect effect) {
        C89219l.m154721d(effect, "");
        return C76086b.m133424a(effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean isScanUnLockType(String str) {
        C89219l.m154721d(str, "");
        if (C76086b.m133421a(str) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean isStickerPreviewable(Effect effect) {
        C89219l.m154721d(effect, "");
        return C75466g.m132364p(effect);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public final boolean idUnlocked(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        ArrayList<String> a = C76090e.m133432a();
        if (a.isEmpty()) {
            return false;
        }
        return a.contains(str);
    }
}
