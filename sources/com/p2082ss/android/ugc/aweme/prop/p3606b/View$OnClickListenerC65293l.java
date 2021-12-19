package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.prop.b.l */
final /* synthetic */ class View$OnClickListenerC65293l implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147389a;

    static {
        Covode.recordClassIndex(76772);
    }

    View$OnClickListenerC65293l(C65283j jVar) {
        this.f147389a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C65283j jVar = this.f147389a;
        if (jVar.f147347ap != null) {
            jVar.f147346ao = false;
            jVar.mo104449b();
            jVar.f147302X.mo98607b();
        }
    }
}
