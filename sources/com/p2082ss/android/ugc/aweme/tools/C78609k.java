package com.p2082ss.android.ugc.aweme.tools;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.k */
public final class C78609k {
    static {
        Covode.recordClassIndex(91743);
    }

    /* renamed from: a */
    public static final boolean[] m137209a(InfoStickerModel infoStickerModel) {
        C89219l.m154721d(infoStickerModel, "");
        boolean[] zArr = {false, false};
        if (C84892d.m145850a(infoStickerModel.stickers)) {
            return zArr;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            C89219l.m154716b(stickerItemModel, "");
            if (stickerItemModel.isImageSticker()) {
                zArr[0] = true;
                if (stickerItemModel.cutout) {
                    zArr[1] = true;
                }
            }
        }
        return zArr;
    }
}
