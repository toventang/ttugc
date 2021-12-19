package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.aa */
public final /* synthetic */ class View$OnClickListenerC70064aa implements View.OnClickListener {

    /* renamed from: a */
    private final C70582z.C70583a f156676a;

    static {
        Covode.recordClassIndex(82484);
    }

    View$OnClickListenerC70064aa(C70582z.C70583a aVar) {
        this.f156676a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f156676a.mo111348a(view);
    }
}
