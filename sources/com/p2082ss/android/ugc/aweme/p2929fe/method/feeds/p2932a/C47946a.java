package com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2932a;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47940a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.a */
public final class C47946a extends AbstractC41261a<C47940a, C39101b<C47940a>> {
    static {
        Covode.recordClassIndex(56654);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public C47946a(AbstractC39100a<?, ?> aVar) {
        this.mModel = (C47940a) (!(aVar instanceof C47940a) ? null : aVar);
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.mPresenter.mo57616a(Integer.valueOf(i));
    }
}
