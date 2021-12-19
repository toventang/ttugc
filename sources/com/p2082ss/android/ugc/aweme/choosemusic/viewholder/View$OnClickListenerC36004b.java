package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.b */
public final /* synthetic */ class View$OnClickListenerC36004b implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC35998a f85034a;

    static {
        Covode.recordClassIndex(43250);
    }

    View$OnClickListenerC36004b(AbstractC35998a aVar) {
        this.f85034a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85034a.mo63152a(view);
    }
}
