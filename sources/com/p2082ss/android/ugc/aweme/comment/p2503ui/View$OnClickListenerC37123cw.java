package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cw */
final /* synthetic */ class View$OnClickListenerC37123cw implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87483a;

    static {
        Covode.recordClassIndex(44477);
    }

    View$OnClickListenerC37123cw(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87483a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87483a.mo64620m();
    }
}
