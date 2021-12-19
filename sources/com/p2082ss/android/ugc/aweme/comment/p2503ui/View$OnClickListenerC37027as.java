package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.as */
final /* synthetic */ class View$OnClickListenerC37027as implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87212a;

    static {
        Covode.recordClassIndex(44381);
    }

    View$OnClickListenerC37027as(C37157k kVar) {
        this.f87212a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37157k kVar = this.f87212a;
        if (kVar.getContext() != null) {
            new C23144b(kVar).mo37640e(R.string.h8v).mo37637b();
        }
    }
}
