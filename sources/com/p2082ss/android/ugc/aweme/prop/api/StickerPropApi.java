package com.p2082ss.android.ugc.aweme.prop.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.prop.p3607c.C65310b;
import com.p2082ss.android.ugc.aweme.sticker.model.C75446h;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.prop.api.StickerPropApi */
public interface StickerPropApi {
    static {
        Covode.recordClassIndex(76745);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/sticker/detail/")
    AbstractFutureC27655q<C75446h> getStickerDetail(@AbstractC89736t(mo144292a = "sticker_ids") String str);

    @AbstractC89722f(mo144276a = "/aweme/v1/sticker/detail/")
    AbstractFutureC27655q<C75446h> getStickerDetail(@AbstractC89736t(mo144292a = "sticker_ids") String str, @AbstractC89736t(mo144292a = "source") int i);

    @AbstractC89722f(mo144276a = "/aweme/v1/sticker/aweme/")
    AbstractFutureC27655q<C65310b> queryStickerAwemeList(@AbstractC89736t(mo144292a = "sticker_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "media_type") int i2);

    @AbstractC89722f(mo144276a = "/aweme/v1/sticker/aweme/")
    AbstractFutureC27655q<C65310b> queryStickerAwemeList(@AbstractC89736t(mo144292a = "sticker_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "source") int i2, @AbstractC89736t(mo144292a = "media_type") int i3);
}
