package com.p2082ss.android.ugc.aweme.detail.p2750i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.i.f */
public final class C41231f extends AbstractC41229d<C42439u, C42411h> {
    static {
        Covode.recordClassIndex(49114);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: d */
    public final List<C42411h> mo70555d() {
        AbstractC39100a aVar = (AbstractC39100a) this.f92286h;
        if (aVar != null) {
            return aVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: e */
    public final List<Aweme> mo70556e() {
        List list;
        AbstractC39100a aVar = (AbstractC39100a) this.f92286h;
        if (aVar != null) {
            list = aVar.getItems();
        } else {
            list = null;
        }
        List<Aweme> a = C42439u.m84813a(list);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41229d
    /* renamed from: b */
    public final /* synthetic */ String mo70554b(C42411h hVar) {
        Aweme aweme;
        C42411h hVar2 = hVar;
        if (hVar2 == null || (aweme = hVar2.getAweme()) == null) {
            return "";
        }
        String e = C59208ac.m108771e(aweme);
        C89219l.m154716b(e, "");
        return e;
    }
}
