package com.p2082ss.android.ugc.aweme.share.gif.p3751ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.b */
final /* synthetic */ class View$OnClickListenerC68946b implements View.OnClickListener {

    /* renamed from: a */
    private final VideoShare2GifEditActivity f154250a;

    static {
        Covode.recordClassIndex(81258);
    }

    View$OnClickListenerC68946b(VideoShare2GifEditActivity videoShare2GifEditActivity) {
        this.f154250a = videoShare2GifEditActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f154250a.resolveUiClickEvent(view);
    }
}
