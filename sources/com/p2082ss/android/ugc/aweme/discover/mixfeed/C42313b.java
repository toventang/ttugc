package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.AbstractC42305a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b */
public final class C42313b<T extends AbstractC42305a<?>> extends AbstractC41229d<T, Aweme> {
    static {
        Covode.recordClassIndex(50256);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: d */
    public final List<Aweme> mo70555d() {
        return ((AbstractC39100a) this.f92286h).getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: e */
    public final List<Aweme> mo70556e() {
        return ((AbstractC39100a) this.f92286h).getItems();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: b */
    public final /* synthetic */ String mo70554b(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 == null) {
            return "";
        }
        String e = C59208ac.m108771e(aweme2);
        C89219l.m154716b(e, "");
        return e;
    }
}
