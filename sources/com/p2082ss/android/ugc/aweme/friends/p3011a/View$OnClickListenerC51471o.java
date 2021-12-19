package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.a.o */
public final /* synthetic */ class View$OnClickListenerC51471o implements View.OnClickListener {

    /* renamed from: a */
    private final C51465k f118655a;

    static {
        Covode.recordClassIndex(60730);
    }

    View$OnClickListenerC51471o(C51465k kVar) {
        this.f118655a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f118655a.mo86947a("click_card");
    }
}
