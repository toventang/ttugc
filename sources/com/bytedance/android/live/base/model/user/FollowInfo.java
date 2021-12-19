package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class FollowInfo {
    @AbstractC27891c(mo46611a = "follow_status")
    long followStatus;
    @AbstractC27891c(mo46611a = "follower_count")
    long followerCount;
    @AbstractC27891c(mo46611a = "following_count")
    long followingCount;
    @AbstractC27891c(mo46611a = "push_status")
    long pushStatus;

    static {
        Covode.recordClassIndex(3448);
    }

    public long getFollowStatus() {
        return this.followStatus;
    }

    public long getFollowerCount() {
        return this.followerCount;
    }

    public long getFollowingCount() {
        return this.followingCount;
    }

    public long getPushStatus() {
        return this.pushStatus;
    }

    public int hashCode() {
        long j = this.followingCount;
        long j2 = this.followerCount;
        long j3 = this.followStatus;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public void setFollowStatus(long j) {
        this.followStatus = j;
    }

    public void setFollowerCount(long j) {
        this.followerCount = j;
    }

    public void setFollowingCount(long j) {
        this.followingCount = j;
    }

    public void setPushStatus(long j) {
        this.pushStatus = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FollowInfo followInfo = (FollowInfo) obj;
            if (this.followingCount == followInfo.followingCount && this.followerCount == followInfo.followerCount && this.followStatus == followInfo.followStatus) {
                return true;
            }
        }
        return false;
    }
}
