package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.ap */
public final /* synthetic */ class View$OnClickListenerC68534ap implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153354a;

    static {
        Covode.recordClassIndex(80787);
    }

    View$OnClickListenerC68534ap(AbstractActivityC68607v vVar) {
        this.f153354a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153354a;
        if (!C58001a.m104815a(view, 1200)) {
            SmartRouter.buildRoute(vVar, "aweme://setting/datasaver").open();
            C39162r.onEventV3("enter_data_saver");
        }
    }
}
