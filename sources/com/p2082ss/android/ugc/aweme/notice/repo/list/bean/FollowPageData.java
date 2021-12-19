package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData */
public final class FollowPageData {
    @AbstractC27891c(mo46611a = "create_time")
    private final long createTime;
    @AbstractC27891c(mo46611a = "follow_request")
    private final FollowRequestData followRequest;
    @AbstractC27891c(mo46611a = "notice")
    private final MusNotice notice;
    private final int type;

    static {
        Covode.recordClassIndex(72333);
    }

    public FollowPageData() {
        this(0, null, null, 0, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111635x3ae2042d(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111636x3ae2042d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ FollowPageData copy$default(FollowPageData followPageData, int i, MusNotice musNotice, FollowRequestData followRequestData, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followPageData.type;
        }
        if ((i2 & 2) != 0) {
            musNotice = followPageData.notice;
        }
        if ((i2 & 4) != 0) {
            followRequestData = followPageData.followRequest;
        }
        if ((i2 & 8) != 0) {
            j = followPageData.createTime;
        }
        return followPageData.copy(i, musNotice, followRequestData, j);
    }

    public final int component1() {
        return this.type;
    }

    public final MusNotice component2() {
        return this.notice;
    }

    public final FollowRequestData component3() {
        return this.followRequest;
    }

    public final long component4() {
        return this.createTime;
    }

    public final FollowPageData copy(int i, MusNotice musNotice, FollowRequestData followRequestData, long j) {
        return new FollowPageData(i, musNotice, followRequestData, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageData)) {
            return false;
        }
        FollowPageData followPageData = (FollowPageData) obj;
        return this.type == followPageData.type && C89219l.m154714a(this.notice, followPageData.notice) && C89219l.m154714a(this.followRequest, followPageData.followRequest) && this.createTime == followPageData.createTime;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m111635x3ae2042d(this.type) * 31;
        MusNotice musNotice = this.notice;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (musNotice != null ? musNotice.hashCode() : 0)) * 31;
        FollowRequestData followRequestData = this.followRequest;
        if (followRequestData != null) {
            i = followRequestData.hashCode();
        }
        return ((hashCode + i) * 31) + m111636x3ae2042d(this.createTime);
    }

    public final String toString() {
        return "FollowPageData(type=" + this.type + ", notice=" + this.notice + ", followRequest=" + this.followRequest + ", createTime=" + this.createTime + ")";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final FollowRequestData getFollowRequest() {
        return this.followRequest;
    }

    public final MusNotice getNotice() {
        return this.notice;
    }

    public final int getType() {
        return this.type;
    }

    public FollowPageData(int i, MusNotice musNotice, FollowRequestData followRequestData, long j) {
        this.type = i;
        this.notice = musNotice;
        this.followRequest = followRequestData;
        this.createTime = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowPageData(int i, MusNotice musNotice, FollowRequestData followRequestData, long j, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : musNotice, (i2 & 4) == 0 ? followRequestData : null, (i2 & 8) != 0 ? 0 : j);
    }
}
