package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice */
public final class FollowRequestNotice {
    @AbstractC27891c(mo46611a = "count")
    private final int requestCount;

    static {
        Covode.recordClassIndex(72337);
    }

    public FollowRequestNotice() {
        this(0, 1, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequestNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111641xa0b79723(int i) {
        return i;
    }

    public static /* synthetic */ FollowRequestNotice copy$default(FollowRequestNotice followRequestNotice, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followRequestNotice.requestCount;
        }
        return followRequestNotice.copy(i);
    }

    public final int component1() {
        return this.requestCount;
    }

    public final FollowRequestNotice copy(int i) {
        return new FollowRequestNotice(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowRequestNotice) && this.requestCount == ((FollowRequestNotice) obj).requestCount;
        }
        return true;
    }

    public final int hashCode() {
        return m111641xa0b79723(this.requestCount);
    }

    public final String toString() {
        return "FollowRequestNotice(requestCount=" + this.requestCount + ")";
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public FollowRequestNotice(int i) {
        this.requestCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRequestNotice(int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
