package com.p2082ss.android.ugc.aweme.share.silent;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.silent.o */
public final /* synthetic */ class View$OnClickListenerC69467o implements View.OnClickListener {

    /* renamed from: a */
    private final C69461j f155184a;

    static {
        Covode.recordClassIndex(81805);
    }

    View$OnClickListenerC69467o(C69461j jVar) {
        this.f155184a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f155184a.mo109715e();
    }
}
