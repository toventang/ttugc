package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.y */
public final class C41320y extends AbstractC41261a<AbstractC39100a, C39101b<AbstractC39100a>> {
    static {
        Covode.recordClassIndex(49208);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return 8000;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final boolean init(Fragment fragment) {
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public C41320y(AbstractC39100a aVar) {
        this.mModel = aVar;
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.mPresenter.mo57616a(bVar.getAid());
    }
}
