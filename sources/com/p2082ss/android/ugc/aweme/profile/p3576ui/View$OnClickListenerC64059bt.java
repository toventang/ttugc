package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.IDonationService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.bt */
public final /* synthetic */ class View$OnClickListenerC64059bt implements View.OnClickListener {

    /* renamed from: a */
    private final C64048bm f145293a;

    static {
        Covode.recordClassIndex(75503);
    }

    View$OnClickListenerC64059bt(C64048bm bmVar) {
        this.f145293a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f145293a.mo103621a((IDonationService.OrganizationModel) null);
    }
}
