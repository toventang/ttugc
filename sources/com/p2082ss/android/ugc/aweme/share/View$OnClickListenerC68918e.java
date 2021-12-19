package com.p2082ss.android.ugc.aweme.share;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.e */
public final /* synthetic */ class View$OnClickListenerC68918e implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC68904d f154176a;

    static {
        Covode.recordClassIndex(81224);
    }

    View$OnClickListenerC68918e(AbstractC68904d dVar) {
        this.f154176a = dVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f154176a.mo109463g();
    }
}
