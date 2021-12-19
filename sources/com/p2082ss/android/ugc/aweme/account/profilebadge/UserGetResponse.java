package com.p2082ss.android.ugc.aweme.account.profilebadge;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.profilebadge.UserGetResponse */
public final class UserGetResponse implements Serializable {
    @AbstractC27891c(mo46611a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(39726);
    }

    public static /* synthetic */ UserGetResponse copy$default(UserGetResponse userGetResponse, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = userGetResponse.user;
        }
        return userGetResponse.copy(user2);
    }

    public final User component1() {
        return this.user;
    }

    public final UserGetResponse copy(User user2) {
        return new UserGetResponse(user2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserGetResponse) && C89219l.m154714a(this.user, ((UserGetResponse) obj).user);
        }
        return true;
    }

    public final int hashCode() {
        User user2 = this.user;
        if (user2 != null) {
            return user2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserGetResponse(user=" + this.user + ")";
    }

    public final User getUser() {
        return this.user;
    }

    public UserGetResponse(User user2) {
        this.user = user2;
    }
}
