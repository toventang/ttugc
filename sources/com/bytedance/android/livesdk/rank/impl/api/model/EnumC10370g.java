package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.impl.api.model.g */
public enum EnumC10370g {
    UNKNOWN(0),
    HOURLY_RANK_ENTRANCE(1),
    HOURLY_RANK_LIST(2),
    HOURLY_RANK_BOTTOM(3),
    ONLINE_AUDIENCE(4);
    

    /* renamed from: b */
    private final int f25058b;

    public final int getValue() {
        return this.f25058b;
    }

    static {
        Covode.recordClassIndex(11944);
    }

    private EnumC10370g(int i) {
        this.f25058b = i;
    }
}
