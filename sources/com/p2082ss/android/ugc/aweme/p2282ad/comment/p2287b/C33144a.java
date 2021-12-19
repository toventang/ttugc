package com.p2082ss.android.ugc.aweme.p2282ad.comment.p2287b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.b.a */
public final class C33144a {
    static {
        Covode.recordClassIndex(39962);
    }

    /* renamed from: a */
    public static void m67924a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            C38187i.C38188a aVar = new C38187i.C38188a();
            aVar.f90222a = awemeRawAd;
            aVar.f90224c = false;
            C38585e.m78291a("comment_first_ad", "click_message", aVar.mo66507a(), awemeRawAd);
        }
    }

    /* renamed from: b */
    public static void m67926b(AwemeRawAd awemeRawAd) {
        C38187i.C38188a aVar = new C38187i.C38188a();
        aVar.f90222a = awemeRawAd;
        m67925a("click_title", awemeRawAd, aVar.mo66507a());
    }

    /* renamed from: a */
    public static void m67925a(String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            C38585e.m78291a("comment_first_ad", str, jSONObject, awemeRawAd);
        }
    }
}
