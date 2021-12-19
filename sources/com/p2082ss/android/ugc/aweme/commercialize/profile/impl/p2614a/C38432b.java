package com.p2082ss.android.ugc.aweme.commercialize.profile.impl.p2614a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.a.b */
public final class C38432b {
    static {
        Covode.recordClassIndex(45940);
    }

    /* renamed from: a */
    public static void m77861a(AwemeRawAd awemeRawAd) {
        C38187i.C38188a aVar = new C38187i.C38188a();
        aVar.f90222a = awemeRawAd;
        m77862a("button_show", awemeRawAd, aVar.mo66507a());
    }

    /* renamed from: a */
    private static void m77862a(String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            C38585e.m78291a("homepage_ad", str, jSONObject, awemeRawAd);
        }
    }
}
