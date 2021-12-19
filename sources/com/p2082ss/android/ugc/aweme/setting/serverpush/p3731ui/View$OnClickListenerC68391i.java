package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.i */
final /* synthetic */ class View$OnClickListenerC68391i implements View.OnClickListener {

    /* renamed from: a */
    private final C68386g f153115a;

    static {
        Covode.recordClassIndex(80620);
    }

    View$OnClickListenerC68391i(C68386g gVar) {
        this.f153115a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C68386g gVar = this.f153115a;
        if (C68386g.m120670a(gVar.getContext())) {
            SmartRouter.buildRoute(gVar.getContext(), "aweme://push_setting_notification_choice").withParam("enter_from", "settings_page").open();
            C39162r.m79460a("enter_push_setting_detail", new C33744d().mo59983a("label", "live_push").f79943a);
        }
    }
}
