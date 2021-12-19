package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.b */
public final /* synthetic */ class View$OnClickListenerC40110b implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC40108a f94190a;

    static {
        Covode.recordClassIndex(47893);
    }

    View$OnClickListenerC40110b(AbstractC40108a aVar) {
        this.f94190a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f94190a.getActivity().onBackPressed();
    }
}
