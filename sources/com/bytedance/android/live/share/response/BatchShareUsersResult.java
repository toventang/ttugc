package com.bytedance.android.live.share.response;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class BatchShareUsersResult {
    @AbstractC27891c(mo46611a = "recently_shared_users")
    private final List<User> recentlySharedUsers;
    @AbstractC27891c(mo46611a = "rank_users")
    private final List<User> topRankUsers;

    static {
        Covode.recordClassIndex(6809);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.live.share.response.BatchShareUsersResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchShareUsersResult copy$default(BatchShareUsersResult batchShareUsersResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchShareUsersResult.topRankUsers;
        }
        if ((i & 2) != 0) {
            list2 = batchShareUsersResult.recentlySharedUsers;
        }
        return batchShareUsersResult.copy(list, list2);
    }

    public final List<User> component1() {
        return this.topRankUsers;
    }

    public final List<User> component2() {
        return this.recentlySharedUsers;
    }

    public final BatchShareUsersResult copy(List<? extends User> list, List<? extends User> list2) {
        return new BatchShareUsersResult(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchShareUsersResult)) {
            return false;
        }
        BatchShareUsersResult batchShareUsersResult = (BatchShareUsersResult) obj;
        return C89219l.m154714a(this.topRankUsers, batchShareUsersResult.topRankUsers) && C89219l.m154714a(this.recentlySharedUsers, batchShareUsersResult.recentlySharedUsers);
    }

    public final int hashCode() {
        List<User> list = this.topRankUsers;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<User> list2 = this.recentlySharedUsers;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BatchShareUsersResult(topRankUsers=" + this.topRankUsers + ", recentlySharedUsers=" + this.recentlySharedUsers + ")";
    }

    public final List<User> getRecentlySharedUsers() {
        return this.recentlySharedUsers;
    }

    public final List<User> getTopRankUsers() {
        return this.topRankUsers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.bytedance.android.live.base.model.user.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.live.base.model.user.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public BatchShareUsersResult(List<? extends User> list, List<? extends User> list2) {
        this.topRankUsers = list;
        this.recentlySharedUsers = list2;
    }
}
