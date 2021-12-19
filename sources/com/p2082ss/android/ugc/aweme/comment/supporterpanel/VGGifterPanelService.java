package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.VGGifterPanelService */
public interface VGGifterPanelService {
    static {
        Covode.recordClassIndex(44301);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/gift/gifter_list/")
    AbstractC88979t<C36955b> getGifterPanel(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "gift_id") Long l, @AbstractC89736t(mo144292a = "cursor") Long l2);
}
