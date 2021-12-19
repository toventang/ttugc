package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.aq */
public final /* synthetic */ class View$OnClickListenerC68535aq implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153355a;

    static {
        Covode.recordClassIndex(80788);
    }

    View$OnClickListenerC68535aq(AbstractActivityC68607v vVar) {
        this.f153355a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153355a;
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("live_photo_manage", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
            SmartRouter.buildRoute(vVar, "aweme://livewallpaper").withParam("from", "setting").open();
        }
    }
}
