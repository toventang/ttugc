package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.al */
public final /* synthetic */ class View$OnClickListenerC68530al implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153350a;

    static {
        Covode.recordClassIndex(80783);
    }

    View$OnClickListenerC68530al(AbstractActivityC68607v vVar) {
        this.f153350a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153350a;
        if (!C58001a.m104815a(view, 1200)) {
            SmartRouter.buildRoute(vVar, "aweme://setting/accessibility").open();
        }
    }
}
