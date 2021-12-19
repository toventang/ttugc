package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.br */
public class C9685br extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "toast")

    /* renamed from: a */
    public C9686a f23574a;

    /* renamed from: com.bytedance.android.livesdk.model.message.br$a */
    public static class C9686a {
        @AbstractC27891c(mo46611a = "user_id")

        /* renamed from: a */
        public long f23575a;
        @AbstractC27891c(mo46611a = "should_toast")

        /* renamed from: b */
        public boolean f23576b;

        static {
            Covode.recordClassIndex(11228);
        }
    }

    static {
        Covode.recordClassIndex(11227);
    }

    public C9685br() {
        this.f28131L = EnumC9596a.RANK_TOAST_MESSAGE;
    }
}
