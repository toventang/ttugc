package com.p2082ss.android.ugc.aweme.deeplink;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.deeplink.x */
final /* synthetic */ class View$OnClickListenerC41070x implements View.OnClickListener {

    /* renamed from: a */
    private final UpdateTipActivity f96004a;

    static {
        Covode.recordClassIndex(48940);
    }

    View$OnClickListenerC41070x(UpdateTipActivity updateTipActivity) {
        this.f96004a = updateTipActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f96004a.mo70194a();
    }
}
