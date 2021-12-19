package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.b */
final /* synthetic */ class View$OnClickListenerC57628b implements View.OnClickListener {

    /* renamed from: a */
    private final HomeBottomTabView f131538a;

    static {
        Covode.recordClassIndex(67589);
    }

    View$OnClickListenerC57628b(HomeBottomTabView homeBottomTabView) {
        this.f131538a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f131538a.setCurrentTab("discovery");
    }
}
