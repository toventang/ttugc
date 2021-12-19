package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h */
public final class C50361h extends C39088c<C50359g, AbstractC50365k> {
    static {
        Covode.recordClassIndex(59489);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        AbstractC50365k kVar = (AbstractC50365k) this.f92287i;
        if (kVar != null) {
            AbstractC39085b bVar = this.f92286h;
            if (bVar == null || (t = bVar.mData) == null) {
                t = "";
            }
            kVar.mo85539a(t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        C89219l.m154721d(exc, "");
        AbstractC50365k kVar = (AbstractC50365k) this.f92287i;
        if (kVar != null) {
            kVar.mo85538a(exc);
        }
    }
}
