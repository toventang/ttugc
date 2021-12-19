package com.p2082ss.android.ugc.aweme.editSticker.model;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.a */
public final class C45936a {
    static {
        Covode.recordClassIndex(54469);
    }

    /* renamed from: a */
    public static final Bitmap m88694a(CoverPublishModel coverPublishModel, Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }
}
