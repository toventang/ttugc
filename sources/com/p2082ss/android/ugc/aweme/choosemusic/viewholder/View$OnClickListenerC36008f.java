package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.f */
public final /* synthetic */ class View$OnClickListenerC36008f implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC35998a f85038a;

    static {
        Covode.recordClassIndex(43254);
    }

    View$OnClickListenerC36008f(AbstractC35998a aVar) {
        this.f85038a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f85038a.mo63152a(view);
    }
}
