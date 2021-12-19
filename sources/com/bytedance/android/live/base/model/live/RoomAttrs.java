package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.model.AbstractC9515ab;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;

public class RoomAttrs implements AbstractC9515ab {
    @AbstractC27891c(mo46611a = "admin_flag")
    private int adminFlag;
    @AbstractC27891c(mo46611a = "fanticket_this_room")
    public long currentRoomContribution;
    @AbstractC27891c(mo46611a = "rank_this_room")
    public int currentRoomRank;
    @AbstractC27891c(mo46611a = "rank")
    public int rank;
    @AbstractC27891c(mo46611a = "silence_flag")
    private int silenceFlag;

    static {
        Covode.recordClassIndex(3424);
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9515ab
    public int getAdminFlag() {
        return this.adminFlag;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9515ab
    public int getRank() {
        return this.rank;
    }

    @Override // com.bytedance.android.livesdk.model.AbstractC9515ab
    public int getSilenceFlag() {
        return this.silenceFlag;
    }

    public int hashCode() {
        return (((this.silenceFlag * 31) + this.adminFlag) * 31) + this.rank;
    }

    public void setAdminFlag(int i) {
        this.adminFlag = i;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setSilenceFlag(int i) {
        this.silenceFlag = i;
    }

    public static RoomAttrs from(AbstractC9515ab abVar) {
        if (abVar == null) {
            return null;
        }
        if (abVar instanceof RoomAttrs) {
            C27910f fVar = C4139e.C4140a.f11575b;
            return (RoomAttrs) fVar.mo46670a(fVar.mo46674b(abVar), RoomAttrs.class);
        }
        RoomAttrs roomAttrs = new RoomAttrs();
        roomAttrs.initWith(abVar);
        return roomAttrs;
    }

    private void initWith(AbstractC9515ab abVar) {
        this.silenceFlag = abVar.getSilenceFlag();
        this.adminFlag = abVar.getAdminFlag();
        this.rank = abVar.getRank();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RoomAttrs roomAttrs = (RoomAttrs) obj;
            if (this.silenceFlag == roomAttrs.silenceFlag && this.adminFlag == roomAttrs.adminFlag && this.rank == roomAttrs.rank) {
                return true;
            }
        }
        return false;
    }
}
