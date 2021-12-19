package com.p2082ss.android.ugc.aweme.tools.draft;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.aa */
final /* synthetic */ class View$OnClickListenerC78125aa implements View.OnClickListener {

    /* renamed from: a */
    private final C78473z f175456a;

    static {
        Covode.recordClassIndex(91240);
    }

    View$OnClickListenerC78125aa(C78473z zVar) {
        this.f175456a = zVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f175456a.mo122397f();
    }
}
