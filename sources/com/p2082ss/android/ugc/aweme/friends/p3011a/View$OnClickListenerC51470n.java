package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.a.n */
public final /* synthetic */ class View$OnClickListenerC51470n implements View.OnClickListener {

    /* renamed from: a */
    private final C51465k f118654a;

    static {
        Covode.recordClassIndex(60729);
    }

    View$OnClickListenerC51470n(C51465k kVar) {
        this.f118654a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f118654a.mo86947a("click_name");
    }
}
