package com.p2082ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.silent.k */
public final /* synthetic */ class View$OnClickListenerC69463k implements View.OnClickListener {

    /* renamed from: a */
    private final C69461j f155180a;

    static {
        Covode.recordClassIndex(81801);
    }

    View$OnClickListenerC69463k(C69461j jVar) {
        this.f155180a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f155180a.mo109714b(view);
    }
}
