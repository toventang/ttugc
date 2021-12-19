package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.ba */
public final /* synthetic */ class View$OnClickListenerC68549ba implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153401a;

    static {
        Covode.recordClassIndex(80802);
    }

    View$OnClickListenerC68549ba(AbstractActivityC68607v vVar) {
        this.f153401a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153401a.mo109103d(view);
    }
}
