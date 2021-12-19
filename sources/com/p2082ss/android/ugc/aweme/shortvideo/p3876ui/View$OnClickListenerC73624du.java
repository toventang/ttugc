package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73970aw;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.du */
final /* synthetic */ class View$OnClickListenerC73624du implements View.OnClickListener {

    /* renamed from: a */
    static final View.OnClickListener f165445a = new View$OnClickListenerC73624du();

    static {
        Covode.recordClassIndex(86362);
    }

    private View$OnClickListenerC73624du() {
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73970aw.m130098a(view.getContext(), "toast");
    }
}
