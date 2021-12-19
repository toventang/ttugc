package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.bb */
public final /* synthetic */ class View$OnClickListenerC64012bb implements View.OnClickListener {

    /* renamed from: a */
    private final C64004az f145171a;

    static {
        Covode.recordClassIndex(75456);
    }

    View$OnClickListenerC64012bb(C64004az azVar) {
        this.f145171a = azVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C39223a.m79589c().mo68602a(this.f145171a.getActivity(), "float_profile");
    }
}
