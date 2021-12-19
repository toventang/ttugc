package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.feed.u.z */
public final class C49995z extends C39088c<C49993y, AbstractC49990v> {
    static {
        Covode.recordClassIndex(59107);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92287i != null && this.f92286h != null) {
            C51423a.m95791b(6, "DeleteAweme", "onItemDelete " + ((String) this.f92286h.mData));
            ((AbstractC49990v) this.f92287i).mo70497h(this.f92286h.mData);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC49990v) this.f92287i).mo70486d(exc);
        }
    }
}
