package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.al */
public class C9609al extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "notice_type")

    /* renamed from: a */
    public int f23341a;
    @AbstractC27891c(mo46611a = "turn_on_guide")

    /* renamed from: f */
    public C9612c f23342f;
    @AbstractC27891c(mo46611a = "notice_guide")

    /* renamed from: g */
    public C9610a f23343g;

    /* renamed from: com.bytedance.android.livesdk.model.message.al$a */
    public static class C9610a {
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: a */
        public C9611b f23344a;
        @AbstractC27891c(mo46611a = "button_content")

        /* renamed from: b */
        public C9611b f23345b;
        @AbstractC27891c(mo46611a = "user")

        /* renamed from: c */
        public User f23346c;

        static {
            Covode.recordClassIndex(11152);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.al$b */
    public static class C9611b {
        @AbstractC27891c(mo46611a = "text")

        /* renamed from: a */
        public String f23347a;

        static {
            Covode.recordClassIndex(11153);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.al$c */
    public static class C9612c {
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: a */
        public C9611b f23348a;
        @AbstractC27891c(mo46611a = "button_content")

        /* renamed from: b */
        public C9611b f23349b;

        static {
            Covode.recordClassIndex(11154);
        }
    }

    static {
        Covode.recordClassIndex(11151);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9609al() {
        this.f28131L = EnumC9596a.LINK_AUDIENCE_NOTICE;
    }
}
