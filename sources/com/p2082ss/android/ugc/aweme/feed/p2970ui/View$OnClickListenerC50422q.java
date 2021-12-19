package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.q */
final /* synthetic */ class View$OnClickListenerC50422q implements View.OnClickListener {

    /* renamed from: a */
    private final C50403p f116419a;

    static {
        Covode.recordClassIndex(59555);
    }

    View$OnClickListenerC50422q(C50403p pVar) {
        this.f116419a = pVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C50403p pVar = this.f116419a;
        pVar.mo85576a(true, true);
        pVar.mo85575a(pVar.f116374n, false, true);
        if (pVar.f116375o != null && pVar.f116376p && C50403p.m94508v()) {
            pVar.f116375o.mo85204a("homepage_folllow_refresh");
        }
    }
}
