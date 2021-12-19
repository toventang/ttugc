package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.c */
public final class C8838c {

    /* renamed from: a */
    public static final Long f21697a = 0L;

    /* renamed from: b */
    public static final Boolean f21698b = false;
    @AbstractC27891c(mo46611a = "item")

    /* renamed from: c */
    public C8839d f21699c;
    @AbstractC27891c(mo46611a = "next_expire")

    /* renamed from: d */
    public Long f21700d;
    @AbstractC27891c(mo46611a = "equipped")

    /* renamed from: e */
    public Boolean f21701e;

    static {
        Covode.recordClassIndex(9719);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21699c != null) {
            sb.append(", item=").append(this.f21699c);
        }
        if (this.f21700d != null) {
            sb.append(", next_expire=").append(this.f21700d);
        }
        if (this.f21701e != null) {
            sb.append(", equipped=").append(this.f21701e);
        }
        return sb.replace(0, 2, "DriveBagItem{").append('}').toString();
    }
}
