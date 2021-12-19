package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.m */
public final /* synthetic */ class View$OnClickListenerC37921m implements View.OnClickListener {

    /* renamed from: a */
    private final C37899g f89562a;

    static {
        Covode.recordClassIndex(45373);
    }

    View$OnClickListenerC37921m(C37899g gVar) {
        this.f89562a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f89562a.mo66012a(view);
    }
}
