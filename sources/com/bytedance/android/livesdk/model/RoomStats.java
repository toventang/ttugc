package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.C4139e;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;

public class RoomStats implements AbstractC9516ac {
    final int INT_31 = 31;
    final int INT_32 = 32;
    @AbstractC27891c(mo46611a = "enter_count")
    int enterCount;
    @AbstractC27891c(mo46611a = "follow_count")
    int followCount;
    @AbstractC27891c(mo46611a = "gift_uv_count")
    int giftUVCount;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    long f23084id;
    @AbstractC27891c(mo46611a = "id_str")
    String idStr;
    @AbstractC27891c(mo46611a = "replay_viewers")
    public int replayViewers;
    @AbstractC27891c(mo46611a = "share_count")
    int shareCount;
    @AbstractC27891c(mo46611a = "fan_ticket")
    long ticket;
    @AbstractC27891c(mo46611a = "total_user")
    int totalUser;
    @AbstractC27891c(mo46611a = "watermelon")
    int watermelon;

    static {
        Covode.recordClassIndex(11049);
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9516ac
    public int getFollowCount() {
        return this.followCount;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9516ac
    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9516ac
    public long getId() {
        return this.f23084id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9516ac
    public long getTicket() {
        return this.ticket;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9516ac
    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public int hashCode() {
        int i;
        long j = this.f23084id;
        long j2 = this.ticket;
        int i2 = ((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        String str = this.idStr;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.f23084id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setWatermelon(int i) {
        this.watermelon = i;
    }

    public static RoomStats from(AbstractC9516ac acVar) {
        if (acVar == null) {
            return null;
        }
        if (acVar instanceof RoomStats) {
            C27910f fVar = C4139e.C4140a.f11575b;
            return (RoomStats) fVar.mo46670a(fVar.mo46674b(acVar), RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(acVar);
        return roomStats;
    }

    private void initWith(AbstractC9516ac acVar) {
        this.f23084id = acVar.getId();
        this.ticket = acVar.getTicket();
        this.totalUser = acVar.getTotalUser();
        this.followCount = acVar.getFollowCount();
        this.giftUVCount = acVar.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RoomStats roomStats = (RoomStats) obj;
            if (this.f23084id != roomStats.f23084id || this.ticket != roomStats.ticket || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
                return false;
            }
            String str = this.idStr;
            if (str == null ? roomStats.idStr != null : !str.equals(roomStats.idStr)) {
                return false;
            }
            if (this.totalUser == roomStats.totalUser) {
                return true;
            }
        }
        return false;
    }
}
