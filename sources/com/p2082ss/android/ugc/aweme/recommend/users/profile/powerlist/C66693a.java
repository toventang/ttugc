package com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.powerlist.a */
public final class C66693a implements AbstractC17641a {

    /* renamed from: a */
    public final int f149861a = 1;

    static {
        Covode.recordClassIndex(78261);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C66693a) && this.f149861a == ((C66693a) obj).f149861a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f149861a;
    }

    public final String toString() {
        return "RecommendPermissionItem(type=" + this.f149861a + ")";
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
}
