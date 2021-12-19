package com.p2082ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35520a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.h */
public final class C41288h extends AbstractC41261a<C35520a, C39101b<C35520a>> {

    /* renamed from: a */
    private String f96387a;

    static {
        Covode.recordClassIndex(49176);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        if (TextUtils.equals("from_discovery_challenge", this.f96387a)) {
            return 9000;
        }
        return i + 3000;
    }

    public C41288h(AbstractC39100a aVar, String str) {
        this.mModel = !(aVar instanceof C35520a) ? new C35520a() : aVar;
        this.mPresenter = new C39101b();
        this.f96387a = str;
        if (TextUtils.equals("from_discovery_challenge", str) && this.mModel != null) {
            ((C35520a) this.mModel).mo62417a("discovery_challenge_video");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getChallengeId(), Integer.valueOf(bVar.getVideoType()), false);
    }
}
