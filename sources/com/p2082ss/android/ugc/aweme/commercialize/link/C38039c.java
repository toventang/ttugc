package com.p2082ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.c */
public final class C38039c implements AbstractC38035a {
    static {
        Covode.recordClassIndex(45501);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.AbstractC38035a
    /* renamed from: a */
    public final boolean mo66303a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String str = null;
        if (aweme != null) {
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getDefaultCardInfo() == null) {
                str = C38038b.m77114a(aweme, false);
            } else {
                str = "ad_card";
            }
        }
        return TextUtils.equals("shopping_cart", str);
    }
}
