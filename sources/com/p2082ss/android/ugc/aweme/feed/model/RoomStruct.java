package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RoomStruct */
public class RoomStruct implements Serializable {
    @AbstractC27891c(mo46611a = "height")
    public int height;
    @AbstractC27891c(mo46611a = "live_type_audio")
    public boolean liveTypeAudio;
    @AbstractC27891c(mo46611a = "room_id")
    public long roomId;
    @AbstractC27891c(mo46611a = "tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;
    @AbstractC27891c(mo46611a = "user_count")
    private int userCount;
    @AbstractC27891c(mo46611a = "width")
    public int width;
    @AbstractC27891c(mo46611a = "with_linkmic")
    public boolean withLinkmic;

    static {
        Covode.recordClassIndex(58754);
    }

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}
