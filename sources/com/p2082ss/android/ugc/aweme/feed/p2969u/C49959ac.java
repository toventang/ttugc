package com.p2082ss.android.ugc.aweme.feed.p2969u;

import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.p2244c.C31599a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;

/* renamed from: com.ss.android.ugc.aweme.feed.u.ac */
public final class C49959ac extends C31599a<C49957aa, AbstractC49991w> {
    static {
        Covode.recordClassIndex(59071);
    }

    /* renamed from: d */
    public final int mo84999d() {
        if (this.f92286h == null) {
            return 0;
        }
        return ((C49957aa) this.f92286h).f115163a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.account.p2244c.C31599a
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        if (this.f92286h == null) {
            t = null;
        } else {
            t = this.f92286h.mData;
            if (t != null) {
                AwemeService.m70060b().mo60686b((String) t.f2750a, t.f2751b.intValue());
            }
        }
        if (this.f92287i != null) {
            ((AbstractC49991w) this.f92287i).mo72639a((C0692e<String, Integer>) t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92287i != null) {
            ((AbstractC49991w) this.f92287i).mo72644a(exc);
        }
    }
}
