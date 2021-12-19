package com.p2082ss.android.ugc.aweme.user.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20379aq;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.repository.UserState */
public final class UserState implements AbstractC20368af {
    private final AbstractC20362a<FollowStatus> followStatus;
    private final boolean followerIsRemoved;
    private final AbstractC20362a<String> remarkName;
    private final Throwable removeFollowerError;
    private final User user;

    static {
        Covode.recordClassIndex(93317);
    }

    public UserState() {
        this(null, false, null, null, null, 31, null);
    }

    public UserState(User user2) {
        this(user2, false, null, null, null, 30, null);
    }

    public UserState(User user2, boolean z) {
        this(user2, z, null, null, null, 28, null);
    }

    public UserState(User user2, boolean z, AbstractC20362a<FollowStatus> aVar) {
        this(user2, z, aVar, null, null, 24, null);
    }

    public UserState(User user2, boolean z, AbstractC20362a<FollowStatus> aVar, AbstractC20362a<String> aVar2) {
        this(user2, z, aVar, aVar2, null, 16, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.user.repository.UserState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserState copy$default(UserState userState, User user2, boolean z, AbstractC20362a aVar, AbstractC20362a aVar2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = userState.user;
        }
        if ((i & 2) != 0) {
            z = userState.followerIsRemoved;
        }
        if ((i & 4) != 0) {
            aVar = userState.followStatus;
        }
        if ((i & 8) != 0) {
            aVar2 = userState.remarkName;
        }
        if ((i & 16) != 0) {
            th = userState.removeFollowerError;
        }
        return userState.copy(user2, z, aVar, aVar2, th);
    }

    public final User component1() {
        return this.user;
    }

    public final boolean component2() {
        return this.followerIsRemoved;
    }

    public final AbstractC20362a<FollowStatus> component3() {
        return this.followStatus;
    }

    public final AbstractC20362a<String> component4() {
        return this.remarkName;
    }

    public final Throwable component5() {
        return this.removeFollowerError;
    }

    public final UserState copy(User user2, boolean z, AbstractC20362a<FollowStatus> aVar, AbstractC20362a<String> aVar2, Throwable th) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new UserState(user2, z, aVar, aVar2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return C89219l.m154714a(this.user, userState.user) && this.followerIsRemoved == userState.followerIsRemoved && C89219l.m154714a(this.followStatus, userState.followStatus) && C89219l.m154714a(this.remarkName, userState.remarkName) && C89219l.m154714a(this.removeFollowerError, userState.removeFollowerError);
    }

    public final int hashCode() {
        User user2 = this.user;
        int i = 0;
        int hashCode = (user2 != null ? user2.hashCode() : 0) * 31;
        boolean z = this.followerIsRemoved;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        AbstractC20362a<FollowStatus> aVar = this.followStatus;
        int hashCode2 = (i5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC20362a<String> aVar2 = this.remarkName;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Throwable th = this.removeFollowerError;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "UserState(user=" + this.user + ", followerIsRemoved=" + this.followerIsRemoved + ", followStatus=" + this.followStatus + ", remarkName=" + this.remarkName + ", removeFollowerError=" + this.removeFollowerError + ")";
    }

    public final AbstractC20362a<FollowStatus> getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getFollowerIsRemoved() {
        return this.followerIsRemoved;
    }

    public final AbstractC20362a<String> getRemarkName() {
        return this.remarkName;
    }

    public final Throwable getRemoveFollowerError() {
        return this.removeFollowerError;
    }

    public final User getUser() {
        return this.user;
    }

    public UserState(User user2, boolean z, AbstractC20362a<FollowStatus> aVar, AbstractC20362a<String> aVar2, Throwable th) {
        C89219l.m154721d(user2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.user = user2;
        this.followerIsRemoved = z;
        this.followStatus = aVar;
        this.remarkName = aVar2;
        this.removeFollowerError = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserState(User user2, boolean z, AbstractC20362a aVar, AbstractC20362a aVar2, Throwable th, int i, C89214g gVar) {
        this((i & 1) != 0 ? new User() : user2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C20379aq.f48273a : aVar, (i & 8) != 0 ? C20379aq.f48273a : aVar2, (i & 16) != 0 ? null : th);
    }
}
