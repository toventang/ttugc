package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.prop.b.m */
final /* synthetic */ class View$OnClickListenerC65294m implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147390a;

    static {
        Covode.recordClassIndex(76773);
    }

    View$OnClickListenerC65294m(C65283j jVar) {
        this.f147390a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ActivityC0945e activity = this.f147390a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
