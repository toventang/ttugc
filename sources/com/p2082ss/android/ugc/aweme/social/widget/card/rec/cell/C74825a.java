package com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.a */
public final class C74825a implements AbstractC17641a {

    /* renamed from: a */
    public final User f168175a;

    static {
        Covode.recordClassIndex(87683);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C74825a) && C89219l.m154714a(this.f168175a, ((C74825a) obj).f168175a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f168175a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendUserItem(user=" + this.f168175a + ")";
    }

    public C74825a(User user) {
        C89219l.m154721d(user, "");
        this.f168175a = user;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        User user;
        C89219l.m154721d(aVar, "");
        String uid = this.f168175a.getUid();
        String str = null;
        if (!(aVar instanceof C74825a)) {
            aVar = null;
        }
        C74825a aVar2 = (C74825a) aVar;
        if (!(aVar2 == null || (user = aVar2.f168175a) == null)) {
            str = user.getUid();
        }
        return C89219l.m154714a((Object) uid, (Object) str);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        User user;
        C89219l.m154721d(aVar, "");
        String uid = this.f168175a.getUid();
        String str = null;
        if (!(aVar instanceof C74825a)) {
            aVar = null;
        }
        C74825a aVar2 = (C74825a) aVar;
        if (!(aVar2 == null || (user = aVar2.f168175a) == null)) {
            str = user.getUid();
        }
        return C89219l.m154714a((Object) uid, (Object) str);
    }
}
