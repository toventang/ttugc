package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.prop.b.p */
final /* synthetic */ class View$OnClickListenerC65297p implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147393a;

    static {
        Covode.recordClassIndex(76776);
    }

    View$OnClickListenerC65297p(C65283j jVar) {
        this.f147393a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f147393a.mo104446a("click_name");
    }
}
