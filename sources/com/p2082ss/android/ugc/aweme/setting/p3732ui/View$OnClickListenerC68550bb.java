package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bb */
public final /* synthetic */ class View$OnClickListenerC68550bb implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153402a;

    static {
        Covode.recordClassIndex(80803);
    }

    View$OnClickListenerC68550bb(AbstractActivityC68607v vVar) {
        this.f153402a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153402a.mo109102c(view);
    }
}
