package com.p2082ss.android.ugc.aweme.prop.p3607c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.prop.c.a */
public final class C65309a extends AbstractC41261a<C65311c, C39101b<C65311c>> {
    static {
        Covode.recordClassIndex(76788);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return i + 10000;
    }

    public C65309a(AbstractC39100a aVar, C49812b bVar) {
        this.mModel = !(aVar instanceof C65311c) ? new C65311c(bVar.getPreviousPage()) : aVar;
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getStickerId(), Integer.valueOf(bVar.getVideoType()));
    }
}
