package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cn */
final /* synthetic */ class View$OnClickListenerC37114cn implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87474a;

    static {
        Covode.recordClassIndex(44468);
    }

    View$OnClickListenerC37114cn(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87474a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87474a;
        bzVar.f87389U.mo63319a(bzVar.f87421d.getSelectionStart(), bzVar.f87421d.getText());
    }
}
