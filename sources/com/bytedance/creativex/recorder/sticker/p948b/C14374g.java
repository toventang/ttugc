package com.bytedance.creativex.recorder.sticker.p948b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import org.json.JSONObject;

/* renamed from: com.bytedance.creativex.recorder.sticker.b.g */
public final class C14374g {
    static {
        Covode.recordClassIndex(16447);
    }

    /* renamed from: a */
    public static boolean m26230a(FaceStickerBean faceStickerBean) {
        if (C75466g.m132346a("GreenScreen", faceStickerBean) || C75466g.m132346a("BackgroundVideo", faceStickerBean) || ((faceStickerBean != null && faceStickerBean != FaceStickerBean.NONE && C72847c.m128629a(faceStickerBean.getSdkExtra(), "BackgroundVideo")) || m26231b(faceStickerBean))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m26231b(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra()) || !faceStickerBean.getSdkExtra().contains("pl") || !faceStickerBean.getSdkExtra().contains("alg")) {
            return false;
        }
        try {
            return new JSONObject(faceStickerBean.getSdkExtra()).has("pl");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
