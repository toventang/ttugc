package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49968d;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49976l;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.x */
public final class C41319x extends AbstractC41261a<C49968d, C49976l> implements AbstractC41262aa.AbstractC41264b {
    static {
        Covode.recordClassIndex(49207);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void bindPreLoadView(AbstractC49992x xVar) {
        ((C49976l) this.mPresenter).f115288b = xVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void setPreLoad(boolean z) {
        ((C49976l) this.mPresenter).f115289c = z;
    }

    public C41319x(AbstractC39100a aVar) {
        this.mModel = !(aVar instanceof C49968d) ? new C49968d() : aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final boolean init(Fragment fragment) {
        this.mPresenter = new C49976l(fragment);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C39101b bVar2 = this.mPresenter;
        int i3 = 3;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = 2;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    i3 = 2;
                }
            }
            objArr[2] = Integer.valueOf(i3);
            bVar2.mo57616a(objArr);
        }
        i3 = 1;
        objArr[2] = Integer.valueOf(i3);
        bVar2.mo57616a(objArr);
    }
}
