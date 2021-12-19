package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.z */
public final /* synthetic */ class View$OnClickListenerC36260z implements View.OnClickListener {

    /* renamed from: a */
    private final C36256x f85688a;

    static {
        Covode.recordClassIndex(43526);
    }

    View$OnClickListenerC36260z(C36256x xVar) {
        this.f85688a = xVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85688a.mo63434h();
    }
}
