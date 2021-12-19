package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.d */
final /* synthetic */ class View$OnClickListenerC75542d implements View.OnClickListener {

    /* renamed from: a */
    private final C75536c f169787a;

    static {
        Covode.recordClassIndex(88466);
    }

    View$OnClickListenerC75542d(C75536c cVar) {
        this.f169787a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f169787a.f169778i.run();
    }
}
