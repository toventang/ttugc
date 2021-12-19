package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ah */
final /* synthetic */ class RunnableC37852ah implements Runnable {

    /* renamed from: a */
    private final C37899g f89350a;

    static {
        Covode.recordClassIndex(45304);
    }

    RunnableC37852ah(C37899g gVar) {
        this.f89350a = gVar;
    }

    public final void run() {
        C37899g gVar = this.f89350a;
        Context context = gVar.f89467ae;
        Aweme aweme = gVar.f89514o;
        C38189j.m77510b(context, "play_6s", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) null));
        C18129a.m33746a("draw_ad", "play_6s", gVar.f89514o.getAwemeRawAd()).mo28902c();
    }
}
