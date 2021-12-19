package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.j */
public final class C66989j implements AbstractC17641a {

    /* renamed from: a */
    public final User f150297a;

    static {
        Covode.recordClassIndex(78566);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C66989j) && C89219l.m154714a(this.f150297a, ((C66989j) obj).f150297a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f150297a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendFriendItem(user=" + this.f150297a + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C66989j(User user) {
        C89219l.m154721d(user, "");
        this.f150297a = user;
    }
}
