package com.p2082ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.g */
public class C36890g implements AbstractC17641a {

    /* renamed from: a */
    public final IMUser f86884a;

    static {
        Covode.recordClassIndex(44228);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public int hashCode() {
        return this.f86884a.hashCode();
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

    public C36890g(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        this.f86884a = iMUser;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C36890g)) {
            return false;
        }
        return C89219l.m154714a((Object) this.f86884a.getUniqueId(), (Object) ((C36890g) obj).f86884a.getUniqueId());
    }
}
