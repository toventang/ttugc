package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.h */
final /* synthetic */ class View$OnClickListenerC32322h implements View.OnClickListener {

    /* renamed from: a */
    private final C32319g f77108a;

    /* renamed from: b */
    private final C31966a f77109b;

    static {
        Covode.recordClassIndex(39090);
    }

    View$OnClickListenerC32322h(C32319g gVar, C31966a aVar) {
        this.f77108a = gVar;
        this.f77109b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C32319g gVar = this.f77108a;
        C31966a aVar = this.f77109b;
        if (gVar.f77100a != null) {
            gVar.f77100a.mo58394a(aVar);
        }
    }
}
