package com.p2082ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.m */
public final /* synthetic */ class View$OnClickListenerC60834m implements View.OnClickListener {

    /* renamed from: a */
    private final C60818j f138247a;

    static {
        Covode.recordClassIndex(71391);
    }

    View$OnClickListenerC60834m(C60818j jVar) {
        this.f138247a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f138247a.mo98226a(view);
    }
}
