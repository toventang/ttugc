package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomConfig */
public class RoomConfig implements Serializable {
    @AbstractC27891c(mo46611a = "enable_emoji")
    public int enableEmoji;
    @AbstractC27891c(mo46611a = "enable_fans_club")
    public int enableFansClub;
    @AbstractC27891c(mo46611a = "enable_hourly_list")
    public int enableHourRank;
    @AbstractC27891c(mo46611a = "enable_send_barrage")
    public int enableSendBarrage;
    @AbstractC27891c(mo46611a = "enable_send_comment")
    public int enableSendComment;
    @AbstractC27891c(mo46611a = "enable_send_gift")
    public int enableSendGift;
    @AbstractC27891c(mo46611a = "enable_send_gift_guide")
    public int enableSendGiftGuide;
    @AbstractC27891c(mo46611a = "enable_send_shortcut_gift")
    public int enableSendShortcutGift;
    @AbstractC27891c(mo46611a = "enable_share")
    public int enableShare;

    static {
        Covode.recordClassIndex(58811);
    }

    private boolean calc(int i, int i2) {
        int i3 = i2 == 0 ? 1 : 2;
        return (i & i3) == i3;
    }

    public boolean enableHourRank(int i) {
        return calc(this.enableHourRank, i);
    }

    public boolean isEnableEmoji(int i) {
        return calc(this.enableEmoji, i);
    }

    public boolean isEnableFansClub(int i) {
        return calc(this.enableFansClub, i);
    }

    public boolean isEnableSendBarrage(int i) {
        return calc(this.enableSendBarrage, i);
    }

    public boolean isEnableSendComment(int i) {
        return calc(this.enableSendComment, i);
    }

    public boolean isEnableSendGift(int i) {
        return calc(this.enableSendGift, i);
    }

    public boolean isEnableSendGiftGuide(int i) {
        return calc(this.enableSendGiftGuide, i);
    }

    public boolean isEnableShare(int i) {
        return calc(this.enableShare, i);
    }

    public boolean isEnableShortcutGift(int i) {
        return calc(this.enableSendShortcutGift, i);
    }
}
