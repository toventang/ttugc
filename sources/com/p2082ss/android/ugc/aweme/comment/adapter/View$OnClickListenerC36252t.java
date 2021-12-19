package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.t */
public final /* synthetic */ class View$OnClickListenerC36252t implements View.OnClickListener {

    /* renamed from: a */
    private final C36247s f85667a;

    static {
        Covode.recordClassIndex(43518);
    }

    View$OnClickListenerC36252t(C36247s sVar) {
        this.f85667a = sVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85667a.mo63426f();
    }
}
