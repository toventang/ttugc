package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af;

/* renamed from: com.ss.android.ugc.aweme.discover.j.s */
public final class C42120s extends C42082g<C42117r> implements AbstractC42640af {
    static {
        Covode.recordClassIndex(50054);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC39100a mo71328e() {
        return (AbstractC39100a) this.f92286h;
    }

    public C42120s() {
        mo67838a((AbstractC42081f) new C42117r());
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af
    /* renamed from: d */
    public final boolean mo71327d() {
        if (this.f92286h == null || !((AbstractC39100a) this.f92286h).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.C42082g, com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af
    /* renamed from: a */
    public final void mo71294a(String str) {
        if (this.f92286h != null) {
            ((AbstractC42081f) this.f92286h).mo71280b(str);
        }
    }
}
