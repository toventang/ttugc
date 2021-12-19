package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.b.i */
public class C9644i {
    @AbstractC27891c(mo46611a = "channel_id")

    /* renamed from: a */
    public long f23493a;
    @AbstractC27891c(mo46611a = "battle_id")

    /* renamed from: b */
    public long f23494b;
    @AbstractC27891c(mo46611a = "start_time_ms")

    /* renamed from: c */
    public long f23495c;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: d */
    public int f23496d;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: e */
    public int f23497e;
    @AbstractC27891c(mo46611a = "invite_type")

    /* renamed from: f */
    public int f23498f;

    static {
        Covode.recordClassIndex(11186);
    }

    public String toString() {
        return "BattleSetting{channelId=" + this.f23493a + ", battleId=" + this.f23494b + ", startTimeMs=" + this.f23495c + ", duration=" + this.f23496d + ", status=" + this.f23497e + ", inviteType=" + this.f23498f + '}';
    }
}
