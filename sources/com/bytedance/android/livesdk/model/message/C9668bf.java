package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bf */
public class C9668bf extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "popular_card_info")

    /* renamed from: a */
    public C9669a f23526a;

    /* renamed from: com.bytedance.android.livesdk.model.message.bf$a */
    public static class C9669a {
        @AbstractC27891c(mo46611a = "status")

        /* renamed from: a */
        public int f23527a;
        @AbstractC27891c(mo46611a = "startTime")

        /* renamed from: b */
        public long f23528b;
        @AbstractC27891c(mo46611a = "end_time")

        /* renamed from: c */
        public long f23529c;
        @AbstractC27891c(mo46611a = "enter_number")

        /* renamed from: d */
        public int f23530d;

        static {
            Covode.recordClassIndex(11211);
        }
    }

    static {
        Covode.recordClassIndex(11210);
    }

    public C9668bf() {
        this.f28131L = EnumC9596a.POPULAR_CARD_MESSAGE;
    }
}
