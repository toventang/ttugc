package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.c */
final /* synthetic */ class View$OnClickListenerC57629c implements View.OnClickListener {

    /* renamed from: a */
    private final HomeBottomTabView f131539a;

    static {
        Covode.recordClassIndex(67590);
    }

    View$OnClickListenerC57629c(HomeBottomTabView homeBottomTabView) {
        this.f131539a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        HomeBottomTabView homeBottomTabView = this.f131539a;
        homeBottomTabView.setCurrentTab("tab_publish");
        homeBottomTabView.f131515a.mo94924a();
    }
}
