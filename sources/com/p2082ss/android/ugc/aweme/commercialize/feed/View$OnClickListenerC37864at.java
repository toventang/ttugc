package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.at */
public final /* synthetic */ class View$OnClickListenerC37864at implements View.OnClickListener {

    /* renamed from: a */
    private final C37899g f89364a;

    static {
        Covode.recordClassIndex(45316);
    }

    View$OnClickListenerC37864at(C37899g gVar) {
        this.f89364a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f89364a.mo66012a(view);
    }
}
