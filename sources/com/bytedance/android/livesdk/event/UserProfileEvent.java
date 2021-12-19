package com.bytedance.android.livesdk.event;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class UserProfileEvent {
    public String clickModule;
    public String content;
    public String interactLogLabel;
    public String mClickUserPosition;
    public String mEventModule;
    public Map<String, String> mRankInfo;
    public String mSource;
    public long msgId;
    public User user;
    public long userId;

    static {
        Covode.recordClassIndex(9294);
    }

    public void setClickModule(String str) {
        this.clickModule = str;
    }

    public void setClickUserPosition(String str) {
        this.mClickUserPosition = str;
    }

    public void setEventModule(String str) {
        this.mEventModule = str;
    }

    public UserProfileEvent(long j) {
        this.clickModule = "";
        this.userId = j;
    }

    public UserProfileEvent(User user2) {
        this.clickModule = "";
        if (user2 != null) {
            this.user = user2;
            return;
        }
        throw new RuntimeException("mUser cannot be null!");
    }

    public UserProfileEvent(User user2, String str) {
        this(user2);
        this.interactLogLabel = str;
    }

    public UserProfileEvent(long j, String str) {
        this.clickModule = "";
        this.userId = j;
        this.clickModule = str;
    }
}
