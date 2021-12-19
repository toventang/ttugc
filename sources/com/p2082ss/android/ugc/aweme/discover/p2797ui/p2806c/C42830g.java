package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42082g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42826f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.g */
public final class C42830g extends C42082g<C42826f> {
    static {
        Covode.recordClassIndex(50934);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.discover.p2775j.C42082g, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        super.mo57528c();
        AbstractC39085b bVar = this.f92286h;
        C89219l.m154716b(bVar, "");
        if (((AbstractC39100a) bVar).mListQueryType == 4) {
            AbstractC39085b bVar2 = this.f92286h;
            C89219l.m154716b(bVar2, "");
            if (((AbstractC39100a) bVar2).isDataEmpty()) {
                ((AbstractC39102c) this.f92287i).mo59525f();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.discover.p2775j.C42082g, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        C89219l.m154721d(exc, "");
        super.mo57526a_(exc);
        if (exc instanceof C42826f.C42828b) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            if (((AbstractC39100a) bVar).isDataEmpty()) {
                ((AbstractC39102c) this.f92287i).mo59525f();
            }
        }
    }
}
