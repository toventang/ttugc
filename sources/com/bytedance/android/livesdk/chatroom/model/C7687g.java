package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.g */
public final class C7687g {
    @AbstractC27891c(mo46611a = "is_banned_forever")

    /* renamed from: a */
    public boolean f19045a;
    @AbstractC27891c(mo46611a = "ban_time_left")

    /* renamed from: b */
    public long f19046b;
    @AbstractC27891c(mo46611a = "ban_time")

    /* renamed from: c */
    public long f19047c;
    @AbstractC27891c(mo46611a = "ban_duration")

    /* renamed from: d */
    public long f19048d;

    static {
        Covode.recordClassIndex(8469);
    }

    public final String toString() {
        return "LatestBanRecordInfo{isBannedForever=" + this.f19045a + ", banTimeLeft=" + this.f19046b + ", banTime=" + this.f19047c + ", banDuration=" + this.f19048d + '}';
    }
}
