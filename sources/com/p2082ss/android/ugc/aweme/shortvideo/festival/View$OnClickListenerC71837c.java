package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.c */
final /* synthetic */ class View$OnClickListenerC71837c implements View.OnClickListener {

    /* renamed from: a */
    private final ImageView f160992a;

    static {
        Covode.recordClassIndex(84386);
    }

    View$OnClickListenerC71837c(ImageView imageView) {
        this.f160992a = imageView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f160992a.performClick();
    }
}
