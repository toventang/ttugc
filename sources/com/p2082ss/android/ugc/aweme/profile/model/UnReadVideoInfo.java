package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UnReadVideoInfo */
public final class UnReadVideoInfo implements Serializable {
    @AbstractC27891c(mo46611a = "latest_unread_video_created_time")
    public long latestUnreadVideoCreatedTime;
    @AbstractC27891c(mo46611a = "unread_count")
    public int unReadCount;

    static {
        Covode.recordClassIndex(75215);
    }

    public UnReadVideoInfo() {
    }

    /* renamed from: com_ss_android_ugc_aweme_profile_model_UnReadVideoInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m115455x663047ef(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_profile_model_UnReadVideoInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m115456x663047ef(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ UnReadVideoInfo copy$default(UnReadVideoInfo unReadVideoInfo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unReadVideoInfo.unReadCount;
        }
        if ((i2 & 2) != 0) {
            j = unReadVideoInfo.latestUnreadVideoCreatedTime;
        }
        return unReadVideoInfo.copy(i, j);
    }

    public final int component1() {
        return this.unReadCount;
    }

    public final long component2() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final UnReadVideoInfo copy(int i, long j) {
        return new UnReadVideoInfo(i, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnReadVideoInfo)) {
            return false;
        }
        UnReadVideoInfo unReadVideoInfo = (UnReadVideoInfo) obj;
        return this.unReadCount == unReadVideoInfo.unReadCount && this.latestUnreadVideoCreatedTime == unReadVideoInfo.latestUnreadVideoCreatedTime;
    }

    public final int hashCode() {
        return (m115455x663047ef(this.unReadCount) * 31) + m115456x663047ef(this.latestUnreadVideoCreatedTime);
    }

    public final String toString() {
        return "UnReadVideoInfo(unReadCount=" + this.unReadCount + ", latestUnreadVideoCreatedTime=" + this.latestUnreadVideoCreatedTime + ")";
    }

    public final long getLatestUnreadVideoCreatedTime() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public UnReadVideoInfo(int i, long j) {
        this.unReadCount = i;
        this.latestUnreadVideoCreatedTime = j;
    }
}
