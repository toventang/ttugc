package com.bytedance.android.livesdkapi.ping;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class PingResult {
    @AbstractC27891c(mo46611a = "mosaic_status")
    private int mosaicStatus;
    @AbstractC27891c(mo46611a = "next_ping")
    private long nextPingInterval;
    @AbstractC27891c(mo46611a = "room_id")
    private long roomId;
    @AbstractC27891c(mo46611a = "room_status")
    private int roomStatus;

    static {
        Covode.recordClassIndex(13545);
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setRoomId(long j) {
        this.roomId = j;
    }

    public void setRoomStatus(int i) {
        this.roomStatus = i;
    }
}
