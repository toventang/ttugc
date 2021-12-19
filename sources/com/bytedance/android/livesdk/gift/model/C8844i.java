package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.i */
public final class C8844i {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public C8846j f21724a;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: b */
    public C8845a f21725b;

    static {
        Covode.recordClassIndex(9725);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.model.i$a */
    public static final class C8845a {
        @AbstractC27891c(mo46611a = "log_id")

        /* renamed from: a */
        public String f21726a;

        static {
            Covode.recordClassIndex(9726);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f21726a != null) {
                sb.append(", log_id=").append(this.f21726a);
            }
            return sb.replace(0, 2, "Extra{").append('}').toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21724a != null) {
            sb.append(", data=").append(this.f21724a);
        }
        if (this.f21725b != null) {
            sb.append(", extra=").append(this.f21725b);
        }
        return sb.replace(0, 2, "GiftListResponse{").append('}').toString();
    }
}
