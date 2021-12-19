package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.x */
public final /* synthetic */ class View$OnClickListenerC68613x implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153547a;

    static {
        Covode.recordClassIndex(80869);
    }

    View$OnClickListenerC68613x(AbstractActivityC68607v vVar) {
        this.f153547a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153547a.mo109127x(view);
    }
}
