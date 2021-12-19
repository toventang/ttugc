package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ct */
final /* synthetic */ class View$OnClickListenerC37120ct implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87480a;

    static {
        Covode.recordClassIndex(44474);
    }

    View$OnClickListenerC37120ct(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87480a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87480a.mo64616i();
    }
}
