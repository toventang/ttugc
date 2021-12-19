package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UrgeStruct */
public class UrgeStruct implements Serializable {
    @AbstractC27891c(mo46611a = "block_urge_setting")
    private int blockUrgeSetting;
    @AbstractC27891c(mo46611a = "latest_aweme_time")
    private long latestAwemeTime;
    @AbstractC27891c(mo46611a = "latest_room_time")
    private long latestRoomTime;
    @AbstractC27891c(mo46611a = "urge_unread_count")
    private long urgeUnreadCount;
    @AbstractC27891c(mo46611a = "user_urged")
    private int userUrged;

    static {
        Covode.recordClassIndex(75217);
    }

    public int getBlockUrgeSetting() {
        return this.blockUrgeSetting;
    }

    public long getLatestAwemeTime() {
        return this.latestAwemeTime;
    }

    public long getLatestRoomTime() {
        return this.latestRoomTime;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public int getUserUrged() {
        return this.userUrged;
    }

    public boolean shouldHostShowTip() {
        if (this.blockUrgeSetting != 0 || this.urgeUnreadCount <= 0) {
            return false;
        }
        return true;
    }

    public void setBlockUrgeSetting(int i) {
        this.blockUrgeSetting = i;
    }

    public void setLatestAwemeTime(long j) {
        this.latestAwemeTime = j;
    }

    public void setLatestRoomTime(long j) {
        this.latestRoomTime = j;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }

    public void setUserUrged(int i) {
        this.userUrged = i;
    }
}
