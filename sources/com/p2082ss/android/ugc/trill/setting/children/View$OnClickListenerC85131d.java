package com.p2082ss.android.ugc.trill.setting.children;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.trill.setting.children.d */
final /* synthetic */ class View$OnClickListenerC85131d implements View.OnClickListener {

    /* renamed from: a */
    private final C85129c f190482a;

    static {
        Covode.recordClassIndex(99171);
    }

    View$OnClickListenerC85131d(C85129c cVar) {
        this.f190482a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C85129c cVar = this.f190482a;
        Bundle bundle = new Bundle();
        if (cVar.f190481d != null) {
            cVar.f190481d.mo130064a(bundle);
        }
    }
}
