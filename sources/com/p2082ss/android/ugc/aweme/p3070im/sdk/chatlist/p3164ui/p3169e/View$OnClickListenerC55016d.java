package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.d */
public final /* synthetic */ class View$OnClickListenerC55016d implements View.OnClickListener {

    /* renamed from: a */
    private final C55012c f125939a;

    /* renamed from: b */
    private final AbstractC54866a f125940b;

    static {
        Covode.recordClassIndex(64742);
    }

    View$OnClickListenerC55016d(C55012c cVar, AbstractC54866a aVar) {
        this.f125939a = cVar;
        this.f125940b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f125939a.mo91970c(this.f125940b);
    }
}
