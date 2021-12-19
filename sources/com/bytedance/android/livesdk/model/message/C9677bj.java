package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bj */
public class C9677bj extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "question_id")

    /* renamed from: a */
    public long f23551a;
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: f */
    public long f23552f;
    @AbstractC27891c(mo46611a = "scene")

    /* renamed from: g */
    public int f23553g;

    static {
        Covode.recordClassIndex(11219);
    }

    public C9677bj() {
        this.f28131L = EnumC9596a.QUESTION_DELETE_MESSAGE;
    }
}
