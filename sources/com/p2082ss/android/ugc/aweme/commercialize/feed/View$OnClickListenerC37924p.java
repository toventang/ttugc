package com.p2082ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.p */
final /* synthetic */ class View$OnClickListenerC37924p implements View.OnClickListener {

    /* renamed from: a */
    private final C37899g f89565a;

    static {
        Covode.recordClassIndex(45376);
    }

    View$OnClickListenerC37924p(C37899g gVar) {
        this.f89565a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37899g gVar = this.f89565a;
        if (!gVar.mo65975h()) {
            C38767w.m78666a(gVar.f89467ae, gVar.f89514o, 1, gVar.f89478ap);
        }
    }
}
