package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse */
public final class FollowPageResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "follow_page_list")
    private final List<FollowPageData> data;
    @AbstractC27891c(mo46611a = "follow_req_offset")
    private final long followReqOffset;
    @AbstractC27891c(mo46611a = "has_more")
    private final boolean hasMore;
    @AbstractC27891c(mo46611a = "noticeLastReadTime")
    private final long noticeLastReadTime;
    @AbstractC27891c(mo46611a = "notice_max_time")
    private final long noticeMaxTime;
    @AbstractC27891c(mo46611a = "notice_min_time")
    private final long noticeMinTime;
    @AbstractC27891c(mo46611a = "total")
    private final int total;

    static {
        Covode.recordClassIndex(72334);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111637x885a6a44(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111638x885a6a44(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowPageResponse copy$default(FollowPageResponse followPageResponse, int i, boolean z, long j, long j2, long j3, long j4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followPageResponse.total;
        }
        if ((i2 & 2) != 0) {
            z = followPageResponse.hasMore;
        }
        if ((i2 & 4) != 0) {
            j = followPageResponse.followReqOffset;
        }
        if ((i2 & 8) != 0) {
            j2 = followPageResponse.noticeMaxTime;
        }
        if ((i2 & 16) != 0) {
            j3 = followPageResponse.noticeMinTime;
        }
        if ((i2 & 32) != 0) {
            j4 = followPageResponse.noticeLastReadTime;
        }
        if ((i2 & 64) != 0) {
            list = followPageResponse.data;
        }
        return followPageResponse.copy(i, z, j, j2, j3, j4, list);
    }

    public final int component1() {
        return this.total;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.followReqOffset;
    }

    public final long component4() {
        return this.noticeMaxTime;
    }

    public final long component5() {
        return this.noticeMinTime;
    }

    public final long component6() {
        return this.noticeLastReadTime;
    }

    public final List<FollowPageData> component7() {
        return this.data;
    }

    public final FollowPageResponse copy(int i, boolean z, long j, long j2, long j3, long j4, List<FollowPageData> list) {
        C89219l.m154721d(list, "");
        return new FollowPageResponse(i, z, j, j2, j3, j4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageResponse)) {
            return false;
        }
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        return this.total == followPageResponse.total && this.hasMore == followPageResponse.hasMore && this.followReqOffset == followPageResponse.followReqOffset && this.noticeMaxTime == followPageResponse.noticeMaxTime && this.noticeMinTime == followPageResponse.noticeMinTime && this.noticeLastReadTime == followPageResponse.noticeLastReadTime && C89219l.m154714a(this.data, followPageResponse.data);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m111637x885a6a44(this.total) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((((((((com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i) * 31) + m111638x885a6a44(this.followReqOffset)) * 31) + m111638x885a6a44(this.noticeMaxTime)) * 31) + m111638x885a6a44(this.noticeMinTime)) * 31) + m111638x885a6a44(this.noticeLastReadTime)) * 31;
        List<FollowPageData> list = this.data;
        return com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FollowPageResponse(total=" + this.total + ", hasMore=" + this.hasMore + ", followReqOffset=" + this.followReqOffset + ", noticeMaxTime=" + this.noticeMaxTime + ", noticeMinTime=" + this.noticeMinTime + ", noticeLastReadTime=" + this.noticeLastReadTime + ", data=" + this.data + ")";
    }

    public final List<FollowPageData> getData() {
        return this.data;
    }

    public final long getFollowReqOffset() {
        return this.followReqOffset;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getNoticeLastReadTime() {
        return this.noticeLastReadTime;
    }

    public final long getNoticeMaxTime() {
        return this.noticeMaxTime;
    }

    public final long getNoticeMinTime() {
        return this.noticeMinTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public FollowPageResponse(int i, boolean z, long j, long j2, long j3, long j4, List<FollowPageData> list) {
        C89219l.m154721d(list, "");
        this.total = i;
        this.hasMore = z;
        this.followReqOffset = j;
        this.noticeMaxTime = j2;
        this.noticeMinTime = j3;
        this.noticeLastReadTime = j4;
        this.data = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowPageResponse(int i, boolean z, long j, long j2, long j3, long j4, List list, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : j, (i2 & 8) != 0 ? 0 : j2, (i2 & 16) != 0 ? 0 : j3, (i2 & 32) != 0 ? 0 : j4, list);
    }
}
