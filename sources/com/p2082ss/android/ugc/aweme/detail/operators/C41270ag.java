package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41131d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42313b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ag */
public final class C41270ag extends C41284d<C41131d, C42313b<C41131d>> {
    static {
        Covode.recordClassIndex(49158);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return 9;
    }

    public C41270ag(AbstractC39100a<?, ?> aVar) {
        this.mModel = (C41131d) (!(aVar instanceof C41131d) ? null : aVar);
        this.mPresenter = new C42313b();
    }
}
