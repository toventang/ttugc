package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66991l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.a */
final class C66930a extends C66990k {

    /* renamed from: a */
    public final User f150223a;

    static {
        Covode.recordClassIndex(78507);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C66930a) && C89219l.m154714a(this.f150223a, ((C66930a) obj).f150223a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f150223a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FriendItem(friend=" + this.f150223a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66930a(User user) {
        super(C66991l.EnumC66992a.RECOMMEND_FRIEND, user);
        C89219l.m154721d(user, "");
        this.f150223a = user;
    }
}
