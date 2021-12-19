package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.ae */
public final /* synthetic */ class View$OnClickListenerC68523ae implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153343a;

    static {
        Covode.recordClassIndex(80776);
    }

    View$OnClickListenerC68523ae(AbstractActivityC68607v vVar) {
        this.f153343a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153343a.mo109120q(view);
    }
}
