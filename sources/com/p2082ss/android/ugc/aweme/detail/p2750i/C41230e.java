package com.p2082ss.android.ugc.aweme.detail.p2750i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51079a;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.i.e */
public final class C41230e extends AbstractC41229d<C51079a, FollowFeed> {
    static {
        Covode.recordClassIndex(49113);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: d */
    public final List<FollowFeed> mo70555d() {
        if (this.f92286h == null) {
            return null;
        }
        return ((AbstractC39100a) this.f92286h).getItems();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: e */
    public final List<Aweme> mo70556e() {
        return C51079a.m95491a(((AbstractC39100a) this.f92286h).getItems());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: b */
    public final /* synthetic */ String mo70554b(FollowFeed followFeed) {
        FollowFeed followFeed2 = followFeed;
        if (followFeed2 == null) {
            return "";
        }
        return C59208ac.m108771e(followFeed2.getAweme());
    }
}
