package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.at */
public final class C9620at extends AbstractC6571a {

    /* renamed from: i */
    public static final C9621a f23418i = new C9621a((byte) 0);
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public long f23419a;
    @AbstractC27891c(mo46611a = "audit_status")

    /* renamed from: f */
    public int f23420f;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: g */
    public String f23421g;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: h */
    public User f23422h;

    static {
        Covode.recordClassIndex(11162);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.at$a */
    public static final class C9621a {
        static {
            Covode.recordClassIndex(11163);
        }

        private C9621a() {
        }

        public /* synthetic */ C9621a(byte b) {
            this();
        }
    }

    public C9620at() {
        this.f28131L = EnumC9596a.LIVE_INTRO_MESSAGE;
    }
}
