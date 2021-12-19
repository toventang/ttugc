package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41228c;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.d */
public class C41284d<MODEL extends AbstractC41228c<?, ?>, PRESENTER extends AbstractC41229d<MODEL, Aweme>> extends AbstractC41261a<MODEL, PRESENTER> implements AbstractC41262aa.AbstractC41264b {
    static {
        Covode.recordClassIndex(49172);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public void bindPreLoadView(AbstractC49992x xVar) {
        ((AbstractC41229d) this.mPresenter).f96343a = xVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public void setPreLoad(boolean z) {
        C39101b bVar = this.mPresenter;
        C89219l.m154716b(bVar, "");
        ((AbstractC41229d) bVar).f96344b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.mPresenter.mo57616a(Integer.valueOf(i));
    }
}
