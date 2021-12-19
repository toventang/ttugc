package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.prop.b.n */
final /* synthetic */ class View$OnClickListenerC65295n implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147391a;

    static {
        Covode.recordClassIndex(76774);
    }

    View$OnClickListenerC65295n(C65283j jVar) {
        this.f147391a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C65283j jVar = this.f147391a;
        jVar.f147346ao = true;
        jVar.mo104449b();
        jVar.f147296R.mo98607b();
    }
}
