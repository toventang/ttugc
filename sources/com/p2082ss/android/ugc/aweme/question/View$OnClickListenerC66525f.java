package com.p2082ss.android.ugc.aweme.question;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.question.f */
final /* synthetic */ class View$OnClickListenerC66525f implements View.OnClickListener {

    /* renamed from: a */
    private final C66519e f149584a;

    static {
        Covode.recordClassIndex(78068);
    }

    View$OnClickListenerC66525f(C66519e eVar) {
        this.f149584a = eVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f149584a.mo62677j();
    }
}
