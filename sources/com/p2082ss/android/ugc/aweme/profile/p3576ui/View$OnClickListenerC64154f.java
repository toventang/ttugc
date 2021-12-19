package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33842s;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.f */
public final /* synthetic */ class View$OnClickListenerC64154f implements View.OnClickListener {

    /* renamed from: a */
    private final View f145515a;

    static {
        Covode.recordClassIndex(75598);
    }

    View$OnClickListenerC64154f(View view) {
        this.f145515a = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        View view2 = this.f145515a;
        C33842s.C33843a.f80132a.mo60057a().mo59940b(true);
        view2.setVisibility(8);
    }
}
