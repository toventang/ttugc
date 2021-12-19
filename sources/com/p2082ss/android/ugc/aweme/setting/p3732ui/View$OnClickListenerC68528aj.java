package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.aj */
public final /* synthetic */ class View$OnClickListenerC68528aj implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153348a;

    static {
        Covode.recordClassIndex(80781);
    }

    View$OnClickListenerC68528aj(AbstractActivityC68607v vVar) {
        this.f153348a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153348a;
        if (!C58001a.m104815a(view, 1200)) {
            C39162r.m79460a("enter_teen_protection", new C33744d().mo59983a("enter_method", "click_button").mo59983a("enter_from", "settings_page").f79943a);
            C39223a.m79602p().mo68650a(vVar);
        }
    }
}
