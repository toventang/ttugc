package com.p2082ss.android.ugc.gamora.recorder.p4297d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.d.b */
public final class C83624b {
    static {
        Covode.recordClassIndex(97514);
    }

    /* renamed from: a */
    public static final boolean m143964a(FaceStickerBean faceStickerBean) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        C89219l.m154721d(faceStickerBean, "");
        if (!faceStickerBean.isBusi() || faceStickerBean.getFaceStickerCommerceBean() == null || (faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean()) == null || faceStickerCommerceBean.f169521d != 1) {
            return false;
        }
        FaceStickerCommerceBean faceStickerCommerceBean2 = faceStickerBean.getFaceStickerCommerceBean();
        if (faceStickerCommerceBean2 != null) {
            str = faceStickerCommerceBean2.f169520c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }
}
