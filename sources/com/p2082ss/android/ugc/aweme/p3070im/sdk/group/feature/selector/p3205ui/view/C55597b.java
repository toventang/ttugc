package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.b */
public class C55597b implements AbstractC17641a {

    /* renamed from: a */
    public final IMUser f126828a;

    static {
        Covode.recordClassIndex(65375);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public int hashCode() {
        return this.f126828a.hashCode();
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

    public C55597b(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        this.f126828a = iMUser;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C55597b)) {
            return false;
        }
        return C89219l.m154714a((Object) this.f126828a.getUniqueId(), (Object) ((C55597b) obj).f126828a.getUniqueId());
    }
}
