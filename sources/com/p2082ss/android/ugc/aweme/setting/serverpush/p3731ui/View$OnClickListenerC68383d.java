package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.d */
final /* synthetic */ class View$OnClickListenerC68383d implements View.OnClickListener {

    /* renamed from: a */
    private final C68378a f153067a;

    static {
        Covode.recordClassIndex(80612);
    }

    View$OnClickListenerC68383d(C68378a aVar) {
        this.f153067a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C68378a aVar = this.f153067a;
        if (C68378a.m120661a(aVar.getContext())) {
            SmartRouter.buildRoute(aVar.getContext(), "aweme://push_setting_notification_choice").withParam("enter_from", "settings_page").open();
            C39162r.m79460a("enter_push_setting_detail", new C33744d().mo59983a("label", "live_push").f79943a);
        }
    }
}
