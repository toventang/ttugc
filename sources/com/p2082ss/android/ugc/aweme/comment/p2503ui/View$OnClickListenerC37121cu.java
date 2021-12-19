package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.cu */
final /* synthetic */ class View$OnClickListenerC37121cu implements View.OnClickListener {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87481a;

    static {
        Covode.recordClassIndex(44475);
    }

    View$OnClickListenerC37121cu(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87481a = bzVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        new C79459a(this.f87481a.getContext()).mo123052a("Gifting is unavailable to reply").mo123053a();
    }
}
