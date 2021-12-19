package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cr */
final /* synthetic */ class View$OnClickListenerC37118cr implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87478a;

    static {
        Covode.recordClassIndex(44472);
    }

    View$OnClickListenerC37118cr(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87478a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87478a.f87394Z.mo63841b().setValue(null);
    }
}
