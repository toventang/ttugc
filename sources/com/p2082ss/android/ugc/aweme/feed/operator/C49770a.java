package com.p2082ss.android.ugc.aweme.feed.operator;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49985r;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.operator.a */
public final class C49770a extends AbstractC41261a<FollowingFeedListModel, C39101b<FollowingFeedListModel>> implements AbstractC41262aa.AbstractC41263a {
    static {
        Covode.recordClassIndex(58875);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return 9001;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final boolean isLoading() {
        return super.isLoading();
    }

    public C49770a(List<String> list, List<String> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.mModel = new FollowingFeedListModel(list, list2);
        this.mPresenter = new C49985r();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.mPresenter.mo57616a(Integer.valueOf(i), bVar.getSelectedUid());
    }
}
