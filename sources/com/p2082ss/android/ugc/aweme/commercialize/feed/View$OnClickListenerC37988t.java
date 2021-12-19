package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.t */
public final /* synthetic */ class View$OnClickListenerC37988t implements View.OnClickListener {

    /* renamed from: a */
    private final C37899g f89773a;

    static {
        Covode.recordClassIndex(45448);
    }

    View$OnClickListenerC37988t(C37899g gVar) {
        this.f89773a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f89773a.mo66012a(view);
    }
}
