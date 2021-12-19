package com.p2082ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.e */
public final class C36888e implements AbstractC17641a {

    /* renamed from: a */
    public final User f86880a;

    /* renamed from: b */
    public final C36889f f86881b;

    static {
        Covode.recordClassIndex(44226);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36888e)) {
            return false;
        }
        C36888e eVar = (C36888e) obj;
        return C89219l.m154714a(this.f86880a, eVar.f86880a) && C89219l.m154714a(this.f86881b, eVar.f86881b);
    }

    public final int hashCode() {
        User user = this.f86880a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        C36889f fVar = this.f86881b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FeedTaggedListItem(user=" + this.f86880a + ", param=" + this.f86881b + ")";
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

    public C36888e(User user, C36889f fVar) {
        C89219l.m154721d(user, "");
        this.f86880a = user;
        this.f86881b = fVar;
    }
}
