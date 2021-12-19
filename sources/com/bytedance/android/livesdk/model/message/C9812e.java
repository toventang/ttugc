package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.model.message.e */
public class C9812e extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "event")

    /* renamed from: a */
    public C9813a f23823a;
    @AbstractC27891c(mo46611a = "msg_type")

    /* renamed from: f */
    public int f23824f;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: g */
    public ImageModel f23825g;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: h */
    public C9698b f23826h;

    /* renamed from: com.bytedance.android.livesdk.model.message.e$a */
    public static class C9813a {
        @AbstractC27891c(mo46611a = "event_name")

        /* renamed from: a */
        public String f23827a;
        @AbstractC27891c(mo46611a = "params")

        /* renamed from: b */
        public Map<String, String> f23828b;

        static {
            Covode.recordClassIndex(11355);
        }
    }

    static {
        Covode.recordClassIndex(11354);
    }

    public C9812e() {
        this.f28131L = EnumC9596a.BARRAGE_MESSAGE;
    }
}
