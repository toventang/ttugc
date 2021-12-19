package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.y */
public final /* synthetic */ class View$OnClickListenerC37185y implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87697a;

    static {
        Covode.recordClassIndex(44539);
    }

    View$OnClickListenerC37185y(C37157k kVar) {
        this.f87697a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f87697a.mo64709c("click_gift_summary_stripe");
    }
}
