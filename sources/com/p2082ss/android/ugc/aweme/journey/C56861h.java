package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.h */
public final class C56861h {

    /* renamed from: a */
    public static final JourneyApi f129483a;

    /* renamed from: b */
    public static final C56861h f129484b = new C56861h();

    private C56861h() {
    }

    static {
        Covode.recordClassIndex(66747);
        Object a = RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(JourneyApi.class);
        C89219l.m154716b(a, "");
        f129483a = (JourneyApi) a;
    }
}
