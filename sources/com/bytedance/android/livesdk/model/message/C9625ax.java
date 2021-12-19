package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.message.ax */
public class C9625ax extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "message_scene")

    /* renamed from: a */
    public String f23440a;
    @AbstractC27891c(mo46611a = "message_entity")

    /* renamed from: f */
    public List<C9626a> f23441f;

    /* renamed from: com.bytedance.android.livesdk.model.message.ax$a */
    public static class C9626a {
        @AbstractC27891c(mo46611a = "notify")

        /* renamed from: a */
        public C9691bw f23442a;

        static {
            Covode.recordClassIndex(11168);
        }
    }

    static {
        Covode.recordClassIndex(11167);
    }

    public C9625ax() {
        this.f28131L = EnumC9596a.MARQUEE_ANNOUNCEMENT_MESSAGE;
    }
}
