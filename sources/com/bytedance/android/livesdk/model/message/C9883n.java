package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.n */
public class C9883n extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "action")

    /* renamed from: a */
    public int f23882a;
    @AbstractC27891c(mo46611a = "tips")

    /* renamed from: f */
    public String f23883f;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: g */
    public C9884a f23884g;

    /* renamed from: com.bytedance.android.livesdk.model.message.n$a */
    public static class C9884a {
        @AbstractC27891c(mo46611a = "ban_info_url")

        /* renamed from: a */
        public String f23885a;
        @AbstractC27891c(mo46611a = "reason_no")

        /* renamed from: b */
        public long f23886b;
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: c */
        public C9698b f23887c;
        @AbstractC27891c(mo46611a = "violation_reason")

        /* renamed from: d */
        public C9698b f23888d;
        @AbstractC27891c(mo46611a = "display_text")

        /* renamed from: e */
        public C9698b f23889e;

        static {
            Covode.recordClassIndex(11426);
        }
    }

    static {
        Covode.recordClassIndex(11425);
    }

    public C9883n() {
        this.f28131L = EnumC9596a.CONTROL;
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        int i = this.f23882a;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }
}
