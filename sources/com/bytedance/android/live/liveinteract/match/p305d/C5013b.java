package com.bytedance.android.live.liveinteract.match.p305d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.liveinteract.match.d.b */
public final class C5013b {
    @AbstractC27891c(mo46611a = "battle_id")

    /* renamed from: a */
    public long f13044a;
    @AbstractC27891c(mo46611a = "inviter_gift_permission_type")

    /* renamed from: b */
    public int f13045b;

    static {
        Covode.recordClassIndex(5596);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5013b)) {
            return false;
        }
        C5013b bVar = (C5013b) obj;
        return this.f13044a == bVar.f13044a && this.f13045b == bVar.f13045b;
    }

    public final String toString() {
        return "BattleInviteResult(battleId=" + this.f13044a + ", inviterGiftPermissionType=" + this.f13045b + ")";
    }

    public final int hashCode() {
        long j = this.f13044a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f13045b;
    }
}
