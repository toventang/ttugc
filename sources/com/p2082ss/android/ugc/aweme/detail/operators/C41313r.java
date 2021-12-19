package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.music.presenter.C60849g;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.r */
public final class C41313r extends AbstractC41261a<C60849g, C39101b<C60849g>> {
    static {
        Covode.recordClassIndex(49201);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return i + 4000;
    }

    public C41313r(AbstractC39100a aVar) {
        this.mModel = !(aVar instanceof C60849g) ? new C60849g() : aVar;
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getMusicId(), Integer.valueOf(bVar.getVideoType()));
    }
}
