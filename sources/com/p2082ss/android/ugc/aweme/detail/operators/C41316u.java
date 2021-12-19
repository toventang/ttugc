package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63833b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.u */
public final class C41316u extends AbstractC41261a<C63833b, C39101b<C63833b>> {

    /* renamed from: a */
    private final boolean f96428a;

    /* renamed from: b */
    private final String f96429b;

    static {
        Covode.recordClassIndex(49204);
    }

    /* renamed from: a */
    private int m83173a() {
        if (this.f96428a) {
            return 1000;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return m83173a() + i;
    }

    public C41316u(AbstractC39100a aVar, boolean z, String str) {
        this.mModel = !(aVar instanceof C63833b) ? new C63833b() : aVar;
        this.mPresenter = new C39101b();
        this.f96428a = z;
        this.f96429b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        if (C23697c.m44781a(bVar.getSecUid())) {
            this.mPresenter.mo57616a(Integer.valueOf(i), true, this.f96429b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(m83173a()));
            return;
        }
        this.mPresenter.mo57616a(Integer.valueOf(i), true, this.f96429b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(m83173a()), bVar.getSecUid());
    }
}
