package com.p2082ss.android.ugc.trill.setting.children;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.trill.setting.children.e */
final /* synthetic */ class View$OnClickListenerC85132e implements View.OnClickListener {

    /* renamed from: a */
    private final C85129c f190483a;

    static {
        Covode.recordClassIndex(99172);
    }

    View$OnClickListenerC85132e(C85129c cVar) {
        this.f190483a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f190483a.getActivity().finish();
    }
}
