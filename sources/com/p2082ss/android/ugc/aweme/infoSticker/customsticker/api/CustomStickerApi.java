package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22014v;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi */
public interface CustomStickerApi {
    static {
        Covode.recordClassIndex(66564);
    }

    @AbstractC22012t(mo35799a = "/media/api/pic/iss")
    @AbstractC22009q
    AbstractC88979t<CutoutResponse> cutoutSticker(@AbstractC22014v(mo35801a = "file") TypedFile typedFile);
}
