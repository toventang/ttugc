package com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.cell.b */
public final class C74826b implements AbstractC17641a {

    /* renamed from: a */
    public final User f168176a;

    /* renamed from: b */
    public boolean f168177b = true;

    static {
        Covode.recordClassIndex(87684);
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
        if (!(obj instanceof C74826b)) {
            return false;
        }
        C74826b bVar = (C74826b) obj;
        return C89219l.m154714a(this.f168176a, bVar.f168176a) && this.f168177b == bVar.f168177b;
    }

    public final int hashCode() {
        User user = this.f168176a;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        boolean z = this.f168177b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "SelectRecUserItem(user=" + this.f168176a + ", select=" + this.f168177b + ")";
    }

    public C74826b(User user) {
        C89219l.m154721d(user, "");
        this.f168176a = user;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        User user;
        C89219l.m154721d(aVar, "");
        String uid = this.f168176a.getUid();
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
        String uid = this.f168176a.getUid();
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
