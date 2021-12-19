package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.f */
public final class C8841f {

    /* renamed from: a */
    public static final Integer f21710a = 0;
    @AbstractC27891c(mo46611a = "combo_count")

    /* renamed from: b */
    public Integer f21711b;
    @AbstractC27891c(mo46611a = "combo_effect_img")

    /* renamed from: c */
    public ImageModel f21712c;

    static {
        Covode.recordClassIndex(9722);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21711b != null) {
            sb.append(", combo_count=").append(this.f21711b);
        }
        if (this.f21712c != null) {
            sb.append(", combo_effect_img=").append(this.f21712c);
        }
        return sb.replace(0, 2, "GiftComboInfo{").append('}').toString();
    }
}
