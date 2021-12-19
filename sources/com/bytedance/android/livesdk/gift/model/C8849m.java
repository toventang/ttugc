package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.m */
public final class C8849m {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public C8859w f21743a;

    static {
        Covode.recordClassIndex(9730);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21743a != null) {
            sb.append(", data=").append(this.f21743a);
        }
        return sb.replace(0, 2, "GiftSendResponse{").append('}').toString();
    }
}
