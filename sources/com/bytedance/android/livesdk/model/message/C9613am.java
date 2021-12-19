package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.model.message.am */
public class C9613am extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "battle_id")

    /* renamed from: a */
    public long f23350a;
    @AbstractC27891c(mo46611a = "armies")

    /* renamed from: f */
    public Map<Long, C9645j> f23351f;
    @AbstractC27891c(mo46611a = "send_gift_success_time")

    /* renamed from: g */
    public long f23352g;
    @AbstractC27891c(mo46611a = "update_battle_score_time")

    /* renamed from: h */
    public long f23353h;

    static {
        Covode.recordClassIndex(11155);
    }

    public C9613am() {
        this.f28131L = EnumC9596a.LINK_MIC_BATTLE_ARMIES;
    }

    public String toString() {
        return "LinkMicBattleArmiesMessage{armies=" + this.f23351f + '}';
    }
}
