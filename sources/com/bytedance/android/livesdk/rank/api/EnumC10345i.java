package com.bytedance.android.livesdk.rank.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.api.i */
public enum EnumC10345i {
    HOURLY_RANK(0, "hourly_rank"),
    WEEKLY_RANK(1, "weekly_rank"),
    HOURLY_STAR_HOST_RANK(2, "hourly_star_host_rank");
    

    /* renamed from: b */
    private final int f24996b;

    /* renamed from: c */
    private final String f24997c;

    public final String getRankName() {
        return this.f24997c;
    }

    public final int getType() {
        return this.f24996b;
    }

    static {
        Covode.recordClassIndex(11911);
    }

    private EnumC10345i(int i, String str) {
        this.f24996b = i;
        this.f24997c = str;
    }
}
