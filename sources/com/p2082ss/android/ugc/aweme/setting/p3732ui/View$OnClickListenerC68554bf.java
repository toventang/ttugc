package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bf */
public final /* synthetic */ class View$OnClickListenerC68554bf implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153406a;

    static {
        Covode.recordClassIndex(80807);
    }

    View$OnClickListenerC68554bf(AbstractActivityC68607v vVar) {
        this.f153406a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153406a;
        if (C58001a.m104815a(view, 1200)) {
            return;
        }
        if (!AbstractActivityC68607v.m121001L()) {
            new C79459a(vVar).mo123050a(R.string.dcq).mo123053a();
        } else {
            SmartRouter.buildRoute(vVar, "//about_activity").open();
        }
    }
}
