package com.p2082ss.android.ugc.aweme.kids.homepage.bottomview;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.bottomview.d */
final /* synthetic */ class View$OnClickListenerC57630d implements View.OnClickListener {

    /* renamed from: a */
    private final HomeBottomTabView f131540a;

    static {
        Covode.recordClassIndex(67591);
    }

    View$OnClickListenerC57630d(HomeBottomTabView homeBottomTabView) {
        this.f131540a = homeBottomTabView;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f131540a.setCurrentTab("liked");
    }
}
