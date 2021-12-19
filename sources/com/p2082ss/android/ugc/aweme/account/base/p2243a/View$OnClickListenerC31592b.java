package com.p2082ss.android.ugc.aweme.account.base.p2243a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.base.a.b */
final /* synthetic */ class View$OnClickListenerC31592b implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC31590a f75551a;

    static {
        Covode.recordClassIndex(38318);
    }

    View$OnClickListenerC31592b(DialogC31590a aVar) {
        this.f75551a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f75551a.hide();
    }
}
