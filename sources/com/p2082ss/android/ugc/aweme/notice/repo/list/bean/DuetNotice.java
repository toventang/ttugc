package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice */
public final class DuetNotice {
    @AbstractC27891c(mo46611a = "aweme")
    private final Aweme aweme;
    @AbstractC27891c(mo46611a = "from_user_info")
    private final User fromUser;
    @AbstractC27891c(mo46611a = "to_user_info")
    private final User toUser;

    static {
        Covode.recordClassIndex(72330);
    }

    public static /* synthetic */ DuetNotice copy$default(DuetNotice duetNotice, User user, User user2, Aweme aweme2, int i, Object obj) {
        if ((i & 1) != 0) {
            user = duetNotice.fromUser;
        }
        if ((i & 2) != 0) {
            user2 = duetNotice.toUser;
        }
        if ((i & 4) != 0) {
            aweme2 = duetNotice.aweme;
        }
        return duetNotice.copy(user, user2, aweme2);
    }

    public final User component1() {
        return this.fromUser;
    }

    public final User component2() {
        return this.toUser;
    }

    public final Aweme component3() {
        return this.aweme;
    }

    public final DuetNotice copy(User user, User user2, Aweme aweme2) {
        return new DuetNotice(user, user2, aweme2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetNotice)) {
            return false;
        }
        DuetNotice duetNotice = (DuetNotice) obj;
        return C89219l.m154714a(this.fromUser, duetNotice.fromUser) && C89219l.m154714a(this.toUser, duetNotice.toUser) && C89219l.m154714a(this.aweme, duetNotice.aweme);
    }

    public final int hashCode() {
        User user = this.fromUser;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        User user2 = this.toUser;
        int hashCode2 = (hashCode + (user2 != null ? user2.hashCode() : 0)) * 31;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            i = aweme2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DuetNotice(fromUser=" + this.fromUser + ", toUser=" + this.toUser + ", aweme=" + this.aweme + ")";
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final User getToUser() {
        return this.toUser;
    }

    public DuetNotice(User user, User user2, Aweme aweme2) {
        this.fromUser = user;
        this.toUser = user2;
        this.aweme = aweme2;
    }
}
