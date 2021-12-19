package com.p2082ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.silent.p */
public final /* synthetic */ class View$OnClickListenerC69468p implements View.OnClickListener {

    /* renamed from: a */
    private final C69461j f155185a;

    static {
        Covode.recordClassIndex(81806);
    }

    View$OnClickListenerC69468p(C69461j jVar) {
        this.f155185a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f155185a.mo109713b();
    }
}
