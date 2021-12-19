package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.o */
public final /* synthetic */ class View$OnClickListenerC35806o implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC35797j f84536a;

    static {
        Covode.recordClassIndex(43045);
    }

    View$OnClickListenerC35806o(AbstractC35797j jVar) {
        this.f84536a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC35797j jVar = this.f84536a;
        if (!jVar.f84515e && jVar.f84529w != null) {
            jVar.f84529w.onClick(view);
        }
    }
}
