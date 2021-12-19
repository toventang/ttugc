package com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b.a.b */
public final class C38667b {

    /* renamed from: a */
    public static final C38667b f91372a = new C38667b();

    private C38667b() {
    }

    static {
        Covode.recordClassIndex(46208);
    }

    /* renamed from: a */
    public static final boolean m78457a(Context context, String str, Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        C89219l.m154716b(awemeRawAd, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//main/commercialize/bottom_from").withParam("url", str);
        Long creativeId = awemeRawAd.getCreativeId();
        C89219l.m154716b(creativeId, "");
        SmartRoute withParam2 = withParam.withParam("ad_id", creativeId.longValue()).withParam("ad_type", awemeRawAd.getType()).withParam("ad_system_origin", awemeRawAd.getSystemOrigin());
        Long creativeId2 = awemeRawAd.getCreativeId();
        C89219l.m154716b(creativeId2, "");
        withParam2.withParam("ad_id", creativeId2.longValue()).withParam("bundle_download_app_log_extra", awemeRawAd.getLogExtra()).withParam("aweme_id", aweme.getAid()).withParam("click_from", i).open();
        return true;
    }
}
