package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.aa */
final /* synthetic */ class C48140aa implements AbstractC1729g {

    /* renamed from: a */
    private final FullFeedVideoViewHolder f111533a;

    /* renamed from: b */
    private final ISpecialPlusService f111534b;

    /* renamed from: c */
    private final Aweme f111535c;

    static {
        Covode.recordClassIndex(56882);
    }

    C48140aa(FullFeedVideoViewHolder fullFeedVideoViewHolder, ISpecialPlusService iSpecialPlusService, Aweme aweme) {
        this.f111533a = fullFeedVideoViewHolder;
        this.f111534b = iSpecialPlusService;
        this.f111535c = aweme;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return this.f111533a.mo80092a(this.f111534b, this.f111535c);
    }
}
