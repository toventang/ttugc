package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.utils.C9906a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.ci */
public class C9726ci extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public User f23719a;
    @AbstractC27891c(mo46611a = "goods_order")

    /* renamed from: f */
    public C9727a f23720f;

    /* renamed from: com.bytedance.android.livesdk.model.message.ci$a */
    public static class C9727a {
        @AbstractC27891c(mo46611a = "goods_room_order")

        /* renamed from: a */
        public long f23721a;
        @AbstractC27891c(mo46611a = "order_num")

        /* renamed from: b */
        public long f23722b;
        @AbstractC27891c(mo46611a = "order_money")

        /* renamed from: c */
        public long f23723c;
        @AbstractC27891c(mo46611a = "order_id")

        /* renamed from: d */
        public String f23724d;

        static {
            Covode.recordClassIndex(11269);
        }
    }

    static {
        Covode.recordClassIndex(11268);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9726ci() {
        this.f28131L = EnumC9596a.GOODS_ORDER;
    }

    public int hashCode() {
        return C9906a.m18207a(17, Long.valueOf(this.f28134O.f28138d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9726ci) || this.f28134O.f28138d != ((C11777a) obj).f28134O.f28138d) {
            return false;
        }
        return true;
    }
}
