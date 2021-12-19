package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38227am;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.aj */
final /* synthetic */ class RunnableC37854aj implements Runnable {

    /* renamed from: a */
    private final C37899g f89352a;

    /* renamed from: b */
    private final C38227am f89353b;

    static {
        Covode.recordClassIndex(45306);
    }

    RunnableC37854aj(C37899g gVar, C38227am amVar) {
        this.f89352a = gVar;
        this.f89353b = amVar;
    }

    public final void run() {
        C37899g gVar = this.f89352a;
        C38227am amVar = this.f89353b;
        AwemeRawAd awemeRawAd = gVar.f89514o.getAwemeRawAd();
        if (awemeRawAd != null) {
            C38164aj.m77371a("cpv_" + amVar.f90315a + "s", amVar.f90316b, awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), null, new C37858an(gVar));
        }
    }
}
