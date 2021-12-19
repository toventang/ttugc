package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.o */
final /* synthetic */ class View$OnClickListenerC37923o implements View.OnClickListener {

    /* renamed from: a */
    private final C37899g f89564a;

    static {
        Covode.recordClassIndex(45375);
    }

    View$OnClickListenerC37923o(C37899g gVar) {
        this.f89564a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37899g gVar = this.f89564a;
        if (!C58001a.m104815a(view, 1200) && gVar.f89514o.getAwemeRawAd().getLabel().byUid != 0) {
            SmartRouter.buildRoute(gVar.f89467ae, "aweme://user/profile/").withParam("uid", String.valueOf(gVar.f89514o.getAwemeRawAd().getLabel().byUid)).open();
        }
    }
}
