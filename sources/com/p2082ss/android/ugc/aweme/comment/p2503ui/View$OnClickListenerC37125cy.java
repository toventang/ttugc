package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cy */
final /* synthetic */ class View$OnClickListenerC37125cy implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87485a;

    static {
        Covode.recordClassIndex(44479);
    }

    View$OnClickListenerC37125cy(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87485a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87485a;
        bzVar.f87375G.mo63471a(bzVar.f87392X);
    }
}
