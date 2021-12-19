package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60736n;

/* renamed from: com.ss.android.ugc.aweme.music.b.o */
final /* synthetic */ class View$OnClickListenerC60740o implements View.OnClickListener {

    /* renamed from: a */
    private final C60736n.C60738b f138031a;

    static {
        Covode.recordClassIndex(71296);
    }

    View$OnClickListenerC60740o(C60736n.C60738b bVar) {
        this.f138031a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C60736n.C60738b bVar = this.f138031a;
        if (C60736n.this.f138023a != null) {
            C60736n.this.f138023a.mo98158a(bVar.getLayoutPosition());
        }
    }
}
