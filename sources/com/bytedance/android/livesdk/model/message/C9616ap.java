package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.ap */
public class C9616ap extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "channel_id")

    /* renamed from: a */
    public long f23372a;
    @AbstractC27891c(mo46611a = "battle_id")

    /* renamed from: f */
    public long f23373f;
    @AbstractC27891c(mo46611a = "op_uid")

    /* renamed from: g */
    public long f23374g;
    @AbstractC27891c(mo46611a = "reason")

    /* renamed from: h */
    public int f23375h;

    static {
        Covode.recordClassIndex(11158);
    }

    public C9616ap() {
        this.f28131L = EnumC9596a.LINK_MIC_BATTLE_PUNISH_FINISH;
    }

    /* renamed from: c */
    public final boolean mo16570c() {
        if (this.f23375h == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "LinkMicBattlePunishFinishMessage{channelId=" + this.f23372a + ", opUid=" + this.f23374g + ", reason=" + this.f23375h + '}';
    }
}
