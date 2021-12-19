package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

public class MediaRecommendReason {
    @AbstractC27891c(mo46611a = "city")
    private String city;
    @AbstractC27891c(mo46611a = "friend_name")
    private String friendName;
    @AbstractC27891c(mo46611a = "reason")
    private String reason;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(3435);
    }

    public String getCity() {
        return this.city;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getReason() {
        return this.reason;
    }

    public int getType() {
        return this.type;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
