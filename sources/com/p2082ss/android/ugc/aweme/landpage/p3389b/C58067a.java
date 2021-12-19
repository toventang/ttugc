package com.p2082ss.android.ugc.aweme.landpage.p3389b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.commercialize.feed.p2565c.C37892a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.landpage.AbstractC58066b;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.landpage.b.a */
public final class C58067a implements AbstractC58066b {

    /* renamed from: a */
    public static final C58067a f132302a = new C58067a();

    private C58067a() {
    }

    static {
        Covode.recordClassIndex(68109);
    }

    /* renamed from: a */
    public final boolean mo95569a(Aweme aweme) {
        if (aweme != null) {
            return mo95568a(aweme.getAwemeRawAd());
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.landpage.AbstractC58066b
    /* renamed from: a */
    public final boolean mo95568a(AwemeRawAd awemeRawAd) {
        C38220ag nativeSiteConfig;
        if (awemeRawAd == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || !TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") || TextUtils.isEmpty(nativeSiteConfig.getLynxScheme())) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.landpage.AbstractC58066b
    /* renamed from: a */
    public final String mo95567a(AwemeRawAd awemeRawAd, Context context) {
        String str;
        String str2;
        C28022o oVar = new C28022o();
        if (awemeRawAd != null) {
            C37892a preloadData = awemeRawAd.getPreloadData();
            String str3 = null;
            if (preloadData != null) {
                str = preloadData.getSiteId();
            } else {
                str = null;
            }
            oVar.mo46801a("siteId", str);
            Long adId = awemeRawAd.getAdId();
            if (adId != null) {
                str2 = String.valueOf(adId.longValue());
            } else {
                str2 = null;
            }
            oVar.mo46801a("adId", str2);
            oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
            oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str3 = String.valueOf(groupId.longValue());
            }
            oVar.mo46801a("groupId", str3);
            oVar.mo46801a("webUrl", awemeRawAd.getWebUrl());
            oVar.mo46801a("pageData", awemeRawAd.getNativeSiteAdInfo());
            oVar.mo46801a("appData", awemeRawAd.getAppData());
            oVar.mo46800a("landPageShowType", Integer.valueOf(C33391a.m68472a(awemeRawAd)));
            oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(context) ? 1 : 0));
            oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
        }
        String oVar2 = oVar.toString();
        C89219l.m154716b(oVar2, "");
        return oVar2;
    }
}
