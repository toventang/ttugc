package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.af */
public final /* synthetic */ class View$OnClickListenerC68524af implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153344a;

    static {
        Covode.recordClassIndex(80777);
    }

    View$OnClickListenerC68524af(AbstractActivityC68607v vVar) {
        this.f153344a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153344a;
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("click_background_audio", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
            SmartRouter.buildRoute(vVar, "aweme://setting/background_audio").open();
        }
    }
}
