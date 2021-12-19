package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.e */
final /* synthetic */ class View$OnClickListenerC35604e implements View.OnClickListener {

    /* renamed from: a */
    private final ImageView f83972a;

    static {
        Covode.recordClassIndex(42828);
    }

    View$OnClickListenerC35604e(ImageView imageView) {
        this.f83972a = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f83972a.performClick();
    }
}
