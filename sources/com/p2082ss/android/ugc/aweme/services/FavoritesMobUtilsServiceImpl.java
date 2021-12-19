package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.FavoritesMobUtilsServiceImpl */
public final class FavoritesMobUtilsServiceImpl implements AbstractC63872g {
    static {
        Covode.recordClassIndex(79611);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g
    public final boolean isDataSetChangedOnStart() {
        return C47434a.f110165b;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g
    public final void setDataSetChangedOnStart(boolean z) {
        C47434a.f110165b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g
    public final void onVideoItemActionShow(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        C39162r.m79460a(C47434a.m90444a(1), C47434a.m90452b("video", "collection_video").mo59983a("author_id", C59208ac.m108758a(aweme)).mo59983a("group_id", C59208ac.m108771e(aweme)).mo59983a("music_id", C59208ac.m108770d(aweme)).f79943a);
    }
}
