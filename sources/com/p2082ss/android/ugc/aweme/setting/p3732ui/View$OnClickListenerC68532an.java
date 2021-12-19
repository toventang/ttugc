package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79677c;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79678d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.an */
public final /* synthetic */ class View$OnClickListenerC68532an implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153352a;

    static {
        Covode.recordClassIndex(80785);
    }

    View$OnClickListenerC68532an(AbstractActivityC68607v vVar) {
        this.f153352a = vVar;
    }

    public final void onClick(View view) {
        C79677c a;
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153352a;
        if (!C58001a.m104815a(view, 1200) && (a = C79678d.m138492a()) != null) {
            SmartRouter.buildRoute(vVar, "//webview").withParam(Uri.parse(a.f178787b)).open();
        }
    }
}
