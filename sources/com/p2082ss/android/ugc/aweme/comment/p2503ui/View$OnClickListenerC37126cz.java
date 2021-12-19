package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cz */
final /* synthetic */ class View$OnClickListenerC37126cz implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87486a;

    static {
        Covode.recordClassIndex(44480);
    }

    View$OnClickListenerC37126cz(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87486a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87486a.mo64618k();
    }
}
