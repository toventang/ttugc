package com.p2082ss.android.ugc.aweme.trending.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.trending.p4145a.C79042b;
import com.p2082ss.android.ugc.aweme.trending.p4145a.C79043c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl */
public final class TrendingDetailServiceImpl implements ITrendingFeedService {
    static {
        Covode.recordClassIndex(92247);
    }

    /* renamed from: b */
    public static ITrendingFeedService m137898b() {
        Object a = C81908b.m141854a(ITrendingFeedService.class, false);
        if (a != null) {
            return (ITrendingFeedService) a;
        }
        return new TrendingDetailServiceImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.trending.service.ITrendingFeedService
    /* renamed from: a */
    public final boolean mo122881a() {
        if (C16048b.m29633a().mo25412a(true, "enable_search_trending_inflow", 0) == C79042b.f177667a) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.trending.service.ITrendingFeedService
    /* renamed from: a */
    public final boolean mo122882a(String str) {
        C89219l.m154721d(str, "");
        return C79043c.m137877a(str);
    }
}
