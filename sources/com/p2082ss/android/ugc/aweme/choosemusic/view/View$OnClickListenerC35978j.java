package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.j */
public final /* synthetic */ class View$OnClickListenerC35978j implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC35966c f84948a;

    static {
        Covode.recordClassIndex(43224);
    }

    View$OnClickListenerC35978j(AbstractC35966c cVar) {
        this.f84948a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC35966c cVar = this.f84948a;
        cVar.f84916j.setText("");
        cVar.f84916j.requestFocus();
        cVar.f84916j.post(new RunnableC35976h(cVar));
    }
}
