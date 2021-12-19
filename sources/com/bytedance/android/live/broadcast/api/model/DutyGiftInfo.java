package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class DutyGiftInfo {
    @AbstractC27891c(mo46611a = "duty_id")
    public long mDutyId;
    @AbstractC27891c(mo46611a = "speedy_gift_id")
    private long mGiftId;
    @AbstractC27891c(mo46611a = "contribute_most")
    private User mMvpUser;
    @AbstractC27891c(mo46611a = "score")
    private long mScore;
    @AbstractC27891c(mo46611a = "stage_count")
    private long mStageCount;
    @AbstractC27891c(mo46611a = "status")
    private int mStatus;
    private int mSuccess;
    @AbstractC27891c(mo46611a = "target_score")
    private long mTargetScore;

    static {
        Covode.recordClassIndex(3546);
    }

    public long getDutyId() {
        return this.mDutyId;
    }

    public long getGiftId() {
        return this.mGiftId;
    }

    public User getMvpUser() {
        return this.mMvpUser;
    }

    public long getScore() {
        return this.mScore;
    }

    public long getStageCount() {
        return this.mStageCount;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTargetScore() {
        return this.mTargetScore;
    }

    public int isSuccess() {
        return this.mSuccess;
    }

    public boolean isFinished() {
        if (this.mStatus == 4) {
            return true;
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.mStatus == 2) {
            return true;
        }
        return false;
    }

    public void setDutyId(long j) {
        this.mDutyId = j;
    }

    public void setGiftId(long j) {
        this.mGiftId = j;
    }

    public void setMvpUser(User user) {
        this.mMvpUser = user;
    }

    public void setScore(long j) {
        this.mScore = j;
    }

    public void setStageCount(long j) {
        this.mStageCount = j;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setSuccess(int i) {
        this.mSuccess = i;
    }

    public void setTargetScore(long j) {
        this.mTargetScore = j;
    }
}
