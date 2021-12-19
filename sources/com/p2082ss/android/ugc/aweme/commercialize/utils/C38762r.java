package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.r */
public final /* synthetic */ class C38762r implements AbstractC38757n.AbstractC38758a {

    /* renamed from: a */
    private final Context f91534a;

    /* renamed from: b */
    private final Aweme f91535b;

    static {
        Covode.recordClassIndex(46303);
    }

    C38762r(Context context, Aweme aweme) {
        this.f91534a = context;
        this.f91535b = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
    public final void sendLog(boolean z) {
        Context context = this.f91534a;
        Aweme aweme = this.f91535b;
        if (z) {
            C38189j.m77521d(context, aweme);
            C18129a.m33746a("draw_ad", "deeplink_success", aweme.getAwemeRawAd()).mo28902c();
            return;
        }
        C38189j.m77525e(context, aweme);
        C18129a.m33746a("draw_ad", "deeplink_failed", aweme.getAwemeRawAd()).mo28902c();
    }
}
