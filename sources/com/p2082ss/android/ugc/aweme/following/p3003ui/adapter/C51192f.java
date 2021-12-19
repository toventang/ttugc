package com.p2082ss.android.ugc.aweme.following.p3003ui.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.C51188e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.f */
final /* synthetic */ class C51192f implements C51086a.AbstractC51089b {

    /* renamed from: a */
    private final C51188e.C51189a f118084a;

    /* renamed from: b */
    private final IMUser f118085b;

    static {
        Covode.recordClassIndex(60395);
    }

    C51192f(C51188e.C51189a aVar, IMUser iMUser) {
        this.f118084a = aVar;
        this.f118085b = iMUser;
    }

    @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51089b
    /* renamed from: a */
    public final void mo70873a(FollowStatus followStatus) {
        this.f118084a.mo86611a(this.f118085b, followStatus);
    }
}
