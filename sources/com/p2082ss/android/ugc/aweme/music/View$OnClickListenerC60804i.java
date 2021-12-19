package com.p2082ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.music.i */
final /* synthetic */ class View$OnClickListenerC60804i implements View.OnClickListener {

    /* renamed from: a */
    private final C60797g f138185a;

    static {
        Covode.recordClassIndex(71361);
    }

    View$OnClickListenerC60804i(C60797g gVar) {
        this.f138185a = gVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f138185a.mo98204c();
    }
}
