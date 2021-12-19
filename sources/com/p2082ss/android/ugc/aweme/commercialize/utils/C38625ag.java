package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ag */
public final class C38625ag {
    static {
        Covode.recordClassIndex(46166);
    }

    /* renamed from: a */
    public static void m78385a(Context context, Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String openUrl = aweme.getAwemeRawAd().getOpenUrl();
            String type = awemeRawAd.getType();
            if (!TextUtils.isEmpty(type)) {
                type.hashCode();
                char c = 65535;
                switch (type.hashCode()) {
                    case -1354573786:
                        if (type.equals("coupon")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 117588:
                        if (type.equals("web")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3083120:
                        if (type.equals("dial")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3148996:
                        if (type.equals("form")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 957829685:
                        if (type.equals("counsel")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1893962841:
                        if (type.equals("redpacket")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        C38189j.m77523d(context, aweme, "button");
                        C38189j.m77524d(context, "click_coupon", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
                        C18129a.m33746a("homepage_ad", "click_coupon", awemeRawAd).mo28902c();
                        break;
                    case 1:
                    case 4:
                        if (!C38024a.m77085a(openUrl)) {
                            C38189j.m77523d(context, aweme, "button");
                            C38189j.m77543r(context, aweme);
                            C18129a.m33746a("homepage_ad", "click_button", awemeRawAd).mo28902c();
                            break;
                        } else {
                            C38189j.m77492a(context, "homepage_ad", "click_message", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
                            C18129a.m33746a("homepage_ad", "click_message", awemeRawAd).mo28902c();
                            break;
                        }
                    case 2:
                        C38189j.m77544s(context, aweme);
                        C18129a.m33746a("homepage_ad", "click_call", aweme.getAwemeRawAd()).mo28902c();
                        C38189j.m77523d(context, aweme, "button");
                        break;
                    case 3:
                        C38189j.m77545t(context, aweme);
                        C18129a.m33746a("homepage_ad", "click_form", aweme.getAwemeRawAd()).mo28902c();
                        C38189j.m77523d(context, aweme, "button");
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        C38189j.m77523d(context, aweme, "button");
                        C38189j.m77547v(context, aweme);
                        C18129a.m33746a("homepage_ad", "click_redpacket", awemeRawAd).mo28902c();
                        break;
                }
                C38767w.m78666a(context, aweme, 8, (AbstractC38029b) null);
            }
        }
    }
}
