package com.p2082ss.android.ugc.aweme.duet.p2814a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.a.d */
public final class C43257d extends AbstractC41261a<C43254b, C39101b<C43254b>> {
    static {
        Covode.recordClassIndex(51459);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return i + 17000;
    }

    public C43257d(AbstractC39100a<?, ?> aVar) {
        C43254b bVar = (C43254b) (!(aVar instanceof C43254b) ? null : aVar);
        this.mModel = bVar == null ? new C43254b() : bVar;
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getDuetId(), Integer.valueOf(bVar.getVideoType()));
    }
}
