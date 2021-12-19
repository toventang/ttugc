package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.av */
public final class C38655av {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.av$a */
    public interface AbstractC38656a {
        static {
            Covode.recordClassIndex(46197);
        }

        /* renamed from: a */
        void mo67224a(boolean z);
    }

    static {
        Covode.recordClassIndex(46196);
    }

    /* renamed from: a */
    public static void m78418a() {
        AwemeRawAd awemeRawAd = C38659ay.f91340a;
        if (awemeRawAd != null) {
            m78419a(C17867d.m33078a(), "landing_open_url_app", awemeRawAd);
        }
    }

    /* renamed from: b */
    public static void m78421b() {
        AwemeRawAd awemeRawAd = C38659ay.f91340a;
        if (awemeRawAd != null) {
            m78420a(new C38657aw(awemeRawAd));
        }
    }

    /* renamed from: a */
    private static void m78420a(AbstractC38656a aVar) {
        C1731i.m5631a(5000).mo5532a(new C38658ax(aVar));
    }

    /* renamed from: a */
    static void m78419a(Context context, String str, AwemeRawAd awemeRawAd) {
        if (context != null && awemeRawAd != null) {
            C38187i.C38188a aVar = new C38187i.C38188a();
            aVar.f90222a = awemeRawAd;
            aVar.f90224c = false;
            C38585e.m78291a("landing_ad", str, aVar.mo66507a(), awemeRawAd);
            C18129a.m33746a("landing_ad", str, awemeRawAd).mo28902c();
        }
    }
}
