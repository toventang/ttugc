package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bi */
public final /* synthetic */ class View$OnClickListenerC68557bi implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153409a;

    static {
        Covode.recordClassIndex(80810);
    }

    View$OnClickListenerC68557bi(AbstractActivityC68607v vVar) {
        this.f153409a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153409a.mo109100a(view);
    }
}
