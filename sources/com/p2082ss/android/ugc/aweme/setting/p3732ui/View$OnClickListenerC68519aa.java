package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.aa */
public final /* synthetic */ class View$OnClickListenerC68519aa implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153339a;

    static {
        Covode.recordClassIndex(80772);
    }

    View$OnClickListenerC68519aa(AbstractActivityC68607v vVar) {
        this.f153339a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153339a;
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("edit_profile", new C33744d().mo59983a("enter_method", "click_setting_profile").f79943a);
            SmartRouter.buildRoute(vVar, "aweme://profile_edit").open();
        }
    }
}
