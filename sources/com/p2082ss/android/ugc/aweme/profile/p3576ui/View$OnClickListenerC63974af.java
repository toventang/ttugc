package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.af */
public final /* synthetic */ class View$OnClickListenerC63974af implements View.OnClickListener {

    /* renamed from: a */
    private final HeaderDetailActivity f145086a;

    static {
        Covode.recordClassIndex(75418);
    }

    View$OnClickListenerC63974af(HeaderDetailActivity headerDetailActivity) {
        this.f145086a = headerDetailActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f145086a.onBackPressed();
    }
}
