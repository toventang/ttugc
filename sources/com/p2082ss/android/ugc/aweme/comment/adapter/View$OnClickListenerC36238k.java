package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.k */
public final /* synthetic */ class View$OnClickListenerC36238k implements View.OnClickListener {

    /* renamed from: a */
    private final C36229h f85610a;

    static {
        Covode.recordClassIndex(43504);
    }

    View$OnClickListenerC36238k(C36229h hVar) {
        this.f85610a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C36229h hVar = this.f85610a;
        if (hVar.f85599x != null && hVar.f85600y != null && hVar.f85600y.getUser() != null && hVar.f85600y.getCid() != null && !hVar.mo63397a()) {
            hVar.f85599x.mo63743a(hVar.f85601z, hVar.f85600y);
        }
    }
}
