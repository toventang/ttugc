package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.common.a.j */
public final /* synthetic */ class View$OnClickListenerC39071j implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC39063h.C39069c f92267a;

    static {
        Covode.recordClassIndex(46687);
    }

    View$OnClickListenerC39071j(AbstractC39063h.C39069c cVar) {
        this.f92267a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC39063h.C39069c cVar = this.f92267a;
        if (AbstractC39063h.this.f92246r != null) {
            AbstractC39063h.this.f92246r.mo62679l();
        }
        if (cVar.f92261a != null) {
            cVar.f92261a.f92268a = false;
        }
    }
}
