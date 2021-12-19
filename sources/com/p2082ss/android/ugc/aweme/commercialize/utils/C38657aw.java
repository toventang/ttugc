package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38655av;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aw */
public final /* synthetic */ class C38657aw implements C38655av.AbstractC38656a {

    /* renamed from: a */
    private final AwemeRawAd f91338a;

    static {
        Covode.recordClassIndex(46198);
    }

    C38657aw(AwemeRawAd awemeRawAd) {
        this.f91338a = awemeRawAd;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.C38655av.AbstractC38656a
    /* renamed from: a */
    public final void mo67224a(boolean z) {
        AwemeRawAd awemeRawAd = this.f91338a;
        if (z) {
            C38655av.m78419a(C17867d.m33078a(), "landing_deeplink_success", awemeRawAd);
            if (C33113b.m67826a() != null) {
                C33113b.m67826a().mo58924a("landing_ad", awemeRawAd);
                return;
            }
            return;
        }
        C38655av.m78419a(C17867d.m33078a(), "landing_deeplink_failed", awemeRawAd);
    }
}
