package com.p2082ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.silent.n */
public final /* synthetic */ class View$OnClickListenerC69466n implements View.OnClickListener {

    /* renamed from: a */
    private final C69461j f155183a;

    static {
        Covode.recordClassIndex(81804);
    }

    View$OnClickListenerC69466n(C69461j jVar) {
        this.f155183a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f155183a.mo109716f();
    }
}
