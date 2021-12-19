package com.p2082ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.aweme.search.C67647m;
import com.p2082ss.android.ugc.aweme.trending.TrendingDetailApi;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.a */
public final class C79141a extends AbstractC20191d<C79157d, C67647m> {
    static {
        Covode.recordClassIndex(92327);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        C79157d dVar = (C79157d) obj;
        C89219l.m154721d(dVar, "");
        if (C89219l.m154714a((Object) dVar.f177909g, (Object) "click_fyp_trending_bar")) {
            return TrendingDetailApi.C79039a.f177661a.getTrendingDetailFYP(dVar.f177904b, dVar.f177903a.f48407b, dVar.f177905c, dVar.f177906d, dVar.f177907e, dVar.f177908f);
        }
        return TrendingDetailApi.C79039a.f177661a.getTrendingDetailDataSearch(dVar.f177904b, dVar.f177903a.f48407b, dVar.f177905c, dVar.f177906d, dVar.f177907e, dVar.f177908f);
    }
}
