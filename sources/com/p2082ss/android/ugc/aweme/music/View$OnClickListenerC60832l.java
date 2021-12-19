package com.p2082ss.android.ugc.aweme.music;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.l */
public final /* synthetic */ class View$OnClickListenerC60832l implements View.OnClickListener {

    /* renamed from: a */
    private final C60818j f138245a;

    static {
        Covode.recordClassIndex(71389);
    }

    View$OnClickListenerC60832l(C60818j jVar) {
        this.f138245a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f138245a.mo98226a(view);
    }
}
