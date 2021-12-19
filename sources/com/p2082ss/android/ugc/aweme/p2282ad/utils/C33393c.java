package com.p2082ss.android.ugc.aweme.p2282ad.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.c */
public final class C33393c {

    /* renamed from: a */
    public static final C33393c f79346a = new C33393c();

    private C33393c() {
    }

    static {
        Covode.recordClassIndex(40242);
    }

    /* renamed from: b */
    private static boolean m68478b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || splashInfo.getSplashFeedType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m68477a(Aweme aweme) {
        AwemeSplashInfo splashInfo;
        if (!m68478b(aweme) && aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null && !splashInfo.hasUpdateLiving) {
                return true;
            }
            User author = aweme.getAuthor();
            if (author == null || !author.isLive()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
