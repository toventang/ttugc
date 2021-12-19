package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.n */
final /* synthetic */ class View$OnClickListenerC35648n implements View.OnClickListener {

    /* renamed from: a */
    private final ImageView f84079a;

    static {
        Covode.recordClassIndex(42872);
    }

    View$OnClickListenerC35648n(ImageView imageView) {
        this.f84079a = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f84079a.performClick();
    }
}
