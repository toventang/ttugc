package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.y */
public final /* synthetic */ class View$OnClickListenerC36259y implements View.OnClickListener {

    /* renamed from: a */
    private final C36256x f85687a;

    static {
        Covode.recordClassIndex(43525);
    }

    View$OnClickListenerC36259y(C36256x xVar) {
        this.f85687a = xVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85687a.mo63431a(view);
    }
}
