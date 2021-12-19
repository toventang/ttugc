package com.p2082ss.android.ugc.aweme.mvtemplate.p3486a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.a.a */
public final class C61244a extends AbstractC41261a<C61245b, C39101b<C61245b>> {
    static {
        Covode.recordClassIndex(71857);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return i + 11000;
    }

    public C61244a(AbstractC39100a<?, ?> aVar) {
        C61245b bVar = (C61245b) (!(aVar instanceof C61245b) ? null : aVar);
        this.mModel = bVar == null ? new C61245b() : bVar;
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getMvId(), Integer.valueOf(bVar.getVideoType()));
    }
}
