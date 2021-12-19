package com.p2082ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.d */
public final class C38401d extends AbstractC41261a<C38455n, C39101b<C38455n>> {
    static {
        Covode.recordClassIndex(45908);
    }

    public C38401d(AbstractC39100a<?, ?> aVar) {
        this.mModel = (C38455n) (!(aVar instanceof C38455n) ? null : aVar);
        this.mPresenter = new C38397b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        C39101b bVar2 = this.mPresenter;
        Object[] objArr = new Object[8];
        objArr[0] = bVar.getUid();
        int i3 = 1;
        objArr[1] = bVar.getSecUid();
        objArr[2] = Long.valueOf(bVar.getMaxCursor());
        objArr[3] = 0L;
        objArr[4] = 6;
        if (bVar.getMaxCursor() != 0) {
            i3 = 4;
        }
        objArr[5] = Integer.valueOf(i3);
        objArr[6] = bVar.getAdvId();
        objArr[7] = "";
        bVar2.mo57616a(objArr);
    }
}
