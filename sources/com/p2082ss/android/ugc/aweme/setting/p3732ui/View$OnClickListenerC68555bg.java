package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bg */
public final /* synthetic */ class View$OnClickListenerC68555bg implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractActivityC68607v f153407a;

    static {
        Covode.recordClassIndex(80808);
    }

    View$OnClickListenerC68555bg(AbstractActivityC68607v vVar) {
        this.f153407a = vVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f153407a.mo109101b(view);
    }
}
