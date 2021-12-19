package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.prop.b.q */
final /* synthetic */ class View$OnClickListenerC65298q implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147394a;

    static {
        Covode.recordClassIndex(76777);
    }

    View$OnClickListenerC65298q(C65283j jVar) {
        this.f147394a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C65283j jVar = this.f147394a;
        jVar.f96084y.scrollTo(0, -jVar.f96084y.getCurScrollY());
    }
}
