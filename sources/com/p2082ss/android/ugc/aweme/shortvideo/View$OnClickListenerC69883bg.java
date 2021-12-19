package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bg */
public final /* synthetic */ class View$OnClickListenerC69883bg implements View.OnClickListener {

    /* renamed from: a */
    private final C69881bf f156156a;

    static {
        Covode.recordClassIndex(82292);
    }

    public View$OnClickListenerC69883bg(C69881bf bfVar) {
        this.f156156a = bfVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C69881bf bfVar = this.f156156a;
        bfVar.mo110220a(bfVar.f156136g.substring(bfVar.f156136g.lastIndexOf(35) + 1));
    }
}
