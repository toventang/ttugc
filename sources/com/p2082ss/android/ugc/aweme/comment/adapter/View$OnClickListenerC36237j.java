package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.j */
public final /* synthetic */ class View$OnClickListenerC36237j implements View.OnClickListener {

    /* renamed from: a */
    private final C36229h f85609a;

    static {
        Covode.recordClassIndex(43503);
    }

    View$OnClickListenerC36237j(C36229h hVar) {
        this.f85609a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85609a.mo63392a(view);
    }
}
