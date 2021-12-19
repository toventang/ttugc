package com.p2082ss.android.ugc.aweme.p2282ad.p2290d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ad.d.a */
public final class C33178a {
    static {
        Covode.recordClassIndex(39997);
    }

    /* renamed from: a */
    public static void m67998a(String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            C38585e.m78291a("background_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    public static void m67997a(AwemeRawAd awemeRawAd, String str, String str2, Long l) {
        C18129a.m33746a("draw_ad", str, awemeRawAd).mo28900b("refer", str2).mo28897a("duration", l).mo28901b();
    }
}
