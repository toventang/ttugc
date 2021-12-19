package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ag */
final /* synthetic */ class RunnableC37851ag implements Runnable {

    /* renamed from: a */
    private final C37899g f89349a;

    static {
        Covode.recordClassIndex(45303);
    }

    RunnableC37851ag(C37899g gVar) {
        this.f89349a = gVar;
    }

    public final void run() {
        C37899g gVar = this.f89349a;
        C18129a.C18130a a = C18129a.m33746a("draw_ad", "play_2s", gVar.f89514o.getAwemeRawAd());
        if (gVar.f89514o.getAwemeRawAd() != null && gVar.f89514o.getAwemeRawAd().isReshowAd()) {
            a.mo28897a("is_reshow", 1);
        }
        a.mo28901b();
    }
}
