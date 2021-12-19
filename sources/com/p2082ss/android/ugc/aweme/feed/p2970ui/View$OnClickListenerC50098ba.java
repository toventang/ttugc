package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ba */
final /* synthetic */ class View$OnClickListenerC50098ba implements View.OnClickListener {

    /* renamed from: a */
    private final LongPressLayout f115641a;

    static {
        Covode.recordClassIndex(59224);
    }

    View$OnClickListenerC50098ba(LongPressLayout longPressLayout) {
        this.f115641a = longPressLayout;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        LongPressLayout longPressLayout = this.f115641a;
        if (longPressLayout.f115389g != null) {
            longPressLayout.f115389g.onClick(view);
        }
        if (!longPressLayout.f115391i) {
            longPressLayout.f115390h.onClick(view);
        }
        longPressLayout.f115391i = false;
    }
}
