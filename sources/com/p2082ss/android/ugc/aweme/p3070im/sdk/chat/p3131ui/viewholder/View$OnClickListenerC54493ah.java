package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ah */
public final /* synthetic */ class View$OnClickListenerC54493ah implements View.OnClickListener {

    /* renamed from: a */
    private final C54492ag f124877a;

    /* renamed from: b */
    private final View.OnClickListener f124878b;

    static {
        Covode.recordClassIndex(64204);
    }

    View$OnClickListenerC54493ah(C54492ag agVar, View.OnClickListener onClickListener) {
        this.f124877a = agVar;
        this.f124878b = onClickListener;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f124877a.mo91589a(this.f124878b, view);
    }
}
