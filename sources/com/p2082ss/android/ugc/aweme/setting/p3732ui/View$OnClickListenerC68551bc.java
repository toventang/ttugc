package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.setting.p3719g.C68081a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68345c;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bc */
public final /* synthetic */ class View$OnClickListenerC68551bc implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153403a;

    static {
        Covode.recordClassIndex(80804);
    }

    View$OnClickListenerC68551bc(AbstractActivityC68607v vVar) {
        this.f153403a = vVar;
    }

    public final void onClick(View view) {
        C68345c cVar;
        ClickAgent.onClick(view);
        AbstractActivityC68607v vVar = this.f153403a;
        if (!C58001a.m104815a(view, 1200) && (cVar = C68081a.f152476a) != null && !TextUtils.isEmpty(cVar.f152934b)) {
            SmartRouter.buildRoute(vVar, "aweme://webview").withParam(Uri.parse(cVar.f152934b)).withParam("title", vVar.getString(R.string.cp8)).open();
        }
    }
}
