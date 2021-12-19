package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cc */
final /* synthetic */ class View$OnClickListenerC37103cc implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87461a;

    static {
        Covode.recordClassIndex(44457);
    }

    View$OnClickListenerC37103cc(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87461a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87461a.mo64617j();
    }
}
