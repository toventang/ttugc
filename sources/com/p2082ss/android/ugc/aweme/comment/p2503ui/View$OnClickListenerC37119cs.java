package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cs */
final /* synthetic */ class View$OnClickListenerC37119cs implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87479a;

    static {
        Covode.recordClassIndex(44473);
    }

    View$OnClickListenerC37119cs(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87479a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87479a.f87394Z.mo63841b().setValue(null);
    }
}
