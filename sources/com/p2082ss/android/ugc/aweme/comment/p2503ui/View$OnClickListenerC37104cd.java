package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cd */
final /* synthetic */ class View$OnClickListenerC37104cd implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87462a;

    static {
        Covode.recordClassIndex(44458);
    }

    View$OnClickListenerC37104cd(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87462a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87462a.mo64611d();
    }
}
