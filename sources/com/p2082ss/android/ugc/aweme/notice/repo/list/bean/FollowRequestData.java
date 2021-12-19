package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData */
public final class FollowRequestData {
    @AbstractC27891c(mo46611a = "create_time")
    private final long createTime;
    @AbstractC27891c(mo46611a = "from_user")
    private final User user;

    static {
        Covode.recordClassIndex(72336);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequestData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111640xb888b2b5(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ FollowRequestData copy$default(FollowRequestData followRequestData, User user2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = followRequestData.user;
        }
        if ((i & 2) != 0) {
            j = followRequestData.createTime;
        }
        return followRequestData.copy(user2, j);
    }

    public final User component1() {
        return this.user;
    }

    public final long component2() {
        return this.createTime;
    }

    public final FollowRequestData copy(User user2, long j) {
        C89219l.m154721d(user2, "");
        return new FollowRequestData(user2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRequestData)) {
            return false;
        }
        FollowRequestData followRequestData = (FollowRequestData) obj;
        return C89219l.m154714a(this.user, followRequestData.user) && this.createTime == followRequestData.createTime;
    }

    public final int hashCode() {
        User user2 = this.user;
        return ((user2 != null ? user2.hashCode() : 0) * 31) + m111640xb888b2b5(this.createTime);
    }

    public final String toString() {
        return "FollowRequestData(user=" + this.user + ", createTime=" + this.createTime + ")";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final User getUser() {
        return this.user;
    }

    public FollowRequestData(User user2, long j) {
        C89219l.m154721d(user2, "");
        this.user = user2;
        this.createTime = j;
    }
}
