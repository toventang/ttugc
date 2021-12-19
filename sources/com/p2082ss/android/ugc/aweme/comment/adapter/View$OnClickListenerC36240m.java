package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.C36535m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.m */
public final /* synthetic */ class View$OnClickListenerC36240m implements View.OnClickListener {

    /* renamed from: a */
    private final C36229h f85612a;

    static {
        Covode.recordClassIndex(43506);
    }

    View$OnClickListenerC36240m(C36229h hVar) {
        this.f85612a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C36229h hVar = this.f85612a;
        if (hVar.f85599x != null && C36535m.m74354b(hVar.f85600y)) {
            hVar.f85599x.mo63750d(hVar.f85600y);
        }
    }
}
