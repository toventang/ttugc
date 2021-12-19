package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p4496tt.appbrandimpl.C87419a;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.o */
public final class C41297o extends AbstractC41261a<C87419a, C39101b<C87419a>> {

    /* renamed from: a */
    private boolean f96399a;

    static {
        Covode.recordClassIndex(49185);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        int i2;
        if (this.f96399a) {
            i2 = 1000;
        } else {
            i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        return i2 + i;
    }

    public C41297o(AbstractC39100a aVar) {
        this.mModel = !(aVar instanceof C87419a) ? new C87419a() : aVar;
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        String microAppId = bVar.getMicroAppId();
        String hashTagName = bVar.getHashTagName();
        int cursor = bVar.getCursor();
        int count = bVar.getCount();
        this.mPresenter.mo57616a(4, microAppId, hashTagName, Integer.valueOf(count), Integer.valueOf(cursor));
    }
}
