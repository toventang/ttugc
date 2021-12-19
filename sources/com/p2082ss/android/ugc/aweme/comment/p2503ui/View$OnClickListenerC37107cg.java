package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cg */
final /* synthetic */ class View$OnClickListenerC37107cg implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87465a;

    static {
        Covode.recordClassIndex(44461);
    }

    View$OnClickListenerC37107cg(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87465a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87465a;
        bzVar.f87430m.setVisibility(8);
        bzVar.f87431n.setImageBitmap(null);
        bzVar.mo64595a((C46534a) null);
        bzVar.mo64601a(true, true);
    }
}
