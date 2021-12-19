package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37843a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38620ad;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.p */
public final class C37683p implements AbstractC33214c {
    static {
        Covode.recordClassIndex(45116);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: b */
    public final boolean mo59148b(Aweme aweme) {
        return C37699a.m76237aI(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: c */
    public final boolean mo59149c(Aweme aweme) {
        return C37699a.m76200C(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: d */
    public final boolean mo59150d(Aweme aweme) {
        return C37699a.m76266al(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: e */
    public final boolean mo59151e(Aweme aweme) {
        return C37699a.m76267am(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: a */
    public final boolean mo59146a(Aweme aweme) {
        return C37699a.m76236aH(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: a */
    public final boolean mo59147a(AwemeRawAd awemeRawAd) {
        return C37699a.m76293e(awemeRawAd);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: a */
    public final String mo59143a(Context context, Aweme aweme) {
        return C38620ad.m78372a(context, aweme, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: a */
    public final AbstractC35142e mo59142a(BulletContainerView bulletContainerView, String str, AbstractC34952a aVar) {
        C89219l.m154721d(bulletContainerView, "");
        return new C37843a(bulletContainerView, str, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: a */
    public final void mo59144a(Bundle bundle, Aweme aweme, Context context) {
        String str = "";
        C89219l.m154721d(bundle, str);
        C89219l.m154721d(context, str);
        C38739d.m78570a(bundle, aweme, context);
        C38739d.m78573b(bundle, aweme, context);
        if (!(context == null || aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd.getNonNativeClick() == 0 && C63866a.f144791a.getAdLynxLandPageUtil().mo95568a(awemeRawAd)) {
                bundle.putLong("bundle_real_ad_id", awemeRawAd.getAdId().longValue());
                bundle.putString("bundle_render_type", awemeRawAd.getNativeSiteConfig().getRenderType());
                bundle.putString("bundle_lynx_scheme", awemeRawAd.getNativeSiteConfig().getLynxScheme());
                bundle.putInt("bundle_lynx_landing_style", awemeRawAd.getNativeSiteConfig().getLynxLandingStyle());
                if (!(aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null || C13603b.m24435a((Collection) aweme.getVideo().getOriginCover().getUrlList()))) {
                    bundle.putString("bundle_full_screen_bg_image", aweme.getVideo().getOriginCover().getUrlList().get(0));
                }
                List<String> geckoChannel = awemeRawAd.getNativeSiteConfig().getGeckoChannel();
                if (!C13603b.m24435a((Collection) geckoChannel)) {
                    str = geckoChannel.get(0);
                }
                bundle.putString("lynx_channel_name", str);
                bundle.putString("bundle_native_site_custom_data", awemeRawAd.getNativeSiteCustomData());
                if (awemeRawAd.getNativeSiteConfig().getSecondPageGeckoChannel() != null) {
                    bundle.putStringArrayList("bundle_second_page_gecko_channels", (ArrayList) awemeRawAd.getNativeSiteConfig().getSecondPageGeckoChannel());
                }
                bundle.putString("bundle_native_site_ad_info", awemeRawAd.getNativeSiteAdInfo());
                bundle.putString("bundle_native_site_app_data", awemeRawAd.getAppData());
            }
        }
        C38739d.m78575c(bundle, aweme, context);
        C38739d.m78569a(bundle, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c
    /* renamed from: a */
    public final boolean mo59145a(Context context, Aweme aweme, int i, AbstractC38029b bVar) {
        C89219l.m154721d(bVar, "");
        return C38767w.m78666a(context, aweme, i, bVar);
    }
}
