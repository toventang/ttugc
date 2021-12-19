package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41231f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.w */
public final class C41318w extends AbstractC41261a<C42439u, C41231f> implements AbstractC41262aa.AbstractC41264b {
    static {
        Covode.recordClassIndex(49206);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void bindPreLoadView(AbstractC49992x xVar) {
        ((AbstractC41229d) this.mPresenter).f96343a = xVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void setPreLoad(boolean z) {
        C39101b bVar = this.mPresenter;
        C89219l.m154716b(bVar, "");
        ((AbstractC41229d) bVar).f96344b = z;
    }

    public C41318w(AbstractC39100a<?, ?> aVar) {
        C42439u uVar;
        if (aVar instanceof C42439u) {
            uVar = (C42439u) aVar;
        } else {
            uVar = new C42439u();
        }
        this.mModel = uVar;
        this.mPresenter = new C41231f();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        if (i == 1) {
            this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getSearchKeyword());
            return;
        }
        this.mPresenter.mo57616a(Integer.valueOf(i));
    }
}
