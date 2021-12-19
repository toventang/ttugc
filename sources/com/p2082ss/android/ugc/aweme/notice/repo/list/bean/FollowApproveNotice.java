package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice */
public final class FollowApproveNotice {
    @AbstractC27891c(mo46611a = "from_user")
    private final User user;

    static {
        Covode.recordClassIndex(72331);
    }

    public FollowApproveNotice() {
        this(null, 1, null);
    }

    public static /* synthetic */ FollowApproveNotice copy$default(FollowApproveNotice followApproveNotice, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = followApproveNotice.user;
        }
        return followApproveNotice.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final FollowApproveNotice copy(User user2) {
        return new FollowApproveNotice(user2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowApproveNotice) && C89219l.m154714a(this.user, ((FollowApproveNotice) obj).user);
        }
        return true;
    }

    public final String toString() {
        return "FollowApproveNotice(user=" + this.user + ")";
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        User user2 = this.user;
        if (user2 != null) {
            return user2.hashCode();
        }
        return 0;
    }

    public FollowApproveNotice(User user2) {
        this.user = user2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowApproveNotice(User user2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : user2);
    }
}
