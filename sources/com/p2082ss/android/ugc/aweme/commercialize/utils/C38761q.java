package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.q */
public final /* synthetic */ class C38761q implements AbstractC38757n.AbstractC38758a {

    /* renamed from: a */
    private final Aweme f91533a;

    static {
        Covode.recordClassIndex(46302);
    }

    C38761q(Aweme aweme) {
        this.f91533a = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
    public final void sendLog(boolean z) {
        Aweme aweme = this.f91533a;
        if (z) {
            C18129a.m33746a("result_ad_bg", "deeplink_success", aweme.getAwemeRawAd()).mo28900b("refer", "bg_more_button").mo28902c();
        } else {
            C18129a.m33746a("result_ad_bg", "deeplink_failed", aweme.getAwemeRawAd()).mo28900b("refer", "bg_more_button").mo28902c();
        }
    }
}
