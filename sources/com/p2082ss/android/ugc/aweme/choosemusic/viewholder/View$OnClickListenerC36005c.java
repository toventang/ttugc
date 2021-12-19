package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.c */
public final /* synthetic */ class View$OnClickListenerC36005c implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC35998a f85035a;

    static {
        Covode.recordClassIndex(43251);
    }

    View$OnClickListenerC36005c(AbstractC35998a aVar) {
        this.f85035a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85035a.mo63152a(view);
    }
}
