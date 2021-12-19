package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.am */
public final /* synthetic */ class View$OnClickListenerC68531am implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153351a;

    static {
        Covode.recordClassIndex(80784);
    }

    View$OnClickListenerC68531am(AbstractActivityC68607v vVar) {
        this.f153351a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153351a;
        if (!C58001a.m104815a(view, 1200)) {
            SmartRouter.buildRoute(vVar, "aweme://setting/powermode").open();
        }
    }
}
