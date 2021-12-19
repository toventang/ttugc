package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bd */
public class C9666bd extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "end_timestamp")

    /* renamed from: a */
    public long f23522a;
    @AbstractC27891c(mo46611a = "channel_uid")

    /* renamed from: f */
    public long f23523f;

    static {
        Covode.recordClassIndex(11208);
    }

    public C9666bd() {
        this.f28131L = EnumC9596a.OFFICIAL_CHANNEL_MODIFY_MESSAGE;
    }
}
