package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41230e;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51079a;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51084e;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61499b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.l */
public final class C41292l extends AbstractC41261a<C51079a, C41230e> implements AbstractC41262aa.AbstractC41264b {
    static {
        Covode.recordClassIndex(49180);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void bindPreLoadView(AbstractC49992x xVar) {
        ((AbstractC41229d) this.mPresenter).f96343a = xVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void setPreLoad(boolean z) {
        ((AbstractC41229d) this.mPresenter).f96344b = z;
    }

    public C41292l(AbstractC39100a aVar) {
        this.mModel = !(aVar instanceof C51079a) ? new C51079a() : aVar;
        this.mPresenter = new C41230e();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        if (i == 1) {
            this.mPresenter.mo57616a(1, C51084e.C51085a.m95502a(1, 0, 0, C61499b.C61500a.m111344a("feed").mo99145b()).mo86497a());
        } else if (i == 4) {
            C39101b bVar2 = this.mPresenter;
            C51084e a = C51084e.C51085a.m95502a(4, 2, 0, C61499b.C61500a.m111344a("feed").mo99145b());
            a.f117862a = C61499b.C61500a.m111344a("feed").mo99143a();
            bVar2.mo57616a(4, a.mo86497a());
        } else {
            C39101b bVar3 = this.mPresenter;
            C51084e a2 = C51084e.C51085a.m95502a(i, 2, 0, C61499b.C61500a.m111344a("feed").mo99145b());
            a2.f117862a = C61499b.C61500a.m111344a("feed").mo99143a();
            bVar3.mo57616a(Integer.valueOf(i), a2.mo86497a());
        }
    }
}
