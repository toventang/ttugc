package com.p2082ss.android.ugc.aweme.question.p3662d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.question.p3663e.C66520a;

/* renamed from: com.ss.android.ugc.aweme.question.d.a */
public final class C66518a extends AbstractC41261a<C66520a, C39101b<C66520a>> {

    /* renamed from: a */
    private String f149565a;

    static {
        Covode.recordClassIndex(78061);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return i + 19000;
    }

    public C66518a(AbstractC39100a aVar, String str) {
        this.mModel = !(aVar instanceof C66520a) ? new C66520a() : aVar;
        this.mPresenter = new C39101b();
        this.f149565a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getQuestionId(), Integer.valueOf(bVar.getVideoType()), Boolean.valueOf(z), bVar.getIds(), false);
    }
}
