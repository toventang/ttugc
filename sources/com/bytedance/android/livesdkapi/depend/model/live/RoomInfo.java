package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RoomInfo {
    @AbstractC27891c(mo46611a = "anchorId", mo46612b = {"anchor_id"})
    private String anchorId;
    @AbstractC27891c(mo46611a = "roomId", mo46612b = {"room_id"})
    private long roomId;

    static {
        Covode.recordClassIndex(13372);
    }

    public RoomInfo() {
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setRoomId(long j) {
        this.roomId = j;
    }

    public RoomInfo(long j) {
        this.roomId = j;
    }

    public RoomInfo(long j, String str) {
        this.roomId = j;
        this.anchorId = str;
    }
}
