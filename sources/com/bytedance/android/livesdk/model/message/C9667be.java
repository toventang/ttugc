package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.be */
public final class C9667be extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "start_timestamp")

    /* renamed from: a */
    public long f23524a;
    @AbstractC27891c(mo46611a = "max_enter_time")

    /* renamed from: f */
    public long f23525f;

    static {
        Covode.recordClassIndex(11209);
    }

    public C9667be() {
        this.f28131L = EnumC9596a.OFFICIAL_CHANNEL_USER_MESSAGE;
    }
}
