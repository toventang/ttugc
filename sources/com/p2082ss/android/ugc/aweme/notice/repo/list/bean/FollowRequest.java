package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest */
public final class FollowRequest {
    @AbstractC27891c(mo46611a = "count")
    private final int followRequestCount;

    static {
        Covode.recordClassIndex(72335);
    }

    public FollowRequest() {
        this(0, 1, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111639x1f23766b(int i) {
        return i;
    }

    public static /* synthetic */ FollowRequest copy$default(FollowRequest followRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followRequest.followRequestCount;
        }
        return followRequest.copy(i);
    }

    public final int component1() {
        return this.followRequestCount;
    }

    public final FollowRequest copy(int i) {
        return new FollowRequest(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowRequest) && this.followRequestCount == ((FollowRequest) obj).followRequestCount;
        }
        return true;
    }

    public final int hashCode() {
        return m111639x1f23766b(this.followRequestCount);
    }

    public final String toString() {
        return "FollowRequest(followRequestCount=" + this.followRequestCount + ")";
    }

    public final int getFollowRequestCount() {
        return this.followRequestCount;
    }

    public FollowRequest(int i) {
        this.followRequestCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRequest(int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
