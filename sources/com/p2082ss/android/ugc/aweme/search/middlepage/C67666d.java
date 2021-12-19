package com.p2082ss.android.ugc.aweme.search.middlepage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42641ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.middlepage.d */
public final class C67666d implements AbstractC17641a {

    /* renamed from: a */
    public VisitedAccount f151596a;

    /* renamed from: b */
    public String f151597b;

    /* renamed from: c */
    public AbstractC42641ag f151598c;

    static {
        Covode.recordClassIndex(79309);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C67666d) {
            return C89219l.m154714a((Object) this.f151596a.getUid(), (Object) ((C67666d) aVar).f151596a.getUid());
        }
        return false;
    }

    public C67666d(VisitedAccount visitedAccount, String str, AbstractC42641ag agVar) {
        C89219l.m154721d(visitedAccount, "");
        C89219l.m154721d(agVar, "");
        this.f151596a = visitedAccount;
        this.f151597b = str;
        this.f151598c = agVar;
    }
}
