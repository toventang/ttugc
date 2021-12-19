package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.v */
public final class C9892v extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "from_user_id")

    /* renamed from: a */
    public long f23921a;
    @AbstractC27891c(mo46611a = "left_icon")

    /* renamed from: f */
    public ImageModel f23922f;
    @AbstractC27891c(mo46611a = "notify")

    /* renamed from: g */
    public C9691bw f23923g;

    static {
        Covode.recordClassIndex(11438);
    }

    public C9892v() {
        this.f28131L = EnumC9596a.GIFT_GLOBAL_MESSAGE;
    }
}
