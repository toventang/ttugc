package com.p2082ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.af */
public final class C36213af implements AbstractC17641a {

    /* renamed from: a */
    public final User f85524a;

    /* renamed from: b */
    public final C36215ah f85525b;

    /* renamed from: c */
    public boolean f85526c;

    static {
        Covode.recordClassIndex(43479);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final String toString() {
        return "LikeItem(user=" + this.f85524a + ", params=" + this.f85525b + ", shouldHint=" + this.f85526c + ")";
    }

    public final int hashCode() {
        return Objects.hash(this.f85524a.getUid());
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!(aVar instanceof C36213af)) {
            return false;
        }
        return C89219l.m154714a((Object) this.f85524a.getUid(), (Object) ((C36213af) aVar).f85524a.getUid());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36213af)) {
            return false;
        }
        return C89219l.m154714a((Object) this.f85524a.getUid(), (Object) ((C36213af) obj).f85524a.getUid());
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (!mo28110b(aVar)) {
            return false;
        }
        User user = ((C36213af) aVar).f85524a;
        if (!C89219l.m154714a((Object) this.f85524a.getUid(), (Object) user.getUid()) || this.f85524a.getFollowStatus() != user.getFollowStatus() || this.f85524a.getFollowerStatus() != user.getFollowerStatus() || !Objects.equals(this.f85524a.getMatchedFriendStruct(), user.getMatchedFriendStruct())) {
            return false;
        }
        return true;
    }

    public C36213af(User user, C36215ah ahVar, boolean z) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(ahVar, "");
        this.f85524a = user;
        this.f85525b = ahVar;
        this.f85526c = z;
    }
}
