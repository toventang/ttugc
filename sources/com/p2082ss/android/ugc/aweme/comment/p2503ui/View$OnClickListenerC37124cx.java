package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cx */
final /* synthetic */ class View$OnClickListenerC37124cx implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87484a;

    static {
        Covode.recordClassIndex(44478);
    }

    View$OnClickListenerC37124cx(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87484a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87484a.mo64619l();
    }
}
