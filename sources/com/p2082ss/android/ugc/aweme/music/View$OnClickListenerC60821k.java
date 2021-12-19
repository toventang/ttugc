package com.p2082ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.k */
public final /* synthetic */ class View$OnClickListenerC60821k implements View.OnClickListener {

    /* renamed from: a */
    private final C60818j f138230a;

    static {
        Covode.recordClassIndex(71378);
    }

    View$OnClickListenerC60821k(C60818j jVar) {
        this.f138230a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f138230a.mo98226a(view);
    }
}
