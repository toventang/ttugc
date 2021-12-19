package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ab */
final /* synthetic */ class View$OnClickListenerC78126ab implements View.OnClickListener {

    /* renamed from: a */
    private final C78473z f175457a;

    static {
        Covode.recordClassIndex(91241);
    }

    View$OnClickListenerC78126ab(C78473z zVar) {
        this.f175457a = zVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f175457a.mo122397f();
    }
}
